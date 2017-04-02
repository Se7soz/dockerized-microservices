// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package com.se7so.model;

/**
 * Protobuf type {@code com.se7so.model.FindPasswordsResponse}
 */
public  final class FindPasswordsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.se7so.model.FindPasswordsResponse)
    FindPasswordsResponseOrBuilder {
  // Use FindPasswordsResponse.newBuilder() to construct.
  private FindPasswordsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FindPasswordsResponse() {
    numOfMatches_ = 0;
    matches_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private FindPasswordsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            numOfMatches_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              matches_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            matches_.add(s);
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        matches_ = matches_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.se7so.model.Model.internal_static_com_se7so_model_FindPasswordsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.se7so.model.Model.internal_static_com_se7so_model_FindPasswordsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.se7so.model.FindPasswordsResponse.class, com.se7so.model.FindPasswordsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int NUMOFMATCHES_FIELD_NUMBER = 1;
  private int numOfMatches_;
  /**
   * <code>optional int32 numOfMatches = 1;</code>
   */
  public int getNumOfMatches() {
    return numOfMatches_;
  }

  public static final int MATCHES_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList matches_;
  /**
   * <code>repeated string matches = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getMatchesList() {
    return matches_;
  }
  /**
   * <code>repeated string matches = 2;</code>
   */
  public int getMatchesCount() {
    return matches_.size();
  }
  /**
   * <code>repeated string matches = 2;</code>
   */
  public java.lang.String getMatches(int index) {
    return matches_.get(index);
  }
  /**
   * <code>repeated string matches = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMatchesBytes(int index) {
    return matches_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (numOfMatches_ != 0) {
      output.writeInt32(1, numOfMatches_);
    }
    for (int i = 0; i < matches_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, matches_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (numOfMatches_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, numOfMatches_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < matches_.size(); i++) {
        dataSize += computeStringSizeNoTag(matches_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMatchesList().size();
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.se7so.model.FindPasswordsResponse)) {
      return super.equals(obj);
    }
    com.se7so.model.FindPasswordsResponse other = (com.se7so.model.FindPasswordsResponse) obj;

    boolean result = true;
    result = result && (getNumOfMatches()
        == other.getNumOfMatches());
    result = result && getMatchesList()
        .equals(other.getMatchesList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + NUMOFMATCHES_FIELD_NUMBER;
    hash = (53 * hash) + getNumOfMatches();
    if (getMatchesCount() > 0) {
      hash = (37 * hash) + MATCHES_FIELD_NUMBER;
      hash = (53 * hash) + getMatchesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.se7so.model.FindPasswordsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.se7so.model.FindPasswordsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.se7so.model.FindPasswordsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.se7so.model.FindPasswordsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.se7so.model.FindPasswordsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.se7so.model.FindPasswordsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.se7so.model.FindPasswordsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.se7so.model.FindPasswordsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.se7so.model.FindPasswordsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.se7so.model.FindPasswordsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.se7so.model.FindPasswordsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.se7so.model.FindPasswordsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.se7so.model.FindPasswordsResponse)
      com.se7so.model.FindPasswordsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.se7so.model.Model.internal_static_com_se7so_model_FindPasswordsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.se7so.model.Model.internal_static_com_se7so_model_FindPasswordsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.se7so.model.FindPasswordsResponse.class, com.se7so.model.FindPasswordsResponse.Builder.class);
    }

    // Construct using com.se7so.model.FindPasswordsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      numOfMatches_ = 0;

      matches_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.se7so.model.Model.internal_static_com_se7so_model_FindPasswordsResponse_descriptor;
    }

    public com.se7so.model.FindPasswordsResponse getDefaultInstanceForType() {
      return com.se7so.model.FindPasswordsResponse.getDefaultInstance();
    }

    public com.se7so.model.FindPasswordsResponse build() {
      com.se7so.model.FindPasswordsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.se7so.model.FindPasswordsResponse buildPartial() {
      com.se7so.model.FindPasswordsResponse result = new com.se7so.model.FindPasswordsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.numOfMatches_ = numOfMatches_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        matches_ = matches_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.matches_ = matches_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.se7so.model.FindPasswordsResponse) {
        return mergeFrom((com.se7so.model.FindPasswordsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.se7so.model.FindPasswordsResponse other) {
      if (other == com.se7so.model.FindPasswordsResponse.getDefaultInstance()) return this;
      if (other.getNumOfMatches() != 0) {
        setNumOfMatches(other.getNumOfMatches());
      }
      if (!other.matches_.isEmpty()) {
        if (matches_.isEmpty()) {
          matches_ = other.matches_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureMatchesIsMutable();
          matches_.addAll(other.matches_);
        }
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.se7so.model.FindPasswordsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.se7so.model.FindPasswordsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int numOfMatches_ ;
    /**
     * <code>optional int32 numOfMatches = 1;</code>
     */
    public int getNumOfMatches() {
      return numOfMatches_;
    }
    /**
     * <code>optional int32 numOfMatches = 1;</code>
     */
    public Builder setNumOfMatches(int value) {
      
      numOfMatches_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 numOfMatches = 1;</code>
     */
    public Builder clearNumOfMatches() {
      
      numOfMatches_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList matches_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureMatchesIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        matches_ = new com.google.protobuf.LazyStringArrayList(matches_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string matches = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getMatchesList() {
      return matches_.getUnmodifiableView();
    }
    /**
     * <code>repeated string matches = 2;</code>
     */
    public int getMatchesCount() {
      return matches_.size();
    }
    /**
     * <code>repeated string matches = 2;</code>
     */
    public java.lang.String getMatches(int index) {
      return matches_.get(index);
    }
    /**
     * <code>repeated string matches = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMatchesBytes(int index) {
      return matches_.getByteString(index);
    }
    /**
     * <code>repeated string matches = 2;</code>
     */
    public Builder setMatches(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMatchesIsMutable();
      matches_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string matches = 2;</code>
     */
    public Builder addMatches(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMatchesIsMutable();
      matches_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string matches = 2;</code>
     */
    public Builder addAllMatches(
        java.lang.Iterable<java.lang.String> values) {
      ensureMatchesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, matches_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string matches = 2;</code>
     */
    public Builder clearMatches() {
      matches_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string matches = 2;</code>
     */
    public Builder addMatchesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureMatchesIsMutable();
      matches_.add(value);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.se7so.model.FindPasswordsResponse)
  }

  // @@protoc_insertion_point(class_scope:com.se7so.model.FindPasswordsResponse)
  private static final com.se7so.model.FindPasswordsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.se7so.model.FindPasswordsResponse();
  }

  public static com.se7so.model.FindPasswordsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindPasswordsResponse>
      PARSER = new com.google.protobuf.AbstractParser<FindPasswordsResponse>() {
    public FindPasswordsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new FindPasswordsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FindPasswordsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindPasswordsResponse> getParserForType() {
    return PARSER;
  }

  public com.se7so.model.FindPasswordsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

