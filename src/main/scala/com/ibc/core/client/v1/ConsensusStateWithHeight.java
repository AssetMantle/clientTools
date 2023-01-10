// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/client/v1/client.proto

package com.ibc.core.client.v1;

/**
 * <pre>
 * ConsensusStateWithHeight defines a consensus state with an additional height
 * field.
 * </pre>
 *
 * Protobuf type {@code ibc.core.client.v1.ConsensusStateWithHeight}
 */
public final class ConsensusStateWithHeight extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.core.client.v1.ConsensusStateWithHeight)
    ConsensusStateWithHeightOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConsensusStateWithHeight.newBuilder() to construct.
  private ConsensusStateWithHeight(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConsensusStateWithHeight() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConsensusStateWithHeight();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.core.client.v1.ClientProto.internal_static_ibc_core_client_v1_ConsensusStateWithHeight_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.core.client.v1.ClientProto.internal_static_ibc_core_client_v1_ConsensusStateWithHeight_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.core.client.v1.ConsensusStateWithHeight.class, com.ibc.core.client.v1.ConsensusStateWithHeight.Builder.class);
  }

  public static final int HEIGHT_FIELD_NUMBER = 1;
  private com.ibc.core.client.v1.Height height_;
  /**
   * <pre>
   * consensus state height
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height height = 1 [json_name = "height", (.gogoproto.nullable) = false];</code>
   * @return Whether the height field is set.
   */
  @java.lang.Override
  public boolean hasHeight() {
    return height_ != null;
  }
  /**
   * <pre>
   * consensus state height
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height height = 1 [json_name = "height", (.gogoproto.nullable) = false];</code>
   * @return The height.
   */
  @java.lang.Override
  public com.ibc.core.client.v1.Height getHeight() {
    return height_ == null ? com.ibc.core.client.v1.Height.getDefaultInstance() : height_;
  }
  /**
   * <pre>
   * consensus state height
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height height = 1 [json_name = "height", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.ibc.core.client.v1.HeightOrBuilder getHeightOrBuilder() {
    return height_ == null ? com.ibc.core.client.v1.Height.getDefaultInstance() : height_;
  }

  public static final int CONSENSUS_STATE_FIELD_NUMBER = 2;
  private com.google.protobuf.Any consensusState_;
  /**
   * <pre>
   * consensus state
   * </pre>
   *
   * <code>.google.protobuf.Any consensus_state = 2 [json_name = "consensusState", (.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
   * @return Whether the consensusState field is set.
   */
  @java.lang.Override
  public boolean hasConsensusState() {
    return consensusState_ != null;
  }
  /**
   * <pre>
   * consensus state
   * </pre>
   *
   * <code>.google.protobuf.Any consensus_state = 2 [json_name = "consensusState", (.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
   * @return The consensusState.
   */
  @java.lang.Override
  public com.google.protobuf.Any getConsensusState() {
    return consensusState_ == null ? com.google.protobuf.Any.getDefaultInstance() : consensusState_;
  }
  /**
   * <pre>
   * consensus state
   * </pre>
   *
   * <code>.google.protobuf.Any consensus_state = 2 [json_name = "consensusState", (.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getConsensusStateOrBuilder() {
    return consensusState_ == null ? com.google.protobuf.Any.getDefaultInstance() : consensusState_;
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
    if (height_ != null) {
      output.writeMessage(1, getHeight());
    }
    if (consensusState_ != null) {
      output.writeMessage(2, getConsensusState());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (height_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeight());
    }
    if (consensusState_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getConsensusState());
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
    if (!(obj instanceof com.ibc.core.client.v1.ConsensusStateWithHeight)) {
      return super.equals(obj);
    }
    com.ibc.core.client.v1.ConsensusStateWithHeight other = (com.ibc.core.client.v1.ConsensusStateWithHeight) obj;

    if (hasHeight() != other.hasHeight()) return false;
    if (hasHeight()) {
      if (!getHeight()
          .equals(other.getHeight())) return false;
    }
    if (hasConsensusState() != other.hasConsensusState()) return false;
    if (hasConsensusState()) {
      if (!getConsensusState()
          .equals(other.getConsensusState())) return false;
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
    if (hasHeight()) {
      hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + getHeight().hashCode();
    }
    if (hasConsensusState()) {
      hash = (37 * hash) + CONSENSUS_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getConsensusState().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.core.client.v1.ConsensusStateWithHeight parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.client.v1.ConsensusStateWithHeight parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.client.v1.ConsensusStateWithHeight parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.client.v1.ConsensusStateWithHeight parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.client.v1.ConsensusStateWithHeight parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.client.v1.ConsensusStateWithHeight parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.client.v1.ConsensusStateWithHeight parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.client.v1.ConsensusStateWithHeight parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.core.client.v1.ConsensusStateWithHeight parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ibc.core.client.v1.ConsensusStateWithHeight parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.core.client.v1.ConsensusStateWithHeight parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.client.v1.ConsensusStateWithHeight parseFrom(
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
  public static Builder newBuilder(com.ibc.core.client.v1.ConsensusStateWithHeight prototype) {
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
   * ConsensusStateWithHeight defines a consensus state with an additional height
   * field.
   * </pre>
   *
   * Protobuf type {@code ibc.core.client.v1.ConsensusStateWithHeight}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.core.client.v1.ConsensusStateWithHeight)
      com.ibc.core.client.v1.ConsensusStateWithHeightOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.core.client.v1.ClientProto.internal_static_ibc_core_client_v1_ConsensusStateWithHeight_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.core.client.v1.ClientProto.internal_static_ibc_core_client_v1_ConsensusStateWithHeight_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.core.client.v1.ConsensusStateWithHeight.class, com.ibc.core.client.v1.ConsensusStateWithHeight.Builder.class);
    }

    // Construct using com.ibc.core.client.v1.ConsensusStateWithHeight.newBuilder()
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
      height_ = null;
      if (heightBuilder_ != null) {
        heightBuilder_.dispose();
        heightBuilder_ = null;
      }
      consensusState_ = null;
      if (consensusStateBuilder_ != null) {
        consensusStateBuilder_.dispose();
        consensusStateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibc.core.client.v1.ClientProto.internal_static_ibc_core_client_v1_ConsensusStateWithHeight_descriptor;
    }

    @java.lang.Override
    public com.ibc.core.client.v1.ConsensusStateWithHeight getDefaultInstanceForType() {
      return com.ibc.core.client.v1.ConsensusStateWithHeight.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.core.client.v1.ConsensusStateWithHeight build() {
      com.ibc.core.client.v1.ConsensusStateWithHeight result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.core.client.v1.ConsensusStateWithHeight buildPartial() {
      com.ibc.core.client.v1.ConsensusStateWithHeight result = new com.ibc.core.client.v1.ConsensusStateWithHeight(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ibc.core.client.v1.ConsensusStateWithHeight result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.height_ = heightBuilder_ == null
            ? height_
            : heightBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.consensusState_ = consensusStateBuilder_ == null
            ? consensusState_
            : consensusStateBuilder_.build();
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
      if (other instanceof com.ibc.core.client.v1.ConsensusStateWithHeight) {
        return mergeFrom((com.ibc.core.client.v1.ConsensusStateWithHeight)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.core.client.v1.ConsensusStateWithHeight other) {
      if (other == com.ibc.core.client.v1.ConsensusStateWithHeight.getDefaultInstance()) return this;
      if (other.hasHeight()) {
        mergeHeight(other.getHeight());
      }
      if (other.hasConsensusState()) {
        mergeConsensusState(other.getConsensusState());
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
                  getHeightFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getConsensusStateFieldBuilder().getBuilder(),
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

    private com.ibc.core.client.v1.Height height_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ibc.core.client.v1.Height, com.ibc.core.client.v1.Height.Builder, com.ibc.core.client.v1.HeightOrBuilder> heightBuilder_;
    /**
     * <pre>
     * consensus state height
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height height = 1 [json_name = "height", (.gogoproto.nullable) = false];</code>
     * @return Whether the height field is set.
     */
    public boolean hasHeight() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * consensus state height
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height height = 1 [json_name = "height", (.gogoproto.nullable) = false];</code>
     * @return The height.
     */
    public com.ibc.core.client.v1.Height getHeight() {
      if (heightBuilder_ == null) {
        return height_ == null ? com.ibc.core.client.v1.Height.getDefaultInstance() : height_;
      } else {
        return heightBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * consensus state height
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height height = 1 [json_name = "height", (.gogoproto.nullable) = false];</code>
     */
    public Builder setHeight(com.ibc.core.client.v1.Height value) {
      if (heightBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        height_ = value;
      } else {
        heightBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * consensus state height
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height height = 1 [json_name = "height", (.gogoproto.nullable) = false];</code>
     */
    public Builder setHeight(
        com.ibc.core.client.v1.Height.Builder builderForValue) {
      if (heightBuilder_ == null) {
        height_ = builderForValue.build();
      } else {
        heightBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * consensus state height
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height height = 1 [json_name = "height", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeHeight(com.ibc.core.client.v1.Height value) {
      if (heightBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          height_ != null &&
          height_ != com.ibc.core.client.v1.Height.getDefaultInstance()) {
          getHeightBuilder().mergeFrom(value);
        } else {
          height_ = value;
        }
      } else {
        heightBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * consensus state height
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height height = 1 [json_name = "height", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearHeight() {
      bitField0_ = (bitField0_ & ~0x00000001);
      height_ = null;
      if (heightBuilder_ != null) {
        heightBuilder_.dispose();
        heightBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * consensus state height
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height height = 1 [json_name = "height", (.gogoproto.nullable) = false];</code>
     */
    public com.ibc.core.client.v1.Height.Builder getHeightBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getHeightFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * consensus state height
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height height = 1 [json_name = "height", (.gogoproto.nullable) = false];</code>
     */
    public com.ibc.core.client.v1.HeightOrBuilder getHeightOrBuilder() {
      if (heightBuilder_ != null) {
        return heightBuilder_.getMessageOrBuilder();
      } else {
        return height_ == null ?
            com.ibc.core.client.v1.Height.getDefaultInstance() : height_;
      }
    }
    /**
     * <pre>
     * consensus state height
     * </pre>
     *
     * <code>.ibc.core.client.v1.Height height = 1 [json_name = "height", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ibc.core.client.v1.Height, com.ibc.core.client.v1.Height.Builder, com.ibc.core.client.v1.HeightOrBuilder> 
        getHeightFieldBuilder() {
      if (heightBuilder_ == null) {
        heightBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ibc.core.client.v1.Height, com.ibc.core.client.v1.Height.Builder, com.ibc.core.client.v1.HeightOrBuilder>(
                getHeight(),
                getParentForChildren(),
                isClean());
        height_ = null;
      }
      return heightBuilder_;
    }

    private com.google.protobuf.Any consensusState_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> consensusStateBuilder_;
    /**
     * <pre>
     * consensus state
     * </pre>
     *
     * <code>.google.protobuf.Any consensus_state = 2 [json_name = "consensusState", (.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
     * @return Whether the consensusState field is set.
     */
    public boolean hasConsensusState() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * consensus state
     * </pre>
     *
     * <code>.google.protobuf.Any consensus_state = 2 [json_name = "consensusState", (.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
     * @return The consensusState.
     */
    public com.google.protobuf.Any getConsensusState() {
      if (consensusStateBuilder_ == null) {
        return consensusState_ == null ? com.google.protobuf.Any.getDefaultInstance() : consensusState_;
      } else {
        return consensusStateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * consensus state
     * </pre>
     *
     * <code>.google.protobuf.Any consensus_state = 2 [json_name = "consensusState", (.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
     */
    public Builder setConsensusState(com.google.protobuf.Any value) {
      if (consensusStateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        consensusState_ = value;
      } else {
        consensusStateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * consensus state
     * </pre>
     *
     * <code>.google.protobuf.Any consensus_state = 2 [json_name = "consensusState", (.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
     */
    public Builder setConsensusState(
        com.google.protobuf.Any.Builder builderForValue) {
      if (consensusStateBuilder_ == null) {
        consensusState_ = builderForValue.build();
      } else {
        consensusStateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * consensus state
     * </pre>
     *
     * <code>.google.protobuf.Any consensus_state = 2 [json_name = "consensusState", (.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
     */
    public Builder mergeConsensusState(com.google.protobuf.Any value) {
      if (consensusStateBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          consensusState_ != null &&
          consensusState_ != com.google.protobuf.Any.getDefaultInstance()) {
          getConsensusStateBuilder().mergeFrom(value);
        } else {
          consensusState_ = value;
        }
      } else {
        consensusStateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * consensus state
     * </pre>
     *
     * <code>.google.protobuf.Any consensus_state = 2 [json_name = "consensusState", (.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
     */
    public Builder clearConsensusState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      consensusState_ = null;
      if (consensusStateBuilder_ != null) {
        consensusStateBuilder_.dispose();
        consensusStateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * consensus state
     * </pre>
     *
     * <code>.google.protobuf.Any consensus_state = 2 [json_name = "consensusState", (.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
     */
    public com.google.protobuf.Any.Builder getConsensusStateBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getConsensusStateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * consensus state
     * </pre>
     *
     * <code>.google.protobuf.Any consensus_state = 2 [json_name = "consensusState", (.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
     */
    public com.google.protobuf.AnyOrBuilder getConsensusStateOrBuilder() {
      if (consensusStateBuilder_ != null) {
        return consensusStateBuilder_.getMessageOrBuilder();
      } else {
        return consensusState_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : consensusState_;
      }
    }
    /**
     * <pre>
     * consensus state
     * </pre>
     *
     * <code>.google.protobuf.Any consensus_state = 2 [json_name = "consensusState", (.gogoproto.moretags) = "yaml:&#92;"consensus_state&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getConsensusStateFieldBuilder() {
      if (consensusStateBuilder_ == null) {
        consensusStateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getConsensusState(),
                getParentForChildren(),
                isClean());
        consensusState_ = null;
      }
      return consensusStateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ibc.core.client.v1.ConsensusStateWithHeight)
  }

  // @@protoc_insertion_point(class_scope:ibc.core.client.v1.ConsensusStateWithHeight)
  private static final com.ibc.core.client.v1.ConsensusStateWithHeight DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.core.client.v1.ConsensusStateWithHeight();
  }

  public static com.ibc.core.client.v1.ConsensusStateWithHeight getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConsensusStateWithHeight>
      PARSER = new com.google.protobuf.AbstractParser<ConsensusStateWithHeight>() {
    @java.lang.Override
    public ConsensusStateWithHeight parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConsensusStateWithHeight> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConsensusStateWithHeight> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.core.client.v1.ConsensusStateWithHeight getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
