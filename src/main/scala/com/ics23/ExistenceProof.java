// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: confio/proofs.proto

package com.ics23;

/**
 * <pre>
 *
 *ExistenceProof takes a key and a value and a set of steps to perform on it.
 *The result of peforming all these steps will provide a "root hash", which can
 *be compared to the value in a header.
 *
 *Since it is computationally infeasible to produce a hash collission for any of the used
 *cryptographic hash functions, if someone can provide a series of operations to transform
 *a given key and value into a root hash that matches some trusted root, these key and values
 *must be in the referenced merkle tree.
 *
 *The only possible issue is maliablity in LeafOp, such as providing extra prefix data,
 *which should be controlled by a spec. Eg. with lengthOp as NONE,
 * prefix = FOO, key = BAR, value = CHOICE
 *and
 * prefix = F, key = OOBAR, value = CHOICE
 *would produce the same value.
 *
 *With LengthOp this is tricker but not impossible. Which is why the "leafPrefixEqual" field
 *in the ProofSpec is valuable to prevent this mutability. And why all trees should
 *length-prefix the data before hashing it.
 * </pre>
 *
 * Protobuf type {@code ics23.ExistenceProof}
 */
public final class ExistenceProof extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ics23.ExistenceProof)
    ExistenceProofOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExistenceProof.newBuilder() to construct.
  private ExistenceProof(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExistenceProof() {
    key_ = com.google.protobuf.ByteString.EMPTY;
    value_ = com.google.protobuf.ByteString.EMPTY;
    path_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExistenceProof();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ics23.ProofsProto.internal_static_ics23_ExistenceProof_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ics23.ProofsProto.internal_static_ics23_ExistenceProof_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ics23.ExistenceProof.class, com.ics23.ExistenceProof.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes key = 1 [json_name = "key"];</code>
   * @return The key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKey() {
    return key_;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes value = 2 [json_name = "value"];</code>
   * @return The value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getValue() {
    return value_;
  }

  public static final int LEAF_FIELD_NUMBER = 3;
  private com.ics23.LeafOp leaf_;
  /**
   * <code>.ics23.LeafOp leaf = 3 [json_name = "leaf"];</code>
   * @return Whether the leaf field is set.
   */
  @java.lang.Override
  public boolean hasLeaf() {
    return leaf_ != null;
  }
  /**
   * <code>.ics23.LeafOp leaf = 3 [json_name = "leaf"];</code>
   * @return The leaf.
   */
  @java.lang.Override
  public com.ics23.LeafOp getLeaf() {
    return leaf_ == null ? com.ics23.LeafOp.getDefaultInstance() : leaf_;
  }
  /**
   * <code>.ics23.LeafOp leaf = 3 [json_name = "leaf"];</code>
   */
  @java.lang.Override
  public com.ics23.LeafOpOrBuilder getLeafOrBuilder() {
    return leaf_ == null ? com.ics23.LeafOp.getDefaultInstance() : leaf_;
  }

  public static final int PATH_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private java.util.List<com.ics23.InnerOp> path_;
  /**
   * <code>repeated .ics23.InnerOp path = 4 [json_name = "path"];</code>
   */
  @java.lang.Override
  public java.util.List<com.ics23.InnerOp> getPathList() {
    return path_;
  }
  /**
   * <code>repeated .ics23.InnerOp path = 4 [json_name = "path"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.ics23.InnerOpOrBuilder> 
      getPathOrBuilderList() {
    return path_;
  }
  /**
   * <code>repeated .ics23.InnerOp path = 4 [json_name = "path"];</code>
   */
  @java.lang.Override
  public int getPathCount() {
    return path_.size();
  }
  /**
   * <code>repeated .ics23.InnerOp path = 4 [json_name = "path"];</code>
   */
  @java.lang.Override
  public com.ics23.InnerOp getPath(int index) {
    return path_.get(index);
  }
  /**
   * <code>repeated .ics23.InnerOp path = 4 [json_name = "path"];</code>
   */
  @java.lang.Override
  public com.ics23.InnerOpOrBuilder getPathOrBuilder(
      int index) {
    return path_.get(index);
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
    if (!key_.isEmpty()) {
      output.writeBytes(1, key_);
    }
    if (!value_.isEmpty()) {
      output.writeBytes(2, value_);
    }
    if (leaf_ != null) {
      output.writeMessage(3, getLeaf());
    }
    for (int i = 0; i < path_.size(); i++) {
      output.writeMessage(4, path_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
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
    for (int i = 0; i < path_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, path_.get(i));
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
    if (!(obj instanceof com.ics23.ExistenceProof)) {
      return super.equals(obj);
    }
    com.ics23.ExistenceProof other = (com.ics23.ExistenceProof) obj;

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

  @java.lang.Override
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

  public static com.ics23.ExistenceProof parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ics23.ExistenceProof parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ics23.ExistenceProof parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ics23.ExistenceProof parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ics23.ExistenceProof parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ics23.ExistenceProof parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ics23.ExistenceProof parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ics23.ExistenceProof parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ics23.ExistenceProof parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ics23.ExistenceProof parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ics23.ExistenceProof parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ics23.ExistenceProof parseFrom(
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
  public static Builder newBuilder(com.ics23.ExistenceProof prototype) {
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
   *
   *ExistenceProof takes a key and a value and a set of steps to perform on it.
   *The result of peforming all these steps will provide a "root hash", which can
   *be compared to the value in a header.
   *
   *Since it is computationally infeasible to produce a hash collission for any of the used
   *cryptographic hash functions, if someone can provide a series of operations to transform
   *a given key and value into a root hash that matches some trusted root, these key and values
   *must be in the referenced merkle tree.
   *
   *The only possible issue is maliablity in LeafOp, such as providing extra prefix data,
   *which should be controlled by a spec. Eg. with lengthOp as NONE,
   * prefix = FOO, key = BAR, value = CHOICE
   *and
   * prefix = F, key = OOBAR, value = CHOICE
   *would produce the same value.
   *
   *With LengthOp this is tricker but not impossible. Which is why the "leafPrefixEqual" field
   *in the ProofSpec is valuable to prevent this mutability. And why all trees should
   *length-prefix the data before hashing it.
   * </pre>
   *
   * Protobuf type {@code ics23.ExistenceProof}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ics23.ExistenceProof)
      com.ics23.ExistenceProofOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ics23.ProofsProto.internal_static_ics23_ExistenceProof_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ics23.ProofsProto.internal_static_ics23_ExistenceProof_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ics23.ExistenceProof.class, com.ics23.ExistenceProof.Builder.class);
    }

    // Construct using com.ics23.ExistenceProof.newBuilder()
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
      key_ = com.google.protobuf.ByteString.EMPTY;
      value_ = com.google.protobuf.ByteString.EMPTY;
      leaf_ = null;
      if (leafBuilder_ != null) {
        leafBuilder_.dispose();
        leafBuilder_ = null;
      }
      if (pathBuilder_ == null) {
        path_ = java.util.Collections.emptyList();
      } else {
        path_ = null;
        pathBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ics23.ProofsProto.internal_static_ics23_ExistenceProof_descriptor;
    }

    @java.lang.Override
    public com.ics23.ExistenceProof getDefaultInstanceForType() {
      return com.ics23.ExistenceProof.getDefaultInstance();
    }

    @java.lang.Override
    public com.ics23.ExistenceProof build() {
      com.ics23.ExistenceProof result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ics23.ExistenceProof buildPartial() {
      com.ics23.ExistenceProof result = new com.ics23.ExistenceProof(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.ics23.ExistenceProof result) {
      if (pathBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0)) {
          path_ = java.util.Collections.unmodifiableList(path_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.path_ = path_;
      } else {
        result.path_ = pathBuilder_.build();
      }
    }

    private void buildPartial0(com.ics23.ExistenceProof result) {
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
      if (other instanceof com.ics23.ExistenceProof) {
        return mergeFrom((com.ics23.ExistenceProof)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ics23.ExistenceProof other) {
      if (other == com.ics23.ExistenceProof.getDefaultInstance()) return this;
      if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
        setKey(other.getKey());
      }
      if (other.getValue() != com.google.protobuf.ByteString.EMPTY) {
        setValue(other.getValue());
      }
      if (other.hasLeaf()) {
        mergeLeaf(other.getLeaf());
      }
      if (pathBuilder_ == null) {
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
      } else {
        if (!other.path_.isEmpty()) {
          if (pathBuilder_.isEmpty()) {
            pathBuilder_.dispose();
            pathBuilder_ = null;
            path_ = other.path_;
            bitField0_ = (bitField0_ & ~0x00000008);
            pathBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPathFieldBuilder() : null;
          } else {
            pathBuilder_.addAllMessages(other.path_);
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
            case 34: {
              com.ics23.InnerOp m =
                  input.readMessage(
                      com.ics23.InnerOp.parser(),
                      extensionRegistry);
              if (pathBuilder_ == null) {
                ensurePathIsMutable();
                path_.add(m);
              } else {
                pathBuilder_.addMessage(m);
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

    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes key = 1 [json_name = "key"];</code>
     * @return The key.
     */
    @java.lang.Override
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
    @java.lang.Override
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

    private com.ics23.LeafOp leaf_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ics23.LeafOp, com.ics23.LeafOp.Builder, com.ics23.LeafOpOrBuilder> leafBuilder_;
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
    public com.ics23.LeafOp getLeaf() {
      if (leafBuilder_ == null) {
        return leaf_ == null ? com.ics23.LeafOp.getDefaultInstance() : leaf_;
      } else {
        return leafBuilder_.getMessage();
      }
    }
    /**
     * <code>.ics23.LeafOp leaf = 3 [json_name = "leaf"];</code>
     */
    public Builder setLeaf(com.ics23.LeafOp value) {
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
        com.ics23.LeafOp.Builder builderForValue) {
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
    public Builder mergeLeaf(com.ics23.LeafOp value) {
      if (leafBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          leaf_ != null &&
          leaf_ != com.ics23.LeafOp.getDefaultInstance()) {
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
    public com.ics23.LeafOp.Builder getLeafBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getLeafFieldBuilder().getBuilder();
    }
    /**
     * <code>.ics23.LeafOp leaf = 3 [json_name = "leaf"];</code>
     */
    public com.ics23.LeafOpOrBuilder getLeafOrBuilder() {
      if (leafBuilder_ != null) {
        return leafBuilder_.getMessageOrBuilder();
      } else {
        return leaf_ == null ?
            com.ics23.LeafOp.getDefaultInstance() : leaf_;
      }
    }
    /**
     * <code>.ics23.LeafOp leaf = 3 [json_name = "leaf"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ics23.LeafOp, com.ics23.LeafOp.Builder, com.ics23.LeafOpOrBuilder> 
        getLeafFieldBuilder() {
      if (leafBuilder_ == null) {
        leafBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ics23.LeafOp, com.ics23.LeafOp.Builder, com.ics23.LeafOpOrBuilder>(
                getLeaf(),
                getParentForChildren(),
                isClean());
        leaf_ = null;
      }
      return leafBuilder_;
    }

    private java.util.List<com.ics23.InnerOp> path_ =
      java.util.Collections.emptyList();
    private void ensurePathIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        path_ = new java.util.ArrayList<com.ics23.InnerOp>(path_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ics23.InnerOp, com.ics23.InnerOp.Builder, com.ics23.InnerOpOrBuilder> pathBuilder_;

    /**
     * <code>repeated .ics23.InnerOp path = 4 [json_name = "path"];</code>
     */
    public java.util.List<com.ics23.InnerOp> getPathList() {
      if (pathBuilder_ == null) {
        return java.util.Collections.unmodifiableList(path_);
      } else {
        return pathBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ics23.InnerOp path = 4 [json_name = "path"];</code>
     */
    public int getPathCount() {
      if (pathBuilder_ == null) {
        return path_.size();
      } else {
        return pathBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ics23.InnerOp path = 4 [json_name = "path"];</code>
     */
    public com.ics23.InnerOp getPath(int index) {
      if (pathBuilder_ == null) {
        return path_.get(index);
      } else {
        return pathBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ics23.InnerOp path = 4 [json_name = "path"];</code>
     */
    public Builder setPath(
        int index, com.ics23.InnerOp value) {
      if (pathBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePathIsMutable();
        path_.set(index, value);
        onChanged();
      } else {
        pathBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ics23.InnerOp path = 4 [json_name = "path"];</code>
     */
    public Builder setPath(
        int index, com.ics23.InnerOp.Builder builderForValue) {
      if (pathBuilder_ == null) {
        ensurePathIsMutable();
        path_.set(index, builderForValue.build());
        onChanged();
      } else {
        pathBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ics23.InnerOp path = 4 [json_name = "path"];</code>
     */
    public Builder addPath(com.ics23.InnerOp value) {
      if (pathBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePathIsMutable();
        path_.add(value);
        onChanged();
      } else {
        pathBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ics23.InnerOp path = 4 [json_name = "path"];</code>
     */
    public Builder addPath(
        int index, com.ics23.InnerOp value) {
      if (pathBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePathIsMutable();
        path_.add(index, value);
        onChanged();
      } else {
        pathBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ics23.InnerOp path = 4 [json_name = "path"];</code>
     */
    public Builder addPath(
        com.ics23.InnerOp.Builder builderForValue) {
      if (pathBuilder_ == null) {
        ensurePathIsMutable();
        path_.add(builderForValue.build());
        onChanged();
      } else {
        pathBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ics23.InnerOp path = 4 [json_name = "path"];</code>
     */
    public Builder addPath(
        int index, com.ics23.InnerOp.Builder builderForValue) {
      if (pathBuilder_ == null) {
        ensurePathIsMutable();
        path_.add(index, builderForValue.build());
        onChanged();
      } else {
        pathBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ics23.InnerOp path = 4 [json_name = "path"];</code>
     */
    public Builder addAllPath(
        java.lang.Iterable<? extends com.ics23.InnerOp> values) {
      if (pathBuilder_ == null) {
        ensurePathIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, path_);
        onChanged();
      } else {
        pathBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ics23.InnerOp path = 4 [json_name = "path"];</code>
     */
    public Builder clearPath() {
      if (pathBuilder_ == null) {
        path_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        pathBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ics23.InnerOp path = 4 [json_name = "path"];</code>
     */
    public Builder removePath(int index) {
      if (pathBuilder_ == null) {
        ensurePathIsMutable();
        path_.remove(index);
        onChanged();
      } else {
        pathBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ics23.InnerOp path = 4 [json_name = "path"];</code>
     */
    public com.ics23.InnerOp.Builder getPathBuilder(
        int index) {
      return getPathFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ics23.InnerOp path = 4 [json_name = "path"];</code>
     */
    public com.ics23.InnerOpOrBuilder getPathOrBuilder(
        int index) {
      if (pathBuilder_ == null) {
        return path_.get(index);  } else {
        return pathBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ics23.InnerOp path = 4 [json_name = "path"];</code>
     */
    public java.util.List<? extends com.ics23.InnerOpOrBuilder> 
         getPathOrBuilderList() {
      if (pathBuilder_ != null) {
        return pathBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(path_);
      }
    }
    /**
     * <code>repeated .ics23.InnerOp path = 4 [json_name = "path"];</code>
     */
    public com.ics23.InnerOp.Builder addPathBuilder() {
      return getPathFieldBuilder().addBuilder(
          com.ics23.InnerOp.getDefaultInstance());
    }
    /**
     * <code>repeated .ics23.InnerOp path = 4 [json_name = "path"];</code>
     */
    public com.ics23.InnerOp.Builder addPathBuilder(
        int index) {
      return getPathFieldBuilder().addBuilder(
          index, com.ics23.InnerOp.getDefaultInstance());
    }
    /**
     * <code>repeated .ics23.InnerOp path = 4 [json_name = "path"];</code>
     */
    public java.util.List<com.ics23.InnerOp.Builder> 
         getPathBuilderList() {
      return getPathFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ics23.InnerOp, com.ics23.InnerOp.Builder, com.ics23.InnerOpOrBuilder> 
        getPathFieldBuilder() {
      if (pathBuilder_ == null) {
        pathBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.ics23.InnerOp, com.ics23.InnerOp.Builder, com.ics23.InnerOpOrBuilder>(
                path_,
                ((bitField0_ & 0x00000008) != 0),
                getParentForChildren(),
                isClean());
        path_ = null;
      }
      return pathBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ics23.ExistenceProof)
  }

  // @@protoc_insertion_point(class_scope:ics23.ExistenceProof)
  private static final com.ics23.ExistenceProof DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ics23.ExistenceProof();
  }

  public static com.ics23.ExistenceProof getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExistenceProof>
      PARSER = new com.google.protobuf.AbstractParser<ExistenceProof>() {
    @java.lang.Override
    public ExistenceProof parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExistenceProof> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExistenceProof> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ics23.ExistenceProof getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
