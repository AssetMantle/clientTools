// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/auth/v1beta1/auth.proto

package com.cosmos.auth.v1beta1;

/**
 * <pre>
 * BaseAccount defines a base account type. It contains all the necessary fields
 * for basic account functionality. Any custom account type should extend this
 * type for additional functionality (e.g. vesting).
 * </pre>
 *
 * Protobuf type {@code cosmos.auth.v1beta1.BaseAccount}
 */
public final class BaseAccount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.auth.v1beta1.BaseAccount)
    BaseAccountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BaseAccount.newBuilder() to construct.
  private BaseAccount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BaseAccount() {
    address_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new BaseAccount();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return AuthProto.internal_static_cosmos_auth_v1beta1_BaseAccount_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return AuthProto.internal_static_cosmos_auth_v1beta1_BaseAccount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            BaseAccount.class, Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile Object address_ = "";
  /**
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The address.
   */
  @Override
  public String getAddress() {
    Object ref = address_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      address_ = s;
      return s;
    }
  }
  /**
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  @Override
  public com.google.protobuf.ByteString
      getAddressBytes() {
    Object ref = address_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      address_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUB_KEY_FIELD_NUMBER = 2;
  private com.google.protobuf.Any pubKey_;
  /**
   * <code>.google.protobuf.Any pub_key = 2 [json_name = "pubKey", (.gogoproto.jsontag) = "public_key,omitempty", (.gogoproto.moretags) = "yaml:&#92;"public_key&#92;""];</code>
   * @return Whether the pubKey field is set.
   */
  @Override
  public boolean hasPubKey() {
    return pubKey_ != null;
  }
  /**
   * <code>.google.protobuf.Any pub_key = 2 [json_name = "pubKey", (.gogoproto.jsontag) = "public_key,omitempty", (.gogoproto.moretags) = "yaml:&#92;"public_key&#92;""];</code>
   * @return The pubKey.
   */
  @Override
  public com.google.protobuf.Any getPubKey() {
    return pubKey_ == null ? com.google.protobuf.Any.getDefaultInstance() : pubKey_;
  }
  /**
   * <code>.google.protobuf.Any pub_key = 2 [json_name = "pubKey", (.gogoproto.jsontag) = "public_key,omitempty", (.gogoproto.moretags) = "yaml:&#92;"public_key&#92;""];</code>
   */
  @Override
  public com.google.protobuf.AnyOrBuilder getPubKeyOrBuilder() {
    return pubKey_ == null ? com.google.protobuf.Any.getDefaultInstance() : pubKey_;
  }

  public static final int ACCOUNT_NUMBER_FIELD_NUMBER = 3;
  private long accountNumber_ = 0L;
  /**
   * <code>uint64 account_number = 3 [json_name = "accountNumber", (.gogoproto.moretags) = "yaml:&#92;"account_number&#92;""];</code>
   * @return The accountNumber.
   */
  @Override
  public long getAccountNumber() {
    return accountNumber_;
  }

  public static final int SEQUENCE_FIELD_NUMBER = 4;
  private long sequence_ = 0L;
  /**
   * <code>uint64 sequence = 4 [json_name = "sequence"];</code>
   * @return The sequence.
   */
  @Override
  public long getSequence() {
    return sequence_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, address_);
    }
    if (pubKey_ != null) {
      output.writeMessage(2, getPubKey());
    }
    if (accountNumber_ != 0L) {
      output.writeUInt64(3, accountNumber_);
    }
    if (sequence_ != 0L) {
      output.writeUInt64(4, sequence_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, address_);
    }
    if (pubKey_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPubKey());
    }
    if (accountNumber_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, accountNumber_);
    }
    if (sequence_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, sequence_);
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
    if (!(obj instanceof BaseAccount)) {
      return super.equals(obj);
    }
    BaseAccount other = (BaseAccount) obj;

    if (!getAddress()
        .equals(other.getAddress())) return false;
    if (hasPubKey() != other.hasPubKey()) return false;
    if (hasPubKey()) {
      if (!getPubKey()
          .equals(other.getPubKey())) return false;
    }
    if (getAccountNumber()
        != other.getAccountNumber()) return false;
    if (getSequence()
        != other.getSequence()) return false;
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
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    if (hasPubKey()) {
      hash = (37 * hash) + PUB_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getPubKey().hashCode();
    }
    hash = (37 * hash) + ACCOUNT_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAccountNumber());
    hash = (37 * hash) + SEQUENCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSequence());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static BaseAccount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BaseAccount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BaseAccount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BaseAccount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BaseAccount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BaseAccount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BaseAccount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BaseAccount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static BaseAccount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static BaseAccount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static BaseAccount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BaseAccount parseFrom(
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
  public static Builder newBuilder(BaseAccount prototype) {
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
   * BaseAccount defines a base account type. It contains all the necessary fields
   * for basic account functionality. Any custom account type should extend this
   * type for additional functionality (e.g. vesting).
   * </pre>
   *
   * Protobuf type {@code cosmos.auth.v1beta1.BaseAccount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.auth.v1beta1.BaseAccount)
      BaseAccountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return AuthProto.internal_static_cosmos_auth_v1beta1_BaseAccount_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AuthProto.internal_static_cosmos_auth_v1beta1_BaseAccount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BaseAccount.class, Builder.class);
    }

    // Construct using com.cosmos.auth.v1beta1.BaseAccount.newBuilder()
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
      address_ = "";
      pubKey_ = null;
      if (pubKeyBuilder_ != null) {
        pubKeyBuilder_.dispose();
        pubKeyBuilder_ = null;
      }
      accountNumber_ = 0L;
      sequence_ = 0L;
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return AuthProto.internal_static_cosmos_auth_v1beta1_BaseAccount_descriptor;
    }

    @Override
    public BaseAccount getDefaultInstanceForType() {
      return BaseAccount.getDefaultInstance();
    }

    @Override
    public BaseAccount build() {
      BaseAccount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public BaseAccount buildPartial() {
      BaseAccount result = new BaseAccount(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(BaseAccount result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.address_ = address_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pubKey_ = pubKeyBuilder_ == null
            ? pubKey_
            : pubKeyBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.accountNumber_ = accountNumber_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.sequence_ = sequence_;
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
      if (other instanceof BaseAccount) {
        return mergeFrom((BaseAccount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(BaseAccount other) {
      if (other == BaseAccount.getDefaultInstance()) return this;
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPubKey()) {
        mergePubKey(other.getPubKey());
      }
      if (other.getAccountNumber() != 0L) {
        setAccountNumber(other.getAccountNumber());
      }
      if (other.getSequence() != 0L) {
        setSequence(other.getSequence());
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
              address_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPubKeyFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              accountNumber_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              sequence_ = input.readUInt64();
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

    private Object address_ = "";
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @return The address.
     */
    public String getAddress() {
      Object ref = address_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        address_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @return The bytes for address.
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      Object ref = address_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      address_ = getDefaultInstance().getAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @param value The bytes for address to set.
     * @return This builder for chaining.
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Any pubKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> pubKeyBuilder_;
    /**
     * <code>.google.protobuf.Any pub_key = 2 [json_name = "pubKey", (.gogoproto.jsontag) = "public_key,omitempty", (.gogoproto.moretags) = "yaml:&#92;"public_key&#92;""];</code>
     * @return Whether the pubKey field is set.
     */
    public boolean hasPubKey() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.google.protobuf.Any pub_key = 2 [json_name = "pubKey", (.gogoproto.jsontag) = "public_key,omitempty", (.gogoproto.moretags) = "yaml:&#92;"public_key&#92;""];</code>
     * @return The pubKey.
     */
    public com.google.protobuf.Any getPubKey() {
      if (pubKeyBuilder_ == null) {
        return pubKey_ == null ? com.google.protobuf.Any.getDefaultInstance() : pubKey_;
      } else {
        return pubKeyBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Any pub_key = 2 [json_name = "pubKey", (.gogoproto.jsontag) = "public_key,omitempty", (.gogoproto.moretags) = "yaml:&#92;"public_key&#92;""];</code>
     */
    public Builder setPubKey(com.google.protobuf.Any value) {
      if (pubKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pubKey_ = value;
      } else {
        pubKeyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any pub_key = 2 [json_name = "pubKey", (.gogoproto.jsontag) = "public_key,omitempty", (.gogoproto.moretags) = "yaml:&#92;"public_key&#92;""];</code>
     */
    public Builder setPubKey(
        com.google.protobuf.Any.Builder builderForValue) {
      if (pubKeyBuilder_ == null) {
        pubKey_ = builderForValue.build();
      } else {
        pubKeyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any pub_key = 2 [json_name = "pubKey", (.gogoproto.jsontag) = "public_key,omitempty", (.gogoproto.moretags) = "yaml:&#92;"public_key&#92;""];</code>
     */
    public Builder mergePubKey(com.google.protobuf.Any value) {
      if (pubKeyBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          pubKey_ != null &&
          pubKey_ != com.google.protobuf.Any.getDefaultInstance()) {
          getPubKeyBuilder().mergeFrom(value);
        } else {
          pubKey_ = value;
        }
      } else {
        pubKeyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any pub_key = 2 [json_name = "pubKey", (.gogoproto.jsontag) = "public_key,omitempty", (.gogoproto.moretags) = "yaml:&#92;"public_key&#92;""];</code>
     */
    public Builder clearPubKey() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pubKey_ = null;
      if (pubKeyBuilder_ != null) {
        pubKeyBuilder_.dispose();
        pubKeyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any pub_key = 2 [json_name = "pubKey", (.gogoproto.jsontag) = "public_key,omitempty", (.gogoproto.moretags) = "yaml:&#92;"public_key&#92;""];</code>
     */
    public com.google.protobuf.Any.Builder getPubKeyBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPubKeyFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Any pub_key = 2 [json_name = "pubKey", (.gogoproto.jsontag) = "public_key,omitempty", (.gogoproto.moretags) = "yaml:&#92;"public_key&#92;""];</code>
     */
    public com.google.protobuf.AnyOrBuilder getPubKeyOrBuilder() {
      if (pubKeyBuilder_ != null) {
        return pubKeyBuilder_.getMessageOrBuilder();
      } else {
        return pubKey_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : pubKey_;
      }
    }
    /**
     * <code>.google.protobuf.Any pub_key = 2 [json_name = "pubKey", (.gogoproto.jsontag) = "public_key,omitempty", (.gogoproto.moretags) = "yaml:&#92;"public_key&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getPubKeyFieldBuilder() {
      if (pubKeyBuilder_ == null) {
        pubKeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getPubKey(),
                getParentForChildren(),
                isClean());
        pubKey_ = null;
      }
      return pubKeyBuilder_;
    }

    private long accountNumber_ ;
    /**
     * <code>uint64 account_number = 3 [json_name = "accountNumber", (.gogoproto.moretags) = "yaml:&#92;"account_number&#92;""];</code>
     * @return The accountNumber.
     */
    @Override
    public long getAccountNumber() {
      return accountNumber_;
    }
    /**
     * <code>uint64 account_number = 3 [json_name = "accountNumber", (.gogoproto.moretags) = "yaml:&#92;"account_number&#92;""];</code>
     * @param value The accountNumber to set.
     * @return This builder for chaining.
     */
    public Builder setAccountNumber(long value) {

      accountNumber_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 account_number = 3 [json_name = "accountNumber", (.gogoproto.moretags) = "yaml:&#92;"account_number&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearAccountNumber() {
      bitField0_ = (bitField0_ & ~0x00000004);
      accountNumber_ = 0L;
      onChanged();
      return this;
    }

    private long sequence_ ;
    /**
     * <code>uint64 sequence = 4 [json_name = "sequence"];</code>
     * @return The sequence.
     */
    @Override
    public long getSequence() {
      return sequence_;
    }
    /**
     * <code>uint64 sequence = 4 [json_name = "sequence"];</code>
     * @param value The sequence to set.
     * @return This builder for chaining.
     */
    public Builder setSequence(long value) {

      sequence_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 sequence = 4 [json_name = "sequence"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSequence() {
      bitField0_ = (bitField0_ & ~0x00000008);
      sequence_ = 0L;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:cosmos.auth.v1beta1.BaseAccount)
  }

  // @@protoc_insertion_point(class_scope:cosmos.auth.v1beta1.BaseAccount)
  private static final BaseAccount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BaseAccount();
  }

  public static BaseAccount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BaseAccount>
      PARSER = new com.google.protobuf.AbstractParser<BaseAccount>() {
    @Override
    public BaseAccount parsePartialFrom(
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

  public static com.google.protobuf.Parser<BaseAccount> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<BaseAccount> getParserForType() {
    return PARSER;
  }

  @Override
  public BaseAccount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

