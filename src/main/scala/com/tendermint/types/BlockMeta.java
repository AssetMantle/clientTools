// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/types/types.proto

package com.tendermint.types;

/**
 * Protobuf type {@code tendermint.types.BlockMeta}
 */
public final class BlockMeta extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tendermint.types.BlockMeta)
    BlockMetaOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BlockMeta.newBuilder() to construct.
  private BlockMeta(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlockMeta() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new BlockMeta();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return TypesProto.internal_static_tendermint_types_BlockMeta_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return TypesProto.internal_static_tendermint_types_BlockMeta_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            BlockMeta.class, Builder.class);
  }

  public static final int BLOCK_ID_FIELD_NUMBER = 1;
  private BlockID blockId_;
  /**
   * <code>.tendermint.types.BlockID block_id = 1 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
   * @return Whether the blockId field is set.
   */
  @Override
  public boolean hasBlockId() {
    return blockId_ != null;
  }
  /**
   * <code>.tendermint.types.BlockID block_id = 1 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
   * @return The blockId.
   */
  @Override
  public BlockID getBlockId() {
    return blockId_ == null ? BlockID.getDefaultInstance() : blockId_;
  }
  /**
   * <code>.tendermint.types.BlockID block_id = 1 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
   */
  @Override
  public BlockIDOrBuilder getBlockIdOrBuilder() {
    return blockId_ == null ? BlockID.getDefaultInstance() : blockId_;
  }

  public static final int BLOCK_SIZE_FIELD_NUMBER = 2;
  private long blockSize_ = 0L;
  /**
   * <code>int64 block_size = 2 [json_name = "blockSize"];</code>
   * @return The blockSize.
   */
  @Override
  public long getBlockSize() {
    return blockSize_;
  }

  public static final int HEADER_FIELD_NUMBER = 3;
  private Header header_;
  /**
   * <code>.tendermint.types.Header header = 3 [json_name = "header", (.gogoproto.nullable) = false];</code>
   * @return Whether the header field is set.
   */
  @Override
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <code>.tendermint.types.Header header = 3 [json_name = "header", (.gogoproto.nullable) = false];</code>
   * @return The header.
   */
  @Override
  public Header getHeader() {
    return header_ == null ? Header.getDefaultInstance() : header_;
  }
  /**
   * <code>.tendermint.types.Header header = 3 [json_name = "header", (.gogoproto.nullable) = false];</code>
   */
  @Override
  public HeaderOrBuilder getHeaderOrBuilder() {
    return header_ == null ? Header.getDefaultInstance() : header_;
  }

  public static final int NUM_TXS_FIELD_NUMBER = 4;
  private long numTxs_ = 0L;
  /**
   * <code>int64 num_txs = 4 [json_name = "numTxs"];</code>
   * @return The numTxs.
   */
  @Override
  public long getNumTxs() {
    return numTxs_;
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
    if (blockId_ != null) {
      output.writeMessage(1, getBlockId());
    }
    if (blockSize_ != 0L) {
      output.writeInt64(2, blockSize_);
    }
    if (header_ != null) {
      output.writeMessage(3, getHeader());
    }
    if (numTxs_ != 0L) {
      output.writeInt64(4, numTxs_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (blockId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBlockId());
    }
    if (blockSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, blockSize_);
    }
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getHeader());
    }
    if (numTxs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, numTxs_);
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
    if (!(obj instanceof BlockMeta)) {
      return super.equals(obj);
    }
    BlockMeta other = (BlockMeta) obj;

    if (hasBlockId() != other.hasBlockId()) return false;
    if (hasBlockId()) {
      if (!getBlockId()
          .equals(other.getBlockId())) return false;
    }
    if (getBlockSize()
        != other.getBlockSize()) return false;
    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (getNumTxs()
        != other.getNumTxs()) return false;
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
    if (hasBlockId()) {
      hash = (37 * hash) + BLOCK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBlockId().hashCode();
    }
    hash = (37 * hash) + BLOCK_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBlockSize());
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    hash = (37 * hash) + NUM_TXS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumTxs());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static BlockMeta parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BlockMeta parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BlockMeta parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BlockMeta parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BlockMeta parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BlockMeta parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BlockMeta parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BlockMeta parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static BlockMeta parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static BlockMeta parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static BlockMeta parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BlockMeta parseFrom(
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
  public static Builder newBuilder(BlockMeta prototype) {
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
   * Protobuf type {@code tendermint.types.BlockMeta}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tendermint.types.BlockMeta)
      BlockMetaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TypesProto.internal_static_tendermint_types_BlockMeta_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TypesProto.internal_static_tendermint_types_BlockMeta_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BlockMeta.class, Builder.class);
    }

    // Construct using com.tendermint.types.BlockMeta.newBuilder()
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
      blockId_ = null;
      if (blockIdBuilder_ != null) {
        blockIdBuilder_.dispose();
        blockIdBuilder_ = null;
      }
      blockSize_ = 0L;
      header_ = null;
      if (headerBuilder_ != null) {
        headerBuilder_.dispose();
        headerBuilder_ = null;
      }
      numTxs_ = 0L;
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return TypesProto.internal_static_tendermint_types_BlockMeta_descriptor;
    }

    @Override
    public BlockMeta getDefaultInstanceForType() {
      return BlockMeta.getDefaultInstance();
    }

    @Override
    public BlockMeta build() {
      BlockMeta result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public BlockMeta buildPartial() {
      BlockMeta result = new BlockMeta(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(BlockMeta result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.blockId_ = blockIdBuilder_ == null
            ? blockId_
            : blockIdBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.blockSize_ = blockSize_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.header_ = headerBuilder_ == null
            ? header_
            : headerBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.numTxs_ = numTxs_;
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
      if (other instanceof BlockMeta) {
        return mergeFrom((BlockMeta)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(BlockMeta other) {
      if (other == BlockMeta.getDefaultInstance()) return this;
      if (other.hasBlockId()) {
        mergeBlockId(other.getBlockId());
      }
      if (other.getBlockSize() != 0L) {
        setBlockSize(other.getBlockSize());
      }
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.getNumTxs() != 0L) {
        setNumTxs(other.getNumTxs());
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
                  getBlockIdFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              blockSize_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getHeaderFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              numTxs_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private BlockID blockId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        BlockID, BlockID.Builder, BlockIDOrBuilder> blockIdBuilder_;
    /**
     * <code>.tendermint.types.BlockID block_id = 1 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     * @return Whether the blockId field is set.
     */
    public boolean hasBlockId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.tendermint.types.BlockID block_id = 1 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     * @return The blockId.
     */
    public BlockID getBlockId() {
      if (blockIdBuilder_ == null) {
        return blockId_ == null ? BlockID.getDefaultInstance() : blockId_;
      } else {
        return blockIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.tendermint.types.BlockID block_id = 1 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     */
    public Builder setBlockId(BlockID value) {
      if (blockIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        blockId_ = value;
      } else {
        blockIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.BlockID block_id = 1 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     */
    public Builder setBlockId(
        BlockID.Builder builderForValue) {
      if (blockIdBuilder_ == null) {
        blockId_ = builderForValue.build();
      } else {
        blockIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.BlockID block_id = 1 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     */
    public Builder mergeBlockId(BlockID value) {
      if (blockIdBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          blockId_ != null &&
          blockId_ != BlockID.getDefaultInstance()) {
          getBlockIdBuilder().mergeFrom(value);
        } else {
          blockId_ = value;
        }
      } else {
        blockIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.BlockID block_id = 1 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     */
    public Builder clearBlockId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      blockId_ = null;
      if (blockIdBuilder_ != null) {
        blockIdBuilder_.dispose();
        blockIdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.BlockID block_id = 1 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     */
    public BlockID.Builder getBlockIdBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBlockIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.tendermint.types.BlockID block_id = 1 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     */
    public BlockIDOrBuilder getBlockIdOrBuilder() {
      if (blockIdBuilder_ != null) {
        return blockIdBuilder_.getMessageOrBuilder();
      } else {
        return blockId_ == null ?
            BlockID.getDefaultInstance() : blockId_;
      }
    }
    /**
     * <code>.tendermint.types.BlockID block_id = 1 [json_name = "blockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BlockID"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        BlockID, BlockID.Builder, BlockIDOrBuilder>
        getBlockIdFieldBuilder() {
      if (blockIdBuilder_ == null) {
        blockIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            BlockID, BlockID.Builder, BlockIDOrBuilder>(
                getBlockId(),
                getParentForChildren(),
                isClean());
        blockId_ = null;
      }
      return blockIdBuilder_;
    }

    private long blockSize_ ;
    /**
     * <code>int64 block_size = 2 [json_name = "blockSize"];</code>
     * @return The blockSize.
     */
    @Override
    public long getBlockSize() {
      return blockSize_;
    }
    /**
     * <code>int64 block_size = 2 [json_name = "blockSize"];</code>
     * @param value The blockSize to set.
     * @return This builder for chaining.
     */
    public Builder setBlockSize(long value) {

      blockSize_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 block_size = 2 [json_name = "blockSize"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBlockSize() {
      bitField0_ = (bitField0_ & ~0x00000002);
      blockSize_ = 0L;
      onChanged();
      return this;
    }

    private Header header_;
    private com.google.protobuf.SingleFieldBuilderV3<
        Header, Header.Builder, HeaderOrBuilder> headerBuilder_;
    /**
     * <code>.tendermint.types.Header header = 3 [json_name = "header", (.gogoproto.nullable) = false];</code>
     * @return Whether the header field is set.
     */
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.tendermint.types.Header header = 3 [json_name = "header", (.gogoproto.nullable) = false];</code>
     * @return The header.
     */
    public Header getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? Header.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <code>.tendermint.types.Header header = 3 [json_name = "header", (.gogoproto.nullable) = false];</code>
     */
    public Builder setHeader(Header value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
      } else {
        headerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.Header header = 3 [json_name = "header", (.gogoproto.nullable) = false];</code>
     */
    public Builder setHeader(
        Header.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.Header header = 3 [json_name = "header", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeHeader(Header value) {
      if (headerBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          header_ != null &&
          header_ != Header.getDefaultInstance()) {
          getHeaderBuilder().mergeFrom(value);
        } else {
          header_ = value;
        }
      } else {
        headerBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.Header header = 3 [json_name = "header", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearHeader() {
      bitField0_ = (bitField0_ & ~0x00000004);
      header_ = null;
      if (headerBuilder_ != null) {
        headerBuilder_.dispose();
        headerBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.types.Header header = 3 [json_name = "header", (.gogoproto.nullable) = false];</code>
     */
    public Header.Builder getHeaderBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <code>.tendermint.types.Header header = 3 [json_name = "header", (.gogoproto.nullable) = false];</code>
     */
    public HeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            Header.getDefaultInstance() : header_;
      }
    }
    /**
     * <code>.tendermint.types.Header header = 3 [json_name = "header", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        Header, Header.Builder, HeaderOrBuilder>
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            Header, Header.Builder, HeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private long numTxs_ ;
    /**
     * <code>int64 num_txs = 4 [json_name = "numTxs"];</code>
     * @return The numTxs.
     */
    @Override
    public long getNumTxs() {
      return numTxs_;
    }
    /**
     * <code>int64 num_txs = 4 [json_name = "numTxs"];</code>
     * @param value The numTxs to set.
     * @return This builder for chaining.
     */
    public Builder setNumTxs(long value) {

      numTxs_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int64 num_txs = 4 [json_name = "numTxs"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNumTxs() {
      bitField0_ = (bitField0_ & ~0x00000008);
      numTxs_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:tendermint.types.BlockMeta)
  }

  // @@protoc_insertion_point(class_scope:tendermint.types.BlockMeta)
  private static final BlockMeta DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BlockMeta();
  }

  public static BlockMeta getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlockMeta>
      PARSER = new com.google.protobuf.AbstractParser<BlockMeta>() {
    @Override
    public BlockMeta parsePartialFrom(
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

  public static com.google.protobuf.Parser<BlockMeta> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<BlockMeta> getParserForType() {
    return PARSER;
  }

  @Override
  public BlockMeta getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

