// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/tx.proto

package com.cosmos.staking.v1beta1;

/**
 * <pre>
 * MsgUndelegateResponse defines the Msg/Undelegate response type.
 * </pre>
 *
 * Protobuf type {@code cosmos.staking.v1beta1.MsgUndelegateResponse}
 */
public final class MsgUndelegateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.staking.v1beta1.MsgUndelegateResponse)
    MsgUndelegateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgUndelegateResponse.newBuilder() to construct.
  private MsgUndelegateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgUndelegateResponse() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgUndelegateResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return TxProto.internal_static_cosmos_staking_v1beta1_MsgUndelegateResponse_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return TxProto.internal_static_cosmos_staking_v1beta1_MsgUndelegateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            MsgUndelegateResponse.class, Builder.class);
  }

  public static final int COMPLETION_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp completionTime_;
  /**
   * <code>.google.protobuf.Timestamp completion_time = 1 [json_name = "completionTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the completionTime field is set.
   */
  @Override
  public boolean hasCompletionTime() {
    return completionTime_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp completion_time = 1 [json_name = "completionTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The completionTime.
   */
  @Override
  public com.google.protobuf.Timestamp getCompletionTime() {
    return completionTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : completionTime_;
  }
  /**
   * <code>.google.protobuf.Timestamp completion_time = 1 [json_name = "completionTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  @Override
  public com.google.protobuf.TimestampOrBuilder getCompletionTimeOrBuilder() {
    return completionTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : completionTime_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (completionTime_ != null) {
      output.writeMessage(1, getCompletionTime());
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (completionTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCompletionTime());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof MsgUndelegateResponse)) {
      return super.equals(obj);
    }
    MsgUndelegateResponse other = (MsgUndelegateResponse) obj;

    if (hasCompletionTime() != other.hasCompletionTime()) return false;
    if (hasCompletionTime()) {
      if (!getCompletionTime()
          .equals(other.getCompletionTime())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCompletionTime()) {
      hash = (37 * hash) + COMPLETION_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCompletionTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static MsgUndelegateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MsgUndelegateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MsgUndelegateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MsgUndelegateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MsgUndelegateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MsgUndelegateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MsgUndelegateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MsgUndelegateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static MsgUndelegateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static MsgUndelegateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static MsgUndelegateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MsgUndelegateResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(MsgUndelegateResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * MsgUndelegateResponse defines the Msg/Undelegate response type.
   * </pre>
   *
   * Protobuf type {@code cosmos.staking.v1beta1.MsgUndelegateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.staking.v1beta1.MsgUndelegateResponse)
      MsgUndelegateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TxProto.internal_static_cosmos_staking_v1beta1_MsgUndelegateResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TxProto.internal_static_cosmos_staking_v1beta1_MsgUndelegateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MsgUndelegateResponse.class, Builder.class);
    }

    // Construct using com.cosmos.staking.v1beta1.MsgUndelegateResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      completionTime_ = null;
      if (completionTimeBuilder_ != null) {
        completionTimeBuilder_.dispose();
        completionTimeBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return TxProto.internal_static_cosmos_staking_v1beta1_MsgUndelegateResponse_descriptor;
    }

    @Override
    public MsgUndelegateResponse getDefaultInstanceForType() {
      return MsgUndelegateResponse.getDefaultInstance();
    }

    @Override
    public MsgUndelegateResponse build() {
      MsgUndelegateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public MsgUndelegateResponse buildPartial() {
      MsgUndelegateResponse result = new MsgUndelegateResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(MsgUndelegateResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.completionTime_ = completionTimeBuilder_ == null
            ? completionTime_
            : completionTimeBuilder_.build();
      }
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof MsgUndelegateResponse) {
        return mergeFrom((MsgUndelegateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(MsgUndelegateResponse other) {
      if (other == MsgUndelegateResponse.getDefaultInstance()) return this;
      if (other.hasCompletionTime()) {
        mergeCompletionTime(other.getCompletionTime());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getCompletionTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Timestamp completionTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> completionTimeBuilder_;
    /**
     * <code>.google.protobuf.Timestamp completion_time = 1 [json_name = "completionTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the completionTime field is set.
     */
    public boolean hasCompletionTime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp completion_time = 1 [json_name = "completionTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return The completionTime.
     */
    public com.google.protobuf.Timestamp getCompletionTime() {
      if (completionTimeBuilder_ == null) {
        return completionTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : completionTime_;
      } else {
        return completionTimeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp completion_time = 1 [json_name = "completionTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder setCompletionTime(com.google.protobuf.Timestamp value) {
      if (completionTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        completionTime_ = value;
      } else {
        completionTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp completion_time = 1 [json_name = "completionTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder setCompletionTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (completionTimeBuilder_ == null) {
        completionTime_ = builderForValue.build();
      } else {
        completionTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp completion_time = 1 [json_name = "completionTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder mergeCompletionTime(com.google.protobuf.Timestamp value) {
      if (completionTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          completionTime_ != null &&
          completionTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getCompletionTimeBuilder().mergeFrom(value);
        } else {
          completionTime_ = value;
        }
      } else {
        completionTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp completion_time = 1 [json_name = "completionTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder clearCompletionTime() {
      bitField0_ = (bitField0_ & ~0x00000001);
      completionTime_ = null;
      if (completionTimeBuilder_ != null) {
        completionTimeBuilder_.dispose();
        completionTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp completion_time = 1 [json_name = "completionTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.Timestamp.Builder getCompletionTimeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCompletionTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp completion_time = 1 [json_name = "completionTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCompletionTimeOrBuilder() {
      if (completionTimeBuilder_ != null) {
        return completionTimeBuilder_.getMessageOrBuilder();
      } else {
        return completionTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : completionTime_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp completion_time = 1 [json_name = "completionTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCompletionTimeFieldBuilder() {
      if (completionTimeBuilder_ == null) {
        completionTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCompletionTime(),
                getParentForChildren(),
                isClean());
        completionTime_ = null;
      }
      return completionTimeBuilder_;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:cosmos.staking.v1beta1.MsgUndelegateResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.staking.v1beta1.MsgUndelegateResponse)
  private static final MsgUndelegateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new MsgUndelegateResponse();
  }

  public static MsgUndelegateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgUndelegateResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgUndelegateResponse>() {
    @Override
    public MsgUndelegateResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<MsgUndelegateResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<MsgUndelegateResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public MsgUndelegateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

