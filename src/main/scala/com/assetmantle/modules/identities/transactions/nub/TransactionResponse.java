// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identities/transactions/nub/transaction_response.proto

package com.assetmantle.modules.identities.transactions.nub;

/**
 * Protobuf type {@code assetmantle.modules.identities.transactions.nub.TransactionResponse}
 */
public final class TransactionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:assetmantle.modules.identities.transactions.nub.TransactionResponse)
    TransactionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransactionResponse.newBuilder() to construct.
  private TransactionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransactionResponse() {
    nubID_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TransactionResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.internal_static_assetmantle_modules_identities_transactions_nub_TransactionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.internal_static_assetmantle_modules_identities_transactions_nub_TransactionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.assetmantle.modules.identities.transactions.nub.TransactionResponse.class, com.assetmantle.modules.identities.transactions.nub.TransactionResponse.Builder.class);
  }

  public static final int NUB_I_D_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nubID_ = "";
  /**
   * <code>string nub_i_d = 1 [json_name = "nubID"];</code>
   * @return The nubID.
   */
  @java.lang.Override
  public java.lang.String getNubID() {
    java.lang.Object ref = nubID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nubID_ = s;
      return s;
    }
  }
  /**
   * <code>string nub_i_d = 1 [json_name = "nubID"];</code>
   * @return The bytes for nubID.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNubIDBytes() {
    java.lang.Object ref = nubID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nubID_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nubID_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nubID_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nubID_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nubID_);
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
    if (!(obj instanceof com.assetmantle.modules.identities.transactions.nub.TransactionResponse)) {
      return super.equals(obj);
    }
    com.assetmantle.modules.identities.transactions.nub.TransactionResponse other = (com.assetmantle.modules.identities.transactions.nub.TransactionResponse) obj;

    if (!getNubID()
        .equals(other.getNubID())) return false;
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
    hash = (37 * hash) + NUB_I_D_FIELD_NUMBER;
    hash = (53 * hash) + getNubID().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.assetmantle.modules.identities.transactions.nub.TransactionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.assetmantle.modules.identities.transactions.nub.TransactionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.assetmantle.modules.identities.transactions.nub.TransactionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.assetmantle.modules.identities.transactions.nub.TransactionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.assetmantle.modules.identities.transactions.nub.TransactionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.assetmantle.modules.identities.transactions.nub.TransactionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.assetmantle.modules.identities.transactions.nub.TransactionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.assetmantle.modules.identities.transactions.nub.TransactionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.assetmantle.modules.identities.transactions.nub.TransactionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.assetmantle.modules.identities.transactions.nub.TransactionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.assetmantle.modules.identities.transactions.nub.TransactionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.assetmantle.modules.identities.transactions.nub.TransactionResponse parseFrom(
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
  public static Builder newBuilder(com.assetmantle.modules.identities.transactions.nub.TransactionResponse prototype) {
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
   * Protobuf type {@code assetmantle.modules.identities.transactions.nub.TransactionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:assetmantle.modules.identities.transactions.nub.TransactionResponse)
      com.assetmantle.modules.identities.transactions.nub.TransactionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.internal_static_assetmantle_modules_identities_transactions_nub_TransactionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.internal_static_assetmantle_modules_identities_transactions_nub_TransactionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.assetmantle.modules.identities.transactions.nub.TransactionResponse.class, com.assetmantle.modules.identities.transactions.nub.TransactionResponse.Builder.class);
    }

    // Construct using com.assetmantle.modules.identities.transactions.nub.TransactionResponse.newBuilder()
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
      nubID_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.assetmantle.modules.identities.transactions.nub.TransactionResponseProto.internal_static_assetmantle_modules_identities_transactions_nub_TransactionResponse_descriptor;
    }

    @java.lang.Override
    public com.assetmantle.modules.identities.transactions.nub.TransactionResponse getDefaultInstanceForType() {
      return com.assetmantle.modules.identities.transactions.nub.TransactionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.assetmantle.modules.identities.transactions.nub.TransactionResponse build() {
      com.assetmantle.modules.identities.transactions.nub.TransactionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.assetmantle.modules.identities.transactions.nub.TransactionResponse buildPartial() {
      com.assetmantle.modules.identities.transactions.nub.TransactionResponse result = new com.assetmantle.modules.identities.transactions.nub.TransactionResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.assetmantle.modules.identities.transactions.nub.TransactionResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nubID_ = nubID_;
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
      if (other instanceof com.assetmantle.modules.identities.transactions.nub.TransactionResponse) {
        return mergeFrom((com.assetmantle.modules.identities.transactions.nub.TransactionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.assetmantle.modules.identities.transactions.nub.TransactionResponse other) {
      if (other == com.assetmantle.modules.identities.transactions.nub.TransactionResponse.getDefaultInstance()) return this;
      if (!other.getNubID().isEmpty()) {
        nubID_ = other.nubID_;
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
              nubID_ = input.readStringRequireUtf8();
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

    private java.lang.Object nubID_ = "";
    /**
     * <code>string nub_i_d = 1 [json_name = "nubID"];</code>
     * @return The nubID.
     */
    public java.lang.String getNubID() {
      java.lang.Object ref = nubID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nubID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nub_i_d = 1 [json_name = "nubID"];</code>
     * @return The bytes for nubID.
     */
    public com.google.protobuf.ByteString
        getNubIDBytes() {
      java.lang.Object ref = nubID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nubID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nub_i_d = 1 [json_name = "nubID"];</code>
     * @param value The nubID to set.
     * @return This builder for chaining.
     */
    public Builder setNubID(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nubID_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string nub_i_d = 1 [json_name = "nubID"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNubID() {
      nubID_ = getDefaultInstance().getNubID();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string nub_i_d = 1 [json_name = "nubID"];</code>
     * @param value The bytes for nubID to set.
     * @return This builder for chaining.
     */
    public Builder setNubIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nubID_ = value;
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


    // @@protoc_insertion_point(builder_scope:assetmantle.modules.identities.transactions.nub.TransactionResponse)
  }

  // @@protoc_insertion_point(class_scope:assetmantle.modules.identities.transactions.nub.TransactionResponse)
  private static final com.assetmantle.modules.identities.transactions.nub.TransactionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.assetmantle.modules.identities.transactions.nub.TransactionResponse();
  }

  public static com.assetmantle.modules.identities.transactions.nub.TransactionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransactionResponse>
      PARSER = new com.google.protobuf.AbstractParser<TransactionResponse>() {
    @java.lang.Override
    public TransactionResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<TransactionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransactionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.assetmantle.modules.identities.transactions.nub.TransactionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
