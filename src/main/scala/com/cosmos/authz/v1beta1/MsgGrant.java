// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/authz/v1beta1/tx.proto

package com.cosmos.authz.v1beta1;

/**
 * <pre>
 * MsgGrant is a request type for Grant method. It declares authorization to the grantee
 * on behalf of the granter with the provided expiration time.
 * </pre>
 *
 * Protobuf type {@code cosmos.authz.v1beta1.MsgGrant}
 */
public final class MsgGrant extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.authz.v1beta1.MsgGrant)
    MsgGrantOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgGrant.newBuilder() to construct.
  private MsgGrant(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgGrant() {
    granter_ = "";
    grantee_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgGrant();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.authz.v1beta1.TxProto.internal_static_cosmos_authz_v1beta1_MsgGrant_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.authz.v1beta1.TxProto.internal_static_cosmos_authz_v1beta1_MsgGrant_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.authz.v1beta1.MsgGrant.class, com.cosmos.authz.v1beta1.MsgGrant.Builder.class);
  }

  public static final int GRANTER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object granter_ = "";
  /**
   * <code>string granter = 1 [json_name = "granter"];</code>
   * @return The granter.
   */
  @java.lang.Override
  public java.lang.String getGranter() {
    java.lang.Object ref = granter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      granter_ = s;
      return s;
    }
  }
  /**
   * <code>string granter = 1 [json_name = "granter"];</code>
   * @return The bytes for granter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGranterBytes() {
    java.lang.Object ref = granter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      granter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GRANTEE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object grantee_ = "";
  /**
   * <code>string grantee = 2 [json_name = "grantee"];</code>
   * @return The grantee.
   */
  @java.lang.Override
  public java.lang.String getGrantee() {
    java.lang.Object ref = grantee_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      grantee_ = s;
      return s;
    }
  }
  /**
   * <code>string grantee = 2 [json_name = "grantee"];</code>
   * @return The bytes for grantee.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGranteeBytes() {
    java.lang.Object ref = grantee_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      grantee_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GRANT_FIELD_NUMBER = 3;
  private com.cosmos.authz.v1beta1.Grant grant_;
  /**
   * <code>.cosmos.authz.v1beta1.Grant grant = 3 [json_name = "grant", (.gogoproto.nullable) = false];</code>
   * @return Whether the grant field is set.
   */
  @java.lang.Override
  public boolean hasGrant() {
    return grant_ != null;
  }
  /**
   * <code>.cosmos.authz.v1beta1.Grant grant = 3 [json_name = "grant", (.gogoproto.nullable) = false];</code>
   * @return The grant.
   */
  @java.lang.Override
  public com.cosmos.authz.v1beta1.Grant getGrant() {
    return grant_ == null ? com.cosmos.authz.v1beta1.Grant.getDefaultInstance() : grant_;
  }
  /**
   * <code>.cosmos.authz.v1beta1.Grant grant = 3 [json_name = "grant", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.cosmos.authz.v1beta1.GrantOrBuilder getGrantOrBuilder() {
    return grant_ == null ? com.cosmos.authz.v1beta1.Grant.getDefaultInstance() : grant_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(granter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, granter_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(grantee_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, grantee_);
    }
    if (grant_ != null) {
      output.writeMessage(3, getGrant());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(granter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, granter_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(grantee_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, grantee_);
    }
    if (grant_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getGrant());
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
    if (!(obj instanceof com.cosmos.authz.v1beta1.MsgGrant)) {
      return super.equals(obj);
    }
    com.cosmos.authz.v1beta1.MsgGrant other = (com.cosmos.authz.v1beta1.MsgGrant) obj;

    if (!getGranter()
        .equals(other.getGranter())) return false;
    if (!getGrantee()
        .equals(other.getGrantee())) return false;
    if (hasGrant() != other.hasGrant()) return false;
    if (hasGrant()) {
      if (!getGrant()
          .equals(other.getGrant())) return false;
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
    hash = (37 * hash) + GRANTER_FIELD_NUMBER;
    hash = (53 * hash) + getGranter().hashCode();
    hash = (37 * hash) + GRANTEE_FIELD_NUMBER;
    hash = (53 * hash) + getGrantee().hashCode();
    if (hasGrant()) {
      hash = (37 * hash) + GRANT_FIELD_NUMBER;
      hash = (53 * hash) + getGrant().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.authz.v1beta1.MsgGrant parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.authz.v1beta1.MsgGrant parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.authz.v1beta1.MsgGrant parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.authz.v1beta1.MsgGrant parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.authz.v1beta1.MsgGrant parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.authz.v1beta1.MsgGrant parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.authz.v1beta1.MsgGrant parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.authz.v1beta1.MsgGrant parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.authz.v1beta1.MsgGrant parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cosmos.authz.v1beta1.MsgGrant parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.authz.v1beta1.MsgGrant parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.authz.v1beta1.MsgGrant parseFrom(
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
  public static Builder newBuilder(com.cosmos.authz.v1beta1.MsgGrant prototype) {
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
   * MsgGrant is a request type for Grant method. It declares authorization to the grantee
   * on behalf of the granter with the provided expiration time.
   * </pre>
   *
   * Protobuf type {@code cosmos.authz.v1beta1.MsgGrant}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.authz.v1beta1.MsgGrant)
      com.cosmos.authz.v1beta1.MsgGrantOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.authz.v1beta1.TxProto.internal_static_cosmos_authz_v1beta1_MsgGrant_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.authz.v1beta1.TxProto.internal_static_cosmos_authz_v1beta1_MsgGrant_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.authz.v1beta1.MsgGrant.class, com.cosmos.authz.v1beta1.MsgGrant.Builder.class);
    }

    // Construct using com.cosmos.authz.v1beta1.MsgGrant.newBuilder()
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
      granter_ = "";
      grantee_ = "";
      grant_ = null;
      if (grantBuilder_ != null) {
        grantBuilder_.dispose();
        grantBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.authz.v1beta1.TxProto.internal_static_cosmos_authz_v1beta1_MsgGrant_descriptor;
    }

    @java.lang.Override
    public com.cosmos.authz.v1beta1.MsgGrant getDefaultInstanceForType() {
      return com.cosmos.authz.v1beta1.MsgGrant.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.authz.v1beta1.MsgGrant build() {
      com.cosmos.authz.v1beta1.MsgGrant result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.authz.v1beta1.MsgGrant buildPartial() {
      com.cosmos.authz.v1beta1.MsgGrant result = new com.cosmos.authz.v1beta1.MsgGrant(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmos.authz.v1beta1.MsgGrant result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.granter_ = granter_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.grantee_ = grantee_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.grant_ = grantBuilder_ == null
            ? grant_
            : grantBuilder_.build();
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
      if (other instanceof com.cosmos.authz.v1beta1.MsgGrant) {
        return mergeFrom((com.cosmos.authz.v1beta1.MsgGrant)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.authz.v1beta1.MsgGrant other) {
      if (other == com.cosmos.authz.v1beta1.MsgGrant.getDefaultInstance()) return this;
      if (!other.getGranter().isEmpty()) {
        granter_ = other.granter_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getGrantee().isEmpty()) {
        grantee_ = other.grantee_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasGrant()) {
        mergeGrant(other.getGrant());
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
              granter_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              grantee_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getGrantFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object granter_ = "";
    /**
     * <code>string granter = 1 [json_name = "granter"];</code>
     * @return The granter.
     */
    public java.lang.String getGranter() {
      java.lang.Object ref = granter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        granter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string granter = 1 [json_name = "granter"];</code>
     * @return The bytes for granter.
     */
    public com.google.protobuf.ByteString
        getGranterBytes() {
      java.lang.Object ref = granter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        granter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string granter = 1 [json_name = "granter"];</code>
     * @param value The granter to set.
     * @return This builder for chaining.
     */
    public Builder setGranter(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      granter_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string granter = 1 [json_name = "granter"];</code>
     * @return This builder for chaining.
     */
    public Builder clearGranter() {
      granter_ = getDefaultInstance().getGranter();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string granter = 1 [json_name = "granter"];</code>
     * @param value The bytes for granter to set.
     * @return This builder for chaining.
     */
    public Builder setGranterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      granter_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object grantee_ = "";
    /**
     * <code>string grantee = 2 [json_name = "grantee"];</code>
     * @return The grantee.
     */
    public java.lang.String getGrantee() {
      java.lang.Object ref = grantee_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        grantee_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string grantee = 2 [json_name = "grantee"];</code>
     * @return The bytes for grantee.
     */
    public com.google.protobuf.ByteString
        getGranteeBytes() {
      java.lang.Object ref = grantee_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        grantee_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string grantee = 2 [json_name = "grantee"];</code>
     * @param value The grantee to set.
     * @return This builder for chaining.
     */
    public Builder setGrantee(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      grantee_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string grantee = 2 [json_name = "grantee"];</code>
     * @return This builder for chaining.
     */
    public Builder clearGrantee() {
      grantee_ = getDefaultInstance().getGrantee();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string grantee = 2 [json_name = "grantee"];</code>
     * @param value The bytes for grantee to set.
     * @return This builder for chaining.
     */
    public Builder setGranteeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      grantee_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.cosmos.authz.v1beta1.Grant grant_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.authz.v1beta1.Grant, com.cosmos.authz.v1beta1.Grant.Builder, com.cosmos.authz.v1beta1.GrantOrBuilder> grantBuilder_;
    /**
     * <code>.cosmos.authz.v1beta1.Grant grant = 3 [json_name = "grant", (.gogoproto.nullable) = false];</code>
     * @return Whether the grant field is set.
     */
    public boolean hasGrant() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.cosmos.authz.v1beta1.Grant grant = 3 [json_name = "grant", (.gogoproto.nullable) = false];</code>
     * @return The grant.
     */
    public com.cosmos.authz.v1beta1.Grant getGrant() {
      if (grantBuilder_ == null) {
        return grant_ == null ? com.cosmos.authz.v1beta1.Grant.getDefaultInstance() : grant_;
      } else {
        return grantBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.authz.v1beta1.Grant grant = 3 [json_name = "grant", (.gogoproto.nullable) = false];</code>
     */
    public Builder setGrant(com.cosmos.authz.v1beta1.Grant value) {
      if (grantBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        grant_ = value;
      } else {
        grantBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.authz.v1beta1.Grant grant = 3 [json_name = "grant", (.gogoproto.nullable) = false];</code>
     */
    public Builder setGrant(
        com.cosmos.authz.v1beta1.Grant.Builder builderForValue) {
      if (grantBuilder_ == null) {
        grant_ = builderForValue.build();
      } else {
        grantBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.authz.v1beta1.Grant grant = 3 [json_name = "grant", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeGrant(com.cosmos.authz.v1beta1.Grant value) {
      if (grantBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          grant_ != null &&
          grant_ != com.cosmos.authz.v1beta1.Grant.getDefaultInstance()) {
          getGrantBuilder().mergeFrom(value);
        } else {
          grant_ = value;
        }
      } else {
        grantBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.authz.v1beta1.Grant grant = 3 [json_name = "grant", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearGrant() {
      bitField0_ = (bitField0_ & ~0x00000004);
      grant_ = null;
      if (grantBuilder_ != null) {
        grantBuilder_.dispose();
        grantBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.authz.v1beta1.Grant grant = 3 [json_name = "grant", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.authz.v1beta1.Grant.Builder getGrantBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getGrantFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.authz.v1beta1.Grant grant = 3 [json_name = "grant", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.authz.v1beta1.GrantOrBuilder getGrantOrBuilder() {
      if (grantBuilder_ != null) {
        return grantBuilder_.getMessageOrBuilder();
      } else {
        return grant_ == null ?
            com.cosmos.authz.v1beta1.Grant.getDefaultInstance() : grant_;
      }
    }
    /**
     * <code>.cosmos.authz.v1beta1.Grant grant = 3 [json_name = "grant", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.authz.v1beta1.Grant, com.cosmos.authz.v1beta1.Grant.Builder, com.cosmos.authz.v1beta1.GrantOrBuilder> 
        getGrantFieldBuilder() {
      if (grantBuilder_ == null) {
        grantBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.authz.v1beta1.Grant, com.cosmos.authz.v1beta1.Grant.Builder, com.cosmos.authz.v1beta1.GrantOrBuilder>(
                getGrant(),
                getParentForChildren(),
                isClean());
        grant_ = null;
      }
      return grantBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.authz.v1beta1.MsgGrant)
  }

  // @@protoc_insertion_point(class_scope:cosmos.authz.v1beta1.MsgGrant)
  private static final com.cosmos.authz.v1beta1.MsgGrant DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.authz.v1beta1.MsgGrant();
  }

  public static com.cosmos.authz.v1beta1.MsgGrant getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgGrant>
      PARSER = new com.google.protobuf.AbstractParser<MsgGrant>() {
    @java.lang.Override
    public MsgGrant parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgGrant> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgGrant> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.authz.v1beta1.MsgGrant getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

