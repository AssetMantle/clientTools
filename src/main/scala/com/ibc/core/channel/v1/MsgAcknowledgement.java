// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/channel/v1/tx.proto

package com.ibc.core.channel.v1;

/**
 * <pre>
 * MsgAcknowledgement receives incoming IBC acknowledgement
 * </pre>
 *
 * Protobuf type {@code ibc.core.channel.v1.MsgAcknowledgement}
 */
public final class MsgAcknowledgement extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.core.channel.v1.MsgAcknowledgement)
    MsgAcknowledgementOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgAcknowledgement.newBuilder() to construct.
  private MsgAcknowledgement(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgAcknowledgement() {
    acknowledgement_ = com.google.protobuf.ByteString.EMPTY;
    proofAcked_ = com.google.protobuf.ByteString.EMPTY;
    signer_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgAcknowledgement();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.core.channel.v1.TxProto.internal_static_ibc_core_channel_v1_MsgAcknowledgement_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.core.channel.v1.TxProto.internal_static_ibc_core_channel_v1_MsgAcknowledgement_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.core.channel.v1.MsgAcknowledgement.class, com.ibc.core.channel.v1.MsgAcknowledgement.Builder.class);
  }

  public static final int PACKET_FIELD_NUMBER = 1;
  private com.ibc.core.channel.v1.Packet packet_;
  /**
   * <code>.ibc.core.channel.v1.Packet packet = 1 [json_name = "packet", (.gogoproto.nullable) = false];</code>
   * @return Whether the packet field is set.
   */
  @java.lang.Override
  public boolean hasPacket() {
    return packet_ != null;
  }
  /**
   * <code>.ibc.core.channel.v1.Packet packet = 1 [json_name = "packet", (.gogoproto.nullable) = false];</code>
   * @return The packet.
   */
  @java.lang.Override
  public com.ibc.core.channel.v1.Packet getPacket() {
    return packet_ == null ? com.ibc.core.channel.v1.Packet.getDefaultInstance() : packet_;
  }
  /**
   * <code>.ibc.core.channel.v1.Packet packet = 1 [json_name = "packet", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.ibc.core.channel.v1.PacketOrBuilder getPacketOrBuilder() {
    return packet_ == null ? com.ibc.core.channel.v1.Packet.getDefaultInstance() : packet_;
  }

  public static final int ACKNOWLEDGEMENT_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString acknowledgement_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes acknowledgement = 2 [json_name = "acknowledgement"];</code>
   * @return The acknowledgement.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAcknowledgement() {
    return acknowledgement_;
  }

  public static final int PROOF_ACKED_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString proofAcked_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes proof_acked = 3 [json_name = "proofAcked", (.gogoproto.moretags) = "yaml:&#92;"proof_acked&#92;""];</code>
   * @return The proofAcked.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProofAcked() {
    return proofAcked_;
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
    if (packet_ != null) {
      output.writeMessage(1, getPacket());
    }
    if (!acknowledgement_.isEmpty()) {
      output.writeBytes(2, acknowledgement_);
    }
    if (!proofAcked_.isEmpty()) {
      output.writeBytes(3, proofAcked_);
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
    if (packet_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPacket());
    }
    if (!acknowledgement_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, acknowledgement_);
    }
    if (!proofAcked_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, proofAcked_);
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
    if (!(obj instanceof com.ibc.core.channel.v1.MsgAcknowledgement)) {
      return super.equals(obj);
    }
    com.ibc.core.channel.v1.MsgAcknowledgement other = (com.ibc.core.channel.v1.MsgAcknowledgement) obj;

    if (hasPacket() != other.hasPacket()) return false;
    if (hasPacket()) {
      if (!getPacket()
          .equals(other.getPacket())) return false;
    }
    if (!getAcknowledgement()
        .equals(other.getAcknowledgement())) return false;
    if (!getProofAcked()
        .equals(other.getProofAcked())) return false;
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
    if (hasPacket()) {
      hash = (37 * hash) + PACKET_FIELD_NUMBER;
      hash = (53 * hash) + getPacket().hashCode();
    }
    hash = (37 * hash) + ACKNOWLEDGEMENT_FIELD_NUMBER;
    hash = (53 * hash) + getAcknowledgement().hashCode();
    hash = (37 * hash) + PROOF_ACKED_FIELD_NUMBER;
    hash = (53 * hash) + getProofAcked().hashCode();
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

  public static com.ibc.core.channel.v1.MsgAcknowledgement parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.channel.v1.MsgAcknowledgement parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.channel.v1.MsgAcknowledgement parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.channel.v1.MsgAcknowledgement parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.channel.v1.MsgAcknowledgement parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.channel.v1.MsgAcknowledgement parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.channel.v1.MsgAcknowledgement parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.channel.v1.MsgAcknowledgement parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.core.channel.v1.MsgAcknowledgement parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ibc.core.channel.v1.MsgAcknowledgement parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.core.channel.v1.MsgAcknowledgement parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.channel.v1.MsgAcknowledgement parseFrom(
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
  public static Builder newBuilder(com.ibc.core.channel.v1.MsgAcknowledgement prototype) {
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
   * MsgAcknowledgement receives incoming IBC acknowledgement
   * </pre>
   *
   * Protobuf type {@code ibc.core.channel.v1.MsgAcknowledgement}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.core.channel.v1.MsgAcknowledgement)
      com.ibc.core.channel.v1.MsgAcknowledgementOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.core.channel.v1.TxProto.internal_static_ibc_core_channel_v1_MsgAcknowledgement_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.core.channel.v1.TxProto.internal_static_ibc_core_channel_v1_MsgAcknowledgement_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.core.channel.v1.MsgAcknowledgement.class, com.ibc.core.channel.v1.MsgAcknowledgement.Builder.class);
    }

    // Construct using com.ibc.core.channel.v1.MsgAcknowledgement.newBuilder()
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
      packet_ = null;
      if (packetBuilder_ != null) {
        packetBuilder_.dispose();
        packetBuilder_ = null;
      }
      acknowledgement_ = com.google.protobuf.ByteString.EMPTY;
      proofAcked_ = com.google.protobuf.ByteString.EMPTY;
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
      return com.ibc.core.channel.v1.TxProto.internal_static_ibc_core_channel_v1_MsgAcknowledgement_descriptor;
    }

    @java.lang.Override
    public com.ibc.core.channel.v1.MsgAcknowledgement getDefaultInstanceForType() {
      return com.ibc.core.channel.v1.MsgAcknowledgement.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.core.channel.v1.MsgAcknowledgement build() {
      com.ibc.core.channel.v1.MsgAcknowledgement result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.core.channel.v1.MsgAcknowledgement buildPartial() {
      com.ibc.core.channel.v1.MsgAcknowledgement result = new com.ibc.core.channel.v1.MsgAcknowledgement(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ibc.core.channel.v1.MsgAcknowledgement result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.packet_ = packetBuilder_ == null
            ? packet_
            : packetBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.acknowledgement_ = acknowledgement_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.proofAcked_ = proofAcked_;
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
      if (other instanceof com.ibc.core.channel.v1.MsgAcknowledgement) {
        return mergeFrom((com.ibc.core.channel.v1.MsgAcknowledgement)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.core.channel.v1.MsgAcknowledgement other) {
      if (other == com.ibc.core.channel.v1.MsgAcknowledgement.getDefaultInstance()) return this;
      if (other.hasPacket()) {
        mergePacket(other.getPacket());
      }
      if (other.getAcknowledgement() != com.google.protobuf.ByteString.EMPTY) {
        setAcknowledgement(other.getAcknowledgement());
      }
      if (other.getProofAcked() != com.google.protobuf.ByteString.EMPTY) {
        setProofAcked(other.getProofAcked());
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
              input.readMessage(
                  getPacketFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              acknowledgement_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              proofAcked_ = input.readBytes();
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

    private com.ibc.core.channel.v1.Packet packet_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ibc.core.channel.v1.Packet, com.ibc.core.channel.v1.Packet.Builder, com.ibc.core.channel.v1.PacketOrBuilder> packetBuilder_;
    /**
     * <code>.ibc.core.channel.v1.Packet packet = 1 [json_name = "packet", (.gogoproto.nullable) = false];</code>
     * @return Whether the packet field is set.
     */
    public boolean hasPacket() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.ibc.core.channel.v1.Packet packet = 1 [json_name = "packet", (.gogoproto.nullable) = false];</code>
     * @return The packet.
     */
    public com.ibc.core.channel.v1.Packet getPacket() {
      if (packetBuilder_ == null) {
        return packet_ == null ? com.ibc.core.channel.v1.Packet.getDefaultInstance() : packet_;
      } else {
        return packetBuilder_.getMessage();
      }
    }
    /**
     * <code>.ibc.core.channel.v1.Packet packet = 1 [json_name = "packet", (.gogoproto.nullable) = false];</code>
     */
    public Builder setPacket(com.ibc.core.channel.v1.Packet value) {
      if (packetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        packet_ = value;
      } else {
        packetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.core.channel.v1.Packet packet = 1 [json_name = "packet", (.gogoproto.nullable) = false];</code>
     */
    public Builder setPacket(
        com.ibc.core.channel.v1.Packet.Builder builderForValue) {
      if (packetBuilder_ == null) {
        packet_ = builderForValue.build();
      } else {
        packetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.core.channel.v1.Packet packet = 1 [json_name = "packet", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergePacket(com.ibc.core.channel.v1.Packet value) {
      if (packetBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          packet_ != null &&
          packet_ != com.ibc.core.channel.v1.Packet.getDefaultInstance()) {
          getPacketBuilder().mergeFrom(value);
        } else {
          packet_ = value;
        }
      } else {
        packetBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.core.channel.v1.Packet packet = 1 [json_name = "packet", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearPacket() {
      bitField0_ = (bitField0_ & ~0x00000001);
      packet_ = null;
      if (packetBuilder_ != null) {
        packetBuilder_.dispose();
        packetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.core.channel.v1.Packet packet = 1 [json_name = "packet", (.gogoproto.nullable) = false];</code>
     */
    public com.ibc.core.channel.v1.Packet.Builder getPacketBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPacketFieldBuilder().getBuilder();
    }
    /**
     * <code>.ibc.core.channel.v1.Packet packet = 1 [json_name = "packet", (.gogoproto.nullable) = false];</code>
     */
    public com.ibc.core.channel.v1.PacketOrBuilder getPacketOrBuilder() {
      if (packetBuilder_ != null) {
        return packetBuilder_.getMessageOrBuilder();
      } else {
        return packet_ == null ?
            com.ibc.core.channel.v1.Packet.getDefaultInstance() : packet_;
      }
    }
    /**
     * <code>.ibc.core.channel.v1.Packet packet = 1 [json_name = "packet", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ibc.core.channel.v1.Packet, com.ibc.core.channel.v1.Packet.Builder, com.ibc.core.channel.v1.PacketOrBuilder> 
        getPacketFieldBuilder() {
      if (packetBuilder_ == null) {
        packetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ibc.core.channel.v1.Packet, com.ibc.core.channel.v1.Packet.Builder, com.ibc.core.channel.v1.PacketOrBuilder>(
                getPacket(),
                getParentForChildren(),
                isClean());
        packet_ = null;
      }
      return packetBuilder_;
    }

    private com.google.protobuf.ByteString acknowledgement_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes acknowledgement = 2 [json_name = "acknowledgement"];</code>
     * @return The acknowledgement.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getAcknowledgement() {
      return acknowledgement_;
    }
    /**
     * <code>bytes acknowledgement = 2 [json_name = "acknowledgement"];</code>
     * @param value The acknowledgement to set.
     * @return This builder for chaining.
     */
    public Builder setAcknowledgement(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      acknowledgement_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bytes acknowledgement = 2 [json_name = "acknowledgement"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAcknowledgement() {
      bitField0_ = (bitField0_ & ~0x00000002);
      acknowledgement_ = getDefaultInstance().getAcknowledgement();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString proofAcked_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes proof_acked = 3 [json_name = "proofAcked", (.gogoproto.moretags) = "yaml:&#92;"proof_acked&#92;""];</code>
     * @return The proofAcked.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getProofAcked() {
      return proofAcked_;
    }
    /**
     * <code>bytes proof_acked = 3 [json_name = "proofAcked", (.gogoproto.moretags) = "yaml:&#92;"proof_acked&#92;""];</code>
     * @param value The proofAcked to set.
     * @return This builder for chaining.
     */
    public Builder setProofAcked(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      proofAcked_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bytes proof_acked = 3 [json_name = "proofAcked", (.gogoproto.moretags) = "yaml:&#92;"proof_acked&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearProofAcked() {
      bitField0_ = (bitField0_ & ~0x00000004);
      proofAcked_ = getDefaultInstance().getProofAcked();
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


    // @@protoc_insertion_point(builder_scope:ibc.core.channel.v1.MsgAcknowledgement)
  }

  // @@protoc_insertion_point(class_scope:ibc.core.channel.v1.MsgAcknowledgement)
  private static final com.ibc.core.channel.v1.MsgAcknowledgement DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.core.channel.v1.MsgAcknowledgement();
  }

  public static com.ibc.core.channel.v1.MsgAcknowledgement getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgAcknowledgement>
      PARSER = new com.google.protobuf.AbstractParser<MsgAcknowledgement>() {
    @java.lang.Override
    public MsgAcknowledgement parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgAcknowledgement> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgAcknowledgement> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.core.channel.v1.MsgAcknowledgement getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

