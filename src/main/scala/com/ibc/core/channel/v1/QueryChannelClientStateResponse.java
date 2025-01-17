// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/channel/v1/query.proto

package com.ibc.core.channel.v1;

/**
 * <pre>
 * QueryChannelClientStateResponse is the Response type for the
 * Query/QueryChannelClientState RPC method
 * </pre>
 *
 * Protobuf type {@code ibc.core.channel.v1.QueryChannelClientStateResponse}
 */
public final class QueryChannelClientStateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.core.channel.v1.QueryChannelClientStateResponse)
    QueryChannelClientStateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryChannelClientStateResponse.newBuilder() to construct.
  private QueryChannelClientStateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryChannelClientStateResponse() {
    proof_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryChannelClientStateResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.core.channel.v1.QueryProto.internal_static_ibc_core_channel_v1_QueryChannelClientStateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.core.channel.v1.QueryProto.internal_static_ibc_core_channel_v1_QueryChannelClientStateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.core.channel.v1.QueryChannelClientStateResponse.class, com.ibc.core.channel.v1.QueryChannelClientStateResponse.Builder.class);
  }

  public static final int IDENTIFIED_CLIENT_STATE_FIELD_NUMBER = 1;
  private com.ibc.core.client.v1.IdentifiedClientState identifiedClientState_;
  /**
   * <pre>
   * client state associated with the channel
   * </pre>
   *
   * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1 [json_name = "identifiedClientState"];</code>
   * @return Whether the identifiedClientState field is set.
   */
  @java.lang.Override
  public boolean hasIdentifiedClientState() {
    return identifiedClientState_ != null;
  }
  /**
   * <pre>
   * client state associated with the channel
   * </pre>
   *
   * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1 [json_name = "identifiedClientState"];</code>
   * @return The identifiedClientState.
   */
  @java.lang.Override
  public com.ibc.core.client.v1.IdentifiedClientState getIdentifiedClientState() {
    return identifiedClientState_ == null ? com.ibc.core.client.v1.IdentifiedClientState.getDefaultInstance() : identifiedClientState_;
  }
  /**
   * <pre>
   * client state associated with the channel
   * </pre>
   *
   * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1 [json_name = "identifiedClientState"];</code>
   */
  @java.lang.Override
  public com.ibc.core.client.v1.IdentifiedClientStateOrBuilder getIdentifiedClientStateOrBuilder() {
    return identifiedClientState_ == null ? com.ibc.core.client.v1.IdentifiedClientState.getDefaultInstance() : identifiedClientState_;
  }

  public static final int PROOF_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString proof_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * merkle proof of existence
   * </pre>
   *
   * <code>bytes proof = 2 [json_name = "proof"];</code>
   * @return The proof.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProof() {
    return proof_;
  }

  public static final int PROOF_HEIGHT_FIELD_NUMBER = 3;
  private com.ibc.core.client.v1.Height proofHeight_;
  /**
   * <pre>
   * height at which the proof was retrieved
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
   * @return Whether the proofHeight field is set.
   */
  @java.lang.Override
  public boolean hasProofHeight() {
    return proofHeight_ != null;
  }
  /**
   * <pre>
   * height at which the proof was retrieved
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
   * @return The proofHeight.
   */
  @java.lang.Override
  public com.ibc.core.client.v1.Height getProofHeight() {
    return proofHeight_ == null ? com.ibc.core.client.v1.Height.getDefaultInstance() : proofHeight_;
  }
  /**
   * <pre>
   * height at which the proof was retrieved
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.ibc.core.client.v1.HeightOrBuilder getProofHeightOrBuilder() {
    return proofHeight_ == null ? com.ibc.core.client.v1.Height.getDefaultInstance() : proofHeight_;
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
    if (identifiedClientState_ != null) {
      output.writeMessage(1, getIdentifiedClientState());
    }
    if (!proof_.isEmpty()) {
      output.writeBytes(2, proof_);
    }
    if (proofHeight_ != null) {
      output.writeMessage(3, getProofHeight());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (identifiedClientState_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getIdentifiedClientState());
    }
    if (!proof_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, proof_);
    }
    if (proofHeight_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getProofHeight());
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
    if (!(obj instanceof com.ibc.core.channel.v1.QueryChannelClientStateResponse)) {
      return super.equals(obj);
    }
    com.ibc.core.channel.v1.QueryChannelClientStateResponse other = (com.ibc.core.channel.v1.QueryChannelClientStateResponse) obj;

    if (hasIdentifiedClientState() != other.hasIdentifiedClientState()) return false;
    if (hasIdentifiedClientState()) {
      if (!getIdentifiedClientState()
          .equals(other.getIdentifiedClientState())) return false;
    }
    if (!getProof()
        .equals(other.getProof())) return false;
    if (hasProofHeight() != other.hasProofHeight()) return false;
    if (hasProofHeight()) {
      if (!getProofHeight()
          .equals(other.getProofHeight())) return false;
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
    if (hasIdentifiedClientState()) {
      hash = (37 * hash) + IDENTIFIED_CLIENT_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getIdentifiedClientState().hashCode();
    }
    hash = (37 * hash) + PROOF_FIELD_NUMBER;
    hash = (53 * hash) + getProof().hashCode();
    if (hasProofHeight()) {
      hash = (37 * hash) + PROOF_HEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + getProofHeight().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.core.channel.v1.QueryChannelClientStateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.channel.v1.QueryChannelClientStateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.channel.v1.QueryChannelClientStateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.channel.v1.QueryChannelClientStateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.channel.v1.QueryChannelClientStateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.channel.v1.QueryChannelClientStateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.channel.v1.QueryChannelClientStateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.channel.v1.QueryChannelClientStateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.core.channel.v1.QueryChannelClientStateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ibc.core.channel.v1.QueryChannelClientStateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.core.channel.v1.QueryChannelClientStateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.channel.v1.QueryChannelClientStateResponse parseFrom(
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
  public static Builder newBuilder(com.ibc.core.channel.v1.QueryChannelClientStateResponse prototype) {
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
   * QueryChannelClientStateResponse is the Response type for the
   * Query/QueryChannelClientState RPC method
   * </pre>
   *
   * Protobuf type {@code ibc.core.channel.v1.QueryChannelClientStateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.core.channel.v1.QueryChannelClientStateResponse)
      com.ibc.core.channel.v1.QueryChannelClientStateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.core.channel.v1.QueryProto.internal_static_ibc_core_channel_v1_QueryChannelClientStateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.core.channel.v1.QueryProto.internal_static_ibc_core_channel_v1_QueryChannelClientStateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.core.channel.v1.QueryChannelClientStateResponse.class, com.ibc.core.channel.v1.QueryChannelClientStateResponse.Builder.class);
    }

    // Construct using com.ibc.core.channel.v1.QueryChannelClientStateResponse.newBuilder()
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
      identifiedClientState_ = null;
      if (identifiedClientStateBuilder_ != null) {
        identifiedClientStateBuilder_.dispose();
        identifiedClientStateBuilder_ = null;
      }
      proof_ = com.google.protobuf.ByteString.EMPTY;
      proofHeight_ = null;
      if (proofHeightBuilder_ != null) {
        proofHeightBuilder_.dispose();
        proofHeightBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibc.core.channel.v1.QueryProto.internal_static_ibc_core_channel_v1_QueryChannelClientStateResponse_descriptor;
    }

    @java.lang.Override
    public com.ibc.core.channel.v1.QueryChannelClientStateResponse getDefaultInstanceForType() {
      return com.ibc.core.channel.v1.QueryChannelClientStateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.core.channel.v1.QueryChannelClientStateResponse build() {
      com.ibc.core.channel.v1.QueryChannelClientStateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.core.channel.v1.QueryChannelClientStateResponse buildPartial() {
      com.ibc.core.channel.v1.QueryChannelClientStateResponse result = new com.ibc.core.channel.v1.QueryChannelClientStateResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ibc.core.channel.v1.QueryChannelClientStateResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.identifiedClientState_ = identifiedClientStateBuilder_ == null
            ? identifiedClientState_
            : identifiedClientStateBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.proof_ = proof_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.proofHeight_ = proofHeightBuilder_ == null
            ? proofHeight_
            : proofHeightBuilder_.build();
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
      if (other instanceof com.ibc.core.channel.v1.QueryChannelClientStateResponse) {
        return mergeFrom((com.ibc.core.channel.v1.QueryChannelClientStateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.core.channel.v1.QueryChannelClientStateResponse other) {
      if (other == com.ibc.core.channel.v1.QueryChannelClientStateResponse.getDefaultInstance()) return this;
      if (other.hasIdentifiedClientState()) {
        mergeIdentifiedClientState(other.getIdentifiedClientState());
      }
      if (other.getProof() != com.google.protobuf.ByteString.EMPTY) {
        setProof(other.getProof());
      }
      if (other.hasProofHeight()) {
        mergeProofHeight(other.getProofHeight());
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
                  getIdentifiedClientStateFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              proof_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getProofHeightFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private com.ibc.core.client.v1.IdentifiedClientState identifiedClientState_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ibc.core.client.v1.IdentifiedClientState, com.ibc.core.client.v1.IdentifiedClientState.Builder, com.ibc.core.client.v1.IdentifiedClientStateOrBuilder> identifiedClientStateBuilder_;
    /**
     * <pre>
     * client state associated with the channel
     * </pre>
     *
     * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1 [json_name = "identifiedClientState"];</code>
     * @return Whether the identifiedClientState field is set.
     */
    public boolean hasIdentifiedClientState() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * client state associated with the channel
     * </pre>
     *
     * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1 [json_name = "identifiedClientState"];</code>
     * @return The identifiedClientState.
     */
    public com.ibc.core.client.v1.IdentifiedClientState getIdentifiedClientState() {
      if (identifiedClientStateBuilder_ == null) {
        return identifiedClientState_ == null ? com.ibc.core.client.v1.IdentifiedClientState.getDefaultInstance() : identifiedClientState_;
      } else {
        return identifiedClientStateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * client state associated with the channel
     * </pre>
     *
     * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1 [json_name = "identifiedClientState"];</code>
     */
    public Builder setIdentifiedClientState(com.ibc.core.client.v1.IdentifiedClientState value) {
      if (identifiedClientStateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        identifiedClientState_ = value;
      } else {
        identifiedClientStateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * client state associated with the channel
     * </pre>
     *
     * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1 [json_name = "identifiedClientState"];</code>
     */
    public Builder setIdentifiedClientState(
        com.ibc.core.client.v1.IdentifiedClientState.Builder builderForValue) {
      if (identifiedClientStateBuilder_ == null) {
        identifiedClientState_ = builderForValue.build();
      } else {
        identifiedClientStateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * client state associated with the channel
     * </pre>
     *
     * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1 [json_name = "identifiedClientState"];</code>
     */
    public Builder mergeIdentifiedClientState(com.ibc.core.client.v1.IdentifiedClientState value) {
      if (identifiedClientStateBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          identifiedClientState_ != null &&
          identifiedClientState_ != com.ibc.core.client.v1.IdentifiedClientState.getDefaultInstance()) {
          getIdentifiedClientStateBuilder().mergeFrom(value);
        } else {
          identifiedClientState_ = value;
        }
      } else {
        identifiedClientStateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * client state associated with the channel
     * </pre>
     *
     * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1 [json_name = "identifiedClientState"];</code>
     */
    public Builder clearIdentifiedClientState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      identifiedClientState_ = null;
      if (identifiedClientStateBuilder_ != null) {
        identifiedClientStateBuilder_.dispose();
        identifiedClientStateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * client state associated with the channel
     * </pre>
     *
     * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1 [json_name = "identifiedClientState"];</code>
     */
    public com.ibc.core.client.v1.IdentifiedClientState.Builder getIdentifiedClientStateBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getIdentifiedClientStateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * client state associated with the channel
     * </pre>
     *
     * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1 [json_name = "identifiedClientState"];</code>
     */
    public com.ibc.core.client.v1.IdentifiedClientStateOrBuilder getIdentifiedClientStateOrBuilder() {
      if (identifiedClientStateBuilder_ != null) {
        return identifiedClientStateBuilder_.getMessageOrBuilder();
      } else {
        return identifiedClientState_ == null ?
            com.ibc.core.client.v1.IdentifiedClientState.getDefaultInstance() : identifiedClientState_;
      }
    }
    /**
     * <pre>
     * client state associated with the channel
     * </pre>
     *
     * <code>.ibc.core.client.v1.IdentifiedClientState identified_client_state = 1 [json_name = "identifiedClientState"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ibc.core.client.v1.IdentifiedClientState, com.ibc.core.client.v1.IdentifiedClientState.Builder, com.ibc.core.client.v1.IdentifiedClientStateOrBuilder> 
        getIdentifiedClientStateFieldBuilder() {
      if (identifiedClientStateBuilder_ == null) {
        identifiedClientStateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ibc.core.client.v1.IdentifiedClientState, com.ibc.core.client.v1.IdentifiedClientState.Builder, com.ibc.core.client.v1.IdentifiedClientStateOrBuilder>(
                getIdentifiedClientState(),
                getParentForChildren(),
                isClean());
        identifiedClientState_ = null;
      }
      return identifiedClientStateBuilder_;
    }

    private com.google.protobuf.ByteString proof_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * merkle proof of existence
     * </pre>
     *
     * <code>bytes proof = 2 [json_name = "proof"];</code>
     * @return The proof.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getProof() {
      return proof_;
    }
    /**
     * <pre>
     * merkle proof of existence
     * </pre>
     *
     * <code>bytes proof = 2 [json_name = "proof"];</code>
     * @param value The proof to set.
     * @return This builder for chaining.
     */
    public Builder setProof(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      proof_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * merkle proof of existence
     * </pre>
     *
     * <code>bytes proof = 2 [json_name = "proof"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProof() {
      bitField0_ = (bitField0_ & ~0x00000002);
      proof_ = getDefaultInstance().getProof();
      onChanged();
      return this;
    }

    private com.ibc.core.client.v1.Height proofHeight_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ibc.core.client.v1.Height, com.ibc.core.client.v1.Height.Builder, com.ibc.core.client.v1.HeightOrBuilder> proofHeightBuilder_;
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
     * @return Whether the proofHeight field is set.
     */
    public boolean hasProofHeight() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
     * @return The proofHeight.
     */
    public com.ibc.core.client.v1.Height getProofHeight() {
      if (proofHeightBuilder_ == null) {
        return proofHeight_ == null ? com.ibc.core.client.v1.Height.getDefaultInstance() : proofHeight_;
      } else {
        return proofHeightBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
     */
    public Builder setProofHeight(com.ibc.core.client.v1.Height value) {
      if (proofHeightBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        proofHeight_ = value;
      } else {
        proofHeightBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
     */
    public Builder setProofHeight(
        com.ibc.core.client.v1.Height.Builder builderForValue) {
      if (proofHeightBuilder_ == null) {
        proofHeight_ = builderForValue.build();
      } else {
        proofHeightBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeProofHeight(com.ibc.core.client.v1.Height value) {
      if (proofHeightBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          proofHeight_ != null &&
          proofHeight_ != com.ibc.core.client.v1.Height.getDefaultInstance()) {
          getProofHeightBuilder().mergeFrom(value);
        } else {
          proofHeight_ = value;
        }
      } else {
        proofHeightBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearProofHeight() {
      bitField0_ = (bitField0_ & ~0x00000004);
      proofHeight_ = null;
      if (proofHeightBuilder_ != null) {
        proofHeightBuilder_.dispose();
        proofHeightBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
     */
    public com.ibc.core.client.v1.Height.Builder getProofHeightBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getProofHeightFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
     */
    public com.ibc.core.client.v1.HeightOrBuilder getProofHeightOrBuilder() {
      if (proofHeightBuilder_ != null) {
        return proofHeightBuilder_.getMessageOrBuilder();
      } else {
        return proofHeight_ == null ?
            com.ibc.core.client.v1.Height.getDefaultInstance() : proofHeight_;
      }
    }
    /**
     * <pre>
     * height at which the proof was retrieved
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ibc.core.client.v1.Height, com.ibc.core.client.v1.Height.Builder, com.ibc.core.client.v1.HeightOrBuilder> 
        getProofHeightFieldBuilder() {
      if (proofHeightBuilder_ == null) {
        proofHeightBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ibc.core.client.v1.Height, com.ibc.core.client.v1.Height.Builder, com.ibc.core.client.v1.HeightOrBuilder>(
                getProofHeight(),
                getParentForChildren(),
                isClean());
        proofHeight_ = null;
      }
      return proofHeightBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ibc.core.channel.v1.QueryChannelClientStateResponse)
  }

  // @@protoc_insertion_point(class_scope:ibc.core.channel.v1.QueryChannelClientStateResponse)
  private static final com.ibc.core.channel.v1.QueryChannelClientStateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.core.channel.v1.QueryChannelClientStateResponse();
  }

  public static com.ibc.core.channel.v1.QueryChannelClientStateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryChannelClientStateResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryChannelClientStateResponse>() {
    @java.lang.Override
    public QueryChannelClientStateResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryChannelClientStateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryChannelClientStateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.core.channel.v1.QueryChannelClientStateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

