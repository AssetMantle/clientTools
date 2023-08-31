// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/fee/v1/query.proto

package com.ibc.applications.fee.v1;

/**
 * <pre>
 * QueryPayeeRequest defines the request type for the Payee rpc
 * </pre>
 *
 * Protobuf type {@code ibc.applications.fee.v1.QueryPayeeRequest}
 */
public final class QueryPayeeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.applications.fee.v1.QueryPayeeRequest)
    QueryPayeeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryPayeeRequest.newBuilder() to construct.
  private QueryPayeeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryPayeeRequest() {
    channelId_ = "";
    relayer_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryPayeeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.applications.fee.v1.QueryProto.internal_static_ibc_applications_fee_v1_QueryPayeeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.applications.fee.v1.QueryProto.internal_static_ibc_applications_fee_v1_QueryPayeeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.applications.fee.v1.QueryPayeeRequest.class, com.ibc.applications.fee.v1.QueryPayeeRequest.Builder.class);
  }

  public static final int CHANNEL_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object channelId_ = "";
  /**
   * <pre>
   * unique channel identifier
   * </pre>
   *
   * <code>string channel_id = 1 [json_name = "channelId", (.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
   * @return The channelId.
   */
  @java.lang.Override
  public java.lang.String getChannelId() {
    java.lang.Object ref = channelId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      channelId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * unique channel identifier
   * </pre>
   *
   * <code>string channel_id = 1 [json_name = "channelId", (.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
   * @return The bytes for channelId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChannelIdBytes() {
    java.lang.Object ref = channelId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      channelId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RELAYER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object relayer_ = "";
  /**
   * <pre>
   * the relayer address to which the distribution address is registered
   * </pre>
   *
   * <code>string relayer = 2 [json_name = "relayer"];</code>
   * @return The relayer.
   */
  @java.lang.Override
  public java.lang.String getRelayer() {
    java.lang.Object ref = relayer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      relayer_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the relayer address to which the distribution address is registered
   * </pre>
   *
   * <code>string relayer = 2 [json_name = "relayer"];</code>
   * @return The bytes for relayer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRelayerBytes() {
    java.lang.Object ref = relayer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      relayer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(channelId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, channelId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(relayer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, relayer_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(channelId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, channelId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(relayer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, relayer_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.ibc.applications.fee.v1.QueryPayeeRequest)) {
      return super.equals(obj);
    }
    com.ibc.applications.fee.v1.QueryPayeeRequest other = (com.ibc.applications.fee.v1.QueryPayeeRequest) obj;

    if (!getChannelId()
        .equals(other.getChannelId())) return false;
    if (!getRelayer()
        .equals(other.getRelayer())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CHANNEL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getChannelId().hashCode();
    hash = (37 * hash) + RELAYER_FIELD_NUMBER;
    hash = (53 * hash) + getRelayer().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.applications.fee.v1.QueryPayeeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.applications.fee.v1.QueryPayeeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.applications.fee.v1.QueryPayeeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.applications.fee.v1.QueryPayeeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.applications.fee.v1.QueryPayeeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.applications.fee.v1.QueryPayeeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.applications.fee.v1.QueryPayeeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.applications.fee.v1.QueryPayeeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.applications.fee.v1.QueryPayeeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ibc.applications.fee.v1.QueryPayeeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.applications.fee.v1.QueryPayeeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.applications.fee.v1.QueryPayeeRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ibc.applications.fee.v1.QueryPayeeRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * <pre>
   * QueryPayeeRequest defines the request type for the Payee rpc
   * </pre>
   *
   * Protobuf type {@code ibc.applications.fee.v1.QueryPayeeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.applications.fee.v1.QueryPayeeRequest)
      com.ibc.applications.fee.v1.QueryPayeeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.applications.fee.v1.QueryProto.internal_static_ibc_applications_fee_v1_QueryPayeeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.applications.fee.v1.QueryProto.internal_static_ibc_applications_fee_v1_QueryPayeeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.applications.fee.v1.QueryPayeeRequest.class, com.ibc.applications.fee.v1.QueryPayeeRequest.Builder.class);
    }

    // Construct using com.ibc.applications.fee.v1.QueryPayeeRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      channelId_ = "";
      relayer_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibc.applications.fee.v1.QueryProto.internal_static_ibc_applications_fee_v1_QueryPayeeRequest_descriptor;
    }

    @java.lang.Override
    public com.ibc.applications.fee.v1.QueryPayeeRequest getDefaultInstanceForType() {
      return com.ibc.applications.fee.v1.QueryPayeeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.applications.fee.v1.QueryPayeeRequest build() {
      com.ibc.applications.fee.v1.QueryPayeeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.applications.fee.v1.QueryPayeeRequest buildPartial() {
      com.ibc.applications.fee.v1.QueryPayeeRequest result = new com.ibc.applications.fee.v1.QueryPayeeRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ibc.applications.fee.v1.QueryPayeeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.channelId_ = channelId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.relayer_ = relayer_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ibc.applications.fee.v1.QueryPayeeRequest) {
        return mergeFrom((com.ibc.applications.fee.v1.QueryPayeeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.applications.fee.v1.QueryPayeeRequest other) {
      if (other == com.ibc.applications.fee.v1.QueryPayeeRequest.getDefaultInstance()) return this;
      if (!other.getChannelId().isEmpty()) {
        channelId_ = other.channelId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRelayer().isEmpty()) {
        relayer_ = other.relayer_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
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
              channelId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              relayer_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object channelId_ = "";
    /**
     * <pre>
     * unique channel identifier
     * </pre>
     *
     * <code>string channel_id = 1 [json_name = "channelId", (.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
     * @return The channelId.
     */
    public java.lang.String getChannelId() {
      java.lang.Object ref = channelId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        channelId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * unique channel identifier
     * </pre>
     *
     * <code>string channel_id = 1 [json_name = "channelId", (.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
     * @return The bytes for channelId.
     */
    public com.google.protobuf.ByteString
        getChannelIdBytes() {
      java.lang.Object ref = channelId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        channelId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * unique channel identifier
     * </pre>
     *
     * <code>string channel_id = 1 [json_name = "channelId", (.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
     * @param value The channelId to set.
     * @return This builder for chaining.
     */
    public Builder setChannelId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      channelId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * unique channel identifier
     * </pre>
     *
     * <code>string channel_id = 1 [json_name = "channelId", (.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearChannelId() {
      channelId_ = getDefaultInstance().getChannelId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * unique channel identifier
     * </pre>
     *
     * <code>string channel_id = 1 [json_name = "channelId", (.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
     * @param value The bytes for channelId to set.
     * @return This builder for chaining.
     */
    public Builder setChannelIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      channelId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object relayer_ = "";
    /**
     * <pre>
     * the relayer address to which the distribution address is registered
     * </pre>
     *
     * <code>string relayer = 2 [json_name = "relayer"];</code>
     * @return The relayer.
     */
    public java.lang.String getRelayer() {
      java.lang.Object ref = relayer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        relayer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the relayer address to which the distribution address is registered
     * </pre>
     *
     * <code>string relayer = 2 [json_name = "relayer"];</code>
     * @return The bytes for relayer.
     */
    public com.google.protobuf.ByteString
        getRelayerBytes() {
      java.lang.Object ref = relayer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        relayer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the relayer address to which the distribution address is registered
     * </pre>
     *
     * <code>string relayer = 2 [json_name = "relayer"];</code>
     * @param value The relayer to set.
     * @return This builder for chaining.
     */
    public Builder setRelayer(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      relayer_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the relayer address to which the distribution address is registered
     * </pre>
     *
     * <code>string relayer = 2 [json_name = "relayer"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRelayer() {
      relayer_ = getDefaultInstance().getRelayer();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the relayer address to which the distribution address is registered
     * </pre>
     *
     * <code>string relayer = 2 [json_name = "relayer"];</code>
     * @param value The bytes for relayer to set.
     * @return This builder for chaining.
     */
    public Builder setRelayerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      relayer_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ibc.applications.fee.v1.QueryPayeeRequest)
  }

  // @@protoc_insertion_point(class_scope:ibc.applications.fee.v1.QueryPayeeRequest)
  private static final com.ibc.applications.fee.v1.QueryPayeeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.applications.fee.v1.QueryPayeeRequest();
  }

  public static com.ibc.applications.fee.v1.QueryPayeeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryPayeeRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryPayeeRequest>() {
    @java.lang.Override
    public QueryPayeeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryPayeeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryPayeeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.applications.fee.v1.QueryPayeeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

