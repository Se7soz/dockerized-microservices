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
public class PasswordsServiceGrpc {

  private PasswordsServiceGrpc() {}

  public static final String SERVICE_NAME = "com.se7so.services.PasswordsService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.se7so.model.FindPasswordsQuery,
      com.se7so.model.FindPasswordsResponse> METHOD_FIND_PASSWORDS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.se7so.services.PasswordsService", "findPasswords"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.se7so.model.FindPasswordsQuery.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.se7so.model.FindPasswordsResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PasswordsServiceStub newStub(io.grpc.Channel channel) {
    return new PasswordsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PasswordsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PasswordsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static PasswordsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PasswordsServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PasswordsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void findPasswords(com.se7so.model.FindPasswordsQuery request,
        io.grpc.stub.StreamObserver<com.se7so.model.FindPasswordsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_PASSWORDS, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_FIND_PASSWORDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.se7so.model.FindPasswordsQuery,
                com.se7so.model.FindPasswordsResponse>(
                  this, METHODID_FIND_PASSWORDS)))
          .build();
    }
  }

  /**
   */
  public static final class PasswordsServiceStub extends io.grpc.stub.AbstractStub<PasswordsServiceStub> {
    private PasswordsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PasswordsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PasswordsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PasswordsServiceStub(channel, callOptions);
    }

    /**
     */
    public void findPasswords(com.se7so.model.FindPasswordsQuery request,
        io.grpc.stub.StreamObserver<com.se7so.model.FindPasswordsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND_PASSWORDS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PasswordsServiceBlockingStub extends io.grpc.stub.AbstractStub<PasswordsServiceBlockingStub> {
    private PasswordsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PasswordsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PasswordsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PasswordsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.se7so.model.FindPasswordsResponse findPasswords(com.se7so.model.FindPasswordsQuery request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND_PASSWORDS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PasswordsServiceFutureStub extends io.grpc.stub.AbstractStub<PasswordsServiceFutureStub> {
    private PasswordsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PasswordsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PasswordsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PasswordsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.se7so.model.FindPasswordsResponse> findPasswords(
        com.se7so.model.FindPasswordsQuery request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND_PASSWORDS, getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_PASSWORDS = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PasswordsServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(PasswordsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_PASSWORDS:
          serviceImpl.findPasswords((com.se7so.model.FindPasswordsQuery) request,
              (io.grpc.stub.StreamObserver<com.se7so.model.FindPasswordsResponse>) responseObserver);
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
        METHOD_FIND_PASSWORDS);
  }

}
