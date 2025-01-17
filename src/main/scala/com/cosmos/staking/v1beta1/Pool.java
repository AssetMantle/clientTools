// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/staking.proto

package com.cosmos.staking.v1beta1;

/**
 * <pre>
 * Pool is used for tracking bonded and not-bonded token supply of the bond
 * denomination.
 * </pre>
 *
 * Protobuf type {@code cosmos.staking.v1beta1.Pool}
 */
public final class Pool extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.staking.v1beta1.Pool)
    PoolOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Pool.newBuilder() to construct.
  private Pool(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Pool() {
    notBondedTokens_ = "";
    bondedTokens_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Pool();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.staking.v1beta1.StakingProto.internal_static_cosmos_staking_v1beta1_Pool_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.staking.v1beta1.StakingProto.internal_static_cosmos_staking_v1beta1_Pool_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.staking.v1beta1.Pool.class, com.cosmos.staking.v1beta1.Pool.Builder.class);
  }

  public static final int NOT_BONDED_TOKENS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object notBondedTokens_ = "";
  /**
   * <code>string not_bonded_tokens = 1 [json_name = "notBondedTokens", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.jsontag) = "not_bonded_tokens"];</code>
   * @return The notBondedTokens.
   */
  @java.lang.Override
  public java.lang.String getNotBondedTokens() {
    java.lang.Object ref = notBondedTokens_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      notBondedTokens_ = s;
      return s;
    }
  }
  /**
   * <code>string not_bonded_tokens = 1 [json_name = "notBondedTokens", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.jsontag) = "not_bonded_tokens"];</code>
   * @return The bytes for notBondedTokens.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNotBondedTokensBytes() {
    java.lang.Object ref = notBondedTokens_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      notBondedTokens_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BONDED_TOKENS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object bondedTokens_ = "";
  /**
   * <code>string bonded_tokens = 2 [json_name = "bondedTokens", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.jsontag) = "bonded_tokens", (.gogoproto.moretags) = "yaml:&#92;"bonded_tokens&#92;""];</code>
   * @return The bondedTokens.
   */
  @java.lang.Override
  public java.lang.String getBondedTokens() {
    java.lang.Object ref = bondedTokens_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bondedTokens_ = s;
      return s;
    }
  }
  /**
   * <code>string bonded_tokens = 2 [json_name = "bondedTokens", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.jsontag) = "bonded_tokens", (.gogoproto.moretags) = "yaml:&#92;"bonded_tokens&#92;""];</code>
   * @return The bytes for bondedTokens.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBondedTokensBytes() {
    java.lang.Object ref = bondedTokens_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bondedTokens_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(notBondedTokens_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, notBondedTokens_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bondedTokens_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, bondedTokens_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(notBondedTokens_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, notBondedTokens_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bondedTokens_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, bondedTokens_);
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
    if (!(obj instanceof com.cosmos.staking.v1beta1.Pool)) {
      return super.equals(obj);
    }
    com.cosmos.staking.v1beta1.Pool other = (com.cosmos.staking.v1beta1.Pool) obj;

    if (!getNotBondedTokens()
        .equals(other.getNotBondedTokens())) return false;
    if (!getBondedTokens()
        .equals(other.getBondedTokens())) return false;
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
    hash = (37 * hash) + NOT_BONDED_TOKENS_FIELD_NUMBER;
    hash = (53 * hash) + getNotBondedTokens().hashCode();
    hash = (37 * hash) + BONDED_TOKENS_FIELD_NUMBER;
    hash = (53 * hash) + getBondedTokens().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.staking.v1beta1.Pool parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.staking.v1beta1.Pool parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.staking.v1beta1.Pool parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.staking.v1beta1.Pool parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.staking.v1beta1.Pool parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.staking.v1beta1.Pool parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.staking.v1beta1.Pool parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.staking.v1beta1.Pool parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.staking.v1beta1.Pool parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cosmos.staking.v1beta1.Pool parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.staking.v1beta1.Pool parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.staking.v1beta1.Pool parseFrom(
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
  public static Builder newBuilder(com.cosmos.staking.v1beta1.Pool prototype) {
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
   * Pool is used for tracking bonded and not-bonded token supply of the bond
   * denomination.
   * </pre>
   *
   * Protobuf type {@code cosmos.staking.v1beta1.Pool}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.staking.v1beta1.Pool)
      com.cosmos.staking.v1beta1.PoolOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.staking.v1beta1.StakingProto.internal_static_cosmos_staking_v1beta1_Pool_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.staking.v1beta1.StakingProto.internal_static_cosmos_staking_v1beta1_Pool_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.staking.v1beta1.Pool.class, com.cosmos.staking.v1beta1.Pool.Builder.class);
    }

    // Construct using com.cosmos.staking.v1beta1.Pool.newBuilder()
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
      notBondedTokens_ = "";
      bondedTokens_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.staking.v1beta1.StakingProto.internal_static_cosmos_staking_v1beta1_Pool_descriptor;
    }

    @java.lang.Override
    public com.cosmos.staking.v1beta1.Pool getDefaultInstanceForType() {
      return com.cosmos.staking.v1beta1.Pool.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.staking.v1beta1.Pool build() {
      com.cosmos.staking.v1beta1.Pool result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.staking.v1beta1.Pool buildPartial() {
      com.cosmos.staking.v1beta1.Pool result = new com.cosmos.staking.v1beta1.Pool(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.staking.v1beta1.Pool result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.notBondedTokens_ = notBondedTokens_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.bondedTokens_ = bondedTokens_;
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
      if (other instanceof com.cosmos.staking.v1beta1.Pool) {
        return mergeFrom((com.cosmos.staking.v1beta1.Pool)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.staking.v1beta1.Pool other) {
      if (other == com.cosmos.staking.v1beta1.Pool.getDefaultInstance()) return this;
      if (!other.getNotBondedTokens().isEmpty()) {
        notBondedTokens_ = other.notBondedTokens_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getBondedTokens().isEmpty()) {
        bondedTokens_ = other.bondedTokens_;
        bitField0_ |= 0x00000002;
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
              notBondedTokens_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              bondedTokens_ = input.readStringRequireUtf8();
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

    private java.lang.Object notBondedTokens_ = "";
    /**
     * <code>string not_bonded_tokens = 1 [json_name = "notBondedTokens", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.jsontag) = "not_bonded_tokens"];</code>
     * @return The notBondedTokens.
     */
    public java.lang.String getNotBondedTokens() {
      java.lang.Object ref = notBondedTokens_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        notBondedTokens_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string not_bonded_tokens = 1 [json_name = "notBondedTokens", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.jsontag) = "not_bonded_tokens"];</code>
     * @return The bytes for notBondedTokens.
     */
    public com.google.protobuf.ByteString
        getNotBondedTokensBytes() {
      java.lang.Object ref = notBondedTokens_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        notBondedTokens_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string not_bonded_tokens = 1 [json_name = "notBondedTokens", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.jsontag) = "not_bonded_tokens"];</code>
     * @param value The notBondedTokens to set.
     * @return This builder for chaining.
     */
    public Builder setNotBondedTokens(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      notBondedTokens_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string not_bonded_tokens = 1 [json_name = "notBondedTokens", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.jsontag) = "not_bonded_tokens"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNotBondedTokens() {
      notBondedTokens_ = getDefaultInstance().getNotBondedTokens();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string not_bonded_tokens = 1 [json_name = "notBondedTokens", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.jsontag) = "not_bonded_tokens"];</code>
     * @param value The bytes for notBondedTokens to set.
     * @return This builder for chaining.
     */
    public Builder setNotBondedTokensBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      notBondedTokens_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object bondedTokens_ = "";
    /**
     * <code>string bonded_tokens = 2 [json_name = "bondedTokens", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.jsontag) = "bonded_tokens", (.gogoproto.moretags) = "yaml:&#92;"bonded_tokens&#92;""];</code>
     * @return The bondedTokens.
     */
    public java.lang.String getBondedTokens() {
      java.lang.Object ref = bondedTokens_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bondedTokens_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string bonded_tokens = 2 [json_name = "bondedTokens", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.jsontag) = "bonded_tokens", (.gogoproto.moretags) = "yaml:&#92;"bonded_tokens&#92;""];</code>
     * @return The bytes for bondedTokens.
     */
    public com.google.protobuf.ByteString
        getBondedTokensBytes() {
      java.lang.Object ref = bondedTokens_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bondedTokens_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string bonded_tokens = 2 [json_name = "bondedTokens", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.jsontag) = "bonded_tokens", (.gogoproto.moretags) = "yaml:&#92;"bonded_tokens&#92;""];</code>
     * @param value The bondedTokens to set.
     * @return This builder for chaining.
     */
    public Builder setBondedTokens(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      bondedTokens_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string bonded_tokens = 2 [json_name = "bondedTokens", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.jsontag) = "bonded_tokens", (.gogoproto.moretags) = "yaml:&#92;"bonded_tokens&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearBondedTokens() {
      bondedTokens_ = getDefaultInstance().getBondedTokens();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string bonded_tokens = 2 [json_name = "bondedTokens", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.jsontag) = "bonded_tokens", (.gogoproto.moretags) = "yaml:&#92;"bonded_tokens&#92;""];</code>
     * @param value The bytes for bondedTokens to set.
     * @return This builder for chaining.
     */
    public Builder setBondedTokensBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      bondedTokens_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:cosmos.staking.v1beta1.Pool)
  }

  // @@protoc_insertion_point(class_scope:cosmos.staking.v1beta1.Pool)
  private static final com.cosmos.staking.v1beta1.Pool DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.staking.v1beta1.Pool();
  }

  public static com.cosmos.staking.v1beta1.Pool getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Pool>
      PARSER = new com.google.protobuf.AbstractParser<Pool>() {
    @java.lang.Override
    public Pool parsePartialFrom(
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

  public static com.google.protobuf.Parser<Pool> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Pool> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.staking.v1beta1.Pool getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

