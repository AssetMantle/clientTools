// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/splits/internal/queries/ownable/queryRequest.v1.proto

package com.splits.queries.ownable;

/**
 * Protobuf type {@code splits.queries.ownable.QueryRequest}
 */
public final class QueryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:splits.queries.ownable.QueryRequest)
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

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.splits.queries.ownable.QueryRequestV1Proto.internal_static_splits_queries_ownable_QueryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.splits.queries.ownable.QueryRequestV1Proto.internal_static_splits_queries_ownable_QueryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.splits.queries.ownable.QueryRequest.class, com.splits.queries.ownable.QueryRequest.Builder.class);
  }

  public static final int OWNABLE_I_D_FIELD_NUMBER = 1;
  private com.ids.AnyOwnableID ownableID_;
  /**
   * <code>.ids.AnyOwnableID ownable_i_d = 1 [json_name = "ownableID"];</code>
   * @return Whether the ownableID field is set.
   */
  @java.lang.Override
  public boolean hasOwnableID() {
    return ownableID_ != null;
  }
  /**
   * <code>.ids.AnyOwnableID ownable_i_d = 1 [json_name = "ownableID"];</code>
   * @return The ownableID.
   */
  @java.lang.Override
  public com.ids.AnyOwnableID getOwnableID() {
    return ownableID_ == null ? com.ids.AnyOwnableID.getDefaultInstance() : ownableID_;
  }
  /**
   * <code>.ids.AnyOwnableID ownable_i_d = 1 [json_name = "ownableID"];</code>
   */
  @java.lang.Override
  public com.ids.AnyOwnableIDOrBuilder getOwnableIDOrBuilder() {
    return getOwnableID();
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
    if (ownableID_ != null) {
      output.writeMessage(1, getOwnableID());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ownableID_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOwnableID());
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
    if (!(obj instanceof com.splits.queries.ownable.QueryRequest)) {
      return super.equals(obj);
    }
    com.splits.queries.ownable.QueryRequest other = (com.splits.queries.ownable.QueryRequest) obj;

    if (hasOwnableID() != other.hasOwnableID()) return false;
    if (hasOwnableID()) {
      if (!getOwnableID()
          .equals(other.getOwnableID())) return false;
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
    if (hasOwnableID()) {
      hash = (37 * hash) + OWNABLE_I_D_FIELD_NUMBER;
      hash = (53 * hash) + getOwnableID().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.splits.queries.ownable.QueryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.splits.queries.ownable.QueryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.splits.queries.ownable.QueryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.splits.queries.ownable.QueryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.splits.queries.ownable.QueryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.splits.queries.ownable.QueryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.splits.queries.ownable.QueryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.splits.queries.ownable.QueryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.splits.queries.ownable.QueryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.splits.queries.ownable.QueryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.splits.queries.ownable.QueryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.splits.queries.ownable.QueryRequest parseFrom(
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
  public static Builder newBuilder(com.splits.queries.ownable.QueryRequest prototype) {
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
   * Protobuf type {@code splits.queries.ownable.QueryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:splits.queries.ownable.QueryRequest)
      com.splits.queries.ownable.QueryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.splits.queries.ownable.QueryRequestV1Proto.internal_static_splits_queries_ownable_QueryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.splits.queries.ownable.QueryRequestV1Proto.internal_static_splits_queries_ownable_QueryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.splits.queries.ownable.QueryRequest.class, com.splits.queries.ownable.QueryRequest.Builder.class);
    }

    // Construct using com.splits.queries.ownable.QueryRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (ownableIDBuilder_ == null) {
        ownableID_ = null;
      } else {
        ownableID_ = null;
        ownableIDBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.splits.queries.ownable.QueryRequestV1Proto.internal_static_splits_queries_ownable_QueryRequest_descriptor;
    }

    @java.lang.Override
    public com.splits.queries.ownable.QueryRequest getDefaultInstanceForType() {
      return com.splits.queries.ownable.QueryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.splits.queries.ownable.QueryRequest build() {
      com.splits.queries.ownable.QueryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.splits.queries.ownable.QueryRequest buildPartial() {
      com.splits.queries.ownable.QueryRequest result = new com.splits.queries.ownable.QueryRequest(this);
      if (ownableIDBuilder_ == null) {
        result.ownableID_ = ownableID_;
      } else {
        result.ownableID_ = ownableIDBuilder_.build();
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
      if (other instanceof com.splits.queries.ownable.QueryRequest) {
        return mergeFrom((com.splits.queries.ownable.QueryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.splits.queries.ownable.QueryRequest other) {
      if (other == com.splits.queries.ownable.QueryRequest.getDefaultInstance()) return this;
      if (other.hasOwnableID()) {
        mergeOwnableID(other.getOwnableID());
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
                  getOwnableIDFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private com.ids.AnyOwnableID ownableID_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ids.AnyOwnableID, com.ids.AnyOwnableID.Builder, com.ids.AnyOwnableIDOrBuilder> ownableIDBuilder_;
    /**
     * <code>.ids.AnyOwnableID ownable_i_d = 1 [json_name = "ownableID"];</code>
     * @return Whether the ownableID field is set.
     */
    public boolean hasOwnableID() {
      return ownableIDBuilder_ != null || ownableID_ != null;
    }
    /**
     * <code>.ids.AnyOwnableID ownable_i_d = 1 [json_name = "ownableID"];</code>
     * @return The ownableID.
     */
    public com.ids.AnyOwnableID getOwnableID() {
      if (ownableIDBuilder_ == null) {
        return ownableID_ == null ? com.ids.AnyOwnableID.getDefaultInstance() : ownableID_;
      } else {
        return ownableIDBuilder_.getMessage();
      }
    }
    /**
     * <code>.ids.AnyOwnableID ownable_i_d = 1 [json_name = "ownableID"];</code>
     */
    public Builder setOwnableID(com.ids.AnyOwnableID value) {
      if (ownableIDBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ownableID_ = value;
        onChanged();
      } else {
        ownableIDBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ids.AnyOwnableID ownable_i_d = 1 [json_name = "ownableID"];</code>
     */
    public Builder setOwnableID(
        com.ids.AnyOwnableID.Builder builderForValue) {
      if (ownableIDBuilder_ == null) {
        ownableID_ = builderForValue.build();
        onChanged();
      } else {
        ownableIDBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ids.AnyOwnableID ownable_i_d = 1 [json_name = "ownableID"];</code>
     */
    public Builder mergeOwnableID(com.ids.AnyOwnableID value) {
      if (ownableIDBuilder_ == null) {
        if (ownableID_ != null) {
          ownableID_ =
            com.ids.AnyOwnableID.newBuilder(ownableID_).mergeFrom(value).buildPartial();
        } else {
          ownableID_ = value;
        }
        onChanged();
      } else {
        ownableIDBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ids.AnyOwnableID ownable_i_d = 1 [json_name = "ownableID"];</code>
     */
    public Builder clearOwnableID() {
      if (ownableIDBuilder_ == null) {
        ownableID_ = null;
        onChanged();
      } else {
        ownableID_ = null;
        ownableIDBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ids.AnyOwnableID ownable_i_d = 1 [json_name = "ownableID"];</code>
     */
    public com.ids.AnyOwnableID.Builder getOwnableIDBuilder() {
      
      onChanged();
      return getOwnableIDFieldBuilder().getBuilder();
    }
    /**
     * <code>.ids.AnyOwnableID ownable_i_d = 1 [json_name = "ownableID"];</code>
     */
    public com.ids.AnyOwnableIDOrBuilder getOwnableIDOrBuilder() {
      if (ownableIDBuilder_ != null) {
        return ownableIDBuilder_.getMessageOrBuilder();
      } else {
        return ownableID_ == null ?
            com.ids.AnyOwnableID.getDefaultInstance() : ownableID_;
      }
    }
    /**
     * <code>.ids.AnyOwnableID ownable_i_d = 1 [json_name = "ownableID"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ids.AnyOwnableID, com.ids.AnyOwnableID.Builder, com.ids.AnyOwnableIDOrBuilder> 
        getOwnableIDFieldBuilder() {
      if (ownableIDBuilder_ == null) {
        ownableIDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ids.AnyOwnableID, com.ids.AnyOwnableID.Builder, com.ids.AnyOwnableIDOrBuilder>(
                getOwnableID(),
                getParentForChildren(),
                isClean());
        ownableID_ = null;
      }
      return ownableIDBuilder_;
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


    // @@protoc_insertion_point(builder_scope:splits.queries.ownable.QueryRequest)
  }

  // @@protoc_insertion_point(class_scope:splits.queries.ownable.QueryRequest)
  private static final com.splits.queries.ownable.QueryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.splits.queries.ownable.QueryRequest();
  }

  public static com.splits.queries.ownable.QueryRequest getDefaultInstance() {
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
  public com.splits.queries.ownable.QueryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

