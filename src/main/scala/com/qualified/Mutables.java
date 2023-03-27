// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/qualified/base/mutables.v1.proto

package com.qualified;

/**
 * Protobuf type {@code qualified.Mutables}
 */
public final class Mutables extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:qualified.Mutables)
    MutablesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Mutables.newBuilder() to construct.
  private Mutables(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Mutables() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new Mutables();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return MutablesV1Proto.internal_static_qualified_Mutables_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return MutablesV1Proto.internal_static_qualified_Mutables_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Mutables.class, Builder.class);
  }

  public static final int PROPERTY_LIST_FIELD_NUMBER = 1;
  private com.lists.PropertyList propertyList_;
  /**
   * <code>.lists.PropertyList property_list = 1 [json_name = "propertyList"];</code>
   * @return Whether the propertyList field is set.
   */
  @Override
  public boolean hasPropertyList() {
    return propertyList_ != null;
  }
  /**
   * <code>.lists.PropertyList property_list = 1 [json_name = "propertyList"];</code>
   * @return The propertyList.
   */
  @Override
  public com.lists.PropertyList getPropertyList() {
    return propertyList_ == null ? com.lists.PropertyList.getDefaultInstance() : propertyList_;
  }
  /**
   * <code>.lists.PropertyList property_list = 1 [json_name = "propertyList"];</code>
   */
  @Override
  public com.lists.PropertyListOrBuilder getPropertyListOrBuilder() {
    return propertyList_ == null ? com.lists.PropertyList.getDefaultInstance() : propertyList_;
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
    if (propertyList_ != null) {
      output.writeMessage(1, getPropertyList());
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (propertyList_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPropertyList());
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
    if (!(obj instanceof Mutables)) {
      return super.equals(obj);
    }
    Mutables other = (Mutables) obj;

    if (hasPropertyList() != other.hasPropertyList()) return false;
    if (hasPropertyList()) {
      if (!getPropertyList()
          .equals(other.getPropertyList())) return false;
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
    if (hasPropertyList()) {
      hash = (37 * hash) + PROPERTY_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getPropertyList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Mutables parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Mutables parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Mutables parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Mutables parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Mutables parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Mutables parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Mutables parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Mutables parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Mutables parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Mutables parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Mutables parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Mutables parseFrom(
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
  public static Builder newBuilder(Mutables prototype) {
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
   * Protobuf type {@code qualified.Mutables}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:qualified.Mutables)
      MutablesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MutablesV1Proto.internal_static_qualified_Mutables_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MutablesV1Proto.internal_static_qualified_Mutables_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Mutables.class, Builder.class);
    }

    // Construct using com.qualified.Mutables.newBuilder()
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
      propertyList_ = null;
      if (propertyListBuilder_ != null) {
        propertyListBuilder_.dispose();
        propertyListBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return MutablesV1Proto.internal_static_qualified_Mutables_descriptor;
    }

    @Override
    public Mutables getDefaultInstanceForType() {
      return Mutables.getDefaultInstance();
    }

    @Override
    public Mutables build() {
      Mutables result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Mutables buildPartial() {
      Mutables result = new Mutables(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(Mutables result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.propertyList_ = propertyListBuilder_ == null
            ? propertyList_
            : propertyListBuilder_.build();
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
      if (other instanceof Mutables) {
        return mergeFrom((Mutables)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Mutables other) {
      if (other == Mutables.getDefaultInstance()) return this;
      if (other.hasPropertyList()) {
        mergePropertyList(other.getPropertyList());
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
              input.readMessage(
                  getPropertyListFieldBuilder().getBuilder(),
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

    private com.lists.PropertyList propertyList_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.lists.PropertyList, com.lists.PropertyList.Builder, com.lists.PropertyListOrBuilder> propertyListBuilder_;
    /**
     * <code>.lists.PropertyList property_list = 1 [json_name = "propertyList"];</code>
     * @return Whether the propertyList field is set.
     */
    public boolean hasPropertyList() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.lists.PropertyList property_list = 1 [json_name = "propertyList"];</code>
     * @return The propertyList.
     */
    public com.lists.PropertyList getPropertyList() {
      if (propertyListBuilder_ == null) {
        return propertyList_ == null ? com.lists.PropertyList.getDefaultInstance() : propertyList_;
      } else {
        return propertyListBuilder_.getMessage();
      }
    }
    /**
     * <code>.lists.PropertyList property_list = 1 [json_name = "propertyList"];</code>
     */
    public Builder setPropertyList(com.lists.PropertyList value) {
      if (propertyListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        propertyList_ = value;
      } else {
        propertyListBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.lists.PropertyList property_list = 1 [json_name = "propertyList"];</code>
     */
    public Builder setPropertyList(
        com.lists.PropertyList.Builder builderForValue) {
      if (propertyListBuilder_ == null) {
        propertyList_ = builderForValue.build();
      } else {
        propertyListBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.lists.PropertyList property_list = 1 [json_name = "propertyList"];</code>
     */
    public Builder mergePropertyList(com.lists.PropertyList value) {
      if (propertyListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          propertyList_ != null &&
          propertyList_ != com.lists.PropertyList.getDefaultInstance()) {
          getPropertyListBuilder().mergeFrom(value);
        } else {
          propertyList_ = value;
        }
      } else {
        propertyListBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.lists.PropertyList property_list = 1 [json_name = "propertyList"];</code>
     */
    public Builder clearPropertyList() {
      bitField0_ = (bitField0_ & ~0x00000001);
      propertyList_ = null;
      if (propertyListBuilder_ != null) {
        propertyListBuilder_.dispose();
        propertyListBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.lists.PropertyList property_list = 1 [json_name = "propertyList"];</code>
     */
    public com.lists.PropertyList.Builder getPropertyListBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPropertyListFieldBuilder().getBuilder();
    }
    /**
     * <code>.lists.PropertyList property_list = 1 [json_name = "propertyList"];</code>
     */
    public com.lists.PropertyListOrBuilder getPropertyListOrBuilder() {
      if (propertyListBuilder_ != null) {
        return propertyListBuilder_.getMessageOrBuilder();
      } else {
        return propertyList_ == null ?
            com.lists.PropertyList.getDefaultInstance() : propertyList_;
      }
    }
    /**
     * <code>.lists.PropertyList property_list = 1 [json_name = "propertyList"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.lists.PropertyList, com.lists.PropertyList.Builder, com.lists.PropertyListOrBuilder> 
        getPropertyListFieldBuilder() {
      if (propertyListBuilder_ == null) {
        propertyListBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.lists.PropertyList, com.lists.PropertyList.Builder, com.lists.PropertyListOrBuilder>(
                getPropertyList(),
                getParentForChildren(),
                isClean());
        propertyList_ = null;
      }
      return propertyListBuilder_;
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


    // @@protoc_insertion_point(builder_scope:qualified.Mutables)
  }

  // @@protoc_insertion_point(class_scope:qualified.Mutables)
  private static final Mutables DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Mutables();
  }

  public static Mutables getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Mutables>
      PARSER = new com.google.protobuf.AbstractParser<Mutables>() {
    @Override
    public Mutables parsePartialFrom(
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

  public static com.google.protobuf.Parser<Mutables> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Mutables> getParserForType() {
    return PARSER;
  }

  @Override
  public Mutables getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

