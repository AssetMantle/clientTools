// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/orders/internal/transactions/revoke/message.v1.proto

package com.orders.transactions.revoke;

/**
 * Protobuf type {@code orders.transactions.revoke.Message}
 */
public final class Message extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:orders.transactions.revoke.Message)
    MessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Message.newBuilder() to construct.
  private Message(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Message() {
    from_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new Message();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return MessageV1Proto.internal_static_orders_transactions_revoke_Message_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return MessageV1Proto.internal_static_orders_transactions_revoke_Message_fieldAccessorTable
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

  public static final int FROM_I_D_FIELD_NUMBER = 2;
  private com.ids.IdentityID fromID_;
  /**
   * <code>.ids.IdentityID from_i_d = 2 [json_name = "fromID"];</code>
   * @return Whether the fromID field is set.
   */
  @Override
  public boolean hasFromID() {
    return fromID_ != null;
  }
  /**
   * <code>.ids.IdentityID from_i_d = 2 [json_name = "fromID"];</code>
   * @return The fromID.
   */
  @Override
  public com.ids.IdentityID getFromID() {
    return fromID_ == null ? com.ids.IdentityID.getDefaultInstance() : fromID_;
  }
  /**
   * <code>.ids.IdentityID from_i_d = 2 [json_name = "fromID"];</code>
   */
  @Override
  public com.ids.IdentityIDOrBuilder getFromIDOrBuilder() {
    return fromID_ == null ? com.ids.IdentityID.getDefaultInstance() : fromID_;
  }

  public static final int TO_I_D_FIELD_NUMBER = 3;
  private com.ids.IdentityID toID_;
  /**
   * <code>.ids.IdentityID to_i_d = 3 [json_name = "toID"];</code>
   * @return Whether the toID field is set.
   */
  @Override
  public boolean hasToID() {
    return toID_ != null;
  }
  /**
   * <code>.ids.IdentityID to_i_d = 3 [json_name = "toID"];</code>
   * @return The toID.
   */
  @Override
  public com.ids.IdentityID getToID() {
    return toID_ == null ? com.ids.IdentityID.getDefaultInstance() : toID_;
  }
  /**
   * <code>.ids.IdentityID to_i_d = 3 [json_name = "toID"];</code>
   */
  @Override
  public com.ids.IdentityIDOrBuilder getToIDOrBuilder() {
    return toID_ == null ? com.ids.IdentityID.getDefaultInstance() : toID_;
  }

  public static final int CLASSIFICATION_I_D_FIELD_NUMBER = 4;
  private com.ids.ClassificationID classificationID_;
  /**
   * <code>.ids.ClassificationID classification_i_d = 4 [json_name = "classificationID"];</code>
   * @return Whether the classificationID field is set.
   */
  @Override
  public boolean hasClassificationID() {
    return classificationID_ != null;
  }
  /**
   * <code>.ids.ClassificationID classification_i_d = 4 [json_name = "classificationID"];</code>
   * @return The classificationID.
   */
  @Override
  public com.ids.ClassificationID getClassificationID() {
    return classificationID_ == null ? com.ids.ClassificationID.getDefaultInstance() : classificationID_;
  }
  /**
   * <code>.ids.ClassificationID classification_i_d = 4 [json_name = "classificationID"];</code>
   */
  @Override
  public com.ids.ClassificationIDOrBuilder getClassificationIDOrBuilder() {
    return classificationID_ == null ? com.ids.ClassificationID.getDefaultInstance() : classificationID_;
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
    if (fromID_ != null) {
      output.writeMessage(2, getFromID());
    }
    if (toID_ != null) {
      output.writeMessage(3, getToID());
    }
    if (classificationID_ != null) {
      output.writeMessage(4, getClassificationID());
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
    if (fromID_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFromID());
    }
    if (toID_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getToID());
    }
    if (classificationID_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getClassificationID());
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
    if (hasFromID() != other.hasFromID()) return false;
    if (hasFromID()) {
      if (!getFromID()
          .equals(other.getFromID())) return false;
    }
    if (hasToID() != other.hasToID()) return false;
    if (hasToID()) {
      if (!getToID()
          .equals(other.getToID())) return false;
    }
    if (hasClassificationID() != other.hasClassificationID()) return false;
    if (hasClassificationID()) {
      if (!getClassificationID()
          .equals(other.getClassificationID())) return false;
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
    if (hasFromID()) {
      hash = (37 * hash) + FROM_I_D_FIELD_NUMBER;
      hash = (53 * hash) + getFromID().hashCode();
    }
    if (hasToID()) {
      hash = (37 * hash) + TO_I_D_FIELD_NUMBER;
      hash = (53 * hash) + getToID().hashCode();
    }
    if (hasClassificationID()) {
      hash = (37 * hash) + CLASSIFICATION_I_D_FIELD_NUMBER;
      hash = (53 * hash) + getClassificationID().hashCode();
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
   * Protobuf type {@code orders.transactions.revoke.Message}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:orders.transactions.revoke.Message)
      MessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MessageV1Proto.internal_static_orders_transactions_revoke_Message_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MessageV1Proto.internal_static_orders_transactions_revoke_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Message.class, Builder.class);
    }

    // Construct using com.orders.transactions.revoke.Message.newBuilder()
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
      fromID_ = null;
      if (fromIDBuilder_ != null) {
        fromIDBuilder_.dispose();
        fromIDBuilder_ = null;
      }
      toID_ = null;
      if (toIDBuilder_ != null) {
        toIDBuilder_.dispose();
        toIDBuilder_ = null;
      }
      classificationID_ = null;
      if (classificationIDBuilder_ != null) {
        classificationIDBuilder_.dispose();
        classificationIDBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return MessageV1Proto.internal_static_orders_transactions_revoke_Message_descriptor;
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
        result.fromID_ = fromIDBuilder_ == null
            ? fromID_
            : fromIDBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.toID_ = toIDBuilder_ == null
            ? toID_
            : toIDBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.classificationID_ = classificationIDBuilder_ == null
            ? classificationID_
            : classificationIDBuilder_.build();
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
      if (other.hasFromID()) {
        mergeFromID(other.getFromID());
      }
      if (other.hasToID()) {
        mergeToID(other.getToID());
      }
      if (other.hasClassificationID()) {
        mergeClassificationID(other.getClassificationID());
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
              input.readMessage(
                  getFromIDFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getToIDFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getClassificationIDFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private com.ids.IdentityID fromID_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ids.IdentityID, com.ids.IdentityID.Builder, com.ids.IdentityIDOrBuilder> fromIDBuilder_;
    /**
     * <code>.ids.IdentityID from_i_d = 2 [json_name = "fromID"];</code>
     * @return Whether the fromID field is set.
     */
    public boolean hasFromID() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.ids.IdentityID from_i_d = 2 [json_name = "fromID"];</code>
     * @return The fromID.
     */
    public com.ids.IdentityID getFromID() {
      if (fromIDBuilder_ == null) {
        return fromID_ == null ? com.ids.IdentityID.getDefaultInstance() : fromID_;
      } else {
        return fromIDBuilder_.getMessage();
      }
    }
    /**
     * <code>.ids.IdentityID from_i_d = 2 [json_name = "fromID"];</code>
     */
    public Builder setFromID(com.ids.IdentityID value) {
      if (fromIDBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fromID_ = value;
      } else {
        fromIDBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.ids.IdentityID from_i_d = 2 [json_name = "fromID"];</code>
     */
    public Builder setFromID(
        com.ids.IdentityID.Builder builderForValue) {
      if (fromIDBuilder_ == null) {
        fromID_ = builderForValue.build();
      } else {
        fromIDBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.ids.IdentityID from_i_d = 2 [json_name = "fromID"];</code>
     */
    public Builder mergeFromID(com.ids.IdentityID value) {
      if (fromIDBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          fromID_ != null &&
          fromID_ != com.ids.IdentityID.getDefaultInstance()) {
          getFromIDBuilder().mergeFrom(value);
        } else {
          fromID_ = value;
        }
      } else {
        fromIDBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.ids.IdentityID from_i_d = 2 [json_name = "fromID"];</code>
     */
    public Builder clearFromID() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fromID_ = null;
      if (fromIDBuilder_ != null) {
        fromIDBuilder_.dispose();
        fromIDBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ids.IdentityID from_i_d = 2 [json_name = "fromID"];</code>
     */
    public com.ids.IdentityID.Builder getFromIDBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFromIDFieldBuilder().getBuilder();
    }
    /**
     * <code>.ids.IdentityID from_i_d = 2 [json_name = "fromID"];</code>
     */
    public com.ids.IdentityIDOrBuilder getFromIDOrBuilder() {
      if (fromIDBuilder_ != null) {
        return fromIDBuilder_.getMessageOrBuilder();
      } else {
        return fromID_ == null ?
            com.ids.IdentityID.getDefaultInstance() : fromID_;
      }
    }
    /**
     * <code>.ids.IdentityID from_i_d = 2 [json_name = "fromID"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ids.IdentityID, com.ids.IdentityID.Builder, com.ids.IdentityIDOrBuilder> 
        getFromIDFieldBuilder() {
      if (fromIDBuilder_ == null) {
        fromIDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ids.IdentityID, com.ids.IdentityID.Builder, com.ids.IdentityIDOrBuilder>(
                getFromID(),
                getParentForChildren(),
                isClean());
        fromID_ = null;
      }
      return fromIDBuilder_;
    }

    private com.ids.IdentityID toID_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ids.IdentityID, com.ids.IdentityID.Builder, com.ids.IdentityIDOrBuilder> toIDBuilder_;
    /**
     * <code>.ids.IdentityID to_i_d = 3 [json_name = "toID"];</code>
     * @return Whether the toID field is set.
     */
    public boolean hasToID() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.ids.IdentityID to_i_d = 3 [json_name = "toID"];</code>
     * @return The toID.
     */
    public com.ids.IdentityID getToID() {
      if (toIDBuilder_ == null) {
        return toID_ == null ? com.ids.IdentityID.getDefaultInstance() : toID_;
      } else {
        return toIDBuilder_.getMessage();
      }
    }
    /**
     * <code>.ids.IdentityID to_i_d = 3 [json_name = "toID"];</code>
     */
    public Builder setToID(com.ids.IdentityID value) {
      if (toIDBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        toID_ = value;
      } else {
        toIDBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ids.IdentityID to_i_d = 3 [json_name = "toID"];</code>
     */
    public Builder setToID(
        com.ids.IdentityID.Builder builderForValue) {
      if (toIDBuilder_ == null) {
        toID_ = builderForValue.build();
      } else {
        toIDBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ids.IdentityID to_i_d = 3 [json_name = "toID"];</code>
     */
    public Builder mergeToID(com.ids.IdentityID value) {
      if (toIDBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          toID_ != null &&
          toID_ != com.ids.IdentityID.getDefaultInstance()) {
          getToIDBuilder().mergeFrom(value);
        } else {
          toID_ = value;
        }
      } else {
        toIDBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ids.IdentityID to_i_d = 3 [json_name = "toID"];</code>
     */
    public Builder clearToID() {
      bitField0_ = (bitField0_ & ~0x00000004);
      toID_ = null;
      if (toIDBuilder_ != null) {
        toIDBuilder_.dispose();
        toIDBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ids.IdentityID to_i_d = 3 [json_name = "toID"];</code>
     */
    public com.ids.IdentityID.Builder getToIDBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getToIDFieldBuilder().getBuilder();
    }
    /**
     * <code>.ids.IdentityID to_i_d = 3 [json_name = "toID"];</code>
     */
    public com.ids.IdentityIDOrBuilder getToIDOrBuilder() {
      if (toIDBuilder_ != null) {
        return toIDBuilder_.getMessageOrBuilder();
      } else {
        return toID_ == null ?
            com.ids.IdentityID.getDefaultInstance() : toID_;
      }
    }
    /**
     * <code>.ids.IdentityID to_i_d = 3 [json_name = "toID"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ids.IdentityID, com.ids.IdentityID.Builder, com.ids.IdentityIDOrBuilder> 
        getToIDFieldBuilder() {
      if (toIDBuilder_ == null) {
        toIDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ids.IdentityID, com.ids.IdentityID.Builder, com.ids.IdentityIDOrBuilder>(
                getToID(),
                getParentForChildren(),
                isClean());
        toID_ = null;
      }
      return toIDBuilder_;
    }

    private com.ids.ClassificationID classificationID_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ids.ClassificationID, com.ids.ClassificationID.Builder, com.ids.ClassificationIDOrBuilder> classificationIDBuilder_;
    /**
     * <code>.ids.ClassificationID classification_i_d = 4 [json_name = "classificationID"];</code>
     * @return Whether the classificationID field is set.
     */
    public boolean hasClassificationID() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.ids.ClassificationID classification_i_d = 4 [json_name = "classificationID"];</code>
     * @return The classificationID.
     */
    public com.ids.ClassificationID getClassificationID() {
      if (classificationIDBuilder_ == null) {
        return classificationID_ == null ? com.ids.ClassificationID.getDefaultInstance() : classificationID_;
      } else {
        return classificationIDBuilder_.getMessage();
      }
    }
    /**
     * <code>.ids.ClassificationID classification_i_d = 4 [json_name = "classificationID"];</code>
     */
    public Builder setClassificationID(com.ids.ClassificationID value) {
      if (classificationIDBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        classificationID_ = value;
      } else {
        classificationIDBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.ids.ClassificationID classification_i_d = 4 [json_name = "classificationID"];</code>
     */
    public Builder setClassificationID(
        com.ids.ClassificationID.Builder builderForValue) {
      if (classificationIDBuilder_ == null) {
        classificationID_ = builderForValue.build();
      } else {
        classificationIDBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.ids.ClassificationID classification_i_d = 4 [json_name = "classificationID"];</code>
     */
    public Builder mergeClassificationID(com.ids.ClassificationID value) {
      if (classificationIDBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          classificationID_ != null &&
          classificationID_ != com.ids.ClassificationID.getDefaultInstance()) {
          getClassificationIDBuilder().mergeFrom(value);
        } else {
          classificationID_ = value;
        }
      } else {
        classificationIDBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.ids.ClassificationID classification_i_d = 4 [json_name = "classificationID"];</code>
     */
    public Builder clearClassificationID() {
      bitField0_ = (bitField0_ & ~0x00000008);
      classificationID_ = null;
      if (classificationIDBuilder_ != null) {
        classificationIDBuilder_.dispose();
        classificationIDBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ids.ClassificationID classification_i_d = 4 [json_name = "classificationID"];</code>
     */
    public com.ids.ClassificationID.Builder getClassificationIDBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getClassificationIDFieldBuilder().getBuilder();
    }
    /**
     * <code>.ids.ClassificationID classification_i_d = 4 [json_name = "classificationID"];</code>
     */
    public com.ids.ClassificationIDOrBuilder getClassificationIDOrBuilder() {
      if (classificationIDBuilder_ != null) {
        return classificationIDBuilder_.getMessageOrBuilder();
      } else {
        return classificationID_ == null ?
            com.ids.ClassificationID.getDefaultInstance() : classificationID_;
      }
    }
    /**
     * <code>.ids.ClassificationID classification_i_d = 4 [json_name = "classificationID"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ids.ClassificationID, com.ids.ClassificationID.Builder, com.ids.ClassificationIDOrBuilder> 
        getClassificationIDFieldBuilder() {
      if (classificationIDBuilder_ == null) {
        classificationIDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ids.ClassificationID, com.ids.ClassificationID.Builder, com.ids.ClassificationIDOrBuilder>(
                getClassificationID(),
                getParentForChildren(),
                isClean());
        classificationID_ = null;
      }
      return classificationIDBuilder_;
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


    // @@protoc_insertion_point(builder_scope:orders.transactions.revoke.Message)
  }

  // @@protoc_insertion_point(class_scope:orders.transactions.revoke.Message)
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

