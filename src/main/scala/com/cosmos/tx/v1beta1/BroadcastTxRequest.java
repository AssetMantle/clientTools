// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/tx/v1beta1/service.proto

package com.cosmos.tx.v1beta1;

/**
 * <pre>
 * BroadcastTxRequest is the request type for the Service.BroadcastTxRequest
 * RPC method.
 * </pre>
 *
 * Protobuf type {@code cosmos.tx.v1beta1.BroadcastTxRequest}
 */
public final class BroadcastTxRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.tx.v1beta1.BroadcastTxRequest)
    BroadcastTxRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BroadcastTxRequest.newBuilder() to construct.
  private BroadcastTxRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BroadcastTxRequest() {
    txBytes_ = com.google.protobuf.ByteString.EMPTY;
    mode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BroadcastTxRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.tx.v1beta1.ServiceProto.internal_static_cosmos_tx_v1beta1_BroadcastTxRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.tx.v1beta1.ServiceProto.internal_static_cosmos_tx_v1beta1_BroadcastTxRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.tx.v1beta1.BroadcastTxRequest.class, com.cosmos.tx.v1beta1.BroadcastTxRequest.Builder.class);
  }

  public static final int TX_BYTES_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString txBytes_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * tx_bytes is the raw transaction.
   * </pre>
   *
   * <code>bytes tx_bytes = 1 [json_name = "txBytes"];</code>
   * @return The txBytes.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTxBytes() {
    return txBytes_;
  }

  public static final int MODE_FIELD_NUMBER = 2;
  private int mode_ = 0;
  /**
   * <code>.cosmos.tx.v1beta1.BroadcastMode mode = 2 [json_name = "mode"];</code>
   * @return The enum numeric value on the wire for mode.
   */
  @java.lang.Override public int getModeValue() {
    return mode_;
  }
  /**
   * <code>.cosmos.tx.v1beta1.BroadcastMode mode = 2 [json_name = "mode"];</code>
   * @return The mode.
   */
  @java.lang.Override public com.cosmos.tx.v1beta1.BroadcastMode getMode() {
    com.cosmos.tx.v1beta1.BroadcastMode result = com.cosmos.tx.v1beta1.BroadcastMode.forNumber(mode_);
    return result == null ? com.cosmos.tx.v1beta1.BroadcastMode.UNRECOGNIZED : result;
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
    if (!txBytes_.isEmpty()) {
      output.writeBytes(1, txBytes_);
    }
    if (mode_ != com.cosmos.tx.v1beta1.BroadcastMode.BROADCAST_MODE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, mode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!txBytes_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, txBytes_);
    }
    if (mode_ != com.cosmos.tx.v1beta1.BroadcastMode.BROADCAST_MODE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, mode_);
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
    if (!(obj instanceof com.cosmos.tx.v1beta1.BroadcastTxRequest)) {
      return super.equals(obj);
    }
    com.cosmos.tx.v1beta1.BroadcastTxRequest other = (com.cosmos.tx.v1beta1.BroadcastTxRequest) obj;

    if (!getTxBytes()
        .equals(other.getTxBytes())) return false;
    if (mode_ != other.mode_) return false;
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
    hash = (37 * hash) + TX_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + getTxBytes().hashCode();
    hash = (37 * hash) + MODE_FIELD_NUMBER;
    hash = (53 * hash) + mode_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.tx.v1beta1.BroadcastTxRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.tx.v1beta1.BroadcastTxRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.tx.v1beta1.BroadcastTxRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.tx.v1beta1.BroadcastTxRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.tx.v1beta1.BroadcastTxRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.tx.v1beta1.BroadcastTxRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.tx.v1beta1.BroadcastTxRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.tx.v1beta1.BroadcastTxRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.tx.v1beta1.BroadcastTxRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cosmos.tx.v1beta1.BroadcastTxRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.tx.v1beta1.BroadcastTxRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.tx.v1beta1.BroadcastTxRequest parseFrom(
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
  public static Builder newBuilder(com.cosmos.tx.v1beta1.BroadcastTxRequest prototype) {
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
   * BroadcastTxRequest is the request type for the Service.BroadcastTxRequest
   * RPC method.
   * </pre>
   *
   * Protobuf type {@code cosmos.tx.v1beta1.BroadcastTxRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.tx.v1beta1.BroadcastTxRequest)
      com.cosmos.tx.v1beta1.BroadcastTxRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.tx.v1beta1.ServiceProto.internal_static_cosmos_tx_v1beta1_BroadcastTxRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.tx.v1beta1.ServiceProto.internal_static_cosmos_tx_v1beta1_BroadcastTxRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.tx.v1beta1.BroadcastTxRequest.class, com.cosmos.tx.v1beta1.BroadcastTxRequest.Builder.class);
    }

    // Construct using com.cosmos.tx.v1beta1.BroadcastTxRequest.newBuilder()
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
      txBytes_ = com.google.protobuf.ByteString.EMPTY;
      mode_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.tx.v1beta1.ServiceProto.internal_static_cosmos_tx_v1beta1_BroadcastTxRequest_descriptor;
    }

    @java.lang.Override
    public com.cosmos.tx.v1beta1.BroadcastTxRequest getDefaultInstanceForType() {
      return com.cosmos.tx.v1beta1.BroadcastTxRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.tx.v1beta1.BroadcastTxRequest build() {
      com.cosmos.tx.v1beta1.BroadcastTxRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.tx.v1beta1.BroadcastTxRequest buildPartial() {
      com.cosmos.tx.v1beta1.BroadcastTxRequest result = new com.cosmos.tx.v1beta1.BroadcastTxRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.tx.v1beta1.BroadcastTxRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.txBytes_ = txBytes_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.mode_ = mode_;
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
      if (other instanceof com.cosmos.tx.v1beta1.BroadcastTxRequest) {
        return mergeFrom((com.cosmos.tx.v1beta1.BroadcastTxRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.tx.v1beta1.BroadcastTxRequest other) {
      if (other == com.cosmos.tx.v1beta1.BroadcastTxRequest.getDefaultInstance()) return this;
      if (other.getTxBytes() != com.google.protobuf.ByteString.EMPTY) {
        setTxBytes(other.getTxBytes());
      }
      if (other.mode_ != 0) {
        setModeValue(other.getModeValue());
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
              txBytes_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              mode_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private com.google.protobuf.ByteString txBytes_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * tx_bytes is the raw transaction.
     * </pre>
     *
     * <code>bytes tx_bytes = 1 [json_name = "txBytes"];</code>
     * @return The txBytes.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getTxBytes() {
      return txBytes_;
    }
    /**
     * <pre>
     * tx_bytes is the raw transaction.
     * </pre>
     *
     * <code>bytes tx_bytes = 1 [json_name = "txBytes"];</code>
     * @param value The txBytes to set.
     * @return This builder for chaining.
     */
    public Builder setTxBytes(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      txBytes_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * tx_bytes is the raw transaction.
     * </pre>
     *
     * <code>bytes tx_bytes = 1 [json_name = "txBytes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTxBytes() {
      bitField0_ = (bitField0_ & ~0x00000001);
      txBytes_ = getDefaultInstance().getTxBytes();
      onChanged();
      return this;
    }

    private int mode_ = 0;
    /**
     * <code>.cosmos.tx.v1beta1.BroadcastMode mode = 2 [json_name = "mode"];</code>
     * @return The enum numeric value on the wire for mode.
     */
    @java.lang.Override public int getModeValue() {
      return mode_;
    }
    /**
     * <code>.cosmos.tx.v1beta1.BroadcastMode mode = 2 [json_name = "mode"];</code>
     * @param value The enum numeric value on the wire for mode to set.
     * @return This builder for chaining.
     */
    public Builder setModeValue(int value) {
      mode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.tx.v1beta1.BroadcastMode mode = 2 [json_name = "mode"];</code>
     * @return The mode.
     */
    @java.lang.Override
    public com.cosmos.tx.v1beta1.BroadcastMode getMode() {
      com.cosmos.tx.v1beta1.BroadcastMode result = com.cosmos.tx.v1beta1.BroadcastMode.forNumber(mode_);
      return result == null ? com.cosmos.tx.v1beta1.BroadcastMode.UNRECOGNIZED : result;
    }
    /**
     * <code>.cosmos.tx.v1beta1.BroadcastMode mode = 2 [json_name = "mode"];</code>
     * @param value The mode to set.
     * @return This builder for chaining.
     */
    public Builder setMode(com.cosmos.tx.v1beta1.BroadcastMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      mode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.tx.v1beta1.BroadcastMode mode = 2 [json_name = "mode"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMode() {
      bitField0_ = (bitField0_ & ~0x00000002);
      mode_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:cosmos.tx.v1beta1.BroadcastTxRequest)
  }

  // @@protoc_insertion_point(class_scope:cosmos.tx.v1beta1.BroadcastTxRequest)
  private static final com.cosmos.tx.v1beta1.BroadcastTxRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.tx.v1beta1.BroadcastTxRequest();
  }

  public static com.cosmos.tx.v1beta1.BroadcastTxRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BroadcastTxRequest>
      PARSER = new com.google.protobuf.AbstractParser<BroadcastTxRequest>() {
    @java.lang.Override
    public BroadcastTxRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<BroadcastTxRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BroadcastTxRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.tx.v1beta1.BroadcastTxRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

