package com.se7so.client;

import com.google.protobuf.Empty;
import com.se7so.model.*;
import com.se7so.service.PasswordsServiceGrpc;
import com.se7so.service.PasswordsServiceHealthServiceGrpc;
import io.grpc.ManagedChannel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.CollectionUtils;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

@RequiredArgsConstructor
public class PasswordsServiceClient {
    @Value("${grpc.timeout}")
    private long grpcTimeout;

    private final Supplier<ManagedChannel> passwordsServiceManagedChannelSupplier;
    private final Supplier<ManagedChannel> healthServiceManagedChannelSupplier;
    private final GrpcClientInterceptor interceptor;

    public PasswordsResponseDto findPasswordMatches(String param) {
        ManagedChannel managedChannel = passwordsServiceManagedChannelSupplier.get();
        FindPasswordsQuery query = FindPasswordsQuery.newBuilder()
                .setQuery(param).build();

        FindPasswordsResponse response = PasswordsServiceGrpc
                .newBlockingStub(managedChannel)
                .withDeadlineAfter(grpcTimeout, TimeUnit.MILLISECONDS)
                .withInterceptors(interceptor)
                .findPasswords(query);

        PasswordsResponseDto.PasswordsResponseDtoBuilder responseDtoBuilder = PasswordsResponseDto.builder()
                .totalMatches(response.getNumOfMatches());

        if(!CollectionUtils.isEmpty(response.getMatchesList())) {
            responseDtoBuilder.matches(response.getMatchesList());
        }

        return responseDtoBuilder.build();
    }

    public PassServiceHealthDto getHealthStatus() {
        ManagedChannel managedChannel = healthServiceManagedChannelSupplier.get();

        PasswordsServiceHealthStatus status = PasswordsServiceHealthServiceGrpc
                .newBlockingStub(managedChannel)
                .withDeadlineAfter(grpcTimeout, TimeUnit.MILLISECONDS)
                .withInterceptors(interceptor)
                .getPasswordsServiceHealthStatus(Empty.getDefaultInstance());

        return PassServiceHealthDto.builder()
                .status(status.getStatus())
                .dictSize(status.getTotalPasswordsLoaded())
                .build();
    }
}
