// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/types/types.proto

package com.tendermint.types;

/**
 * Protobuf type {@code tendermint.types.Proposal}
 */
public final class Proposal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tendermint.types.Proposal)
    ProposalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Proposal.newBuilder() to construct.
  private Proposal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Proposal() {
    type_ = 0;
    signature_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Proposal();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tendermint.types.TypesProto.internal_static_tendermint_types_Proposal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tendermint.types.TypesProto.internal_static_tendermint_types_Proposal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tendermint.types.Proposal.class, com.tendermint.types.Proposal.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <code>.tendermint.types.SignedMsgType type = 1 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.tendermint.types.SignedMsgType type = 1 [json_name = "type"];</code>
   * @return The type.
   */
  @java.lang.Override public com.tendermint.types.SignedMsgType getType() {
    com.tendermint.types.SignedMsgType result = com.tendermint.types.SignedMsgType.forNumber(type_);
    return result == null ? com.tendermint.types.SignedMsgType.UNRECOGNIZED : result;
  }

  public static final int HEIGHT_FIELD_NUMBER = 2;
  private long height_ = 0L;
  /**
   * <code>int64 height = 2 [json_name = "height"];</code>
   * @return The height.
   */
  @java.lang.Override
  public long getHeight() {
    return height_;
  }

  public static final int ROUND_FIELD_NUMBER = 3;
  private int round_ = 0;
  /**
   * <code>int32 round = 3 [json_name = "round"];</code>
   * @return The round.
   */
  @java.lang.Override
  public int getRound() {
    return round_;
  }

  public static final int POL_ROUND_FIELD_NUMBER = 4;
  private int polRound_ = 0;
  /**
   * <code>int32 pol_round = 4 [json_name = "polRound"];</code>
   * @return The polRound.
   */
  @java.lang.Override
  public int getPolRound() {
    return polRound_;
  }

  public static final int BLOCK_ID_FIELD_NUMBER = 5;
  private com.tendermint.types.BlockID blockId_;
  /**
   * <code>.tendermint.types.BlockID block_id = 5 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
   * @return Whether the blockId field is set.
   */
  @java.lang.Override
  public boolean hasBlockId() {
    return blockId_ != null;
  }
  /**
   * <code>.tendermint.types.BlockID block_id = 5 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
   * @return The blockId.
   */
  @java.lang.Override
  public com.tendermint.types.BlockID getBlockId() {
    return blockId_ == null ? com.tendermint.types.BlockID.getDefaultInstance() : blockId_;
  }
  /**
   * <code>.tendermint.types.BlockID block_id = 5 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
   */
  @java.lang.Override
  public com.tendermint.types.BlockIDOrBuilder getBlockIdOrBuilder() {
    return blockId_ == null ? com.tendermint.types.BlockID.getDefaultInstance() : blockId_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 6;
  private com.google.protobuf.Timestamp timestamp_;
  /**
   * <code>.google.protobuf.Timestamp timestamp = 6 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the timestamp field is set.
   */
  @java.lang.Override
  public boolean hasTimestamp() {
    return timestamp_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp timestamp = 6 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getTimestamp() {
    return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
  }
  /**
   * <code>.google.protobuf.Timestamp timestamp = 6 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder() {
    return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
  }

  public static final int SIGNATURE_FIELD_NUMBER = 7;
  private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes signature = 7 [json_name = "signature"];</code>
   * @return The signature.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSignature() {
    return signature_;
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
    if (type_ != com.tendermint.types.SignedMsgType.SIGNED_MSG_TYPE_UNKNOWN.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (height_ != 0L) {
      output.writeInt64(2, height_);
    }
    if (round_ != 0) {
      output.writeInt32(3, round_);
    }
    if (polRound_ != 0) {
      output.writeInt32(4, polRound_);
    }
    if (blockId_ != null) {
      output.writeMessage(5, getBlockId());
    }
    if (timestamp_ != null) {
      output.writeMessage(6, getTimestamp());
    }
    if (!signature_.isEmpty()) {
      output.writeBytes(7, signature_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.tendermint.types.SignedMsgType.SIGNED_MSG_TYPE_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (height_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, height_);
    }
    if (round_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, round_);
    }
    if (polRound_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, polRound_);
    }
    if (blockId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getBlockId());
    }
    if (timestamp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getTimestamp());
    }
    if (!signature_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(7, signature_);
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
    if (!(obj instanceof com.tendermint.types.Proposal)) {
      return super.equals(obj);
    }
    com.tendermint.types.Proposal other = (com.tendermint.types.Proposal) obj;

    if (type_ != other.type_) return false;
    if (getHeight()
        != other.getHeight()) return false;
    if (getRound()
        != other.getRound()) return false;
    if (getPolRound()
        != other.getPolRound()) return false;
    if (hasBlockId() != other.hasBlockId()) return false;
    if (hasBlockId()) {
      if (!getBlockId()
          .equals(other.getBlockId())) return false;
    }
    if (hasTimestamp() != other.hasTimestamp()) return false;
    if (hasTimestamp()) {
      if (!getTimestamp()
          .equals(other.getTimestamp())) return false;
    }
    if (!getSignature()
        .equals(other.getSignature())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHeight());
    hash = (37 * hash) + ROUND_FIELD_NUMBER;
    hash = (53 * hash) + getRound();
    hash = (37 * hash) + POL_ROUND_FIELD_NUMBER;
    hash = (53 * hash) + getPolRound();
    if (hasBlockId()) {
      hash = (37 * hash) + BLOCK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBlockId().hashCode();
    }
    if (hasTimestamp()) {
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp().hashCode();
    }
    hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getSignature().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tendermint.types.Proposal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.types.Proposal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.types.Proposal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.types.Proposal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.types.Proposal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.types.Proposal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.types.Proposal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.types.Proposal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tendermint.types.Proposal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tendermint.types.Proposal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tendermint.types.Proposal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.types.Proposal parseFrom(
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
  public static Builder newBuilder(com.tendermint.types.Proposal prototype) {
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
   * Protobuf type {@code tendermint.types.Proposal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tendermint.types.Proposal)
      com.tendermint.types.ProposalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tendermint.types.TypesProto.internal_static_tendermint_types_Proposal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tendermint.types.TypesProto.internal_static_tendermint_types_Proposal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tendermint.types.Proposal.class, com.tendermint.types.Proposal.Builder.class);
    }

    // Construct using com.tendermint.types.Proposal.newBuilder()
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
      type_ = 0;
      height_ = 0L;
      round_ = 0;
      polRound_ = 0;
      blockId_ = null;
      if (blockIdBuilder_ != null) {
        blockIdBuilder_.dispose();
        blockIdBuilder_ = null;
      }
      timestamp_ = null;
      if (timestampBuilder_ != null) {
        timestampBuilder_.dispose();
        timestampBuilder_ = null;
      }
      signature_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tendermint.types.TypesProto.internal_static_tendermint_types_Proposal_descriptor;
    }

    @java.lang.Override
    public com.tendermint.types.Proposal getDefaultInstanceForType() {
      return com.tendermint.types.Proposal.getDefaultInstance();
    }

    @java.lang.Override
    public com.tendermint.types.Proposal build() {
      com.tendermint.types.Proposal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tendermint.types.Proposal buildPartial() {
      com.tendermint.types.Proposal result = new com.tendermint.types.Proposal(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tendermint.types.Proposal result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.height_ = height_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.round_ = round_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.polRound_ = polRound_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.blockId_ = blockIdBuilder_ == null
            ? blockId_
            : blockIdBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.timestamp_ = timestampBuilder_ == null
            ? timestamp_
            : timestampBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.signature_ = signature_;
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
      if (other instanceof com.tendermint.types.Proposal) {
        return mergeFrom((com.tendermint.types.Proposal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tendermint.types.Proposal other) {
      if (other == com.tendermint.types.Proposal.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getHeight() != 0L) {
        setHeight(other.getHeight());
      }
      if (other.getRound() != 0) {
        setRound(other.getRound());
      }
      if (other.getPolRound() != 0) {
        setPolRound(other.getPolRound());
      }
      if (other.hasBlockId()) {
        mergeBlockId(other.getBlockId());
      }
      if (other.hasTimestamp()) {
        mergeTimestamp(other.getTimestamp());
      }
      if (other.getSignature() != com.google.protobuf.ByteString.EMPTY) {
        setSignature(other.getSignature());
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
            case 8: {
              type_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              height_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              round_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              polRound_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              input.readMessage(
                  getBlockIdFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 50: {
              input.readMessage(
                  getTimestampFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000020;
              break;
            } // case 50
            case 58: {
              signature_ = input.readBytes();
              bitField0_ |= 0x00000040;
              break;
            } // case 58
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

    private int type_ = 0;
    /**
     * <code>.tendermint.types.SignedMsgType type = 1 [json_name = "type"];</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.tendermint.types.SignedMsgType type = 1 [json_name = "type"];</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.SignedMsgType type = 1 [json_name = "type"];</code>
     * @return The type.
     */
    @java.lang.Override
    public com.tendermint.types.SignedMsgType getType() {
      com.tendermint.types.SignedMsgType result = com.tendermint.types.SignedMsgType.forNumber(type_);
      return result == null ? com.tendermint.types.SignedMsgType.UNRECOGNIZED : result;
    }
    /**
     * <code>.tendermint.types.SignedMsgType type = 1 [json_name = "type"];</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.tendermint.types.SignedMsgType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.SignedMsgType type = 1 [json_name = "type"];</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private long height_ ;
    /**
     * <code>int64 height = 2 [json_name = "height"];</code>
     * @return The height.
     */
    @java.lang.Override
    public long getHeight() {
      return height_;
    }
    /**
     * <code>int64 height = 2 [json_name = "height"];</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(long value) {

      height_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 height = 2 [json_name = "height"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      bitField0_ = (bitField0_ & ~0x00000002);
      height_ = 0L;
      onChanged();
      return this;
    }

    private int round_ ;
    /**
     * <code>int32 round = 3 [json_name = "round"];</code>
     * @return The round.
     */
    @java.lang.Override
    public int getRound() {
      return round_;
    }
    /**
     * <code>int32 round = 3 [json_name = "round"];</code>
     * @param value The round to set.
     * @return This builder for chaining.
     */
    public Builder setRound(int value) {

      round_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int32 round = 3 [json_name = "round"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRound() {
      bitField0_ = (bitField0_ & ~0x00000004);
      round_ = 0;
      onChanged();
      return this;
    }

    private int polRound_ ;
    /**
     * <code>int32 pol_round = 4 [json_name = "polRound"];</code>
     * @return The polRound.
     */
    @java.lang.Override
    public int getPolRound() {
      return polRound_;
    }
    /**
     * <code>int32 pol_round = 4 [json_name = "polRound"];</code>
     * @param value The polRound to set.
     * @return This builder for chaining.
     */
    public Builder setPolRound(int value) {

      polRound_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int32 pol_round = 4 [json_name = "polRound"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPolRound() {
      bitField0_ = (bitField0_ & ~0x00000008);
      polRound_ = 0;
      onChanged();
      return this;
    }

    private com.tendermint.types.BlockID blockId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.types.BlockID, com.tendermint.types.BlockID.Builder, com.tendermint.types.BlockIDOrBuilder> blockIdBuilder_;
    /**
     * <code>.tendermint.types.BlockID block_id = 5 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     * @return Whether the blockId field is set.
     */
    public boolean hasBlockId() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>.tendermint.types.BlockID block_id = 5 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     * @return The blockId.
     */
    public com.tendermint.types.BlockID getBlockId() {
      if (blockIdBuilder_ == null) {
        return blockId_ == null ? com.tendermint.types.BlockID.getDefaultInstance() : blockId_;
      } else {
        return blockIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.tendermint.types.BlockID block_id = 5 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     */
    public Builder setBlockId(com.tendermint.types.BlockID value) {
      if (blockIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        blockId_ = value;
      } else {
        blockIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.BlockID block_id = 5 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     */
    public Builder setBlockId(
        com.tendermint.types.BlockID.Builder builderForValue) {
      if (blockIdBuilder_ == null) {
        blockId_ = builderForValue.build();
      } else {
        blockIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.BlockID block_id = 5 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     */
    public Builder mergeBlockId(com.tendermint.types.BlockID value) {
      if (blockIdBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          blockId_ != null &&
          blockId_ != com.tendermint.types.BlockID.getDefaultInstance()) {
          getBlockIdBuilder().mergeFrom(value);
        } else {
          blockId_ = value;
        }
      } else {
        blockIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.BlockID block_id = 5 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     */
    public Builder clearBlockId() {
      bitField0_ = (bitField0_ & ~0x00000010);
      blockId_ = null;
      if (blockIdBuilder_ != null) {
        blockIdBuilder_.dispose();
        blockIdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.BlockID block_id = 5 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     */
    public com.tendermint.types.BlockID.Builder getBlockIdBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getBlockIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.tendermint.types.BlockID block_id = 5 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     */
    public com.tendermint.types.BlockIDOrBuilder getBlockIdOrBuilder() {
      if (blockIdBuilder_ != null) {
        return blockIdBuilder_.getMessageOrBuilder();
      } else {
        return blockId_ == null ?
            com.tendermint.types.BlockID.getDefaultInstance() : blockId_;
      }
    }
    /**
     * <code>.tendermint.types.BlockID block_id = 5 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.types.BlockID, com.tendermint.types.BlockID.Builder, com.tendermint.types.BlockIDOrBuilder> 
        getBlockIdFieldBuilder() {
      if (blockIdBuilder_ == null) {
        blockIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tendermint.types.BlockID, com.tendermint.types.BlockID.Builder, com.tendermint.types.BlockIDOrBuilder>(
                getBlockId(),
                getParentForChildren(),
                isClean());
        blockId_ = null;
      }
      return blockIdBuilder_;
    }

    private com.google.protobuf.Timestamp timestamp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timestampBuilder_;
    /**
     * <code>.google.protobuf.Timestamp timestamp = 6 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the timestamp field is set.
     */
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 6 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return The timestamp.
     */
    public com.google.protobuf.Timestamp getTimestamp() {
      if (timestampBuilder_ == null) {
        return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
      } else {
        return timestampBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 6 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder setTimestamp(com.google.protobuf.Timestamp value) {
      if (timestampBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timestamp_ = value;
      } else {
        timestampBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 6 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder setTimestamp(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timestampBuilder_ == null) {
        timestamp_ = builderForValue.build();
      } else {
        timestampBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 6 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder mergeTimestamp(com.google.protobuf.Timestamp value) {
      if (timestampBuilder_ == null) {
        if (((bitField0_ & 0x00000020) != 0) &&
          timestamp_ != null &&
          timestamp_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getTimestampBuilder().mergeFrom(value);
        } else {
          timestamp_ = value;
        }
      } else {
        timestampBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 6 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public Builder clearTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000020);
      timestamp_ = null;
      if (timestampBuilder_ != null) {
        timestampBuilder_.dispose();
        timestampBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 6 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimestampBuilder() {
      bitField0_ |= 0x00000020;
      onChanged();
      return getTimestampFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 6 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder() {
      if (timestampBuilder_ != null) {
        return timestampBuilder_.getMessageOrBuilder();
      } else {
        return timestamp_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 6 [json_name = "timestamp", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimestampFieldBuilder() {
      if (timestampBuilder_ == null) {
        timestampBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTimestamp(),
                getParentForChildren(),
                isClean());
        timestamp_ = null;
      }
      return timestampBuilder_;
    }

    private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes signature = 7 [json_name = "signature"];</code>
     * @return The signature.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSignature() {
      return signature_;
    }
    /**
     * <code>bytes signature = 7 [json_name = "signature"];</code>
     * @param value The signature to set.
     * @return This builder for chaining.
     */
    public Builder setSignature(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      signature_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <code>bytes signature = 7 [json_name = "signature"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSignature() {
      bitField0_ = (bitField0_ & ~0x00000040);
      signature_ = getDefaultInstance().getSignature();
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


    // @@protoc_insertion_point(builder_scope:tendermint.types.Proposal)
  }

  // @@protoc_insertion_point(class_scope:tendermint.types.Proposal)
  private static final com.tendermint.types.Proposal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tendermint.types.Proposal();
  }

  public static com.tendermint.types.Proposal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Proposal>
      PARSER = new com.google.protobuf.AbstractParser<Proposal>() {
    @java.lang.Override
    public Proposal parsePartialFrom(
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

  public static com.google.protobuf.Parser<Proposal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Proposal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tendermint.types.Proposal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

