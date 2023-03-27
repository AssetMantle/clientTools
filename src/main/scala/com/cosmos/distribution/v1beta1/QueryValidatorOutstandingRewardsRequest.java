// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/query.proto

package com.cosmos.distribution.v1beta1;

/**
 * <pre>
 * QueryValidatorOutstandingRewardsRequest is the request type for the
 * Query/ValidatorOutstandingRewards RPC method.
 * </pre>
 *
 * Protobuf type {@code cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsRequest}
 */
public final class QueryValidatorOutstandingRewardsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsRequest)
    QueryValidatorOutstandingRewardsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryValidatorOutstandingRewardsRequest.newBuilder() to construct.
  private QueryValidatorOutstandingRewardsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryValidatorOutstandingRewardsRequest() {
    validatorAddress_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryValidatorOutstandingRewardsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return QueryProto.internal_static_cosmos_distribution_v1beta1_QueryValidatorOutstandingRewardsRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return QueryProto.internal_static_cosmos_distribution_v1beta1_QueryValidatorOutstandingRewardsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            QueryValidatorOutstandingRewardsRequest.class, Builder.class);
  }

  public static final int VALIDATOR_ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile Object validatorAddress_ = "";
  /**
   * <pre>
   * validator_address defines the validator address to query for.
   * </pre>
   *
   * <code>string validator_address = 1 [json_name = "validatorAddress"];</code>
   * @return The validatorAddress.
   */
  @Override
  public String getValidatorAddress() {
    Object ref = validatorAddress_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      validatorAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * validator_address defines the validator address to query for.
   * </pre>
   *
   * <code>string validator_address = 1 [json_name = "validatorAddress"];</code>
   * @return The bytes for validatorAddress.
   */
  @Override
  public com.google.protobuf.ByteString
      getValidatorAddressBytes() {
    Object ref = validatorAddress_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      validatorAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(validatorAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, validatorAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(validatorAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, validatorAddress_);
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
    if (!(obj instanceof QueryValidatorOutstandingRewardsRequest)) {
      return super.equals(obj);
    }
    QueryValidatorOutstandingRewardsRequest other = (QueryValidatorOutstandingRewardsRequest) obj;

    if (!getValidatorAddress()
        .equals(other.getValidatorAddress())) return false;
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
    hash = (37 * hash) + VALIDATOR_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getValidatorAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static QueryValidatorOutstandingRewardsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryValidatorOutstandingRewardsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryValidatorOutstandingRewardsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryValidatorOutstandingRewardsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryValidatorOutstandingRewardsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryValidatorOutstandingRewardsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryValidatorOutstandingRewardsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static QueryValidatorOutstandingRewardsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static QueryValidatorOutstandingRewardsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static QueryValidatorOutstandingRewardsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static QueryValidatorOutstandingRewardsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static QueryValidatorOutstandingRewardsRequest parseFrom(
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
  public static Builder newBuilder(QueryValidatorOutstandingRewardsRequest prototype) {
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
   * QueryValidatorOutstandingRewardsRequest is the request type for the
   * Query/ValidatorOutstandingRewards RPC method.
   * </pre>
   *
   * Protobuf type {@code cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsRequest)
      QueryValidatorOutstandingRewardsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return QueryProto.internal_static_cosmos_distribution_v1beta1_QueryValidatorOutstandingRewardsRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return QueryProto.internal_static_cosmos_distribution_v1beta1_QueryValidatorOutstandingRewardsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              QueryValidatorOutstandingRewardsRequest.class, Builder.class);
    }

    // Construct using com.cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsRequest.newBuilder()
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
      validatorAddress_ = "";
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return QueryProto.internal_static_cosmos_distribution_v1beta1_QueryValidatorOutstandingRewardsRequest_descriptor;
    }

    @Override
    public QueryValidatorOutstandingRewardsRequest getDefaultInstanceForType() {
      return QueryValidatorOutstandingRewardsRequest.getDefaultInstance();
    }

    @Override
    public QueryValidatorOutstandingRewardsRequest build() {
      QueryValidatorOutstandingRewardsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public QueryValidatorOutstandingRewardsRequest buildPartial() {
      QueryValidatorOutstandingRewardsRequest result = new QueryValidatorOutstandingRewardsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(QueryValidatorOutstandingRewardsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.validatorAddress_ = validatorAddress_;
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
      if (other instanceof QueryValidatorOutstandingRewardsRequest) {
        return mergeFrom((QueryValidatorOutstandingRewardsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(QueryValidatorOutstandingRewardsRequest other) {
      if (other == QueryValidatorOutstandingRewardsRequest.getDefaultInstance()) return this;
      if (!other.getValidatorAddress().isEmpty()) {
        validatorAddress_ = other.validatorAddress_;
        bitField0_ |= 0x00000001;
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
              validatorAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private Object validatorAddress_ = "";
    /**
     * <pre>
     * validator_address defines the validator address to query for.
     * </pre>
     *
     * <code>string validator_address = 1 [json_name = "validatorAddress"];</code>
     * @return The validatorAddress.
     */
    public String getValidatorAddress() {
      Object ref = validatorAddress_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        validatorAddress_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * validator_address defines the validator address to query for.
     * </pre>
     *
     * <code>string validator_address = 1 [json_name = "validatorAddress"];</code>
     * @return The bytes for validatorAddress.
     */
    public com.google.protobuf.ByteString
        getValidatorAddressBytes() {
      Object ref = validatorAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        validatorAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * validator_address defines the validator address to query for.
     * </pre>
     *
     * <code>string validator_address = 1 [json_name = "validatorAddress"];</code>
     * @param value The validatorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setValidatorAddress(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      validatorAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * validator_address defines the validator address to query for.
     * </pre>
     *
     * <code>string validator_address = 1 [json_name = "validatorAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValidatorAddress() {
      validatorAddress_ = getDefaultInstance().getValidatorAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * validator_address defines the validator address to query for.
     * </pre>
     *
     * <code>string validator_address = 1 [json_name = "validatorAddress"];</code>
     * @param value The bytes for validatorAddress to set.
     * @return This builder for chaining.
     */
    public Builder setValidatorAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      validatorAddress_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsRequest)
  }

  // @@protoc_insertion_point(class_scope:cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsRequest)
  private static final QueryValidatorOutstandingRewardsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new QueryValidatorOutstandingRewardsRequest();
  }

  public static QueryValidatorOutstandingRewardsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryValidatorOutstandingRewardsRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryValidatorOutstandingRewardsRequest>() {
    @Override
    public QueryValidatorOutstandingRewardsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryValidatorOutstandingRewardsRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<QueryValidatorOutstandingRewardsRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public QueryValidatorOutstandingRewardsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

