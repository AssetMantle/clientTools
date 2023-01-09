// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/properties/base/metaProperty.v1.proto

package com.properties;

/**
 * Protobuf type {@code properties.MetaProperty}
 */
public final class MetaProperty extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:properties.MetaProperty)
    MetaPropertyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MetaProperty.newBuilder() to construct.
  private MetaProperty(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MetaProperty() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MetaProperty();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.properties.MetaPropertyV1Proto.internal_static_properties_MetaProperty_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.properties.MetaPropertyV1Proto.internal_static_properties_MetaProperty_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.properties.MetaProperty.class, com.properties.MetaProperty.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private com.ids.PropertyID id_;
  /**
   * <code>.ids.PropertyID id = 1 [json_name = "id"];</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return id_ != null;
  }
  /**
   * <code>.ids.PropertyID id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public com.ids.PropertyID getId() {
    return id_ == null ? com.ids.PropertyID.getDefaultInstance() : id_;
  }
  /**
   * <code>.ids.PropertyID id = 1 [json_name = "id"];</code>
   */
  @java.lang.Override
  public com.ids.PropertyIDOrBuilder getIdOrBuilder() {
    return id_ == null ? com.ids.PropertyID.getDefaultInstance() : id_;
  }

  public static final int ANY_DATA_FIELD_NUMBER = 2;
  private com.data.AnyData anyData_;
  /**
   * <code>.data.AnyData any_data = 2 [json_name = "anyData"];</code>
   * @return Whether the anyData field is set.
   */
  @java.lang.Override
  public boolean hasAnyData() {
    return anyData_ != null;
  }
  /**
   * <code>.data.AnyData any_data = 2 [json_name = "anyData"];</code>
   * @return The anyData.
   */
  @java.lang.Override
  public com.data.AnyData getAnyData() {
    return anyData_ == null ? com.data.AnyData.getDefaultInstance() : anyData_;
  }
  /**
   * <code>.data.AnyData any_data = 2 [json_name = "anyData"];</code>
   */
  @java.lang.Override
  public com.data.AnyDataOrBuilder getAnyDataOrBuilder() {
    return anyData_ == null ? com.data.AnyData.getDefaultInstance() : anyData_;
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
    if (id_ != null) {
      output.writeMessage(1, getId());
    }
    if (anyData_ != null) {
      output.writeMessage(2, getAnyData());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getId());
    }
    if (anyData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAnyData());
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
    if (!(obj instanceof com.properties.MetaProperty)) {
      return super.equals(obj);
    }
    com.properties.MetaProperty other = (com.properties.MetaProperty) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId()
          .equals(other.getId())) return false;
    }
    if (hasAnyData() != other.hasAnyData()) return false;
    if (hasAnyData()) {
      if (!getAnyData()
          .equals(other.getAnyData())) return false;
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
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
    }
    if (hasAnyData()) {
      hash = (37 * hash) + ANY_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getAnyData().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.properties.MetaProperty parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.properties.MetaProperty parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.properties.MetaProperty parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.properties.MetaProperty parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.properties.MetaProperty parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.properties.MetaProperty parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.properties.MetaProperty parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.properties.MetaProperty parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.properties.MetaProperty parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.properties.MetaProperty parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.properties.MetaProperty parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.properties.MetaProperty parseFrom(
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
  public static Builder newBuilder(com.properties.MetaProperty prototype) {
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
   * Protobuf type {@code properties.MetaProperty}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:properties.MetaProperty)
      com.properties.MetaPropertyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.properties.MetaPropertyV1Proto.internal_static_properties_MetaProperty_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.properties.MetaPropertyV1Proto.internal_static_properties_MetaProperty_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.properties.MetaProperty.class, com.properties.MetaProperty.Builder.class);
    }

    // Construct using com.properties.MetaProperty.newBuilder()
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
      id_ = null;
      if (idBuilder_ != null) {
        idBuilder_.dispose();
        idBuilder_ = null;
      }
      anyData_ = null;
      if (anyDataBuilder_ != null) {
        anyDataBuilder_.dispose();
        anyDataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.properties.MetaPropertyV1Proto.internal_static_properties_MetaProperty_descriptor;
    }

    @java.lang.Override
    public com.properties.MetaProperty getDefaultInstanceForType() {
      return com.properties.MetaProperty.getDefaultInstance();
    }

    @java.lang.Override
    public com.properties.MetaProperty build() {
      com.properties.MetaProperty result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.properties.MetaProperty buildPartial() {
      com.properties.MetaProperty result = new com.properties.MetaProperty(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.properties.MetaProperty result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = idBuilder_ == null
            ? id_
            : idBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.anyData_ = anyDataBuilder_ == null
            ? anyData_
            : anyDataBuilder_.build();
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
      if (other instanceof com.properties.MetaProperty) {
        return mergeFrom((com.properties.MetaProperty)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.properties.MetaProperty other) {
      if (other == com.properties.MetaProperty.getDefaultInstance()) return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (other.hasAnyData()) {
        mergeAnyData(other.getAnyData());
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
                  getIdFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAnyDataFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
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

    private com.ids.PropertyID id_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ids.PropertyID, com.ids.PropertyID.Builder, com.ids.PropertyIDOrBuilder> idBuilder_;
    /**
     * <code>.ids.PropertyID id = 1 [json_name = "id"];</code>
     * @return Whether the id field is set.
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.ids.PropertyID id = 1 [json_name = "id"];</code>
     * @return The id.
     */
    public com.ids.PropertyID getId() {
      if (idBuilder_ == null) {
        return id_ == null ? com.ids.PropertyID.getDefaultInstance() : id_;
      } else {
        return idBuilder_.getMessage();
      }
    }
    /**
     * <code>.ids.PropertyID id = 1 [json_name = "id"];</code>
     */
    public Builder setId(com.ids.PropertyID value) {
      if (idBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        id_ = value;
      } else {
        idBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ids.PropertyID id = 1 [json_name = "id"];</code>
     */
    public Builder setId(
        com.ids.PropertyID.Builder builderForValue) {
      if (idBuilder_ == null) {
        id_ = builderForValue.build();
      } else {
        idBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ids.PropertyID id = 1 [json_name = "id"];</code>
     */
    public Builder mergeId(com.ids.PropertyID value) {
      if (idBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          id_ != null &&
          id_ != com.ids.PropertyID.getDefaultInstance()) {
          getIdBuilder().mergeFrom(value);
        } else {
          id_ = value;
        }
      } else {
        idBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ids.PropertyID id = 1 [json_name = "id"];</code>
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = null;
      if (idBuilder_ != null) {
        idBuilder_.dispose();
        idBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ids.PropertyID id = 1 [json_name = "id"];</code>
     */
    public com.ids.PropertyID.Builder getIdBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.ids.PropertyID id = 1 [json_name = "id"];</code>
     */
    public com.ids.PropertyIDOrBuilder getIdOrBuilder() {
      if (idBuilder_ != null) {
        return idBuilder_.getMessageOrBuilder();
      } else {
        return id_ == null ?
            com.ids.PropertyID.getDefaultInstance() : id_;
      }
    }
    /**
     * <code>.ids.PropertyID id = 1 [json_name = "id"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ids.PropertyID, com.ids.PropertyID.Builder, com.ids.PropertyIDOrBuilder> 
        getIdFieldBuilder() {
      if (idBuilder_ == null) {
        idBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ids.PropertyID, com.ids.PropertyID.Builder, com.ids.PropertyIDOrBuilder>(
                getId(),
                getParentForChildren(),
                isClean());
        id_ = null;
      }
      return idBuilder_;
    }

    private com.data.AnyData anyData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.data.AnyData, com.data.AnyData.Builder, com.data.AnyDataOrBuilder> anyDataBuilder_;
    /**
     * <code>.data.AnyData any_data = 2 [json_name = "anyData"];</code>
     * @return Whether the anyData field is set.
     */
    public boolean hasAnyData() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.data.AnyData any_data = 2 [json_name = "anyData"];</code>
     * @return The anyData.
     */
    public com.data.AnyData getAnyData() {
      if (anyDataBuilder_ == null) {
        return anyData_ == null ? com.data.AnyData.getDefaultInstance() : anyData_;
      } else {
        return anyDataBuilder_.getMessage();
      }
    }
    /**
     * <code>.data.AnyData any_data = 2 [json_name = "anyData"];</code>
     */
    public Builder setAnyData(com.data.AnyData value) {
      if (anyDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        anyData_ = value;
      } else {
        anyDataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.data.AnyData any_data = 2 [json_name = "anyData"];</code>
     */
    public Builder setAnyData(
        com.data.AnyData.Builder builderForValue) {
      if (anyDataBuilder_ == null) {
        anyData_ = builderForValue.build();
      } else {
        anyDataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.data.AnyData any_data = 2 [json_name = "anyData"];</code>
     */
    public Builder mergeAnyData(com.data.AnyData value) {
      if (anyDataBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          anyData_ != null &&
          anyData_ != com.data.AnyData.getDefaultInstance()) {
          getAnyDataBuilder().mergeFrom(value);
        } else {
          anyData_ = value;
        }
      } else {
        anyDataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.data.AnyData any_data = 2 [json_name = "anyData"];</code>
     */
    public Builder clearAnyData() {
      bitField0_ = (bitField0_ & ~0x00000002);
      anyData_ = null;
      if (anyDataBuilder_ != null) {
        anyDataBuilder_.dispose();
        anyDataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.data.AnyData any_data = 2 [json_name = "anyData"];</code>
     */
    public com.data.AnyData.Builder getAnyDataBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAnyDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.data.AnyData any_data = 2 [json_name = "anyData"];</code>
     */
    public com.data.AnyDataOrBuilder getAnyDataOrBuilder() {
      if (anyDataBuilder_ != null) {
        return anyDataBuilder_.getMessageOrBuilder();
      } else {
        return anyData_ == null ?
            com.data.AnyData.getDefaultInstance() : anyData_;
      }
    }
    /**
     * <code>.data.AnyData any_data = 2 [json_name = "anyData"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.data.AnyData, com.data.AnyData.Builder, com.data.AnyDataOrBuilder> 
        getAnyDataFieldBuilder() {
      if (anyDataBuilder_ == null) {
        anyDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.data.AnyData, com.data.AnyData.Builder, com.data.AnyDataOrBuilder>(
                getAnyData(),
                getParentForChildren(),
                isClean());
        anyData_ = null;
      }
      return anyDataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:properties.MetaProperty)
  }

  // @@protoc_insertion_point(class_scope:properties.MetaProperty)
  private static final com.properties.MetaProperty DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.properties.MetaProperty();
  }

  public static com.properties.MetaProperty getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetaProperty>
      PARSER = new com.google.protobuf.AbstractParser<MetaProperty>() {
    @java.lang.Override
    public MetaProperty parsePartialFrom(
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

  public static com.google.protobuf.Parser<MetaProperty> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetaProperty> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.properties.MetaProperty getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

