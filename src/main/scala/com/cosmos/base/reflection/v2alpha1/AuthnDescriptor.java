// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/reflection/v2alpha1/reflection.proto

package com.cosmos.base.reflection.v2alpha1;

/**
 * <pre>
 * AuthnDescriptor provides information on how to sign transactions without relying
 * on the online RPCs GetTxMetadata and CombineUnsignedTxAndSignatures
 * </pre>
 *
 * Protobuf type {@code cosmos.base.reflection.v2alpha1.AuthnDescriptor}
 */
public final class AuthnDescriptor extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.base.reflection.v2alpha1.AuthnDescriptor)
    AuthnDescriptorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AuthnDescriptor.newBuilder() to construct.
  private AuthnDescriptor(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuthnDescriptor() {
    signModes_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new AuthnDescriptor();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ReflectionProto.internal_static_cosmos_base_reflection_v2alpha1_AuthnDescriptor_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ReflectionProto.internal_static_cosmos_base_reflection_v2alpha1_AuthnDescriptor_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AuthnDescriptor.class, Builder.class);
  }

  public static final int SIGN_MODES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<SigningModeDescriptor> signModes_;
  /**
   * <pre>
   * sign_modes defines the supported signature algorithm
   * </pre>
   *
   * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
   */
  @Override
  public java.util.List<SigningModeDescriptor> getSignModesList() {
    return signModes_;
  }
  /**
   * <pre>
   * sign_modes defines the supported signature algorithm
   * </pre>
   *
   * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
   */
  @Override
  public java.util.List<? extends SigningModeDescriptorOrBuilder>
      getSignModesOrBuilderList() {
    return signModes_;
  }
  /**
   * <pre>
   * sign_modes defines the supported signature algorithm
   * </pre>
   *
   * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
   */
  @Override
  public int getSignModesCount() {
    return signModes_.size();
  }
  /**
   * <pre>
   * sign_modes defines the supported signature algorithm
   * </pre>
   *
   * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
   */
  @Override
  public SigningModeDescriptor getSignModes(int index) {
    return signModes_.get(index);
  }
  /**
   * <pre>
   * sign_modes defines the supported signature algorithm
   * </pre>
   *
   * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
   */
  @Override
  public SigningModeDescriptorOrBuilder getSignModesOrBuilder(
      int index) {
    return signModes_.get(index);
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
    for (int i = 0; i < signModes_.size(); i++) {
      output.writeMessage(1, signModes_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < signModes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, signModes_.get(i));
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
    if (!(obj instanceof AuthnDescriptor)) {
      return super.equals(obj);
    }
    AuthnDescriptor other = (AuthnDescriptor) obj;

    if (!getSignModesList()
        .equals(other.getSignModesList())) return false;
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
    if (getSignModesCount() > 0) {
      hash = (37 * hash) + SIGN_MODES_FIELD_NUMBER;
      hash = (53 * hash) + getSignModesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static AuthnDescriptor parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AuthnDescriptor parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AuthnDescriptor parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AuthnDescriptor parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AuthnDescriptor parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AuthnDescriptor parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AuthnDescriptor parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AuthnDescriptor parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static AuthnDescriptor parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static AuthnDescriptor parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static AuthnDescriptor parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AuthnDescriptor parseFrom(
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
  public static Builder newBuilder(AuthnDescriptor prototype) {
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
   * AuthnDescriptor provides information on how to sign transactions without relying
   * on the online RPCs GetTxMetadata and CombineUnsignedTxAndSignatures
   * </pre>
   *
   * Protobuf type {@code cosmos.base.reflection.v2alpha1.AuthnDescriptor}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.base.reflection.v2alpha1.AuthnDescriptor)
      AuthnDescriptorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ReflectionProto.internal_static_cosmos_base_reflection_v2alpha1_AuthnDescriptor_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ReflectionProto.internal_static_cosmos_base_reflection_v2alpha1_AuthnDescriptor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AuthnDescriptor.class, Builder.class);
    }

    // Construct using com.cosmos.base.reflection.v2alpha1.AuthnDescriptor.newBuilder()
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
      if (signModesBuilder_ == null) {
        signModes_ = java.util.Collections.emptyList();
      } else {
        signModes_ = null;
        signModesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ReflectionProto.internal_static_cosmos_base_reflection_v2alpha1_AuthnDescriptor_descriptor;
    }

    @Override
    public AuthnDescriptor getDefaultInstanceForType() {
      return AuthnDescriptor.getDefaultInstance();
    }

    @Override
    public AuthnDescriptor build() {
      AuthnDescriptor result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public AuthnDescriptor buildPartial() {
      AuthnDescriptor result = new AuthnDescriptor(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(AuthnDescriptor result) {
      if (signModesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          signModes_ = java.util.Collections.unmodifiableList(signModes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.signModes_ = signModes_;
      } else {
        result.signModes_ = signModesBuilder_.build();
      }
    }

    private void buildPartial0(AuthnDescriptor result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof AuthnDescriptor) {
        return mergeFrom((AuthnDescriptor)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AuthnDescriptor other) {
      if (other == AuthnDescriptor.getDefaultInstance()) return this;
      if (signModesBuilder_ == null) {
        if (!other.signModes_.isEmpty()) {
          if (signModes_.isEmpty()) {
            signModes_ = other.signModes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSignModesIsMutable();
            signModes_.addAll(other.signModes_);
          }
          onChanged();
        }
      } else {
        if (!other.signModes_.isEmpty()) {
          if (signModesBuilder_.isEmpty()) {
            signModesBuilder_.dispose();
            signModesBuilder_ = null;
            signModes_ = other.signModes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            signModesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSignModesFieldBuilder() : null;
          } else {
            signModesBuilder_.addAllMessages(other.signModes_);
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
              SigningModeDescriptor m =
                  input.readMessage(
                      SigningModeDescriptor.parser(),
                      extensionRegistry);
              if (signModesBuilder_ == null) {
                ensureSignModesIsMutable();
                signModes_.add(m);
              } else {
                signModesBuilder_.addMessage(m);
              }
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

    private java.util.List<SigningModeDescriptor> signModes_ =
      java.util.Collections.emptyList();
    private void ensureSignModesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        signModes_ = new java.util.ArrayList<SigningModeDescriptor>(signModes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        SigningModeDescriptor, SigningModeDescriptor.Builder, SigningModeDescriptorOrBuilder> signModesBuilder_;

    /**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
     */
    public java.util.List<SigningModeDescriptor> getSignModesList() {
      if (signModesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(signModes_);
      } else {
        return signModesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
     */
    public int getSignModesCount() {
      if (signModesBuilder_ == null) {
        return signModes_.size();
      } else {
        return signModesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
     */
    public SigningModeDescriptor getSignModes(int index) {
      if (signModesBuilder_ == null) {
        return signModes_.get(index);
      } else {
        return signModesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
     */
    public Builder setSignModes(
        int index, SigningModeDescriptor value) {
      if (signModesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSignModesIsMutable();
        signModes_.set(index, value);
        onChanged();
      } else {
        signModesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
     */
    public Builder setSignModes(
        int index, SigningModeDescriptor.Builder builderForValue) {
      if (signModesBuilder_ == null) {
        ensureSignModesIsMutable();
        signModes_.set(index, builderForValue.build());
        onChanged();
      } else {
        signModesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
     */
    public Builder addSignModes(SigningModeDescriptor value) {
      if (signModesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSignModesIsMutable();
        signModes_.add(value);
        onChanged();
      } else {
        signModesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
     */
    public Builder addSignModes(
        int index, SigningModeDescriptor value) {
      if (signModesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSignModesIsMutable();
        signModes_.add(index, value);
        onChanged();
      } else {
        signModesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
     */
    public Builder addSignModes(
        SigningModeDescriptor.Builder builderForValue) {
      if (signModesBuilder_ == null) {
        ensureSignModesIsMutable();
        signModes_.add(builderForValue.build());
        onChanged();
      } else {
        signModesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
     */
    public Builder addSignModes(
        int index, SigningModeDescriptor.Builder builderForValue) {
      if (signModesBuilder_ == null) {
        ensureSignModesIsMutable();
        signModes_.add(index, builderForValue.build());
        onChanged();
      } else {
        signModesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
     */
    public Builder addAllSignModes(
        Iterable<? extends SigningModeDescriptor> values) {
      if (signModesBuilder_ == null) {
        ensureSignModesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, signModes_);
        onChanged();
      } else {
        signModesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
     */
    public Builder clearSignModes() {
      if (signModesBuilder_ == null) {
        signModes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        signModesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
     */
    public Builder removeSignModes(int index) {
      if (signModesBuilder_ == null) {
        ensureSignModesIsMutable();
        signModes_.remove(index);
        onChanged();
      } else {
        signModesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
     */
    public SigningModeDescriptor.Builder getSignModesBuilder(
        int index) {
      return getSignModesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
     */
    public SigningModeDescriptorOrBuilder getSignModesOrBuilder(
        int index) {
      if (signModesBuilder_ == null) {
        return signModes_.get(index);  } else {
        return signModesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
     */
    public java.util.List<? extends SigningModeDescriptorOrBuilder>
         getSignModesOrBuilderList() {
      if (signModesBuilder_ != null) {
        return signModesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(signModes_);
      }
    }
    /**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
     */
    public SigningModeDescriptor.Builder addSignModesBuilder() {
      return getSignModesFieldBuilder().addBuilder(
          SigningModeDescriptor.getDefaultInstance());
    }
    /**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
     */
    public SigningModeDescriptor.Builder addSignModesBuilder(
        int index) {
      return getSignModesFieldBuilder().addBuilder(
          index, SigningModeDescriptor.getDefaultInstance());
    }
    /**
     * <pre>
     * sign_modes defines the supported signature algorithm
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
     */
    public java.util.List<SigningModeDescriptor.Builder>
         getSignModesBuilderList() {
      return getSignModesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        SigningModeDescriptor, SigningModeDescriptor.Builder, SigningModeDescriptorOrBuilder>
        getSignModesFieldBuilder() {
      if (signModesBuilder_ == null) {
        signModesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            SigningModeDescriptor, SigningModeDescriptor.Builder, SigningModeDescriptorOrBuilder>(
                signModes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        signModes_ = null;
      }
      return signModesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.base.reflection.v2alpha1.AuthnDescriptor)
  }

  // @@protoc_insertion_point(class_scope:cosmos.base.reflection.v2alpha1.AuthnDescriptor)
  private static final AuthnDescriptor DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AuthnDescriptor();
  }

  public static AuthnDescriptor getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthnDescriptor>
      PARSER = new com.google.protobuf.AbstractParser<AuthnDescriptor>() {
    @Override
    public AuthnDescriptor parsePartialFrom(
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

  public static com.google.protobuf.Parser<AuthnDescriptor> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<AuthnDescriptor> getParserForType() {
    return PARSER;
  }

  @Override
  public AuthnDescriptor getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

