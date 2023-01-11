// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/metas/internal/queries/meta/queryResponse.v1.proto

package com.metas.queries.meta;

/**
 * Protobuf type {@code metas.queries.meta.QueryResponse}
 */
public final class QueryResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:metas.queries.meta.QueryResponse)
    QueryResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryResponse.newBuilder() to construct.
  private QueryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryResponse() {
    error_ = "";
    list_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.metas.queries.meta.QueryResponseV1Proto.internal_static_metas_queries_meta_QueryResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.metas.queries.meta.QueryResponseV1Proto.internal_static_metas_queries_meta_QueryResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.metas.queries.meta.QueryResponse.class, com.metas.queries.meta.QueryResponse.Builder.class);
  }

  public static final int SUCCESS_FIELD_NUMBER = 1;
  private boolean success_;
  /**
   * <code>bool success = 1 [json_name = "success"];</code>
   * @return The success.
   */
  @java.lang.Override
  public boolean getSuccess() {
    return success_;
  }

  public static final int ERROR_FIELD_NUMBER = 2;
  private volatile java.lang.Object error_;
  /**
   * <code>string error = 2 [json_name = "error"];</code>
   * @return The error.
   */
  @java.lang.Override
  public java.lang.String getError() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      error_ = s;
      return s;
    }
  }
  /**
   * <code>string error = 2 [json_name = "error"];</code>
   * @return The bytes for error.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getErrorBytes() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      error_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LIST_FIELD_NUMBER = 3;
  private java.util.List<com.metas.Mappable> list_;
  /**
   * <code>repeated .metas.Mappable list = 3 [json_name = "list"];</code>
   */
  @java.lang.Override
  public java.util.List<com.metas.Mappable> getListList() {
    return list_;
  }
  /**
   * <code>repeated .metas.Mappable list = 3 [json_name = "list"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.metas.MappableOrBuilder> 
      getListOrBuilderList() {
    return list_;
  }
  /**
   * <code>repeated .metas.Mappable list = 3 [json_name = "list"];</code>
   */
  @java.lang.Override
  public int getListCount() {
    return list_.size();
  }
  /**
   * <code>repeated .metas.Mappable list = 3 [json_name = "list"];</code>
   */
  @java.lang.Override
  public com.metas.Mappable getList(int index) {
    return list_.get(index);
  }
  /**
   * <code>repeated .metas.Mappable list = 3 [json_name = "list"];</code>
   */
  @java.lang.Override
  public com.metas.MappableOrBuilder getListOrBuilder(
      int index) {
    return list_.get(index);
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
    if (success_ != false) {
      output.writeBool(1, success_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(error_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, error_);
    }
    for (int i = 0; i < list_.size(); i++) {
      output.writeMessage(3, list_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (success_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, success_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(error_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, error_);
    }
    for (int i = 0; i < list_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, list_.get(i));
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
    if (!(obj instanceof com.metas.queries.meta.QueryResponse)) {
      return super.equals(obj);
    }
    com.metas.queries.meta.QueryResponse other = (com.metas.queries.meta.QueryResponse) obj;

    if (getSuccess()
        != other.getSuccess()) return false;
    if (!getError()
        .equals(other.getError())) return false;
    if (!getListList()
        .equals(other.getListList())) return false;
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
    hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSuccess());
    hash = (37 * hash) + ERROR_FIELD_NUMBER;
    hash = (53 * hash) + getError().hashCode();
    if (getListCount() > 0) {
      hash = (37 * hash) + LIST_FIELD_NUMBER;
      hash = (53 * hash) + getListList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.metas.queries.meta.QueryResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.metas.queries.meta.QueryResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.metas.queries.meta.QueryResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.metas.queries.meta.QueryResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.metas.queries.meta.QueryResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.metas.queries.meta.QueryResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.metas.queries.meta.QueryResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.metas.queries.meta.QueryResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.metas.queries.meta.QueryResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.metas.queries.meta.QueryResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.metas.queries.meta.QueryResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.metas.queries.meta.QueryResponse parseFrom(
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
  public static Builder newBuilder(com.metas.queries.meta.QueryResponse prototype) {
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
   * Protobuf type {@code metas.queries.meta.QueryResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:metas.queries.meta.QueryResponse)
      com.metas.queries.meta.QueryResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.metas.queries.meta.QueryResponseV1Proto.internal_static_metas_queries_meta_QueryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.metas.queries.meta.QueryResponseV1Proto.internal_static_metas_queries_meta_QueryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.metas.queries.meta.QueryResponse.class, com.metas.queries.meta.QueryResponse.Builder.class);
    }

    // Construct using com.metas.queries.meta.QueryResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      success_ = false;

      error_ = "";

      if (listBuilder_ == null) {
        list_ = java.util.Collections.emptyList();
      } else {
        list_ = null;
        listBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.metas.queries.meta.QueryResponseV1Proto.internal_static_metas_queries_meta_QueryResponse_descriptor;
    }

    @java.lang.Override
    public com.metas.queries.meta.QueryResponse getDefaultInstanceForType() {
      return com.metas.queries.meta.QueryResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.metas.queries.meta.QueryResponse build() {
      com.metas.queries.meta.QueryResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.metas.queries.meta.QueryResponse buildPartial() {
      com.metas.queries.meta.QueryResponse result = new com.metas.queries.meta.QueryResponse(this);
      int from_bitField0_ = bitField0_;
      result.success_ = success_;
      result.error_ = error_;
      if (listBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          list_ = java.util.Collections.unmodifiableList(list_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.list_ = list_;
      } else {
        result.list_ = listBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof com.metas.queries.meta.QueryResponse) {
        return mergeFrom((com.metas.queries.meta.QueryResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.metas.queries.meta.QueryResponse other) {
      if (other == com.metas.queries.meta.QueryResponse.getDefaultInstance()) return this;
      if (other.getSuccess() != false) {
        setSuccess(other.getSuccess());
      }
      if (!other.getError().isEmpty()) {
        error_ = other.error_;
        onChanged();
      }
      if (listBuilder_ == null) {
        if (!other.list_.isEmpty()) {
          if (list_.isEmpty()) {
            list_ = other.list_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureListIsMutable();
            list_.addAll(other.list_);
          }
          onChanged();
        }
      } else {
        if (!other.list_.isEmpty()) {
          if (listBuilder_.isEmpty()) {
            listBuilder_.dispose();
            listBuilder_ = null;
            list_ = other.list_;
            bitField0_ = (bitField0_ & ~0x00000001);
            listBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getListFieldBuilder() : null;
          } else {
            listBuilder_.addAllMessages(other.list_);
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
            case 8: {
              success_ = input.readBool();

              break;
            } // case 8
            case 18: {
              error_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              com.metas.Mappable m =
                  input.readMessage(
                      com.metas.Mappable.parser(),
                      extensionRegistry);
              if (listBuilder_ == null) {
                ensureListIsMutable();
                list_.add(m);
              } else {
                listBuilder_.addMessage(m);
              }
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

    private boolean success_ ;
    /**
     * <code>bool success = 1 [json_name = "success"];</code>
     * @return The success.
     */
    @java.lang.Override
    public boolean getSuccess() {
      return success_;
    }
    /**
     * <code>bool success = 1 [json_name = "success"];</code>
     * @param value The success to set.
     * @return This builder for chaining.
     */
    public Builder setSuccess(boolean value) {
      
      success_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool success = 1 [json_name = "success"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSuccess() {
      
      success_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object error_ = "";
    /**
     * <code>string error = 2 [json_name = "error"];</code>
     * @return The error.
     */
    public java.lang.String getError() {
      java.lang.Object ref = error_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        error_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string error = 2 [json_name = "error"];</code>
     * @return The bytes for error.
     */
    public com.google.protobuf.ByteString
        getErrorBytes() {
      java.lang.Object ref = error_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        error_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string error = 2 [json_name = "error"];</code>
     * @param value The error to set.
     * @return This builder for chaining.
     */
    public Builder setError(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      error_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string error = 2 [json_name = "error"];</code>
     * @return This builder for chaining.
     */
    public Builder clearError() {
      
      error_ = getDefaultInstance().getError();
      onChanged();
      return this;
    }
    /**
     * <code>string error = 2 [json_name = "error"];</code>
     * @param value The bytes for error to set.
     * @return This builder for chaining.
     */
    public Builder setErrorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      error_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.metas.Mappable> list_ =
      java.util.Collections.emptyList();
    private void ensureListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        list_ = new java.util.ArrayList<com.metas.Mappable>(list_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.metas.Mappable, com.metas.Mappable.Builder, com.metas.MappableOrBuilder> listBuilder_;

    /**
     * <code>repeated .metas.Mappable list = 3 [json_name = "list"];</code>
     */
    public java.util.List<com.metas.Mappable> getListList() {
      if (listBuilder_ == null) {
        return java.util.Collections.unmodifiableList(list_);
      } else {
        return listBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .metas.Mappable list = 3 [json_name = "list"];</code>
     */
    public int getListCount() {
      if (listBuilder_ == null) {
        return list_.size();
      } else {
        return listBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .metas.Mappable list = 3 [json_name = "list"];</code>
     */
    public com.metas.Mappable getList(int index) {
      if (listBuilder_ == null) {
        return list_.get(index);
      } else {
        return listBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .metas.Mappable list = 3 [json_name = "list"];</code>
     */
    public Builder setList(
        int index, com.metas.Mappable value) {
      if (listBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListIsMutable();
        list_.set(index, value);
        onChanged();
      } else {
        listBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .metas.Mappable list = 3 [json_name = "list"];</code>
     */
    public Builder setList(
        int index, com.metas.Mappable.Builder builderForValue) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        list_.set(index, builderForValue.build());
        onChanged();
      } else {
        listBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .metas.Mappable list = 3 [json_name = "list"];</code>
     */
    public Builder addList(com.metas.Mappable value) {
      if (listBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListIsMutable();
        list_.add(value);
        onChanged();
      } else {
        listBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .metas.Mappable list = 3 [json_name = "list"];</code>
     */
    public Builder addList(
        int index, com.metas.Mappable value) {
      if (listBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListIsMutable();
        list_.add(index, value);
        onChanged();
      } else {
        listBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .metas.Mappable list = 3 [json_name = "list"];</code>
     */
    public Builder addList(
        com.metas.Mappable.Builder builderForValue) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        list_.add(builderForValue.build());
        onChanged();
      } else {
        listBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .metas.Mappable list = 3 [json_name = "list"];</code>
     */
    public Builder addList(
        int index, com.metas.Mappable.Builder builderForValue) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        list_.add(index, builderForValue.build());
        onChanged();
      } else {
        listBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .metas.Mappable list = 3 [json_name = "list"];</code>
     */
    public Builder addAllList(
        java.lang.Iterable<? extends com.metas.Mappable> values) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, list_);
        onChanged();
      } else {
        listBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .metas.Mappable list = 3 [json_name = "list"];</code>
     */
    public Builder clearList() {
      if (listBuilder_ == null) {
        list_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        listBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .metas.Mappable list = 3 [json_name = "list"];</code>
     */
    public Builder removeList(int index) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        list_.remove(index);
        onChanged();
      } else {
        listBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .metas.Mappable list = 3 [json_name = "list"];</code>
     */
    public com.metas.Mappable.Builder getListBuilder(
        int index) {
      return getListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .metas.Mappable list = 3 [json_name = "list"];</code>
     */
    public com.metas.MappableOrBuilder getListOrBuilder(
        int index) {
      if (listBuilder_ == null) {
        return list_.get(index);  } else {
        return listBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .metas.Mappable list = 3 [json_name = "list"];</code>
     */
    public java.util.List<? extends com.metas.MappableOrBuilder> 
         getListOrBuilderList() {
      if (listBuilder_ != null) {
        return listBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(list_);
      }
    }
    /**
     * <code>repeated .metas.Mappable list = 3 [json_name = "list"];</code>
     */
    public com.metas.Mappable.Builder addListBuilder() {
      return getListFieldBuilder().addBuilder(
          com.metas.Mappable.getDefaultInstance());
    }
    /**
     * <code>repeated .metas.Mappable list = 3 [json_name = "list"];</code>
     */
    public com.metas.Mappable.Builder addListBuilder(
        int index) {
      return getListFieldBuilder().addBuilder(
          index, com.metas.Mappable.getDefaultInstance());
    }
    /**
     * <code>repeated .metas.Mappable list = 3 [json_name = "list"];</code>
     */
    public java.util.List<com.metas.Mappable.Builder> 
         getListBuilderList() {
      return getListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.metas.Mappable, com.metas.Mappable.Builder, com.metas.MappableOrBuilder> 
        getListFieldBuilder() {
      if (listBuilder_ == null) {
        listBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.metas.Mappable, com.metas.Mappable.Builder, com.metas.MappableOrBuilder>(
                list_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        list_ = null;
      }
      return listBuilder_;
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


    // @@protoc_insertion_point(builder_scope:metas.queries.meta.QueryResponse)
  }

  // @@protoc_insertion_point(class_scope:metas.queries.meta.QueryResponse)
  private static final com.metas.queries.meta.QueryResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.metas.queries.meta.QueryResponse();
  }

  public static com.metas.queries.meta.QueryResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryResponse>() {
    @java.lang.Override
    public QueryResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.metas.queries.meta.QueryResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

