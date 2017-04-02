package com.se7so.service;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.3)",
    comments = "Source: services.proto")
public class PasswordsServiceHealthServiceGrpc {

  private PasswordsServiceHealthServiceGrpc() {}

  public static final String SERVICE_NAME = "com.se7so.services.PasswordsServiceHealthService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.se7so.model.PasswordsServiceHealthStatus> METHOD_GET_PASSWORDS_SERVICE_HEALTH_STATUS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.se7so.services.PasswordsServiceHealthService", "getPasswordsServiceHealthStatus"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.se7so.model.PasswordsServiceHealthStatus.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PasswordsServiceHealthServiceStub newStub(io.grpc.Channel channel) {
    return new PasswordsServiceHealthServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PasswordsServiceHealthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PasswordsServiceHealthServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static PasswordsServiceHealthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PasswordsServiceHealthServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PasswordsServiceHealthServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPasswordsServiceHealthStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.se7so.model.PasswordsServiceHealthStatus> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PASSWORDS_SERVICE_HEALTH_STATUS, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_PASSWORDS_SERVICE_HEALTH_STATUS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.se7so.model.PasswordsServiceHealthStatus>(
                  this, METHODID_GET_PASSWORDS_SERVICE_HEALTH_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class PasswordsServiceHealthServiceStub extends io.grpc.stub.AbstractStub<PasswordsServiceHealthServiceStub> {
    private PasswordsServiceHealthServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PasswordsServiceHealthServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PasswordsServiceHealthServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PasswordsServiceHealthServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPasswordsServiceHealthStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.se7so.model.PasswordsServiceHealthStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PASSWORDS_SERVICE_HEALTH_STATUS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PasswordsServiceHealthServiceBlockingStub extends io.grpc.stub.AbstractStub<PasswordsServiceHealthServiceBlockingStub> {
    private PasswordsServiceHealthServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PasswordsServiceHealthServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PasswordsServiceHealthServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PasswordsServiceHealthServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.se7so.model.PasswordsServiceHealthStatus getPasswordsServiceHealthStatus(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PASSWORDS_SERVICE_HEALTH_STATUS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PasswordsServiceHealthServiceFutureStub extends io.grpc.stub.AbstractStub<PasswordsServiceHealthServiceFutureStub> {
    private PasswordsServiceHealthServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PasswordsServiceHealthServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PasswordsServiceHealthServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PasswordsServiceHealthServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.se7so.model.PasswordsServiceHealthStatus> getPasswordsServiceHealthStatus(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PASSWORDS_SERVICE_HEALTH_STATUS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PASSWORDS_SERVICE_HEALTH_STATUS = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PasswordsServiceHealthServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(PasswordsServiceHealthServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PASSWORDS_SERVICE_HEALTH_STATUS:
          serviceImpl.getPasswordsServiceHealthStatus((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.se7so.model.PasswordsServiceHealthStatus>) responseObserver);
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

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_GET_PASSWORDS_SERVICE_HEALTH_STATUS);
  }

}
