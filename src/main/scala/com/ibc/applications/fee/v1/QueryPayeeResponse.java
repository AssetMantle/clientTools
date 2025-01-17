// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/fee/v1/query.proto

package com.ibc.applications.fee.v1;

/**
 * <pre>
 * QueryPayeeResponse defines the response type for the Payee rpc
 * </pre>
 *
 * Protobuf type {@code ibc.applications.fee.v1.QueryPayeeResponse}
 */
public final class QueryPayeeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.applications.fee.v1.QueryPayeeResponse)
    QueryPayeeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryPayeeResponse.newBuilder() to construct.
  private QueryPayeeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryPayeeResponse() {
    payeeAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryPayeeResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.applications.fee.v1.QueryProto.internal_static_ibc_applications_fee_v1_QueryPayeeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.applications.fee.v1.QueryProto.internal_static_ibc_applications_fee_v1_QueryPayeeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.applications.fee.v1.QueryPayeeResponse.class, com.ibc.applications.fee.v1.QueryPayeeResponse.Builder.class);
  }

  public static final int PAYEE_ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object payeeAddress_ = "";
  /**
   * <pre>
   * the payee address to which packet fees are paid out
   * </pre>
   *
   * <code>string payee_address = 1 [json_name = "payeeAddress", (.gogoproto.moretags) = "yaml:&#92;"payee_address&#92;""];</code>
   * @return The payeeAddress.
   */
  @java.lang.Override
  public java.lang.String getPayeeAddress() {
    java.lang.Object ref = payeeAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      payeeAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the payee address to which packet fees are paid out
   * </pre>
   *
   * <code>string payee_address = 1 [json_name = "payeeAddress", (.gogoproto.moretags) = "yaml:&#92;"payee_address&#92;""];</code>
   * @return The bytes for payeeAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPayeeAddressBytes() {
    java.lang.Object ref = payeeAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      payeeAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(payeeAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, payeeAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(payeeAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, payeeAddress_);
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
    if (!(obj instanceof com.ibc.applications.fee.v1.QueryPayeeResponse)) {
      return super.equals(obj);
    }
    com.ibc.applications.fee.v1.QueryPayeeResponse other = (com.ibc.applications.fee.v1.QueryPayeeResponse) obj;

    if (!getPayeeAddress()
        .equals(other.getPayeeAddress())) return false;
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
    hash = (37 * hash) + PAYEE_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getPayeeAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.applications.fee.v1.QueryPayeeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.applications.fee.v1.QueryPayeeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.applications.fee.v1.QueryPayeeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.applications.fee.v1.QueryPayeeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.applications.fee.v1.QueryPayeeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.applications.fee.v1.QueryPayeeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.applications.fee.v1.QueryPayeeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.applications.fee.v1.QueryPayeeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.applications.fee.v1.QueryPayeeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ibc.applications.fee.v1.QueryPayeeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.applications.fee.v1.QueryPayeeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.applications.fee.v1.QueryPayeeResponse parseFrom(
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
  public static Builder newBuilder(com.ibc.applications.fee.v1.QueryPayeeResponse prototype) {
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
   * QueryPayeeResponse defines the response type for the Payee rpc
   * </pre>
   *
   * Protobuf type {@code ibc.applications.fee.v1.QueryPayeeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.applications.fee.v1.QueryPayeeResponse)
      com.ibc.applications.fee.v1.QueryPayeeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.applications.fee.v1.QueryProto.internal_static_ibc_applications_fee_v1_QueryPayeeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.applications.fee.v1.QueryProto.internal_static_ibc_applications_fee_v1_QueryPayeeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.applications.fee.v1.QueryPayeeResponse.class, com.ibc.applications.fee.v1.QueryPayeeResponse.Builder.class);
    }

    // Construct using com.ibc.applications.fee.v1.QueryPayeeResponse.newBuilder()
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
      payeeAddress_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibc.applications.fee.v1.QueryProto.internal_static_ibc_applications_fee_v1_QueryPayeeResponse_descriptor;
    }

    @java.lang.Override
    public com.ibc.applications.fee.v1.QueryPayeeResponse getDefaultInstanceForType() {
      return com.ibc.applications.fee.v1.QueryPayeeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.applications.fee.v1.QueryPayeeResponse build() {
      com.ibc.applications.fee.v1.QueryPayeeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.applications.fee.v1.QueryPayeeResponse buildPartial() {
      com.ibc.applications.fee.v1.QueryPayeeResponse result = new com.ibc.applications.fee.v1.QueryPayeeResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ibc.applications.fee.v1.QueryPayeeResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.payeeAddress_ = payeeAddress_;
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
      if (other instanceof com.ibc.applications.fee.v1.QueryPayeeResponse) {
        return mergeFrom((com.ibc.applications.fee.v1.QueryPayeeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.applications.fee.v1.QueryPayeeResponse other) {
      if (other == com.ibc.applications.fee.v1.QueryPayeeResponse.getDefaultInstance()) return this;
      if (!other.getPayeeAddress().isEmpty()) {
        payeeAddress_ = other.payeeAddress_;
        bitField0_ |= 0x00000001;
        onChanged();
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
              payeeAddress_ = input.readStringRequireUtf8();
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

    private java.lang.Object payeeAddress_ = "";
    /**
     * <pre>
     * the payee address to which packet fees are paid out
     * </pre>
     *
     * <code>string payee_address = 1 [json_name = "payeeAddress", (.gogoproto.moretags) = "yaml:&#92;"payee_address&#92;""];</code>
     * @return The payeeAddress.
     */
    public java.lang.String getPayeeAddress() {
      java.lang.Object ref = payeeAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        payeeAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the payee address to which packet fees are paid out
     * </pre>
     *
     * <code>string payee_address = 1 [json_name = "payeeAddress", (.gogoproto.moretags) = "yaml:&#92;"payee_address&#92;""];</code>
     * @return The bytes for payeeAddress.
     */
    public com.google.protobuf.ByteString
        getPayeeAddressBytes() {
      java.lang.Object ref = payeeAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        payeeAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the payee address to which packet fees are paid out
     * </pre>
     *
     * <code>string payee_address = 1 [json_name = "payeeAddress", (.gogoproto.moretags) = "yaml:&#92;"payee_address&#92;""];</code>
     * @param value The payeeAddress to set.
     * @return This builder for chaining.
     */
    public Builder setPayeeAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      payeeAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the payee address to which packet fees are paid out
     * </pre>
     *
     * <code>string payee_address = 1 [json_name = "payeeAddress", (.gogoproto.moretags) = "yaml:&#92;"payee_address&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearPayeeAddress() {
      payeeAddress_ = getDefaultInstance().getPayeeAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the payee address to which packet fees are paid out
     * </pre>
     *
     * <code>string payee_address = 1 [json_name = "payeeAddress", (.gogoproto.moretags) = "yaml:&#92;"payee_address&#92;""];</code>
     * @param value The bytes for payeeAddress to set.
     * @return This builder for chaining.
     */
    public Builder setPayeeAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      payeeAddress_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:ibc.applications.fee.v1.QueryPayeeResponse)
  }

  // @@protoc_insertion_point(class_scope:ibc.applications.fee.v1.QueryPayeeResponse)
  private static final com.ibc.applications.fee.v1.QueryPayeeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.applications.fee.v1.QueryPayeeResponse();
  }

  public static com.ibc.applications.fee.v1.QueryPayeeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryPayeeResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryPayeeResponse>() {
    @java.lang.Override
    public QueryPayeeResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryPayeeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryPayeeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.applications.fee.v1.QueryPayeeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

