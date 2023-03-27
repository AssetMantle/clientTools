// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/documents/base/document.v1.proto

package com.documents;

/**
 * Protobuf type {@code documents.Document}
 */
public final class Document extends
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

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new Document();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return DocumentV1Proto.internal_static_documents_Document_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return DocumentV1Proto.internal_static_documents_Document_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Document.class, Builder.class);
  }

  public static final int CLASSIFICATION_I_D_FIELD_NUMBER = 1;
  private com.ids.ClassificationID classificationID_;
  /**
   * <code>.ids.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
   * @return Whether the classificationID field is set.
   */
  @Override
  public boolean hasClassificationID() {
    return classificationID_ != null;
  }
  /**
   * <code>.ids.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
   * @return The classificationID.
   */
  @Override
  public com.ids.ClassificationID getClassificationID() {
    return classificationID_ == null ? com.ids.ClassificationID.getDefaultInstance() : classificationID_;
  }
  /**
   * <code>.ids.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
   */
  @Override
  public com.ids.ClassificationIDOrBuilder getClassificationIDOrBuilder() {
    return classificationID_ == null ? com.ids.ClassificationID.getDefaultInstance() : classificationID_;
  }

  public static final int IMMUTABLES_FIELD_NUMBER = 2;
  private com.qualified.Immutables immutables_;
  /**
   * <code>.qualified.Immutables immutables = 2 [json_name = "immutables"];</code>
   * @return Whether the immutables field is set.
   */
  @Override
  public boolean hasImmutables() {
    return immutables_ != null;
  }
  /**
   * <code>.qualified.Immutables immutables = 2 [json_name = "immutables"];</code>
   * @return The immutables.
   */
  @Override
  public com.qualified.Immutables getImmutables() {
    return immutables_ == null ? com.qualified.Immutables.getDefaultInstance() : immutables_;
  }
  /**
   * <code>.qualified.Immutables immutables = 2 [json_name = "immutables"];</code>
   */
  @Override
  public com.qualified.ImmutablesOrBuilder getImmutablesOrBuilder() {
    return immutables_ == null ? com.qualified.Immutables.getDefaultInstance() : immutables_;
  }

  public static final int MUTABLES_FIELD_NUMBER = 3;
  private com.qualified.Mutables mutables_;
  /**
   * <code>.qualified.Mutables mutables = 3 [json_name = "mutables"];</code>
   * @return Whether the mutables field is set.
   */
  @Override
  public boolean hasMutables() {
    return mutables_ != null;
  }
  /**
   * <code>.qualified.Mutables mutables = 3 [json_name = "mutables"];</code>
   * @return The mutables.
   */
  @Override
  public com.qualified.Mutables getMutables() {
    return mutables_ == null ? com.qualified.Mutables.getDefaultInstance() : mutables_;
  }
  /**
   * <code>.qualified.Mutables mutables = 3 [json_name = "mutables"];</code>
   */
  @Override
  public com.qualified.MutablesOrBuilder getMutablesOrBuilder() {
    return mutables_ == null ? com.qualified.Mutables.getDefaultInstance() : mutables_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
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

  @Override
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

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Document)) {
      return super.equals(obj);
    }
    Document other = (Document) obj;

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

  @Override
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

  public static Document parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Document parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Document parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Document parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Document parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Document parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Document parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Document parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Document parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Document parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Document parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Document parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Document prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code documents.Document}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:documents.Document)
      DocumentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return DocumentV1Proto.internal_static_documents_Document_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DocumentV1Proto.internal_static_documents_Document_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Document.class, Builder.class);
    }

    // Construct using com.documents.Document.newBuilder()
    private Builder() {

    }

    private Builder(
        BuilderParent parent) {
      super(parent);

    }
    @Override
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

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return DocumentV1Proto.internal_static_documents_Document_descriptor;
    }

    @Override
    public Document getDefaultInstanceForType() {
      return Document.getDefaultInstance();
    }

    @Override
    public Document build() {
      Document result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Document buildPartial() {
      Document result = new Document(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(Document result) {
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

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Document) {
        return mergeFrom((Document)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Document other) {
      if (other == Document.getDefaultInstance()) return this;
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

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new NullPointerException();
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

    private com.ids.ClassificationID classificationID_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ids.ClassificationID, com.ids.ClassificationID.Builder, com.ids.ClassificationIDOrBuilder> classificationIDBuilder_;
    /**
     * <code>.ids.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
     * @return Whether the classificationID field is set.
     */
    public boolean hasClassificationID() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.ids.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
     * @return The classificationID.
     */
    public com.ids.ClassificationID getClassificationID() {
      if (classificationIDBuilder_ == null) {
        return classificationID_ == null ? com.ids.ClassificationID.getDefaultInstance() : classificationID_;
      } else {
        return classificationIDBuilder_.getMessage();
      }
    }
    /**
     * <code>.ids.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
     */
    public Builder setClassificationID(com.ids.ClassificationID value) {
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
     * <code>.ids.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
     */
    public Builder setClassificationID(
        com.ids.ClassificationID.Builder builderForValue) {
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
     * <code>.ids.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
     */
    public Builder mergeClassificationID(com.ids.ClassificationID value) {
      if (classificationIDBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          classificationID_ != null &&
          classificationID_ != com.ids.ClassificationID.getDefaultInstance()) {
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
     * <code>.ids.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
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
     * <code>.ids.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
     */
    public com.ids.ClassificationID.Builder getClassificationIDBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getClassificationIDFieldBuilder().getBuilder();
    }
    /**
     * <code>.ids.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
     */
    public com.ids.ClassificationIDOrBuilder getClassificationIDOrBuilder() {
      if (classificationIDBuilder_ != null) {
        return classificationIDBuilder_.getMessageOrBuilder();
      } else {
        return classificationID_ == null ?
            com.ids.ClassificationID.getDefaultInstance() : classificationID_;
      }
    }
    /**
     * <code>.ids.ClassificationID classification_i_d = 1 [json_name = "classificationID"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ids.ClassificationID, com.ids.ClassificationID.Builder, com.ids.ClassificationIDOrBuilder> 
        getClassificationIDFieldBuilder() {
      if (classificationIDBuilder_ == null) {
        classificationIDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ids.ClassificationID, com.ids.ClassificationID.Builder, com.ids.ClassificationIDOrBuilder>(
                getClassificationID(),
                getParentForChildren(),
                isClean());
        classificationID_ = null;
      }
      return classificationIDBuilder_;
    }

    private com.qualified.Immutables immutables_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.qualified.Immutables, com.qualified.Immutables.Builder, com.qualified.ImmutablesOrBuilder> immutablesBuilder_;
    /**
     * <code>.qualified.Immutables immutables = 2 [json_name = "immutables"];</code>
     * @return Whether the immutables field is set.
     */
    public boolean hasImmutables() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.qualified.Immutables immutables = 2 [json_name = "immutables"];</code>
     * @return The immutables.
     */
    public com.qualified.Immutables getImmutables() {
      if (immutablesBuilder_ == null) {
        return immutables_ == null ? com.qualified.Immutables.getDefaultInstance() : immutables_;
      } else {
        return immutablesBuilder_.getMessage();
      }
    }
    /**
     * <code>.qualified.Immutables immutables = 2 [json_name = "immutables"];</code>
     */
    public Builder setImmutables(com.qualified.Immutables value) {
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
     * <code>.qualified.Immutables immutables = 2 [json_name = "immutables"];</code>
     */
    public Builder setImmutables(
        com.qualified.Immutables.Builder builderForValue) {
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
     * <code>.qualified.Immutables immutables = 2 [json_name = "immutables"];</code>
     */
    public Builder mergeImmutables(com.qualified.Immutables value) {
      if (immutablesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          immutables_ != null &&
          immutables_ != com.qualified.Immutables.getDefaultInstance()) {
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
     * <code>.qualified.Immutables immutables = 2 [json_name = "immutables"];</code>
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
     * <code>.qualified.Immutables immutables = 2 [json_name = "immutables"];</code>
     */
    public com.qualified.Immutables.Builder getImmutablesBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getImmutablesFieldBuilder().getBuilder();
    }
    /**
     * <code>.qualified.Immutables immutables = 2 [json_name = "immutables"];</code>
     */
    public com.qualified.ImmutablesOrBuilder getImmutablesOrBuilder() {
      if (immutablesBuilder_ != null) {
        return immutablesBuilder_.getMessageOrBuilder();
      } else {
        return immutables_ == null ?
            com.qualified.Immutables.getDefaultInstance() : immutables_;
      }
    }
    /**
     * <code>.qualified.Immutables immutables = 2 [json_name = "immutables"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.qualified.Immutables, com.qualified.Immutables.Builder, com.qualified.ImmutablesOrBuilder> 
        getImmutablesFieldBuilder() {
      if (immutablesBuilder_ == null) {
        immutablesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.qualified.Immutables, com.qualified.Immutables.Builder, com.qualified.ImmutablesOrBuilder>(
                getImmutables(),
                getParentForChildren(),
                isClean());
        immutables_ = null;
      }
      return immutablesBuilder_;
    }

    private com.qualified.Mutables mutables_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.qualified.Mutables, com.qualified.Mutables.Builder, com.qualified.MutablesOrBuilder> mutablesBuilder_;
    /**
     * <code>.qualified.Mutables mutables = 3 [json_name = "mutables"];</code>
     * @return Whether the mutables field is set.
     */
    public boolean hasMutables() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.qualified.Mutables mutables = 3 [json_name = "mutables"];</code>
     * @return The mutables.
     */
    public com.qualified.Mutables getMutables() {
      if (mutablesBuilder_ == null) {
        return mutables_ == null ? com.qualified.Mutables.getDefaultInstance() : mutables_;
      } else {
        return mutablesBuilder_.getMessage();
      }
    }
    /**
     * <code>.qualified.Mutables mutables = 3 [json_name = "mutables"];</code>
     */
    public Builder setMutables(com.qualified.Mutables value) {
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
     * <code>.qualified.Mutables mutables = 3 [json_name = "mutables"];</code>
     */
    public Builder setMutables(
        com.qualified.Mutables.Builder builderForValue) {
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
     * <code>.qualified.Mutables mutables = 3 [json_name = "mutables"];</code>
     */
    public Builder mergeMutables(com.qualified.Mutables value) {
      if (mutablesBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          mutables_ != null &&
          mutables_ != com.qualified.Mutables.getDefaultInstance()) {
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
     * <code>.qualified.Mutables mutables = 3 [json_name = "mutables"];</code>
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
     * <code>.qualified.Mutables mutables = 3 [json_name = "mutables"];</code>
     */
    public com.qualified.Mutables.Builder getMutablesBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getMutablesFieldBuilder().getBuilder();
    }
    /**
     * <code>.qualified.Mutables mutables = 3 [json_name = "mutables"];</code>
     */
    public com.qualified.MutablesOrBuilder getMutablesOrBuilder() {
      if (mutablesBuilder_ != null) {
        return mutablesBuilder_.getMessageOrBuilder();
      } else {
        return mutables_ == null ?
            com.qualified.Mutables.getDefaultInstance() : mutables_;
      }
    }
    /**
     * <code>.qualified.Mutables mutables = 3 [json_name = "mutables"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.qualified.Mutables, com.qualified.Mutables.Builder, com.qualified.MutablesOrBuilder> 
        getMutablesFieldBuilder() {
      if (mutablesBuilder_ == null) {
        mutablesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.qualified.Mutables, com.qualified.Mutables.Builder, com.qualified.MutablesOrBuilder>(
                getMutables(),
                getParentForChildren(),
                isClean());
        mutables_ = null;
      }
      return mutablesBuilder_;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:documents.Document)
  }

  // @@protoc_insertion_point(class_scope:documents.Document)
  private static final Document DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Document();
  }

  public static Document getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Document>
      PARSER = new com.google.protobuf.AbstractParser<Document>() {
    @Override
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

  @Override
  public com.google.protobuf.Parser<Document> getParserForType() {
    return PARSER;
  }

  @Override
  public Document getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

