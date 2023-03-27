// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/transfer/v1/query.proto

package com.ibc.applications.transfer.v1;

/**
 * <pre>
 * QueryEscrowAddressRequest is the request type for the EscrowAddress RPC method.
 * </pre>
 *
 * Protobuf type {@code ibc.applications.transfer.v1.QueryEscrowAddressRequest}
 */
public final class QueryEscrowAddressRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.applications.transfer.v1.QueryEscrowAddressRequest)
    QueryEscrowAddressRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryEscrowAddressRequest.newBuilder() to construct.
  private QueryEscrowAddressRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryEscrowAddressRequest() {
    portId_ = "";
    channelId_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryEscrowAddressRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return QueryProto.internal_static_ibc_applications_transfer_v1_QueryEscrowAddressRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return QueryProto.internal_static_ibc_applications_transfer_v1_QueryEscrowAddressRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            QueryEscrowAddressRequest.class, Builder.class);
  }

  public static final int PORT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile Object portId_ = "";
  /**
   * <pre>
   * unique port identifier
   * </pre>
   *
   * <code>string port_id = 1 [json_name = "portId"];</code>
   * @return The portId.
   */
  @Override
  public String getPortId() {
    Object ref = portId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      portId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * unique port identifier
   * </pre>
   *
   * <code>string port_id = 1 [json_name = "portId"];</code>
   * @return The bytes for portId.
   */
  @Override
  public com.google.protobuf.ByteString
      getPortIdBytes() {
    Object ref = portId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      portId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHANNEL_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile Object channelId_ = "";
  /**
   * <pre>
   * unique channel identifier
   * </pre>
   *
   * <code>string channel_id = 2 [json_name = "channelId"];</code>
   * @return The channelId.
   */
  @Override
  public String getChannelId() {
    Object ref = channelId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      channelId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * unique channel identifier
   * </pre>
   *
   * <code>string channel_id = 2 [json_name = "channelId"];</code>
   * @return The bytes for channelId.
   */
  @Override
  public com.google.protobuf.ByteString
      getChannelIdBytes() {
    Object ref = channelId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      channelId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(portId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, portId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(channelId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, channelId_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(portId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, portId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(channelId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, channelId_);
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
    if (!(obj instanceof QueryEscrowAddressRequest)) {
      return super.equals(obj);
    }
    QueryEscrowAddressRequest other = (QueryEscrowAddressRequest) obj;

    if (!getPortId()
        .equals(other.getPortId())) return false;
    if (!getChannelId()
        .equals(other.getChannelId())) return false;
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
    hash = (37 * hash) + PORT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPortId().hashCode();
    hash = (37 * hash) + CHANNEL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getChannelId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static QueryEscrowAddressRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryEscrowAddressRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryEscrowAddressRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryEscrowAddressRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryEscrowAddressRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryEscrowAddressRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryEscrowAddressRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static QueryEscrowAddressRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static QueryEscrowAddressRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static QueryEscrowAddressRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static QueryEscrowAddressRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static QueryEscrowAddressRequest parseFrom(
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
  public static Builder newBuilder(QueryEscrowAddressRequest prototype) {
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
   * QueryEscrowAddressRequest is the request type for the EscrowAddress RPC method.
   * </pre>
   *
   * Protobuf type {@code ibc.applications.transfer.v1.QueryEscrowAddressRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.applications.transfer.v1.QueryEscrowAddressRequest)
      QueryEscrowAddressRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return QueryProto.internal_static_ibc_applications_transfer_v1_QueryEscrowAddressRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return QueryProto.internal_static_ibc_applications_transfer_v1_QueryEscrowAddressRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              QueryEscrowAddressRequest.class, Builder.class);
    }

    // Construct using com.ibc.applications.transfer.v1.QueryEscrowAddressRequest.newBuilder()
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
      portId_ = "";
      channelId_ = "";
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return QueryProto.internal_static_ibc_applications_transfer_v1_QueryEscrowAddressRequest_descriptor;
    }

    @Override
    public QueryEscrowAddressRequest getDefaultInstanceForType() {
      return QueryEscrowAddressRequest.getDefaultInstance();
    }

    @Override
    public QueryEscrowAddressRequest build() {
      QueryEscrowAddressRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public QueryEscrowAddressRequest buildPartial() {
      QueryEscrowAddressRequest result = new QueryEscrowAddressRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(QueryEscrowAddressRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.portId_ = portId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.channelId_ = channelId_;
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
      if (other instanceof QueryEscrowAddressRequest) {
        return mergeFrom((QueryEscrowAddressRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(QueryEscrowAddressRequest other) {
      if (other == QueryEscrowAddressRequest.getDefaultInstance()) return this;
      if (!other.getPortId().isEmpty()) {
        portId_ = other.portId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getChannelId().isEmpty()) {
        channelId_ = other.channelId_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              portId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              channelId_ = input.readStringRequireUtf8();
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

    private Object portId_ = "";
    /**
     * <pre>
     * unique port identifier
     * </pre>
     *
     * <code>string port_id = 1 [json_name = "portId"];</code>
     * @return The portId.
     */
    public String getPortId() {
      Object ref = portId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        portId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * unique port identifier
     * </pre>
     *
     * <code>string port_id = 1 [json_name = "portId"];</code>
     * @return The bytes for portId.
     */
    public com.google.protobuf.ByteString
        getPortIdBytes() {
      Object ref = portId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        portId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * unique port identifier
     * </pre>
     *
     * <code>string port_id = 1 [json_name = "portId"];</code>
     * @param value The portId to set.
     * @return This builder for chaining.
     */
    public Builder setPortId(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      portId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * unique port identifier
     * </pre>
     *
     * <code>string port_id = 1 [json_name = "portId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPortId() {
      portId_ = getDefaultInstance().getPortId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * unique port identifier
     * </pre>
     *
     * <code>string port_id = 1 [json_name = "portId"];</code>
     * @param value The bytes for portId to set.
     * @return This builder for chaining.
     */
    public Builder setPortIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      portId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private Object channelId_ = "";
    /**
     * <pre>
     * unique channel identifier
     * </pre>
     *
     * <code>string channel_id = 2 [json_name = "channelId"];</code>
     * @return The channelId.
     */
    public String getChannelId() {
      Object ref = channelId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        channelId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * unique channel identifier
     * </pre>
     *
     * <code>string channel_id = 2 [json_name = "channelId"];</code>
     * @return The bytes for channelId.
     */
    public com.google.protobuf.ByteString
        getChannelIdBytes() {
      Object ref = channelId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
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
     * <code>string channel_id = 2 [json_name = "channelId"];</code>
     * @param value The channelId to set.
     * @return This builder for chaining.
     */
    public Builder setChannelId(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      channelId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * unique channel identifier
     * </pre>
     *
     * <code>string channel_id = 2 [json_name = "channelId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChannelId() {
      channelId_ = getDefaultInstance().getChannelId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * unique channel identifier
     * </pre>
     *
     * <code>string channel_id = 2 [json_name = "channelId"];</code>
     * @param value The bytes for channelId to set.
     * @return This builder for chaining.
     */
    public Builder setChannelIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      channelId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:ibc.applications.transfer.v1.QueryEscrowAddressRequest)
  }

  // @@protoc_insertion_point(class_scope:ibc.applications.transfer.v1.QueryEscrowAddressRequest)
  private static final QueryEscrowAddressRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new QueryEscrowAddressRequest();
  }

  public static QueryEscrowAddressRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryEscrowAddressRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryEscrowAddressRequest>() {
    @Override
    public QueryEscrowAddressRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryEscrowAddressRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<QueryEscrowAddressRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public QueryEscrowAddressRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

