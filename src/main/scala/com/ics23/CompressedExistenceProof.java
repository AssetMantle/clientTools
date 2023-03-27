// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: confio/proofs.proto

package com.ics23;

/**
 * Protobuf type {@code ics23.CompressedExistenceProof}
 */
public final class CompressedExistenceProof extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ics23.CompressedExistenceProof)
    CompressedExistenceProofOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompressedExistenceProof.newBuilder() to construct.
  private CompressedExistenceProof(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompressedExistenceProof() {
    key_ = com.google.protobuf.ByteString.EMPTY;
    value_ = com.google.protobuf.ByteString.EMPTY;
    path_ = emptyIntList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new CompressedExistenceProof();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ProofsProto.internal_static_ics23_CompressedExistenceProof_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ProofsProto.internal_static_ics23_CompressedExistenceProof_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            CompressedExistenceProof.class, Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes key = 1 [json_name = "key"];</code>
   * @return The key.
   */
  @Override
  public com.google.protobuf.ByteString getKey() {
    return key_;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes value = 2 [json_name = "value"];</code>
   * @return The value.
   */
  @Override
  public com.google.protobuf.ByteString getValue() {
    return value_;
  }

  public static final int LEAF_FIELD_NUMBER = 3;
  private LeafOp leaf_;
  /**
   * <code>.ics23.LeafOp leaf = 3 [json_name = "leaf"];</code>
   * @return Whether the leaf field is set.
   */
  @Override
  public boolean hasLeaf() {
    return leaf_ != null;
  }
  /**
   * <code>.ics23.LeafOp leaf = 3 [json_name = "leaf"];</code>
   * @return The leaf.
   */
  @Override
  public LeafOp getLeaf() {
    return leaf_ == null ? LeafOp.getDefaultInstance() : leaf_;
  }
  /**
   * <code>.ics23.LeafOp leaf = 3 [json_name = "leaf"];</code>
   */
  @Override
  public LeafOpOrBuilder getLeafOrBuilder() {
    return leaf_ == null ? LeafOp.getDefaultInstance() : leaf_;
  }

  public static final int PATH_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList path_;
  /**
   * <pre>
   * these are indexes into the lookup_inners table in CompressedBatchProof
   * </pre>
   *
   * <code>repeated int32 path = 4 [json_name = "path"];</code>
   * @return A list containing the path.
   */
  @Override
  public java.util.List<Integer>
      getPathList() {
    return path_;
  }
  /**
   * <pre>
   * these are indexes into the lookup_inners table in CompressedBatchProof
   * </pre>
   *
   * <code>repeated int32 path = 4 [json_name = "path"];</code>
   * @return The count of path.
   */
  public int getPathCount() {
    return path_.size();
  }
  /**
   * <pre>
   * these are indexes into the lookup_inners table in CompressedBatchProof
   * </pre>
   *
   * <code>repeated int32 path = 4 [json_name = "path"];</code>
   * @param index The index of the element to return.
   * @return The path at the given index.
   */
  public int getPath(int index) {
    return path_.getInt(index);
  }
  private int pathMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (!key_.isEmpty()) {
      output.writeBytes(1, key_);
    }
    if (!value_.isEmpty()) {
      output.writeBytes(2, value_);
    }
    if (leaf_ != null) {
      output.writeMessage(3, getLeaf());
    }
    if (getPathList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(pathMemoizedSerializedSize);
    }
    for (int i = 0; i < path_.size(); i++) {
      output.writeInt32NoTag(path_.getInt(i));
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!key_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, key_);
    }
    if (!value_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, value_);
    }
    if (leaf_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getLeaf());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < path_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(path_.getInt(i));
      }
      size += dataSize;
      if (!getPathList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      pathMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof CompressedExistenceProof)) {
      return super.equals(obj);
    }
    CompressedExistenceProof other = (CompressedExistenceProof) obj;

    if (!getKey()
        .equals(other.getKey())) return false;
    if (!getValue()
        .equals(other.getValue())) return false;
    if (hasLeaf() != other.hasLeaf()) return false;
    if (hasLeaf()) {
      if (!getLeaf()
          .equals(other.getLeaf())) return false;
    }
    if (!getPathList()
        .equals(other.getPathList())) return false;
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
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    if (hasLeaf()) {
      hash = (37 * hash) + LEAF_FIELD_NUMBER;
      hash = (53 * hash) + getLeaf().hashCode();
    }
    if (getPathCount() > 0) {
      hash = (37 * hash) + PATH_FIELD_NUMBER;
      hash = (53 * hash) + getPathList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static CompressedExistenceProof parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CompressedExistenceProof parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CompressedExistenceProof parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CompressedExistenceProof parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CompressedExistenceProof parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CompressedExistenceProof parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CompressedExistenceProof parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CompressedExistenceProof parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static CompressedExistenceProof parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static CompressedExistenceProof parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static CompressedExistenceProof parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CompressedExistenceProof parseFrom(
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
  public static Builder newBuilder(CompressedExistenceProof prototype) {
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
   * Protobuf type {@code ics23.CompressedExistenceProof}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ics23.CompressedExistenceProof)
      CompressedExistenceProofOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ProofsProto.internal_static_ics23_CompressedExistenceProof_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ProofsProto.internal_static_ics23_CompressedExistenceProof_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CompressedExistenceProof.class, Builder.class);
    }

    // Construct using com.ics23.CompressedExistenceProof.newBuilder()
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
      key_ = com.google.protobuf.ByteString.EMPTY;
      value_ = com.google.protobuf.ByteString.EMPTY;
      leaf_ = null;
      if (leafBuilder_ != null) {
        leafBuilder_.dispose();
        leafBuilder_ = null;
      }
      path_ = emptyIntList();
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ProofsProto.internal_static_ics23_CompressedExistenceProof_descriptor;
    }

    @Override
    public CompressedExistenceProof getDefaultInstanceForType() {
      return CompressedExistenceProof.getDefaultInstance();
    }

    @Override
    public CompressedExistenceProof build() {
      CompressedExistenceProof result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public CompressedExistenceProof buildPartial() {
      CompressedExistenceProof result = new CompressedExistenceProof(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(CompressedExistenceProof result) {
      if (((bitField0_ & 0x00000008) != 0)) {
        path_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.path_ = path_;
    }

    private void buildPartial0(CompressedExistenceProof result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.key_ = key_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.value_ = value_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.leaf_ = leafBuilder_ == null
            ? leaf_
            : leafBuilder_.build();
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
      if (other instanceof CompressedExistenceProof) {
        return mergeFrom((CompressedExistenceProof)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(CompressedExistenceProof other) {
      if (other == CompressedExistenceProof.getDefaultInstance()) return this;
      if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
        setKey(other.getKey());
      }
      if (other.getValue() != com.google.protobuf.ByteString.EMPTY) {
        setValue(other.getValue());
      }
      if (other.hasLeaf()) {
        mergeLeaf(other.getLeaf());
      }
      if (!other.path_.isEmpty()) {
        if (path_.isEmpty()) {
          path_ = other.path_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensurePathIsMutable();
          path_.addAll(other.path_);
        }
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
              key_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              value_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getLeafFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              int v = input.readInt32();
              ensurePathIsMutable();
              path_.addInt(v);
              break;
            } // case 32
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensurePathIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                path_.addInt(input.readInt32());
              }
              input.popLimit(limit);
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

    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes key = 1 [json_name = "key"];</code>
     * @return The key.
     */
    @Override
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }
    /**
     * <code>bytes key = 1 [json_name = "key"];</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      key_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bytes key = 1 [json_name = "key"];</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      bitField0_ = (bitField0_ & ~0x00000001);
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes value = 2 [json_name = "value"];</code>
     * @return The value.
     */
    @Override
    public com.google.protobuf.ByteString getValue() {
      return value_;
    }
    /**
     * <code>bytes value = 2 [json_name = "value"];</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      value_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bytes value = 2 [json_name = "value"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }

    private LeafOp leaf_;
    private com.google.protobuf.SingleFieldBuilderV3<
        LeafOp, LeafOp.Builder, LeafOpOrBuilder> leafBuilder_;
    /**
     * <code>.ics23.LeafOp leaf = 3 [json_name = "leaf"];</code>
     * @return Whether the leaf field is set.
     */
    public boolean hasLeaf() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.ics23.LeafOp leaf = 3 [json_name = "leaf"];</code>
     * @return The leaf.
     */
    public LeafOp getLeaf() {
      if (leafBuilder_ == null) {
        return leaf_ == null ? LeafOp.getDefaultInstance() : leaf_;
      } else {
        return leafBuilder_.getMessage();
      }
    }
    /**
     * <code>.ics23.LeafOp leaf = 3 [json_name = "leaf"];</code>
     */
    public Builder setLeaf(LeafOp value) {
      if (leafBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        leaf_ = value;
      } else {
        leafBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ics23.LeafOp leaf = 3 [json_name = "leaf"];</code>
     */
    public Builder setLeaf(
        LeafOp.Builder builderForValue) {
      if (leafBuilder_ == null) {
        leaf_ = builderForValue.build();
      } else {
        leafBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ics23.LeafOp leaf = 3 [json_name = "leaf"];</code>
     */
    public Builder mergeLeaf(LeafOp value) {
      if (leafBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          leaf_ != null &&
          leaf_ != LeafOp.getDefaultInstance()) {
          getLeafBuilder().mergeFrom(value);
        } else {
          leaf_ = value;
        }
      } else {
        leafBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ics23.LeafOp leaf = 3 [json_name = "leaf"];</code>
     */
    public Builder clearLeaf() {
      bitField0_ = (bitField0_ & ~0x00000004);
      leaf_ = null;
      if (leafBuilder_ != null) {
        leafBuilder_.dispose();
        leafBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ics23.LeafOp leaf = 3 [json_name = "leaf"];</code>
     */
    public LeafOp.Builder getLeafBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getLeafFieldBuilder().getBuilder();
    }
    /**
     * <code>.ics23.LeafOp leaf = 3 [json_name = "leaf"];</code>
     */
    public LeafOpOrBuilder getLeafOrBuilder() {
      if (leafBuilder_ != null) {
        return leafBuilder_.getMessageOrBuilder();
      } else {
        return leaf_ == null ?
            LeafOp.getDefaultInstance() : leaf_;
      }
    }
    /**
     * <code>.ics23.LeafOp leaf = 3 [json_name = "leaf"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        LeafOp, LeafOp.Builder, LeafOpOrBuilder>
        getLeafFieldBuilder() {
      if (leafBuilder_ == null) {
        leafBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            LeafOp, LeafOp.Builder, LeafOpOrBuilder>(
                getLeaf(),
                getParentForChildren(),
                isClean());
        leaf_ = null;
      }
      return leafBuilder_;
    }

    private com.google.protobuf.Internal.IntList path_ = emptyIntList();
    private void ensurePathIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        path_ = mutableCopy(path_);
        bitField0_ |= 0x00000008;
      }
    }
    /**
     * <pre>
     * these are indexes into the lookup_inners table in CompressedBatchProof
     * </pre>
     *
     * <code>repeated int32 path = 4 [json_name = "path"];</code>
     * @return A list containing the path.
     */
    public java.util.List<Integer>
        getPathList() {
      return ((bitField0_ & 0x00000008) != 0) ?
               java.util.Collections.unmodifiableList(path_) : path_;
    }
    /**
     * <pre>
     * these are indexes into the lookup_inners table in CompressedBatchProof
     * </pre>
     *
     * <code>repeated int32 path = 4 [json_name = "path"];</code>
     * @return The count of path.
     */
    public int getPathCount() {
      return path_.size();
    }
    /**
     * <pre>
     * these are indexes into the lookup_inners table in CompressedBatchProof
     * </pre>
     *
     * <code>repeated int32 path = 4 [json_name = "path"];</code>
     * @param index The index of the element to return.
     * @return The path at the given index.
     */
    public int getPath(int index) {
      return path_.getInt(index);
    }
    /**
     * <pre>
     * these are indexes into the lookup_inners table in CompressedBatchProof
     * </pre>
     *
     * <code>repeated int32 path = 4 [json_name = "path"];</code>
     * @param index The index to set the value at.
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(
        int index, int value) {

      ensurePathIsMutable();
      path_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * these are indexes into the lookup_inners table in CompressedBatchProof
     * </pre>
     *
     * <code>repeated int32 path = 4 [json_name = "path"];</code>
     * @param value The path to add.
     * @return This builder for chaining.
     */
    public Builder addPath(int value) {

      ensurePathIsMutable();
      path_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * these are indexes into the lookup_inners table in CompressedBatchProof
     * </pre>
     *
     * <code>repeated int32 path = 4 [json_name = "path"];</code>
     * @param values The path to add.
     * @return This builder for chaining.
     */
    public Builder addAllPath(
        Iterable<? extends Integer> values) {
      ensurePathIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, path_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * these are indexes into the lookup_inners table in CompressedBatchProof
     * </pre>
     *
     * <code>repeated int32 path = 4 [json_name = "path"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPath() {
      path_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000008);
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


    // @@protoc_insertion_point(builder_scope:ics23.CompressedExistenceProof)
  }

  // @@protoc_insertion_point(class_scope:ics23.CompressedExistenceProof)
  private static final CompressedExistenceProof DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CompressedExistenceProof();
  }

  public static CompressedExistenceProof getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompressedExistenceProof>
      PARSER = new com.google.protobuf.AbstractParser<CompressedExistenceProof>() {
    @Override
    public CompressedExistenceProof parsePartialFrom(
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

  public static com.google.protobuf.Parser<CompressedExistenceProof> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<CompressedExistenceProof> getParserForType() {
    return PARSER;
  }

  @Override
  public CompressedExistenceProof getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

