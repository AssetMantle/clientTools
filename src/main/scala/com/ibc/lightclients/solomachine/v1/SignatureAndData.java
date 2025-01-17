// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/solomachine/v1/solomachine.proto

package com.ibc.lightclients.solomachine.v1;

/**
 * <pre>
 * SignatureAndData contains a signature and the data signed over to create that
 * signature.
 * </pre>
 *
 * Protobuf type {@code ibc.lightclients.solomachine.v1.SignatureAndData}
 */
public final class SignatureAndData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.lightclients.solomachine.v1.SignatureAndData)
    SignatureAndDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SignatureAndData.newBuilder() to construct.
  private SignatureAndData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SignatureAndData() {
    signature_ = com.google.protobuf.ByteString.EMPTY;
    dataType_ = 0;
    data_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SignatureAndData();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.lightclients.solomachine.v1.SolomachineProto.internal_static_ibc_lightclients_solomachine_v1_SignatureAndData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.lightclients.solomachine.v1.SolomachineProto.internal_static_ibc_lightclients_solomachine_v1_SignatureAndData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.lightclients.solomachine.v1.SignatureAndData.class, com.ibc.lightclients.solomachine.v1.SignatureAndData.Builder.class);
  }

  public static final int SIGNATURE_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes signature = 1 [json_name = "signature"];</code>
   * @return The signature.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSignature() {
    return signature_;
  }

  public static final int DATA_TYPE_FIELD_NUMBER = 2;
  private int dataType_ = 0;
  /**
   * <code>.ibc.lightclients.solomachine.v1.DataType data_type = 2 [json_name = "dataType", (.gogoproto.moretags) = "yaml:&#92;"data_type&#92;""];</code>
   * @return The enum numeric value on the wire for dataType.
   */
  @java.lang.Override public int getDataTypeValue() {
    return dataType_;
  }
  /**
   * <code>.ibc.lightclients.solomachine.v1.DataType data_type = 2 [json_name = "dataType", (.gogoproto.moretags) = "yaml:&#92;"data_type&#92;""];</code>
   * @return The dataType.
   */
  @java.lang.Override public com.ibc.lightclients.solomachine.v1.DataType getDataType() {
    com.ibc.lightclients.solomachine.v1.DataType result = com.ibc.lightclients.solomachine.v1.DataType.forNumber(dataType_);
    return result == null ? com.ibc.lightclients.solomachine.v1.DataType.UNRECOGNIZED : result;
  }

  public static final int DATA_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes data = 3 [json_name = "data"];</code>
   * @return The data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getData() {
    return data_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 4;
  private long timestamp_ = 0L;
  /**
   * <code>uint64 timestamp = 4 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public long getTimestamp() {
    return timestamp_;
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
    if (!signature_.isEmpty()) {
      output.writeBytes(1, signature_);
    }
    if (dataType_ != com.ibc.lightclients.solomachine.v1.DataType.DATA_TYPE_UNINITIALIZED_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, dataType_);
    }
    if (!data_.isEmpty()) {
      output.writeBytes(3, data_);
    }
    if (timestamp_ != 0L) {
      output.writeUInt64(4, timestamp_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!signature_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, signature_);
    }
    if (dataType_ != com.ibc.lightclients.solomachine.v1.DataType.DATA_TYPE_UNINITIALIZED_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, dataType_);
    }
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, data_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, timestamp_);
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
    if (!(obj instanceof com.ibc.lightclients.solomachine.v1.SignatureAndData)) {
      return super.equals(obj);
    }
    com.ibc.lightclients.solomachine.v1.SignatureAndData other = (com.ibc.lightclients.solomachine.v1.SignatureAndData) obj;

    if (!getSignature()
        .equals(other.getSignature())) return false;
    if (dataType_ != other.dataType_) return false;
    if (!getData()
        .equals(other.getData())) return false;
    if (getTimestamp()
        != other.getTimestamp()) return false;
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
    hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getSignature().hashCode();
    hash = (37 * hash) + DATA_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + dataType_;
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.lightclients.solomachine.v1.SignatureAndData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.lightclients.solomachine.v1.SignatureAndData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.lightclients.solomachine.v1.SignatureAndData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.lightclients.solomachine.v1.SignatureAndData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.lightclients.solomachine.v1.SignatureAndData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.lightclients.solomachine.v1.SignatureAndData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.lightclients.solomachine.v1.SignatureAndData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.lightclients.solomachine.v1.SignatureAndData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.lightclients.solomachine.v1.SignatureAndData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ibc.lightclients.solomachine.v1.SignatureAndData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.lightclients.solomachine.v1.SignatureAndData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.lightclients.solomachine.v1.SignatureAndData parseFrom(
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
  public static Builder newBuilder(com.ibc.lightclients.solomachine.v1.SignatureAndData prototype) {
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
   * SignatureAndData contains a signature and the data signed over to create that
   * signature.
   * </pre>
   *
   * Protobuf type {@code ibc.lightclients.solomachine.v1.SignatureAndData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.lightclients.solomachine.v1.SignatureAndData)
      com.ibc.lightclients.solomachine.v1.SignatureAndDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.lightclients.solomachine.v1.SolomachineProto.internal_static_ibc_lightclients_solomachine_v1_SignatureAndData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.lightclients.solomachine.v1.SolomachineProto.internal_static_ibc_lightclients_solomachine_v1_SignatureAndData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.lightclients.solomachine.v1.SignatureAndData.class, com.ibc.lightclients.solomachine.v1.SignatureAndData.Builder.class);
    }

    // Construct using com.ibc.lightclients.solomachine.v1.SignatureAndData.newBuilder()
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
      signature_ = com.google.protobuf.ByteString.EMPTY;
      dataType_ = 0;
      data_ = com.google.protobuf.ByteString.EMPTY;
      timestamp_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibc.lightclients.solomachine.v1.SolomachineProto.internal_static_ibc_lightclients_solomachine_v1_SignatureAndData_descriptor;
    }

    @java.lang.Override
    public com.ibc.lightclients.solomachine.v1.SignatureAndData getDefaultInstanceForType() {
      return com.ibc.lightclients.solomachine.v1.SignatureAndData.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.lightclients.solomachine.v1.SignatureAndData build() {
      com.ibc.lightclients.solomachine.v1.SignatureAndData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.lightclients.solomachine.v1.SignatureAndData buildPartial() {
      com.ibc.lightclients.solomachine.v1.SignatureAndData result = new com.ibc.lightclients.solomachine.v1.SignatureAndData(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ibc.lightclients.solomachine.v1.SignatureAndData result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.signature_ = signature_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dataType_ = dataType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.data_ = data_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.timestamp_ = timestamp_;
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
      if (other instanceof com.ibc.lightclients.solomachine.v1.SignatureAndData) {
        return mergeFrom((com.ibc.lightclients.solomachine.v1.SignatureAndData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.lightclients.solomachine.v1.SignatureAndData other) {
      if (other == com.ibc.lightclients.solomachine.v1.SignatureAndData.getDefaultInstance()) return this;
      if (other.getSignature() != com.google.protobuf.ByteString.EMPTY) {
        setSignature(other.getSignature());
      }
      if (other.dataType_ != 0) {
        setDataTypeValue(other.getDataTypeValue());
      }
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
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
              signature_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              dataType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              data_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              timestamp_ = input.readUInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes signature = 1 [json_name = "signature"];</code>
     * @return The signature.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSignature() {
      return signature_;
    }
    /**
     * <code>bytes signature = 1 [json_name = "signature"];</code>
     * @param value The signature to set.
     * @return This builder for chaining.
     */
    public Builder setSignature(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      signature_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bytes signature = 1 [json_name = "signature"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSignature() {
      bitField0_ = (bitField0_ & ~0x00000001);
      signature_ = getDefaultInstance().getSignature();
      onChanged();
      return this;
    }

    private int dataType_ = 0;
    /**
     * <code>.ibc.lightclients.solomachine.v1.DataType data_type = 2 [json_name = "dataType", (.gogoproto.moretags) = "yaml:&#92;"data_type&#92;""];</code>
     * @return The enum numeric value on the wire for dataType.
     */
    @java.lang.Override public int getDataTypeValue() {
      return dataType_;
    }
    /**
     * <code>.ibc.lightclients.solomachine.v1.DataType data_type = 2 [json_name = "dataType", (.gogoproto.moretags) = "yaml:&#92;"data_type&#92;""];</code>
     * @param value The enum numeric value on the wire for dataType to set.
     * @return This builder for chaining.
     */
    public Builder setDataTypeValue(int value) {
      dataType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.lightclients.solomachine.v1.DataType data_type = 2 [json_name = "dataType", (.gogoproto.moretags) = "yaml:&#92;"data_type&#92;""];</code>
     * @return The dataType.
     */
    @java.lang.Override
    public com.ibc.lightclients.solomachine.v1.DataType getDataType() {
      com.ibc.lightclients.solomachine.v1.DataType result = com.ibc.lightclients.solomachine.v1.DataType.forNumber(dataType_);
      return result == null ? com.ibc.lightclients.solomachine.v1.DataType.UNRECOGNIZED : result;
    }
    /**
     * <code>.ibc.lightclients.solomachine.v1.DataType data_type = 2 [json_name = "dataType", (.gogoproto.moretags) = "yaml:&#92;"data_type&#92;""];</code>
     * @param value The dataType to set.
     * @return This builder for chaining.
     */
    public Builder setDataType(com.ibc.lightclients.solomachine.v1.DataType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      dataType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.lightclients.solomachine.v1.DataType data_type = 2 [json_name = "dataType", (.gogoproto.moretags) = "yaml:&#92;"data_type&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearDataType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dataType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes data = 3 [json_name = "data"];</code>
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <code>bytes data = 3 [json_name = "data"];</code>
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      data_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bytes data = 3 [json_name = "data"];</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      bitField0_ = (bitField0_ & ~0x00000004);
      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>uint64 timestamp = 4 [json_name = "timestamp"];</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>uint64 timestamp = 4 [json_name = "timestamp"];</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {

      timestamp_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 timestamp = 4 [json_name = "timestamp"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000008);
      timestamp_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:ibc.lightclients.solomachine.v1.SignatureAndData)
  }

  // @@protoc_insertion_point(class_scope:ibc.lightclients.solomachine.v1.SignatureAndData)
  private static final com.ibc.lightclients.solomachine.v1.SignatureAndData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.lightclients.solomachine.v1.SignatureAndData();
  }

  public static com.ibc.lightclients.solomachine.v1.SignatureAndData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SignatureAndData>
      PARSER = new com.google.protobuf.AbstractParser<SignatureAndData>() {
    @java.lang.Override
    public SignatureAndData parsePartialFrom(
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

  public static com.google.protobuf.Parser<SignatureAndData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SignatureAndData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.lightclients.solomachine.v1.SignatureAndData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

