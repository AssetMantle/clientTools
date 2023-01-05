// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/splits/internal/transactions/wrap/transactionResponse.v1.proto

package splits.transactions.wrap;

public final class TransactionResponseV1 {
  private TransactionResponseV1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TransactionResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:splits.transactions.wrap.TransactionResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool success = 1;</code>
     * @return The success.
     */
    boolean getSuccess();

    /**
     * <pre>
     * TODO define error object
     * </pre>
     *
     * <code>string error = 2;</code>
     * @return The error.
     */
    java.lang.String getError();
    /**
     * <pre>
     * TODO define error object
     * </pre>
     *
     * <code>string error = 2;</code>
     * @return The bytes for error.
     */
    com.google.protobuf.ByteString
        getErrorBytes();
  }
  /**
   * Protobuf type {@code splits.transactions.wrap.TransactionResponse}
   */
  public static final class TransactionResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:splits.transactions.wrap.TransactionResponse)
      TransactionResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TransactionResponse.newBuilder() to construct.
    private TransactionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TransactionResponse() {
      error_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TransactionResponse();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return splits.transactions.wrap.TransactionResponseV1.internal_static_splits_transactions_wrap_TransactionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return splits.transactions.wrap.TransactionResponseV1.internal_static_splits_transactions_wrap_TransactionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              splits.transactions.wrap.TransactionResponseV1.TransactionResponse.class, splits.transactions.wrap.TransactionResponseV1.TransactionResponse.Builder.class);
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
     * <pre>
     * TODO define error object
     * </pre>
     *
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
     * <pre>
     * TODO define error object
     * </pre>
     *
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
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof splits.transactions.wrap.TransactionResponseV1.TransactionResponse)) {
        return super.equals(obj);
      }
      splits.transactions.wrap.TransactionResponseV1.TransactionResponse other = (splits.transactions.wrap.TransactionResponseV1.TransactionResponse) obj;

      if (getSuccess()
          != other.getSuccess()) return false;
      if (!getError()
          .equals(other.getError())) return false;
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
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static splits.transactions.wrap.TransactionResponseV1.TransactionResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static splits.transactions.wrap.TransactionResponseV1.TransactionResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static splits.transactions.wrap.TransactionResponseV1.TransactionResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static splits.transactions.wrap.TransactionResponseV1.TransactionResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static splits.transactions.wrap.TransactionResponseV1.TransactionResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static splits.transactions.wrap.TransactionResponseV1.TransactionResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static splits.transactions.wrap.TransactionResponseV1.TransactionResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static splits.transactions.wrap.TransactionResponseV1.TransactionResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static splits.transactions.wrap.TransactionResponseV1.TransactionResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static splits.transactions.wrap.TransactionResponseV1.TransactionResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static splits.transactions.wrap.TransactionResponseV1.TransactionResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static splits.transactions.wrap.TransactionResponseV1.TransactionResponse parseFrom(
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
    public static Builder newBuilder(splits.transactions.wrap.TransactionResponseV1.TransactionResponse prototype) {
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
     * Protobuf type {@code splits.transactions.wrap.TransactionResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:splits.transactions.wrap.TransactionResponse)
        splits.transactions.wrap.TransactionResponseV1.TransactionResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return splits.transactions.wrap.TransactionResponseV1.internal_static_splits_transactions_wrap_TransactionResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return splits.transactions.wrap.TransactionResponseV1.internal_static_splits_transactions_wrap_TransactionResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                splits.transactions.wrap.TransactionResponseV1.TransactionResponse.class, splits.transactions.wrap.TransactionResponseV1.TransactionResponse.Builder.class);
      }

      // Construct using splits.transactions.wrap.TransactionResponseV1.TransactionResponse.newBuilder()
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
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return splits.transactions.wrap.TransactionResponseV1.internal_static_splits_transactions_wrap_TransactionResponse_descriptor;
      }

      @java.lang.Override
      public splits.transactions.wrap.TransactionResponseV1.TransactionResponse getDefaultInstanceForType() {
        return splits.transactions.wrap.TransactionResponseV1.TransactionResponse.getDefaultInstance();
      }

      @java.lang.Override
      public splits.transactions.wrap.TransactionResponseV1.TransactionResponse build() {
        splits.transactions.wrap.TransactionResponseV1.TransactionResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public splits.transactions.wrap.TransactionResponseV1.TransactionResponse buildPartial() {
        splits.transactions.wrap.TransactionResponseV1.TransactionResponse result = new splits.transactions.wrap.TransactionResponseV1.TransactionResponse(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(splits.transactions.wrap.TransactionResponseV1.TransactionResponse result) {
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
        if (other instanceof splits.transactions.wrap.TransactionResponseV1.TransactionResponse) {
          return mergeFrom((splits.transactions.wrap.TransactionResponseV1.TransactionResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(splits.transactions.wrap.TransactionResponseV1.TransactionResponse other) {
        if (other == splits.transactions.wrap.TransactionResponseV1.TransactionResponse.getDefaultInstance()) return this;
        if (other.getSuccess() != false) {
          setSuccess(other.getSuccess());
        }
        if (!other.getError().isEmpty()) {
          error_ = other.error_;
          bitField0_ |= 0x00000002;
          onChanged();
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
       * <pre>
       * TODO define error object
       * </pre>
       *
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
       * <pre>
       * TODO define error object
       * </pre>
       *
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
       * <pre>
       * TODO define error object
       * </pre>
       *
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
       * <pre>
       * TODO define error object
       * </pre>
       *
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
       * <pre>
       * TODO define error object
       * </pre>
       *
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


      // @@protoc_insertion_point(builder_scope:splits.transactions.wrap.TransactionResponse)
    }

    // @@protoc_insertion_point(class_scope:splits.transactions.wrap.TransactionResponse)
    private static final splits.transactions.wrap.TransactionResponseV1.TransactionResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new splits.transactions.wrap.TransactionResponseV1.TransactionResponse();
    }

    public static splits.transactions.wrap.TransactionResponseV1.TransactionResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TransactionResponse>
        PARSER = new com.google.protobuf.AbstractParser<TransactionResponse>() {
      @java.lang.Override
      public TransactionResponse parsePartialFrom(
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

    public static com.google.protobuf.Parser<TransactionResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TransactionResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public splits.transactions.wrap.TransactionResponseV1.TransactionResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_splits_transactions_wrap_TransactionResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_splits_transactions_wrap_TransactionResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nFmodules/splits/internal/transactions/w" +
      "rap/transactionResponse.v1.proto\022\030splits" +
      ".transactions.wrap\032\024gogoproto/gogo.proto" +
      "\";\n\023TransactionResponse\022\017\n\007success\030\001 \001(\010" +
      "\022\r\n\005error\030\002 \001(\t:\004\210\240\037\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
        });
    internal_static_splits_transactions_wrap_TransactionResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_splits_transactions_wrap_TransactionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_splits_transactions_wrap_TransactionResponse_descriptor,
        new java.lang.String[] { "Success", "Error", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
