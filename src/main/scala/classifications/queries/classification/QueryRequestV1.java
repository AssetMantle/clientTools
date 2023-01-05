// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/classifications/internal/queries/classification/queryRequest.v1.proto

package classifications.queries.classification;

public final class QueryRequestV1 {
  private QueryRequestV1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QueryRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:classifications.queries.classification.QueryRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ids.ClassificationID classification_i_d = 1;</code>
     * @return Whether the classificationID field is set.
     */
    boolean hasClassificationID();
    /**
     * <code>.ids.ClassificationID classification_i_d = 1;</code>
     * @return The classificationID.
     */
    ids.ClassificationIDV1.ClassificationID getClassificationID();
    /**
     * <code>.ids.ClassificationID classification_i_d = 1;</code>
     */
    ids.ClassificationIDV1.ClassificationIDOrBuilder getClassificationIDOrBuilder();
  }
  /**
   * Protobuf type {@code classifications.queries.classification.QueryRequest}
   */
  public static final class QueryRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:classifications.queries.classification.QueryRequest)
      QueryRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QueryRequest.newBuilder() to construct.
    private QueryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QueryRequest() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QueryRequest();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return classifications.queries.classification.QueryRequestV1.internal_static_classifications_queries_classification_QueryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return classifications.queries.classification.QueryRequestV1.internal_static_classifications_queries_classification_QueryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              classifications.queries.classification.QueryRequestV1.QueryRequest.class, classifications.queries.classification.QueryRequestV1.QueryRequest.Builder.class);
    }

    public static final int CLASSIFICATION_I_D_FIELD_NUMBER = 1;
    private ids.ClassificationIDV1.ClassificationID classificationID_;
    /**
     * <code>.ids.ClassificationID classification_i_d = 1;</code>
     * @return Whether the classificationID field is set.
     */
    @java.lang.Override
    public boolean hasClassificationID() {
      return classificationID_ != null;
    }
    /**
     * <code>.ids.ClassificationID classification_i_d = 1;</code>
     * @return The classificationID.
     */
    @java.lang.Override
    public ids.ClassificationIDV1.ClassificationID getClassificationID() {
      return classificationID_ == null ? ids.ClassificationIDV1.ClassificationID.getDefaultInstance() : classificationID_;
    }
    /**
     * <code>.ids.ClassificationID classification_i_d = 1;</code>
     */
    @java.lang.Override
    public ids.ClassificationIDV1.ClassificationIDOrBuilder getClassificationIDOrBuilder() {
      return classificationID_ == null ? ids.ClassificationIDV1.ClassificationID.getDefaultInstance() : classificationID_;
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
      if (classificationID_ != null) {
        output.writeMessage(1, getClassificationID());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (classificationID_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getClassificationID());
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
      if (!(obj instanceof classifications.queries.classification.QueryRequestV1.QueryRequest)) {
        return super.equals(obj);
      }
      classifications.queries.classification.QueryRequestV1.QueryRequest other = (classifications.queries.classification.QueryRequestV1.QueryRequest) obj;

      if (hasClassificationID() != other.hasClassificationID()) return false;
      if (hasClassificationID()) {
        if (!getClassificationID()
            .equals(other.getClassificationID())) return false;
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
      if (hasClassificationID()) {
        hash = (37 * hash) + CLASSIFICATION_I_D_FIELD_NUMBER;
        hash = (53 * hash) + getClassificationID().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static classifications.queries.classification.QueryRequestV1.QueryRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static classifications.queries.classification.QueryRequestV1.QueryRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static classifications.queries.classification.QueryRequestV1.QueryRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static classifications.queries.classification.QueryRequestV1.QueryRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static classifications.queries.classification.QueryRequestV1.QueryRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static classifications.queries.classification.QueryRequestV1.QueryRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static classifications.queries.classification.QueryRequestV1.QueryRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static classifications.queries.classification.QueryRequestV1.QueryRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static classifications.queries.classification.QueryRequestV1.QueryRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static classifications.queries.classification.QueryRequestV1.QueryRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static classifications.queries.classification.QueryRequestV1.QueryRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static classifications.queries.classification.QueryRequestV1.QueryRequest parseFrom(
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
    public static Builder newBuilder(classifications.queries.classification.QueryRequestV1.QueryRequest prototype) {
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
     * Protobuf type {@code classifications.queries.classification.QueryRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:classifications.queries.classification.QueryRequest)
        classifications.queries.classification.QueryRequestV1.QueryRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return classifications.queries.classification.QueryRequestV1.internal_static_classifications_queries_classification_QueryRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return classifications.queries.classification.QueryRequestV1.internal_static_classifications_queries_classification_QueryRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                classifications.queries.classification.QueryRequestV1.QueryRequest.class, classifications.queries.classification.QueryRequestV1.QueryRequest.Builder.class);
      }

      // Construct using classifications.queries.classification.QueryRequestV1.QueryRequest.newBuilder()
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
        classificationID_ = null;
        if (classificationIDBuilder_ != null) {
          classificationIDBuilder_.dispose();
          classificationIDBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return classifications.queries.classification.QueryRequestV1.internal_static_classifications_queries_classification_QueryRequest_descriptor;
      }

      @java.lang.Override
      public classifications.queries.classification.QueryRequestV1.QueryRequest getDefaultInstanceForType() {
        return classifications.queries.classification.QueryRequestV1.QueryRequest.getDefaultInstance();
      }

      @java.lang.Override
      public classifications.queries.classification.QueryRequestV1.QueryRequest build() {
        classifications.queries.classification.QueryRequestV1.QueryRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public classifications.queries.classification.QueryRequestV1.QueryRequest buildPartial() {
        classifications.queries.classification.QueryRequestV1.QueryRequest result = new classifications.queries.classification.QueryRequestV1.QueryRequest(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(classifications.queries.classification.QueryRequestV1.QueryRequest result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.classificationID_ = classificationIDBuilder_ == null
              ? classificationID_
              : classificationIDBuilder_.build();
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
        if (other instanceof classifications.queries.classification.QueryRequestV1.QueryRequest) {
          return mergeFrom((classifications.queries.classification.QueryRequestV1.QueryRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(classifications.queries.classification.QueryRequestV1.QueryRequest other) {
        if (other == classifications.queries.classification.QueryRequestV1.QueryRequest.getDefaultInstance()) return this;
        if (other.hasClassificationID()) {
          mergeClassificationID(other.getClassificationID());
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
                    getClassificationIDFieldBuilder().getBuilder(),
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

      private ids.ClassificationIDV1.ClassificationID classificationID_;
      private com.google.protobuf.SingleFieldBuilderV3<
          ids.ClassificationIDV1.ClassificationID, ids.ClassificationIDV1.ClassificationID.Builder, ids.ClassificationIDV1.ClassificationIDOrBuilder> classificationIDBuilder_;
      /**
       * <code>.ids.ClassificationID classification_i_d = 1;</code>
       * @return Whether the classificationID field is set.
       */
      public boolean hasClassificationID() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.ids.ClassificationID classification_i_d = 1;</code>
       * @return The classificationID.
       */
      public ids.ClassificationIDV1.ClassificationID getClassificationID() {
        if (classificationIDBuilder_ == null) {
          return classificationID_ == null ? ids.ClassificationIDV1.ClassificationID.getDefaultInstance() : classificationID_;
        } else {
          return classificationIDBuilder_.getMessage();
        }
      }
      /**
       * <code>.ids.ClassificationID classification_i_d = 1;</code>
       */
      public Builder setClassificationID(ids.ClassificationIDV1.ClassificationID value) {
        if (classificationIDBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          classificationID_ = value;
        } else {
          classificationIDBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ids.ClassificationID classification_i_d = 1;</code>
       */
      public Builder setClassificationID(
          ids.ClassificationIDV1.ClassificationID.Builder builderForValue) {
        if (classificationIDBuilder_ == null) {
          classificationID_ = builderForValue.build();
        } else {
          classificationIDBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ids.ClassificationID classification_i_d = 1;</code>
       */
      public Builder mergeClassificationID(ids.ClassificationIDV1.ClassificationID value) {
        if (classificationIDBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            classificationID_ != null &&
            classificationID_ != ids.ClassificationIDV1.ClassificationID.getDefaultInstance()) {
            getClassificationIDBuilder().mergeFrom(value);
          } else {
            classificationID_ = value;
          }
        } else {
          classificationIDBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ids.ClassificationID classification_i_d = 1;</code>
       */
      public Builder clearClassificationID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        classificationID_ = null;
        if (classificationIDBuilder_ != null) {
          classificationIDBuilder_.dispose();
          classificationIDBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.ids.ClassificationID classification_i_d = 1;</code>
       */
      public ids.ClassificationIDV1.ClassificationID.Builder getClassificationIDBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getClassificationIDFieldBuilder().getBuilder();
      }
      /**
       * <code>.ids.ClassificationID classification_i_d = 1;</code>
       */
      public ids.ClassificationIDV1.ClassificationIDOrBuilder getClassificationIDOrBuilder() {
        if (classificationIDBuilder_ != null) {
          return classificationIDBuilder_.getMessageOrBuilder();
        } else {
          return classificationID_ == null ?
              ids.ClassificationIDV1.ClassificationID.getDefaultInstance() : classificationID_;
        }
      }
      /**
       * <code>.ids.ClassificationID classification_i_d = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ids.ClassificationIDV1.ClassificationID, ids.ClassificationIDV1.ClassificationID.Builder, ids.ClassificationIDV1.ClassificationIDOrBuilder> 
          getClassificationIDFieldBuilder() {
        if (classificationIDBuilder_ == null) {
          classificationIDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ids.ClassificationIDV1.ClassificationID, ids.ClassificationIDV1.ClassificationID.Builder, ids.ClassificationIDV1.ClassificationIDOrBuilder>(
                  getClassificationID(),
                  getParentForChildren(),
                  isClean());
          classificationID_ = null;
        }
        return classificationIDBuilder_;
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


      // @@protoc_insertion_point(builder_scope:classifications.queries.classification.QueryRequest)
    }

    // @@protoc_insertion_point(class_scope:classifications.queries.classification.QueryRequest)
    private static final classifications.queries.classification.QueryRequestV1.QueryRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new classifications.queries.classification.QueryRequestV1.QueryRequest();
    }

    public static classifications.queries.classification.QueryRequestV1.QueryRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QueryRequest>
        PARSER = new com.google.protobuf.AbstractParser<QueryRequest>() {
      @java.lang.Override
      public QueryRequest parsePartialFrom(
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

    public static com.google.protobuf.Parser<QueryRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QueryRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public classifications.queries.classification.QueryRequestV1.QueryRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_classifications_queries_classification_QueryRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_classifications_queries_classification_QueryRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nMmodules/classifications/internal/queri" +
      "es/classification/queryRequest.v1.proto\022" +
      "&classifications.queries.classification\032" +
      ")schema/ids/base/classificationID.v1.pro" +
      "to\"A\n\014QueryRequest\0221\n\022classification_i_d" +
      "\030\001 \001(\0132\025.ids.ClassificationIDb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ids.ClassificationIDV1.getDescriptor(),
        });
    internal_static_classifications_queries_classification_QueryRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_classifications_queries_classification_QueryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_classifications_queries_classification_QueryRequest_descriptor,
        new java.lang.String[] { "ClassificationID", });
    ids.ClassificationIDV1.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
