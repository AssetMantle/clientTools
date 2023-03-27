// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/store/v1beta1/commit_info.proto

package com.cosmos.base.store.v1beta1;

/**
 * <pre>
 * CommitID defines the committment information when a specific store is
 * committed.
 * </pre>
 *
 * Protobuf type {@code cosmos.base.store.v1beta1.CommitID}
 */
public final class CommitID extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.base.store.v1beta1.CommitID)
    CommitIDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CommitID.newBuilder() to construct.
  private CommitID(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CommitID() {
    hash_ = com.google.protobuf.ByteString.EMPTY;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new CommitID();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return CommitInfoProto.internal_static_cosmos_base_store_v1beta1_CommitID_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return CommitInfoProto.internal_static_cosmos_base_store_v1beta1_CommitID_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            CommitID.class, Builder.class);
  }

  public static final int VERSION_FIELD_NUMBER = 1;
  private long version_ = 0L;
  /**
   * <code>int64 version = 1 [json_name = "version"];</code>
   * @return The version.
   */
  @Override
  public long getVersion() {
    return version_;
  }

  public static final int HASH_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString hash_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes hash = 2 [json_name = "hash"];</code>
   * @return The hash.
   */
  @Override
  public com.google.protobuf.ByteString getHash() {
    return hash_;
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
    if (version_ != 0L) {
      output.writeInt64(1, version_);
    }
    if (!hash_.isEmpty()) {
      output.writeBytes(2, hash_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (version_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, version_);
    }
    if (!hash_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, hash_);
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
    if (!(obj instanceof CommitID)) {
      return super.equals(obj);
    }
    CommitID other = (CommitID) obj;

    if (getVersion()
        != other.getVersion()) return false;
    if (!getHash()
        .equals(other.getHash())) return false;
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
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getVersion());
    hash = (37 * hash) + HASH_FIELD_NUMBER;
    hash = (53 * hash) + getHash().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static CommitID parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CommitID parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CommitID parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CommitID parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CommitID parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CommitID parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CommitID parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CommitID parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static CommitID parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static CommitID parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static CommitID parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CommitID parseFrom(
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
  public static Builder newBuilder(CommitID prototype) {
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
   * CommitID defines the committment information when a specific store is
   * committed.
   * </pre>
   *
   * Protobuf type {@code cosmos.base.store.v1beta1.CommitID}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.base.store.v1beta1.CommitID)
      CommitIDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CommitInfoProto.internal_static_cosmos_base_store_v1beta1_CommitID_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CommitInfoProto.internal_static_cosmos_base_store_v1beta1_CommitID_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CommitID.class, Builder.class);
    }

    // Construct using com.cosmos.base.store.v1beta1.CommitID.newBuilder()
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
      version_ = 0L;
      hash_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return CommitInfoProto.internal_static_cosmos_base_store_v1beta1_CommitID_descriptor;
    }

    @Override
    public CommitID getDefaultInstanceForType() {
      return CommitID.getDefaultInstance();
    }

    @Override
    public CommitID build() {
      CommitID result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public CommitID buildPartial() {
      CommitID result = new CommitID(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(CommitID result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.version_ = version_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.hash_ = hash_;
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
      if (other instanceof CommitID) {
        return mergeFrom((CommitID)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(CommitID other) {
      if (other == CommitID.getDefaultInstance()) return this;
      if (other.getVersion() != 0L) {
        setVersion(other.getVersion());
      }
      if (other.getHash() != com.google.protobuf.ByteString.EMPTY) {
        setHash(other.getHash());
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
            case 8: {
              version_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              hash_ = input.readBytes();
              bitField0_ |= 0x00000002;
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
    @Override
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

    private com.google.protobuf.ByteString hash_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes hash = 2 [json_name = "hash"];</code>
     * @return The hash.
     */
    @Override
    public com.google.protobuf.ByteString getHash() {
      return hash_;
    }
    /**
     * <code>bytes hash = 2 [json_name = "hash"];</code>
     * @param value The hash to set.
     * @return This builder for chaining.
     */
    public Builder setHash(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      hash_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bytes hash = 2 [json_name = "hash"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHash() {
      bitField0_ = (bitField0_ & ~0x00000002);
      hash_ = getDefaultInstance().getHash();
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


    // @@protoc_insertion_point(builder_scope:cosmos.base.store.v1beta1.CommitID)
  }

  // @@protoc_insertion_point(class_scope:cosmos.base.store.v1beta1.CommitID)
  private static final CommitID DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CommitID();
  }

  public static CommitID getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommitID>
      PARSER = new com.google.protobuf.AbstractParser<CommitID>() {
    @Override
    public CommitID parsePartialFrom(
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

  public static com.google.protobuf.Parser<CommitID> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<CommitID> getParserForType() {
    return PARSER;
  }

  @Override
  public CommitID getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

