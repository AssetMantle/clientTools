// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/tx/v1beta1/service.proto

package com.cosmos.tx.v1beta1;

/**
 * <pre>
 * BroadcastTxResponse is the response type for the
 * Service.BroadcastTx method.
 * </pre>
 *
 * Protobuf type {@code cosmos.tx.v1beta1.BroadcastTxResponse}
 */
public final class BroadcastTxResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.tx.v1beta1.BroadcastTxResponse)
    BroadcastTxResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BroadcastTxResponse.newBuilder() to construct.
  private BroadcastTxResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BroadcastTxResponse() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new BroadcastTxResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ServiceProto.internal_static_cosmos_tx_v1beta1_BroadcastTxResponse_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ServiceProto.internal_static_cosmos_tx_v1beta1_BroadcastTxResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            BroadcastTxResponse.class, Builder.class);
  }

  public static final int TX_RESPONSE_FIELD_NUMBER = 1;
  private com.cosmos.base.abci.v1beta1.TxResponse txResponse_;
  /**
   * <pre>
   * tx_response is the queried TxResponses.
   * </pre>
   *
   * <code>.cosmos.base.abci.v1beta1.TxResponse tx_response = 1 [json_name = "txResponse"];</code>
   * @return Whether the txResponse field is set.
   */
  @Override
  public boolean hasTxResponse() {
    return txResponse_ != null;
  }
  /**
   * <pre>
   * tx_response is the queried TxResponses.
   * </pre>
   *
   * <code>.cosmos.base.abci.v1beta1.TxResponse tx_response = 1 [json_name = "txResponse"];</code>
   * @return The txResponse.
   */
  @Override
  public com.cosmos.base.abci.v1beta1.TxResponse getTxResponse() {
    return txResponse_ == null ? com.cosmos.base.abci.v1beta1.TxResponse.getDefaultInstance() : txResponse_;
  }
  /**
   * <pre>
   * tx_response is the queried TxResponses.
   * </pre>
   *
   * <code>.cosmos.base.abci.v1beta1.TxResponse tx_response = 1 [json_name = "txResponse"];</code>
   */
  @Override
  public com.cosmos.base.abci.v1beta1.TxResponseOrBuilder getTxResponseOrBuilder() {
    return txResponse_ == null ? com.cosmos.base.abci.v1beta1.TxResponse.getDefaultInstance() : txResponse_;
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
    if (txResponse_ != null) {
      output.writeMessage(1, getTxResponse());
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (txResponse_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTxResponse());
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
    if (!(obj instanceof BroadcastTxResponse)) {
      return super.equals(obj);
    }
    BroadcastTxResponse other = (BroadcastTxResponse) obj;

    if (hasTxResponse() != other.hasTxResponse()) return false;
    if (hasTxResponse()) {
      if (!getTxResponse()
          .equals(other.getTxResponse())) return false;
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
    if (hasTxResponse()) {
      hash = (37 * hash) + TX_RESPONSE_FIELD_NUMBER;
      hash = (53 * hash) + getTxResponse().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static BroadcastTxResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BroadcastTxResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BroadcastTxResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BroadcastTxResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BroadcastTxResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BroadcastTxResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BroadcastTxResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BroadcastTxResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static BroadcastTxResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static BroadcastTxResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static BroadcastTxResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BroadcastTxResponse parseFrom(
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
  public static Builder newBuilder(BroadcastTxResponse prototype) {
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
   * BroadcastTxResponse is the response type for the
   * Service.BroadcastTx method.
   * </pre>
   *
   * Protobuf type {@code cosmos.tx.v1beta1.BroadcastTxResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.tx.v1beta1.BroadcastTxResponse)
      BroadcastTxResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ServiceProto.internal_static_cosmos_tx_v1beta1_BroadcastTxResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_cosmos_tx_v1beta1_BroadcastTxResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BroadcastTxResponse.class, Builder.class);
    }

    // Construct using com.cosmos.tx.v1beta1.BroadcastTxResponse.newBuilder()
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
      txResponse_ = null;
      if (txResponseBuilder_ != null) {
        txResponseBuilder_.dispose();
        txResponseBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ServiceProto.internal_static_cosmos_tx_v1beta1_BroadcastTxResponse_descriptor;
    }

    @Override
    public BroadcastTxResponse getDefaultInstanceForType() {
      return BroadcastTxResponse.getDefaultInstance();
    }

    @Override
    public BroadcastTxResponse build() {
      BroadcastTxResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public BroadcastTxResponse buildPartial() {
      BroadcastTxResponse result = new BroadcastTxResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(BroadcastTxResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.txResponse_ = txResponseBuilder_ == null
            ? txResponse_
            : txResponseBuilder_.build();
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
      if (other instanceof BroadcastTxResponse) {
        return mergeFrom((BroadcastTxResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(BroadcastTxResponse other) {
      if (other == BroadcastTxResponse.getDefaultInstance()) return this;
      if (other.hasTxResponse()) {
        mergeTxResponse(other.getTxResponse());
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
                  getTxResponseFieldBuilder().getBuilder(),
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

    private com.cosmos.base.abci.v1beta1.TxResponse txResponse_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.abci.v1beta1.TxResponse, com.cosmos.base.abci.v1beta1.TxResponse.Builder, com.cosmos.base.abci.v1beta1.TxResponseOrBuilder> txResponseBuilder_;
    /**
     * <pre>
     * tx_response is the queried TxResponses.
     * </pre>
     *
     * <code>.cosmos.base.abci.v1beta1.TxResponse tx_response = 1 [json_name = "txResponse"];</code>
     * @return Whether the txResponse field is set.
     */
    public boolean hasTxResponse() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * tx_response is the queried TxResponses.
     * </pre>
     *
     * <code>.cosmos.base.abci.v1beta1.TxResponse tx_response = 1 [json_name = "txResponse"];</code>
     * @return The txResponse.
     */
    public com.cosmos.base.abci.v1beta1.TxResponse getTxResponse() {
      if (txResponseBuilder_ == null) {
        return txResponse_ == null ? com.cosmos.base.abci.v1beta1.TxResponse.getDefaultInstance() : txResponse_;
      } else {
        return txResponseBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * tx_response is the queried TxResponses.
     * </pre>
     *
     * <code>.cosmos.base.abci.v1beta1.TxResponse tx_response = 1 [json_name = "txResponse"];</code>
     */
    public Builder setTxResponse(com.cosmos.base.abci.v1beta1.TxResponse value) {
      if (txResponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        txResponse_ = value;
      } else {
        txResponseBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * tx_response is the queried TxResponses.
     * </pre>
     *
     * <code>.cosmos.base.abci.v1beta1.TxResponse tx_response = 1 [json_name = "txResponse"];</code>
     */
    public Builder setTxResponse(
        com.cosmos.base.abci.v1beta1.TxResponse.Builder builderForValue) {
      if (txResponseBuilder_ == null) {
        txResponse_ = builderForValue.build();
      } else {
        txResponseBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * tx_response is the queried TxResponses.
     * </pre>
     *
     * <code>.cosmos.base.abci.v1beta1.TxResponse tx_response = 1 [json_name = "txResponse"];</code>
     */
    public Builder mergeTxResponse(com.cosmos.base.abci.v1beta1.TxResponse value) {
      if (txResponseBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          txResponse_ != null &&
          txResponse_ != com.cosmos.base.abci.v1beta1.TxResponse.getDefaultInstance()) {
          getTxResponseBuilder().mergeFrom(value);
        } else {
          txResponse_ = value;
        }
      } else {
        txResponseBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * tx_response is the queried TxResponses.
     * </pre>
     *
     * <code>.cosmos.base.abci.v1beta1.TxResponse tx_response = 1 [json_name = "txResponse"];</code>
     */
    public Builder clearTxResponse() {
      bitField0_ = (bitField0_ & ~0x00000001);
      txResponse_ = null;
      if (txResponseBuilder_ != null) {
        txResponseBuilder_.dispose();
        txResponseBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * tx_response is the queried TxResponses.
     * </pre>
     *
     * <code>.cosmos.base.abci.v1beta1.TxResponse tx_response = 1 [json_name = "txResponse"];</code>
     */
    public com.cosmos.base.abci.v1beta1.TxResponse.Builder getTxResponseBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTxResponseFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * tx_response is the queried TxResponses.
     * </pre>
     *
     * <code>.cosmos.base.abci.v1beta1.TxResponse tx_response = 1 [json_name = "txResponse"];</code>
     */
    public com.cosmos.base.abci.v1beta1.TxResponseOrBuilder getTxResponseOrBuilder() {
      if (txResponseBuilder_ != null) {
        return txResponseBuilder_.getMessageOrBuilder();
      } else {
        return txResponse_ == null ?
            com.cosmos.base.abci.v1beta1.TxResponse.getDefaultInstance() : txResponse_;
      }
    }
    /**
     * <pre>
     * tx_response is the queried TxResponses.
     * </pre>
     *
     * <code>.cosmos.base.abci.v1beta1.TxResponse tx_response = 1 [json_name = "txResponse"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.abci.v1beta1.TxResponse, com.cosmos.base.abci.v1beta1.TxResponse.Builder, com.cosmos.base.abci.v1beta1.TxResponseOrBuilder> 
        getTxResponseFieldBuilder() {
      if (txResponseBuilder_ == null) {
        txResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.abci.v1beta1.TxResponse, com.cosmos.base.abci.v1beta1.TxResponse.Builder, com.cosmos.base.abci.v1beta1.TxResponseOrBuilder>(
                getTxResponse(),
                getParentForChildren(),
                isClean());
        txResponse_ = null;
      }
      return txResponseBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.tx.v1beta1.BroadcastTxResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.tx.v1beta1.BroadcastTxResponse)
  private static final BroadcastTxResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BroadcastTxResponse();
  }

  public static BroadcastTxResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BroadcastTxResponse>
      PARSER = new com.google.protobuf.AbstractParser<BroadcastTxResponse>() {
    @Override
    public BroadcastTxResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BroadcastTxResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<BroadcastTxResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public BroadcastTxResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

