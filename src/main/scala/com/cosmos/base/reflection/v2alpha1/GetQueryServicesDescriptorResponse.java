// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/reflection/v2alpha1/reflection.proto

package com.cosmos.base.reflection.v2alpha1;

/**
 * <pre>
 * GetQueryServicesDescriptorResponse is the response returned by the GetQueryServicesDescriptor RPC
 * </pre>
 *
 * Protobuf type {@code cosmos.base.reflection.v2alpha1.GetQueryServicesDescriptorResponse}
 */
public final class GetQueryServicesDescriptorResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.base.reflection.v2alpha1.GetQueryServicesDescriptorResponse)
    GetQueryServicesDescriptorResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetQueryServicesDescriptorResponse.newBuilder() to construct.
  private GetQueryServicesDescriptorResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetQueryServicesDescriptorResponse() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetQueryServicesDescriptorResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ReflectionProto.internal_static_cosmos_base_reflection_v2alpha1_GetQueryServicesDescriptorResponse_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ReflectionProto.internal_static_cosmos_base_reflection_v2alpha1_GetQueryServicesDescriptorResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            GetQueryServicesDescriptorResponse.class, Builder.class);
  }

  public static final int QUERIES_FIELD_NUMBER = 1;
  private QueryServicesDescriptor queries_;
  /**
   * <pre>
   * queries provides information on the available queryable services
   * </pre>
   *
   * <code>.cosmos.base.reflection.v2alpha1.QueryServicesDescriptor queries = 1 [json_name = "queries"];</code>
   * @return Whether the queries field is set.
   */
  @Override
  public boolean hasQueries() {
    return queries_ != null;
  }
  /**
   * <pre>
   * queries provides information on the available queryable services
   * </pre>
   *
   * <code>.cosmos.base.reflection.v2alpha1.QueryServicesDescriptor queries = 1 [json_name = "queries"];</code>
   * @return The queries.
   */
  @Override
  public QueryServicesDescriptor getQueries() {
    return queries_ == null ? QueryServicesDescriptor.getDefaultInstance() : queries_;
  }
  /**
   * <pre>
   * queries provides information on the available queryable services
   * </pre>
   *
   * <code>.cosmos.base.reflection.v2alpha1.QueryServicesDescriptor queries = 1 [json_name = "queries"];</code>
   */
  @Override
  public QueryServicesDescriptorOrBuilder getQueriesOrBuilder() {
    return queries_ == null ? QueryServicesDescriptor.getDefaultInstance() : queries_;
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
    if (queries_ != null) {
      output.writeMessage(1, getQueries());
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (queries_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getQueries());
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
    if (!(obj instanceof GetQueryServicesDescriptorResponse)) {
      return super.equals(obj);
    }
    GetQueryServicesDescriptorResponse other = (GetQueryServicesDescriptorResponse) obj;

    if (hasQueries() != other.hasQueries()) return false;
    if (hasQueries()) {
      if (!getQueries()
          .equals(other.getQueries())) return false;
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
    if (hasQueries()) {
      hash = (37 * hash) + QUERIES_FIELD_NUMBER;
      hash = (53 * hash) + getQueries().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static GetQueryServicesDescriptorResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetQueryServicesDescriptorResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetQueryServicesDescriptorResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetQueryServicesDescriptorResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetQueryServicesDescriptorResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetQueryServicesDescriptorResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetQueryServicesDescriptorResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GetQueryServicesDescriptorResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static GetQueryServicesDescriptorResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static GetQueryServicesDescriptorResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static GetQueryServicesDescriptorResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GetQueryServicesDescriptorResponse parseFrom(
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
  public static Builder newBuilder(GetQueryServicesDescriptorResponse prototype) {
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
   * GetQueryServicesDescriptorResponse is the response returned by the GetQueryServicesDescriptor RPC
   * </pre>
   *
   * Protobuf type {@code cosmos.base.reflection.v2alpha1.GetQueryServicesDescriptorResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.base.reflection.v2alpha1.GetQueryServicesDescriptorResponse)
      GetQueryServicesDescriptorResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ReflectionProto.internal_static_cosmos_base_reflection_v2alpha1_GetQueryServicesDescriptorResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ReflectionProto.internal_static_cosmos_base_reflection_v2alpha1_GetQueryServicesDescriptorResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GetQueryServicesDescriptorResponse.class, Builder.class);
    }

    // Construct using com.cosmos.base.reflection.v2alpha1.GetQueryServicesDescriptorResponse.newBuilder()
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
      queries_ = null;
      if (queriesBuilder_ != null) {
        queriesBuilder_.dispose();
        queriesBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ReflectionProto.internal_static_cosmos_base_reflection_v2alpha1_GetQueryServicesDescriptorResponse_descriptor;
    }

    @Override
    public GetQueryServicesDescriptorResponse getDefaultInstanceForType() {
      return GetQueryServicesDescriptorResponse.getDefaultInstance();
    }

    @Override
    public GetQueryServicesDescriptorResponse build() {
      GetQueryServicesDescriptorResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public GetQueryServicesDescriptorResponse buildPartial() {
      GetQueryServicesDescriptorResponse result = new GetQueryServicesDescriptorResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(GetQueryServicesDescriptorResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.queries_ = queriesBuilder_ == null
            ? queries_
            : queriesBuilder_.build();
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
      if (other instanceof GetQueryServicesDescriptorResponse) {
        return mergeFrom((GetQueryServicesDescriptorResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(GetQueryServicesDescriptorResponse other) {
      if (other == GetQueryServicesDescriptorResponse.getDefaultInstance()) return this;
      if (other.hasQueries()) {
        mergeQueries(other.getQueries());
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
                  getQueriesFieldBuilder().getBuilder(),
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

    private QueryServicesDescriptor queries_;
    private com.google.protobuf.SingleFieldBuilderV3<
        QueryServicesDescriptor, QueryServicesDescriptor.Builder, QueryServicesDescriptorOrBuilder> queriesBuilder_;
    /**
     * <pre>
     * queries provides information on the available queryable services
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.QueryServicesDescriptor queries = 1 [json_name = "queries"];</code>
     * @return Whether the queries field is set.
     */
    public boolean hasQueries() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * queries provides information on the available queryable services
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.QueryServicesDescriptor queries = 1 [json_name = "queries"];</code>
     * @return The queries.
     */
    public QueryServicesDescriptor getQueries() {
      if (queriesBuilder_ == null) {
        return queries_ == null ? QueryServicesDescriptor.getDefaultInstance() : queries_;
      } else {
        return queriesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * queries provides information on the available queryable services
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.QueryServicesDescriptor queries = 1 [json_name = "queries"];</code>
     */
    public Builder setQueries(QueryServicesDescriptor value) {
      if (queriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        queries_ = value;
      } else {
        queriesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * queries provides information on the available queryable services
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.QueryServicesDescriptor queries = 1 [json_name = "queries"];</code>
     */
    public Builder setQueries(
        QueryServicesDescriptor.Builder builderForValue) {
      if (queriesBuilder_ == null) {
        queries_ = builderForValue.build();
      } else {
        queriesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * queries provides information on the available queryable services
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.QueryServicesDescriptor queries = 1 [json_name = "queries"];</code>
     */
    public Builder mergeQueries(QueryServicesDescriptor value) {
      if (queriesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          queries_ != null &&
          queries_ != QueryServicesDescriptor.getDefaultInstance()) {
          getQueriesBuilder().mergeFrom(value);
        } else {
          queries_ = value;
        }
      } else {
        queriesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * queries provides information on the available queryable services
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.QueryServicesDescriptor queries = 1 [json_name = "queries"];</code>
     */
    public Builder clearQueries() {
      bitField0_ = (bitField0_ & ~0x00000001);
      queries_ = null;
      if (queriesBuilder_ != null) {
        queriesBuilder_.dispose();
        queriesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * queries provides information on the available queryable services
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.QueryServicesDescriptor queries = 1 [json_name = "queries"];</code>
     */
    public QueryServicesDescriptor.Builder getQueriesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getQueriesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * queries provides information on the available queryable services
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.QueryServicesDescriptor queries = 1 [json_name = "queries"];</code>
     */
    public QueryServicesDescriptorOrBuilder getQueriesOrBuilder() {
      if (queriesBuilder_ != null) {
        return queriesBuilder_.getMessageOrBuilder();
      } else {
        return queries_ == null ?
            QueryServicesDescriptor.getDefaultInstance() : queries_;
      }
    }
    /**
     * <pre>
     * queries provides information on the available queryable services
     * </pre>
     *
     * <code>.cosmos.base.reflection.v2alpha1.QueryServicesDescriptor queries = 1 [json_name = "queries"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        QueryServicesDescriptor, QueryServicesDescriptor.Builder, QueryServicesDescriptorOrBuilder>
        getQueriesFieldBuilder() {
      if (queriesBuilder_ == null) {
        queriesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            QueryServicesDescriptor, QueryServicesDescriptor.Builder, QueryServicesDescriptorOrBuilder>(
                getQueries(),
                getParentForChildren(),
                isClean());
        queries_ = null;
      }
      return queriesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.base.reflection.v2alpha1.GetQueryServicesDescriptorResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.base.reflection.v2alpha1.GetQueryServicesDescriptorResponse)
  private static final GetQueryServicesDescriptorResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GetQueryServicesDescriptorResponse();
  }

  public static GetQueryServicesDescriptorResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetQueryServicesDescriptorResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetQueryServicesDescriptorResponse>() {
    @Override
    public GetQueryServicesDescriptorResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetQueryServicesDescriptorResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<GetQueryServicesDescriptorResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public GetQueryServicesDescriptorResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

