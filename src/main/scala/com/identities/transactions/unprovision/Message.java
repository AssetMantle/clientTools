// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/identities/internal/transactions/unprovision/message.v1.proto

package com.identities.transactions.unprovision;

/**
 * Protobuf type {@code identities.transactions.unprovision.Message}
 */
public final class Message extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:identities.transactions.unprovision.Message)
    MessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Message.newBuilder() to construct.
  private Message(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Message() {
    from_ = "";
    to_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new Message();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return MessageV1Proto.internal_static_identities_transactions_unprovision_Message_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return MessageV1Proto.internal_static_identities_transactions_unprovision_Message_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Message.class, Builder.class);
  }

  public static final int FROM_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile Object from_ = "";
  /**
   * <code>string from = 1 [json_name = "from"];</code>
   * @return The from.
   */
  @Override
  public String getFrom() {
    Object ref = from_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      from_ = s;
      return s;
    }
  }
  /**
   * <code>string from = 1 [json_name = "from"];</code>
   * @return The bytes for from.
   */
  @Override
  public com.google.protobuf.ByteString
      getFromBytes() {
    Object ref = from_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      from_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TO_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile Object to_ = "";
  /**
   * <code>string to = 2 [json_name = "to"];</code>
   * @return The to.
   */
  @Override
  public String getTo() {
    Object ref = to_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      to_ = s;
      return s;
    }
  }
  /**
   * <code>string to = 2 [json_name = "to"];</code>
   * @return The bytes for to.
   */
  @Override
  public com.google.protobuf.ByteString
      getToBytes() {
    Object ref = to_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      to_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IDENTITY_I_D_FIELD_NUMBER = 3;
  private com.ids.IdentityID identityID_;
  /**
   * <code>.ids.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
   * @return Whether the identityID field is set.
   */
  @Override
  public boolean hasIdentityID() {
    return identityID_ != null;
  }
  /**
   * <code>.ids.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
   * @return The identityID.
   */
  @Override
  public com.ids.IdentityID getIdentityID() {
    return identityID_ == null ? com.ids.IdentityID.getDefaultInstance() : identityID_;
  }
  /**
   * <code>.ids.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
   */
  @Override
  public com.ids.IdentityIDOrBuilder getIdentityIDOrBuilder() {
    return identityID_ == null ? com.ids.IdentityID.getDefaultInstance() : identityID_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(from_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, from_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(to_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, to_);
    }
    if (identityID_ != null) {
      output.writeMessage(3, getIdentityID());
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(from_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, from_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(to_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, to_);
    }
    if (identityID_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getIdentityID());
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
    if (!(obj instanceof Message)) {
      return super.equals(obj);
    }
    Message other = (Message) obj;

    if (!getFrom()
        .equals(other.getFrom())) return false;
    if (!getTo()
        .equals(other.getTo())) return false;
    if (hasIdentityID() != other.hasIdentityID()) return false;
    if (hasIdentityID()) {
      if (!getIdentityID()
          .equals(other.getIdentityID())) return false;
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
    hash = (37 * hash) + FROM_FIELD_NUMBER;
    hash = (53 * hash) + getFrom().hashCode();
    hash = (37 * hash) + TO_FIELD_NUMBER;
    hash = (53 * hash) + getTo().hashCode();
    if (hasIdentityID()) {
      hash = (37 * hash) + IDENTITY_I_D_FIELD_NUMBER;
      hash = (53 * hash) + getIdentityID().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Message parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Message parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Message parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Message parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Message parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Message parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Message parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Message parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Message parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Message parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Message parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Message parseFrom(
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
  public static Builder newBuilder(Message prototype) {
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
   * Protobuf type {@code identities.transactions.unprovision.Message}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:identities.transactions.unprovision.Message)
      MessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MessageV1Proto.internal_static_identities_transactions_unprovision_Message_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MessageV1Proto.internal_static_identities_transactions_unprovision_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Message.class, Builder.class);
    }

    // Construct using com.identities.transactions.unprovision.Message.newBuilder()
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
      from_ = "";
      to_ = "";
      identityID_ = null;
      if (identityIDBuilder_ != null) {
        identityIDBuilder_.dispose();
        identityIDBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return MessageV1Proto.internal_static_identities_transactions_unprovision_Message_descriptor;
    }

    @Override
    public Message getDefaultInstanceForType() {
      return Message.getDefaultInstance();
    }

    @Override
    public Message build() {
      Message result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Message buildPartial() {
      Message result = new Message(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(Message result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.from_ = from_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.to_ = to_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.identityID_ = identityIDBuilder_ == null
            ? identityID_
            : identityIDBuilder_.build();
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
      if (other instanceof Message) {
        return mergeFrom((Message)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Message other) {
      if (other == Message.getDefaultInstance()) return this;
      if (!other.getFrom().isEmpty()) {
        from_ = other.from_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTo().isEmpty()) {
        to_ = other.to_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasIdentityID()) {
        mergeIdentityID(other.getIdentityID());
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
              from_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              to_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getIdentityIDFieldBuilder().getBuilder(),
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

    private Object from_ = "";
    /**
     * <code>string from = 1 [json_name = "from"];</code>
     * @return The from.
     */
    public String getFrom() {
      Object ref = from_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        from_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string from = 1 [json_name = "from"];</code>
     * @return The bytes for from.
     */
    public com.google.protobuf.ByteString
        getFromBytes() {
      Object ref = from_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        from_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string from = 1 [json_name = "from"];</code>
     * @param value The from to set.
     * @return This builder for chaining.
     */
    public Builder setFrom(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      from_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string from = 1 [json_name = "from"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFrom() {
      from_ = getDefaultInstance().getFrom();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string from = 1 [json_name = "from"];</code>
     * @param value The bytes for from to set.
     * @return This builder for chaining.
     */
    public Builder setFromBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      from_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private Object to_ = "";
    /**
     * <code>string to = 2 [json_name = "to"];</code>
     * @return The to.
     */
    public String getTo() {
      Object ref = to_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        to_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string to = 2 [json_name = "to"];</code>
     * @return The bytes for to.
     */
    public com.google.protobuf.ByteString
        getToBytes() {
      Object ref = to_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        to_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string to = 2 [json_name = "to"];</code>
     * @param value The to to set.
     * @return This builder for chaining.
     */
    public Builder setTo(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      to_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string to = 2 [json_name = "to"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTo() {
      to_ = getDefaultInstance().getTo();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string to = 2 [json_name = "to"];</code>
     * @param value The bytes for to to set.
     * @return This builder for chaining.
     */
    public Builder setToBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      to_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.ids.IdentityID identityID_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ids.IdentityID, com.ids.IdentityID.Builder, com.ids.IdentityIDOrBuilder> identityIDBuilder_;
    /**
     * <code>.ids.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
     * @return Whether the identityID field is set.
     */
    public boolean hasIdentityID() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.ids.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
     * @return The identityID.
     */
    public com.ids.IdentityID getIdentityID() {
      if (identityIDBuilder_ == null) {
        return identityID_ == null ? com.ids.IdentityID.getDefaultInstance() : identityID_;
      } else {
        return identityIDBuilder_.getMessage();
      }
    }
    /**
     * <code>.ids.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
     */
    public Builder setIdentityID(com.ids.IdentityID value) {
      if (identityIDBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        identityID_ = value;
      } else {
        identityIDBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ids.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
     */
    public Builder setIdentityID(
        com.ids.IdentityID.Builder builderForValue) {
      if (identityIDBuilder_ == null) {
        identityID_ = builderForValue.build();
      } else {
        identityIDBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ids.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
     */
    public Builder mergeIdentityID(com.ids.IdentityID value) {
      if (identityIDBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          identityID_ != null &&
          identityID_ != com.ids.IdentityID.getDefaultInstance()) {
          getIdentityIDBuilder().mergeFrom(value);
        } else {
          identityID_ = value;
        }
      } else {
        identityIDBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ids.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
     */
    public Builder clearIdentityID() {
      bitField0_ = (bitField0_ & ~0x00000004);
      identityID_ = null;
      if (identityIDBuilder_ != null) {
        identityIDBuilder_.dispose();
        identityIDBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ids.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
     */
    public com.ids.IdentityID.Builder getIdentityIDBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getIdentityIDFieldBuilder().getBuilder();
    }
    /**
     * <code>.ids.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
     */
    public com.ids.IdentityIDOrBuilder getIdentityIDOrBuilder() {
      if (identityIDBuilder_ != null) {
        return identityIDBuilder_.getMessageOrBuilder();
      } else {
        return identityID_ == null ?
            com.ids.IdentityID.getDefaultInstance() : identityID_;
      }
    }
    /**
     * <code>.ids.IdentityID identity_i_d = 3 [json_name = "identityID"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ids.IdentityID, com.ids.IdentityID.Builder, com.ids.IdentityIDOrBuilder> 
        getIdentityIDFieldBuilder() {
      if (identityIDBuilder_ == null) {
        identityIDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ids.IdentityID, com.ids.IdentityID.Builder, com.ids.IdentityIDOrBuilder>(
                getIdentityID(),
                getParentForChildren(),
                isClean());
        identityID_ = null;
      }
      return identityIDBuilder_;
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


    // @@protoc_insertion_point(builder_scope:identities.transactions.unprovision.Message)
  }

  // @@protoc_insertion_point(class_scope:identities.transactions.unprovision.Message)
  private static final Message DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Message();
  }

  public static Message getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Message>
      PARSER = new com.google.protobuf.AbstractParser<Message>() {
    @Override
    public Message parsePartialFrom(
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

  public static com.google.protobuf.Parser<Message> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Message> getParserForType() {
    return PARSER;
  }

  @Override
  public Message getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

