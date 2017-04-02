package com.se7so.client;

import com.se7so.model.UserDto;
import com.se7so.model.UsersQuery;
import com.se7so.model.UsersResponse;
import io.grpc.ManagedChannel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class UsersServiceClient {
    @Value("${grpc.timeout}")
    private long grpcTimeout;

    private final Supplier<ManagedChannel> managedChannelSupplier;
    private final GrpcClientInterceptor interceptor;

    public List<UserDto> getAllUsers() {
        ManagedChannel managedChannel = managedChannelSupplier.get();
        UsersQuery query = UsersQuery.newBuilder().setUsers("se7soooooo").build();

        UsersResponse response = UsersServiceGrpc
                .newBlockingStub(managedChannel)
                .withDeadlineAfter(grpcTimeout, TimeUnit.MILLISECONDS)
                .withInterceptors(interceptor)
                .getUsers(query);

        if(!CollectionUtils.isEmpty(response.getUsersList())) {
            return response.getUsersList().stream()
                    .map(user -> UserDto.builder()
                                        .username(user.getUsername())
                                        .password(user.getPassword())
                                        .build()
                            ).collect(Collectors.toList());
        }

        return Collections.emptyList();
    }
}
