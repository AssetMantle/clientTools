// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/ids/base/coinID.v1.proto

package com.ids;

/**
 * Protobuf type {@code ids.CoinID}
 */
public final class CoinID extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ids.CoinID)
    CoinIDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CoinID.newBuilder() to construct.
  private CoinID(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CoinID() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CoinID();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ids.CoinIDV1Proto.internal_static_ids_CoinID_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ids.CoinIDV1Proto.internal_static_ids_CoinID_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ids.CoinID.class, com.ids.CoinID.Builder.class);
  }

  public static final int STRING_I_D_FIELD_NUMBER = 1;
  private com.ids.StringID stringID_;
  /**
   * <code>.ids.StringID string_i_d = 1 [json_name = "stringID"];</code>
   * @return Whether the stringID field is set.
   */
  @java.lang.Override
  public boolean hasStringID() {
    return stringID_ != null;
  }
  /**
   * <code>.ids.StringID string_i_d = 1 [json_name = "stringID"];</code>
   * @return The stringID.
   */
  @java.lang.Override
  public com.ids.StringID getStringID() {
    return stringID_ == null ? com.ids.StringID.getDefaultInstance() : stringID_;
  }
  /**
   * <code>.ids.StringID string_i_d = 1 [json_name = "stringID"];</code>
   */
  @java.lang.Override
  public com.ids.StringIDOrBuilder getStringIDOrBuilder() {
    return stringID_ == null ? com.ids.StringID.getDefaultInstance() : stringID_;
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
    if (stringID_ != null) {
      output.writeMessage(1, getStringID());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (stringID_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStringID());
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
    if (!(obj instanceof com.ids.CoinID)) {
      return super.equals(obj);
    }
    com.ids.CoinID other = (com.ids.CoinID) obj;

    if (hasStringID() != other.hasStringID()) return false;
    if (hasStringID()) {
      if (!getStringID()
          .equals(other.getStringID())) return false;
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
    if (hasStringID()) {
      hash = (37 * hash) + STRING_I_D_FIELD_NUMBER;
      hash = (53 * hash) + getStringID().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ids.CoinID parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ids.CoinID parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ids.CoinID parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ids.CoinID parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ids.CoinID parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ids.CoinID parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ids.CoinID parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ids.CoinID parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ids.CoinID parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ids.CoinID parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ids.CoinID parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ids.CoinID parseFrom(
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
  public static Builder newBuilder(com.ids.CoinID prototype) {
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
   * Protobuf type {@code ids.CoinID}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ids.CoinID)
      com.ids.CoinIDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ids.CoinIDV1Proto.internal_static_ids_CoinID_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ids.CoinIDV1Proto.internal_static_ids_CoinID_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ids.CoinID.class, com.ids.CoinID.Builder.class);
    }

    // Construct using com.ids.CoinID.newBuilder()
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
      stringID_ = null;
      if (stringIDBuilder_ != null) {
        stringIDBuilder_.dispose();
        stringIDBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ids.CoinIDV1Proto.internal_static_ids_CoinID_descriptor;
    }

    @java.lang.Override
    public com.ids.CoinID getDefaultInstanceForType() {
      return com.ids.CoinID.getDefaultInstance();
    }

    @java.lang.Override
    public com.ids.CoinID build() {
      com.ids.CoinID result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ids.CoinID buildPartial() {
      com.ids.CoinID result = new com.ids.CoinID(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ids.CoinID result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.stringID_ = stringIDBuilder_ == null
            ? stringID_
            : stringIDBuilder_.build();
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
      if (other instanceof com.ids.CoinID) {
        return mergeFrom((com.ids.CoinID)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ids.CoinID other) {
      if (other == com.ids.CoinID.getDefaultInstance()) return this;
      if (other.hasStringID()) {
        mergeStringID(other.getStringID());
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
              input.readMessage(
                  getStringIDFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.ids.StringID stringID_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ids.StringID, com.ids.StringID.Builder, com.ids.StringIDOrBuilder> stringIDBuilder_;
    /**
     * <code>.ids.StringID string_i_d = 1 [json_name = "stringID"];</code>
     * @return Whether the stringID field is set.
     */
    public boolean hasStringID() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.ids.StringID string_i_d = 1 [json_name = "stringID"];</code>
     * @return The stringID.
     */
    public com.ids.StringID getStringID() {
      if (stringIDBuilder_ == null) {
        return stringID_ == null ? com.ids.StringID.getDefaultInstance() : stringID_;
      } else {
        return stringIDBuilder_.getMessage();
      }
    }
    /**
     * <code>.ids.StringID string_i_d = 1 [json_name = "stringID"];</code>
     */
    public Builder setStringID(com.ids.StringID value) {
      if (stringIDBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        stringID_ = value;
      } else {
        stringIDBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ids.StringID string_i_d = 1 [json_name = "stringID"];</code>
     */
    public Builder setStringID(
        com.ids.StringID.Builder builderForValue) {
      if (stringIDBuilder_ == null) {
        stringID_ = builderForValue.build();
      } else {
        stringIDBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ids.StringID string_i_d = 1 [json_name = "stringID"];</code>
     */
    public Builder mergeStringID(com.ids.StringID value) {
      if (stringIDBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          stringID_ != null &&
          stringID_ != com.ids.StringID.getDefaultInstance()) {
          getStringIDBuilder().mergeFrom(value);
        } else {
          stringID_ = value;
        }
      } else {
        stringIDBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ids.StringID string_i_d = 1 [json_name = "stringID"];</code>
     */
    public Builder clearStringID() {
      bitField0_ = (bitField0_ & ~0x00000001);
      stringID_ = null;
      if (stringIDBuilder_ != null) {
        stringIDBuilder_.dispose();
        stringIDBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ids.StringID string_i_d = 1 [json_name = "stringID"];</code>
     */
    public com.ids.StringID.Builder getStringIDBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getStringIDFieldBuilder().getBuilder();
    }
    /**
     * <code>.ids.StringID string_i_d = 1 [json_name = "stringID"];</code>
     */
    public com.ids.StringIDOrBuilder getStringIDOrBuilder() {
      if (stringIDBuilder_ != null) {
        return stringIDBuilder_.getMessageOrBuilder();
      } else {
        return stringID_ == null ?
            com.ids.StringID.getDefaultInstance() : stringID_;
      }
    }
    /**
     * <code>.ids.StringID string_i_d = 1 [json_name = "stringID"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ids.StringID, com.ids.StringID.Builder, com.ids.StringIDOrBuilder> 
        getStringIDFieldBuilder() {
      if (stringIDBuilder_ == null) {
        stringIDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ids.StringID, com.ids.StringID.Builder, com.ids.StringIDOrBuilder>(
                getStringID(),
                getParentForChildren(),
                isClean());
        stringID_ = null;
      }
      return stringIDBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ids.CoinID)
  }

  // @@protoc_insertion_point(class_scope:ids.CoinID)
  private static final com.ids.CoinID DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ids.CoinID();
  }

  public static com.ids.CoinID getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CoinID>
      PARSER = new com.google.protobuf.AbstractParser<CoinID>() {
    @java.lang.Override
    public CoinID parsePartialFrom(
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

  public static com.google.protobuf.Parser<CoinID> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CoinID> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ids.CoinID getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
