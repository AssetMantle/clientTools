// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/tendermint/v1/tendermint.proto

package com.ibc.lightclients.tendermint.v1;

/**
 * <pre>
 * Misbehaviour is a wrapper over two conflicting Headers
 * that implements Misbehaviour interface expected by ICS-02
 * </pre>
 *
 * Protobuf type {@code ibc.lightclients.tendermint.v1.Misbehaviour}
 */
public final class Misbehaviour extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.lightclients.tendermint.v1.Misbehaviour)
    MisbehaviourOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Misbehaviour.newBuilder() to construct.
  private Misbehaviour(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Misbehaviour() {
    clientId_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new Misbehaviour();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return TendermintProto.internal_static_ibc_lightclients_tendermint_v1_Misbehaviour_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return TendermintProto.internal_static_ibc_lightclients_tendermint_v1_Misbehaviour_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Misbehaviour.class, Builder.class);
  }

  public static final int CLIENT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile Object clientId_ = "";
  /**
   * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
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
   * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
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

  public static final int HEADER_1_FIELD_NUMBER = 2;
  private Header header1_;
  /**
   * <code>.ibc.lightclients.tendermint.v1.Header header_1 = 2 [json_name = "header1", (.gogoproto.customname) = "Header1", (.gogoproto.moretags) = "yaml:&#92;"header_1&#92;""];</code>
   * @return Whether the header1 field is set.
   */
  @Override
  public boolean hasHeader1() {
    return header1_ != null;
  }
  /**
   * <code>.ibc.lightclients.tendermint.v1.Header header_1 = 2 [json_name = "header1", (.gogoproto.customname) = "Header1", (.gogoproto.moretags) = "yaml:&#92;"header_1&#92;""];</code>
   * @return The header1.
   */
  @Override
  public Header getHeader1() {
    return header1_ == null ? Header.getDefaultInstance() : header1_;
  }
  /**
   * <code>.ibc.lightclients.tendermint.v1.Header header_1 = 2 [json_name = "header1", (.gogoproto.customname) = "Header1", (.gogoproto.moretags) = "yaml:&#92;"header_1&#92;""];</code>
   */
  @Override
  public HeaderOrBuilder getHeader1OrBuilder() {
    return header1_ == null ? Header.getDefaultInstance() : header1_;
  }

  public static final int HEADER_2_FIELD_NUMBER = 3;
  private Header header2_;
  /**
   * <code>.ibc.lightclients.tendermint.v1.Header header_2 = 3 [json_name = "header2", (.gogoproto.customname) = "Header2", (.gogoproto.moretags) = "yaml:&#92;"header_2&#92;""];</code>
   * @return Whether the header2 field is set.
   */
  @Override
  public boolean hasHeader2() {
    return header2_ != null;
  }
  /**
   * <code>.ibc.lightclients.tendermint.v1.Header header_2 = 3 [json_name = "header2", (.gogoproto.customname) = "Header2", (.gogoproto.moretags) = "yaml:&#92;"header_2&#92;""];</code>
   * @return The header2.
   */
  @Override
  public Header getHeader2() {
    return header2_ == null ? Header.getDefaultInstance() : header2_;
  }
  /**
   * <code>.ibc.lightclients.tendermint.v1.Header header_2 = 3 [json_name = "header2", (.gogoproto.customname) = "Header2", (.gogoproto.moretags) = "yaml:&#92;"header_2&#92;""];</code>
   */
  @Override
  public HeaderOrBuilder getHeader2OrBuilder() {
    return header2_ == null ? Header.getDefaultInstance() : header2_;
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
    if (header1_ != null) {
      output.writeMessage(2, getHeader1());
    }
    if (header2_ != null) {
      output.writeMessage(3, getHeader2());
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
    if (header1_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getHeader1());
    }
    if (header2_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getHeader2());
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
    if (!(obj instanceof Misbehaviour)) {
      return super.equals(obj);
    }
    Misbehaviour other = (Misbehaviour) obj;

    if (!getClientId()
        .equals(other.getClientId())) return false;
    if (hasHeader1() != other.hasHeader1()) return false;
    if (hasHeader1()) {
      if (!getHeader1()
          .equals(other.getHeader1())) return false;
    }
    if (hasHeader2() != other.hasHeader2()) return false;
    if (hasHeader2()) {
      if (!getHeader2()
          .equals(other.getHeader2())) return false;
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
    hash = (37 * hash) + CLIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClientId().hashCode();
    if (hasHeader1()) {
      hash = (37 * hash) + HEADER_1_FIELD_NUMBER;
      hash = (53 * hash) + getHeader1().hashCode();
    }
    if (hasHeader2()) {
      hash = (37 * hash) + HEADER_2_FIELD_NUMBER;
      hash = (53 * hash) + getHeader2().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Misbehaviour parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Misbehaviour parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Misbehaviour parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Misbehaviour parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Misbehaviour parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Misbehaviour parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Misbehaviour parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Misbehaviour parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Misbehaviour parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Misbehaviour parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Misbehaviour parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Misbehaviour parseFrom(
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
  public static Builder newBuilder(Misbehaviour prototype) {
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
   * Misbehaviour is a wrapper over two conflicting Headers
   * that implements Misbehaviour interface expected by ICS-02
   * </pre>
   *
   * Protobuf type {@code ibc.lightclients.tendermint.v1.Misbehaviour}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.lightclients.tendermint.v1.Misbehaviour)
      MisbehaviourOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TendermintProto.internal_static_ibc_lightclients_tendermint_v1_Misbehaviour_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TendermintProto.internal_static_ibc_lightclients_tendermint_v1_Misbehaviour_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Misbehaviour.class, Builder.class);
    }

    // Construct using com.ibc.lightclients.tendermint.v1.Misbehaviour.newBuilder()
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
      header1_ = null;
      if (header1Builder_ != null) {
        header1Builder_.dispose();
        header1Builder_ = null;
      }
      header2_ = null;
      if (header2Builder_ != null) {
        header2Builder_.dispose();
        header2Builder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return TendermintProto.internal_static_ibc_lightclients_tendermint_v1_Misbehaviour_descriptor;
    }

    @Override
    public Misbehaviour getDefaultInstanceForType() {
      return Misbehaviour.getDefaultInstance();
    }

    @Override
    public Misbehaviour build() {
      Misbehaviour result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Misbehaviour buildPartial() {
      Misbehaviour result = new Misbehaviour(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(Misbehaviour result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.clientId_ = clientId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.header1_ = header1Builder_ == null
            ? header1_
            : header1Builder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.header2_ = header2Builder_ == null
            ? header2_
            : header2Builder_.build();
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
      if (other instanceof Misbehaviour) {
        return mergeFrom((Misbehaviour)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Misbehaviour other) {
      if (other == Misbehaviour.getDefaultInstance()) return this;
      if (!other.getClientId().isEmpty()) {
        clientId_ = other.clientId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasHeader1()) {
        mergeHeader1(other.getHeader1());
      }
      if (other.hasHeader2()) {
        mergeHeader2(other.getHeader2());
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
            case 18: {
              input.readMessage(
                  getHeader1FieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getHeader2FieldBuilder().getBuilder(),
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

    private Object clientId_ = "";
    /**
     * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
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
     * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
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
     * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
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
     * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearClientId() {
      clientId_ = getDefaultInstance().getClientId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
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

    private Header header1_;
    private com.google.protobuf.SingleFieldBuilderV3<
        Header, Header.Builder, HeaderOrBuilder> header1Builder_;
    /**
     * <code>.ibc.lightclients.tendermint.v1.Header header_1 = 2 [json_name = "header1", (.gogoproto.customname) = "Header1", (.gogoproto.moretags) = "yaml:&#92;"header_1&#92;""];</code>
     * @return Whether the header1 field is set.
     */
    public boolean hasHeader1() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.ibc.lightclients.tendermint.v1.Header header_1 = 2 [json_name = "header1", (.gogoproto.customname) = "Header1", (.gogoproto.moretags) = "yaml:&#92;"header_1&#92;""];</code>
     * @return The header1.
     */
    public Header getHeader1() {
      if (header1Builder_ == null) {
        return header1_ == null ? Header.getDefaultInstance() : header1_;
      } else {
        return header1Builder_.getMessage();
      }
    }
    /**
     * <code>.ibc.lightclients.tendermint.v1.Header header_1 = 2 [json_name = "header1", (.gogoproto.customname) = "Header1", (.gogoproto.moretags) = "yaml:&#92;"header_1&#92;""];</code>
     */
    public Builder setHeader1(Header value) {
      if (header1Builder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header1_ = value;
      } else {
        header1Builder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.lightclients.tendermint.v1.Header header_1 = 2 [json_name = "header1", (.gogoproto.customname) = "Header1", (.gogoproto.moretags) = "yaml:&#92;"header_1&#92;""];</code>
     */
    public Builder setHeader1(
        Header.Builder builderForValue) {
      if (header1Builder_ == null) {
        header1_ = builderForValue.build();
      } else {
        header1Builder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.lightclients.tendermint.v1.Header header_1 = 2 [json_name = "header1", (.gogoproto.customname) = "Header1", (.gogoproto.moretags) = "yaml:&#92;"header_1&#92;""];</code>
     */
    public Builder mergeHeader1(Header value) {
      if (header1Builder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          header1_ != null &&
          header1_ != Header.getDefaultInstance()) {
          getHeader1Builder().mergeFrom(value);
        } else {
          header1_ = value;
        }
      } else {
        header1Builder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.lightclients.tendermint.v1.Header header_1 = 2 [json_name = "header1", (.gogoproto.customname) = "Header1", (.gogoproto.moretags) = "yaml:&#92;"header_1&#92;""];</code>
     */
    public Builder clearHeader1() {
      bitField0_ = (bitField0_ & ~0x00000002);
      header1_ = null;
      if (header1Builder_ != null) {
        header1Builder_.dispose();
        header1Builder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.lightclients.tendermint.v1.Header header_1 = 2 [json_name = "header1", (.gogoproto.customname) = "Header1", (.gogoproto.moretags) = "yaml:&#92;"header_1&#92;""];</code>
     */
    public Header.Builder getHeader1Builder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getHeader1FieldBuilder().getBuilder();
    }
    /**
     * <code>.ibc.lightclients.tendermint.v1.Header header_1 = 2 [json_name = "header1", (.gogoproto.customname) = "Header1", (.gogoproto.moretags) = "yaml:&#92;"header_1&#92;""];</code>
     */
    public HeaderOrBuilder getHeader1OrBuilder() {
      if (header1Builder_ != null) {
        return header1Builder_.getMessageOrBuilder();
      } else {
        return header1_ == null ?
            Header.getDefaultInstance() : header1_;
      }
    }
    /**
     * <code>.ibc.lightclients.tendermint.v1.Header header_1 = 2 [json_name = "header1", (.gogoproto.customname) = "Header1", (.gogoproto.moretags) = "yaml:&#92;"header_1&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        Header, Header.Builder, HeaderOrBuilder>
        getHeader1FieldBuilder() {
      if (header1Builder_ == null) {
        header1Builder_ = new com.google.protobuf.SingleFieldBuilderV3<
            Header, Header.Builder, HeaderOrBuilder>(
                getHeader1(),
                getParentForChildren(),
                isClean());
        header1_ = null;
      }
      return header1Builder_;
    }

    private Header header2_;
    private com.google.protobuf.SingleFieldBuilderV3<
        Header, Header.Builder, HeaderOrBuilder> header2Builder_;
    /**
     * <code>.ibc.lightclients.tendermint.v1.Header header_2 = 3 [json_name = "header2", (.gogoproto.customname) = "Header2", (.gogoproto.moretags) = "yaml:&#92;"header_2&#92;""];</code>
     * @return Whether the header2 field is set.
     */
    public boolean hasHeader2() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.ibc.lightclients.tendermint.v1.Header header_2 = 3 [json_name = "header2", (.gogoproto.customname) = "Header2", (.gogoproto.moretags) = "yaml:&#92;"header_2&#92;""];</code>
     * @return The header2.
     */
    public Header getHeader2() {
      if (header2Builder_ == null) {
        return header2_ == null ? Header.getDefaultInstance() : header2_;
      } else {
        return header2Builder_.getMessage();
      }
    }
    /**
     * <code>.ibc.lightclients.tendermint.v1.Header header_2 = 3 [json_name = "header2", (.gogoproto.customname) = "Header2", (.gogoproto.moretags) = "yaml:&#92;"header_2&#92;""];</code>
     */
    public Builder setHeader2(Header value) {
      if (header2Builder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header2_ = value;
      } else {
        header2Builder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.lightclients.tendermint.v1.Header header_2 = 3 [json_name = "header2", (.gogoproto.customname) = "Header2", (.gogoproto.moretags) = "yaml:&#92;"header_2&#92;""];</code>
     */
    public Builder setHeader2(
        Header.Builder builderForValue) {
      if (header2Builder_ == null) {
        header2_ = builderForValue.build();
      } else {
        header2Builder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.lightclients.tendermint.v1.Header header_2 = 3 [json_name = "header2", (.gogoproto.customname) = "Header2", (.gogoproto.moretags) = "yaml:&#92;"header_2&#92;""];</code>
     */
    public Builder mergeHeader2(Header value) {
      if (header2Builder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          header2_ != null &&
          header2_ != Header.getDefaultInstance()) {
          getHeader2Builder().mergeFrom(value);
        } else {
          header2_ = value;
        }
      } else {
        header2Builder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.lightclients.tendermint.v1.Header header_2 = 3 [json_name = "header2", (.gogoproto.customname) = "Header2", (.gogoproto.moretags) = "yaml:&#92;"header_2&#92;""];</code>
     */
    public Builder clearHeader2() {
      bitField0_ = (bitField0_ & ~0x00000004);
      header2_ = null;
      if (header2Builder_ != null) {
        header2Builder_.dispose();
        header2Builder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.lightclients.tendermint.v1.Header header_2 = 3 [json_name = "header2", (.gogoproto.customname) = "Header2", (.gogoproto.moretags) = "yaml:&#92;"header_2&#92;""];</code>
     */
    public Header.Builder getHeader2Builder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getHeader2FieldBuilder().getBuilder();
    }
    /**
     * <code>.ibc.lightclients.tendermint.v1.Header header_2 = 3 [json_name = "header2", (.gogoproto.customname) = "Header2", (.gogoproto.moretags) = "yaml:&#92;"header_2&#92;""];</code>
     */
    public HeaderOrBuilder getHeader2OrBuilder() {
      if (header2Builder_ != null) {
        return header2Builder_.getMessageOrBuilder();
      } else {
        return header2_ == null ?
            Header.getDefaultInstance() : header2_;
      }
    }
    /**
     * <code>.ibc.lightclients.tendermint.v1.Header header_2 = 3 [json_name = "header2", (.gogoproto.customname) = "Header2", (.gogoproto.moretags) = "yaml:&#92;"header_2&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        Header, Header.Builder, HeaderOrBuilder>
        getHeader2FieldBuilder() {
      if (header2Builder_ == null) {
        header2Builder_ = new com.google.protobuf.SingleFieldBuilderV3<
            Header, Header.Builder, HeaderOrBuilder>(
                getHeader2(),
                getParentForChildren(),
                isClean());
        header2_ = null;
      }
      return header2Builder_;
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


    // @@protoc_insertion_point(builder_scope:ibc.lightclients.tendermint.v1.Misbehaviour)
  }

  // @@protoc_insertion_point(class_scope:ibc.lightclients.tendermint.v1.Misbehaviour)
  private static final Misbehaviour DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Misbehaviour();
  }

  public static Misbehaviour getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Misbehaviour>
      PARSER = new com.google.protobuf.AbstractParser<Misbehaviour>() {
    @Override
    public Misbehaviour parsePartialFrom(
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

  public static com.google.protobuf.Parser<Misbehaviour> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Misbehaviour> getParserForType() {
    return PARSER;
  }

  @Override
  public Misbehaviour getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

