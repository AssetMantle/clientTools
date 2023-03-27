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

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgGrant();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return TxProto.internal_static_cosmos_authz_v1beta1_MsgGrant_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return TxProto.internal_static_cosmos_authz_v1beta1_MsgGrant_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            MsgGrant.class, Builder.class);
  }

  public static final int GRANTER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile Object granter_ = "";
  /**
   * <code>string granter = 1 [json_name = "granter"];</code>
   * @return The granter.
   */
  @Override
  public String getGranter() {
    Object ref = granter_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      granter_ = s;
      return s;
    }
  }
  /**
   * <code>string granter = 1 [json_name = "granter"];</code>
   * @return The bytes for granter.
   */
  @Override
  public com.google.protobuf.ByteString
      getGranterBytes() {
    Object ref = granter_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      granter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GRANTEE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile Object grantee_ = "";
  /**
   * <code>string grantee = 2 [json_name = "grantee"];</code>
   * @return The grantee.
   */
  @Override
  public String getGrantee() {
    Object ref = grantee_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      grantee_ = s;
      return s;
    }
  }
  /**
   * <code>string grantee = 2 [json_name = "grantee"];</code>
   * @return The bytes for grantee.
   */
  @Override
  public com.google.protobuf.ByteString
      getGranteeBytes() {
    Object ref = grantee_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      grantee_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GRANT_FIELD_NUMBER = 3;
  private Grant grant_;
  /**
   * <code>.cosmos.authz.v1beta1.Grant grant = 3 [json_name = "grant", (.gogoproto.nullable) = false];</code>
   * @return Whether the grant field is set.
   */
  @Override
  public boolean hasGrant() {
    return grant_ != null;
  }
  /**
   * <code>.cosmos.authz.v1beta1.Grant grant = 3 [json_name = "grant", (.gogoproto.nullable) = false];</code>
   * @return The grant.
   */
  @Override
  public Grant getGrant() {
    return grant_ == null ? Grant.getDefaultInstance() : grant_;
  }
  /**
   * <code>.cosmos.authz.v1beta1.Grant grant = 3 [json_name = "grant", (.gogoproto.nullable) = false];</code>
   */
  @Override
  public GrantOrBuilder getGrantOrBuilder() {
    return grant_ == null ? Grant.getDefaultInstance() : grant_;
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

  @Override
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

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof MsgGrant)) {
      return super.equals(obj);
    }
    MsgGrant other = (MsgGrant) obj;

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

  @Override
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

  public static MsgGrant parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MsgGrant parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MsgGrant parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MsgGrant parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MsgGrant parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MsgGrant parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MsgGrant parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MsgGrant parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static MsgGrant parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static MsgGrant parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static MsgGrant parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MsgGrant parseFrom(
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
  public static Builder newBuilder(MsgGrant prototype) {
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
   * MsgGrant is a request type for Grant method. It declares authorization to the grantee
   * on behalf of the granter with the provided expiration time.
   * </pre>
   *
   * Protobuf type {@code cosmos.authz.v1beta1.MsgGrant}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.authz.v1beta1.MsgGrant)
      MsgGrantOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TxProto.internal_static_cosmos_authz_v1beta1_MsgGrant_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TxProto.internal_static_cosmos_authz_v1beta1_MsgGrant_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MsgGrant.class, Builder.class);
    }

    // Construct using com.cosmos.authz.v1beta1.MsgGrant.newBuilder()
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
      granter_ = "";
      grantee_ = "";
      grant_ = null;
      if (grantBuilder_ != null) {
        grantBuilder_.dispose();
        grantBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return TxProto.internal_static_cosmos_authz_v1beta1_MsgGrant_descriptor;
    }

    @Override
    public MsgGrant getDefaultInstanceForType() {
      return MsgGrant.getDefaultInstance();
    }

    @Override
    public MsgGrant build() {
      MsgGrant result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public MsgGrant buildPartial() {
      MsgGrant result = new MsgGrant(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(MsgGrant result) {
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
      if (other instanceof MsgGrant) {
        return mergeFrom((MsgGrant)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(MsgGrant other) {
      if (other == MsgGrant.getDefaultInstance()) return this;
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

    private Object granter_ = "";
    /**
     * <code>string granter = 1 [json_name = "granter"];</code>
     * @return The granter.
     */
    public String getGranter() {
      Object ref = granter_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        granter_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string granter = 1 [json_name = "granter"];</code>
     * @return The bytes for granter.
     */
    public com.google.protobuf.ByteString
        getGranterBytes() {
      Object ref = granter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
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
        String value) {
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

    private Object grantee_ = "";
    /**
     * <code>string grantee = 2 [json_name = "grantee"];</code>
     * @return The grantee.
     */
    public String getGrantee() {
      Object ref = grantee_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        grantee_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string grantee = 2 [json_name = "grantee"];</code>
     * @return The bytes for grantee.
     */
    public com.google.protobuf.ByteString
        getGranteeBytes() {
      Object ref = grantee_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
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
        String value) {
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

    private Grant grant_;
    private com.google.protobuf.SingleFieldBuilderV3<
        Grant, Grant.Builder, GrantOrBuilder> grantBuilder_;
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
    public Grant getGrant() {
      if (grantBuilder_ == null) {
        return grant_ == null ? Grant.getDefaultInstance() : grant_;
      } else {
        return grantBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.authz.v1beta1.Grant grant = 3 [json_name = "grant", (.gogoproto.nullable) = false];</code>
     */
    public Builder setGrant(Grant value) {
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
        Grant.Builder builderForValue) {
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
    public Builder mergeGrant(Grant value) {
      if (grantBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          grant_ != null &&
          grant_ != Grant.getDefaultInstance()) {
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
    public Grant.Builder getGrantBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getGrantFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.authz.v1beta1.Grant grant = 3 [json_name = "grant", (.gogoproto.nullable) = false];</code>
     */
    public GrantOrBuilder getGrantOrBuilder() {
      if (grantBuilder_ != null) {
        return grantBuilder_.getMessageOrBuilder();
      } else {
        return grant_ == null ?
            Grant.getDefaultInstance() : grant_;
      }
    }
    /**
     * <code>.cosmos.authz.v1beta1.Grant grant = 3 [json_name = "grant", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        Grant, Grant.Builder, GrantOrBuilder>
        getGrantFieldBuilder() {
      if (grantBuilder_ == null) {
        grantBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            Grant, Grant.Builder, GrantOrBuilder>(
                getGrant(),
                getParentForChildren(),
                isClean());
        grant_ = null;
      }
      return grantBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.authz.v1beta1.MsgGrant)
  }

  // @@protoc_insertion_point(class_scope:cosmos.authz.v1beta1.MsgGrant)
  private static final MsgGrant DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new MsgGrant();
  }

  public static MsgGrant getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgGrant>
      PARSER = new com.google.protobuf.AbstractParser<MsgGrant>() {
    @Override
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

  @Override
  public com.google.protobuf.Parser<MsgGrant> getParserForType() {
    return PARSER;
  }

  @Override
  public MsgGrant getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

