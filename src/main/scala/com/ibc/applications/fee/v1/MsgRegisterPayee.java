// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/fee/v1/tx.proto

package com.ibc.applications.fee.v1;

/**
 * <pre>
 * MsgRegisterPayee defines the request type for the RegisterPayee rpc
 * </pre>
 *
 * Protobuf type {@code ibc.applications.fee.v1.MsgRegisterPayee}
 */
public final class MsgRegisterPayee extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.applications.fee.v1.MsgRegisterPayee)
    MsgRegisterPayeeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgRegisterPayee.newBuilder() to construct.
  private MsgRegisterPayee(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgRegisterPayee() {
    portId_ = "";
    channelId_ = "";
    relayer_ = "";
    payee_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgRegisterPayee();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.applications.fee.v1.TxProto.internal_static_ibc_applications_fee_v1_MsgRegisterPayee_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.applications.fee.v1.TxProto.internal_static_ibc_applications_fee_v1_MsgRegisterPayee_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.applications.fee.v1.MsgRegisterPayee.class, com.ibc.applications.fee.v1.MsgRegisterPayee.Builder.class);
  }

  public static final int PORT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object portId_ = "";
  /**
   * <pre>
   * unique port identifier
   * </pre>
   *
   * <code>string port_id = 1 [json_name = "portId", (.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
   * @return The portId.
   */
  @java.lang.Override
  public java.lang.String getPortId() {
    java.lang.Object ref = portId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      portId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * unique port identifier
   * </pre>
   *
   * <code>string port_id = 1 [json_name = "portId", (.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
   * @return The bytes for portId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPortIdBytes() {
    java.lang.Object ref = portId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      portId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHANNEL_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object channelId_ = "";
  /**
   * <pre>
   * unique channel identifier
   * </pre>
   *
   * <code>string channel_id = 2 [json_name = "channelId", (.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
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
   * <code>string channel_id = 2 [json_name = "channelId", (.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
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

  public static final int RELAYER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object relayer_ = "";
  /**
   * <pre>
   * the relayer address
   * </pre>
   *
   * <code>string relayer = 3 [json_name = "relayer"];</code>
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
   * the relayer address
   * </pre>
   *
   * <code>string relayer = 3 [json_name = "relayer"];</code>
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

  public static final int PAYEE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object payee_ = "";
  /**
   * <pre>
   * the payee address
   * </pre>
   *
   * <code>string payee = 4 [json_name = "payee"];</code>
   * @return The payee.
   */
  @java.lang.Override
  public java.lang.String getPayee() {
    java.lang.Object ref = payee_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      payee_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the payee address
   * </pre>
   *
   * <code>string payee = 4 [json_name = "payee"];</code>
   * @return The bytes for payee.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPayeeBytes() {
    java.lang.Object ref = payee_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      payee_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(portId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, portId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(channelId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, channelId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(relayer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, relayer_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(payee_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, payee_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(relayer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, relayer_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(payee_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, payee_);
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
    if (!(obj instanceof com.ibc.applications.fee.v1.MsgRegisterPayee)) {
      return super.equals(obj);
    }
    com.ibc.applications.fee.v1.MsgRegisterPayee other = (com.ibc.applications.fee.v1.MsgRegisterPayee) obj;

    if (!getPortId()
        .equals(other.getPortId())) return false;
    if (!getChannelId()
        .equals(other.getChannelId())) return false;
    if (!getRelayer()
        .equals(other.getRelayer())) return false;
    if (!getPayee()
        .equals(other.getPayee())) return false;
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
    hash = (37 * hash) + PORT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPortId().hashCode();
    hash = (37 * hash) + CHANNEL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getChannelId().hashCode();
    hash = (37 * hash) + RELAYER_FIELD_NUMBER;
    hash = (53 * hash) + getRelayer().hashCode();
    hash = (37 * hash) + PAYEE_FIELD_NUMBER;
    hash = (53 * hash) + getPayee().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.applications.fee.v1.MsgRegisterPayee parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.applications.fee.v1.MsgRegisterPayee parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.applications.fee.v1.MsgRegisterPayee parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.applications.fee.v1.MsgRegisterPayee parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.applications.fee.v1.MsgRegisterPayee parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.applications.fee.v1.MsgRegisterPayee parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.applications.fee.v1.MsgRegisterPayee parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.applications.fee.v1.MsgRegisterPayee parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.applications.fee.v1.MsgRegisterPayee parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ibc.applications.fee.v1.MsgRegisterPayee parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.applications.fee.v1.MsgRegisterPayee parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.applications.fee.v1.MsgRegisterPayee parseFrom(
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
  public static Builder newBuilder(com.ibc.applications.fee.v1.MsgRegisterPayee prototype) {
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
   * MsgRegisterPayee defines the request type for the RegisterPayee rpc
   * </pre>
   *
   * Protobuf type {@code ibc.applications.fee.v1.MsgRegisterPayee}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.applications.fee.v1.MsgRegisterPayee)
      com.ibc.applications.fee.v1.MsgRegisterPayeeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.applications.fee.v1.TxProto.internal_static_ibc_applications_fee_v1_MsgRegisterPayee_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.applications.fee.v1.TxProto.internal_static_ibc_applications_fee_v1_MsgRegisterPayee_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.applications.fee.v1.MsgRegisterPayee.class, com.ibc.applications.fee.v1.MsgRegisterPayee.Builder.class);
    }

    // Construct using com.ibc.applications.fee.v1.MsgRegisterPayee.newBuilder()
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
      portId_ = "";
      channelId_ = "";
      relayer_ = "";
      payee_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibc.applications.fee.v1.TxProto.internal_static_ibc_applications_fee_v1_MsgRegisterPayee_descriptor;
    }

    @java.lang.Override
    public com.ibc.applications.fee.v1.MsgRegisterPayee getDefaultInstanceForType() {
      return com.ibc.applications.fee.v1.MsgRegisterPayee.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.applications.fee.v1.MsgRegisterPayee build() {
      com.ibc.applications.fee.v1.MsgRegisterPayee result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.applications.fee.v1.MsgRegisterPayee buildPartial() {
      com.ibc.applications.fee.v1.MsgRegisterPayee result = new com.ibc.applications.fee.v1.MsgRegisterPayee(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ibc.applications.fee.v1.MsgRegisterPayee result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.portId_ = portId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.channelId_ = channelId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.relayer_ = relayer_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.payee_ = payee_;
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
      if (other instanceof com.ibc.applications.fee.v1.MsgRegisterPayee) {
        return mergeFrom((com.ibc.applications.fee.v1.MsgRegisterPayee)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.applications.fee.v1.MsgRegisterPayee other) {
      if (other == com.ibc.applications.fee.v1.MsgRegisterPayee.getDefaultInstance()) return this;
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
      if (!other.getRelayer().isEmpty()) {
        relayer_ = other.relayer_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getPayee().isEmpty()) {
        payee_ = other.payee_;
        bitField0_ |= 0x00000008;
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
              portId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              channelId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              relayer_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              payee_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object portId_ = "";
    /**
     * <pre>
     * unique port identifier
     * </pre>
     *
     * <code>string port_id = 1 [json_name = "portId", (.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
     * @return The portId.
     */
    public java.lang.String getPortId() {
      java.lang.Object ref = portId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        portId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * unique port identifier
     * </pre>
     *
     * <code>string port_id = 1 [json_name = "portId", (.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
     * @return The bytes for portId.
     */
    public com.google.protobuf.ByteString
        getPortIdBytes() {
      java.lang.Object ref = portId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
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
     * <code>string port_id = 1 [json_name = "portId", (.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
     * @param value The portId to set.
     * @return This builder for chaining.
     */
    public Builder setPortId(
        java.lang.String value) {
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
     * <code>string port_id = 1 [json_name = "portId", (.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
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
     * <code>string port_id = 1 [json_name = "portId", (.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
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

    private java.lang.Object channelId_ = "";
    /**
     * <pre>
     * unique channel identifier
     * </pre>
     *
     * <code>string channel_id = 2 [json_name = "channelId", (.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
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
     * <code>string channel_id = 2 [json_name = "channelId", (.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
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
     * <code>string channel_id = 2 [json_name = "channelId", (.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
     * @param value The channelId to set.
     * @return This builder for chaining.
     */
    public Builder setChannelId(
        java.lang.String value) {
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
     * <code>string channel_id = 2 [json_name = "channelId", (.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
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
     * <code>string channel_id = 2 [json_name = "channelId", (.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
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

    private java.lang.Object relayer_ = "";
    /**
     * <pre>
     * the relayer address
     * </pre>
     *
     * <code>string relayer = 3 [json_name = "relayer"];</code>
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
     * the relayer address
     * </pre>
     *
     * <code>string relayer = 3 [json_name = "relayer"];</code>
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
     * the relayer address
     * </pre>
     *
     * <code>string relayer = 3 [json_name = "relayer"];</code>
     * @param value The relayer to set.
     * @return This builder for chaining.
     */
    public Builder setRelayer(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      relayer_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the relayer address
     * </pre>
     *
     * <code>string relayer = 3 [json_name = "relayer"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRelayer() {
      relayer_ = getDefaultInstance().getRelayer();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the relayer address
     * </pre>
     *
     * <code>string relayer = 3 [json_name = "relayer"];</code>
     * @param value The bytes for relayer to set.
     * @return This builder for chaining.
     */
    public Builder setRelayerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      relayer_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object payee_ = "";
    /**
     * <pre>
     * the payee address
     * </pre>
     *
     * <code>string payee = 4 [json_name = "payee"];</code>
     * @return The payee.
     */
    public java.lang.String getPayee() {
      java.lang.Object ref = payee_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        payee_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the payee address
     * </pre>
     *
     * <code>string payee = 4 [json_name = "payee"];</code>
     * @return The bytes for payee.
     */
    public com.google.protobuf.ByteString
        getPayeeBytes() {
      java.lang.Object ref = payee_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        payee_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the payee address
     * </pre>
     *
     * <code>string payee = 4 [json_name = "payee"];</code>
     * @param value The payee to set.
     * @return This builder for chaining.
     */
    public Builder setPayee(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      payee_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the payee address
     * </pre>
     *
     * <code>string payee = 4 [json_name = "payee"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPayee() {
      payee_ = getDefaultInstance().getPayee();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the payee address
     * </pre>
     *
     * <code>string payee = 4 [json_name = "payee"];</code>
     * @param value The bytes for payee to set.
     * @return This builder for chaining.
     */
    public Builder setPayeeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      payee_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:ibc.applications.fee.v1.MsgRegisterPayee)
  }

  // @@protoc_insertion_point(class_scope:ibc.applications.fee.v1.MsgRegisterPayee)
  private static final com.ibc.applications.fee.v1.MsgRegisterPayee DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.applications.fee.v1.MsgRegisterPayee();
  }

  public static com.ibc.applications.fee.v1.MsgRegisterPayee getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgRegisterPayee>
      PARSER = new com.google.protobuf.AbstractParser<MsgRegisterPayee>() {
    @java.lang.Override
    public MsgRegisterPayee parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgRegisterPayee> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgRegisterPayee> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.applications.fee.v1.MsgRegisterPayee getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

