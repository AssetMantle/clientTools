// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/store/v1beta1/commit_info.proto

package com.cosmos.base.store.v1beta1;

/**
 * <pre>
 * CommitInfo defines commit information used by the multi-store when committing
 * a version/height.
 * </pre>
 *
 * Protobuf type {@code cosmos.base.store.v1beta1.CommitInfo}
 */
public final class CommitInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.base.store.v1beta1.CommitInfo)
    CommitInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CommitInfo.newBuilder() to construct.
  private CommitInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CommitInfo() {
    storeInfos_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CommitInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.base.store.v1beta1.CommitInfoProto.internal_static_cosmos_base_store_v1beta1_CommitInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.base.store.v1beta1.CommitInfoProto.internal_static_cosmos_base_store_v1beta1_CommitInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.base.store.v1beta1.CommitInfo.class, com.cosmos.base.store.v1beta1.CommitInfo.Builder.class);
  }

  public static final int VERSION_FIELD_NUMBER = 1;
  private long version_ = 0L;
  /**
   * <code>int64 version = 1 [json_name = "version"];</code>
   * @return The version.
   */
  @java.lang.Override
  public long getVersion() {
    return version_;
  }

  public static final int STORE_INFOS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.cosmos.base.store.v1beta1.StoreInfo> storeInfos_;
  /**
   * <code>repeated .cosmos.base.store.v1beta1.StoreInfo store_infos = 2 [json_name = "storeInfos", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.cosmos.base.store.v1beta1.StoreInfo> getStoreInfosList() {
    return storeInfos_;
  }
  /**
   * <code>repeated .cosmos.base.store.v1beta1.StoreInfo store_infos = 2 [json_name = "storeInfos", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.cosmos.base.store.v1beta1.StoreInfoOrBuilder> 
      getStoreInfosOrBuilderList() {
    return storeInfos_;
  }
  /**
   * <code>repeated .cosmos.base.store.v1beta1.StoreInfo store_infos = 2 [json_name = "storeInfos", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getStoreInfosCount() {
    return storeInfos_.size();
  }
  /**
   * <code>repeated .cosmos.base.store.v1beta1.StoreInfo store_infos = 2 [json_name = "storeInfos", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.cosmos.base.store.v1beta1.StoreInfo getStoreInfos(int index) {
    return storeInfos_.get(index);
  }
  /**
   * <code>repeated .cosmos.base.store.v1beta1.StoreInfo store_infos = 2 [json_name = "storeInfos", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.cosmos.base.store.v1beta1.StoreInfoOrBuilder getStoreInfosOrBuilder(
      int index) {
    return storeInfos_.get(index);
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
    if (version_ != 0L) {
      output.writeInt64(1, version_);
    }
    for (int i = 0; i < storeInfos_.size(); i++) {
      output.writeMessage(2, storeInfos_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (version_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, version_);
    }
    for (int i = 0; i < storeInfos_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, storeInfos_.get(i));
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
    if (!(obj instanceof com.cosmos.base.store.v1beta1.CommitInfo)) {
      return super.equals(obj);
    }
    com.cosmos.base.store.v1beta1.CommitInfo other = (com.cosmos.base.store.v1beta1.CommitInfo) obj;

    if (getVersion()
        != other.getVersion()) return false;
    if (!getStoreInfosList()
        .equals(other.getStoreInfosList())) return false;
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
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getVersion());
    if (getStoreInfosCount() > 0) {
      hash = (37 * hash) + STORE_INFOS_FIELD_NUMBER;
      hash = (53 * hash) + getStoreInfosList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.base.store.v1beta1.CommitInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.base.store.v1beta1.CommitInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.base.store.v1beta1.CommitInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.base.store.v1beta1.CommitInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.base.store.v1beta1.CommitInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.base.store.v1beta1.CommitInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.base.store.v1beta1.CommitInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.base.store.v1beta1.CommitInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.base.store.v1beta1.CommitInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cosmos.base.store.v1beta1.CommitInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.base.store.v1beta1.CommitInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.base.store.v1beta1.CommitInfo parseFrom(
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
  public static Builder newBuilder(com.cosmos.base.store.v1beta1.CommitInfo prototype) {
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
   * CommitInfo defines commit information used by the multi-store when committing
   * a version/height.
   * </pre>
   *
   * Protobuf type {@code cosmos.base.store.v1beta1.CommitInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.base.store.v1beta1.CommitInfo)
      com.cosmos.base.store.v1beta1.CommitInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.base.store.v1beta1.CommitInfoProto.internal_static_cosmos_base_store_v1beta1_CommitInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.base.store.v1beta1.CommitInfoProto.internal_static_cosmos_base_store_v1beta1_CommitInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.base.store.v1beta1.CommitInfo.class, com.cosmos.base.store.v1beta1.CommitInfo.Builder.class);
    }

    // Construct using com.cosmos.base.store.v1beta1.CommitInfo.newBuilder()
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
      version_ = 0L;
      if (storeInfosBuilder_ == null) {
        storeInfos_ = java.util.Collections.emptyList();
      } else {
        storeInfos_ = null;
        storeInfosBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.base.store.v1beta1.CommitInfoProto.internal_static_cosmos_base_store_v1beta1_CommitInfo_descriptor;
    }

    @java.lang.Override
    public com.cosmos.base.store.v1beta1.CommitInfo getDefaultInstanceForType() {
      return com.cosmos.base.store.v1beta1.CommitInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.base.store.v1beta1.CommitInfo build() {
      com.cosmos.base.store.v1beta1.CommitInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.base.store.v1beta1.CommitInfo buildPartial() {
      com.cosmos.base.store.v1beta1.CommitInfo result = new com.cosmos.base.store.v1beta1.CommitInfo(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.cosmos.base.store.v1beta1.CommitInfo result) {
      if (storeInfosBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          storeInfos_ = java.util.Collections.unmodifiableList(storeInfos_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.storeInfos_ = storeInfos_;
      } else {
        result.storeInfos_ = storeInfosBuilder_.build();
      }
    }

    private void buildPartial0(com.cosmos.base.store.v1beta1.CommitInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.version_ = version_;
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
      if (other instanceof com.cosmos.base.store.v1beta1.CommitInfo) {
        return mergeFrom((com.cosmos.base.store.v1beta1.CommitInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.base.store.v1beta1.CommitInfo other) {
      if (other == com.cosmos.base.store.v1beta1.CommitInfo.getDefaultInstance()) return this;
      if (other.getVersion() != 0L) {
        setVersion(other.getVersion());
      }
      if (storeInfosBuilder_ == null) {
        if (!other.storeInfos_.isEmpty()) {
          if (storeInfos_.isEmpty()) {
            storeInfos_ = other.storeInfos_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureStoreInfosIsMutable();
            storeInfos_.addAll(other.storeInfos_);
          }
          onChanged();
        }
      } else {
        if (!other.storeInfos_.isEmpty()) {
          if (storeInfosBuilder_.isEmpty()) {
            storeInfosBuilder_.dispose();
            storeInfosBuilder_ = null;
            storeInfos_ = other.storeInfos_;
            bitField0_ = (bitField0_ & ~0x00000002);
            storeInfosBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStoreInfosFieldBuilder() : null;
          } else {
            storeInfosBuilder_.addAllMessages(other.storeInfos_);
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
              version_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              com.cosmos.base.store.v1beta1.StoreInfo m =
                  input.readMessage(
                      com.cosmos.base.store.v1beta1.StoreInfo.parser(),
                      extensionRegistry);
              if (storeInfosBuilder_ == null) {
                ensureStoreInfosIsMutable();
                storeInfos_.add(m);
              } else {
                storeInfosBuilder_.addMessage(m);
              }
              break;
            } // case 18
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

    private long version_ ;
    /**
     * <code>int64 version = 1 [json_name = "version"];</code>
     * @return The version.
     */
    @java.lang.Override
    public long getVersion() {
      return version_;
    }
    /**
     * <code>int64 version = 1 [json_name = "version"];</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(long value) {

      version_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 version = 1 [json_name = "version"];</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      version_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<com.cosmos.base.store.v1beta1.StoreInfo> storeInfos_ =
      java.util.Collections.emptyList();
    private void ensureStoreInfosIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        storeInfos_ = new java.util.ArrayList<com.cosmos.base.store.v1beta1.StoreInfo>(storeInfos_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.store.v1beta1.StoreInfo, com.cosmos.base.store.v1beta1.StoreInfo.Builder, com.cosmos.base.store.v1beta1.StoreInfoOrBuilder> storeInfosBuilder_;

    /**
     * <code>repeated .cosmos.base.store.v1beta1.StoreInfo store_infos = 2 [json_name = "storeInfos", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.cosmos.base.store.v1beta1.StoreInfo> getStoreInfosList() {
      if (storeInfosBuilder_ == null) {
        return java.util.Collections.unmodifiableList(storeInfos_);
      } else {
        return storeInfosBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cosmos.base.store.v1beta1.StoreInfo store_infos = 2 [json_name = "storeInfos", (.gogoproto.nullable) = false];</code>
     */
    public int getStoreInfosCount() {
      if (storeInfosBuilder_ == null) {
        return storeInfos_.size();
      } else {
        return storeInfosBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cosmos.base.store.v1beta1.StoreInfo store_infos = 2 [json_name = "storeInfos", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.store.v1beta1.StoreInfo getStoreInfos(int index) {
      if (storeInfosBuilder_ == null) {
        return storeInfos_.get(index);
      } else {
        return storeInfosBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.store.v1beta1.StoreInfo store_infos = 2 [json_name = "storeInfos", (.gogoproto.nullable) = false];</code>
     */
    public Builder setStoreInfos(
        int index, com.cosmos.base.store.v1beta1.StoreInfo value) {
      if (storeInfosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStoreInfosIsMutable();
        storeInfos_.set(index, value);
        onChanged();
      } else {
        storeInfosBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.store.v1beta1.StoreInfo store_infos = 2 [json_name = "storeInfos", (.gogoproto.nullable) = false];</code>
     */
    public Builder setStoreInfos(
        int index, com.cosmos.base.store.v1beta1.StoreInfo.Builder builderForValue) {
      if (storeInfosBuilder_ == null) {
        ensureStoreInfosIsMutable();
        storeInfos_.set(index, builderForValue.build());
        onChanged();
      } else {
        storeInfosBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.store.v1beta1.StoreInfo store_infos = 2 [json_name = "storeInfos", (.gogoproto.nullable) = false];</code>
     */
    public Builder addStoreInfos(com.cosmos.base.store.v1beta1.StoreInfo value) {
      if (storeInfosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStoreInfosIsMutable();
        storeInfos_.add(value);
        onChanged();
      } else {
        storeInfosBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.store.v1beta1.StoreInfo store_infos = 2 [json_name = "storeInfos", (.gogoproto.nullable) = false];</code>
     */
    public Builder addStoreInfos(
        int index, com.cosmos.base.store.v1beta1.StoreInfo value) {
      if (storeInfosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStoreInfosIsMutable();
        storeInfos_.add(index, value);
        onChanged();
      } else {
        storeInfosBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.store.v1beta1.StoreInfo store_infos = 2 [json_name = "storeInfos", (.gogoproto.nullable) = false];</code>
     */
    public Builder addStoreInfos(
        com.cosmos.base.store.v1beta1.StoreInfo.Builder builderForValue) {
      if (storeInfosBuilder_ == null) {
        ensureStoreInfosIsMutable();
        storeInfos_.add(builderForValue.build());
        onChanged();
      } else {
        storeInfosBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.store.v1beta1.StoreInfo store_infos = 2 [json_name = "storeInfos", (.gogoproto.nullable) = false];</code>
     */
    public Builder addStoreInfos(
        int index, com.cosmos.base.store.v1beta1.StoreInfo.Builder builderForValue) {
      if (storeInfosBuilder_ == null) {
        ensureStoreInfosIsMutable();
        storeInfos_.add(index, builderForValue.build());
        onChanged();
      } else {
        storeInfosBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.store.v1beta1.StoreInfo store_infos = 2 [json_name = "storeInfos", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllStoreInfos(
        java.lang.Iterable<? extends com.cosmos.base.store.v1beta1.StoreInfo> values) {
      if (storeInfosBuilder_ == null) {
        ensureStoreInfosIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, storeInfos_);
        onChanged();
      } else {
        storeInfosBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.store.v1beta1.StoreInfo store_infos = 2 [json_name = "storeInfos", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearStoreInfos() {
      if (storeInfosBuilder_ == null) {
        storeInfos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        storeInfosBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.store.v1beta1.StoreInfo store_infos = 2 [json_name = "storeInfos", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeStoreInfos(int index) {
      if (storeInfosBuilder_ == null) {
        ensureStoreInfosIsMutable();
        storeInfos_.remove(index);
        onChanged();
      } else {
        storeInfosBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.store.v1beta1.StoreInfo store_infos = 2 [json_name = "storeInfos", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.store.v1beta1.StoreInfo.Builder getStoreInfosBuilder(
        int index) {
      return getStoreInfosFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cosmos.base.store.v1beta1.StoreInfo store_infos = 2 [json_name = "storeInfos", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.store.v1beta1.StoreInfoOrBuilder getStoreInfosOrBuilder(
        int index) {
      if (storeInfosBuilder_ == null) {
        return storeInfos_.get(index);  } else {
        return storeInfosBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.store.v1beta1.StoreInfo store_infos = 2 [json_name = "storeInfos", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.cosmos.base.store.v1beta1.StoreInfoOrBuilder> 
         getStoreInfosOrBuilderList() {
      if (storeInfosBuilder_ != null) {
        return storeInfosBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(storeInfos_);
      }
    }
    /**
     * <code>repeated .cosmos.base.store.v1beta1.StoreInfo store_infos = 2 [json_name = "storeInfos", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.store.v1beta1.StoreInfo.Builder addStoreInfosBuilder() {
      return getStoreInfosFieldBuilder().addBuilder(
          com.cosmos.base.store.v1beta1.StoreInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.store.v1beta1.StoreInfo store_infos = 2 [json_name = "storeInfos", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.base.store.v1beta1.StoreInfo.Builder addStoreInfosBuilder(
        int index) {
      return getStoreInfosFieldBuilder().addBuilder(
          index, com.cosmos.base.store.v1beta1.StoreInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.store.v1beta1.StoreInfo store_infos = 2 [json_name = "storeInfos", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.cosmos.base.store.v1beta1.StoreInfo.Builder> 
         getStoreInfosBuilderList() {
      return getStoreInfosFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.store.v1beta1.StoreInfo, com.cosmos.base.store.v1beta1.StoreInfo.Builder, com.cosmos.base.store.v1beta1.StoreInfoOrBuilder> 
        getStoreInfosFieldBuilder() {
      if (storeInfosBuilder_ == null) {
        storeInfosBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cosmos.base.store.v1beta1.StoreInfo, com.cosmos.base.store.v1beta1.StoreInfo.Builder, com.cosmos.base.store.v1beta1.StoreInfoOrBuilder>(
                storeInfos_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        storeInfos_ = null;
      }
      return storeInfosBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.base.store.v1beta1.CommitInfo)
  }

  // @@protoc_insertion_point(class_scope:cosmos.base.store.v1beta1.CommitInfo)
  private static final com.cosmos.base.store.v1beta1.CommitInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.base.store.v1beta1.CommitInfo();
  }

  public static com.cosmos.base.store.v1beta1.CommitInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommitInfo>
      PARSER = new com.google.protobuf.AbstractParser<CommitInfo>() {
    @java.lang.Override
    public CommitInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<CommitInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommitInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.base.store.v1beta1.CommitInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

