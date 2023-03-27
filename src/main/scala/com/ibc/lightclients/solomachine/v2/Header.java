// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/solomachine/v2/solomachine.proto

package com.ibc.lightclients.solomachine.v2;

/**
 * <pre>
 * Header defines a solo machine consensus header
 * </pre>
 *
 * Protobuf type {@code ibc.lightclients.solomachine.v2.Header}
 */
public final class Header extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.lightclients.solomachine.v2.Header)
    HeaderOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Header.newBuilder() to construct.
  private Header(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Header() {
    signature_ = com.google.protobuf.ByteString.EMPTY;
    newDiversifier_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new Header();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_Header_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_Header_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Header.class, Builder.class);
  }

  public static final int SEQUENCE_FIELD_NUMBER = 1;
  private long sequence_ = 0L;
  /**
   * <pre>
   * sequence to update solo machine public key at
   * </pre>
   *
   * <code>uint64 sequence = 1 [json_name = "sequence"];</code>
   * @return The sequence.
   */
  @Override
  public long getSequence() {
    return sequence_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 2;
  private long timestamp_ = 0L;
  /**
   * <code>uint64 timestamp = 2 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  @Override
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int SIGNATURE_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes signature = 3 [json_name = "signature"];</code>
   * @return The signature.
   */
  @Override
  public com.google.protobuf.ByteString getSignature() {
    return signature_;
  }

  public static final int NEW_PUBLIC_KEY_FIELD_NUMBER = 4;
  private com.google.protobuf.Any newPublicKey_;
  /**
   * <code>.google.protobuf.Any new_public_key = 4 [json_name = "newPublicKey", (.gogoproto.moretags) = "yaml:&#92;"new_public_key&#92;""];</code>
   * @return Whether the newPublicKey field is set.
   */
  @Override
  public boolean hasNewPublicKey() {
    return newPublicKey_ != null;
  }
  /**
   * <code>.google.protobuf.Any new_public_key = 4 [json_name = "newPublicKey", (.gogoproto.moretags) = "yaml:&#92;"new_public_key&#92;""];</code>
   * @return The newPublicKey.
   */
  @Override
  public com.google.protobuf.Any getNewPublicKey() {
    return newPublicKey_ == null ? com.google.protobuf.Any.getDefaultInstance() : newPublicKey_;
  }
  /**
   * <code>.google.protobuf.Any new_public_key = 4 [json_name = "newPublicKey", (.gogoproto.moretags) = "yaml:&#92;"new_public_key&#92;""];</code>
   */
  @Override
  public com.google.protobuf.AnyOrBuilder getNewPublicKeyOrBuilder() {
    return newPublicKey_ == null ? com.google.protobuf.Any.getDefaultInstance() : newPublicKey_;
  }

  public static final int NEW_DIVERSIFIER_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile Object newDiversifier_ = "";
  /**
   * <code>string new_diversifier = 5 [json_name = "newDiversifier", (.gogoproto.moretags) = "yaml:&#92;"new_diversifier&#92;""];</code>
   * @return The newDiversifier.
   */
  @Override
  public String getNewDiversifier() {
    Object ref = newDiversifier_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      newDiversifier_ = s;
      return s;
    }
  }
  /**
   * <code>string new_diversifier = 5 [json_name = "newDiversifier", (.gogoproto.moretags) = "yaml:&#92;"new_diversifier&#92;""];</code>
   * @return The bytes for newDiversifier.
   */
  @Override
  public com.google.protobuf.ByteString
      getNewDiversifierBytes() {
    Object ref = newDiversifier_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      newDiversifier_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (sequence_ != 0L) {
      output.writeUInt64(1, sequence_);
    }
    if (timestamp_ != 0L) {
      output.writeUInt64(2, timestamp_);
    }
    if (!signature_.isEmpty()) {
      output.writeBytes(3, signature_);
    }
    if (newPublicKey_ != null) {
      output.writeMessage(4, getNewPublicKey());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newDiversifier_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, newDiversifier_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sequence_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, sequence_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, timestamp_);
    }
    if (!signature_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, signature_);
    }
    if (newPublicKey_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getNewPublicKey());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newDiversifier_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, newDiversifier_);
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
    if (!(obj instanceof Header)) {
      return super.equals(obj);
    }
    Header other = (Header) obj;

    if (getSequence()
        != other.getSequence()) return false;
    if (getTimestamp()
        != other.getTimestamp()) return false;
    if (!getSignature()
        .equals(other.getSignature())) return false;
    if (hasNewPublicKey() != other.hasNewPublicKey()) return false;
    if (hasNewPublicKey()) {
      if (!getNewPublicKey()
          .equals(other.getNewPublicKey())) return false;
    }
    if (!getNewDiversifier()
        .equals(other.getNewDiversifier())) return false;
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
    hash = (37 * hash) + SEQUENCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSequence());
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getSignature().hashCode();
    if (hasNewPublicKey()) {
      hash = (37 * hash) + NEW_PUBLIC_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getNewPublicKey().hashCode();
    }
    hash = (37 * hash) + NEW_DIVERSIFIER_FIELD_NUMBER;
    hash = (53 * hash) + getNewDiversifier().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Header parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Header parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Header parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Header parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Header parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Header parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Header parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Header parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Header parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Header parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Header parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Header parseFrom(
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
  public static Builder newBuilder(Header prototype) {
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
   * Header defines a solo machine consensus header
   * </pre>
   *
   * Protobuf type {@code ibc.lightclients.solomachine.v2.Header}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.lightclients.solomachine.v2.Header)
      HeaderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_Header_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_Header_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Header.class, Builder.class);
    }

    // Construct using com.ibc.lightclients.solomachine.v2.Header.newBuilder()
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
      sequence_ = 0L;
      timestamp_ = 0L;
      signature_ = com.google.protobuf.ByteString.EMPTY;
      newPublicKey_ = null;
      if (newPublicKeyBuilder_ != null) {
        newPublicKeyBuilder_.dispose();
        newPublicKeyBuilder_ = null;
      }
      newDiversifier_ = "";
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return SolomachineProto.internal_static_ibc_lightclients_solomachine_v2_Header_descriptor;
    }

    @Override
    public Header getDefaultInstanceForType() {
      return Header.getDefaultInstance();
    }

    @Override
    public Header build() {
      Header result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Header buildPartial() {
      Header result = new Header(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(Header result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sequence_ = sequence_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.timestamp_ = timestamp_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.signature_ = signature_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.newPublicKey_ = newPublicKeyBuilder_ == null
            ? newPublicKey_
            : newPublicKeyBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.newDiversifier_ = newDiversifier_;
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
      if (other instanceof Header) {
        return mergeFrom((Header)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Header other) {
      if (other == Header.getDefaultInstance()) return this;
      if (other.getSequence() != 0L) {
        setSequence(other.getSequence());
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      if (other.getSignature() != com.google.protobuf.ByteString.EMPTY) {
        setSignature(other.getSignature());
      }
      if (other.hasNewPublicKey()) {
        mergeNewPublicKey(other.getNewPublicKey());
      }
      if (!other.getNewDiversifier().isEmpty()) {
        newDiversifier_ = other.newDiversifier_;
        bitField0_ |= 0x00000010;
        onChanged();
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
            case 8: {
              sequence_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              timestamp_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              signature_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getNewPublicKeyFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              newDiversifier_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private long sequence_ ;
    /**
     * <pre>
     * sequence to update solo machine public key at
     * </pre>
     *
     * <code>uint64 sequence = 1 [json_name = "sequence"];</code>
     * @return The sequence.
     */
    @Override
    public long getSequence() {
      return sequence_;
    }
    /**
     * <pre>
     * sequence to update solo machine public key at
     * </pre>
     *
     * <code>uint64 sequence = 1 [json_name = "sequence"];</code>
     * @param value The sequence to set.
     * @return This builder for chaining.
     */
    public Builder setSequence(long value) {

      sequence_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * sequence to update solo machine public key at
     * </pre>
     *
     * <code>uint64 sequence = 1 [json_name = "sequence"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSequence() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sequence_ = 0L;
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>uint64 timestamp = 2 [json_name = "timestamp"];</code>
     * @return The timestamp.
     */
    @Override
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>uint64 timestamp = 2 [json_name = "timestamp"];</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {

      timestamp_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 timestamp = 2 [json_name = "timestamp"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000002);
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes signature = 3 [json_name = "signature"];</code>
     * @return The signature.
     */
    @Override
    public com.google.protobuf.ByteString getSignature() {
      return signature_;
    }
    /**
     * <code>bytes signature = 3 [json_name = "signature"];</code>
     * @param value The signature to set.
     * @return This builder for chaining.
     */
    public Builder setSignature(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      signature_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bytes signature = 3 [json_name = "signature"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSignature() {
      bitField0_ = (bitField0_ & ~0x00000004);
      signature_ = getDefaultInstance().getSignature();
      onChanged();
      return this;
    }

    private com.google.protobuf.Any newPublicKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> newPublicKeyBuilder_;
    /**
     * <code>.google.protobuf.Any new_public_key = 4 [json_name = "newPublicKey", (.gogoproto.moretags) = "yaml:&#92;"new_public_key&#92;""];</code>
     * @return Whether the newPublicKey field is set.
     */
    public boolean hasNewPublicKey() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.google.protobuf.Any new_public_key = 4 [json_name = "newPublicKey", (.gogoproto.moretags) = "yaml:&#92;"new_public_key&#92;""];</code>
     * @return The newPublicKey.
     */
    public com.google.protobuf.Any getNewPublicKey() {
      if (newPublicKeyBuilder_ == null) {
        return newPublicKey_ == null ? com.google.protobuf.Any.getDefaultInstance() : newPublicKey_;
      } else {
        return newPublicKeyBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Any new_public_key = 4 [json_name = "newPublicKey", (.gogoproto.moretags) = "yaml:&#92;"new_public_key&#92;""];</code>
     */
    public Builder setNewPublicKey(com.google.protobuf.Any value) {
      if (newPublicKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        newPublicKey_ = value;
      } else {
        newPublicKeyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any new_public_key = 4 [json_name = "newPublicKey", (.gogoproto.moretags) = "yaml:&#92;"new_public_key&#92;""];</code>
     */
    public Builder setNewPublicKey(
        com.google.protobuf.Any.Builder builderForValue) {
      if (newPublicKeyBuilder_ == null) {
        newPublicKey_ = builderForValue.build();
      } else {
        newPublicKeyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any new_public_key = 4 [json_name = "newPublicKey", (.gogoproto.moretags) = "yaml:&#92;"new_public_key&#92;""];</code>
     */
    public Builder mergeNewPublicKey(com.google.protobuf.Any value) {
      if (newPublicKeyBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          newPublicKey_ != null &&
          newPublicKey_ != com.google.protobuf.Any.getDefaultInstance()) {
          getNewPublicKeyBuilder().mergeFrom(value);
        } else {
          newPublicKey_ = value;
        }
      } else {
        newPublicKeyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any new_public_key = 4 [json_name = "newPublicKey", (.gogoproto.moretags) = "yaml:&#92;"new_public_key&#92;""];</code>
     */
    public Builder clearNewPublicKey() {
      bitField0_ = (bitField0_ & ~0x00000008);
      newPublicKey_ = null;
      if (newPublicKeyBuilder_ != null) {
        newPublicKeyBuilder_.dispose();
        newPublicKeyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any new_public_key = 4 [json_name = "newPublicKey", (.gogoproto.moretags) = "yaml:&#92;"new_public_key&#92;""];</code>
     */
    public com.google.protobuf.Any.Builder getNewPublicKeyBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getNewPublicKeyFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Any new_public_key = 4 [json_name = "newPublicKey", (.gogoproto.moretags) = "yaml:&#92;"new_public_key&#92;""];</code>
     */
    public com.google.protobuf.AnyOrBuilder getNewPublicKeyOrBuilder() {
      if (newPublicKeyBuilder_ != null) {
        return newPublicKeyBuilder_.getMessageOrBuilder();
      } else {
        return newPublicKey_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : newPublicKey_;
      }
    }
    /**
     * <code>.google.protobuf.Any new_public_key = 4 [json_name = "newPublicKey", (.gogoproto.moretags) = "yaml:&#92;"new_public_key&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getNewPublicKeyFieldBuilder() {
      if (newPublicKeyBuilder_ == null) {
        newPublicKeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getNewPublicKey(),
                getParentForChildren(),
                isClean());
        newPublicKey_ = null;
      }
      return newPublicKeyBuilder_;
    }

    private Object newDiversifier_ = "";
    /**
     * <code>string new_diversifier = 5 [json_name = "newDiversifier", (.gogoproto.moretags) = "yaml:&#92;"new_diversifier&#92;""];</code>
     * @return The newDiversifier.
     */
    public String getNewDiversifier() {
      Object ref = newDiversifier_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        newDiversifier_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string new_diversifier = 5 [json_name = "newDiversifier", (.gogoproto.moretags) = "yaml:&#92;"new_diversifier&#92;""];</code>
     * @return The bytes for newDiversifier.
     */
    public com.google.protobuf.ByteString
        getNewDiversifierBytes() {
      Object ref = newDiversifier_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        newDiversifier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string new_diversifier = 5 [json_name = "newDiversifier", (.gogoproto.moretags) = "yaml:&#92;"new_diversifier&#92;""];</code>
     * @param value The newDiversifier to set.
     * @return This builder for chaining.
     */
    public Builder setNewDiversifier(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      newDiversifier_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string new_diversifier = 5 [json_name = "newDiversifier", (.gogoproto.moretags) = "yaml:&#92;"new_diversifier&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearNewDiversifier() {
      newDiversifier_ = getDefaultInstance().getNewDiversifier();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string new_diversifier = 5 [json_name = "newDiversifier", (.gogoproto.moretags) = "yaml:&#92;"new_diversifier&#92;""];</code>
     * @param value The bytes for newDiversifier to set.
     * @return This builder for chaining.
     */
    public Builder setNewDiversifierBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      newDiversifier_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:ibc.lightclients.solomachine.v2.Header)
  }

  // @@protoc_insertion_point(class_scope:ibc.lightclients.solomachine.v2.Header)
  private static final Header DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Header();
  }

  public static Header getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Header>
      PARSER = new com.google.protobuf.AbstractParser<Header>() {
    @Override
    public Header parsePartialFrom(
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

  public static com.google.protobuf.Parser<Header> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Header> getParserForType() {
    return PARSER;
  }

  @Override
  public Header getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

