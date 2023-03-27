// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/feegrant/v1beta1/feegrant.proto

package com.cosmos.feegrant.v1beta1;

/**
 * <pre>
 * Grant is stored in the KVStore to record a grant with full context
 * </pre>
 *
 * Protobuf type {@code cosmos.feegrant.v1beta1.Grant}
 */
public final class Grant extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.feegrant.v1beta1.Grant)
    GrantOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Grant.newBuilder() to construct.
  private Grant(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Grant() {
    granter_ = "";
    grantee_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new Grant();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return FeegrantProto.internal_static_cosmos_feegrant_v1beta1_Grant_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return FeegrantProto.internal_static_cosmos_feegrant_v1beta1_Grant_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Grant.class, Builder.class);
  }

  public static final int GRANTER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile Object granter_ = "";
  /**
   * <pre>
   * granter is the address of the user granting an allowance of their funds.
   * </pre>
   *
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
   * <pre>
   * granter is the address of the user granting an allowance of their funds.
   * </pre>
   *
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
   * <pre>
   * grantee is the address of the user being granted an allowance of another user's funds.
   * </pre>
   *
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
   * <pre>
   * grantee is the address of the user being granted an allowance of another user's funds.
   * </pre>
   *
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

  public static final int ALLOWANCE_FIELD_NUMBER = 3;
  private com.google.protobuf.Any allowance_;
  /**
   * <pre>
   * allowance can be any of basic and filtered fee allowance.
   * </pre>
   *
   * <code>.google.protobuf.Any allowance = 3 [json_name = "allowance", (.cosmos_proto.accepts_interface) = "FeeAllowanceI"];</code>
   * @return Whether the allowance field is set.
   */
  @Override
  public boolean hasAllowance() {
    return allowance_ != null;
  }
  /**
   * <pre>
   * allowance can be any of basic and filtered fee allowance.
   * </pre>
   *
   * <code>.google.protobuf.Any allowance = 3 [json_name = "allowance", (.cosmos_proto.accepts_interface) = "FeeAllowanceI"];</code>
   * @return The allowance.
   */
  @Override
  public com.google.protobuf.Any getAllowance() {
    return allowance_ == null ? com.google.protobuf.Any.getDefaultInstance() : allowance_;
  }
  /**
   * <pre>
   * allowance can be any of basic and filtered fee allowance.
   * </pre>
   *
   * <code>.google.protobuf.Any allowance = 3 [json_name = "allowance", (.cosmos_proto.accepts_interface) = "FeeAllowanceI"];</code>
   */
  @Override
  public com.google.protobuf.AnyOrBuilder getAllowanceOrBuilder() {
    return allowance_ == null ? com.google.protobuf.Any.getDefaultInstance() : allowance_;
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
    if (allowance_ != null) {
      output.writeMessage(3, getAllowance());
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
    if (allowance_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAllowance());
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
    if (!(obj instanceof Grant)) {
      return super.equals(obj);
    }
    Grant other = (Grant) obj;

    if (!getGranter()
        .equals(other.getGranter())) return false;
    if (!getGrantee()
        .equals(other.getGrantee())) return false;
    if (hasAllowance() != other.hasAllowance()) return false;
    if (hasAllowance()) {
      if (!getAllowance()
          .equals(other.getAllowance())) return false;
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
    if (hasAllowance()) {
      hash = (37 * hash) + ALLOWANCE_FIELD_NUMBER;
      hash = (53 * hash) + getAllowance().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Grant parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Grant parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Grant parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Grant parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Grant parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Grant parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Grant parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Grant parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Grant parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Grant parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Grant parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Grant parseFrom(
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
  public static Builder newBuilder(Grant prototype) {
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
   * Grant is stored in the KVStore to record a grant with full context
   * </pre>
   *
   * Protobuf type {@code cosmos.feegrant.v1beta1.Grant}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.feegrant.v1beta1.Grant)
      GrantOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return FeegrantProto.internal_static_cosmos_feegrant_v1beta1_Grant_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return FeegrantProto.internal_static_cosmos_feegrant_v1beta1_Grant_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Grant.class, Builder.class);
    }

    // Construct using com.cosmos.feegrant.v1beta1.Grant.newBuilder()
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
      allowance_ = null;
      if (allowanceBuilder_ != null) {
        allowanceBuilder_.dispose();
        allowanceBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return FeegrantProto.internal_static_cosmos_feegrant_v1beta1_Grant_descriptor;
    }

    @Override
    public Grant getDefaultInstanceForType() {
      return Grant.getDefaultInstance();
    }

    @Override
    public Grant build() {
      Grant result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Grant buildPartial() {
      Grant result = new Grant(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(Grant result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.granter_ = granter_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.grantee_ = grantee_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.allowance_ = allowanceBuilder_ == null
            ? allowance_
            : allowanceBuilder_.build();
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
      if (other instanceof Grant) {
        return mergeFrom((Grant)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Grant other) {
      if (other == Grant.getDefaultInstance()) return this;
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
      if (other.hasAllowance()) {
        mergeAllowance(other.getAllowance());
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
                  getAllowanceFieldBuilder().getBuilder(),
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
     * <pre>
     * granter is the address of the user granting an allowance of their funds.
     * </pre>
     *
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
     * <pre>
     * granter is the address of the user granting an allowance of their funds.
     * </pre>
     *
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
     * <pre>
     * granter is the address of the user granting an allowance of their funds.
     * </pre>
     *
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
     * <pre>
     * granter is the address of the user granting an allowance of their funds.
     * </pre>
     *
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
     * <pre>
     * granter is the address of the user granting an allowance of their funds.
     * </pre>
     *
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
     * <pre>
     * grantee is the address of the user being granted an allowance of another user's funds.
     * </pre>
     *
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
     * <pre>
     * grantee is the address of the user being granted an allowance of another user's funds.
     * </pre>
     *
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
     * <pre>
     * grantee is the address of the user being granted an allowance of another user's funds.
     * </pre>
     *
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
     * <pre>
     * grantee is the address of the user being granted an allowance of another user's funds.
     * </pre>
     *
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
     * <pre>
     * grantee is the address of the user being granted an allowance of another user's funds.
     * </pre>
     *
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

    private com.google.protobuf.Any allowance_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> allowanceBuilder_;
    /**
     * <pre>
     * allowance can be any of basic and filtered fee allowance.
     * </pre>
     *
     * <code>.google.protobuf.Any allowance = 3 [json_name = "allowance", (.cosmos_proto.accepts_interface) = "FeeAllowanceI"];</code>
     * @return Whether the allowance field is set.
     */
    public boolean hasAllowance() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * allowance can be any of basic and filtered fee allowance.
     * </pre>
     *
     * <code>.google.protobuf.Any allowance = 3 [json_name = "allowance", (.cosmos_proto.accepts_interface) = "FeeAllowanceI"];</code>
     * @return The allowance.
     */
    public com.google.protobuf.Any getAllowance() {
      if (allowanceBuilder_ == null) {
        return allowance_ == null ? com.google.protobuf.Any.getDefaultInstance() : allowance_;
      } else {
        return allowanceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * allowance can be any of basic and filtered fee allowance.
     * </pre>
     *
     * <code>.google.protobuf.Any allowance = 3 [json_name = "allowance", (.cosmos_proto.accepts_interface) = "FeeAllowanceI"];</code>
     */
    public Builder setAllowance(com.google.protobuf.Any value) {
      if (allowanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        allowance_ = value;
      } else {
        allowanceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * allowance can be any of basic and filtered fee allowance.
     * </pre>
     *
     * <code>.google.protobuf.Any allowance = 3 [json_name = "allowance", (.cosmos_proto.accepts_interface) = "FeeAllowanceI"];</code>
     */
    public Builder setAllowance(
        com.google.protobuf.Any.Builder builderForValue) {
      if (allowanceBuilder_ == null) {
        allowance_ = builderForValue.build();
      } else {
        allowanceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * allowance can be any of basic and filtered fee allowance.
     * </pre>
     *
     * <code>.google.protobuf.Any allowance = 3 [json_name = "allowance", (.cosmos_proto.accepts_interface) = "FeeAllowanceI"];</code>
     */
    public Builder mergeAllowance(com.google.protobuf.Any value) {
      if (allowanceBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          allowance_ != null &&
          allowance_ != com.google.protobuf.Any.getDefaultInstance()) {
          getAllowanceBuilder().mergeFrom(value);
        } else {
          allowance_ = value;
        }
      } else {
        allowanceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * allowance can be any of basic and filtered fee allowance.
     * </pre>
     *
     * <code>.google.protobuf.Any allowance = 3 [json_name = "allowance", (.cosmos_proto.accepts_interface) = "FeeAllowanceI"];</code>
     */
    public Builder clearAllowance() {
      bitField0_ = (bitField0_ & ~0x00000004);
      allowance_ = null;
      if (allowanceBuilder_ != null) {
        allowanceBuilder_.dispose();
        allowanceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * allowance can be any of basic and filtered fee allowance.
     * </pre>
     *
     * <code>.google.protobuf.Any allowance = 3 [json_name = "allowance", (.cosmos_proto.accepts_interface) = "FeeAllowanceI"];</code>
     */
    public com.google.protobuf.Any.Builder getAllowanceBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getAllowanceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * allowance can be any of basic and filtered fee allowance.
     * </pre>
     *
     * <code>.google.protobuf.Any allowance = 3 [json_name = "allowance", (.cosmos_proto.accepts_interface) = "FeeAllowanceI"];</code>
     */
    public com.google.protobuf.AnyOrBuilder getAllowanceOrBuilder() {
      if (allowanceBuilder_ != null) {
        return allowanceBuilder_.getMessageOrBuilder();
      } else {
        return allowance_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : allowance_;
      }
    }
    /**
     * <pre>
     * allowance can be any of basic and filtered fee allowance.
     * </pre>
     *
     * <code>.google.protobuf.Any allowance = 3 [json_name = "allowance", (.cosmos_proto.accepts_interface) = "FeeAllowanceI"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getAllowanceFieldBuilder() {
      if (allowanceBuilder_ == null) {
        allowanceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getAllowance(),
                getParentForChildren(),
                isClean());
        allowance_ = null;
      }
      return allowanceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.feegrant.v1beta1.Grant)
  }

  // @@protoc_insertion_point(class_scope:cosmos.feegrant.v1beta1.Grant)
  private static final Grant DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Grant();
  }

  public static Grant getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Grant>
      PARSER = new com.google.protobuf.AbstractParser<Grant>() {
    @Override
    public Grant parsePartialFrom(
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

  public static com.google.protobuf.Parser<Grant> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Grant> getParserForType() {
    return PARSER;
  }

  @Override
  public Grant getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

