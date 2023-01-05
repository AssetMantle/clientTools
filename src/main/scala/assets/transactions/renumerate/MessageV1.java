// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/assets/internal/transactions/renumerate/message.v1.proto

package assets.transactions.renumerate;

public final class MessageV1 {
  private MessageV1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:assets.transactions.renumerate.Message)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string from = 1;</code>
     * @return The from.
     */
    java.lang.String getFrom();
    /**
     * <code>string from = 1;</code>
     * @return The bytes for from.
     */
    com.google.protobuf.ByteString
        getFromBytes();

    /**
     * <code>.ids.IdentityID from_i_d = 2;</code>
     * @return Whether the fromID field is set.
     */
    boolean hasFromID();
    /**
     * <code>.ids.IdentityID from_i_d = 2;</code>
     * @return The fromID.
     */
    ids.IdentityIDV1.IdentityID getFromID();
    /**
     * <code>.ids.IdentityID from_i_d = 2;</code>
     */
    ids.IdentityIDV1.IdentityIDOrBuilder getFromIDOrBuilder();

    /**
     * <code>.ids.AssetID asset_i_d = 3;</code>
     * @return Whether the assetID field is set.
     */
    boolean hasAssetID();
    /**
     * <code>.ids.AssetID asset_i_d = 3;</code>
     * @return The assetID.
     */
    ids.AssetIDV1.AssetID getAssetID();
    /**
     * <code>.ids.AssetID asset_i_d = 3;</code>
     */
    ids.AssetIDV1.AssetIDOrBuilder getAssetIDOrBuilder();
  }
  /**
   * Protobuf type {@code assets.transactions.renumerate.Message}
   */
  public static final class Message extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:assets.transactions.renumerate.Message)
      MessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Message.newBuilder() to construct.
    private Message(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Message() {
      from_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Message();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return assets.transactions.renumerate.MessageV1.internal_static_assets_transactions_renumerate_Message_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return assets.transactions.renumerate.MessageV1.internal_static_assets_transactions_renumerate_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              assets.transactions.renumerate.MessageV1.Message.class, assets.transactions.renumerate.MessageV1.Message.Builder.class);
    }

    public static final int FROM_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object from_ = "";
    /**
     * <code>string from = 1;</code>
     * @return The from.
     */
    @java.lang.Override
    public java.lang.String getFrom() {
      java.lang.Object ref = from_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        from_ = s;
        return s;
      }
    }
    /**
     * <code>string from = 1;</code>
     * @return The bytes for from.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFromBytes() {
      java.lang.Object ref = from_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        from_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FROM_I_D_FIELD_NUMBER = 2;
    private ids.IdentityIDV1.IdentityID fromID_;
    /**
     * <code>.ids.IdentityID from_i_d = 2;</code>
     * @return Whether the fromID field is set.
     */
    @java.lang.Override
    public boolean hasFromID() {
      return fromID_ != null;
    }
    /**
     * <code>.ids.IdentityID from_i_d = 2;</code>
     * @return The fromID.
     */
    @java.lang.Override
    public ids.IdentityIDV1.IdentityID getFromID() {
      return fromID_ == null ? ids.IdentityIDV1.IdentityID.getDefaultInstance() : fromID_;
    }
    /**
     * <code>.ids.IdentityID from_i_d = 2;</code>
     */
    @java.lang.Override
    public ids.IdentityIDV1.IdentityIDOrBuilder getFromIDOrBuilder() {
      return fromID_ == null ? ids.IdentityIDV1.IdentityID.getDefaultInstance() : fromID_;
    }

    public static final int ASSET_I_D_FIELD_NUMBER = 3;
    private ids.AssetIDV1.AssetID assetID_;
    /**
     * <code>.ids.AssetID asset_i_d = 3;</code>
     * @return Whether the assetID field is set.
     */
    @java.lang.Override
    public boolean hasAssetID() {
      return assetID_ != null;
    }
    /**
     * <code>.ids.AssetID asset_i_d = 3;</code>
     * @return The assetID.
     */
    @java.lang.Override
    public ids.AssetIDV1.AssetID getAssetID() {
      return assetID_ == null ? ids.AssetIDV1.AssetID.getDefaultInstance() : assetID_;
    }
    /**
     * <code>.ids.AssetID asset_i_d = 3;</code>
     */
    @java.lang.Override
    public ids.AssetIDV1.AssetIDOrBuilder getAssetIDOrBuilder() {
      return assetID_ == null ? ids.AssetIDV1.AssetID.getDefaultInstance() : assetID_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(from_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, from_);
      }
      if (fromID_ != null) {
        output.writeMessage(2, getFromID());
      }
      if (assetID_ != null) {
        output.writeMessage(3, getAssetID());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
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
      if (assetID_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getAssetID());
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
      if (!(obj instanceof assets.transactions.renumerate.MessageV1.Message)) {
        return super.equals(obj);
      }
      assets.transactions.renumerate.MessageV1.Message other = (assets.transactions.renumerate.MessageV1.Message) obj;

      if (!getFrom()
          .equals(other.getFrom())) return false;
      if (hasFromID() != other.hasFromID()) return false;
      if (hasFromID()) {
        if (!getFromID()
            .equals(other.getFromID())) return false;
      }
      if (hasAssetID() != other.hasAssetID()) return false;
      if (hasAssetID()) {
        if (!getAssetID()
            .equals(other.getAssetID())) return false;
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
      hash = (37 * hash) + FROM_FIELD_NUMBER;
      hash = (53 * hash) + getFrom().hashCode();
      if (hasFromID()) {
        hash = (37 * hash) + FROM_I_D_FIELD_NUMBER;
        hash = (53 * hash) + getFromID().hashCode();
      }
      if (hasAssetID()) {
        hash = (37 * hash) + ASSET_I_D_FIELD_NUMBER;
        hash = (53 * hash) + getAssetID().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static assets.transactions.renumerate.MessageV1.Message parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static assets.transactions.renumerate.MessageV1.Message parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static assets.transactions.renumerate.MessageV1.Message parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static assets.transactions.renumerate.MessageV1.Message parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static assets.transactions.renumerate.MessageV1.Message parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static assets.transactions.renumerate.MessageV1.Message parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static assets.transactions.renumerate.MessageV1.Message parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static assets.transactions.renumerate.MessageV1.Message parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static assets.transactions.renumerate.MessageV1.Message parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static assets.transactions.renumerate.MessageV1.Message parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static assets.transactions.renumerate.MessageV1.Message parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static assets.transactions.renumerate.MessageV1.Message parseFrom(
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
    public static Builder newBuilder(assets.transactions.renumerate.MessageV1.Message prototype) {
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
     * Protobuf type {@code assets.transactions.renumerate.Message}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:assets.transactions.renumerate.Message)
        assets.transactions.renumerate.MessageV1.MessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return assets.transactions.renumerate.MessageV1.internal_static_assets_transactions_renumerate_Message_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return assets.transactions.renumerate.MessageV1.internal_static_assets_transactions_renumerate_Message_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                assets.transactions.renumerate.MessageV1.Message.class, assets.transactions.renumerate.MessageV1.Message.Builder.class);
      }

      // Construct using assets.transactions.renumerate.MessageV1.Message.newBuilder()
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
        from_ = "";
        fromID_ = null;
        if (fromIDBuilder_ != null) {
          fromIDBuilder_.dispose();
          fromIDBuilder_ = null;
        }
        assetID_ = null;
        if (assetIDBuilder_ != null) {
          assetIDBuilder_.dispose();
          assetIDBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return assets.transactions.renumerate.MessageV1.internal_static_assets_transactions_renumerate_Message_descriptor;
      }

      @java.lang.Override
      public assets.transactions.renumerate.MessageV1.Message getDefaultInstanceForType() {
        return assets.transactions.renumerate.MessageV1.Message.getDefaultInstance();
      }

      @java.lang.Override
      public assets.transactions.renumerate.MessageV1.Message build() {
        assets.transactions.renumerate.MessageV1.Message result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public assets.transactions.renumerate.MessageV1.Message buildPartial() {
        assets.transactions.renumerate.MessageV1.Message result = new assets.transactions.renumerate.MessageV1.Message(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(assets.transactions.renumerate.MessageV1.Message result) {
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
          result.assetID_ = assetIDBuilder_ == null
              ? assetID_
              : assetIDBuilder_.build();
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
        if (other instanceof assets.transactions.renumerate.MessageV1.Message) {
          return mergeFrom((assets.transactions.renumerate.MessageV1.Message)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(assets.transactions.renumerate.MessageV1.Message other) {
        if (other == assets.transactions.renumerate.MessageV1.Message.getDefaultInstance()) return this;
        if (!other.getFrom().isEmpty()) {
          from_ = other.from_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.hasFromID()) {
          mergeFromID(other.getFromID());
        }
        if (other.hasAssetID()) {
          mergeAssetID(other.getAssetID());
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
                    getAssetIDFieldBuilder().getBuilder(),
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

      private java.lang.Object from_ = "";
      /**
       * <code>string from = 1;</code>
       * @return The from.
       */
      public java.lang.String getFrom() {
        java.lang.Object ref = from_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          from_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string from = 1;</code>
       * @return The bytes for from.
       */
      public com.google.protobuf.ByteString
          getFromBytes() {
        java.lang.Object ref = from_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          from_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string from = 1;</code>
       * @param value The from to set.
       * @return This builder for chaining.
       */
      public Builder setFrom(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        from_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string from = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFrom() {
        from_ = getDefaultInstance().getFrom();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string from = 1;</code>
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

      private ids.IdentityIDV1.IdentityID fromID_;
      private com.google.protobuf.SingleFieldBuilderV3<
          ids.IdentityIDV1.IdentityID, ids.IdentityIDV1.IdentityID.Builder, ids.IdentityIDV1.IdentityIDOrBuilder> fromIDBuilder_;
      /**
       * <code>.ids.IdentityID from_i_d = 2;</code>
       * @return Whether the fromID field is set.
       */
      public boolean hasFromID() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.ids.IdentityID from_i_d = 2;</code>
       * @return The fromID.
       */
      public ids.IdentityIDV1.IdentityID getFromID() {
        if (fromIDBuilder_ == null) {
          return fromID_ == null ? ids.IdentityIDV1.IdentityID.getDefaultInstance() : fromID_;
        } else {
          return fromIDBuilder_.getMessage();
        }
      }
      /**
       * <code>.ids.IdentityID from_i_d = 2;</code>
       */
      public Builder setFromID(ids.IdentityIDV1.IdentityID value) {
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
       * <code>.ids.IdentityID from_i_d = 2;</code>
       */
      public Builder setFromID(
          ids.IdentityIDV1.IdentityID.Builder builderForValue) {
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
       * <code>.ids.IdentityID from_i_d = 2;</code>
       */
      public Builder mergeFromID(ids.IdentityIDV1.IdentityID value) {
        if (fromIDBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            fromID_ != null &&
            fromID_ != ids.IdentityIDV1.IdentityID.getDefaultInstance()) {
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
       * <code>.ids.IdentityID from_i_d = 2;</code>
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
       * <code>.ids.IdentityID from_i_d = 2;</code>
       */
      public ids.IdentityIDV1.IdentityID.Builder getFromIDBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getFromIDFieldBuilder().getBuilder();
      }
      /**
       * <code>.ids.IdentityID from_i_d = 2;</code>
       */
      public ids.IdentityIDV1.IdentityIDOrBuilder getFromIDOrBuilder() {
        if (fromIDBuilder_ != null) {
          return fromIDBuilder_.getMessageOrBuilder();
        } else {
          return fromID_ == null ?
              ids.IdentityIDV1.IdentityID.getDefaultInstance() : fromID_;
        }
      }
      /**
       * <code>.ids.IdentityID from_i_d = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ids.IdentityIDV1.IdentityID, ids.IdentityIDV1.IdentityID.Builder, ids.IdentityIDV1.IdentityIDOrBuilder> 
          getFromIDFieldBuilder() {
        if (fromIDBuilder_ == null) {
          fromIDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ids.IdentityIDV1.IdentityID, ids.IdentityIDV1.IdentityID.Builder, ids.IdentityIDV1.IdentityIDOrBuilder>(
                  getFromID(),
                  getParentForChildren(),
                  isClean());
          fromID_ = null;
        }
        return fromIDBuilder_;
      }

      private ids.AssetIDV1.AssetID assetID_;
      private com.google.protobuf.SingleFieldBuilderV3<
          ids.AssetIDV1.AssetID, ids.AssetIDV1.AssetID.Builder, ids.AssetIDV1.AssetIDOrBuilder> assetIDBuilder_;
      /**
       * <code>.ids.AssetID asset_i_d = 3;</code>
       * @return Whether the assetID field is set.
       */
      public boolean hasAssetID() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>.ids.AssetID asset_i_d = 3;</code>
       * @return The assetID.
       */
      public ids.AssetIDV1.AssetID getAssetID() {
        if (assetIDBuilder_ == null) {
          return assetID_ == null ? ids.AssetIDV1.AssetID.getDefaultInstance() : assetID_;
        } else {
          return assetIDBuilder_.getMessage();
        }
      }
      /**
       * <code>.ids.AssetID asset_i_d = 3;</code>
       */
      public Builder setAssetID(ids.AssetIDV1.AssetID value) {
        if (assetIDBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          assetID_ = value;
        } else {
          assetIDBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.ids.AssetID asset_i_d = 3;</code>
       */
      public Builder setAssetID(
          ids.AssetIDV1.AssetID.Builder builderForValue) {
        if (assetIDBuilder_ == null) {
          assetID_ = builderForValue.build();
        } else {
          assetIDBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.ids.AssetID asset_i_d = 3;</code>
       */
      public Builder mergeAssetID(ids.AssetIDV1.AssetID value) {
        if (assetIDBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
            assetID_ != null &&
            assetID_ != ids.AssetIDV1.AssetID.getDefaultInstance()) {
            getAssetIDBuilder().mergeFrom(value);
          } else {
            assetID_ = value;
          }
        } else {
          assetIDBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.ids.AssetID asset_i_d = 3;</code>
       */
      public Builder clearAssetID() {
        bitField0_ = (bitField0_ & ~0x00000004);
        assetID_ = null;
        if (assetIDBuilder_ != null) {
          assetIDBuilder_.dispose();
          assetIDBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.ids.AssetID asset_i_d = 3;</code>
       */
      public ids.AssetIDV1.AssetID.Builder getAssetIDBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getAssetIDFieldBuilder().getBuilder();
      }
      /**
       * <code>.ids.AssetID asset_i_d = 3;</code>
       */
      public ids.AssetIDV1.AssetIDOrBuilder getAssetIDOrBuilder() {
        if (assetIDBuilder_ != null) {
          return assetIDBuilder_.getMessageOrBuilder();
        } else {
          return assetID_ == null ?
              ids.AssetIDV1.AssetID.getDefaultInstance() : assetID_;
        }
      }
      /**
       * <code>.ids.AssetID asset_i_d = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ids.AssetIDV1.AssetID, ids.AssetIDV1.AssetID.Builder, ids.AssetIDV1.AssetIDOrBuilder> 
          getAssetIDFieldBuilder() {
        if (assetIDBuilder_ == null) {
          assetIDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ids.AssetIDV1.AssetID, ids.AssetIDV1.AssetID.Builder, ids.AssetIDV1.AssetIDOrBuilder>(
                  getAssetID(),
                  getParentForChildren(),
                  isClean());
          assetID_ = null;
        }
        return assetIDBuilder_;
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


      // @@protoc_insertion_point(builder_scope:assets.transactions.renumerate.Message)
    }

    // @@protoc_insertion_point(class_scope:assets.transactions.renumerate.Message)
    private static final assets.transactions.renumerate.MessageV1.Message DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new assets.transactions.renumerate.MessageV1.Message();
    }

    public static assets.transactions.renumerate.MessageV1.Message getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Message>
        PARSER = new com.google.protobuf.AbstractParser<Message>() {
      @java.lang.Override
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

    @java.lang.Override
    public com.google.protobuf.Parser<Message> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public assets.transactions.renumerate.MessageV1.Message getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assets_transactions_renumerate_Message_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assets_transactions_renumerate_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@modules/assets/internal/transactions/r" +
      "enumerate/message.v1.proto\022\036assets.trans" +
      "actions.renumerate\032 schema/ids/base/asse" +
      "tID.v1.proto\032#schema/ids/base/identityID" +
      ".v1.proto\"[\n\007Message\022\014\n\004from\030\001 \001(\t\022!\n\010fr" +
      "om_i_d\030\002 \001(\0132\017.ids.IdentityID\022\037\n\tasset_i" +
      "_d\030\003 \001(\0132\014.ids.AssetIDb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ids.AssetIDV1.getDescriptor(),
          ids.IdentityIDV1.getDescriptor(),
        });
    internal_static_assets_transactions_renumerate_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assets_transactions_renumerate_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assets_transactions_renumerate_Message_descriptor,
        new java.lang.String[] { "From", "FromID", "AssetID", });
    ids.AssetIDV1.getDescriptor();
    ids.IdentityIDV1.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}