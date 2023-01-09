// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/abci/types.proto

package com.tendermint.abci;

/**
 * <pre>
 * loads a snapshot chunk
 * </pre>
 *
 * Protobuf type {@code tendermint.abci.RequestLoadSnapshotChunk}
 */
public final class RequestLoadSnapshotChunk extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tendermint.abci.RequestLoadSnapshotChunk)
    RequestLoadSnapshotChunkOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RequestLoadSnapshotChunk.newBuilder() to construct.
  private RequestLoadSnapshotChunk(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RequestLoadSnapshotChunk() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RequestLoadSnapshotChunk();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tendermint.abci.TypesProto.internal_static_tendermint_abci_RequestLoadSnapshotChunk_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tendermint.abci.TypesProto.internal_static_tendermint_abci_RequestLoadSnapshotChunk_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tendermint.abci.RequestLoadSnapshotChunk.class, com.tendermint.abci.RequestLoadSnapshotChunk.Builder.class);
  }

  public static final int HEIGHT_FIELD_NUMBER = 1;
  private long height_ = 0L;
  /**
   * <code>uint64 height = 1 [json_name = "height"];</code>
   * @return The height.
   */
  @java.lang.Override
  public long getHeight() {
    return height_;
  }

  public static final int FORMAT_FIELD_NUMBER = 2;
  private int format_ = 0;
  /**
   * <code>uint32 format = 2 [json_name = "format"];</code>
   * @return The format.
   */
  @java.lang.Override
  public int getFormat() {
    return format_;
  }

  public static final int CHUNK_FIELD_NUMBER = 3;
  private int chunk_ = 0;
  /**
   * <code>uint32 chunk = 3 [json_name = "chunk"];</code>
   * @return The chunk.
   */
  @java.lang.Override
  public int getChunk() {
    return chunk_;
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
      output.writeUInt64(1, height_);
    }
    if (format_ != 0) {
      output.writeUInt32(2, format_);
    }
    if (chunk_ != 0) {
      output.writeUInt32(3, chunk_);
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
        .computeUInt64Size(1, height_);
    }
    if (format_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, format_);
    }
    if (chunk_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, chunk_);
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
    if (!(obj instanceof com.tendermint.abci.RequestLoadSnapshotChunk)) {
      return super.equals(obj);
    }
    com.tendermint.abci.RequestLoadSnapshotChunk other = (com.tendermint.abci.RequestLoadSnapshotChunk) obj;

    if (getHeight()
        != other.getHeight()) return false;
    if (getFormat()
        != other.getFormat()) return false;
    if (getChunk()
        != other.getChunk()) return false;
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
    hash = (37 * hash) + FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + getFormat();
    hash = (37 * hash) + CHUNK_FIELD_NUMBER;
    hash = (53 * hash) + getChunk();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tendermint.abci.RequestLoadSnapshotChunk parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.abci.RequestLoadSnapshotChunk parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.abci.RequestLoadSnapshotChunk parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.abci.RequestLoadSnapshotChunk parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.abci.RequestLoadSnapshotChunk parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.abci.RequestLoadSnapshotChunk parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.abci.RequestLoadSnapshotChunk parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.abci.RequestLoadSnapshotChunk parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tendermint.abci.RequestLoadSnapshotChunk parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tendermint.abci.RequestLoadSnapshotChunk parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tendermint.abci.RequestLoadSnapshotChunk parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.abci.RequestLoadSnapshotChunk parseFrom(
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
  public static Builder newBuilder(com.tendermint.abci.RequestLoadSnapshotChunk prototype) {
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
   * loads a snapshot chunk
   * </pre>
   *
   * Protobuf type {@code tendermint.abci.RequestLoadSnapshotChunk}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tendermint.abci.RequestLoadSnapshotChunk)
      com.tendermint.abci.RequestLoadSnapshotChunkOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tendermint.abci.TypesProto.internal_static_tendermint_abci_RequestLoadSnapshotChunk_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tendermint.abci.TypesProto.internal_static_tendermint_abci_RequestLoadSnapshotChunk_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tendermint.abci.RequestLoadSnapshotChunk.class, com.tendermint.abci.RequestLoadSnapshotChunk.Builder.class);
    }

    // Construct using com.tendermint.abci.RequestLoadSnapshotChunk.newBuilder()
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
      format_ = 0;
      chunk_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tendermint.abci.TypesProto.internal_static_tendermint_abci_RequestLoadSnapshotChunk_descriptor;
    }

    @java.lang.Override
    public com.tendermint.abci.RequestLoadSnapshotChunk getDefaultInstanceForType() {
      return com.tendermint.abci.RequestLoadSnapshotChunk.getDefaultInstance();
    }

    @java.lang.Override
    public com.tendermint.abci.RequestLoadSnapshotChunk build() {
      com.tendermint.abci.RequestLoadSnapshotChunk result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tendermint.abci.RequestLoadSnapshotChunk buildPartial() {
      com.tendermint.abci.RequestLoadSnapshotChunk result = new com.tendermint.abci.RequestLoadSnapshotChunk(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tendermint.abci.RequestLoadSnapshotChunk result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.height_ = height_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.format_ = format_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.chunk_ = chunk_;
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
      if (other instanceof com.tendermint.abci.RequestLoadSnapshotChunk) {
        return mergeFrom((com.tendermint.abci.RequestLoadSnapshotChunk)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tendermint.abci.RequestLoadSnapshotChunk other) {
      if (other == com.tendermint.abci.RequestLoadSnapshotChunk.getDefaultInstance()) return this;
      if (other.getHeight() != 0L) {
        setHeight(other.getHeight());
      }
      if (other.getFormat() != 0) {
        setFormat(other.getFormat());
      }
      if (other.getChunk() != 0) {
        setChunk(other.getChunk());
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
              height_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              format_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              chunk_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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
     * <code>uint64 height = 1 [json_name = "height"];</code>
     * @return The height.
     */
    @java.lang.Override
    public long getHeight() {
      return height_;
    }
    /**
     * <code>uint64 height = 1 [json_name = "height"];</code>
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
     * <code>uint64 height = 1 [json_name = "height"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      bitField0_ = (bitField0_ & ~0x00000001);
      height_ = 0L;
      onChanged();
      return this;
    }

    private int format_ ;
    /**
     * <code>uint32 format = 2 [json_name = "format"];</code>
     * @return The format.
     */
    @java.lang.Override
    public int getFormat() {
      return format_;
    }
    /**
     * <code>uint32 format = 2 [json_name = "format"];</code>
     * @param value The format to set.
     * @return This builder for chaining.
     */
    public Builder setFormat(int value) {

      format_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 format = 2 [json_name = "format"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFormat() {
      bitField0_ = (bitField0_ & ~0x00000002);
      format_ = 0;
      onChanged();
      return this;
    }

    private int chunk_ ;
    /**
     * <code>uint32 chunk = 3 [json_name = "chunk"];</code>
     * @return The chunk.
     */
    @java.lang.Override
    public int getChunk() {
      return chunk_;
    }
    /**
     * <code>uint32 chunk = 3 [json_name = "chunk"];</code>
     * @param value The chunk to set.
     * @return This builder for chaining.
     */
    public Builder setChunk(int value) {

      chunk_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 chunk = 3 [json_name = "chunk"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChunk() {
      bitField0_ = (bitField0_ & ~0x00000004);
      chunk_ = 0;
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


    // @@protoc_insertion_point(builder_scope:tendermint.abci.RequestLoadSnapshotChunk)
  }

  // @@protoc_insertion_point(class_scope:tendermint.abci.RequestLoadSnapshotChunk)
  private static final com.tendermint.abci.RequestLoadSnapshotChunk DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tendermint.abci.RequestLoadSnapshotChunk();
  }

  public static com.tendermint.abci.RequestLoadSnapshotChunk getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestLoadSnapshotChunk>
      PARSER = new com.google.protobuf.AbstractParser<RequestLoadSnapshotChunk>() {
    @java.lang.Override
    public RequestLoadSnapshotChunk parsePartialFrom(
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

  public static com.google.protobuf.Parser<RequestLoadSnapshotChunk> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RequestLoadSnapshotChunk> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tendermint.abci.RequestLoadSnapshotChunk getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
