// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/ids/base/ownableID.v1.proto

package ids;

public final class OwnableIDV1 {
  private OwnableIDV1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OwnableIDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ids.OwnableID)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ids.StringID string_i_d = 1;</code>
     * @return Whether the stringID field is set.
     */
    boolean hasStringID();
    /**
     * <code>.ids.StringID string_i_d = 1;</code>
     * @return The stringID.
     */
    ids.StringIDV1.StringID getStringID();
    /**
     * <code>.ids.StringID string_i_d = 1;</code>
     */
    ids.StringIDV1.StringIDOrBuilder getStringIDOrBuilder();
  }
  /**
   * Protobuf type {@code ids.OwnableID}
   */
  public static final class OwnableID extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ids.OwnableID)
      OwnableIDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OwnableID.newBuilder() to construct.
    private OwnableID(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OwnableID() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OwnableID();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ids.OwnableIDV1.internal_static_ids_OwnableID_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ids.OwnableIDV1.internal_static_ids_OwnableID_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ids.OwnableIDV1.OwnableID.class, ids.OwnableIDV1.OwnableID.Builder.class);
    }

    public static final int STRING_I_D_FIELD_NUMBER = 1;
    private ids.StringIDV1.StringID stringID_;
    /**
     * <code>.ids.StringID string_i_d = 1;</code>
     * @return Whether the stringID field is set.
     */
    @java.lang.Override
    public boolean hasStringID() {
      return stringID_ != null;
    }
    /**
     * <code>.ids.StringID string_i_d = 1;</code>
     * @return The stringID.
     */
    @java.lang.Override
    public ids.StringIDV1.StringID getStringID() {
      return stringID_ == null ? ids.StringIDV1.StringID.getDefaultInstance() : stringID_;
    }
    /**
     * <code>.ids.StringID string_i_d = 1;</code>
     */
    @java.lang.Override
    public ids.StringIDV1.StringIDOrBuilder getStringIDOrBuilder() {
      return stringID_ == null ? ids.StringIDV1.StringID.getDefaultInstance() : stringID_;
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
      if (!(obj instanceof ids.OwnableIDV1.OwnableID)) {
        return super.equals(obj);
      }
      ids.OwnableIDV1.OwnableID other = (ids.OwnableIDV1.OwnableID) obj;

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

    public static ids.OwnableIDV1.OwnableID parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ids.OwnableIDV1.OwnableID parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ids.OwnableIDV1.OwnableID parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ids.OwnableIDV1.OwnableID parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ids.OwnableIDV1.OwnableID parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ids.OwnableIDV1.OwnableID parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ids.OwnableIDV1.OwnableID parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ids.OwnableIDV1.OwnableID parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ids.OwnableIDV1.OwnableID parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ids.OwnableIDV1.OwnableID parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ids.OwnableIDV1.OwnableID parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ids.OwnableIDV1.OwnableID parseFrom(
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
    public static Builder newBuilder(ids.OwnableIDV1.OwnableID prototype) {
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
     * Protobuf type {@code ids.OwnableID}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ids.OwnableID)
        ids.OwnableIDV1.OwnableIDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ids.OwnableIDV1.internal_static_ids_OwnableID_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ids.OwnableIDV1.internal_static_ids_OwnableID_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ids.OwnableIDV1.OwnableID.class, ids.OwnableIDV1.OwnableID.Builder.class);
      }

      // Construct using ids.OwnableIDV1.OwnableID.newBuilder()
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
        return ids.OwnableIDV1.internal_static_ids_OwnableID_descriptor;
      }

      @java.lang.Override
      public ids.OwnableIDV1.OwnableID getDefaultInstanceForType() {
        return ids.OwnableIDV1.OwnableID.getDefaultInstance();
      }

      @java.lang.Override
      public ids.OwnableIDV1.OwnableID build() {
        ids.OwnableIDV1.OwnableID result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ids.OwnableIDV1.OwnableID buildPartial() {
        ids.OwnableIDV1.OwnableID result = new ids.OwnableIDV1.OwnableID(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(ids.OwnableIDV1.OwnableID result) {
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
        if (other instanceof ids.OwnableIDV1.OwnableID) {
          return mergeFrom((ids.OwnableIDV1.OwnableID)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ids.OwnableIDV1.OwnableID other) {
        if (other == ids.OwnableIDV1.OwnableID.getDefaultInstance()) return this;
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

      private ids.StringIDV1.StringID stringID_;
      private com.google.protobuf.SingleFieldBuilderV3<
          ids.StringIDV1.StringID, ids.StringIDV1.StringID.Builder, ids.StringIDV1.StringIDOrBuilder> stringIDBuilder_;
      /**
       * <code>.ids.StringID string_i_d = 1;</code>
       * @return Whether the stringID field is set.
       */
      public boolean hasStringID() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.ids.StringID string_i_d = 1;</code>
       * @return The stringID.
       */
      public ids.StringIDV1.StringID getStringID() {
        if (stringIDBuilder_ == null) {
          return stringID_ == null ? ids.StringIDV1.StringID.getDefaultInstance() : stringID_;
        } else {
          return stringIDBuilder_.getMessage();
        }
      }
      /**
       * <code>.ids.StringID string_i_d = 1;</code>
       */
      public Builder setStringID(ids.StringIDV1.StringID value) {
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
       * <code>.ids.StringID string_i_d = 1;</code>
       */
      public Builder setStringID(
          ids.StringIDV1.StringID.Builder builderForValue) {
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
       * <code>.ids.StringID string_i_d = 1;</code>
       */
      public Builder mergeStringID(ids.StringIDV1.StringID value) {
        if (stringIDBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            stringID_ != null &&
            stringID_ != ids.StringIDV1.StringID.getDefaultInstance()) {
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
       * <code>.ids.StringID string_i_d = 1;</code>
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
       * <code>.ids.StringID string_i_d = 1;</code>
       */
      public ids.StringIDV1.StringID.Builder getStringIDBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getStringIDFieldBuilder().getBuilder();
      }
      /**
       * <code>.ids.StringID string_i_d = 1;</code>
       */
      public ids.StringIDV1.StringIDOrBuilder getStringIDOrBuilder() {
        if (stringIDBuilder_ != null) {
          return stringIDBuilder_.getMessageOrBuilder();
        } else {
          return stringID_ == null ?
              ids.StringIDV1.StringID.getDefaultInstance() : stringID_;
        }
      }
      /**
       * <code>.ids.StringID string_i_d = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ids.StringIDV1.StringID, ids.StringIDV1.StringID.Builder, ids.StringIDV1.StringIDOrBuilder> 
          getStringIDFieldBuilder() {
        if (stringIDBuilder_ == null) {
          stringIDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ids.StringIDV1.StringID, ids.StringIDV1.StringID.Builder, ids.StringIDV1.StringIDOrBuilder>(
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


      // @@protoc_insertion_point(builder_scope:ids.OwnableID)
    }

    // @@protoc_insertion_point(class_scope:ids.OwnableID)
    private static final ids.OwnableIDV1.OwnableID DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ids.OwnableIDV1.OwnableID();
    }

    public static ids.OwnableIDV1.OwnableID getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OwnableID>
        PARSER = new com.google.protobuf.AbstractParser<OwnableID>() {
      @java.lang.Override
      public OwnableID parsePartialFrom(
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

    public static com.google.protobuf.Parser<OwnableID> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OwnableID> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ids.OwnableIDV1.OwnableID getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ids_OwnableID_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ids_OwnableID_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"schema/ids/base/ownableID.v1.proto\022\003id" +
      "s\032!schema/ids/base/stringID.v1.proto\032\024go" +
      "goproto/gogo.proto\"4\n\tOwnableID\022!\n\nstrin" +
      "g_i_d\030\001 \001(\0132\r.ids.StringID:\004\210\240\037\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ids.StringIDV1.getDescriptor(),
          com.google.protobuf.GoGoProtos.getDescriptor(),
        });
    internal_static_ids_OwnableID_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ids_OwnableID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ids_OwnableID_descriptor,
        new java.lang.String[] { "StringID", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    ids.StringIDV1.getDescriptor();
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}