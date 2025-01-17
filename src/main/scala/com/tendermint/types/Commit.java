// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/types/types.proto

package com.tendermint.types;

/**
 * <pre>
 * Commit contains the evidence that a block was committed by a set of validators.
 * </pre>
 *
 * Protobuf type {@code tendermint.types.Commit}
 */
public final class Commit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tendermint.types.Commit)
    CommitOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Commit.newBuilder() to construct.
  private Commit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Commit() {
    signatures_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Commit();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tendermint.types.TypesProto.internal_static_tendermint_types_Commit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tendermint.types.TypesProto.internal_static_tendermint_types_Commit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tendermint.types.Commit.class, com.tendermint.types.Commit.Builder.class);
  }

  public static final int HEIGHT_FIELD_NUMBER = 1;
  private long height_ = 0L;
  /**
   * <code>int64 height = 1 [json_name = "height"];</code>
   * @return The height.
   */
  @java.lang.Override
  public long getHeight() {
    return height_;
  }

  public static final int ROUND_FIELD_NUMBER = 2;
  private int round_ = 0;
  /**
   * <code>int32 round = 2 [json_name = "round"];</code>
   * @return The round.
   */
  @java.lang.Override
  public int getRound() {
    return round_;
  }

  public static final int BLOCK_ID_FIELD_NUMBER = 3;
  private com.tendermint.types.BlockID blockId_;
  /**
   * <code>.tendermint.types.BlockID block_id = 3 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
   * @return Whether the blockId field is set.
   */
  @java.lang.Override
  public boolean hasBlockId() {
    return blockId_ != null;
  }
  /**
   * <code>.tendermint.types.BlockID block_id = 3 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
   * @return The blockId.
   */
  @java.lang.Override
  public com.tendermint.types.BlockID getBlockId() {
    return blockId_ == null ? com.tendermint.types.BlockID.getDefaultInstance() : blockId_;
  }
  /**
   * <code>.tendermint.types.BlockID block_id = 3 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
   */
  @java.lang.Override
  public com.tendermint.types.BlockIDOrBuilder getBlockIdOrBuilder() {
    return blockId_ == null ? com.tendermint.types.BlockID.getDefaultInstance() : blockId_;
  }

  public static final int SIGNATURES_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private java.util.List<com.tendermint.types.CommitSig> signatures_;
  /**
   * <code>repeated .tendermint.types.CommitSig signatures = 4 [json_name = "signatures", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.tendermint.types.CommitSig> getSignaturesList() {
    return signatures_;
  }
  /**
   * <code>repeated .tendermint.types.CommitSig signatures = 4 [json_name = "signatures", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tendermint.types.CommitSigOrBuilder> 
      getSignaturesOrBuilderList() {
    return signatures_;
  }
  /**
   * <code>repeated .tendermint.types.CommitSig signatures = 4 [json_name = "signatures", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getSignaturesCount() {
    return signatures_.size();
  }
  /**
   * <code>repeated .tendermint.types.CommitSig signatures = 4 [json_name = "signatures", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.tendermint.types.CommitSig getSignatures(int index) {
    return signatures_.get(index);
  }
  /**
   * <code>repeated .tendermint.types.CommitSig signatures = 4 [json_name = "signatures", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.tendermint.types.CommitSigOrBuilder getSignaturesOrBuilder(
      int index) {
    return signatures_.get(index);
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
    if (height_ != 0L) {
      output.writeInt64(1, height_);
    }
    if (round_ != 0) {
      output.writeInt32(2, round_);
    }
    if (blockId_ != null) {
      output.writeMessage(3, getBlockId());
    }
    for (int i = 0; i < signatures_.size(); i++) {
      output.writeMessage(4, signatures_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (height_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, height_);
    }
    if (round_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, round_);
    }
    if (blockId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getBlockId());
    }
    for (int i = 0; i < signatures_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, signatures_.get(i));
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
    if (!(obj instanceof com.tendermint.types.Commit)) {
      return super.equals(obj);
    }
    com.tendermint.types.Commit other = (com.tendermint.types.Commit) obj;

    if (getHeight()
        != other.getHeight()) return false;
    if (getRound()
        != other.getRound()) return false;
    if (hasBlockId() != other.hasBlockId()) return false;
    if (hasBlockId()) {
      if (!getBlockId()
          .equals(other.getBlockId())) return false;
    }
    if (!getSignaturesList()
        .equals(other.getSignaturesList())) return false;
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
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHeight());
    hash = (37 * hash) + ROUND_FIELD_NUMBER;
    hash = (53 * hash) + getRound();
    if (hasBlockId()) {
      hash = (37 * hash) + BLOCK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBlockId().hashCode();
    }
    if (getSignaturesCount() > 0) {
      hash = (37 * hash) + SIGNATURES_FIELD_NUMBER;
      hash = (53 * hash) + getSignaturesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tendermint.types.Commit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.types.Commit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.types.Commit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.types.Commit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.types.Commit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.types.Commit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.types.Commit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.types.Commit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tendermint.types.Commit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tendermint.types.Commit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tendermint.types.Commit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.types.Commit parseFrom(
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
  public static Builder newBuilder(com.tendermint.types.Commit prototype) {
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
   * Commit contains the evidence that a block was committed by a set of validators.
   * </pre>
   *
   * Protobuf type {@code tendermint.types.Commit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tendermint.types.Commit)
      com.tendermint.types.CommitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tendermint.types.TypesProto.internal_static_tendermint_types_Commit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tendermint.types.TypesProto.internal_static_tendermint_types_Commit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tendermint.types.Commit.class, com.tendermint.types.Commit.Builder.class);
    }

    // Construct using com.tendermint.types.Commit.newBuilder()
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
      height_ = 0L;
      round_ = 0;
      blockId_ = null;
      if (blockIdBuilder_ != null) {
        blockIdBuilder_.dispose();
        blockIdBuilder_ = null;
      }
      if (signaturesBuilder_ == null) {
        signatures_ = java.util.Collections.emptyList();
      } else {
        signatures_ = null;
        signaturesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tendermint.types.TypesProto.internal_static_tendermint_types_Commit_descriptor;
    }

    @java.lang.Override
    public com.tendermint.types.Commit getDefaultInstanceForType() {
      return com.tendermint.types.Commit.getDefaultInstance();
    }

    @java.lang.Override
    public com.tendermint.types.Commit build() {
      com.tendermint.types.Commit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tendermint.types.Commit buildPartial() {
      com.tendermint.types.Commit result = new com.tendermint.types.Commit(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tendermint.types.Commit result) {
      if (signaturesBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0)) {
          signatures_ = java.util.Collections.unmodifiableList(signatures_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.signatures_ = signatures_;
      } else {
        result.signatures_ = signaturesBuilder_.build();
      }
    }

    private void buildPartial0(com.tendermint.types.Commit result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.height_ = height_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.round_ = round_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.blockId_ = blockIdBuilder_ == null
            ? blockId_
            : blockIdBuilder_.build();
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
      if (other instanceof com.tendermint.types.Commit) {
        return mergeFrom((com.tendermint.types.Commit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tendermint.types.Commit other) {
      if (other == com.tendermint.types.Commit.getDefaultInstance()) return this;
      if (other.getHeight() != 0L) {
        setHeight(other.getHeight());
      }
      if (other.getRound() != 0) {
        setRound(other.getRound());
      }
      if (other.hasBlockId()) {
        mergeBlockId(other.getBlockId());
      }
      if (signaturesBuilder_ == null) {
        if (!other.signatures_.isEmpty()) {
          if (signatures_.isEmpty()) {
            signatures_ = other.signatures_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureSignaturesIsMutable();
            signatures_.addAll(other.signatures_);
          }
          onChanged();
        }
      } else {
        if (!other.signatures_.isEmpty()) {
          if (signaturesBuilder_.isEmpty()) {
            signaturesBuilder_.dispose();
            signaturesBuilder_ = null;
            signatures_ = other.signatures_;
            bitField0_ = (bitField0_ & ~0x00000008);
            signaturesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSignaturesFieldBuilder() : null;
          } else {
            signaturesBuilder_.addAllMessages(other.signatures_);
          }
        }
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
              height_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              round_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getBlockIdFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              com.tendermint.types.CommitSig m =
                  input.readMessage(
                      com.tendermint.types.CommitSig.parser(),
                      extensionRegistry);
              if (signaturesBuilder_ == null) {
                ensureSignaturesIsMutable();
                signatures_.add(m);
              } else {
                signaturesBuilder_.addMessage(m);
              }
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

    private long height_ ;
    /**
     * <code>int64 height = 1 [json_name = "height"];</code>
     * @return The height.
     */
    @java.lang.Override
    public long getHeight() {
      return height_;
    }
    /**
     * <code>int64 height = 1 [json_name = "height"];</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(long value) {

      height_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 height = 1 [json_name = "height"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      bitField0_ = (bitField0_ & ~0x00000001);
      height_ = 0L;
      onChanged();
      return this;
    }

    private int round_ ;
    /**
     * <code>int32 round = 2 [json_name = "round"];</code>
     * @return The round.
     */
    @java.lang.Override
    public int getRound() {
      return round_;
    }
    /**
     * <code>int32 round = 2 [json_name = "round"];</code>
     * @param value The round to set.
     * @return This builder for chaining.
     */
    public Builder setRound(int value) {

      round_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 round = 2 [json_name = "round"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRound() {
      bitField0_ = (bitField0_ & ~0x00000002);
      round_ = 0;
      onChanged();
      return this;
    }

    private com.tendermint.types.BlockID blockId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.types.BlockID, com.tendermint.types.BlockID.Builder, com.tendermint.types.BlockIDOrBuilder> blockIdBuilder_;
    /**
     * <code>.tendermint.types.BlockID block_id = 3 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     * @return Whether the blockId field is set.
     */
    public boolean hasBlockId() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.tendermint.types.BlockID block_id = 3 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
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
     * <code>.tendermint.types.BlockID block_id = 3 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
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
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.BlockID block_id = 3 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     */
    public Builder setBlockId(
        com.tendermint.types.BlockID.Builder builderForValue) {
      if (blockIdBuilder_ == null) {
        blockId_ = builderForValue.build();
      } else {
        blockIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.BlockID block_id = 3 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     */
    public Builder mergeBlockId(com.tendermint.types.BlockID value) {
      if (blockIdBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          blockId_ != null &&
          blockId_ != com.tendermint.types.BlockID.getDefaultInstance()) {
          getBlockIdBuilder().mergeFrom(value);
        } else {
          blockId_ = value;
        }
      } else {
        blockIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.BlockID block_id = 3 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     */
    public Builder clearBlockId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      blockId_ = null;
      if (blockIdBuilder_ != null) {
        blockIdBuilder_.dispose();
        blockIdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.BlockID block_id = 3 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     */
    public com.tendermint.types.BlockID.Builder getBlockIdBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getBlockIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.tendermint.types.BlockID block_id = 3 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
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
     * <code>.tendermint.types.BlockID block_id = 3 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
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

    private java.util.List<com.tendermint.types.CommitSig> signatures_ =
      java.util.Collections.emptyList();
    private void ensureSignaturesIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        signatures_ = new java.util.ArrayList<com.tendermint.types.CommitSig>(signatures_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tendermint.types.CommitSig, com.tendermint.types.CommitSig.Builder, com.tendermint.types.CommitSigOrBuilder> signaturesBuilder_;

    /**
     * <code>repeated .tendermint.types.CommitSig signatures = 4 [json_name = "signatures", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.tendermint.types.CommitSig> getSignaturesList() {
      if (signaturesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(signatures_);
      } else {
        return signaturesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tendermint.types.CommitSig signatures = 4 [json_name = "signatures", (.gogoproto.nullable) = false];</code>
     */
    public int getSignaturesCount() {
      if (signaturesBuilder_ == null) {
        return signatures_.size();
      } else {
        return signaturesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tendermint.types.CommitSig signatures = 4 [json_name = "signatures", (.gogoproto.nullable) = false];</code>
     */
    public com.tendermint.types.CommitSig getSignatures(int index) {
      if (signaturesBuilder_ == null) {
        return signatures_.get(index);
      } else {
        return signaturesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tendermint.types.CommitSig signatures = 4 [json_name = "signatures", (.gogoproto.nullable) = false];</code>
     */
    public Builder setSignatures(
        int index, com.tendermint.types.CommitSig value) {
      if (signaturesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSignaturesIsMutable();
        signatures_.set(index, value);
        onChanged();
      } else {
        signaturesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tendermint.types.CommitSig signatures = 4 [json_name = "signatures", (.gogoproto.nullable) = false];</code>
     */
    public Builder setSignatures(
        int index, com.tendermint.types.CommitSig.Builder builderForValue) {
      if (signaturesBuilder_ == null) {
        ensureSignaturesIsMutable();
        signatures_.set(index, builderForValue.build());
        onChanged();
      } else {
        signaturesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tendermint.types.CommitSig signatures = 4 [json_name = "signatures", (.gogoproto.nullable) = false];</code>
     */
    public Builder addSignatures(com.tendermint.types.CommitSig value) {
      if (signaturesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSignaturesIsMutable();
        signatures_.add(value);
        onChanged();
      } else {
        signaturesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tendermint.types.CommitSig signatures = 4 [json_name = "signatures", (.gogoproto.nullable) = false];</code>
     */
    public Builder addSignatures(
        int index, com.tendermint.types.CommitSig value) {
      if (signaturesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSignaturesIsMutable();
        signatures_.add(index, value);
        onChanged();
      } else {
        signaturesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tendermint.types.CommitSig signatures = 4 [json_name = "signatures", (.gogoproto.nullable) = false];</code>
     */
    public Builder addSignatures(
        com.tendermint.types.CommitSig.Builder builderForValue) {
      if (signaturesBuilder_ == null) {
        ensureSignaturesIsMutable();
        signatures_.add(builderForValue.build());
        onChanged();
      } else {
        signaturesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tendermint.types.CommitSig signatures = 4 [json_name = "signatures", (.gogoproto.nullable) = false];</code>
     */
    public Builder addSignatures(
        int index, com.tendermint.types.CommitSig.Builder builderForValue) {
      if (signaturesBuilder_ == null) {
        ensureSignaturesIsMutable();
        signatures_.add(index, builderForValue.build());
        onChanged();
      } else {
        signaturesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tendermint.types.CommitSig signatures = 4 [json_name = "signatures", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllSignatures(
        java.lang.Iterable<? extends com.tendermint.types.CommitSig> values) {
      if (signaturesBuilder_ == null) {
        ensureSignaturesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, signatures_);
        onChanged();
      } else {
        signaturesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tendermint.types.CommitSig signatures = 4 [json_name = "signatures", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearSignatures() {
      if (signaturesBuilder_ == null) {
        signatures_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        signaturesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tendermint.types.CommitSig signatures = 4 [json_name = "signatures", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeSignatures(int index) {
      if (signaturesBuilder_ == null) {
        ensureSignaturesIsMutable();
        signatures_.remove(index);
        onChanged();
      } else {
        signaturesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tendermint.types.CommitSig signatures = 4 [json_name = "signatures", (.gogoproto.nullable) = false];</code>
     */
    public com.tendermint.types.CommitSig.Builder getSignaturesBuilder(
        int index) {
      return getSignaturesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tendermint.types.CommitSig signatures = 4 [json_name = "signatures", (.gogoproto.nullable) = false];</code>
     */
    public com.tendermint.types.CommitSigOrBuilder getSignaturesOrBuilder(
        int index) {
      if (signaturesBuilder_ == null) {
        return signatures_.get(index);  } else {
        return signaturesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tendermint.types.CommitSig signatures = 4 [json_name = "signatures", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.tendermint.types.CommitSigOrBuilder> 
         getSignaturesOrBuilderList() {
      if (signaturesBuilder_ != null) {
        return signaturesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(signatures_);
      }
    }
    /**
     * <code>repeated .tendermint.types.CommitSig signatures = 4 [json_name = "signatures", (.gogoproto.nullable) = false];</code>
     */
    public com.tendermint.types.CommitSig.Builder addSignaturesBuilder() {
      return getSignaturesFieldBuilder().addBuilder(
          com.tendermint.types.CommitSig.getDefaultInstance());
    }
    /**
     * <code>repeated .tendermint.types.CommitSig signatures = 4 [json_name = "signatures", (.gogoproto.nullable) = false];</code>
     */
    public com.tendermint.types.CommitSig.Builder addSignaturesBuilder(
        int index) {
      return getSignaturesFieldBuilder().addBuilder(
          index, com.tendermint.types.CommitSig.getDefaultInstance());
    }
    /**
     * <code>repeated .tendermint.types.CommitSig signatures = 4 [json_name = "signatures", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.tendermint.types.CommitSig.Builder> 
         getSignaturesBuilderList() {
      return getSignaturesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tendermint.types.CommitSig, com.tendermint.types.CommitSig.Builder, com.tendermint.types.CommitSigOrBuilder> 
        getSignaturesFieldBuilder() {
      if (signaturesBuilder_ == null) {
        signaturesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tendermint.types.CommitSig, com.tendermint.types.CommitSig.Builder, com.tendermint.types.CommitSigOrBuilder>(
                signatures_,
                ((bitField0_ & 0x00000008) != 0),
                getParentForChildren(),
                isClean());
        signatures_ = null;
      }
      return signaturesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tendermint.types.Commit)
  }

  // @@protoc_insertion_point(class_scope:tendermint.types.Commit)
  private static final com.tendermint.types.Commit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tendermint.types.Commit();
  }

  public static com.tendermint.types.Commit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Commit>
      PARSER = new com.google.protobuf.AbstractParser<Commit>() {
    @java.lang.Override
    public Commit parsePartialFrom(
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

  public static com.google.protobuf.Parser<Commit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Commit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tendermint.types.Commit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

