// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/client/v1/query.proto

package com.ibc.core.client.v1;

/**
 * <pre>
 * QueryUpgradedClientStateResponse is the response type for the
 * Query/UpgradedClientState RPC method.
 * </pre>
 *
 * Protobuf type {@code ibc.core.client.v1.QueryUpgradedClientStateResponse}
 */
public final class QueryUpgradedClientStateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.core.client.v1.QueryUpgradedClientStateResponse)
    QueryUpgradedClientStateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryUpgradedClientStateResponse.newBuilder() to construct.
  private QueryUpgradedClientStateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryUpgradedClientStateResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryUpgradedClientStateResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.core.client.v1.QueryProto.internal_static_ibc_core_client_v1_QueryUpgradedClientStateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.core.client.v1.QueryProto.internal_static_ibc_core_client_v1_QueryUpgradedClientStateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.core.client.v1.QueryUpgradedClientStateResponse.class, com.ibc.core.client.v1.QueryUpgradedClientStateResponse.Builder.class);
  }

  public static final int UPGRADED_CLIENT_STATE_FIELD_NUMBER = 1;
  private com.google.protobuf.Any upgradedClientState_;
  /**
   * <pre>
   * client state associated with the request identifier
   * </pre>
   *
   * <code>.google.protobuf.Any upgraded_client_state = 1 [json_name = "upgradedClientState"];</code>
   * @return Whether the upgradedClientState field is set.
   */
  @java.lang.Override
  public boolean hasUpgradedClientState() {
    return upgradedClientState_ != null;
  }
  /**
   * <pre>
   * client state associated with the request identifier
   * </pre>
   *
   * <code>.google.protobuf.Any upgraded_client_state = 1 [json_name = "upgradedClientState"];</code>
   * @return The upgradedClientState.
   */
  @java.lang.Override
  public com.google.protobuf.Any getUpgradedClientState() {
    return upgradedClientState_ == null ? com.google.protobuf.Any.getDefaultInstance() : upgradedClientState_;
  }
  /**
   * <pre>
   * client state associated with the request identifier
   * </pre>
   *
   * <code>.google.protobuf.Any upgraded_client_state = 1 [json_name = "upgradedClientState"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getUpgradedClientStateOrBuilder() {
    return upgradedClientState_ == null ? com.google.protobuf.Any.getDefaultInstance() : upgradedClientState_;
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
    if (upgradedClientState_ != null) {
      output.writeMessage(1, getUpgradedClientState());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (upgradedClientState_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUpgradedClientState());
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
    if (!(obj instanceof com.ibc.core.client.v1.QueryUpgradedClientStateResponse)) {
      return super.equals(obj);
    }
    com.ibc.core.client.v1.QueryUpgradedClientStateResponse other = (com.ibc.core.client.v1.QueryUpgradedClientStateResponse) obj;

    if (hasUpgradedClientState() != other.hasUpgradedClientState()) return false;
    if (hasUpgradedClientState()) {
      if (!getUpgradedClientState()
          .equals(other.getUpgradedClientState())) return false;
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
    if (hasUpgradedClientState()) {
      hash = (37 * hash) + UPGRADED_CLIENT_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getUpgradedClientState().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.core.client.v1.QueryUpgradedClientStateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.client.v1.QueryUpgradedClientStateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.client.v1.QueryUpgradedClientStateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.client.v1.QueryUpgradedClientStateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.client.v1.QueryUpgradedClientStateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.client.v1.QueryUpgradedClientStateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.client.v1.QueryUpgradedClientStateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.client.v1.QueryUpgradedClientStateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.core.client.v1.QueryUpgradedClientStateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ibc.core.client.v1.QueryUpgradedClientStateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.core.client.v1.QueryUpgradedClientStateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.client.v1.QueryUpgradedClientStateResponse parseFrom(
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
  public static Builder newBuilder(com.ibc.core.client.v1.QueryUpgradedClientStateResponse prototype) {
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
   * QueryUpgradedClientStateResponse is the response type for the
   * Query/UpgradedClientState RPC method.
   * </pre>
   *
   * Protobuf type {@code ibc.core.client.v1.QueryUpgradedClientStateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.core.client.v1.QueryUpgradedClientStateResponse)
      com.ibc.core.client.v1.QueryUpgradedClientStateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.core.client.v1.QueryProto.internal_static_ibc_core_client_v1_QueryUpgradedClientStateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.core.client.v1.QueryProto.internal_static_ibc_core_client_v1_QueryUpgradedClientStateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.core.client.v1.QueryUpgradedClientStateResponse.class, com.ibc.core.client.v1.QueryUpgradedClientStateResponse.Builder.class);
    }

    // Construct using com.ibc.core.client.v1.QueryUpgradedClientStateResponse.newBuilder()
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
      upgradedClientState_ = null;
      if (upgradedClientStateBuilder_ != null) {
        upgradedClientStateBuilder_.dispose();
        upgradedClientStateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibc.core.client.v1.QueryProto.internal_static_ibc_core_client_v1_QueryUpgradedClientStateResponse_descriptor;
    }

    @java.lang.Override
    public com.ibc.core.client.v1.QueryUpgradedClientStateResponse getDefaultInstanceForType() {
      return com.ibc.core.client.v1.QueryUpgradedClientStateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.core.client.v1.QueryUpgradedClientStateResponse build() {
      com.ibc.core.client.v1.QueryUpgradedClientStateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.core.client.v1.QueryUpgradedClientStateResponse buildPartial() {
      com.ibc.core.client.v1.QueryUpgradedClientStateResponse result = new com.ibc.core.client.v1.QueryUpgradedClientStateResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ibc.core.client.v1.QueryUpgradedClientStateResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.upgradedClientState_ = upgradedClientStateBuilder_ == null
            ? upgradedClientState_
            : upgradedClientStateBuilder_.build();
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
      if (other instanceof com.ibc.core.client.v1.QueryUpgradedClientStateResponse) {
        return mergeFrom((com.ibc.core.client.v1.QueryUpgradedClientStateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.core.client.v1.QueryUpgradedClientStateResponse other) {
      if (other == com.ibc.core.client.v1.QueryUpgradedClientStateResponse.getDefaultInstance()) return this;
      if (other.hasUpgradedClientState()) {
        mergeUpgradedClientState(other.getUpgradedClientState());
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
                  getUpgradedClientStateFieldBuilder().getBuilder(),
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

    private com.google.protobuf.Any upgradedClientState_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> upgradedClientStateBuilder_;
    /**
     * <pre>
     * client state associated with the request identifier
     * </pre>
     *
     * <code>.google.protobuf.Any upgraded_client_state = 1 [json_name = "upgradedClientState"];</code>
     * @return Whether the upgradedClientState field is set.
     */
    public boolean hasUpgradedClientState() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * client state associated with the request identifier
     * </pre>
     *
     * <code>.google.protobuf.Any upgraded_client_state = 1 [json_name = "upgradedClientState"];</code>
     * @return The upgradedClientState.
     */
    public com.google.protobuf.Any getUpgradedClientState() {
      if (upgradedClientStateBuilder_ == null) {
        return upgradedClientState_ == null ? com.google.protobuf.Any.getDefaultInstance() : upgradedClientState_;
      } else {
        return upgradedClientStateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * client state associated with the request identifier
     * </pre>
     *
     * <code>.google.protobuf.Any upgraded_client_state = 1 [json_name = "upgradedClientState"];</code>
     */
    public Builder setUpgradedClientState(com.google.protobuf.Any value) {
      if (upgradedClientStateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        upgradedClientState_ = value;
      } else {
        upgradedClientStateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * client state associated with the request identifier
     * </pre>
     *
     * <code>.google.protobuf.Any upgraded_client_state = 1 [json_name = "upgradedClientState"];</code>
     */
    public Builder setUpgradedClientState(
        com.google.protobuf.Any.Builder builderForValue) {
      if (upgradedClientStateBuilder_ == null) {
        upgradedClientState_ = builderForValue.build();
      } else {
        upgradedClientStateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * client state associated with the request identifier
     * </pre>
     *
     * <code>.google.protobuf.Any upgraded_client_state = 1 [json_name = "upgradedClientState"];</code>
     */
    public Builder mergeUpgradedClientState(com.google.protobuf.Any value) {
      if (upgradedClientStateBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          upgradedClientState_ != null &&
          upgradedClientState_ != com.google.protobuf.Any.getDefaultInstance()) {
          getUpgradedClientStateBuilder().mergeFrom(value);
        } else {
          upgradedClientState_ = value;
        }
      } else {
        upgradedClientStateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * client state associated with the request identifier
     * </pre>
     *
     * <code>.google.protobuf.Any upgraded_client_state = 1 [json_name = "upgradedClientState"];</code>
     */
    public Builder clearUpgradedClientState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      upgradedClientState_ = null;
      if (upgradedClientStateBuilder_ != null) {
        upgradedClientStateBuilder_.dispose();
        upgradedClientStateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * client state associated with the request identifier
     * </pre>
     *
     * <code>.google.protobuf.Any upgraded_client_state = 1 [json_name = "upgradedClientState"];</code>
     */
    public com.google.protobuf.Any.Builder getUpgradedClientStateBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUpgradedClientStateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * client state associated with the request identifier
     * </pre>
     *
     * <code>.google.protobuf.Any upgraded_client_state = 1 [json_name = "upgradedClientState"];</code>
     */
    public com.google.protobuf.AnyOrBuilder getUpgradedClientStateOrBuilder() {
      if (upgradedClientStateBuilder_ != null) {
        return upgradedClientStateBuilder_.getMessageOrBuilder();
      } else {
        return upgradedClientState_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : upgradedClientState_;
      }
    }
    /**
     * <pre>
     * client state associated with the request identifier
     * </pre>
     *
     * <code>.google.protobuf.Any upgraded_client_state = 1 [json_name = "upgradedClientState"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getUpgradedClientStateFieldBuilder() {
      if (upgradedClientStateBuilder_ == null) {
        upgradedClientStateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getUpgradedClientState(),
                getParentForChildren(),
                isClean());
        upgradedClientState_ = null;
      }
      return upgradedClientStateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ibc.core.client.v1.QueryUpgradedClientStateResponse)
  }

  // @@protoc_insertion_point(class_scope:ibc.core.client.v1.QueryUpgradedClientStateResponse)
  private static final com.ibc.core.client.v1.QueryUpgradedClientStateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.core.client.v1.QueryUpgradedClientStateResponse();
  }

  public static com.ibc.core.client.v1.QueryUpgradedClientStateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryUpgradedClientStateResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryUpgradedClientStateResponse>() {
    @java.lang.Override
    public QueryUpgradedClientStateResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryUpgradedClientStateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryUpgradedClientStateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.core.client.v1.QueryUpgradedClientStateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

