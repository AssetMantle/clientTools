// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/vesting/v1beta1/vesting.proto

package com.cosmos.vesting.v1beta1;

/**
 * <pre>
 * ContinuousVestingAccount implements the VestingAccount interface. It
 * continuously vests by unlocking coins linearly with respect to time.
 * </pre>
 *
 * Protobuf type {@code cosmos.vesting.v1beta1.ContinuousVestingAccount}
 */
public final class ContinuousVestingAccount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.vesting.v1beta1.ContinuousVestingAccount)
    ContinuousVestingAccountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ContinuousVestingAccount.newBuilder() to construct.
  private ContinuousVestingAccount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ContinuousVestingAccount() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ContinuousVestingAccount();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.vesting.v1beta1.VestingProto.internal_static_cosmos_vesting_v1beta1_ContinuousVestingAccount_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.vesting.v1beta1.VestingProto.internal_static_cosmos_vesting_v1beta1_ContinuousVestingAccount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.vesting.v1beta1.ContinuousVestingAccount.class, com.cosmos.vesting.v1beta1.ContinuousVestingAccount.Builder.class);
  }

  public static final int BASE_VESTING_ACCOUNT_FIELD_NUMBER = 1;
  private com.cosmos.vesting.v1beta1.BaseVestingAccount baseVestingAccount_;
  /**
   * <code>.cosmos.vesting.v1beta1.BaseVestingAccount base_vesting_account = 1 [json_name = "baseVestingAccount", (.gogoproto.embed) = true];</code>
   * @return Whether the baseVestingAccount field is set.
   */
  @java.lang.Override
  public boolean hasBaseVestingAccount() {
    return baseVestingAccount_ != null;
  }
  /**
   * <code>.cosmos.vesting.v1beta1.BaseVestingAccount base_vesting_account = 1 [json_name = "baseVestingAccount", (.gogoproto.embed) = true];</code>
   * @return The baseVestingAccount.
   */
  @java.lang.Override
  public com.cosmos.vesting.v1beta1.BaseVestingAccount getBaseVestingAccount() {
    return baseVestingAccount_ == null ? com.cosmos.vesting.v1beta1.BaseVestingAccount.getDefaultInstance() : baseVestingAccount_;
  }
  /**
   * <code>.cosmos.vesting.v1beta1.BaseVestingAccount base_vesting_account = 1 [json_name = "baseVestingAccount", (.gogoproto.embed) = true];</code>
   */
  @java.lang.Override
  public com.cosmos.vesting.v1beta1.BaseVestingAccountOrBuilder getBaseVestingAccountOrBuilder() {
    return baseVestingAccount_ == null ? com.cosmos.vesting.v1beta1.BaseVestingAccount.getDefaultInstance() : baseVestingAccount_;
  }

  public static final int START_TIME_FIELD_NUMBER = 2;
  private long startTime_ = 0L;
  /**
   * <code>int64 start_time = 2 [json_name = "startTime", (.gogoproto.moretags) = "yaml:&#92;"start_time&#92;""];</code>
   * @return The startTime.
   */
  @java.lang.Override
  public long getStartTime() {
    return startTime_;
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
    if (baseVestingAccount_ != null) {
      output.writeMessage(1, getBaseVestingAccount());
    }
    if (startTime_ != 0L) {
      output.writeInt64(2, startTime_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (baseVestingAccount_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBaseVestingAccount());
    }
    if (startTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, startTime_);
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
    if (!(obj instanceof com.cosmos.vesting.v1beta1.ContinuousVestingAccount)) {
      return super.equals(obj);
    }
    com.cosmos.vesting.v1beta1.ContinuousVestingAccount other = (com.cosmos.vesting.v1beta1.ContinuousVestingAccount) obj;

    if (hasBaseVestingAccount() != other.hasBaseVestingAccount()) return false;
    if (hasBaseVestingAccount()) {
      if (!getBaseVestingAccount()
          .equals(other.getBaseVestingAccount())) return false;
    }
    if (getStartTime()
        != other.getStartTime()) return false;
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
    if (hasBaseVestingAccount()) {
      hash = (37 * hash) + BASE_VESTING_ACCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getBaseVestingAccount().hashCode();
    }
    hash = (37 * hash) + START_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartTime());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.vesting.v1beta1.ContinuousVestingAccount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.vesting.v1beta1.ContinuousVestingAccount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.vesting.v1beta1.ContinuousVestingAccount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.vesting.v1beta1.ContinuousVestingAccount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.vesting.v1beta1.ContinuousVestingAccount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.vesting.v1beta1.ContinuousVestingAccount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.vesting.v1beta1.ContinuousVestingAccount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.vesting.v1beta1.ContinuousVestingAccount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.vesting.v1beta1.ContinuousVestingAccount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cosmos.vesting.v1beta1.ContinuousVestingAccount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.vesting.v1beta1.ContinuousVestingAccount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.vesting.v1beta1.ContinuousVestingAccount parseFrom(
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
  public static Builder newBuilder(com.cosmos.vesting.v1beta1.ContinuousVestingAccount prototype) {
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
   * ContinuousVestingAccount implements the VestingAccount interface. It
   * continuously vests by unlocking coins linearly with respect to time.
   * </pre>
   *
   * Protobuf type {@code cosmos.vesting.v1beta1.ContinuousVestingAccount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.vesting.v1beta1.ContinuousVestingAccount)
      com.cosmos.vesting.v1beta1.ContinuousVestingAccountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.vesting.v1beta1.VestingProto.internal_static_cosmos_vesting_v1beta1_ContinuousVestingAccount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.vesting.v1beta1.VestingProto.internal_static_cosmos_vesting_v1beta1_ContinuousVestingAccount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.vesting.v1beta1.ContinuousVestingAccount.class, com.cosmos.vesting.v1beta1.ContinuousVestingAccount.Builder.class);
    }

    // Construct using com.cosmos.vesting.v1beta1.ContinuousVestingAccount.newBuilder()
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
      baseVestingAccount_ = null;
      if (baseVestingAccountBuilder_ != null) {
        baseVestingAccountBuilder_.dispose();
        baseVestingAccountBuilder_ = null;
      }
      startTime_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.vesting.v1beta1.VestingProto.internal_static_cosmos_vesting_v1beta1_ContinuousVestingAccount_descriptor;
    }

    @java.lang.Override
    public com.cosmos.vesting.v1beta1.ContinuousVestingAccount getDefaultInstanceForType() {
      return com.cosmos.vesting.v1beta1.ContinuousVestingAccount.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.vesting.v1beta1.ContinuousVestingAccount build() {
      com.cosmos.vesting.v1beta1.ContinuousVestingAccount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.vesting.v1beta1.ContinuousVestingAccount buildPartial() {
      com.cosmos.vesting.v1beta1.ContinuousVestingAccount result = new com.cosmos.vesting.v1beta1.ContinuousVestingAccount(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.vesting.v1beta1.ContinuousVestingAccount result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.baseVestingAccount_ = baseVestingAccountBuilder_ == null
            ? baseVestingAccount_
            : baseVestingAccountBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.startTime_ = startTime_;
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
      if (other instanceof com.cosmos.vesting.v1beta1.ContinuousVestingAccount) {
        return mergeFrom((com.cosmos.vesting.v1beta1.ContinuousVestingAccount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.vesting.v1beta1.ContinuousVestingAccount other) {
      if (other == com.cosmos.vesting.v1beta1.ContinuousVestingAccount.getDefaultInstance()) return this;
      if (other.hasBaseVestingAccount()) {
        mergeBaseVestingAccount(other.getBaseVestingAccount());
      }
      if (other.getStartTime() != 0L) {
        setStartTime(other.getStartTime());
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
                  getBaseVestingAccountFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              startTime_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private com.cosmos.vesting.v1beta1.BaseVestingAccount baseVestingAccount_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.vesting.v1beta1.BaseVestingAccount, com.cosmos.vesting.v1beta1.BaseVestingAccount.Builder, com.cosmos.vesting.v1beta1.BaseVestingAccountOrBuilder> baseVestingAccountBuilder_;
    /**
     * <code>.cosmos.vesting.v1beta1.BaseVestingAccount base_vesting_account = 1 [json_name = "baseVestingAccount", (.gogoproto.embed) = true];</code>
     * @return Whether the baseVestingAccount field is set.
     */
    public boolean hasBaseVestingAccount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.cosmos.vesting.v1beta1.BaseVestingAccount base_vesting_account = 1 [json_name = "baseVestingAccount", (.gogoproto.embed) = true];</code>
     * @return The baseVestingAccount.
     */
    public com.cosmos.vesting.v1beta1.BaseVestingAccount getBaseVestingAccount() {
      if (baseVestingAccountBuilder_ == null) {
        return baseVestingAccount_ == null ? com.cosmos.vesting.v1beta1.BaseVestingAccount.getDefaultInstance() : baseVestingAccount_;
      } else {
        return baseVestingAccountBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.vesting.v1beta1.BaseVestingAccount base_vesting_account = 1 [json_name = "baseVestingAccount", (.gogoproto.embed) = true];</code>
     */
    public Builder setBaseVestingAccount(com.cosmos.vesting.v1beta1.BaseVestingAccount value) {
      if (baseVestingAccountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        baseVestingAccount_ = value;
      } else {
        baseVestingAccountBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.vesting.v1beta1.BaseVestingAccount base_vesting_account = 1 [json_name = "baseVestingAccount", (.gogoproto.embed) = true];</code>
     */
    public Builder setBaseVestingAccount(
        com.cosmos.vesting.v1beta1.BaseVestingAccount.Builder builderForValue) {
      if (baseVestingAccountBuilder_ == null) {
        baseVestingAccount_ = builderForValue.build();
      } else {
        baseVestingAccountBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.vesting.v1beta1.BaseVestingAccount base_vesting_account = 1 [json_name = "baseVestingAccount", (.gogoproto.embed) = true];</code>
     */
    public Builder mergeBaseVestingAccount(com.cosmos.vesting.v1beta1.BaseVestingAccount value) {
      if (baseVestingAccountBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          baseVestingAccount_ != null &&
          baseVestingAccount_ != com.cosmos.vesting.v1beta1.BaseVestingAccount.getDefaultInstance()) {
          getBaseVestingAccountBuilder().mergeFrom(value);
        } else {
          baseVestingAccount_ = value;
        }
      } else {
        baseVestingAccountBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.vesting.v1beta1.BaseVestingAccount base_vesting_account = 1 [json_name = "baseVestingAccount", (.gogoproto.embed) = true];</code>
     */
    public Builder clearBaseVestingAccount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      baseVestingAccount_ = null;
      if (baseVestingAccountBuilder_ != null) {
        baseVestingAccountBuilder_.dispose();
        baseVestingAccountBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.vesting.v1beta1.BaseVestingAccount base_vesting_account = 1 [json_name = "baseVestingAccount", (.gogoproto.embed) = true];</code>
     */
    public com.cosmos.vesting.v1beta1.BaseVestingAccount.Builder getBaseVestingAccountBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBaseVestingAccountFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.vesting.v1beta1.BaseVestingAccount base_vesting_account = 1 [json_name = "baseVestingAccount", (.gogoproto.embed) = true];</code>
     */
    public com.cosmos.vesting.v1beta1.BaseVestingAccountOrBuilder getBaseVestingAccountOrBuilder() {
      if (baseVestingAccountBuilder_ != null) {
        return baseVestingAccountBuilder_.getMessageOrBuilder();
      } else {
        return baseVestingAccount_ == null ?
            com.cosmos.vesting.v1beta1.BaseVestingAccount.getDefaultInstance() : baseVestingAccount_;
      }
    }
    /**
     * <code>.cosmos.vesting.v1beta1.BaseVestingAccount base_vesting_account = 1 [json_name = "baseVestingAccount", (.gogoproto.embed) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.vesting.v1beta1.BaseVestingAccount, com.cosmos.vesting.v1beta1.BaseVestingAccount.Builder, com.cosmos.vesting.v1beta1.BaseVestingAccountOrBuilder> 
        getBaseVestingAccountFieldBuilder() {
      if (baseVestingAccountBuilder_ == null) {
        baseVestingAccountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.vesting.v1beta1.BaseVestingAccount, com.cosmos.vesting.v1beta1.BaseVestingAccount.Builder, com.cosmos.vesting.v1beta1.BaseVestingAccountOrBuilder>(
                getBaseVestingAccount(),
                getParentForChildren(),
                isClean());
        baseVestingAccount_ = null;
      }
      return baseVestingAccountBuilder_;
    }

    private long startTime_ ;
    /**
     * <code>int64 start_time = 2 [json_name = "startTime", (.gogoproto.moretags) = "yaml:&#92;"start_time&#92;""];</code>
     * @return The startTime.
     */
    @java.lang.Override
    public long getStartTime() {
      return startTime_;
    }
    /**
     * <code>int64 start_time = 2 [json_name = "startTime", (.gogoproto.moretags) = "yaml:&#92;"start_time&#92;""];</code>
     * @param value The startTime to set.
     * @return This builder for chaining.
     */
    public Builder setStartTime(long value) {

      startTime_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 start_time = 2 [json_name = "startTime", (.gogoproto.moretags) = "yaml:&#92;"start_time&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearStartTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      startTime_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:cosmos.vesting.v1beta1.ContinuousVestingAccount)
  }

  // @@protoc_insertion_point(class_scope:cosmos.vesting.v1beta1.ContinuousVestingAccount)
  private static final com.cosmos.vesting.v1beta1.ContinuousVestingAccount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.vesting.v1beta1.ContinuousVestingAccount();
  }

  public static com.cosmos.vesting.v1beta1.ContinuousVestingAccount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContinuousVestingAccount>
      PARSER = new com.google.protobuf.AbstractParser<ContinuousVestingAccount>() {
    @java.lang.Override
    public ContinuousVestingAccount parsePartialFrom(
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

  public static com.google.protobuf.Parser<ContinuousVestingAccount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContinuousVestingAccount> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.vesting.v1beta1.ContinuousVestingAccount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

