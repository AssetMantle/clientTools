// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/transfer/v1/query.proto

package com.ibc.applications.transfer.v1;

/**
 * <pre>
 * QueryDenomHashRequest is the request type for the Query/DenomHash RPC
 * method
 * </pre>
 *
 * Protobuf type {@code ibc.applications.transfer.v1.QueryDenomHashRequest}
 */
public final class QueryDenomHashRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.applications.transfer.v1.QueryDenomHashRequest)
    QueryDenomHashRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryDenomHashRequest.newBuilder() to construct.
  private QueryDenomHashRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryDenomHashRequest() {
    trace_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryDenomHashRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.applications.transfer.v1.QueryProto.internal_static_ibc_applications_transfer_v1_QueryDenomHashRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.applications.transfer.v1.QueryProto.internal_static_ibc_applications_transfer_v1_QueryDenomHashRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.applications.transfer.v1.QueryDenomHashRequest.class, com.ibc.applications.transfer.v1.QueryDenomHashRequest.Builder.class);
  }

  public static final int TRACE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object trace_ = "";
  /**
   * <pre>
   * The denomination trace ([port_id]/[channel_id])+/[denom]
   * </pre>
   *
   * <code>string trace = 1 [json_name = "trace"];</code>
   * @return The trace.
   */
  @java.lang.Override
  public java.lang.String getTrace() {
    java.lang.Object ref = trace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      trace_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The denomination trace ([port_id]/[channel_id])+/[denom]
   * </pre>
   *
   * <code>string trace = 1 [json_name = "trace"];</code>
   * @return The bytes for trace.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTraceBytes() {
    java.lang.Object ref = trace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      trace_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(trace_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, trace_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(trace_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, trace_);
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
    if (!(obj instanceof com.ibc.applications.transfer.v1.QueryDenomHashRequest)) {
      return super.equals(obj);
    }
    com.ibc.applications.transfer.v1.QueryDenomHashRequest other = (com.ibc.applications.transfer.v1.QueryDenomHashRequest) obj;

    if (!getTrace()
        .equals(other.getTrace())) return false;
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
    hash = (37 * hash) + TRACE_FIELD_NUMBER;
    hash = (53 * hash) + getTrace().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.applications.transfer.v1.QueryDenomHashRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.applications.transfer.v1.QueryDenomHashRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.applications.transfer.v1.QueryDenomHashRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.applications.transfer.v1.QueryDenomHashRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.applications.transfer.v1.QueryDenomHashRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.applications.transfer.v1.QueryDenomHashRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.applications.transfer.v1.QueryDenomHashRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.applications.transfer.v1.QueryDenomHashRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.applications.transfer.v1.QueryDenomHashRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ibc.applications.transfer.v1.QueryDenomHashRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.applications.transfer.v1.QueryDenomHashRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.applications.transfer.v1.QueryDenomHashRequest parseFrom(
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
  public static Builder newBuilder(com.ibc.applications.transfer.v1.QueryDenomHashRequest prototype) {
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
   * <pre>
   * QueryDenomHashRequest is the request type for the Query/DenomHash RPC
   * method
   * </pre>
   *
   * Protobuf type {@code ibc.applications.transfer.v1.QueryDenomHashRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.applications.transfer.v1.QueryDenomHashRequest)
      com.ibc.applications.transfer.v1.QueryDenomHashRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.applications.transfer.v1.QueryProto.internal_static_ibc_applications_transfer_v1_QueryDenomHashRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.applications.transfer.v1.QueryProto.internal_static_ibc_applications_transfer_v1_QueryDenomHashRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.applications.transfer.v1.QueryDenomHashRequest.class, com.ibc.applications.transfer.v1.QueryDenomHashRequest.Builder.class);
    }

    // Construct using com.ibc.applications.transfer.v1.QueryDenomHashRequest.newBuilder()
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
      trace_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibc.applications.transfer.v1.QueryProto.internal_static_ibc_applications_transfer_v1_QueryDenomHashRequest_descriptor;
    }

    @java.lang.Override
    public com.ibc.applications.transfer.v1.QueryDenomHashRequest getDefaultInstanceForType() {
      return com.ibc.applications.transfer.v1.QueryDenomHashRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.applications.transfer.v1.QueryDenomHashRequest build() {
      com.ibc.applications.transfer.v1.QueryDenomHashRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.applications.transfer.v1.QueryDenomHashRequest buildPartial() {
      com.ibc.applications.transfer.v1.QueryDenomHashRequest result = new com.ibc.applications.transfer.v1.QueryDenomHashRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ibc.applications.transfer.v1.QueryDenomHashRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.trace_ = trace_;
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
      if (other instanceof com.ibc.applications.transfer.v1.QueryDenomHashRequest) {
        return mergeFrom((com.ibc.applications.transfer.v1.QueryDenomHashRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.applications.transfer.v1.QueryDenomHashRequest other) {
      if (other == com.ibc.applications.transfer.v1.QueryDenomHashRequest.getDefaultInstance()) return this;
      if (!other.getTrace().isEmpty()) {
        trace_ = other.trace_;
        bitField0_ |= 0x00000001;
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
            case 10: {
              trace_ = input.readStringRequireUtf8();
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

    private java.lang.Object trace_ = "";
    /**
     * <pre>
     * The denomination trace ([port_id]/[channel_id])+/[denom]
     * </pre>
     *
     * <code>string trace = 1 [json_name = "trace"];</code>
     * @return The trace.
     */
    public java.lang.String getTrace() {
      java.lang.Object ref = trace_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        trace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The denomination trace ([port_id]/[channel_id])+/[denom]
     * </pre>
     *
     * <code>string trace = 1 [json_name = "trace"];</code>
     * @return The bytes for trace.
     */
    public com.google.protobuf.ByteString
        getTraceBytes() {
      java.lang.Object ref = trace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        trace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The denomination trace ([port_id]/[channel_id])+/[denom]
     * </pre>
     *
     * <code>string trace = 1 [json_name = "trace"];</code>
     * @param value The trace to set.
     * @return This builder for chaining.
     */
    public Builder setTrace(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      trace_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The denomination trace ([port_id]/[channel_id])+/[denom]
     * </pre>
     *
     * <code>string trace = 1 [json_name = "trace"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTrace() {
      trace_ = getDefaultInstance().getTrace();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The denomination trace ([port_id]/[channel_id])+/[denom]
     * </pre>
     *
     * <code>string trace = 1 [json_name = "trace"];</code>
     * @param value The bytes for trace to set.
     * @return This builder for chaining.
     */
    public Builder setTraceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      trace_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:ibc.applications.transfer.v1.QueryDenomHashRequest)
  }

  // @@protoc_insertion_point(class_scope:ibc.applications.transfer.v1.QueryDenomHashRequest)
  private static final com.ibc.applications.transfer.v1.QueryDenomHashRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.applications.transfer.v1.QueryDenomHashRequest();
  }

  public static com.ibc.applications.transfer.v1.QueryDenomHashRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryDenomHashRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryDenomHashRequest>() {
    @java.lang.Override
    public QueryDenomHashRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryDenomHashRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryDenomHashRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.applications.transfer.v1.QueryDenomHashRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

