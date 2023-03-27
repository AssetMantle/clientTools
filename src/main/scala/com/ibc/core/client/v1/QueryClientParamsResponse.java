// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/client/v1/query.proto

package com.ibc.core.client.v1;

/**
 * <pre>
 * QueryClientParamsResponse is the response type for the Query/ClientParams RPC
 * method.
 * </pre>
 *
 * Protobuf type {@code ibc.core.client.v1.QueryClientParamsResponse}
 */
public final class QueryClientParamsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.core.client.v1.QueryClientParamsResponse)
    QueryClientParamsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryClientParamsResponse.newBuilder() to construct.
  private QueryClientParamsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryClientParamsResponse() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryClientParamsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return QueryProto.internal_static_ibc_core_client_v1_QueryClientParamsResponse_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return QueryProto.internal_static_ibc_core_client_v1_QueryClientParamsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            QueryClientParamsResponse.class, Builder.class);
  }

  public static final int PARAMS_FIELD_NUMBER = 1;
  private Params params_;
  /**
   * <pre>
   * params defines the parameters of the module.
   * </pre>
   *
   * <code>.ibc.core.client.v1.Params params = 1 [json_name = "params"];</code>
   * @return Whether the params field is set.
   */
  @Override
  public boolean hasParams() {
    return params_ != null;
  }
  /**
   * <pre>
   * params defines the parameters of the module.
   * </pre>
   *
   * <code>.ibc.core.client.v1.Params params = 1 [json_name = "params"];</code>
   * @return The params.
   */
  @Override
  public Params getParams() {
    return params_ == null ? Params.getDefaultInstance() : params_;
  }
  /**
   * <pre>
   * params defines the parameters of the module.
   * </pre>
   *
   * <code>.ibc.core.client.v1.Params params = 1 [json_name = "params"];</code>
   */
  @Override
  public ParamsOrBuilder getParamsOrBuilder() {
    return params_ == null ? Params.getDefaultInstance() : params_;
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
    if (params_ != null) {
      output.writeMessage(1, getParams());
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (params_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getParams());
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
    if (!(obj instanceof QueryClientParamsResponse)) {
      return super.equals(obj);
    }
    QueryClientParamsResponse other = (QueryClientParamsResponse) obj;

    if (hasParams() != other.hasParams()) return false;
    if (hasParams()) {
      if (!getParams()
          .equals(other.getParams())) return false;
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
    if (hasParams()) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getParams().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static QueryClientParamsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryClientParamsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryClientParamsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryClientParamsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryClientParamsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryClientParamsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryClientParamsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static QueryClientParamsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static QueryClientParamsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static QueryClientParamsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static QueryClientParamsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static QueryClientParamsResponse parseFrom(
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
  public static Builder newBuilder(QueryClientParamsResponse prototype) {
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
   * QueryClientParamsResponse is the response type for the Query/ClientParams RPC
   * method.
   * </pre>
   *
   * Protobuf type {@code ibc.core.client.v1.QueryClientParamsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.core.client.v1.QueryClientParamsResponse)
      QueryClientParamsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return QueryProto.internal_static_ibc_core_client_v1_QueryClientParamsResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return QueryProto.internal_static_ibc_core_client_v1_QueryClientParamsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              QueryClientParamsResponse.class, Builder.class);
    }

    // Construct using com.ibc.core.client.v1.QueryClientParamsResponse.newBuilder()
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
      params_ = null;
      if (paramsBuilder_ != null) {
        paramsBuilder_.dispose();
        paramsBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return QueryProto.internal_static_ibc_core_client_v1_QueryClientParamsResponse_descriptor;
    }

    @Override
    public QueryClientParamsResponse getDefaultInstanceForType() {
      return QueryClientParamsResponse.getDefaultInstance();
    }

    @Override
    public QueryClientParamsResponse build() {
      QueryClientParamsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public QueryClientParamsResponse buildPartial() {
      QueryClientParamsResponse result = new QueryClientParamsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(QueryClientParamsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.params_ = paramsBuilder_ == null
            ? params_
            : paramsBuilder_.build();
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
      if (other instanceof QueryClientParamsResponse) {
        return mergeFrom((QueryClientParamsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(QueryClientParamsResponse other) {
      if (other == QueryClientParamsResponse.getDefaultInstance()) return this;
      if (other.hasParams()) {
        mergeParams(other.getParams());
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
                  getParamsFieldBuilder().getBuilder(),
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

    private Params params_;
    private com.google.protobuf.SingleFieldBuilderV3<
        Params, Params.Builder, ParamsOrBuilder> paramsBuilder_;
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.ibc.core.client.v1.Params params = 1 [json_name = "params"];</code>
     * @return Whether the params field is set.
     */
    public boolean hasParams() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.ibc.core.client.v1.Params params = 1 [json_name = "params"];</code>
     * @return The params.
     */
    public Params getParams() {
      if (paramsBuilder_ == null) {
        return params_ == null ? Params.getDefaultInstance() : params_;
      } else {
        return paramsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.ibc.core.client.v1.Params params = 1 [json_name = "params"];</code>
     */
    public Builder setParams(Params value) {
      if (paramsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        params_ = value;
      } else {
        paramsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.ibc.core.client.v1.Params params = 1 [json_name = "params"];</code>
     */
    public Builder setParams(
        Params.Builder builderForValue) {
      if (paramsBuilder_ == null) {
        params_ = builderForValue.build();
      } else {
        paramsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.ibc.core.client.v1.Params params = 1 [json_name = "params"];</code>
     */
    public Builder mergeParams(Params value) {
      if (paramsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          params_ != null &&
          params_ != Params.getDefaultInstance()) {
          getParamsBuilder().mergeFrom(value);
        } else {
          params_ = value;
        }
      } else {
        paramsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.ibc.core.client.v1.Params params = 1 [json_name = "params"];</code>
     */
    public Builder clearParams() {
      bitField0_ = (bitField0_ & ~0x00000001);
      params_ = null;
      if (paramsBuilder_ != null) {
        paramsBuilder_.dispose();
        paramsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.ibc.core.client.v1.Params params = 1 [json_name = "params"];</code>
     */
    public Params.Builder getParamsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getParamsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.ibc.core.client.v1.Params params = 1 [json_name = "params"];</code>
     */
    public ParamsOrBuilder getParamsOrBuilder() {
      if (paramsBuilder_ != null) {
        return paramsBuilder_.getMessageOrBuilder();
      } else {
        return params_ == null ?
            Params.getDefaultInstance() : params_;
      }
    }
    /**
     * <pre>
     * params defines the parameters of the module.
     * </pre>
     *
     * <code>.ibc.core.client.v1.Params params = 1 [json_name = "params"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        Params, Params.Builder, ParamsOrBuilder>
        getParamsFieldBuilder() {
      if (paramsBuilder_ == null) {
        paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            Params, Params.Builder, ParamsOrBuilder>(
                getParams(),
                getParentForChildren(),
                isClean());
        params_ = null;
      }
      return paramsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ibc.core.client.v1.QueryClientParamsResponse)
  }

  // @@protoc_insertion_point(class_scope:ibc.core.client.v1.QueryClientParamsResponse)
  private static final QueryClientParamsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new QueryClientParamsResponse();
  }

  public static QueryClientParamsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryClientParamsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryClientParamsResponse>() {
    @Override
    public QueryClientParamsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryClientParamsResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<QueryClientParamsResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public QueryClientParamsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

