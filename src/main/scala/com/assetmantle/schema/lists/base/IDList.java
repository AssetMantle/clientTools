// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lists/base/id_list.proto

package com.assetmantle.schema.lists.base;

/**
 * Protobuf type {@code assetmantle.schema.lists.base.IDList}
 */
public final class IDList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:assetmantle.schema.lists.base.IDList)
    IDListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IDList.newBuilder() to construct.
  private IDList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IDList() {
    anyIDs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IDList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.assetmantle.schema.lists.base.IdListProto.internal_static_assetmantle_schema_lists_base_IDList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.assetmantle.schema.lists.base.IdListProto.internal_static_assetmantle_schema_lists_base_IDList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.assetmantle.schema.lists.base.IDList.class, com.assetmantle.schema.lists.base.IDList.Builder.class);
  }

  public static final int ANY_I_DS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.assetmantle.schema.ids.base.AnyID> anyIDs_;
  /**
   * <code>repeated .assetmantle.schema.ids.base.AnyID any_i_ds = 1 [json_name = "anyIDs"];</code>
   */
  @java.lang.Override
  public java.util.List<com.assetmantle.schema.ids.base.AnyID> getAnyIDsList() {
    return anyIDs_;
  }
  /**
   * <code>repeated .assetmantle.schema.ids.base.AnyID any_i_ds = 1 [json_name = "anyIDs"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.assetmantle.schema.ids.base.AnyIDOrBuilder> 
      getAnyIDsOrBuilderList() {
    return anyIDs_;
  }
  /**
   * <code>repeated .assetmantle.schema.ids.base.AnyID any_i_ds = 1 [json_name = "anyIDs"];</code>
   */
  @java.lang.Override
  public int getAnyIDsCount() {
    return anyIDs_.size();
  }
  /**
   * <code>repeated .assetmantle.schema.ids.base.AnyID any_i_ds = 1 [json_name = "anyIDs"];</code>
   */
  @java.lang.Override
  public com.assetmantle.schema.ids.base.AnyID getAnyIDs(int index) {
    return anyIDs_.get(index);
  }
  /**
   * <code>repeated .assetmantle.schema.ids.base.AnyID any_i_ds = 1 [json_name = "anyIDs"];</code>
   */
  @java.lang.Override
  public com.assetmantle.schema.ids.base.AnyIDOrBuilder getAnyIDsOrBuilder(
      int index) {
    return anyIDs_.get(index);
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
    for (int i = 0; i < anyIDs_.size(); i++) {
      output.writeMessage(1, anyIDs_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < anyIDs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, anyIDs_.get(i));
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
    if (!(obj instanceof com.assetmantle.schema.lists.base.IDList)) {
      return super.equals(obj);
    }
    com.assetmantle.schema.lists.base.IDList other = (com.assetmantle.schema.lists.base.IDList) obj;

    if (!getAnyIDsList()
        .equals(other.getAnyIDsList())) return false;
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
    if (getAnyIDsCount() > 0) {
      hash = (37 * hash) + ANY_I_DS_FIELD_NUMBER;
      hash = (53 * hash) + getAnyIDsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.assetmantle.schema.lists.base.IDList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.assetmantle.schema.lists.base.IDList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.assetmantle.schema.lists.base.IDList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.assetmantle.schema.lists.base.IDList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.assetmantle.schema.lists.base.IDList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.assetmantle.schema.lists.base.IDList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.assetmantle.schema.lists.base.IDList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.assetmantle.schema.lists.base.IDList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.assetmantle.schema.lists.base.IDList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.assetmantle.schema.lists.base.IDList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.assetmantle.schema.lists.base.IDList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.assetmantle.schema.lists.base.IDList parseFrom(
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
  public static Builder newBuilder(com.assetmantle.schema.lists.base.IDList prototype) {
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
   * Protobuf type {@code assetmantle.schema.lists.base.IDList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:assetmantle.schema.lists.base.IDList)
      com.assetmantle.schema.lists.base.IDListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.assetmantle.schema.lists.base.IdListProto.internal_static_assetmantle_schema_lists_base_IDList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.assetmantle.schema.lists.base.IdListProto.internal_static_assetmantle_schema_lists_base_IDList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.assetmantle.schema.lists.base.IDList.class, com.assetmantle.schema.lists.base.IDList.Builder.class);
    }

    // Construct using com.assetmantle.schema.lists.base.IDList.newBuilder()
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
      if (anyIDsBuilder_ == null) {
        anyIDs_ = java.util.Collections.emptyList();
      } else {
        anyIDs_ = null;
        anyIDsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.assetmantle.schema.lists.base.IdListProto.internal_static_assetmantle_schema_lists_base_IDList_descriptor;
    }

    @java.lang.Override
    public com.assetmantle.schema.lists.base.IDList getDefaultInstanceForType() {
      return com.assetmantle.schema.lists.base.IDList.getDefaultInstance();
    }

    @java.lang.Override
    public com.assetmantle.schema.lists.base.IDList build() {
      com.assetmantle.schema.lists.base.IDList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.assetmantle.schema.lists.base.IDList buildPartial() {
      com.assetmantle.schema.lists.base.IDList result = new com.assetmantle.schema.lists.base.IDList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.assetmantle.schema.lists.base.IDList result) {
      if (anyIDsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          anyIDs_ = java.util.Collections.unmodifiableList(anyIDs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.anyIDs_ = anyIDs_;
      } else {
        result.anyIDs_ = anyIDsBuilder_.build();
      }
    }

    private void buildPartial0(com.assetmantle.schema.lists.base.IDList result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.assetmantle.schema.lists.base.IDList) {
        return mergeFrom((com.assetmantle.schema.lists.base.IDList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.assetmantle.schema.lists.base.IDList other) {
      if (other == com.assetmantle.schema.lists.base.IDList.getDefaultInstance()) return this;
      if (anyIDsBuilder_ == null) {
        if (!other.anyIDs_.isEmpty()) {
          if (anyIDs_.isEmpty()) {
            anyIDs_ = other.anyIDs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAnyIDsIsMutable();
            anyIDs_.addAll(other.anyIDs_);
          }
          onChanged();
        }
      } else {
        if (!other.anyIDs_.isEmpty()) {
          if (anyIDsBuilder_.isEmpty()) {
            anyIDsBuilder_.dispose();
            anyIDsBuilder_ = null;
            anyIDs_ = other.anyIDs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            anyIDsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAnyIDsFieldBuilder() : null;
          } else {
            anyIDsBuilder_.addAllMessages(other.anyIDs_);
          }
        }
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
              com.assetmantle.schema.ids.base.AnyID m =
                  input.readMessage(
                      com.assetmantle.schema.ids.base.AnyID.parser(),
                      extensionRegistry);
              if (anyIDsBuilder_ == null) {
                ensureAnyIDsIsMutable();
                anyIDs_.add(m);
              } else {
                anyIDsBuilder_.addMessage(m);
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

    private java.util.List<com.assetmantle.schema.ids.base.AnyID> anyIDs_ =
      java.util.Collections.emptyList();
    private void ensureAnyIDsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        anyIDs_ = new java.util.ArrayList<com.assetmantle.schema.ids.base.AnyID>(anyIDs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.assetmantle.schema.ids.base.AnyID, com.assetmantle.schema.ids.base.AnyID.Builder, com.assetmantle.schema.ids.base.AnyIDOrBuilder> anyIDsBuilder_;

    /**
     * <code>repeated .assetmantle.schema.ids.base.AnyID any_i_ds = 1 [json_name = "anyIDs"];</code>
     */
    public java.util.List<com.assetmantle.schema.ids.base.AnyID> getAnyIDsList() {
      if (anyIDsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(anyIDs_);
      } else {
        return anyIDsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .assetmantle.schema.ids.base.AnyID any_i_ds = 1 [json_name = "anyIDs"];</code>
     */
    public int getAnyIDsCount() {
      if (anyIDsBuilder_ == null) {
        return anyIDs_.size();
      } else {
        return anyIDsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .assetmantle.schema.ids.base.AnyID any_i_ds = 1 [json_name = "anyIDs"];</code>
     */
    public com.assetmantle.schema.ids.base.AnyID getAnyIDs(int index) {
      if (anyIDsBuilder_ == null) {
        return anyIDs_.get(index);
      } else {
        return anyIDsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .assetmantle.schema.ids.base.AnyID any_i_ds = 1 [json_name = "anyIDs"];</code>
     */
    public Builder setAnyIDs(
        int index, com.assetmantle.schema.ids.base.AnyID value) {
      if (anyIDsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnyIDsIsMutable();
        anyIDs_.set(index, value);
        onChanged();
      } else {
        anyIDsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .assetmantle.schema.ids.base.AnyID any_i_ds = 1 [json_name = "anyIDs"];</code>
     */
    public Builder setAnyIDs(
        int index, com.assetmantle.schema.ids.base.AnyID.Builder builderForValue) {
      if (anyIDsBuilder_ == null) {
        ensureAnyIDsIsMutable();
        anyIDs_.set(index, builderForValue.build());
        onChanged();
      } else {
        anyIDsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .assetmantle.schema.ids.base.AnyID any_i_ds = 1 [json_name = "anyIDs"];</code>
     */
    public Builder addAnyIDs(com.assetmantle.schema.ids.base.AnyID value) {
      if (anyIDsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnyIDsIsMutable();
        anyIDs_.add(value);
        onChanged();
      } else {
        anyIDsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .assetmantle.schema.ids.base.AnyID any_i_ds = 1 [json_name = "anyIDs"];</code>
     */
    public Builder addAnyIDs(
        int index, com.assetmantle.schema.ids.base.AnyID value) {
      if (anyIDsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnyIDsIsMutable();
        anyIDs_.add(index, value);
        onChanged();
      } else {
        anyIDsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .assetmantle.schema.ids.base.AnyID any_i_ds = 1 [json_name = "anyIDs"];</code>
     */
    public Builder addAnyIDs(
        com.assetmantle.schema.ids.base.AnyID.Builder builderForValue) {
      if (anyIDsBuilder_ == null) {
        ensureAnyIDsIsMutable();
        anyIDs_.add(builderForValue.build());
        onChanged();
      } else {
        anyIDsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .assetmantle.schema.ids.base.AnyID any_i_ds = 1 [json_name = "anyIDs"];</code>
     */
    public Builder addAnyIDs(
        int index, com.assetmantle.schema.ids.base.AnyID.Builder builderForValue) {
      if (anyIDsBuilder_ == null) {
        ensureAnyIDsIsMutable();
        anyIDs_.add(index, builderForValue.build());
        onChanged();
      } else {
        anyIDsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .assetmantle.schema.ids.base.AnyID any_i_ds = 1 [json_name = "anyIDs"];</code>
     */
    public Builder addAllAnyIDs(
        java.lang.Iterable<? extends com.assetmantle.schema.ids.base.AnyID> values) {
      if (anyIDsBuilder_ == null) {
        ensureAnyIDsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, anyIDs_);
        onChanged();
      } else {
        anyIDsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .assetmantle.schema.ids.base.AnyID any_i_ds = 1 [json_name = "anyIDs"];</code>
     */
    public Builder clearAnyIDs() {
      if (anyIDsBuilder_ == null) {
        anyIDs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        anyIDsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .assetmantle.schema.ids.base.AnyID any_i_ds = 1 [json_name = "anyIDs"];</code>
     */
    public Builder removeAnyIDs(int index) {
      if (anyIDsBuilder_ == null) {
        ensureAnyIDsIsMutable();
        anyIDs_.remove(index);
        onChanged();
      } else {
        anyIDsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .assetmantle.schema.ids.base.AnyID any_i_ds = 1 [json_name = "anyIDs"];</code>
     */
    public com.assetmantle.schema.ids.base.AnyID.Builder getAnyIDsBuilder(
        int index) {
      return getAnyIDsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .assetmantle.schema.ids.base.AnyID any_i_ds = 1 [json_name = "anyIDs"];</code>
     */
    public com.assetmantle.schema.ids.base.AnyIDOrBuilder getAnyIDsOrBuilder(
        int index) {
      if (anyIDsBuilder_ == null) {
        return anyIDs_.get(index);  } else {
        return anyIDsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .assetmantle.schema.ids.base.AnyID any_i_ds = 1 [json_name = "anyIDs"];</code>
     */
    public java.util.List<? extends com.assetmantle.schema.ids.base.AnyIDOrBuilder> 
         getAnyIDsOrBuilderList() {
      if (anyIDsBuilder_ != null) {
        return anyIDsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(anyIDs_);
      }
    }
    /**
     * <code>repeated .assetmantle.schema.ids.base.AnyID any_i_ds = 1 [json_name = "anyIDs"];</code>
     */
    public com.assetmantle.schema.ids.base.AnyID.Builder addAnyIDsBuilder() {
      return getAnyIDsFieldBuilder().addBuilder(
          com.assetmantle.schema.ids.base.AnyID.getDefaultInstance());
    }
    /**
     * <code>repeated .assetmantle.schema.ids.base.AnyID any_i_ds = 1 [json_name = "anyIDs"];</code>
     */
    public com.assetmantle.schema.ids.base.AnyID.Builder addAnyIDsBuilder(
        int index) {
      return getAnyIDsFieldBuilder().addBuilder(
          index, com.assetmantle.schema.ids.base.AnyID.getDefaultInstance());
    }
    /**
     * <code>repeated .assetmantle.schema.ids.base.AnyID any_i_ds = 1 [json_name = "anyIDs"];</code>
     */
    public java.util.List<com.assetmantle.schema.ids.base.AnyID.Builder> 
         getAnyIDsBuilderList() {
      return getAnyIDsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.assetmantle.schema.ids.base.AnyID, com.assetmantle.schema.ids.base.AnyID.Builder, com.assetmantle.schema.ids.base.AnyIDOrBuilder> 
        getAnyIDsFieldBuilder() {
      if (anyIDsBuilder_ == null) {
        anyIDsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.assetmantle.schema.ids.base.AnyID, com.assetmantle.schema.ids.base.AnyID.Builder, com.assetmantle.schema.ids.base.AnyIDOrBuilder>(
                anyIDs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        anyIDs_ = null;
      }
      return anyIDsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:assetmantle.schema.lists.base.IDList)
  }

  // @@protoc_insertion_point(class_scope:assetmantle.schema.lists.base.IDList)
  private static final com.assetmantle.schema.lists.base.IDList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.assetmantle.schema.lists.base.IDList();
  }

  public static com.assetmantle.schema.lists.base.IDList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IDList>
      PARSER = new com.google.protobuf.AbstractParser<IDList>() {
    @java.lang.Override
    public IDList parsePartialFrom(
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

  public static com.google.protobuf.Parser<IDList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IDList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.assetmantle.schema.lists.base.IDList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

