// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package com.se7so.model;

public final class Model {
  private Model() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_se7so_model_FindPasswordsQuery_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_se7so_model_FindPasswordsQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_se7so_model_FindPasswordsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_se7so_model_FindPasswordsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_se7so_model_PasswordsServiceHealthStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_se7so_model_PasswordsServiceHealthStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013model.proto\022\017com.se7so.model\"#\n\022FindPa" +
      "sswordsQuery\022\r\n\005query\030\001 \001(\t\">\n\025FindPassw" +
      "ordsResponse\022\024\n\014numOfMatches\030\001 \001(\005\022\017\n\007ma" +
      "tches\030\002 \003(\t\"L\n\034PasswordsServiceHealthSta" +
      "tus\022\016\n\006status\030\001 \001(\t\022\034\n\024totalPasswordsLoa" +
      "ded\030\002 \001(\005B\032\n\017com.se7so.modelB\005ModelP\001b\006p" +
      "roto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_se7so_model_FindPasswordsQuery_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_se7so_model_FindPasswordsQuery_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_se7so_model_FindPasswordsQuery_descriptor,
        new java.lang.String[] { "Query", });
    internal_static_com_se7so_model_FindPasswordsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_se7so_model_FindPasswordsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_se7so_model_FindPasswordsResponse_descriptor,
        new java.lang.String[] { "NumOfMatches", "Matches", });
    internal_static_com_se7so_model_PasswordsServiceHealthStatus_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_se7so_model_PasswordsServiceHealthStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_se7so_model_PasswordsServiceHealthStatus_descriptor,
        new java.lang.String[] { "Status", "TotalPasswordsLoaded", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}