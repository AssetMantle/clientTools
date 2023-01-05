// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/ids/base/dataID.v1.proto

package ids;

public final class DataIDV1 {
  private DataIDV1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DataIDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ids.DataID)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ids.StringID type_i_d = 1;</code>
     * @return Whether the typeID field is set.
     */
    boolean hasTypeID();
    /**
     * <code>.ids.StringID type_i_d = 1;</code>
     * @return The typeID.
     */
    ids.StringIDV1.StringID getTypeID();
    /**
     * <code>.ids.StringID type_i_d = 1;</code>
     */
    ids.StringIDV1.StringIDOrBuilder getTypeIDOrBuilder();

    /**
     * <code>.ids.HashID hash_i_d = 2;</code>
     * @return Whether the hashID field is set.
     */
    boolean hasHashID();
    /**
     * <code>.ids.HashID hash_i_d = 2;</code>
     * @return The hashID.
     */
    ids.HashIDV1.HashID getHashID();
    /**
     * <code>.ids.HashID hash_i_d = 2;</code>
     */
    ids.HashIDV1.HashIDOrBuilder getHashIDOrBuilder();
  }
  /**
   * Protobuf type {@code ids.DataID}
   */
  public static final class DataID extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ids.DataID)
      DataIDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DataID.newBuilder() to construct.
    private DataID(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DataID() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DataID();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ids.DataIDV1.internal_static_ids_DataID_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ids.DataIDV1.internal_static_ids_DataID_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ids.DataIDV1.DataID.class, ids.DataIDV1.DataID.Builder.class);
    }

    public static final int TYPE_I_D_FIELD_NUMBER = 1;
    private ids.StringIDV1.StringID typeID_;
    /**
     * <code>.ids.StringID type_i_d = 1;</code>
     * @return Whether the typeID field is set.
     */
    @java.lang.Override
    public boolean hasTypeID() {
      return typeID_ != null;
    }
    /**
     * <code>.ids.StringID type_i_d = 1;</code>
     * @return The typeID.
     */
    @java.lang.Override
    public ids.StringIDV1.StringID getTypeID() {
      return typeID_ == null ? ids.StringIDV1.StringID.getDefaultInstance() : typeID_;
    }
    /**
     * <code>.ids.StringID type_i_d = 1;</code>
     */
    @java.lang.Override
    public ids.StringIDV1.StringIDOrBuilder getTypeIDOrBuilder() {
      return typeID_ == null ? ids.StringIDV1.StringID.getDefaultInstance() : typeID_;
    }

    public static final int HASH_I_D_FIELD_NUMBER = 2;
    private ids.HashIDV1.HashID hashID_;
    /**
     * <code>.ids.HashID hash_i_d = 2;</code>
     * @return Whether the hashID field is set.
     */
    @java.lang.Override
    public boolean hasHashID() {
      return hashID_ != null;
    }
    /**
     * <code>.ids.HashID hash_i_d = 2;</code>
     * @return The hashID.
     */
    @java.lang.Override
    public ids.HashIDV1.HashID getHashID() {
      return hashID_ == null ? ids.HashIDV1.HashID.getDefaultInstance() : hashID_;
    }
    /**
     * <code>.ids.HashID hash_i_d = 2;</code>
     */
    @java.lang.Override
    public ids.HashIDV1.HashIDOrBuilder getHashIDOrBuilder() {
      return hashID_ == null ? ids.HashIDV1.HashID.getDefaultInstance() : hashID_;
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
      if (typeID_ != null) {
        output.writeMessage(1, getTypeID());
      }
      if (hashID_ != null) {
        output.writeMessage(2, getHashID());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (typeID_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getTypeID());
      }
      if (hashID_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getHashID());
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
      if (!(obj instanceof ids.DataIDV1.DataID)) {
        return super.equals(obj);
      }
      ids.DataIDV1.DataID other = (ids.DataIDV1.DataID) obj;

      if (hasTypeID() != other.hasTypeID()) return false;
      if (hasTypeID()) {
        if (!getTypeID()
            .equals(other.getTypeID())) return false;
      }
      if (hasHashID() != other.hasHashID()) return false;
      if (hasHashID()) {
        if (!getHashID()
            .equals(other.getHashID())) return false;
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
      if (hasTypeID()) {
        hash = (37 * hash) + TYPE_I_D_FIELD_NUMBER;
        hash = (53 * hash) + getTypeID().hashCode();
      }
      if (hasHashID()) {
        hash = (37 * hash) + HASH_I_D_FIELD_NUMBER;
        hash = (53 * hash) + getHashID().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ids.DataIDV1.DataID parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ids.DataIDV1.DataID parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ids.DataIDV1.DataID parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ids.DataIDV1.DataID parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ids.DataIDV1.DataID parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ids.DataIDV1.DataID parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ids.DataIDV1.DataID parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ids.DataIDV1.DataID parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ids.DataIDV1.DataID parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ids.DataIDV1.DataID parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ids.DataIDV1.DataID parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ids.DataIDV1.DataID parseFrom(
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
    public static Builder newBuilder(ids.DataIDV1.DataID prototype) {
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
     * Protobuf type {@code ids.DataID}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ids.DataID)
        ids.DataIDV1.DataIDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ids.DataIDV1.internal_static_ids_DataID_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ids.DataIDV1.internal_static_ids_DataID_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ids.DataIDV1.DataID.class, ids.DataIDV1.DataID.Builder.class);
      }

      // Construct using ids.DataIDV1.DataID.newBuilder()
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
        typeID_ = null;
        if (typeIDBuilder_ != null) {
          typeIDBuilder_.dispose();
          typeIDBuilder_ = null;
        }
        hashID_ = null;
        if (hashIDBuilder_ != null) {
          hashIDBuilder_.dispose();
          hashIDBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ids.DataIDV1.internal_static_ids_DataID_descriptor;
      }

      @java.lang.Override
      public ids.DataIDV1.DataID getDefaultInstanceForType() {
        return ids.DataIDV1.DataID.getDefaultInstance();
      }

      @java.lang.Override
      public ids.DataIDV1.DataID build() {
        ids.DataIDV1.DataID result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ids.DataIDV1.DataID buildPartial() {
        ids.DataIDV1.DataID result = new ids.DataIDV1.DataID(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(ids.DataIDV1.DataID result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.typeID_ = typeIDBuilder_ == null
              ? typeID_
              : typeIDBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.hashID_ = hashIDBuilder_ == null
              ? hashID_
              : hashIDBuilder_.build();
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
        if (other instanceof ids.DataIDV1.DataID) {
          return mergeFrom((ids.DataIDV1.DataID)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ids.DataIDV1.DataID other) {
        if (other == ids.DataIDV1.DataID.getDefaultInstance()) return this;
        if (other.hasTypeID()) {
          mergeTypeID(other.getTypeID());
        }
        if (other.hasHashID()) {
          mergeHashID(other.getHashID());
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
                    getTypeIDFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                input.readMessage(
                    getHashIDFieldBuilder().getBuilder(),
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

      private ids.StringIDV1.StringID typeID_;
      private com.google.protobuf.SingleFieldBuilderV3<
          ids.StringIDV1.StringID, ids.StringIDV1.StringID.Builder, ids.StringIDV1.StringIDOrBuilder> typeIDBuilder_;
      /**
       * <code>.ids.StringID type_i_d = 1;</code>
       * @return Whether the typeID field is set.
       */
      public boolean hasTypeID() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.ids.StringID type_i_d = 1;</code>
       * @return The typeID.
       */
      public ids.StringIDV1.StringID getTypeID() {
        if (typeIDBuilder_ == null) {
          return typeID_ == null ? ids.StringIDV1.StringID.getDefaultInstance() : typeID_;
        } else {
          return typeIDBuilder_.getMessage();
        }
      }
      /**
       * <code>.ids.StringID type_i_d = 1;</code>
       */
      public Builder setTypeID(ids.StringIDV1.StringID value) {
        if (typeIDBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          typeID_ = value;
        } else {
          typeIDBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ids.StringID type_i_d = 1;</code>
       */
      public Builder setTypeID(
          ids.StringIDV1.StringID.Builder builderForValue) {
        if (typeIDBuilder_ == null) {
          typeID_ = builderForValue.build();
        } else {
          typeIDBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ids.StringID type_i_d = 1;</code>
       */
      public Builder mergeTypeID(ids.StringIDV1.StringID value) {
        if (typeIDBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            typeID_ != null &&
            typeID_ != ids.StringIDV1.StringID.getDefaultInstance()) {
            getTypeIDBuilder().mergeFrom(value);
          } else {
            typeID_ = value;
          }
        } else {
          typeIDBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ids.StringID type_i_d = 1;</code>
       */
      public Builder clearTypeID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        typeID_ = null;
        if (typeIDBuilder_ != null) {
          typeIDBuilder_.dispose();
          typeIDBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.ids.StringID type_i_d = 1;</code>
       */
      public ids.StringIDV1.StringID.Builder getTypeIDBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getTypeIDFieldBuilder().getBuilder();
      }
      /**
       * <code>.ids.StringID type_i_d = 1;</code>
       */
      public ids.StringIDV1.StringIDOrBuilder getTypeIDOrBuilder() {
        if (typeIDBuilder_ != null) {
          return typeIDBuilder_.getMessageOrBuilder();
        } else {
          return typeID_ == null ?
              ids.StringIDV1.StringID.getDefaultInstance() : typeID_;
        }
      }
      /**
       * <code>.ids.StringID type_i_d = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ids.StringIDV1.StringID, ids.StringIDV1.StringID.Builder, ids.StringIDV1.StringIDOrBuilder> 
          getTypeIDFieldBuilder() {
        if (typeIDBuilder_ == null) {
          typeIDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ids.StringIDV1.StringID, ids.StringIDV1.StringID.Builder, ids.StringIDV1.StringIDOrBuilder>(
                  getTypeID(),
                  getParentForChildren(),
                  isClean());
          typeID_ = null;
        }
        return typeIDBuilder_;
      }

      private ids.HashIDV1.HashID hashID_;
      private com.google.protobuf.SingleFieldBuilderV3<
          ids.HashIDV1.HashID, ids.HashIDV1.HashID.Builder, ids.HashIDV1.HashIDOrBuilder> hashIDBuilder_;
      /**
       * <code>.ids.HashID hash_i_d = 2;</code>
       * @return Whether the hashID field is set.
       */
      public boolean hasHashID() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.ids.HashID hash_i_d = 2;</code>
       * @return The hashID.
       */
      public ids.HashIDV1.HashID getHashID() {
        if (hashIDBuilder_ == null) {
          return hashID_ == null ? ids.HashIDV1.HashID.getDefaultInstance() : hashID_;
        } else {
          return hashIDBuilder_.getMessage();
        }
      }
      /**
       * <code>.ids.HashID hash_i_d = 2;</code>
       */
      public Builder setHashID(ids.HashIDV1.HashID value) {
        if (hashIDBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          hashID_ = value;
        } else {
          hashIDBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.ids.HashID hash_i_d = 2;</code>
       */
      public Builder setHashID(
          ids.HashIDV1.HashID.Builder builderForValue) {
        if (hashIDBuilder_ == null) {
          hashID_ = builderForValue.build();
        } else {
          hashIDBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.ids.HashID hash_i_d = 2;</code>
       */
      public Builder mergeHashID(ids.HashIDV1.HashID value) {
        if (hashIDBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            hashID_ != null &&
            hashID_ != ids.HashIDV1.HashID.getDefaultInstance()) {
            getHashIDBuilder().mergeFrom(value);
          } else {
            hashID_ = value;
          }
        } else {
          hashIDBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.ids.HashID hash_i_d = 2;</code>
       */
      public Builder clearHashID() {
        bitField0_ = (bitField0_ & ~0x00000002);
        hashID_ = null;
        if (hashIDBuilder_ != null) {
          hashIDBuilder_.dispose();
          hashIDBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.ids.HashID hash_i_d = 2;</code>
       */
      public ids.HashIDV1.HashID.Builder getHashIDBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getHashIDFieldBuilder().getBuilder();
      }
      /**
       * <code>.ids.HashID hash_i_d = 2;</code>
       */
      public ids.HashIDV1.HashIDOrBuilder getHashIDOrBuilder() {
        if (hashIDBuilder_ != null) {
          return hashIDBuilder_.getMessageOrBuilder();
        } else {
          return hashID_ == null ?
              ids.HashIDV1.HashID.getDefaultInstance() : hashID_;
        }
      }
      /**
       * <code>.ids.HashID hash_i_d = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ids.HashIDV1.HashID, ids.HashIDV1.HashID.Builder, ids.HashIDV1.HashIDOrBuilder> 
          getHashIDFieldBuilder() {
        if (hashIDBuilder_ == null) {
          hashIDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ids.HashIDV1.HashID, ids.HashIDV1.HashID.Builder, ids.HashIDV1.HashIDOrBuilder>(
                  getHashID(),
                  getParentForChildren(),
                  isClean());
          hashID_ = null;
        }
        return hashIDBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ids.DataID)
    }

    // @@protoc_insertion_point(class_scope:ids.DataID)
    private static final ids.DataIDV1.DataID DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ids.DataIDV1.DataID();
    }

    public static ids.DataIDV1.DataID getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DataID>
        PARSER = new com.google.protobuf.AbstractParser<DataID>() {
      @java.lang.Override
      public DataID parsePartialFrom(
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

    public static com.google.protobuf.Parser<DataID> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DataID> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ids.DataIDV1.DataID getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ids_DataID_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ids_DataID_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037schema/ids/base/dataID.v1.proto\022\003ids\032\037" +
      "schema/ids/base/hashID.v1.proto\032!schema/" +
      "ids/base/stringID.v1.proto\032\024gogoproto/go" +
      "go.proto\"N\n\006DataID\022\037\n\010type_i_d\030\001 \001(\0132\r.i" +
      "ds.StringID\022\035\n\010hash_i_d\030\002 \001(\0132\013.ids.Hash" +
      "ID:\004\210\240\037\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ids.HashIDV1.getDescriptor(),
          ids.StringIDV1.getDescriptor(),
          com.google.protobuf.GoGoProtos.getDescriptor(),
        });
    internal_static_ids_DataID_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ids_DataID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ids_DataID_descriptor,
        new java.lang.String[] { "TypeID", "HashID", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    ids.HashIDV1.getDescriptor();
    ids.StringIDV1.getDescriptor();
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}