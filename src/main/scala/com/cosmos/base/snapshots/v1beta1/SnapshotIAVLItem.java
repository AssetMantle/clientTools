// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/snapshots/v1beta1/snapshot.proto

package com.cosmos.base.snapshots.v1beta1;

/**
 * <pre>
 * SnapshotIAVLItem is an exported IAVL node.
 * </pre>
 *
 * Protobuf type {@code cosmos.base.snapshots.v1beta1.SnapshotIAVLItem}
 */
public final class SnapshotIAVLItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.base.snapshots.v1beta1.SnapshotIAVLItem)
    SnapshotIAVLItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SnapshotIAVLItem.newBuilder() to construct.
  private SnapshotIAVLItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SnapshotIAVLItem() {
    key_ = com.google.protobuf.ByteString.EMPTY;
    value_ = com.google.protobuf.ByteString.EMPTY;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new SnapshotIAVLItem();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return SnapshotProto.internal_static_cosmos_base_snapshots_v1beta1_SnapshotIAVLItem_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return SnapshotProto.internal_static_cosmos_base_snapshots_v1beta1_SnapshotIAVLItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            SnapshotIAVLItem.class, Builder.class);
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

  public static final int VERSION_FIELD_NUMBER = 3;
  private long version_ = 0L;
  /**
   * <pre>
   * version is block height
   * </pre>
   *
   * <code>int64 version = 3 [json_name = "version"];</code>
   * @return The version.
   */
  @Override
  public long getVersion() {
    return version_;
  }

  public static final int HEIGHT_FIELD_NUMBER = 4;
  private int height_ = 0;
  /**
   * <pre>
   * height is depth of the tree.
   * </pre>
   *
   * <code>int32 height = 4 [json_name = "height"];</code>
   * @return The height.
   */
  @Override
  public int getHeight() {
    return height_;
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
    if (!key_.isEmpty()) {
      output.writeBytes(1, key_);
    }
    if (!value_.isEmpty()) {
      output.writeBytes(2, value_);
    }
    if (version_ != 0L) {
      output.writeInt64(3, version_);
    }
    if (height_ != 0) {
      output.writeInt32(4, height_);
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
    if (version_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, version_);
    }
    if (height_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, height_);
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
    if (!(obj instanceof SnapshotIAVLItem)) {
      return super.equals(obj);
    }
    SnapshotIAVLItem other = (SnapshotIAVLItem) obj;

    if (!getKey()
        .equals(other.getKey())) return false;
    if (!getValue()
        .equals(other.getValue())) return false;
    if (getVersion()
        != other.getVersion()) return false;
    if (getHeight()
        != other.getHeight()) return false;
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
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getVersion());
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getHeight();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static SnapshotIAVLItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SnapshotIAVLItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SnapshotIAVLItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SnapshotIAVLItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SnapshotIAVLItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SnapshotIAVLItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SnapshotIAVLItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SnapshotIAVLItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static SnapshotIAVLItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static SnapshotIAVLItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static SnapshotIAVLItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SnapshotIAVLItem parseFrom(
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
  public static Builder newBuilder(SnapshotIAVLItem prototype) {
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
   * SnapshotIAVLItem is an exported IAVL node.
   * </pre>
   *
   * Protobuf type {@code cosmos.base.snapshots.v1beta1.SnapshotIAVLItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.base.snapshots.v1beta1.SnapshotIAVLItem)
      SnapshotIAVLItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SnapshotProto.internal_static_cosmos_base_snapshots_v1beta1_SnapshotIAVLItem_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SnapshotProto.internal_static_cosmos_base_snapshots_v1beta1_SnapshotIAVLItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SnapshotIAVLItem.class, Builder.class);
    }

    // Construct using com.cosmos.base.snapshots.v1beta1.SnapshotIAVLItem.newBuilder()
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
      version_ = 0L;
      height_ = 0;
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return SnapshotProto.internal_static_cosmos_base_snapshots_v1beta1_SnapshotIAVLItem_descriptor;
    }

    @Override
    public SnapshotIAVLItem getDefaultInstanceForType() {
      return SnapshotIAVLItem.getDefaultInstance();
    }

    @Override
    public SnapshotIAVLItem build() {
      SnapshotIAVLItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public SnapshotIAVLItem buildPartial() {
      SnapshotIAVLItem result = new SnapshotIAVLItem(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(SnapshotIAVLItem result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.key_ = key_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.value_ = value_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.version_ = version_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.height_ = height_;
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
      if (other instanceof SnapshotIAVLItem) {
        return mergeFrom((SnapshotIAVLItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(SnapshotIAVLItem other) {
      if (other == SnapshotIAVLItem.getDefaultInstance()) return this;
      if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
        setKey(other.getKey());
      }
      if (other.getValue() != com.google.protobuf.ByteString.EMPTY) {
        setValue(other.getValue());
      }
      if (other.getVersion() != 0L) {
        setVersion(other.getVersion());
      }
      if (other.getHeight() != 0) {
        setHeight(other.getHeight());
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
            case 24: {
              version_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              height_ = input.readInt32();
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

    private long version_ ;
    /**
     * <pre>
     * version is block height
     * </pre>
     *
     * <code>int64 version = 3 [json_name = "version"];</code>
     * @return The version.
     */
    @Override
    public long getVersion() {
      return version_;
    }
    /**
     * <pre>
     * version is block height
     * </pre>
     *
     * <code>int64 version = 3 [json_name = "version"];</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(long value) {

      version_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * version is block height
     * </pre>
     *
     * <code>int64 version = 3 [json_name = "version"];</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      bitField0_ = (bitField0_ & ~0x00000004);
      version_ = 0L;
      onChanged();
      return this;
    }

    private int height_ ;
    /**
     * <pre>
     * height is depth of the tree.
     * </pre>
     *
     * <code>int32 height = 4 [json_name = "height"];</code>
     * @return The height.
     */
    @Override
    public int getHeight() {
      return height_;
    }
    /**
     * <pre>
     * height is depth of the tree.
     * </pre>
     *
     * <code>int32 height = 4 [json_name = "height"];</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(int value) {

      height_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * height is depth of the tree.
     * </pre>
     *
     * <code>int32 height = 4 [json_name = "height"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      bitField0_ = (bitField0_ & ~0x00000008);
      height_ = 0;
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


    // @@protoc_insertion_point(builder_scope:cosmos.base.snapshots.v1beta1.SnapshotIAVLItem)
  }

  // @@protoc_insertion_point(class_scope:cosmos.base.snapshots.v1beta1.SnapshotIAVLItem)
  private static final SnapshotIAVLItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SnapshotIAVLItem();
  }

  public static SnapshotIAVLItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SnapshotIAVLItem>
      PARSER = new com.google.protobuf.AbstractParser<SnapshotIAVLItem>() {
    @Override
    public SnapshotIAVLItem parsePartialFrom(
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

  public static com.google.protobuf.Parser<SnapshotIAVLItem> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<SnapshotIAVLItem> getParserForType() {
    return PARSER;
  }

  @Override
  public SnapshotIAVLItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

