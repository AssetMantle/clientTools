// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package com.cosmos.staking.v1beta1;

/**
 * <pre>
 * QueryRedelegationsResponse is response type for the Query/Redelegations RPC
 * method.
 * </pre>
 *
 * Protobuf type {@code cosmos.staking.v1beta1.QueryRedelegationsResponse}
 */
public final class QueryRedelegationsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.staking.v1beta1.QueryRedelegationsResponse)
    QueryRedelegationsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryRedelegationsResponse.newBuilder() to construct.
  private QueryRedelegationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryRedelegationsResponse() {
    redelegationResponses_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryRedelegationsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.staking.v1beta1.QueryProto.internal_static_cosmos_staking_v1beta1_QueryRedelegationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.staking.v1beta1.QueryProto.internal_static_cosmos_staking_v1beta1_QueryRedelegationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.staking.v1beta1.QueryRedelegationsResponse.class, com.cosmos.staking.v1beta1.QueryRedelegationsResponse.Builder.class);
  }

  public static final int REDELEGATION_RESPONSES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.cosmos.staking.v1beta1.RedelegationResponse> redelegationResponses_;
  /**
   * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [json_name = "redelegationResponses", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.cosmos.staking.v1beta1.RedelegationResponse> getRedelegationResponsesList() {
    return redelegationResponses_;
  }
  /**
   * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [json_name = "redelegationResponses", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.cosmos.staking.v1beta1.RedelegationResponseOrBuilder> 
      getRedelegationResponsesOrBuilderList() {
    return redelegationResponses_;
  }
  /**
   * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [json_name = "redelegationResponses", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getRedelegationResponsesCount() {
    return redelegationResponses_.size();
  }
  /**
   * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [json_name = "redelegationResponses", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.cosmos.staking.v1beta1.RedelegationResponse getRedelegationResponses(int index) {
    return redelegationResponses_.get(index);
  }
  /**
   * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [json_name = "redelegationResponses", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.cosmos.staking.v1beta1.RedelegationResponseOrBuilder getRedelegationResponsesOrBuilder(
      int index) {
    return redelegationResponses_.get(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private com.cosmos.base.query.v1beta1.PageResponse pagination_;
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
  }
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
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
    for (int i = 0; i < redelegationResponses_.size(); i++) {
      output.writeMessage(1, redelegationResponses_.get(i));
    }
    if (pagination_ != null) {
      output.writeMessage(2, getPagination());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < redelegationResponses_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, redelegationResponses_.get(i));
    }
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPagination());
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
    if (!(obj instanceof com.cosmos.staking.v1beta1.QueryRedelegationsResponse)) {
      return super.equals(obj);
    }
    com.cosmos.staking.v1beta1.QueryRedelegationsResponse other = (com.cosmos.staking.v1beta1.QueryRedelegationsResponse) obj;

    if (!getRedelegationResponsesList()
        .equals(other.getRedelegationResponsesList())) return false;
    if (hasPagination() != other.hasPagination()) return false;
    if (hasPagination()) {
      if (!getPagination()
          .equals(other.getPagination())) return false;
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
    if (getRedelegationResponsesCount() > 0) {
      hash = (37 * hash) + REDELEGATION_RESPONSES_FIELD_NUMBER;
      hash = (53 * hash) + getRedelegationResponsesList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.staking.v1beta1.QueryRedelegationsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.staking.v1beta1.QueryRedelegationsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.staking.v1beta1.QueryRedelegationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.staking.v1beta1.QueryRedelegationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.staking.v1beta1.QueryRedelegationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.staking.v1beta1.QueryRedelegationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.staking.v1beta1.QueryRedelegationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.staking.v1beta1.QueryRedelegationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.staking.v1beta1.QueryRedelegationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cosmos.staking.v1beta1.QueryRedelegationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.staking.v1beta1.QueryRedelegationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.staking.v1beta1.QueryRedelegationsResponse parseFrom(
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
  public static Builder newBuilder(com.cosmos.staking.v1beta1.QueryRedelegationsResponse prototype) {
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
   * QueryRedelegationsResponse is response type for the Query/Redelegations RPC
   * method.
   * </pre>
   *
   * Protobuf type {@code cosmos.staking.v1beta1.QueryRedelegationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.staking.v1beta1.QueryRedelegationsResponse)
      com.cosmos.staking.v1beta1.QueryRedelegationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.staking.v1beta1.QueryProto.internal_static_cosmos_staking_v1beta1_QueryRedelegationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.staking.v1beta1.QueryProto.internal_static_cosmos_staking_v1beta1_QueryRedelegationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.staking.v1beta1.QueryRedelegationsResponse.class, com.cosmos.staking.v1beta1.QueryRedelegationsResponse.Builder.class);
    }

    // Construct using com.cosmos.staking.v1beta1.QueryRedelegationsResponse.newBuilder()
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
      if (redelegationResponsesBuilder_ == null) {
        redelegationResponses_ = java.util.Collections.emptyList();
      } else {
        redelegationResponses_ = null;
        redelegationResponsesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.staking.v1beta1.QueryProto.internal_static_cosmos_staking_v1beta1_QueryRedelegationsResponse_descriptor;
    }

    @java.lang.Override
    public com.cosmos.staking.v1beta1.QueryRedelegationsResponse getDefaultInstanceForType() {
      return com.cosmos.staking.v1beta1.QueryRedelegationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.staking.v1beta1.QueryRedelegationsResponse build() {
      com.cosmos.staking.v1beta1.QueryRedelegationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.staking.v1beta1.QueryRedelegationsResponse buildPartial() {
      com.cosmos.staking.v1beta1.QueryRedelegationsResponse result = new com.cosmos.staking.v1beta1.QueryRedelegationsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.cosmos.staking.v1beta1.QueryRedelegationsResponse result) {
      if (redelegationResponsesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          redelegationResponses_ = java.util.Collections.unmodifiableList(redelegationResponses_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.redelegationResponses_ = redelegationResponses_;
      } else {
        result.redelegationResponses_ = redelegationResponsesBuilder_.build();
      }
    }

    private void buildPartial0(com.cosmos.staking.v1beta1.QueryRedelegationsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
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
      if (other instanceof com.cosmos.staking.v1beta1.QueryRedelegationsResponse) {
        return mergeFrom((com.cosmos.staking.v1beta1.QueryRedelegationsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.staking.v1beta1.QueryRedelegationsResponse other) {
      if (other == com.cosmos.staking.v1beta1.QueryRedelegationsResponse.getDefaultInstance()) return this;
      if (redelegationResponsesBuilder_ == null) {
        if (!other.redelegationResponses_.isEmpty()) {
          if (redelegationResponses_.isEmpty()) {
            redelegationResponses_ = other.redelegationResponses_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRedelegationResponsesIsMutable();
            redelegationResponses_.addAll(other.redelegationResponses_);
          }
          onChanged();
        }
      } else {
        if (!other.redelegationResponses_.isEmpty()) {
          if (redelegationResponsesBuilder_.isEmpty()) {
            redelegationResponsesBuilder_.dispose();
            redelegationResponsesBuilder_ = null;
            redelegationResponses_ = other.redelegationResponses_;
            bitField0_ = (bitField0_ & ~0x00000001);
            redelegationResponsesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRedelegationResponsesFieldBuilder() : null;
          } else {
            redelegationResponsesBuilder_.addAllMessages(other.redelegationResponses_);
          }
        }
      }
      if (other.hasPagination()) {
        mergePagination(other.getPagination());
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
              com.cosmos.staking.v1beta1.RedelegationResponse m =
                  input.readMessage(
                      com.cosmos.staking.v1beta1.RedelegationResponse.parser(),
                      extensionRegistry);
              if (redelegationResponsesBuilder_ == null) {
                ensureRedelegationResponsesIsMutable();
                redelegationResponses_.add(m);
              } else {
                redelegationResponsesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPaginationFieldBuilder().getBuilder(),
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

    private java.util.List<com.cosmos.staking.v1beta1.RedelegationResponse> redelegationResponses_ =
      java.util.Collections.emptyList();
    private void ensureRedelegationResponsesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        redelegationResponses_ = new java.util.ArrayList<com.cosmos.staking.v1beta1.RedelegationResponse>(redelegationResponses_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.staking.v1beta1.RedelegationResponse, com.cosmos.staking.v1beta1.RedelegationResponse.Builder, com.cosmos.staking.v1beta1.RedelegationResponseOrBuilder> redelegationResponsesBuilder_;

    /**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [json_name = "redelegationResponses", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.cosmos.staking.v1beta1.RedelegationResponse> getRedelegationResponsesList() {
      if (redelegationResponsesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(redelegationResponses_);
      } else {
        return redelegationResponsesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [json_name = "redelegationResponses", (.gogoproto.nullable) = false];</code>
     */
    public int getRedelegationResponsesCount() {
      if (redelegationResponsesBuilder_ == null) {
        return redelegationResponses_.size();
      } else {
        return redelegationResponsesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [json_name = "redelegationResponses", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.staking.v1beta1.RedelegationResponse getRedelegationResponses(int index) {
      if (redelegationResponsesBuilder_ == null) {
        return redelegationResponses_.get(index);
      } else {
        return redelegationResponsesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [json_name = "redelegationResponses", (.gogoproto.nullable) = false];</code>
     */
    public Builder setRedelegationResponses(
        int index, com.cosmos.staking.v1beta1.RedelegationResponse value) {
      if (redelegationResponsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRedelegationResponsesIsMutable();
        redelegationResponses_.set(index, value);
        onChanged();
      } else {
        redelegationResponsesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [json_name = "redelegationResponses", (.gogoproto.nullable) = false];</code>
     */
    public Builder setRedelegationResponses(
        int index, com.cosmos.staking.v1beta1.RedelegationResponse.Builder builderForValue) {
      if (redelegationResponsesBuilder_ == null) {
        ensureRedelegationResponsesIsMutable();
        redelegationResponses_.set(index, builderForValue.build());
        onChanged();
      } else {
        redelegationResponsesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [json_name = "redelegationResponses", (.gogoproto.nullable) = false];</code>
     */
    public Builder addRedelegationResponses(com.cosmos.staking.v1beta1.RedelegationResponse value) {
      if (redelegationResponsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRedelegationResponsesIsMutable();
        redelegationResponses_.add(value);
        onChanged();
      } else {
        redelegationResponsesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [json_name = "redelegationResponses", (.gogoproto.nullable) = false];</code>
     */
    public Builder addRedelegationResponses(
        int index, com.cosmos.staking.v1beta1.RedelegationResponse value) {
      if (redelegationResponsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRedelegationResponsesIsMutable();
        redelegationResponses_.add(index, value);
        onChanged();
      } else {
        redelegationResponsesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [json_name = "redelegationResponses", (.gogoproto.nullable) = false];</code>
     */
    public Builder addRedelegationResponses(
        com.cosmos.staking.v1beta1.RedelegationResponse.Builder builderForValue) {
      if (redelegationResponsesBuilder_ == null) {
        ensureRedelegationResponsesIsMutable();
        redelegationResponses_.add(builderForValue.build());
        onChanged();
      } else {
        redelegationResponsesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [json_name = "redelegationResponses", (.gogoproto.nullable) = false];</code>
     */
    public Builder addRedelegationResponses(
        int index, com.cosmos.staking.v1beta1.RedelegationResponse.Builder builderForValue) {
      if (redelegationResponsesBuilder_ == null) {
        ensureRedelegationResponsesIsMutable();
        redelegationResponses_.add(index, builderForValue.build());
        onChanged();
      } else {
        redelegationResponsesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [json_name = "redelegationResponses", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllRedelegationResponses(
        java.lang.Iterable<? extends com.cosmos.staking.v1beta1.RedelegationResponse> values) {
      if (redelegationResponsesBuilder_ == null) {
        ensureRedelegationResponsesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, redelegationResponses_);
        onChanged();
      } else {
        redelegationResponsesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [json_name = "redelegationResponses", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearRedelegationResponses() {
      if (redelegationResponsesBuilder_ == null) {
        redelegationResponses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        redelegationResponsesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [json_name = "redelegationResponses", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeRedelegationResponses(int index) {
      if (redelegationResponsesBuilder_ == null) {
        ensureRedelegationResponsesIsMutable();
        redelegationResponses_.remove(index);
        onChanged();
      } else {
        redelegationResponsesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [json_name = "redelegationResponses", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.staking.v1beta1.RedelegationResponse.Builder getRedelegationResponsesBuilder(
        int index) {
      return getRedelegationResponsesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [json_name = "redelegationResponses", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.staking.v1beta1.RedelegationResponseOrBuilder getRedelegationResponsesOrBuilder(
        int index) {
      if (redelegationResponsesBuilder_ == null) {
        return redelegationResponses_.get(index);  } else {
        return redelegationResponsesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [json_name = "redelegationResponses", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.cosmos.staking.v1beta1.RedelegationResponseOrBuilder> 
         getRedelegationResponsesOrBuilderList() {
      if (redelegationResponsesBuilder_ != null) {
        return redelegationResponsesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(redelegationResponses_);
      }
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [json_name = "redelegationResponses", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.staking.v1beta1.RedelegationResponse.Builder addRedelegationResponsesBuilder() {
      return getRedelegationResponsesFieldBuilder().addBuilder(
          com.cosmos.staking.v1beta1.RedelegationResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [json_name = "redelegationResponses", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.staking.v1beta1.RedelegationResponse.Builder addRedelegationResponsesBuilder(
        int index) {
      return getRedelegationResponsesFieldBuilder().addBuilder(
          index, com.cosmos.staking.v1beta1.RedelegationResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.staking.v1beta1.RedelegationResponse redelegation_responses = 1 [json_name = "redelegationResponses", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.cosmos.staking.v1beta1.RedelegationResponse.Builder> 
         getRedelegationResponsesBuilderList() {
      return getRedelegationResponsesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.staking.v1beta1.RedelegationResponse, com.cosmos.staking.v1beta1.RedelegationResponse.Builder, com.cosmos.staking.v1beta1.RedelegationResponseOrBuilder> 
        getRedelegationResponsesFieldBuilder() {
      if (redelegationResponsesBuilder_ == null) {
        redelegationResponsesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cosmos.staking.v1beta1.RedelegationResponse, com.cosmos.staking.v1beta1.RedelegationResponse.Builder, com.cosmos.staking.v1beta1.RedelegationResponseOrBuilder>(
                redelegationResponses_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        redelegationResponses_ = null;
      }
      return redelegationResponsesBuilder_;
    }

    private com.cosmos.base.query.v1beta1.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return The pagination.
     */
    public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pagination_ = value;
      } else {
        paginationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(
        com.cosmos.base.query.v1beta1.PageResponse.Builder builderForValue) {
      if (paginationBuilder_ == null) {
        pagination_ = builderForValue.build();
      } else {
        paginationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder mergePagination(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          pagination_ != null &&
          pagination_ != com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance()) {
          getPaginationBuilder().mergeFrom(value);
        } else {
          pagination_ = value;
        }
      } else {
        paginationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder clearPagination() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponse.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder>(
                getPagination(),
                getParentForChildren(),
                isClean());
        pagination_ = null;
      }
      return paginationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.staking.v1beta1.QueryRedelegationsResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.staking.v1beta1.QueryRedelegationsResponse)
  private static final com.cosmos.staking.v1beta1.QueryRedelegationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.staking.v1beta1.QueryRedelegationsResponse();
  }

  public static com.cosmos.staking.v1beta1.QueryRedelegationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryRedelegationsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryRedelegationsResponse>() {
    @java.lang.Override
    public QueryRedelegationsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryRedelegationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryRedelegationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.staking.v1beta1.QueryRedelegationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

