// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/interchain_accounts/v1/genesis.proto

package com.ibc.applications.interchain_accounts.v1;

/**
 * <pre>
 * RegisteredInterchainAccount contains a connection ID, port ID and associated interchain account address
 * </pre>
 *
 * Protobuf type {@code ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount}
 */
public final class RegisteredInterchainAccount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount)
    RegisteredInterchainAccountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegisteredInterchainAccount.newBuilder() to construct.
  private RegisteredInterchainAccount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegisteredInterchainAccount() {
    connectionId_ = "";
    portId_ = "";
    accountAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RegisteredInterchainAccount();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.applications.interchain_accounts.v1.GenesisProto.internal_static_ibc_applications_interchain_accounts_v1_RegisteredInterchainAccount_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.applications.interchain_accounts.v1.GenesisProto.internal_static_ibc_applications_interchain_accounts_v1_RegisteredInterchainAccount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount.class, com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount.Builder.class);
  }

  public static final int CONNECTION_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object connectionId_ = "";
  /**
   * <code>string connection_id = 1 [json_name = "connectionId", (.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
   * @return The connectionId.
   */
  @java.lang.Override
  public java.lang.String getConnectionId() {
    java.lang.Object ref = connectionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      connectionId_ = s;
      return s;
    }
  }
  /**
   * <code>string connection_id = 1 [json_name = "connectionId", (.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
   * @return The bytes for connectionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConnectionIdBytes() {
    java.lang.Object ref = connectionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      connectionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PORT_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object portId_ = "";
  /**
   * <code>string port_id = 2 [json_name = "portId", (.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
   * @return The portId.
   */
  @java.lang.Override
  public java.lang.String getPortId() {
    java.lang.Object ref = portId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      portId_ = s;
      return s;
    }
  }
  /**
   * <code>string port_id = 2 [json_name = "portId", (.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
   * @return The bytes for portId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPortIdBytes() {
    java.lang.Object ref = portId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      portId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCOUNT_ADDRESS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object accountAddress_ = "";
  /**
   * <code>string account_address = 3 [json_name = "accountAddress", (.gogoproto.moretags) = "yaml:&#92;"account_address&#92;""];</code>
   * @return The accountAddress.
   */
  @java.lang.Override
  public java.lang.String getAccountAddress() {
    java.lang.Object ref = accountAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accountAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string account_address = 3 [json_name = "accountAddress", (.gogoproto.moretags) = "yaml:&#92;"account_address&#92;""];</code>
   * @return The bytes for accountAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAccountAddressBytes() {
    java.lang.Object ref = accountAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      accountAddress_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(connectionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, connectionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(portId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, portId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accountAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, accountAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(connectionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, connectionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(portId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, portId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accountAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, accountAddress_);
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
    if (!(obj instanceof com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount)) {
      return super.equals(obj);
    }
    com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount other = (com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount) obj;

    if (!getConnectionId()
        .equals(other.getConnectionId())) return false;
    if (!getPortId()
        .equals(other.getPortId())) return false;
    if (!getAccountAddress()
        .equals(other.getAccountAddress())) return false;
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
    hash = (37 * hash) + CONNECTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getConnectionId().hashCode();
    hash = (37 * hash) + PORT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPortId().hashCode();
    hash = (37 * hash) + ACCOUNT_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAccountAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount parseFrom(
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
  public static Builder newBuilder(com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount prototype) {
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
   * RegisteredInterchainAccount contains a connection ID, port ID and associated interchain account address
   * </pre>
   *
   * Protobuf type {@code ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount)
      com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.applications.interchain_accounts.v1.GenesisProto.internal_static_ibc_applications_interchain_accounts_v1_RegisteredInterchainAccount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.applications.interchain_accounts.v1.GenesisProto.internal_static_ibc_applications_interchain_accounts_v1_RegisteredInterchainAccount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount.class, com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount.Builder.class);
    }

    // Construct using com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount.newBuilder()
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
      connectionId_ = "";
      portId_ = "";
      accountAddress_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibc.applications.interchain_accounts.v1.GenesisProto.internal_static_ibc_applications_interchain_accounts_v1_RegisteredInterchainAccount_descriptor;
    }

    @java.lang.Override
    public com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount getDefaultInstanceForType() {
      return com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount build() {
      com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount buildPartial() {
      com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount result = new com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.connectionId_ = connectionId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.portId_ = portId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.accountAddress_ = accountAddress_;
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
      if (other instanceof com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount) {
        return mergeFrom((com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount other) {
      if (other == com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount.getDefaultInstance()) return this;
      if (!other.getConnectionId().isEmpty()) {
        connectionId_ = other.connectionId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPortId().isEmpty()) {
        portId_ = other.portId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getAccountAddress().isEmpty()) {
        accountAddress_ = other.accountAddress_;
        bitField0_ |= 0x00000004;
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
              connectionId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              portId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              accountAddress_ = input.readStringRequireUtf8();
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

    private java.lang.Object connectionId_ = "";
    /**
     * <code>string connection_id = 1 [json_name = "connectionId", (.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
     * @return The connectionId.
     */
    public java.lang.String getConnectionId() {
      java.lang.Object ref = connectionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        connectionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string connection_id = 1 [json_name = "connectionId", (.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
     * @return The bytes for connectionId.
     */
    public com.google.protobuf.ByteString
        getConnectionIdBytes() {
      java.lang.Object ref = connectionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        connectionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string connection_id = 1 [json_name = "connectionId", (.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
     * @param value The connectionId to set.
     * @return This builder for chaining.
     */
    public Builder setConnectionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      connectionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string connection_id = 1 [json_name = "connectionId", (.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearConnectionId() {
      connectionId_ = getDefaultInstance().getConnectionId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string connection_id = 1 [json_name = "connectionId", (.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
     * @param value The bytes for connectionId to set.
     * @return This builder for chaining.
     */
    public Builder setConnectionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      connectionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object portId_ = "";
    /**
     * <code>string port_id = 2 [json_name = "portId", (.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
     * @return The portId.
     */
    public java.lang.String getPortId() {
      java.lang.Object ref = portId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        portId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string port_id = 2 [json_name = "portId", (.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
     * @return The bytes for portId.
     */
    public com.google.protobuf.ByteString
        getPortIdBytes() {
      java.lang.Object ref = portId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        portId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string port_id = 2 [json_name = "portId", (.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
     * @param value The portId to set.
     * @return This builder for chaining.
     */
    public Builder setPortId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      portId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string port_id = 2 [json_name = "portId", (.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearPortId() {
      portId_ = getDefaultInstance().getPortId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string port_id = 2 [json_name = "portId", (.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
     * @param value The bytes for portId to set.
     * @return This builder for chaining.
     */
    public Builder setPortIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      portId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object accountAddress_ = "";
    /**
     * <code>string account_address = 3 [json_name = "accountAddress", (.gogoproto.moretags) = "yaml:&#92;"account_address&#92;""];</code>
     * @return The accountAddress.
     */
    public java.lang.String getAccountAddress() {
      java.lang.Object ref = accountAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accountAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string account_address = 3 [json_name = "accountAddress", (.gogoproto.moretags) = "yaml:&#92;"account_address&#92;""];</code>
     * @return The bytes for accountAddress.
     */
    public com.google.protobuf.ByteString
        getAccountAddressBytes() {
      java.lang.Object ref = accountAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accountAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string account_address = 3 [json_name = "accountAddress", (.gogoproto.moretags) = "yaml:&#92;"account_address&#92;""];</code>
     * @param value The accountAddress to set.
     * @return This builder for chaining.
     */
    public Builder setAccountAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      accountAddress_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string account_address = 3 [json_name = "accountAddress", (.gogoproto.moretags) = "yaml:&#92;"account_address&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearAccountAddress() {
      accountAddress_ = getDefaultInstance().getAccountAddress();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string account_address = 3 [json_name = "accountAddress", (.gogoproto.moretags) = "yaml:&#92;"account_address&#92;""];</code>
     * @param value The bytes for accountAddress to set.
     * @return This builder for chaining.
     */
    public Builder setAccountAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      accountAddress_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount)
  }

  // @@protoc_insertion_point(class_scope:ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount)
  private static final com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount();
  }

  public static com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegisteredInterchainAccount>
      PARSER = new com.google.protobuf.AbstractParser<RegisteredInterchainAccount>() {
    @java.lang.Override
    public RegisteredInterchainAccount parsePartialFrom(
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

  public static com.google.protobuf.Parser<RegisteredInterchainAccount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegisteredInterchainAccount> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.applications.interchain_accounts.v1.RegisteredInterchainAccount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

