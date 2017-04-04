package com.se7so.grpc;

import com.se7so.dict.PasswordDictReader;
import com.se7so.model.FindPasswordsQuery;
import com.se7so.model.FindPasswordsResponse;
import com.se7so.service.PasswordsServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerInterceptors;
import io.grpc.ServerServiceDefinition;
import io.grpc.stub.StreamObserver;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

@RequiredArgsConstructor(onConstructor =  @__(@Autowired))
@Log4j2
public class PasswordsService extends PasswordsServiceGrpc.PasswordsServiceImplBase implements GrpcService {

    @Getter
    @Value("${password.service.grpc.port}")
    private int port;
    @Value("${password.service.max.results}")
    private int maxResults;

    @Setter
    @Getter
    private Server server;
    private final GrpcServerInterceptor interceptor;
    private final PasswordDictReader reader;

    @Override
    public void findPasswords(FindPasswordsQuery request, StreamObserver<FindPasswordsResponse> responseObserver) {
        String prefix = request.getQuery();

        List<String> results = reader.getDict().findPrefixes(prefix);
        int totalMatches = results.size();

        if(totalMatches > maxResults) {
            results = results.subList(0, maxResults);
        }

        responseObserver.onNext(FindPasswordsResponse.newBuilder()
                .addAllMatches(results)
                .setNumOfMatches(totalMatches)
                .build());

        responseObserver.onCompleted();
    }

    @Override
    public ServerServiceDefinition getServiceDefinition() {
        return ServerInterceptors.intercept(bindService(), interceptor);
    }
}
