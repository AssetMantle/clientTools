// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/query/v1beta1/pagination.proto

package com.cosmos.base.query.v1beta1;

/**
 * <pre>
 * PageRequest is to be embedded in gRPC request messages for efficient
 * pagination. Ex:
 *
 *  message SomeRequest {
 *          Foo some_parameter = 1;
 *          PageRequest pagination = 2;
 *  }
 * </pre>
 *
 * Protobuf type {@code cosmos.base.query.v1beta1.PageRequest}
 */
public final class PageRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.base.query.v1beta1.PageRequest)
    PageRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PageRequest.newBuilder() to construct.
  private PageRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PageRequest() {
    key_ = com.google.protobuf.ByteString.EMPTY;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new PageRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return PaginationProto.internal_static_cosmos_base_query_v1beta1_PageRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return PaginationProto.internal_static_cosmos_base_query_v1beta1_PageRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            PageRequest.class, Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * key is a value returned in PageResponse.next_key to begin
   * querying the next page most efficiently. Only one of offset or key
   * should be set.
   * </pre>
   *
   * <code>bytes key = 1 [json_name = "key"];</code>
   * @return The key.
   */
  @Override
  public com.google.protobuf.ByteString getKey() {
    return key_;
  }

  public static final int OFFSET_FIELD_NUMBER = 2;
  private long offset_ = 0L;
  /**
   * <pre>
   * offset is a numeric offset that can be used when key is unavailable.
   * It is less efficient than using key. Only one of offset or key should
   * be set.
   * </pre>
   *
   * <code>uint64 offset = 2 [json_name = "offset"];</code>
   * @return The offset.
   */
  @Override
  public long getOffset() {
    return offset_;
  }

  public static final int LIMIT_FIELD_NUMBER = 3;
  private long limit_ = 0L;
  /**
   * <pre>
   * limit is the total number of results to be returned in the result page.
   * If left empty it will default to a value to be set by each app.
   * </pre>
   *
   * <code>uint64 limit = 3 [json_name = "limit"];</code>
   * @return The limit.
   */
  @Override
  public long getLimit() {
    return limit_;
  }

  public static final int COUNT_TOTAL_FIELD_NUMBER = 4;
  private boolean countTotal_ = false;
  /**
   * <pre>
   * count_total is set to true  to indicate that the result set should include
   * a count of the total number of items available for pagination in UIs.
   * count_total is only respected when offset is used. It is ignored when key
   * is set.
   * </pre>
   *
   * <code>bool count_total = 4 [json_name = "countTotal"];</code>
   * @return The countTotal.
   */
  @Override
  public boolean getCountTotal() {
    return countTotal_;
  }

  public static final int REVERSE_FIELD_NUMBER = 5;
  private boolean reverse_ = false;
  /**
   * <pre>
   * reverse is set to true if results are to be returned in the descending order.
   *
   * Since: cosmos-sdk 0.43
   * </pre>
   *
   * <code>bool reverse = 5 [json_name = "reverse"];</code>
   * @return The reverse.
   */
  @Override
  public boolean getReverse() {
    return reverse_;
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
    if (!key_.isEmpty()) {
      output.writeBytes(1, key_);
    }
    if (offset_ != 0L) {
      output.writeUInt64(2, offset_);
    }
    if (limit_ != 0L) {
      output.writeUInt64(3, limit_);
    }
    if (countTotal_ != false) {
      output.writeBool(4, countTotal_);
    }
    if (reverse_ != false) {
      output.writeBool(5, reverse_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!key_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, key_);
    }
    if (offset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, offset_);
    }
    if (limit_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, limit_);
    }
    if (countTotal_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, countTotal_);
    }
    if (reverse_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, reverse_);
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
    if (!(obj instanceof PageRequest)) {
      return super.equals(obj);
    }
    PageRequest other = (PageRequest) obj;

    if (!getKey()
        .equals(other.getKey())) return false;
    if (getOffset()
        != other.getOffset()) return false;
    if (getLimit()
        != other.getLimit()) return false;
    if (getCountTotal()
        != other.getCountTotal()) return false;
    if (getReverse()
        != other.getReverse()) return false;
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
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOffset());
    hash = (37 * hash) + LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLimit());
    hash = (37 * hash) + COUNT_TOTAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCountTotal());
    hash = (37 * hash) + REVERSE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getReverse());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static PageRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PageRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PageRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PageRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PageRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PageRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PageRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static PageRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static PageRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static PageRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static PageRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static PageRequest parseFrom(
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
  public static Builder newBuilder(PageRequest prototype) {
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
   * <pre>
   * PageRequest is to be embedded in gRPC request messages for efficient
   * pagination. Ex:
   *
   *  message SomeRequest {
   *          Foo some_parameter = 1;
   *          PageRequest pagination = 2;
   *  }
   * </pre>
   *
   * Protobuf type {@code cosmos.base.query.v1beta1.PageRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.base.query.v1beta1.PageRequest)
      PageRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PaginationProto.internal_static_cosmos_base_query_v1beta1_PageRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PaginationProto.internal_static_cosmos_base_query_v1beta1_PageRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PageRequest.class, Builder.class);
    }

    // Construct using com.cosmos.base.query.v1beta1.PageRequest.newBuilder()
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
      key_ = com.google.protobuf.ByteString.EMPTY;
      offset_ = 0L;
      limit_ = 0L;
      countTotal_ = false;
      reverse_ = false;
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return PaginationProto.internal_static_cosmos_base_query_v1beta1_PageRequest_descriptor;
    }

    @Override
    public PageRequest getDefaultInstanceForType() {
      return PageRequest.getDefaultInstance();
    }

    @Override
    public PageRequest build() {
      PageRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public PageRequest buildPartial() {
      PageRequest result = new PageRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(PageRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.key_ = key_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.offset_ = offset_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.limit_ = limit_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.countTotal_ = countTotal_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.reverse_ = reverse_;
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
      if (other instanceof PageRequest) {
        return mergeFrom((PageRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(PageRequest other) {
      if (other == PageRequest.getDefaultInstance()) return this;
      if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
        setKey(other.getKey());
      }
      if (other.getOffset() != 0L) {
        setOffset(other.getOffset());
      }
      if (other.getLimit() != 0L) {
        setLimit(other.getLimit());
      }
      if (other.getCountTotal() != false) {
        setCountTotal(other.getCountTotal());
      }
      if (other.getReverse() != false) {
        setReverse(other.getReverse());
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
              key_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              offset_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              limit_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              countTotal_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              reverse_ = input.readBool();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * key is a value returned in PageResponse.next_key to begin
     * querying the next page most efficiently. Only one of offset or key
     * should be set.
     * </pre>
     *
     * <code>bytes key = 1 [json_name = "key"];</code>
     * @return The key.
     */
    @Override
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }
    /**
     * <pre>
     * key is a value returned in PageResponse.next_key to begin
     * querying the next page most efficiently. Only one of offset or key
     * should be set.
     * </pre>
     *
     * <code>bytes key = 1 [json_name = "key"];</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      key_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * key is a value returned in PageResponse.next_key to begin
     * querying the next page most efficiently. Only one of offset or key
     * should be set.
     * </pre>
     *
     * <code>bytes key = 1 [json_name = "key"];</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      bitField0_ = (bitField0_ & ~0x00000001);
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }

    private long offset_ ;
    /**
     * <pre>
     * offset is a numeric offset that can be used when key is unavailable.
     * It is less efficient than using key. Only one of offset or key should
     * be set.
     * </pre>
     *
     * <code>uint64 offset = 2 [json_name = "offset"];</code>
     * @return The offset.
     */
    @Override
    public long getOffset() {
      return offset_;
    }
    /**
     * <pre>
     * offset is a numeric offset that can be used when key is unavailable.
     * It is less efficient than using key. Only one of offset or key should
     * be set.
     * </pre>
     *
     * <code>uint64 offset = 2 [json_name = "offset"];</code>
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(long value) {

      offset_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * offset is a numeric offset that can be used when key is unavailable.
     * It is less efficient than using key. Only one of offset or key should
     * be set.
     * </pre>
     *
     * <code>uint64 offset = 2 [json_name = "offset"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      bitField0_ = (bitField0_ & ~0x00000002);
      offset_ = 0L;
      onChanged();
      return this;
    }

    private long limit_ ;
    /**
     * <pre>
     * limit is the total number of results to be returned in the result page.
     * If left empty it will default to a value to be set by each app.
     * </pre>
     *
     * <code>uint64 limit = 3 [json_name = "limit"];</code>
     * @return The limit.
     */
    @Override
    public long getLimit() {
      return limit_;
    }
    /**
     * <pre>
     * limit is the total number of results to be returned in the result page.
     * If left empty it will default to a value to be set by each app.
     * </pre>
     *
     * <code>uint64 limit = 3 [json_name = "limit"];</code>
     * @param value The limit to set.
     * @return This builder for chaining.
     */
    public Builder setLimit(long value) {

      limit_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * limit is the total number of results to be returned in the result page.
     * If left empty it will default to a value to be set by each app.
     * </pre>
     *
     * <code>uint64 limit = 3 [json_name = "limit"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLimit() {
      bitField0_ = (bitField0_ & ~0x00000004);
      limit_ = 0L;
      onChanged();
      return this;
    }

    private boolean countTotal_ ;
    /**
     * <pre>
     * count_total is set to true  to indicate that the result set should include
     * a count of the total number of items available for pagination in UIs.
     * count_total is only respected when offset is used. It is ignored when key
     * is set.
     * </pre>
     *
     * <code>bool count_total = 4 [json_name = "countTotal"];</code>
     * @return The countTotal.
     */
    @Override
    public boolean getCountTotal() {
      return countTotal_;
    }
    /**
     * <pre>
     * count_total is set to true  to indicate that the result set should include
     * a count of the total number of items available for pagination in UIs.
     * count_total is only respected when offset is used. It is ignored when key
     * is set.
     * </pre>
     *
     * <code>bool count_total = 4 [json_name = "countTotal"];</code>
     * @param value The countTotal to set.
     * @return This builder for chaining.
     */
    public Builder setCountTotal(boolean value) {

      countTotal_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * count_total is set to true  to indicate that the result set should include
     * a count of the total number of items available for pagination in UIs.
     * count_total is only respected when offset is used. It is ignored when key
     * is set.
     * </pre>
     *
     * <code>bool count_total = 4 [json_name = "countTotal"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCountTotal() {
      bitField0_ = (bitField0_ & ~0x00000008);
      countTotal_ = false;
      onChanged();
      return this;
    }

    private boolean reverse_ ;
    /**
     * <pre>
     * reverse is set to true if results are to be returned in the descending order.
     *
     * Since: cosmos-sdk 0.43
     * </pre>
     *
     * <code>bool reverse = 5 [json_name = "reverse"];</code>
     * @return The reverse.
     */
    @Override
    public boolean getReverse() {
      return reverse_;
    }
    /**
     * <pre>
     * reverse is set to true if results are to be returned in the descending order.
     *
     * Since: cosmos-sdk 0.43
     * </pre>
     *
     * <code>bool reverse = 5 [json_name = "reverse"];</code>
     * @param value The reverse to set.
     * @return This builder for chaining.
     */
    public Builder setReverse(boolean value) {

      reverse_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * reverse is set to true if results are to be returned in the descending order.
     *
     * Since: cosmos-sdk 0.43
     * </pre>
     *
     * <code>bool reverse = 5 [json_name = "reverse"];</code>
     * @return This builder for chaining.
     */
    public Builder clearReverse() {
      bitField0_ = (bitField0_ & ~0x00000010);
      reverse_ = false;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:cosmos.base.query.v1beta1.PageRequest)
  }

  // @@protoc_insertion_point(class_scope:cosmos.base.query.v1beta1.PageRequest)
  private static final PageRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new PageRequest();
  }

  public static PageRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PageRequest>
      PARSER = new com.google.protobuf.AbstractParser<PageRequest>() {
    @Override
    public PageRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<PageRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<PageRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public PageRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

