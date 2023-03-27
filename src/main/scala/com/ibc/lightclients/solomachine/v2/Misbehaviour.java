// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/solomachine/v2/solomachine.proto

package com.ibc.lightclients.solomachine.v2;

/**
 * <pre>
 * Misbehaviour defines misbehaviour for a solo machine which consists
 * of a sequence and two signatures over different messages at that sequence.
 * </pre>
 *
 * Protobuf type {@code ibc.lightclients.solomachine.v2.Misbehaviour}
 */
public final class Misbehaviour extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.lightclients.solomachine.v2.Misbehaviour)
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
    return SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_Misbehaviour_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_Misbehaviour_fieldAccessorTable
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

  public static final int SEQUENCE_FIELD_NUMBER = 2;
  private long sequence_ = 0L;
  /**
   * <code>uint64 sequence = 2 [json_name = "sequence"];</code>
   * @return The sequence.
   */
  @Override
  public long getSequence() {
    return sequence_;
  }

  public static final int SIGNATURE_ONE_FIELD_NUMBER = 3;
  private SignatureAndData signatureOne_;
  /**
   * <code>.ibc.lightclients.solomachine.v2.SignatureAndData signature_one = 3 [json_name = "signatureOne", (.gogoproto.moretags) = "yaml:&#92;"signature_one&#92;""];</code>
   * @return Whether the signatureOne field is set.
   */
  @Override
  public boolean hasSignatureOne() {
    return signatureOne_ != null;
  }
  /**
   * <code>.ibc.lightclients.solomachine.v2.SignatureAndData signature_one = 3 [json_name = "signatureOne", (.gogoproto.moretags) = "yaml:&#92;"signature_one&#92;""];</code>
   * @return The signatureOne.
   */
  @Override
  public SignatureAndData getSignatureOne() {
    return signatureOne_ == null ? SignatureAndData.getDefaultInstance() : signatureOne_;
  }
  /**
   * <code>.ibc.lightclients.solomachine.v2.SignatureAndData signature_one = 3 [json_name = "signatureOne", (.gogoproto.moretags) = "yaml:&#92;"signature_one&#92;""];</code>
   */
  @Override
  public SignatureAndDataOrBuilder getSignatureOneOrBuilder() {
    return signatureOne_ == null ? SignatureAndData.getDefaultInstance() : signatureOne_;
  }

  public static final int SIGNATURE_TWO_FIELD_NUMBER = 4;
  private SignatureAndData signatureTwo_;
  /**
   * <code>.ibc.lightclients.solomachine.v2.SignatureAndData signature_two = 4 [json_name = "signatureTwo", (.gogoproto.moretags) = "yaml:&#92;"signature_two&#92;""];</code>
   * @return Whether the signatureTwo field is set.
   */
  @Override
  public boolean hasSignatureTwo() {
    return signatureTwo_ != null;
  }
  /**
   * <code>.ibc.lightclients.solomachine.v2.SignatureAndData signature_two = 4 [json_name = "signatureTwo", (.gogoproto.moretags) = "yaml:&#92;"signature_two&#92;""];</code>
   * @return The signatureTwo.
   */
  @Override
  public SignatureAndData getSignatureTwo() {
    return signatureTwo_ == null ? SignatureAndData.getDefaultInstance() : signatureTwo_;
  }
  /**
   * <code>.ibc.lightclients.solomachine.v2.SignatureAndData signature_two = 4 [json_name = "signatureTwo", (.gogoproto.moretags) = "yaml:&#92;"signature_two&#92;""];</code>
   */
  @Override
  public SignatureAndDataOrBuilder getSignatureTwoOrBuilder() {
    return signatureTwo_ == null ? SignatureAndData.getDefaultInstance() : signatureTwo_;
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
    if (sequence_ != 0L) {
      output.writeUInt64(2, sequence_);
    }
    if (signatureOne_ != null) {
      output.writeMessage(3, getSignatureOne());
    }
    if (signatureTwo_ != null) {
      output.writeMessage(4, getSignatureTwo());
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
    if (sequence_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, sequence_);
    }
    if (signatureOne_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSignatureOne());
    }
    if (signatureTwo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getSignatureTwo());
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
    if (getSequence()
        != other.getSequence()) return false;
    if (hasSignatureOne() != other.hasSignatureOne()) return false;
    if (hasSignatureOne()) {
      if (!getSignatureOne()
          .equals(other.getSignatureOne())) return false;
    }
    if (hasSignatureTwo() != other.hasSignatureTwo()) return false;
    if (hasSignatureTwo()) {
      if (!getSignatureTwo()
          .equals(other.getSignatureTwo())) return false;
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
    hash = (37 * hash) + SEQUENCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSequence());
    if (hasSignatureOne()) {
      hash = (37 * hash) + SIGNATURE_ONE_FIELD_NUMBER;
      hash = (53 * hash) + getSignatureOne().hashCode();
    }
    if (hasSignatureTwo()) {
      hash = (37 * hash) + SIGNATURE_TWO_FIELD_NUMBER;
      hash = (53 * hash) + getSignatureTwo().hashCode();
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
   * Misbehaviour defines misbehaviour for a solo machine which consists
   * of a sequence and two signatures over different messages at that sequence.
   * </pre>
   *
   * Protobuf type {@code ibc.lightclients.solomachine.v2.Misbehaviour}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.lightclients.solomachine.v2.Misbehaviour)
      MisbehaviourOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_Misbehaviour_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_Misbehaviour_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Misbehaviour.class, Builder.class);
    }

    // Construct using com.ibc.lightclients.solomachine.v2.Misbehaviour.newBuilder()
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
      sequence_ = 0L;
      signatureOne_ = null;
      if (signatureOneBuilder_ != null) {
        signatureOneBuilder_.dispose();
        signatureOneBuilder_ = null;
      }
      signatureTwo_ = null;
      if (signatureTwoBuilder_ != null) {
        signatureTwoBuilder_.dispose();
        signatureTwoBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_Misbehaviour_descriptor;
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
        result.sequence_ = sequence_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.signatureOne_ = signatureOneBuilder_ == null
            ? signatureOne_
            : signatureOneBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.signatureTwo_ = signatureTwoBuilder_ == null
            ? signatureTwo_
            : signatureTwoBuilder_.build();
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
      if (other.getSequence() != 0L) {
        setSequence(other.getSequence());
      }
      if (other.hasSignatureOne()) {
        mergeSignatureOne(other.getSignatureOne());
      }
      if (other.hasSignatureTwo()) {
        mergeSignatureTwo(other.getSignatureTwo());
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
              sequence_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getSignatureOneFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getSignatureTwoFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private long sequence_ ;
    /**
     * <code>uint64 sequence = 2 [json_name = "sequence"];</code>
     * @return The sequence.
     */
    @Override
    public long getSequence() {
      return sequence_;
    }
    /**
     * <code>uint64 sequence = 2 [json_name = "sequence"];</code>
     * @param value The sequence to set.
     * @return This builder for chaining.
     */
    public Builder setSequence(long value) {

      sequence_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 sequence = 2 [json_name = "sequence"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSequence() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sequence_ = 0L;
      onChanged();
      return this;
    }

    private SignatureAndData signatureOne_;
    private com.google.protobuf.SingleFieldBuilderV3<
        SignatureAndData, SignatureAndData.Builder, SignatureAndDataOrBuilder> signatureOneBuilder_;
    /**
     * <code>.ibc.lightclients.solomachine.v2.SignatureAndData signature_one = 3 [json_name = "signatureOne", (.gogoproto.moretags) = "yaml:&#92;"signature_one&#92;""];</code>
     * @return Whether the signatureOne field is set.
     */
    public boolean hasSignatureOne() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.ibc.lightclients.solomachine.v2.SignatureAndData signature_one = 3 [json_name = "signatureOne", (.gogoproto.moretags) = "yaml:&#92;"signature_one&#92;""];</code>
     * @return The signatureOne.
     */
    public SignatureAndData getSignatureOne() {
      if (signatureOneBuilder_ == null) {
        return signatureOne_ == null ? SignatureAndData.getDefaultInstance() : signatureOne_;
      } else {
        return signatureOneBuilder_.getMessage();
      }
    }
    /**
     * <code>.ibc.lightclients.solomachine.v2.SignatureAndData signature_one = 3 [json_name = "signatureOne", (.gogoproto.moretags) = "yaml:&#92;"signature_one&#92;""];</code>
     */
    public Builder setSignatureOne(SignatureAndData value) {
      if (signatureOneBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        signatureOne_ = value;
      } else {
        signatureOneBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.lightclients.solomachine.v2.SignatureAndData signature_one = 3 [json_name = "signatureOne", (.gogoproto.moretags) = "yaml:&#92;"signature_one&#92;""];</code>
     */
    public Builder setSignatureOne(
        SignatureAndData.Builder builderForValue) {
      if (signatureOneBuilder_ == null) {
        signatureOne_ = builderForValue.build();
      } else {
        signatureOneBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.lightclients.solomachine.v2.SignatureAndData signature_one = 3 [json_name = "signatureOne", (.gogoproto.moretags) = "yaml:&#92;"signature_one&#92;""];</code>
     */
    public Builder mergeSignatureOne(SignatureAndData value) {
      if (signatureOneBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          signatureOne_ != null &&
          signatureOne_ != SignatureAndData.getDefaultInstance()) {
          getSignatureOneBuilder().mergeFrom(value);
        } else {
          signatureOne_ = value;
        }
      } else {
        signatureOneBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.lightclients.solomachine.v2.SignatureAndData signature_one = 3 [json_name = "signatureOne", (.gogoproto.moretags) = "yaml:&#92;"signature_one&#92;""];</code>
     */
    public Builder clearSignatureOne() {
      bitField0_ = (bitField0_ & ~0x00000004);
      signatureOne_ = null;
      if (signatureOneBuilder_ != null) {
        signatureOneBuilder_.dispose();
        signatureOneBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.lightclients.solomachine.v2.SignatureAndData signature_one = 3 [json_name = "signatureOne", (.gogoproto.moretags) = "yaml:&#92;"signature_one&#92;""];</code>
     */
    public SignatureAndData.Builder getSignatureOneBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getSignatureOneFieldBuilder().getBuilder();
    }
    /**
     * <code>.ibc.lightclients.solomachine.v2.SignatureAndData signature_one = 3 [json_name = "signatureOne", (.gogoproto.moretags) = "yaml:&#92;"signature_one&#92;""];</code>
     */
    public SignatureAndDataOrBuilder getSignatureOneOrBuilder() {
      if (signatureOneBuilder_ != null) {
        return signatureOneBuilder_.getMessageOrBuilder();
      } else {
        return signatureOne_ == null ?
            SignatureAndData.getDefaultInstance() : signatureOne_;
      }
    }
    /**
     * <code>.ibc.lightclients.solomachine.v2.SignatureAndData signature_one = 3 [json_name = "signatureOne", (.gogoproto.moretags) = "yaml:&#92;"signature_one&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        SignatureAndData, SignatureAndData.Builder, SignatureAndDataOrBuilder>
        getSignatureOneFieldBuilder() {
      if (signatureOneBuilder_ == null) {
        signatureOneBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            SignatureAndData, SignatureAndData.Builder, SignatureAndDataOrBuilder>(
                getSignatureOne(),
                getParentForChildren(),
                isClean());
        signatureOne_ = null;
      }
      return signatureOneBuilder_;
    }

    private SignatureAndData signatureTwo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        SignatureAndData, SignatureAndData.Builder, SignatureAndDataOrBuilder> signatureTwoBuilder_;
    /**
     * <code>.ibc.lightclients.solomachine.v2.SignatureAndData signature_two = 4 [json_name = "signatureTwo", (.gogoproto.moretags) = "yaml:&#92;"signature_two&#92;""];</code>
     * @return Whether the signatureTwo field is set.
     */
    public boolean hasSignatureTwo() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.ibc.lightclients.solomachine.v2.SignatureAndData signature_two = 4 [json_name = "signatureTwo", (.gogoproto.moretags) = "yaml:&#92;"signature_two&#92;""];</code>
     * @return The signatureTwo.
     */
    public SignatureAndData getSignatureTwo() {
      if (signatureTwoBuilder_ == null) {
        return signatureTwo_ == null ? SignatureAndData.getDefaultInstance() : signatureTwo_;
      } else {
        return signatureTwoBuilder_.getMessage();
      }
    }
    /**
     * <code>.ibc.lightclients.solomachine.v2.SignatureAndData signature_two = 4 [json_name = "signatureTwo", (.gogoproto.moretags) = "yaml:&#92;"signature_two&#92;""];</code>
     */
    public Builder setSignatureTwo(SignatureAndData value) {
      if (signatureTwoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        signatureTwo_ = value;
      } else {
        signatureTwoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.lightclients.solomachine.v2.SignatureAndData signature_two = 4 [json_name = "signatureTwo", (.gogoproto.moretags) = "yaml:&#92;"signature_two&#92;""];</code>
     */
    public Builder setSignatureTwo(
        SignatureAndData.Builder builderForValue) {
      if (signatureTwoBuilder_ == null) {
        signatureTwo_ = builderForValue.build();
      } else {
        signatureTwoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.lightclients.solomachine.v2.SignatureAndData signature_two = 4 [json_name = "signatureTwo", (.gogoproto.moretags) = "yaml:&#92;"signature_two&#92;""];</code>
     */
    public Builder mergeSignatureTwo(SignatureAndData value) {
      if (signatureTwoBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          signatureTwo_ != null &&
          signatureTwo_ != SignatureAndData.getDefaultInstance()) {
          getSignatureTwoBuilder().mergeFrom(value);
        } else {
          signatureTwo_ = value;
        }
      } else {
        signatureTwoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.lightclients.solomachine.v2.SignatureAndData signature_two = 4 [json_name = "signatureTwo", (.gogoproto.moretags) = "yaml:&#92;"signature_two&#92;""];</code>
     */
    public Builder clearSignatureTwo() {
      bitField0_ = (bitField0_ & ~0x00000008);
      signatureTwo_ = null;
      if (signatureTwoBuilder_ != null) {
        signatureTwoBuilder_.dispose();
        signatureTwoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.lightclients.solomachine.v2.SignatureAndData signature_two = 4 [json_name = "signatureTwo", (.gogoproto.moretags) = "yaml:&#92;"signature_two&#92;""];</code>
     */
    public SignatureAndData.Builder getSignatureTwoBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getSignatureTwoFieldBuilder().getBuilder();
    }
    /**
     * <code>.ibc.lightclients.solomachine.v2.SignatureAndData signature_two = 4 [json_name = "signatureTwo", (.gogoproto.moretags) = "yaml:&#92;"signature_two&#92;""];</code>
     */
    public SignatureAndDataOrBuilder getSignatureTwoOrBuilder() {
      if (signatureTwoBuilder_ != null) {
        return signatureTwoBuilder_.getMessageOrBuilder();
      } else {
        return signatureTwo_ == null ?
            SignatureAndData.getDefaultInstance() : signatureTwo_;
      }
    }
    /**
     * <code>.ibc.lightclients.solomachine.v2.SignatureAndData signature_two = 4 [json_name = "signatureTwo", (.gogoproto.moretags) = "yaml:&#92;"signature_two&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        SignatureAndData, SignatureAndData.Builder, SignatureAndDataOrBuilder>
        getSignatureTwoFieldBuilder() {
      if (signatureTwoBuilder_ == null) {
        signatureTwoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            SignatureAndData, SignatureAndData.Builder, SignatureAndDataOrBuilder>(
                getSignatureTwo(),
                getParentForChildren(),
                isClean());
        signatureTwo_ = null;
      }
      return signatureTwoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ibc.lightclients.solomachine.v2.Misbehaviour)
  }

  // @@protoc_insertion_point(class_scope:ibc.lightclients.solomachine.v2.Misbehaviour)
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

