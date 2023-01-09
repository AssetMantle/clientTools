// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/staking.proto

package com.cosmos.staking.v1beta1;

/**
 * <pre>
 * Commission defines commission parameters for a given validator.
 * </pre>
 *
 * Protobuf type {@code cosmos.staking.v1beta1.Commission}
 */
public final class Commission extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.staking.v1beta1.Commission)
    CommissionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Commission.newBuilder() to construct.
  private Commission(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Commission() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Commission();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.staking.v1beta1.StakingProto.internal_static_cosmos_staking_v1beta1_Commission_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.staking.v1beta1.StakingProto.internal_static_cosmos_staking_v1beta1_Commission_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.staking.v1beta1.Commission.class, com.cosmos.staking.v1beta1.Commission.Builder.class);
  }

  public static final int COMMISSION_RATES_FIELD_NUMBER = 1;
  private com.cosmos.staking.v1beta1.CommissionRates commissionRates_;
  /**
   * <pre>
   * commission_rates defines the initial commission rates to be used for creating a validator.
   * </pre>
   *
   * <code>.cosmos.staking.v1beta1.CommissionRates commission_rates = 1 [json_name = "commissionRates", (.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
   * @return Whether the commissionRates field is set.
   */
  @java.lang.Override
  public boolean hasCommissionRates() {
    return commissionRates_ != null;
  }
  /**
   * <pre>
   * commission_rates defines the initial commission rates to be used for creating a validator.
   * </pre>
   *
   * <code>.cosmos.staking.v1beta1.CommissionRates commission_rates = 1 [json_name = "commissionRates", (.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
   * @return The commissionRates.
   */
  @java.lang.Override
  public com.cosmos.staking.v1beta1.CommissionRates getCommissionRates() {
    return commissionRates_ == null ? com.cosmos.staking.v1beta1.CommissionRates.getDefaultInstance() : commissionRates_;
  }
  /**
   * <pre>
   * commission_rates defines the initial commission rates to be used for creating a validator.
   * </pre>
   *
   * <code>.cosmos.staking.v1beta1.CommissionRates commission_rates = 1 [json_name = "commissionRates", (.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
   */
  @java.lang.Override
  public com.cosmos.staking.v1beta1.CommissionRatesOrBuilder getCommissionRatesOrBuilder() {
    return commissionRates_ == null ? com.cosmos.staking.v1beta1.CommissionRates.getDefaultInstance() : commissionRates_;
  }

  public static final int UPDATE_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp updateTime_;
  /**
   * <pre>
   * update_time is the last time the commission rate was changed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2 [json_name = "updateTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"update_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return Whether the updateTime field is set.
   */
  @java.lang.Override
  public boolean hasUpdateTime() {
    return updateTime_ != null;
  }
  /**
   * <pre>
   * update_time is the last time the commission rate was changed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2 [json_name = "updateTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"update_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return The updateTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUpdateTime() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
  }
  /**
   * <pre>
   * update_time is the last time the commission rate was changed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2 [json_name = "updateTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"update_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
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
    if (commissionRates_ != null) {
      output.writeMessage(1, getCommissionRates());
    }
    if (updateTime_ != null) {
      output.writeMessage(2, getUpdateTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (commissionRates_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCommissionRates());
    }
    if (updateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateTime());
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
    if (!(obj instanceof com.cosmos.staking.v1beta1.Commission)) {
      return super.equals(obj);
    }
    com.cosmos.staking.v1beta1.Commission other = (com.cosmos.staking.v1beta1.Commission) obj;

    if (hasCommissionRates() != other.hasCommissionRates()) return false;
    if (hasCommissionRates()) {
      if (!getCommissionRates()
          .equals(other.getCommissionRates())) return false;
    }
    if (hasUpdateTime() != other.hasUpdateTime()) return false;
    if (hasUpdateTime()) {
      if (!getUpdateTime()
          .equals(other.getUpdateTime())) return false;
    }
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
    if (hasCommissionRates()) {
      hash = (37 * hash) + COMMISSION_RATES_FIELD_NUMBER;
      hash = (53 * hash) + getCommissionRates().hashCode();
    }
    if (hasUpdateTime()) {
      hash = (37 * hash) + UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.staking.v1beta1.Commission parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.staking.v1beta1.Commission parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.staking.v1beta1.Commission parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.staking.v1beta1.Commission parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.staking.v1beta1.Commission parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.staking.v1beta1.Commission parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.staking.v1beta1.Commission parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.staking.v1beta1.Commission parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.staking.v1beta1.Commission parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cosmos.staking.v1beta1.Commission parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.staking.v1beta1.Commission parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.staking.v1beta1.Commission parseFrom(
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
  public static Builder newBuilder(com.cosmos.staking.v1beta1.Commission prototype) {
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
   * Commission defines commission parameters for a given validator.
   * </pre>
   *
   * Protobuf type {@code cosmos.staking.v1beta1.Commission}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.staking.v1beta1.Commission)
      com.cosmos.staking.v1beta1.CommissionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.staking.v1beta1.StakingProto.internal_static_cosmos_staking_v1beta1_Commission_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.staking.v1beta1.StakingProto.internal_static_cosmos_staking_v1beta1_Commission_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.staking.v1beta1.Commission.class, com.cosmos.staking.v1beta1.Commission.Builder.class);
    }

    // Construct using com.cosmos.staking.v1beta1.Commission.newBuilder()
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
      commissionRates_ = null;
      if (commissionRatesBuilder_ != null) {
        commissionRatesBuilder_.dispose();
        commissionRatesBuilder_ = null;
      }
      updateTime_ = null;
      if (updateTimeBuilder_ != null) {
        updateTimeBuilder_.dispose();
        updateTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.staking.v1beta1.StakingProto.internal_static_cosmos_staking_v1beta1_Commission_descriptor;
    }

    @java.lang.Override
    public com.cosmos.staking.v1beta1.Commission getDefaultInstanceForType() {
      return com.cosmos.staking.v1beta1.Commission.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.staking.v1beta1.Commission build() {
      com.cosmos.staking.v1beta1.Commission result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.staking.v1beta1.Commission buildPartial() {
      com.cosmos.staking.v1beta1.Commission result = new com.cosmos.staking.v1beta1.Commission(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.staking.v1beta1.Commission result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.commissionRates_ = commissionRatesBuilder_ == null
            ? commissionRates_
            : commissionRatesBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateTime_ = updateTimeBuilder_ == null
            ? updateTime_
            : updateTimeBuilder_.build();
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
      if (other instanceof com.cosmos.staking.v1beta1.Commission) {
        return mergeFrom((com.cosmos.staking.v1beta1.Commission)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.staking.v1beta1.Commission other) {
      if (other == com.cosmos.staking.v1beta1.Commission.getDefaultInstance()) return this;
      if (other.hasCommissionRates()) {
        mergeCommissionRates(other.getCommissionRates());
      }
      if (other.hasUpdateTime()) {
        mergeUpdateTime(other.getUpdateTime());
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
                  getCommissionRatesFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.cosmos.staking.v1beta1.CommissionRates commissionRates_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.staking.v1beta1.CommissionRates, com.cosmos.staking.v1beta1.CommissionRates.Builder, com.cosmos.staking.v1beta1.CommissionRatesOrBuilder> commissionRatesBuilder_;
    /**
     * <pre>
     * commission_rates defines the initial commission rates to be used for creating a validator.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.CommissionRates commission_rates = 1 [json_name = "commissionRates", (.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     * @return Whether the commissionRates field is set.
     */
    public boolean hasCommissionRates() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * commission_rates defines the initial commission rates to be used for creating a validator.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.CommissionRates commission_rates = 1 [json_name = "commissionRates", (.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     * @return The commissionRates.
     */
    public com.cosmos.staking.v1beta1.CommissionRates getCommissionRates() {
      if (commissionRatesBuilder_ == null) {
        return commissionRates_ == null ? com.cosmos.staking.v1beta1.CommissionRates.getDefaultInstance() : commissionRates_;
      } else {
        return commissionRatesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * commission_rates defines the initial commission rates to be used for creating a validator.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.CommissionRates commission_rates = 1 [json_name = "commissionRates", (.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    public Builder setCommissionRates(com.cosmos.staking.v1beta1.CommissionRates value) {
      if (commissionRatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        commissionRates_ = value;
      } else {
        commissionRatesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * commission_rates defines the initial commission rates to be used for creating a validator.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.CommissionRates commission_rates = 1 [json_name = "commissionRates", (.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    public Builder setCommissionRates(
        com.cosmos.staking.v1beta1.CommissionRates.Builder builderForValue) {
      if (commissionRatesBuilder_ == null) {
        commissionRates_ = builderForValue.build();
      } else {
        commissionRatesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * commission_rates defines the initial commission rates to be used for creating a validator.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.CommissionRates commission_rates = 1 [json_name = "commissionRates", (.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    public Builder mergeCommissionRates(com.cosmos.staking.v1beta1.CommissionRates value) {
      if (commissionRatesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          commissionRates_ != null &&
          commissionRates_ != com.cosmos.staking.v1beta1.CommissionRates.getDefaultInstance()) {
          getCommissionRatesBuilder().mergeFrom(value);
        } else {
          commissionRates_ = value;
        }
      } else {
        commissionRatesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * commission_rates defines the initial commission rates to be used for creating a validator.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.CommissionRates commission_rates = 1 [json_name = "commissionRates", (.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    public Builder clearCommissionRates() {
      bitField0_ = (bitField0_ & ~0x00000001);
      commissionRates_ = null;
      if (commissionRatesBuilder_ != null) {
        commissionRatesBuilder_.dispose();
        commissionRatesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * commission_rates defines the initial commission rates to be used for creating a validator.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.CommissionRates commission_rates = 1 [json_name = "commissionRates", (.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    public com.cosmos.staking.v1beta1.CommissionRates.Builder getCommissionRatesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCommissionRatesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * commission_rates defines the initial commission rates to be used for creating a validator.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.CommissionRates commission_rates = 1 [json_name = "commissionRates", (.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    public com.cosmos.staking.v1beta1.CommissionRatesOrBuilder getCommissionRatesOrBuilder() {
      if (commissionRatesBuilder_ != null) {
        return commissionRatesBuilder_.getMessageOrBuilder();
      } else {
        return commissionRates_ == null ?
            com.cosmos.staking.v1beta1.CommissionRates.getDefaultInstance() : commissionRates_;
      }
    }
    /**
     * <pre>
     * commission_rates defines the initial commission rates to be used for creating a validator.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.CommissionRates commission_rates = 1 [json_name = "commissionRates", (.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.staking.v1beta1.CommissionRates, com.cosmos.staking.v1beta1.CommissionRates.Builder, com.cosmos.staking.v1beta1.CommissionRatesOrBuilder> 
        getCommissionRatesFieldBuilder() {
      if (commissionRatesBuilder_ == null) {
        commissionRatesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.staking.v1beta1.CommissionRates, com.cosmos.staking.v1beta1.CommissionRates.Builder, com.cosmos.staking.v1beta1.CommissionRatesOrBuilder>(
                getCommissionRates(),
                getParentForChildren(),
                isClean());
        commissionRates_ = null;
      }
      return commissionRatesBuilder_;
    }

    private com.google.protobuf.Timestamp updateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> updateTimeBuilder_;
    /**
     * <pre>
     * update_time is the last time the commission rate was changed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2 [json_name = "updateTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"update_time&#92;"", (.gogoproto.stdtime) = true];</code>
     * @return Whether the updateTime field is set.
     */
    public boolean hasUpdateTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * update_time is the last time the commission rate was changed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2 [json_name = "updateTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"update_time&#92;"", (.gogoproto.stdtime) = true];</code>
     * @return The updateTime.
     */
    public com.google.protobuf.Timestamp getUpdateTime() {
      if (updateTimeBuilder_ == null) {
        return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
      } else {
        return updateTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * update_time is the last time the commission rate was changed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2 [json_name = "updateTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"update_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateTime_ = value;
      } else {
        updateTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * update_time is the last time the commission rate was changed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2 [json_name = "updateTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"update_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public Builder setUpdateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updateTimeBuilder_ == null) {
        updateTime_ = builderForValue.build();
      } else {
        updateTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * update_time is the last time the commission rate was changed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2 [json_name = "updateTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"update_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public Builder mergeUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateTime_ != null &&
          updateTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getUpdateTimeBuilder().mergeFrom(value);
        } else {
          updateTime_ = value;
        }
      } else {
        updateTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * update_time is the last time the commission rate was changed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2 [json_name = "updateTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"update_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public Builder clearUpdateTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateTime_ = null;
      if (updateTimeBuilder_ != null) {
        updateTimeBuilder_.dispose();
        updateTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * update_time is the last time the commission rate was changed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2 [json_name = "updateTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"update_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdateTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * update_time is the last time the commission rate was changed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2 [json_name = "updateTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"update_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
      if (updateTimeBuilder_ != null) {
        return updateTimeBuilder_.getMessageOrBuilder();
      } else {
        return updateTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
      }
    }
    /**
     * <pre>
     * update_time is the last time the commission rate was changed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2 [json_name = "updateTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"update_time&#92;"", (.gogoproto.stdtime) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getUpdateTimeFieldBuilder() {
      if (updateTimeBuilder_ == null) {
        updateTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getUpdateTime(),
                getParentForChildren(),
                isClean());
        updateTime_ = null;
      }
      return updateTimeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.staking.v1beta1.Commission)
  }

  // @@protoc_insertion_point(class_scope:cosmos.staking.v1beta1.Commission)
  private static final com.cosmos.staking.v1beta1.Commission DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.staking.v1beta1.Commission();
  }

  public static com.cosmos.staking.v1beta1.Commission getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Commission>
      PARSER = new com.google.protobuf.AbstractParser<Commission>() {
    @java.lang.Override
    public Commission parsePartialFrom(
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

  public static com.google.protobuf.Parser<Commission> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Commission> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.staking.v1beta1.Commission getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

