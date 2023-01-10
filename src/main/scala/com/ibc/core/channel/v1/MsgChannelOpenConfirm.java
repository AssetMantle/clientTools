// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/channel/v1/tx.proto

package com.ibc.core.channel.v1;

/**
 * <pre>
 * MsgChannelOpenConfirm defines a msg sent by a Relayer to Chain B to
 * acknowledge the change of channel state to OPEN on Chain A.
 * </pre>
 *
 * Protobuf type {@code ibc.core.channel.v1.MsgChannelOpenConfirm}
 */
public final class MsgChannelOpenConfirm extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.core.channel.v1.MsgChannelOpenConfirm)
    MsgChannelOpenConfirmOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgChannelOpenConfirm.newBuilder() to construct.
  private MsgChannelOpenConfirm(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgChannelOpenConfirm() {
    portId_ = "";
    channelId_ = "";
    proofAck_ = com.google.protobuf.ByteString.EMPTY;
    signer_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgChannelOpenConfirm();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.core.channel.v1.TxProto.internal_static_ibc_core_channel_v1_MsgChannelOpenConfirm_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.core.channel.v1.TxProto.internal_static_ibc_core_channel_v1_MsgChannelOpenConfirm_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.core.channel.v1.MsgChannelOpenConfirm.class, com.ibc.core.channel.v1.MsgChannelOpenConfirm.Builder.class);
  }

  public static final int PORT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object portId_ = "";
  /**
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

  public static final int PROOF_ACK_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString proofAck_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes proof_ack = 3 [json_name = "proofAck", (.gogoproto.moretags) = "yaml:&#92;"proof_ack&#92;""];</code>
   * @return The proofAck.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProofAck() {
    return proofAck_;
  }

  public static final int PROOF_HEIGHT_FIELD_NUMBER = 4;
  private com.ibc.core.client.v1.Height proofHeight_;
  /**
   * <code>.ibc.core.client.v1.Height proof_height = 4 [json_name = "proofHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
   * @return Whether the proofHeight field is set.
   */
  @java.lang.Override
  public boolean hasProofHeight() {
    return proofHeight_ != null;
  }
  /**
   * <code>.ibc.core.client.v1.Height proof_height = 4 [json_name = "proofHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
   * @return The proofHeight.
   */
  @java.lang.Override
  public com.ibc.core.client.v1.Height getProofHeight() {
    return proofHeight_ == null ? com.ibc.core.client.v1.Height.getDefaultInstance() : proofHeight_;
  }
  /**
   * <code>.ibc.core.client.v1.Height proof_height = 4 [json_name = "proofHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
   */
  @java.lang.Override
  public com.ibc.core.client.v1.HeightOrBuilder getProofHeightOrBuilder() {
    return proofHeight_ == null ? com.ibc.core.client.v1.Height.getDefaultInstance() : proofHeight_;
  }

  public static final int SIGNER_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object signer_ = "";
  /**
   * <code>string signer = 5 [json_name = "signer"];</code>
   * @return The signer.
   */
  @java.lang.Override
  public java.lang.String getSigner() {
    java.lang.Object ref = signer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      signer_ = s;
      return s;
    }
  }
  /**
   * <code>string signer = 5 [json_name = "signer"];</code>
   * @return The bytes for signer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSignerBytes() {
    java.lang.Object ref = signer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      signer_ = b;
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
    if (!proofAck_.isEmpty()) {
      output.writeBytes(3, proofAck_);
    }
    if (proofHeight_ != null) {
      output.writeMessage(4, getProofHeight());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(signer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, signer_);
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
    if (!proofAck_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, proofAck_);
    }
    if (proofHeight_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getProofHeight());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(signer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, signer_);
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
    if (!(obj instanceof com.ibc.core.channel.v1.MsgChannelOpenConfirm)) {
      return super.equals(obj);
    }
    com.ibc.core.channel.v1.MsgChannelOpenConfirm other = (com.ibc.core.channel.v1.MsgChannelOpenConfirm) obj;

    if (!getPortId()
        .equals(other.getPortId())) return false;
    if (!getChannelId()
        .equals(other.getChannelId())) return false;
    if (!getProofAck()
        .equals(other.getProofAck())) return false;
    if (hasProofHeight() != other.hasProofHeight()) return false;
    if (hasProofHeight()) {
      if (!getProofHeight()
          .equals(other.getProofHeight())) return false;
    }
    if (!getSigner()
        .equals(other.getSigner())) return false;
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
    hash = (37 * hash) + PROOF_ACK_FIELD_NUMBER;
    hash = (53 * hash) + getProofAck().hashCode();
    if (hasProofHeight()) {
      hash = (37 * hash) + PROOF_HEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + getProofHeight().hashCode();
    }
    hash = (37 * hash) + SIGNER_FIELD_NUMBER;
    hash = (53 * hash) + getSigner().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.core.channel.v1.MsgChannelOpenConfirm parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.channel.v1.MsgChannelOpenConfirm parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.channel.v1.MsgChannelOpenConfirm parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.channel.v1.MsgChannelOpenConfirm parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.channel.v1.MsgChannelOpenConfirm parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.channel.v1.MsgChannelOpenConfirm parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.channel.v1.MsgChannelOpenConfirm parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.channel.v1.MsgChannelOpenConfirm parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.core.channel.v1.MsgChannelOpenConfirm parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ibc.core.channel.v1.MsgChannelOpenConfirm parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.core.channel.v1.MsgChannelOpenConfirm parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.channel.v1.MsgChannelOpenConfirm parseFrom(
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
  public static Builder newBuilder(com.ibc.core.channel.v1.MsgChannelOpenConfirm prototype) {
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
   * MsgChannelOpenConfirm defines a msg sent by a Relayer to Chain B to
   * acknowledge the change of channel state to OPEN on Chain A.
   * </pre>
   *
   * Protobuf type {@code ibc.core.channel.v1.MsgChannelOpenConfirm}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.core.channel.v1.MsgChannelOpenConfirm)
      com.ibc.core.channel.v1.MsgChannelOpenConfirmOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.core.channel.v1.TxProto.internal_static_ibc_core_channel_v1_MsgChannelOpenConfirm_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.core.channel.v1.TxProto.internal_static_ibc_core_channel_v1_MsgChannelOpenConfirm_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.core.channel.v1.MsgChannelOpenConfirm.class, com.ibc.core.channel.v1.MsgChannelOpenConfirm.Builder.class);
    }

    // Construct using com.ibc.core.channel.v1.MsgChannelOpenConfirm.newBuilder()
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
      proofAck_ = com.google.protobuf.ByteString.EMPTY;
      proofHeight_ = null;
      if (proofHeightBuilder_ != null) {
        proofHeightBuilder_.dispose();
        proofHeightBuilder_ = null;
      }
      signer_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibc.core.channel.v1.TxProto.internal_static_ibc_core_channel_v1_MsgChannelOpenConfirm_descriptor;
    }

    @java.lang.Override
    public com.ibc.core.channel.v1.MsgChannelOpenConfirm getDefaultInstanceForType() {
      return com.ibc.core.channel.v1.MsgChannelOpenConfirm.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.core.channel.v1.MsgChannelOpenConfirm build() {
      com.ibc.core.channel.v1.MsgChannelOpenConfirm result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.core.channel.v1.MsgChannelOpenConfirm buildPartial() {
      com.ibc.core.channel.v1.MsgChannelOpenConfirm result = new com.ibc.core.channel.v1.MsgChannelOpenConfirm(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ibc.core.channel.v1.MsgChannelOpenConfirm result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.portId_ = portId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.channelId_ = channelId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.proofAck_ = proofAck_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.proofHeight_ = proofHeightBuilder_ == null
            ? proofHeight_
            : proofHeightBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.signer_ = signer_;
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
      if (other instanceof com.ibc.core.channel.v1.MsgChannelOpenConfirm) {
        return mergeFrom((com.ibc.core.channel.v1.MsgChannelOpenConfirm)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.core.channel.v1.MsgChannelOpenConfirm other) {
      if (other == com.ibc.core.channel.v1.MsgChannelOpenConfirm.getDefaultInstance()) return this;
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
      if (other.getProofAck() != com.google.protobuf.ByteString.EMPTY) {
        setProofAck(other.getProofAck());
      }
      if (other.hasProofHeight()) {
        mergeProofHeight(other.getProofHeight());
      }
      if (!other.getSigner().isEmpty()) {
        signer_ = other.signer_;
        bitField0_ |= 0x00000010;
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
              proofAck_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getProofHeightFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              signer_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private com.google.protobuf.ByteString proofAck_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes proof_ack = 3 [json_name = "proofAck", (.gogoproto.moretags) = "yaml:&#92;"proof_ack&#92;""];</code>
     * @return The proofAck.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getProofAck() {
      return proofAck_;
    }
    /**
     * <code>bytes proof_ack = 3 [json_name = "proofAck", (.gogoproto.moretags) = "yaml:&#92;"proof_ack&#92;""];</code>
     * @param value The proofAck to set.
     * @return This builder for chaining.
     */
    public Builder setProofAck(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      proofAck_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bytes proof_ack = 3 [json_name = "proofAck", (.gogoproto.moretags) = "yaml:&#92;"proof_ack&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearProofAck() {
      bitField0_ = (bitField0_ & ~0x00000004);
      proofAck_ = getDefaultInstance().getProofAck();
      onChanged();
      return this;
    }

    private com.ibc.core.client.v1.Height proofHeight_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ibc.core.client.v1.Height, com.ibc.core.client.v1.Height.Builder, com.ibc.core.client.v1.HeightOrBuilder> proofHeightBuilder_;
    /**
     * <code>.ibc.core.client.v1.Height proof_height = 4 [json_name = "proofHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
     * @return Whether the proofHeight field is set.
     */
    public boolean hasProofHeight() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.ibc.core.client.v1.Height proof_height = 4 [json_name = "proofHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
     * @return The proofHeight.
     */
    public com.ibc.core.client.v1.Height getProofHeight() {
      if (proofHeightBuilder_ == null) {
        return proofHeight_ == null ? com.ibc.core.client.v1.Height.getDefaultInstance() : proofHeight_;
      } else {
        return proofHeightBuilder_.getMessage();
      }
    }
    /**
     * <code>.ibc.core.client.v1.Height proof_height = 4 [json_name = "proofHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
     */
    public Builder setProofHeight(com.ibc.core.client.v1.Height value) {
      if (proofHeightBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        proofHeight_ = value;
      } else {
        proofHeightBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.core.client.v1.Height proof_height = 4 [json_name = "proofHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
     */
    public Builder setProofHeight(
        com.ibc.core.client.v1.Height.Builder builderForValue) {
      if (proofHeightBuilder_ == null) {
        proofHeight_ = builderForValue.build();
      } else {
        proofHeightBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.core.client.v1.Height proof_height = 4 [json_name = "proofHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
     */
    public Builder mergeProofHeight(com.ibc.core.client.v1.Height value) {
      if (proofHeightBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          proofHeight_ != null &&
          proofHeight_ != com.ibc.core.client.v1.Height.getDefaultInstance()) {
          getProofHeightBuilder().mergeFrom(value);
        } else {
          proofHeight_ = value;
        }
      } else {
        proofHeightBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.core.client.v1.Height proof_height = 4 [json_name = "proofHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
     */
    public Builder clearProofHeight() {
      bitField0_ = (bitField0_ & ~0x00000008);
      proofHeight_ = null;
      if (proofHeightBuilder_ != null) {
        proofHeightBuilder_.dispose();
        proofHeightBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.core.client.v1.Height proof_height = 4 [json_name = "proofHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
     */
    public com.ibc.core.client.v1.Height.Builder getProofHeightBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getProofHeightFieldBuilder().getBuilder();
    }
    /**
     * <code>.ibc.core.client.v1.Height proof_height = 4 [json_name = "proofHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
     */
    public com.ibc.core.client.v1.HeightOrBuilder getProofHeightOrBuilder() {
      if (proofHeightBuilder_ != null) {
        return proofHeightBuilder_.getMessageOrBuilder();
      } else {
        return proofHeight_ == null ?
            com.ibc.core.client.v1.Height.getDefaultInstance() : proofHeight_;
      }
    }
    /**
     * <code>.ibc.core.client.v1.Height proof_height = 4 [json_name = "proofHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ibc.core.client.v1.Height, com.ibc.core.client.v1.Height.Builder, com.ibc.core.client.v1.HeightOrBuilder> 
        getProofHeightFieldBuilder() {
      if (proofHeightBuilder_ == null) {
        proofHeightBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ibc.core.client.v1.Height, com.ibc.core.client.v1.Height.Builder, com.ibc.core.client.v1.HeightOrBuilder>(
                getProofHeight(),
                getParentForChildren(),
                isClean());
        proofHeight_ = null;
      }
      return proofHeightBuilder_;
    }

    private java.lang.Object signer_ = "";
    /**
     * <code>string signer = 5 [json_name = "signer"];</code>
     * @return The signer.
     */
    public java.lang.String getSigner() {
      java.lang.Object ref = signer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        signer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string signer = 5 [json_name = "signer"];</code>
     * @return The bytes for signer.
     */
    public com.google.protobuf.ByteString
        getSignerBytes() {
      java.lang.Object ref = signer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        signer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string signer = 5 [json_name = "signer"];</code>
     * @param value The signer to set.
     * @return This builder for chaining.
     */
    public Builder setSigner(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      signer_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string signer = 5 [json_name = "signer"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSigner() {
      signer_ = getDefaultInstance().getSigner();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string signer = 5 [json_name = "signer"];</code>
     * @param value The bytes for signer to set.
     * @return This builder for chaining.
     */
    public Builder setSignerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      signer_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:ibc.core.channel.v1.MsgChannelOpenConfirm)
  }

  // @@protoc_insertion_point(class_scope:ibc.core.channel.v1.MsgChannelOpenConfirm)
  private static final com.ibc.core.channel.v1.MsgChannelOpenConfirm DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.core.channel.v1.MsgChannelOpenConfirm();
  }

  public static com.ibc.core.channel.v1.MsgChannelOpenConfirm getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgChannelOpenConfirm>
      PARSER = new com.google.protobuf.AbstractParser<MsgChannelOpenConfirm>() {
    @java.lang.Override
    public MsgChannelOpenConfirm parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgChannelOpenConfirm> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgChannelOpenConfirm> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.core.channel.v1.MsgChannelOpenConfirm getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

