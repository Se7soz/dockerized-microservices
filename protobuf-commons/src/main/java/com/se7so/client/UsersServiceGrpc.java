package com.se7so.client;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: services.proto")
public final class UsersServiceGrpc {

  private UsersServiceGrpc() {}

  public static final String SERVICE_NAME = "com.se7so.service.UsersService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.se7so.model.UsersQuery,
      com.se7so.model.UsersResponse> METHOD_GET_USERS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.se7so.service.UsersService", "getUsers"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.se7so.model.UsersQuery.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.se7so.model.UsersResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UsersServiceStub newStub(io.grpc.Channel channel) {
    return new UsersServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UsersServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UsersServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static UsersServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UsersServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UsersServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUsers(com.se7so.model.UsersQuery request,
        io.grpc.stub.StreamObserver<com.se7so.model.UsersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_USERS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_USERS,
            asyncUnaryCall(
              new MethodHandlers<
                com.se7so.model.UsersQuery,
                com.se7so.model.UsersResponse>(
                  this, METHODID_GET_USERS)))
          .build();
    }
  }

  /**
   */
  public static final class UsersServiceStub extends io.grpc.stub.AbstractStub<UsersServiceStub> {
    private UsersServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UsersServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UsersServiceStub(channel, callOptions);
    }

    /**
     */
    public void getUsers(com.se7so.model.UsersQuery request,
        io.grpc.stub.StreamObserver<com.se7so.model.UsersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USERS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UsersServiceBlockingStub extends io.grpc.stub.AbstractStub<UsersServiceBlockingStub> {
    private UsersServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UsersServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UsersServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.se7so.model.UsersResponse getUsers(com.se7so.model.UsersQuery request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USERS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UsersServiceFutureStub extends io.grpc.stub.AbstractStub<UsersServiceFutureStub> {
    private UsersServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UsersServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UsersServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.se7so.model.UsersResponse> getUsers(
        com.se7so.model.UsersQuery request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USERS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USERS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UsersServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UsersServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USERS:
          serviceImpl.getUsers((com.se7so.model.UsersQuery) request,
              (io.grpc.stub.StreamObserver<com.se7so.model.UsersResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class UsersServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.se7so.client.Service.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UsersServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UsersServiceDescriptorSupplier())
              .addMethod(METHOD_GET_USERS)
              .build();
        }
      }
    }
    return result;
  }
}
