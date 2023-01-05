// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/identities/internal/queries/identity/queryResponse.v1.proto

package identities.queries.identity;

public final class QueryResponseV1 {
  private QueryResponseV1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QueryResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:identities.queries.identity.QueryResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool success = 1;</code>
     * @return The success.
     */
    boolean getSuccess();

    /**
     * <code>string error = 2;</code>
     * @return The error.
     */
    java.lang.String getError();
    /**
     * <code>string error = 2;</code>
     * @return The bytes for error.
     */
    com.google.protobuf.ByteString
        getErrorBytes();

    /**
     * <code>repeated .identities.Mappable list = 3;</code>
     */
    java.util.List<identities.MappableV1.Mappable> 
        getListList();
    /**
     * <code>repeated .identities.Mappable list = 3;</code>
     */
    identities.MappableV1.Mappable getList(int index);
    /**
     * <code>repeated .identities.Mappable list = 3;</code>
     */
    int getListCount();
    /**
     * <code>repeated .identities.Mappable list = 3;</code>
     */
    java.util.List<? extends identities.MappableV1.MappableOrBuilder> 
        getListOrBuilderList();
    /**
     * <code>repeated .identities.Mappable list = 3;</code>
     */
    identities.MappableV1.MappableOrBuilder getListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code identities.queries.identity.QueryResponse}
   */
  public static final class QueryResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:identities.queries.identity.QueryResponse)
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

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return identities.queries.identity.QueryResponseV1.internal_static_identities_queries_identity_QueryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return identities.queries.identity.QueryResponseV1.internal_static_identities_queries_identity_QueryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              identities.queries.identity.QueryResponseV1.QueryResponse.class, identities.queries.identity.QueryResponseV1.QueryResponse.Builder.class);
    }

    public static final int SUCCESS_FIELD_NUMBER = 1;
    private boolean success_ = false;
    /**
     * <code>bool success = 1;</code>
     * @return The success.
     */
    @java.lang.Override
    public boolean getSuccess() {
      return success_;
    }

    public static final int ERROR_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object error_ = "";
    /**
     * <code>string error = 2;</code>
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
     * <code>string error = 2;</code>
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
    @SuppressWarnings("serial")
    private java.util.List<identities.MappableV1.Mappable> list_;
    /**
     * <code>repeated .identities.Mappable list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<identities.MappableV1.Mappable> getListList() {
      return list_;
    }
    /**
     * <code>repeated .identities.Mappable list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<? extends identities.MappableV1.MappableOrBuilder> 
        getListOrBuilderList() {
      return list_;
    }
    /**
     * <code>repeated .identities.Mappable list = 3;</code>
     */
    @java.lang.Override
    public int getListCount() {
      return list_.size();
    }
    /**
     * <code>repeated .identities.Mappable list = 3;</code>
     */
    @java.lang.Override
    public identities.MappableV1.Mappable getList(int index) {
      return list_.get(index);
    }
    /**
     * <code>repeated .identities.Mappable list = 3;</code>
     */
    @java.lang.Override
    public identities.MappableV1.MappableOrBuilder getListOrBuilder(
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
      if (!(obj instanceof identities.queries.identity.QueryResponseV1.QueryResponse)) {
        return super.equals(obj);
      }
      identities.queries.identity.QueryResponseV1.QueryResponse other = (identities.queries.identity.QueryResponseV1.QueryResponse) obj;

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

    public static identities.queries.identity.QueryResponseV1.QueryResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static identities.queries.identity.QueryResponseV1.QueryResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static identities.queries.identity.QueryResponseV1.QueryResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static identities.queries.identity.QueryResponseV1.QueryResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static identities.queries.identity.QueryResponseV1.QueryResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static identities.queries.identity.QueryResponseV1.QueryResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static identities.queries.identity.QueryResponseV1.QueryResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static identities.queries.identity.QueryResponseV1.QueryResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static identities.queries.identity.QueryResponseV1.QueryResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static identities.queries.identity.QueryResponseV1.QueryResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static identities.queries.identity.QueryResponseV1.QueryResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static identities.queries.identity.QueryResponseV1.QueryResponse parseFrom(
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
    public static Builder newBuilder(identities.queries.identity.QueryResponseV1.QueryResponse prototype) {
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
     * Protobuf type {@code identities.queries.identity.QueryResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:identities.queries.identity.QueryResponse)
        identities.queries.identity.QueryResponseV1.QueryResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return identities.queries.identity.QueryResponseV1.internal_static_identities_queries_identity_QueryResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return identities.queries.identity.QueryResponseV1.internal_static_identities_queries_identity_QueryResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                identities.queries.identity.QueryResponseV1.QueryResponse.class, identities.queries.identity.QueryResponseV1.QueryResponse.Builder.class);
      }

      // Construct using identities.queries.identity.QueryResponseV1.QueryResponse.newBuilder()
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
        success_ = false;
        error_ = "";
        if (listBuilder_ == null) {
          list_ = java.util.Collections.emptyList();
        } else {
          list_ = null;
          listBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return identities.queries.identity.QueryResponseV1.internal_static_identities_queries_identity_QueryResponse_descriptor;
      }

      @java.lang.Override
      public identities.queries.identity.QueryResponseV1.QueryResponse getDefaultInstanceForType() {
        return identities.queries.identity.QueryResponseV1.QueryResponse.getDefaultInstance();
      }

      @java.lang.Override
      public identities.queries.identity.QueryResponseV1.QueryResponse build() {
        identities.queries.identity.QueryResponseV1.QueryResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public identities.queries.identity.QueryResponseV1.QueryResponse buildPartial() {
        identities.queries.identity.QueryResponseV1.QueryResponse result = new identities.queries.identity.QueryResponseV1.QueryResponse(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(identities.queries.identity.QueryResponseV1.QueryResponse result) {
        if (listBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0)) {
            list_ = java.util.Collections.unmodifiableList(list_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.list_ = list_;
        } else {
          result.list_ = listBuilder_.build();
        }
      }

      private void buildPartial0(identities.queries.identity.QueryResponseV1.QueryResponse result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.success_ = success_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.error_ = error_;
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
        if (other instanceof identities.queries.identity.QueryResponseV1.QueryResponse) {
          return mergeFrom((identities.queries.identity.QueryResponseV1.QueryResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(identities.queries.identity.QueryResponseV1.QueryResponse other) {
        if (other == identities.queries.identity.QueryResponseV1.QueryResponse.getDefaultInstance()) return this;
        if (other.getSuccess() != false) {
          setSuccess(other.getSuccess());
        }
        if (!other.getError().isEmpty()) {
          error_ = other.error_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (listBuilder_ == null) {
          if (!other.list_.isEmpty()) {
            if (list_.isEmpty()) {
              list_ = other.list_;
              bitField0_ = (bitField0_ & ~0x00000004);
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
              bitField0_ = (bitField0_ & ~0x00000004);
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
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                error_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                identities.MappableV1.Mappable m =
                    input.readMessage(
                        identities.MappableV1.Mappable.parser(),
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
       * <code>bool success = 1;</code>
       * @return The success.
       */
      @java.lang.Override
      public boolean getSuccess() {
        return success_;
      }
      /**
       * <code>bool success = 1;</code>
       * @param value The success to set.
       * @return This builder for chaining.
       */
      public Builder setSuccess(boolean value) {

        success_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool success = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSuccess() {
        bitField0_ = (bitField0_ & ~0x00000001);
        success_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object error_ = "";
      /**
       * <code>string error = 2;</code>
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
       * <code>string error = 2;</code>
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
       * <code>string error = 2;</code>
       * @param value The error to set.
       * @return This builder for chaining.
       */
      public Builder setError(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        error_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string error = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearError() {
        error_ = getDefaultInstance().getError();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string error = 2;</code>
       * @param value The bytes for error to set.
       * @return This builder for chaining.
       */
      public Builder setErrorBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        error_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private java.util.List<identities.MappableV1.Mappable> list_ =
        java.util.Collections.emptyList();
      private void ensureListIsMutable() {
        if (!((bitField0_ & 0x00000004) != 0)) {
          list_ = new java.util.ArrayList<identities.MappableV1.Mappable>(list_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          identities.MappableV1.Mappable, identities.MappableV1.Mappable.Builder, identities.MappableV1.MappableOrBuilder> listBuilder_;

      /**
       * <code>repeated .identities.Mappable list = 3;</code>
       */
      public java.util.List<identities.MappableV1.Mappable> getListList() {
        if (listBuilder_ == null) {
          return java.util.Collections.unmodifiableList(list_);
        } else {
          return listBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .identities.Mappable list = 3;</code>
       */
      public int getListCount() {
        if (listBuilder_ == null) {
          return list_.size();
        } else {
          return listBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .identities.Mappable list = 3;</code>
       */
      public identities.MappableV1.Mappable getList(int index) {
        if (listBuilder_ == null) {
          return list_.get(index);
        } else {
          return listBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .identities.Mappable list = 3;</code>
       */
      public Builder setList(
          int index, identities.MappableV1.Mappable value) {
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
       * <code>repeated .identities.Mappable list = 3;</code>
       */
      public Builder setList(
          int index, identities.MappableV1.Mappable.Builder builderForValue) {
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
       * <code>repeated .identities.Mappable list = 3;</code>
       */
      public Builder addList(identities.MappableV1.Mappable value) {
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
       * <code>repeated .identities.Mappable list = 3;</code>
       */
      public Builder addList(
          int index, identities.MappableV1.Mappable value) {
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
       * <code>repeated .identities.Mappable list = 3;</code>
       */
      public Builder addList(
          identities.MappableV1.Mappable.Builder builderForValue) {
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
       * <code>repeated .identities.Mappable list = 3;</code>
       */
      public Builder addList(
          int index, identities.MappableV1.Mappable.Builder builderForValue) {
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
       * <code>repeated .identities.Mappable list = 3;</code>
       */
      public Builder addAllList(
          java.lang.Iterable<? extends identities.MappableV1.Mappable> values) {
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
       * <code>repeated .identities.Mappable list = 3;</code>
       */
      public Builder clearList() {
        if (listBuilder_ == null) {
          list_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          listBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .identities.Mappable list = 3;</code>
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
       * <code>repeated .identities.Mappable list = 3;</code>
       */
      public identities.MappableV1.Mappable.Builder getListBuilder(
          int index) {
        return getListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .identities.Mappable list = 3;</code>
       */
      public identities.MappableV1.MappableOrBuilder getListOrBuilder(
          int index) {
        if (listBuilder_ == null) {
          return list_.get(index);  } else {
          return listBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .identities.Mappable list = 3;</code>
       */
      public java.util.List<? extends identities.MappableV1.MappableOrBuilder> 
           getListOrBuilderList() {
        if (listBuilder_ != null) {
          return listBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(list_);
        }
      }
      /**
       * <code>repeated .identities.Mappable list = 3;</code>
       */
      public identities.MappableV1.Mappable.Builder addListBuilder() {
        return getListFieldBuilder().addBuilder(
            identities.MappableV1.Mappable.getDefaultInstance());
      }
      /**
       * <code>repeated .identities.Mappable list = 3;</code>
       */
      public identities.MappableV1.Mappable.Builder addListBuilder(
          int index) {
        return getListFieldBuilder().addBuilder(
            index, identities.MappableV1.Mappable.getDefaultInstance());
      }
      /**
       * <code>repeated .identities.Mappable list = 3;</code>
       */
      public java.util.List<identities.MappableV1.Mappable.Builder> 
           getListBuilderList() {
        return getListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          identities.MappableV1.Mappable, identities.MappableV1.Mappable.Builder, identities.MappableV1.MappableOrBuilder> 
          getListFieldBuilder() {
        if (listBuilder_ == null) {
          listBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              identities.MappableV1.Mappable, identities.MappableV1.Mappable.Builder, identities.MappableV1.MappableOrBuilder>(
                  list_,
                  ((bitField0_ & 0x00000004) != 0),
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


      // @@protoc_insertion_point(builder_scope:identities.queries.identity.QueryResponse)
    }

    // @@protoc_insertion_point(class_scope:identities.queries.identity.QueryResponse)
    private static final identities.queries.identity.QueryResponseV1.QueryResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new identities.queries.identity.QueryResponseV1.QueryResponse();
    }

    public static identities.queries.identity.QueryResponseV1.QueryResponse getDefaultInstance() {
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
    public identities.queries.identity.QueryResponseV1.QueryResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identities_queries_identity_QueryResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identities_queries_identity_QueryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCmodules/identities/internal/queries/id" +
      "entity/queryResponse.v1.proto\022\033identitie" +
      "s.queries.identity\032\024gogoproto/gogo.proto" +
      "\0326modules/identities/internal/mappable/m" +
      "appable.v1.proto\"Y\n\rQueryResponse\022\017\n\007suc" +
      "cess\030\001 \001(\010\022\r\n\005error\030\002 \001(\t\022\"\n\004list\030\003 \003(\0132" +
      "\024.identities.Mappable:\004\210\240\037\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
          identities.MappableV1.getDescriptor(),
        });
    internal_static_identities_queries_identity_QueryResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_identities_queries_identity_QueryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identities_queries_identity_QueryResponse_descriptor,
        new java.lang.String[] { "Success", "Error", "List", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    identities.MappableV1.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
