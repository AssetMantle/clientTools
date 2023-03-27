// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/client/v1/genesis.proto

package com.ibc.core.client.v1;

/**
 * <pre>
 * IdentifiedGenesisMetadata has the client metadata with the corresponding
 * client id.
 * </pre>
 *
 * Protobuf type {@code ibc.core.client.v1.IdentifiedGenesisMetadata}
 */
public final class IdentifiedGenesisMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.core.client.v1.IdentifiedGenesisMetadata)
    IdentifiedGenesisMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IdentifiedGenesisMetadata.newBuilder() to construct.
  private IdentifiedGenesisMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IdentifiedGenesisMetadata() {
    clientId_ = "";
    clientMetadata_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new IdentifiedGenesisMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return GenesisProto.internal_static_ibc_core_client_v1_IdentifiedGenesisMetadata_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GenesisProto.internal_static_ibc_core_client_v1_IdentifiedGenesisMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            IdentifiedGenesisMetadata.class, Builder.class);
  }

  public static final int CLIENT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile Object clientId_ = "";
  /**
   * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
   * @return The clientId.
   */
  @Override
  public String getClientId() {
    Object ref = clientId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      clientId_ = s;
      return s;
    }
  }
  /**
   * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
   * @return The bytes for clientId.
   */
  @Override
  public com.google.protobuf.ByteString
      getClientIdBytes() {
    Object ref = clientId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      clientId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLIENT_METADATA_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<GenesisMetadata> clientMetadata_;
  /**
   * <code>repeated .ibc.core.client.v1.GenesisMetadata client_metadata = 2 [json_name = "clientMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"client_metadata&#92;""];</code>
   */
  @Override
  public java.util.List<GenesisMetadata> getClientMetadataList() {
    return clientMetadata_;
  }
  /**
   * <code>repeated .ibc.core.client.v1.GenesisMetadata client_metadata = 2 [json_name = "clientMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"client_metadata&#92;""];</code>
   */
  @Override
  public java.util.List<? extends GenesisMetadataOrBuilder>
      getClientMetadataOrBuilderList() {
    return clientMetadata_;
  }
  /**
   * <code>repeated .ibc.core.client.v1.GenesisMetadata client_metadata = 2 [json_name = "clientMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"client_metadata&#92;""];</code>
   */
  @Override
  public int getClientMetadataCount() {
    return clientMetadata_.size();
  }
  /**
   * <code>repeated .ibc.core.client.v1.GenesisMetadata client_metadata = 2 [json_name = "clientMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"client_metadata&#92;""];</code>
   */
  @Override
  public GenesisMetadata getClientMetadata(int index) {
    return clientMetadata_.get(index);
  }
  /**
   * <code>repeated .ibc.core.client.v1.GenesisMetadata client_metadata = 2 [json_name = "clientMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"client_metadata&#92;""];</code>
   */
  @Override
  public GenesisMetadataOrBuilder getClientMetadataOrBuilder(
      int index) {
    return clientMetadata_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clientId_);
    }
    for (int i = 0; i < clientMetadata_.size(); i++) {
      output.writeMessage(2, clientMetadata_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clientId_);
    }
    for (int i = 0; i < clientMetadata_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, clientMetadata_.get(i));
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
    if (!(obj instanceof IdentifiedGenesisMetadata)) {
      return super.equals(obj);
    }
    IdentifiedGenesisMetadata other = (IdentifiedGenesisMetadata) obj;

    if (!getClientId()
        .equals(other.getClientId())) return false;
    if (!getClientMetadataList()
        .equals(other.getClientMetadataList())) return false;
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
    hash = (37 * hash) + CLIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClientId().hashCode();
    if (getClientMetadataCount() > 0) {
      hash = (37 * hash) + CLIENT_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getClientMetadataList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static IdentifiedGenesisMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static IdentifiedGenesisMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static IdentifiedGenesisMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static IdentifiedGenesisMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static IdentifiedGenesisMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static IdentifiedGenesisMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static IdentifiedGenesisMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static IdentifiedGenesisMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static IdentifiedGenesisMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static IdentifiedGenesisMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static IdentifiedGenesisMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static IdentifiedGenesisMetadata parseFrom(
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
  public static Builder newBuilder(IdentifiedGenesisMetadata prototype) {
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
   * IdentifiedGenesisMetadata has the client metadata with the corresponding
   * client id.
   * </pre>
   *
   * Protobuf type {@code ibc.core.client.v1.IdentifiedGenesisMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.core.client.v1.IdentifiedGenesisMetadata)
      IdentifiedGenesisMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GenesisProto.internal_static_ibc_core_client_v1_IdentifiedGenesisMetadata_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GenesisProto.internal_static_ibc_core_client_v1_IdentifiedGenesisMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              IdentifiedGenesisMetadata.class, Builder.class);
    }

    // Construct using com.ibc.core.client.v1.IdentifiedGenesisMetadata.newBuilder()
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
      clientId_ = "";
      if (clientMetadataBuilder_ == null) {
        clientMetadata_ = java.util.Collections.emptyList();
      } else {
        clientMetadata_ = null;
        clientMetadataBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GenesisProto.internal_static_ibc_core_client_v1_IdentifiedGenesisMetadata_descriptor;
    }

    @Override
    public IdentifiedGenesisMetadata getDefaultInstanceForType() {
      return IdentifiedGenesisMetadata.getDefaultInstance();
    }

    @Override
    public IdentifiedGenesisMetadata build() {
      IdentifiedGenesisMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public IdentifiedGenesisMetadata buildPartial() {
      IdentifiedGenesisMetadata result = new IdentifiedGenesisMetadata(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(IdentifiedGenesisMetadata result) {
      if (clientMetadataBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          clientMetadata_ = java.util.Collections.unmodifiableList(clientMetadata_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.clientMetadata_ = clientMetadata_;
      } else {
        result.clientMetadata_ = clientMetadataBuilder_.build();
      }
    }

    private void buildPartial0(IdentifiedGenesisMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.clientId_ = clientId_;
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
      if (other instanceof IdentifiedGenesisMetadata) {
        return mergeFrom((IdentifiedGenesisMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(IdentifiedGenesisMetadata other) {
      if (other == IdentifiedGenesisMetadata.getDefaultInstance()) return this;
      if (!other.getClientId().isEmpty()) {
        clientId_ = other.clientId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (clientMetadataBuilder_ == null) {
        if (!other.clientMetadata_.isEmpty()) {
          if (clientMetadata_.isEmpty()) {
            clientMetadata_ = other.clientMetadata_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureClientMetadataIsMutable();
            clientMetadata_.addAll(other.clientMetadata_);
          }
          onChanged();
        }
      } else {
        if (!other.clientMetadata_.isEmpty()) {
          if (clientMetadataBuilder_.isEmpty()) {
            clientMetadataBuilder_.dispose();
            clientMetadataBuilder_ = null;
            clientMetadata_ = other.clientMetadata_;
            bitField0_ = (bitField0_ & ~0x00000002);
            clientMetadataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getClientMetadataFieldBuilder() : null;
          } else {
            clientMetadataBuilder_.addAllMessages(other.clientMetadata_);
          }
        }
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
              clientId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              GenesisMetadata m =
                  input.readMessage(
                      GenesisMetadata.parser(),
                      extensionRegistry);
              if (clientMetadataBuilder_ == null) {
                ensureClientMetadataIsMutable();
                clientMetadata_.add(m);
              } else {
                clientMetadataBuilder_.addMessage(m);
              }
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

    private Object clientId_ = "";
    /**
     * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
     * @return The clientId.
     */
    public String getClientId() {
      Object ref = clientId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        clientId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
     * @return The bytes for clientId.
     */
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      Object ref = clientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
     * @param value The clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientId(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      clientId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearClientId() {
      clientId_ = getDefaultInstance().getClientId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
     * @param value The bytes for clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      clientId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<GenesisMetadata> clientMetadata_ =
      java.util.Collections.emptyList();
    private void ensureClientMetadataIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        clientMetadata_ = new java.util.ArrayList<GenesisMetadata>(clientMetadata_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        GenesisMetadata, GenesisMetadata.Builder, GenesisMetadataOrBuilder> clientMetadataBuilder_;

    /**
     * <code>repeated .ibc.core.client.v1.GenesisMetadata client_metadata = 2 [json_name = "clientMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"client_metadata&#92;""];</code>
     */
    public java.util.List<GenesisMetadata> getClientMetadataList() {
      if (clientMetadataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(clientMetadata_);
      } else {
        return clientMetadataBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ibc.core.client.v1.GenesisMetadata client_metadata = 2 [json_name = "clientMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"client_metadata&#92;""];</code>
     */
    public int getClientMetadataCount() {
      if (clientMetadataBuilder_ == null) {
        return clientMetadata_.size();
      } else {
        return clientMetadataBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ibc.core.client.v1.GenesisMetadata client_metadata = 2 [json_name = "clientMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"client_metadata&#92;""];</code>
     */
    public GenesisMetadata getClientMetadata(int index) {
      if (clientMetadataBuilder_ == null) {
        return clientMetadata_.get(index);
      } else {
        return clientMetadataBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ibc.core.client.v1.GenesisMetadata client_metadata = 2 [json_name = "clientMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"client_metadata&#92;""];</code>
     */
    public Builder setClientMetadata(
        int index, GenesisMetadata value) {
      if (clientMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClientMetadataIsMutable();
        clientMetadata_.set(index, value);
        onChanged();
      } else {
        clientMetadataBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ibc.core.client.v1.GenesisMetadata client_metadata = 2 [json_name = "clientMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"client_metadata&#92;""];</code>
     */
    public Builder setClientMetadata(
        int index, GenesisMetadata.Builder builderForValue) {
      if (clientMetadataBuilder_ == null) {
        ensureClientMetadataIsMutable();
        clientMetadata_.set(index, builderForValue.build());
        onChanged();
      } else {
        clientMetadataBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ibc.core.client.v1.GenesisMetadata client_metadata = 2 [json_name = "clientMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"client_metadata&#92;""];</code>
     */
    public Builder addClientMetadata(GenesisMetadata value) {
      if (clientMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClientMetadataIsMutable();
        clientMetadata_.add(value);
        onChanged();
      } else {
        clientMetadataBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ibc.core.client.v1.GenesisMetadata client_metadata = 2 [json_name = "clientMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"client_metadata&#92;""];</code>
     */
    public Builder addClientMetadata(
        int index, GenesisMetadata value) {
      if (clientMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClientMetadataIsMutable();
        clientMetadata_.add(index, value);
        onChanged();
      } else {
        clientMetadataBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ibc.core.client.v1.GenesisMetadata client_metadata = 2 [json_name = "clientMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"client_metadata&#92;""];</code>
     */
    public Builder addClientMetadata(
        GenesisMetadata.Builder builderForValue) {
      if (clientMetadataBuilder_ == null) {
        ensureClientMetadataIsMutable();
        clientMetadata_.add(builderForValue.build());
        onChanged();
      } else {
        clientMetadataBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ibc.core.client.v1.GenesisMetadata client_metadata = 2 [json_name = "clientMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"client_metadata&#92;""];</code>
     */
    public Builder addClientMetadata(
        int index, GenesisMetadata.Builder builderForValue) {
      if (clientMetadataBuilder_ == null) {
        ensureClientMetadataIsMutable();
        clientMetadata_.add(index, builderForValue.build());
        onChanged();
      } else {
        clientMetadataBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ibc.core.client.v1.GenesisMetadata client_metadata = 2 [json_name = "clientMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"client_metadata&#92;""];</code>
     */
    public Builder addAllClientMetadata(
        Iterable<? extends GenesisMetadata> values) {
      if (clientMetadataBuilder_ == null) {
        ensureClientMetadataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, clientMetadata_);
        onChanged();
      } else {
        clientMetadataBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ibc.core.client.v1.GenesisMetadata client_metadata = 2 [json_name = "clientMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"client_metadata&#92;""];</code>
     */
    public Builder clearClientMetadata() {
      if (clientMetadataBuilder_ == null) {
        clientMetadata_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        clientMetadataBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ibc.core.client.v1.GenesisMetadata client_metadata = 2 [json_name = "clientMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"client_metadata&#92;""];</code>
     */
    public Builder removeClientMetadata(int index) {
      if (clientMetadataBuilder_ == null) {
        ensureClientMetadataIsMutable();
        clientMetadata_.remove(index);
        onChanged();
      } else {
        clientMetadataBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ibc.core.client.v1.GenesisMetadata client_metadata = 2 [json_name = "clientMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"client_metadata&#92;""];</code>
     */
    public GenesisMetadata.Builder getClientMetadataBuilder(
        int index) {
      return getClientMetadataFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ibc.core.client.v1.GenesisMetadata client_metadata = 2 [json_name = "clientMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"client_metadata&#92;""];</code>
     */
    public GenesisMetadataOrBuilder getClientMetadataOrBuilder(
        int index) {
      if (clientMetadataBuilder_ == null) {
        return clientMetadata_.get(index);  } else {
        return clientMetadataBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ibc.core.client.v1.GenesisMetadata client_metadata = 2 [json_name = "clientMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"client_metadata&#92;""];</code>
     */
    public java.util.List<? extends GenesisMetadataOrBuilder>
         getClientMetadataOrBuilderList() {
      if (clientMetadataBuilder_ != null) {
        return clientMetadataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(clientMetadata_);
      }
    }
    /**
     * <code>repeated .ibc.core.client.v1.GenesisMetadata client_metadata = 2 [json_name = "clientMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"client_metadata&#92;""];</code>
     */
    public GenesisMetadata.Builder addClientMetadataBuilder() {
      return getClientMetadataFieldBuilder().addBuilder(
          GenesisMetadata.getDefaultInstance());
    }
    /**
     * <code>repeated .ibc.core.client.v1.GenesisMetadata client_metadata = 2 [json_name = "clientMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"client_metadata&#92;""];</code>
     */
    public GenesisMetadata.Builder addClientMetadataBuilder(
        int index) {
      return getClientMetadataFieldBuilder().addBuilder(
          index, GenesisMetadata.getDefaultInstance());
    }
    /**
     * <code>repeated .ibc.core.client.v1.GenesisMetadata client_metadata = 2 [json_name = "clientMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"client_metadata&#92;""];</code>
     */
    public java.util.List<GenesisMetadata.Builder>
         getClientMetadataBuilderList() {
      return getClientMetadataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        GenesisMetadata, GenesisMetadata.Builder, GenesisMetadataOrBuilder>
        getClientMetadataFieldBuilder() {
      if (clientMetadataBuilder_ == null) {
        clientMetadataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            GenesisMetadata, GenesisMetadata.Builder, GenesisMetadataOrBuilder>(
                clientMetadata_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        clientMetadata_ = null;
      }
      return clientMetadataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ibc.core.client.v1.IdentifiedGenesisMetadata)
  }

  // @@protoc_insertion_point(class_scope:ibc.core.client.v1.IdentifiedGenesisMetadata)
  private static final IdentifiedGenesisMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new IdentifiedGenesisMetadata();
  }

  public static IdentifiedGenesisMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IdentifiedGenesisMetadata>
      PARSER = new com.google.protobuf.AbstractParser<IdentifiedGenesisMetadata>() {
    @Override
    public IdentifiedGenesisMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<IdentifiedGenesisMetadata> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<IdentifiedGenesisMetadata> getParserForType() {
    return PARSER;
  }

  @Override
  public IdentifiedGenesisMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

