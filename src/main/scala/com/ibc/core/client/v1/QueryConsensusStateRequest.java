// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/client/v1/query.proto

package com.ibc.core.client.v1;

/**
 * <pre>
 * QueryConsensusStateRequest is the request type for the Query/ConsensusState
 * RPC method. Besides the consensus state, it includes a proof and the height
 * from which the proof was retrieved.
 * </pre>
 *
 * Protobuf type {@code ibc.core.client.v1.QueryConsensusStateRequest}
 */
public final class QueryConsensusStateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.core.client.v1.QueryConsensusStateRequest)
    QueryConsensusStateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryConsensusStateRequest.newBuilder() to construct.
  private QueryConsensusStateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryConsensusStateRequest() {
    clientId_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryConsensusStateRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return QueryProto.internal_static_ibc_core_client_v1_QueryConsensusStateRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return QueryProto.internal_static_ibc_core_client_v1_QueryConsensusStateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            QueryConsensusStateRequest.class, Builder.class);
  }

  public static final int CLIENT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile Object clientId_ = "";
  /**
   * <pre>
   * client identifier
   * </pre>
   *
   * <code>string client_id = 1 [json_name = "clientId"];</code>
   * @return The clientId.
   */
  @Override
  public String getClientId() {
    Object ref = clientId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      clientId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * client identifier
   * </pre>
   *
   * <code>string client_id = 1 [json_name = "clientId"];</code>
   * @return The bytes for clientId.
   */
  @Override
  public com.google.protobuf.ByteString
      getClientIdBytes() {
    Object ref = clientId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      clientId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REVISION_NUMBER_FIELD_NUMBER = 2;
  private long revisionNumber_ = 0L;
  /**
   * <pre>
   * consensus state revision number
   * </pre>
   *
   * <code>uint64 revision_number = 2 [json_name = "revisionNumber"];</code>
   * @return The revisionNumber.
   */
  @Override
  public long getRevisionNumber() {
    return revisionNumber_;
  }

  public static final int REVISION_HEIGHT_FIELD_NUMBER = 3;
  private long revisionHeight_ = 0L;
  /**
   * <pre>
   * consensus state revision height
   * </pre>
   *
   * <code>uint64 revision_height = 3 [json_name = "revisionHeight"];</code>
   * @return The revisionHeight.
   */
  @Override
  public long getRevisionHeight() {
    return revisionHeight_;
  }

  public static final int LATEST_HEIGHT_FIELD_NUMBER = 4;
  private boolean latestHeight_ = false;
  /**
   * <pre>
   * latest_height overrrides the height field and queries the latest stored
   * ConsensusState
   * </pre>
   *
   * <code>bool latest_height = 4 [json_name = "latestHeight"];</code>
   * @return The latestHeight.
   */
  @Override
  public boolean getLatestHeight() {
    return latestHeight_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clientId_);
    }
    if (revisionNumber_ != 0L) {
      output.writeUInt64(2, revisionNumber_);
    }
    if (revisionHeight_ != 0L) {
      output.writeUInt64(3, revisionHeight_);
    }
    if (latestHeight_ != false) {
      output.writeBool(4, latestHeight_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clientId_);
    }
    if (revisionNumber_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, revisionNumber_);
    }
    if (revisionHeight_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, revisionHeight_);
    }
    if (latestHeight_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, latestHeight_);
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
    if (!(obj instanceof QueryConsensusStateRequest)) {
      return super.equals(obj);
    }
    QueryConsensusStateRequest other = (QueryConsensusStateRequest) obj;

    if (!getClientId()
        .equals(other.getClientId())) return false;
    if (getRevisionNumber()
        != other.getRevisionNumber()) return false;
    if (getRevisionHeight()
        != other.getRevisionHeight()) return false;
    if (getLatestHeight()
        != other.getLatestHeight()) return false;
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
    hash = (37 * hash) + CLIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClientId().hashCode();
    hash = (37 * hash) + REVISION_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRevisionNumber());
    hash = (37 * hash) + REVISION_HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRevisionHeight());
    hash = (37 * hash) + LATEST_HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getLatestHeight());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static QueryConsensusStateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryConsensusStateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryConsensusStateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryConsensusStateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryConsensusStateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryConsensusStateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryConsensusStateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static QueryConsensusStateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static QueryConsensusStateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static QueryConsensusStateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static QueryConsensusStateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static QueryConsensusStateRequest parseFrom(
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
  public static Builder newBuilder(QueryConsensusStateRequest prototype) {
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
   * QueryConsensusStateRequest is the request type for the Query/ConsensusState
   * RPC method. Besides the consensus state, it includes a proof and the height
   * from which the proof was retrieved.
   * </pre>
   *
   * Protobuf type {@code ibc.core.client.v1.QueryConsensusStateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.core.client.v1.QueryConsensusStateRequest)
      QueryConsensusStateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return QueryProto.internal_static_ibc_core_client_v1_QueryConsensusStateRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return QueryProto.internal_static_ibc_core_client_v1_QueryConsensusStateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              QueryConsensusStateRequest.class, Builder.class);
    }

    // Construct using com.ibc.core.client.v1.QueryConsensusStateRequest.newBuilder()
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
      clientId_ = "";
      revisionNumber_ = 0L;
      revisionHeight_ = 0L;
      latestHeight_ = false;
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return QueryProto.internal_static_ibc_core_client_v1_QueryConsensusStateRequest_descriptor;
    }

    @Override
    public QueryConsensusStateRequest getDefaultInstanceForType() {
      return QueryConsensusStateRequest.getDefaultInstance();
    }

    @Override
    public QueryConsensusStateRequest build() {
      QueryConsensusStateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public QueryConsensusStateRequest buildPartial() {
      QueryConsensusStateRequest result = new QueryConsensusStateRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(QueryConsensusStateRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.clientId_ = clientId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.revisionNumber_ = revisionNumber_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.revisionHeight_ = revisionHeight_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.latestHeight_ = latestHeight_;
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
      if (other instanceof QueryConsensusStateRequest) {
        return mergeFrom((QueryConsensusStateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(QueryConsensusStateRequest other) {
      if (other == QueryConsensusStateRequest.getDefaultInstance()) return this;
      if (!other.getClientId().isEmpty()) {
        clientId_ = other.clientId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getRevisionNumber() != 0L) {
        setRevisionNumber(other.getRevisionNumber());
      }
      if (other.getRevisionHeight() != 0L) {
        setRevisionHeight(other.getRevisionHeight());
      }
      if (other.getLatestHeight() != false) {
        setLatestHeight(other.getLatestHeight());
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
              clientId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              revisionNumber_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              revisionHeight_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              latestHeight_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private Object clientId_ = "";
    /**
     * <pre>
     * client identifier
     * </pre>
     *
     * <code>string client_id = 1 [json_name = "clientId"];</code>
     * @return The clientId.
     */
    public String getClientId() {
      Object ref = clientId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        clientId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * client identifier
     * </pre>
     *
     * <code>string client_id = 1 [json_name = "clientId"];</code>
     * @return The bytes for clientId.
     */
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      Object ref = clientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * client identifier
     * </pre>
     *
     * <code>string client_id = 1 [json_name = "clientId"];</code>
     * @param value The clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientId(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      clientId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * client identifier
     * </pre>
     *
     * <code>string client_id = 1 [json_name = "clientId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearClientId() {
      clientId_ = getDefaultInstance().getClientId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * client identifier
     * </pre>
     *
     * <code>string client_id = 1 [json_name = "clientId"];</code>
     * @param value The bytes for clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      clientId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long revisionNumber_ ;
    /**
     * <pre>
     * consensus state revision number
     * </pre>
     *
     * <code>uint64 revision_number = 2 [json_name = "revisionNumber"];</code>
     * @return The revisionNumber.
     */
    @Override
    public long getRevisionNumber() {
      return revisionNumber_;
    }
    /**
     * <pre>
     * consensus state revision number
     * </pre>
     *
     * <code>uint64 revision_number = 2 [json_name = "revisionNumber"];</code>
     * @param value The revisionNumber to set.
     * @return This builder for chaining.
     */
    public Builder setRevisionNumber(long value) {

      revisionNumber_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * consensus state revision number
     * </pre>
     *
     * <code>uint64 revision_number = 2 [json_name = "revisionNumber"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRevisionNumber() {
      bitField0_ = (bitField0_ & ~0x00000002);
      revisionNumber_ = 0L;
      onChanged();
      return this;
    }

    private long revisionHeight_ ;
    /**
     * <pre>
     * consensus state revision height
     * </pre>
     *
     * <code>uint64 revision_height = 3 [json_name = "revisionHeight"];</code>
     * @return The revisionHeight.
     */
    @Override
    public long getRevisionHeight() {
      return revisionHeight_;
    }
    /**
     * <pre>
     * consensus state revision height
     * </pre>
     *
     * <code>uint64 revision_height = 3 [json_name = "revisionHeight"];</code>
     * @param value The revisionHeight to set.
     * @return This builder for chaining.
     */
    public Builder setRevisionHeight(long value) {

      revisionHeight_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * consensus state revision height
     * </pre>
     *
     * <code>uint64 revision_height = 3 [json_name = "revisionHeight"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRevisionHeight() {
      bitField0_ = (bitField0_ & ~0x00000004);
      revisionHeight_ = 0L;
      onChanged();
      return this;
    }

    private boolean latestHeight_ ;
    /**
     * <pre>
     * latest_height overrrides the height field and queries the latest stored
     * ConsensusState
     * </pre>
     *
     * <code>bool latest_height = 4 [json_name = "latestHeight"];</code>
     * @return The latestHeight.
     */
    @Override
    public boolean getLatestHeight() {
      return latestHeight_;
    }
    /**
     * <pre>
     * latest_height overrrides the height field and queries the latest stored
     * ConsensusState
     * </pre>
     *
     * <code>bool latest_height = 4 [json_name = "latestHeight"];</code>
     * @param value The latestHeight to set.
     * @return This builder for chaining.
     */
    public Builder setLatestHeight(boolean value) {

      latestHeight_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * latest_height overrrides the height field and queries the latest stored
     * ConsensusState
     * </pre>
     *
     * <code>bool latest_height = 4 [json_name = "latestHeight"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLatestHeight() {
      bitField0_ = (bitField0_ & ~0x00000008);
      latestHeight_ = false;
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


    // @@protoc_insertion_point(builder_scope:ibc.core.client.v1.QueryConsensusStateRequest)
  }

  // @@protoc_insertion_point(class_scope:ibc.core.client.v1.QueryConsensusStateRequest)
  private static final QueryConsensusStateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new QueryConsensusStateRequest();
  }

  public static QueryConsensusStateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryConsensusStateRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryConsensusStateRequest>() {
    @Override
    public QueryConsensusStateRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryConsensusStateRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<QueryConsensusStateRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public QueryConsensusStateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

