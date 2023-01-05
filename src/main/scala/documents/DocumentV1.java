// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/documents/base/document.v1.proto

package documents;

public final class DocumentV1 {
  private DocumentV1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DocumentOrBuilder extends
      // @@protoc_insertion_point(interface_extends:documents.Document)
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

    /**
     * <code>.qualified.Immutables immutables = 2;</code>
     * @return Whether the immutables field is set.
     */
    boolean hasImmutables();
    /**
     * <code>.qualified.Immutables immutables = 2;</code>
     * @return The immutables.
     */
    qualified.ImmutablesV1.Immutables getImmutables();
    /**
     * <code>.qualified.Immutables immutables = 2;</code>
     */
    qualified.ImmutablesV1.ImmutablesOrBuilder getImmutablesOrBuilder();

    /**
     * <code>.qualified.Mutables mutables = 3;</code>
     * @return Whether the mutables field is set.
     */
    boolean hasMutables();
    /**
     * <code>.qualified.Mutables mutables = 3;</code>
     * @return The mutables.
     */
    qualified.MutablesV1.Mutables getMutables();
    /**
     * <code>.qualified.Mutables mutables = 3;</code>
     */
    qualified.MutablesV1.MutablesOrBuilder getMutablesOrBuilder();
  }
  /**
   * Protobuf type {@code documents.Document}
   */
  public static final class Document extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:documents.Document)
      DocumentOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Document.newBuilder() to construct.
    private Document(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Document() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Document();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return documents.DocumentV1.internal_static_documents_Document_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return documents.DocumentV1.internal_static_documents_Document_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              documents.DocumentV1.Document.class, documents.DocumentV1.Document.Builder.class);
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

    public static final int IMMUTABLES_FIELD_NUMBER = 2;
    private qualified.ImmutablesV1.Immutables immutables_;
    /**
     * <code>.qualified.Immutables immutables = 2;</code>
     * @return Whether the immutables field is set.
     */
    @java.lang.Override
    public boolean hasImmutables() {
      return immutables_ != null;
    }
    /**
     * <code>.qualified.Immutables immutables = 2;</code>
     * @return The immutables.
     */
    @java.lang.Override
    public qualified.ImmutablesV1.Immutables getImmutables() {
      return immutables_ == null ? qualified.ImmutablesV1.Immutables.getDefaultInstance() : immutables_;
    }
    /**
     * <code>.qualified.Immutables immutables = 2;</code>
     */
    @java.lang.Override
    public qualified.ImmutablesV1.ImmutablesOrBuilder getImmutablesOrBuilder() {
      return immutables_ == null ? qualified.ImmutablesV1.Immutables.getDefaultInstance() : immutables_;
    }

    public static final int MUTABLES_FIELD_NUMBER = 3;
    private qualified.MutablesV1.Mutables mutables_;
    /**
     * <code>.qualified.Mutables mutables = 3;</code>
     * @return Whether the mutables field is set.
     */
    @java.lang.Override
    public boolean hasMutables() {
      return mutables_ != null;
    }
    /**
     * <code>.qualified.Mutables mutables = 3;</code>
     * @return The mutables.
     */
    @java.lang.Override
    public qualified.MutablesV1.Mutables getMutables() {
      return mutables_ == null ? qualified.MutablesV1.Mutables.getDefaultInstance() : mutables_;
    }
    /**
     * <code>.qualified.Mutables mutables = 3;</code>
     */
    @java.lang.Override
    public qualified.MutablesV1.MutablesOrBuilder getMutablesOrBuilder() {
      return mutables_ == null ? qualified.MutablesV1.Mutables.getDefaultInstance() : mutables_;
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
      if (immutables_ != null) {
        output.writeMessage(2, getImmutables());
      }
      if (mutables_ != null) {
        output.writeMessage(3, getMutables());
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
      if (immutables_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getImmutables());
      }
      if (mutables_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getMutables());
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
      if (!(obj instanceof documents.DocumentV1.Document)) {
        return super.equals(obj);
      }
      documents.DocumentV1.Document other = (documents.DocumentV1.Document) obj;

      if (hasClassificationID() != other.hasClassificationID()) return false;
      if (hasClassificationID()) {
        if (!getClassificationID()
            .equals(other.getClassificationID())) return false;
      }
      if (hasImmutables() != other.hasImmutables()) return false;
      if (hasImmutables()) {
        if (!getImmutables()
            .equals(other.getImmutables())) return false;
      }
      if (hasMutables() != other.hasMutables()) return false;
      if (hasMutables()) {
        if (!getMutables()
            .equals(other.getMutables())) return false;
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
      if (hasImmutables()) {
        hash = (37 * hash) + IMMUTABLES_FIELD_NUMBER;
        hash = (53 * hash) + getImmutables().hashCode();
      }
      if (hasMutables()) {
        hash = (37 * hash) + MUTABLES_FIELD_NUMBER;
        hash = (53 * hash) + getMutables().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static documents.DocumentV1.Document parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static documents.DocumentV1.Document parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static documents.DocumentV1.Document parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static documents.DocumentV1.Document parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static documents.DocumentV1.Document parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static documents.DocumentV1.Document parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static documents.DocumentV1.Document parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static documents.DocumentV1.Document parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static documents.DocumentV1.Document parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static documents.DocumentV1.Document parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static documents.DocumentV1.Document parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static documents.DocumentV1.Document parseFrom(
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
    public static Builder newBuilder(documents.DocumentV1.Document prototype) {
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
     * Protobuf type {@code documents.Document}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:documents.Document)
        documents.DocumentV1.DocumentOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return documents.DocumentV1.internal_static_documents_Document_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return documents.DocumentV1.internal_static_documents_Document_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                documents.DocumentV1.Document.class, documents.DocumentV1.Document.Builder.class);
      }

      // Construct using documents.DocumentV1.Document.newBuilder()
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
        immutables_ = null;
        if (immutablesBuilder_ != null) {
          immutablesBuilder_.dispose();
          immutablesBuilder_ = null;
        }
        mutables_ = null;
        if (mutablesBuilder_ != null) {
          mutablesBuilder_.dispose();
          mutablesBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return documents.DocumentV1.internal_static_documents_Document_descriptor;
      }

      @java.lang.Override
      public documents.DocumentV1.Document getDefaultInstanceForType() {
        return documents.DocumentV1.Document.getDefaultInstance();
      }

      @java.lang.Override
      public documents.DocumentV1.Document build() {
        documents.DocumentV1.Document result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public documents.DocumentV1.Document buildPartial() {
        documents.DocumentV1.Document result = new documents.DocumentV1.Document(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(documents.DocumentV1.Document result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.classificationID_ = classificationIDBuilder_ == null
              ? classificationID_
              : classificationIDBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.immutables_ = immutablesBuilder_ == null
              ? immutables_
              : immutablesBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.mutables_ = mutablesBuilder_ == null
              ? mutables_
              : mutablesBuilder_.build();
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
        if (other instanceof documents.DocumentV1.Document) {
          return mergeFrom((documents.DocumentV1.Document)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(documents.DocumentV1.Document other) {
        if (other == documents.DocumentV1.Document.getDefaultInstance()) return this;
        if (other.hasClassificationID()) {
          mergeClassificationID(other.getClassificationID());
        }
        if (other.hasImmutables()) {
          mergeImmutables(other.getImmutables());
        }
        if (other.hasMutables()) {
          mergeMutables(other.getMutables());
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
              case 18: {
                input.readMessage(
                    getImmutablesFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                input.readMessage(
                    getMutablesFieldBuilder().getBuilder(),
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

      private qualified.ImmutablesV1.Immutables immutables_;
      private com.google.protobuf.SingleFieldBuilderV3<
          qualified.ImmutablesV1.Immutables, qualified.ImmutablesV1.Immutables.Builder, qualified.ImmutablesV1.ImmutablesOrBuilder> immutablesBuilder_;
      /**
       * <code>.qualified.Immutables immutables = 2;</code>
       * @return Whether the immutables field is set.
       */
      public boolean hasImmutables() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.qualified.Immutables immutables = 2;</code>
       * @return The immutables.
       */
      public qualified.ImmutablesV1.Immutables getImmutables() {
        if (immutablesBuilder_ == null) {
          return immutables_ == null ? qualified.ImmutablesV1.Immutables.getDefaultInstance() : immutables_;
        } else {
          return immutablesBuilder_.getMessage();
        }
      }
      /**
       * <code>.qualified.Immutables immutables = 2;</code>
       */
      public Builder setImmutables(qualified.ImmutablesV1.Immutables value) {
        if (immutablesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          immutables_ = value;
        } else {
          immutablesBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.qualified.Immutables immutables = 2;</code>
       */
      public Builder setImmutables(
          qualified.ImmutablesV1.Immutables.Builder builderForValue) {
        if (immutablesBuilder_ == null) {
          immutables_ = builderForValue.build();
        } else {
          immutablesBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.qualified.Immutables immutables = 2;</code>
       */
      public Builder mergeImmutables(qualified.ImmutablesV1.Immutables value) {
        if (immutablesBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            immutables_ != null &&
            immutables_ != qualified.ImmutablesV1.Immutables.getDefaultInstance()) {
            getImmutablesBuilder().mergeFrom(value);
          } else {
            immutables_ = value;
          }
        } else {
          immutablesBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.qualified.Immutables immutables = 2;</code>
       */
      public Builder clearImmutables() {
        bitField0_ = (bitField0_ & ~0x00000002);
        immutables_ = null;
        if (immutablesBuilder_ != null) {
          immutablesBuilder_.dispose();
          immutablesBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.qualified.Immutables immutables = 2;</code>
       */
      public qualified.ImmutablesV1.Immutables.Builder getImmutablesBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getImmutablesFieldBuilder().getBuilder();
      }
      /**
       * <code>.qualified.Immutables immutables = 2;</code>
       */
      public qualified.ImmutablesV1.ImmutablesOrBuilder getImmutablesOrBuilder() {
        if (immutablesBuilder_ != null) {
          return immutablesBuilder_.getMessageOrBuilder();
        } else {
          return immutables_ == null ?
              qualified.ImmutablesV1.Immutables.getDefaultInstance() : immutables_;
        }
      }
      /**
       * <code>.qualified.Immutables immutables = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          qualified.ImmutablesV1.Immutables, qualified.ImmutablesV1.Immutables.Builder, qualified.ImmutablesV1.ImmutablesOrBuilder> 
          getImmutablesFieldBuilder() {
        if (immutablesBuilder_ == null) {
          immutablesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              qualified.ImmutablesV1.Immutables, qualified.ImmutablesV1.Immutables.Builder, qualified.ImmutablesV1.ImmutablesOrBuilder>(
                  getImmutables(),
                  getParentForChildren(),
                  isClean());
          immutables_ = null;
        }
        return immutablesBuilder_;
      }

      private qualified.MutablesV1.Mutables mutables_;
      private com.google.protobuf.SingleFieldBuilderV3<
          qualified.MutablesV1.Mutables, qualified.MutablesV1.Mutables.Builder, qualified.MutablesV1.MutablesOrBuilder> mutablesBuilder_;
      /**
       * <code>.qualified.Mutables mutables = 3;</code>
       * @return Whether the mutables field is set.
       */
      public boolean hasMutables() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>.qualified.Mutables mutables = 3;</code>
       * @return The mutables.
       */
      public qualified.MutablesV1.Mutables getMutables() {
        if (mutablesBuilder_ == null) {
          return mutables_ == null ? qualified.MutablesV1.Mutables.getDefaultInstance() : mutables_;
        } else {
          return mutablesBuilder_.getMessage();
        }
      }
      /**
       * <code>.qualified.Mutables mutables = 3;</code>
       */
      public Builder setMutables(qualified.MutablesV1.Mutables value) {
        if (mutablesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          mutables_ = value;
        } else {
          mutablesBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.qualified.Mutables mutables = 3;</code>
       */
      public Builder setMutables(
          qualified.MutablesV1.Mutables.Builder builderForValue) {
        if (mutablesBuilder_ == null) {
          mutables_ = builderForValue.build();
        } else {
          mutablesBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.qualified.Mutables mutables = 3;</code>
       */
      public Builder mergeMutables(qualified.MutablesV1.Mutables value) {
        if (mutablesBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
            mutables_ != null &&
            mutables_ != qualified.MutablesV1.Mutables.getDefaultInstance()) {
            getMutablesBuilder().mergeFrom(value);
          } else {
            mutables_ = value;
          }
        } else {
          mutablesBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.qualified.Mutables mutables = 3;</code>
       */
      public Builder clearMutables() {
        bitField0_ = (bitField0_ & ~0x00000004);
        mutables_ = null;
        if (mutablesBuilder_ != null) {
          mutablesBuilder_.dispose();
          mutablesBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.qualified.Mutables mutables = 3;</code>
       */
      public qualified.MutablesV1.Mutables.Builder getMutablesBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getMutablesFieldBuilder().getBuilder();
      }
      /**
       * <code>.qualified.Mutables mutables = 3;</code>
       */
      public qualified.MutablesV1.MutablesOrBuilder getMutablesOrBuilder() {
        if (mutablesBuilder_ != null) {
          return mutablesBuilder_.getMessageOrBuilder();
        } else {
          return mutables_ == null ?
              qualified.MutablesV1.Mutables.getDefaultInstance() : mutables_;
        }
      }
      /**
       * <code>.qualified.Mutables mutables = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          qualified.MutablesV1.Mutables, qualified.MutablesV1.Mutables.Builder, qualified.MutablesV1.MutablesOrBuilder> 
          getMutablesFieldBuilder() {
        if (mutablesBuilder_ == null) {
          mutablesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              qualified.MutablesV1.Mutables, qualified.MutablesV1.Mutables.Builder, qualified.MutablesV1.MutablesOrBuilder>(
                  getMutables(),
                  getParentForChildren(),
                  isClean());
          mutables_ = null;
        }
        return mutablesBuilder_;
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


      // @@protoc_insertion_point(builder_scope:documents.Document)
    }

    // @@protoc_insertion_point(class_scope:documents.Document)
    private static final documents.DocumentV1.Document DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new documents.DocumentV1.Document();
    }

    public static documents.DocumentV1.Document getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Document>
        PARSER = new com.google.protobuf.AbstractParser<Document>() {
      @java.lang.Override
      public Document parsePartialFrom(
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

    public static com.google.protobuf.Parser<Document> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Document> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public documents.DocumentV1.Document getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_documents_Document_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_documents_Document_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'schema/documents/base/document.v1.prot" +
      "o\022\tdocuments\032)schema/ids/base/classifica" +
      "tionID.v1.proto\032)schema/qualified/base/i" +
      "mmutables.v1.proto\032\'schema/qualified/bas" +
      "e/mutables.v1.proto\032\024gogoproto/gogo.prot" +
      "o\"\225\001\n\010Document\0221\n\022classification_i_d\030\001 \001" +
      "(\0132\025.ids.ClassificationID\022)\n\nimmutables\030" +
      "\002 \001(\0132\025.qualified.Immutables\022%\n\010mutables" +
      "\030\003 \001(\0132\023.qualified.Mutables:\004\210\240\037\000b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ids.ClassificationIDV1.getDescriptor(),
          qualified.ImmutablesV1.getDescriptor(),
          qualified.MutablesV1.getDescriptor(),
          com.google.protobuf.GoGoProtos.getDescriptor(),
        });
    internal_static_documents_Document_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_documents_Document_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_documents_Document_descriptor,
        new java.lang.String[] { "ClassificationID", "Immutables", "Mutables", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    ids.ClassificationIDV1.getDescriptor();
    qualified.ImmutablesV1.getDescriptor();
    qualified.MutablesV1.getDescriptor();
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
