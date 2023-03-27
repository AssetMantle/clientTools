// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package com.cosmos.staking.v1beta1;

/**
 * <pre>
 * QueryDelegatorValidatorResponse response type for the
 * Query/DelegatorValidator RPC method.
 * </pre>
 *
 * Protobuf type {@code cosmos.staking.v1beta1.QueryDelegatorValidatorResponse}
 */
public final class QueryDelegatorValidatorResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.staking.v1beta1.QueryDelegatorValidatorResponse)
    QueryDelegatorValidatorResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryDelegatorValidatorResponse.newBuilder() to construct.
  private QueryDelegatorValidatorResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryDelegatorValidatorResponse() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryDelegatorValidatorResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return QueryProto.internal_static_cosmos_staking_v1beta1_QueryDelegatorValidatorResponse_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return QueryProto.internal_static_cosmos_staking_v1beta1_QueryDelegatorValidatorResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            QueryDelegatorValidatorResponse.class, Builder.class);
  }

  public static final int VALIDATOR_FIELD_NUMBER = 1;
  private Validator validator_;
  /**
   * <pre>
   * validator defines the the validator info.
   * </pre>
   *
   * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
   * @return Whether the validator field is set.
   */
  @Override
  public boolean hasValidator() {
    return validator_ != null;
  }
  /**
   * <pre>
   * validator defines the the validator info.
   * </pre>
   *
   * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
   * @return The validator.
   */
  @Override
  public Validator getValidator() {
    return validator_ == null ? Validator.getDefaultInstance() : validator_;
  }
  /**
   * <pre>
   * validator defines the the validator info.
   * </pre>
   *
   * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
   */
  @Override
  public ValidatorOrBuilder getValidatorOrBuilder() {
    return validator_ == null ? Validator.getDefaultInstance() : validator_;
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
    if (validator_ != null) {
      output.writeMessage(1, getValidator());
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (validator_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getValidator());
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
    if (!(obj instanceof QueryDelegatorValidatorResponse)) {
      return super.equals(obj);
    }
    QueryDelegatorValidatorResponse other = (QueryDelegatorValidatorResponse) obj;

    if (hasValidator() != other.hasValidator()) return false;
    if (hasValidator()) {
      if (!getValidator()
          .equals(other.getValidator())) return false;
    }
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
    if (hasValidator()) {
      hash = (37 * hash) + VALIDATOR_FIELD_NUMBER;
      hash = (53 * hash) + getValidator().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static QueryDelegatorValidatorResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryDelegatorValidatorResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryDelegatorValidatorResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryDelegatorValidatorResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryDelegatorValidatorResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryDelegatorValidatorResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryDelegatorValidatorResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static QueryDelegatorValidatorResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static QueryDelegatorValidatorResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static QueryDelegatorValidatorResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static QueryDelegatorValidatorResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static QueryDelegatorValidatorResponse parseFrom(
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
  public static Builder newBuilder(QueryDelegatorValidatorResponse prototype) {
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
   * QueryDelegatorValidatorResponse response type for the
   * Query/DelegatorValidator RPC method.
   * </pre>
   *
   * Protobuf type {@code cosmos.staking.v1beta1.QueryDelegatorValidatorResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.staking.v1beta1.QueryDelegatorValidatorResponse)
      QueryDelegatorValidatorResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return QueryProto.internal_static_cosmos_staking_v1beta1_QueryDelegatorValidatorResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return QueryProto.internal_static_cosmos_staking_v1beta1_QueryDelegatorValidatorResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              QueryDelegatorValidatorResponse.class, Builder.class);
    }

    // Construct using com.cosmos.staking.v1beta1.QueryDelegatorValidatorResponse.newBuilder()
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
      validator_ = null;
      if (validatorBuilder_ != null) {
        validatorBuilder_.dispose();
        validatorBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return QueryProto.internal_static_cosmos_staking_v1beta1_QueryDelegatorValidatorResponse_descriptor;
    }

    @Override
    public QueryDelegatorValidatorResponse getDefaultInstanceForType() {
      return QueryDelegatorValidatorResponse.getDefaultInstance();
    }

    @Override
    public QueryDelegatorValidatorResponse build() {
      QueryDelegatorValidatorResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public QueryDelegatorValidatorResponse buildPartial() {
      QueryDelegatorValidatorResponse result = new QueryDelegatorValidatorResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(QueryDelegatorValidatorResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.validator_ = validatorBuilder_ == null
            ? validator_
            : validatorBuilder_.build();
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
      if (other instanceof QueryDelegatorValidatorResponse) {
        return mergeFrom((QueryDelegatorValidatorResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(QueryDelegatorValidatorResponse other) {
      if (other == QueryDelegatorValidatorResponse.getDefaultInstance()) return this;
      if (other.hasValidator()) {
        mergeValidator(other.getValidator());
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
                  getValidatorFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private Validator validator_;
    private com.google.protobuf.SingleFieldBuilderV3<
        Validator, Validator.Builder, ValidatorOrBuilder> validatorBuilder_;
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     * @return Whether the validator field is set.
     */
    public boolean hasValidator() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     * @return The validator.
     */
    public Validator getValidator() {
      if (validatorBuilder_ == null) {
        return validator_ == null ? Validator.getDefaultInstance() : validator_;
      } else {
        return validatorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     */
    public Builder setValidator(Validator value) {
      if (validatorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        validator_ = value;
      } else {
        validatorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     */
    public Builder setValidator(
        Validator.Builder builderForValue) {
      if (validatorBuilder_ == null) {
        validator_ = builderForValue.build();
      } else {
        validatorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeValidator(Validator value) {
      if (validatorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          validator_ != null &&
          validator_ != Validator.getDefaultInstance()) {
          getValidatorBuilder().mergeFrom(value);
        } else {
          validator_ = value;
        }
      } else {
        validatorBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearValidator() {
      bitField0_ = (bitField0_ & ~0x00000001);
      validator_ = null;
      if (validatorBuilder_ != null) {
        validatorBuilder_.dispose();
        validatorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     */
    public Validator.Builder getValidatorBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getValidatorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     */
    public ValidatorOrBuilder getValidatorOrBuilder() {
      if (validatorBuilder_ != null) {
        return validatorBuilder_.getMessageOrBuilder();
      } else {
        return validator_ == null ?
            Validator.getDefaultInstance() : validator_;
      }
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        Validator, Validator.Builder, ValidatorOrBuilder>
        getValidatorFieldBuilder() {
      if (validatorBuilder_ == null) {
        validatorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            Validator, Validator.Builder, ValidatorOrBuilder>(
                getValidator(),
                getParentForChildren(),
                isClean());
        validator_ = null;
      }
      return validatorBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.staking.v1beta1.QueryDelegatorValidatorResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.staking.v1beta1.QueryDelegatorValidatorResponse)
  private static final QueryDelegatorValidatorResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new QueryDelegatorValidatorResponse();
  }

  public static QueryDelegatorValidatorResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryDelegatorValidatorResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryDelegatorValidatorResponse>() {
    @Override
    public QueryDelegatorValidatorResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryDelegatorValidatorResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<QueryDelegatorValidatorResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public QueryDelegatorValidatorResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

