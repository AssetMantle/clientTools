// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/mempool/types.proto

package com.tendermint.mempool;

/**
 * Protobuf type {@code tendermint.mempool.Message}
 */
public final class Message extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tendermint.mempool.Message)
    MessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Message.newBuilder() to construct.
  private Message(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Message() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Message();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tendermint.mempool.TypesProto.internal_static_tendermint_mempool_Message_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tendermint.mempool.TypesProto.internal_static_tendermint_mempool_Message_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tendermint.mempool.Message.class, com.tendermint.mempool.Message.Builder.class);
  }

  private int sumCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object sum_;
  public enum SumCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    TXS(1),
    SUM_NOT_SET(0);
    private final int value;
    private SumCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SumCase valueOf(int value) {
      return forNumber(value);
    }

    public static SumCase forNumber(int value) {
      switch (value) {
        case 1: return TXS;
        case 0: return SUM_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public SumCase
  getSumCase() {
    return SumCase.forNumber(
        sumCase_);
  }

  public static final int TXS_FIELD_NUMBER = 1;
  /**
   * <code>.tendermint.mempool.Txs txs = 1 [json_name = "txs"];</code>
   * @return Whether the txs field is set.
   */
  @java.lang.Override
  public boolean hasTxs() {
    return sumCase_ == 1;
  }
  /**
   * <code>.tendermint.mempool.Txs txs = 1 [json_name = "txs"];</code>
   * @return The txs.
   */
  @java.lang.Override
  public com.tendermint.mempool.Txs getTxs() {
    if (sumCase_ == 1) {
       return (com.tendermint.mempool.Txs) sum_;
    }
    return com.tendermint.mempool.Txs.getDefaultInstance();
  }
  /**
   * <code>.tendermint.mempool.Txs txs = 1 [json_name = "txs"];</code>
   */
  @java.lang.Override
  public com.tendermint.mempool.TxsOrBuilder getTxsOrBuilder() {
    if (sumCase_ == 1) {
       return (com.tendermint.mempool.Txs) sum_;
    }
    return com.tendermint.mempool.Txs.getDefaultInstance();
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
    if (sumCase_ == 1) {
      output.writeMessage(1, (com.tendermint.mempool.Txs) sum_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sumCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.tendermint.mempool.Txs) sum_);
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
    if (!(obj instanceof com.tendermint.mempool.Message)) {
      return super.equals(obj);
    }
    com.tendermint.mempool.Message other = (com.tendermint.mempool.Message) obj;

    if (!getSumCase().equals(other.getSumCase())) return false;
    switch (sumCase_) {
      case 1:
        if (!getTxs()
            .equals(other.getTxs())) return false;
        break;
      case 0:
      default:
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
    switch (sumCase_) {
      case 1:
        hash = (37 * hash) + TXS_FIELD_NUMBER;
        hash = (53 * hash) + getTxs().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tendermint.mempool.Message parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.mempool.Message parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.mempool.Message parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.mempool.Message parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.mempool.Message parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tendermint.mempool.Message parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tendermint.mempool.Message parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.mempool.Message parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tendermint.mempool.Message parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tendermint.mempool.Message parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tendermint.mempool.Message parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tendermint.mempool.Message parseFrom(
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
  public static Builder newBuilder(com.tendermint.mempool.Message prototype) {
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
   * Protobuf type {@code tendermint.mempool.Message}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tendermint.mempool.Message)
      com.tendermint.mempool.MessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tendermint.mempool.TypesProto.internal_static_tendermint_mempool_Message_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tendermint.mempool.TypesProto.internal_static_tendermint_mempool_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tendermint.mempool.Message.class, com.tendermint.mempool.Message.Builder.class);
    }

    // Construct using com.tendermint.mempool.Message.newBuilder()
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
      if (txsBuilder_ != null) {
        txsBuilder_.clear();
      }
      sumCase_ = 0;
      sum_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tendermint.mempool.TypesProto.internal_static_tendermint_mempool_Message_descriptor;
    }

    @java.lang.Override
    public com.tendermint.mempool.Message getDefaultInstanceForType() {
      return com.tendermint.mempool.Message.getDefaultInstance();
    }

    @java.lang.Override
    public com.tendermint.mempool.Message build() {
      com.tendermint.mempool.Message result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tendermint.mempool.Message buildPartial() {
      com.tendermint.mempool.Message result = new com.tendermint.mempool.Message(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tendermint.mempool.Message result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.tendermint.mempool.Message result) {
      result.sumCase_ = sumCase_;
      result.sum_ = this.sum_;
      if (sumCase_ == 1 &&
          txsBuilder_ != null) {
        result.sum_ = txsBuilder_.build();
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
      if (other instanceof com.tendermint.mempool.Message) {
        return mergeFrom((com.tendermint.mempool.Message)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tendermint.mempool.Message other) {
      if (other == com.tendermint.mempool.Message.getDefaultInstance()) return this;
      switch (other.getSumCase()) {
        case TXS: {
          mergeTxs(other.getTxs());
          break;
        }
        case SUM_NOT_SET: {
          break;
        }
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
                  getTxsFieldBuilder().getBuilder(),
                  extensionRegistry);
              sumCase_ = 1;
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
    private int sumCase_ = 0;
    private java.lang.Object sum_;
    public SumCase
        getSumCase() {
      return SumCase.forNumber(
          sumCase_);
    }

    public Builder clearSum() {
      sumCase_ = 0;
      sum_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.mempool.Txs, com.tendermint.mempool.Txs.Builder, com.tendermint.mempool.TxsOrBuilder> txsBuilder_;
    /**
     * <code>.tendermint.mempool.Txs txs = 1 [json_name = "txs"];</code>
     * @return Whether the txs field is set.
     */
    @java.lang.Override
    public boolean hasTxs() {
      return sumCase_ == 1;
    }
    /**
     * <code>.tendermint.mempool.Txs txs = 1 [json_name = "txs"];</code>
     * @return The txs.
     */
    @java.lang.Override
    public com.tendermint.mempool.Txs getTxs() {
      if (txsBuilder_ == null) {
        if (sumCase_ == 1) {
          return (com.tendermint.mempool.Txs) sum_;
        }
        return com.tendermint.mempool.Txs.getDefaultInstance();
      } else {
        if (sumCase_ == 1) {
          return txsBuilder_.getMessage();
        }
        return com.tendermint.mempool.Txs.getDefaultInstance();
      }
    }
    /**
     * <code>.tendermint.mempool.Txs txs = 1 [json_name = "txs"];</code>
     */
    public Builder setTxs(com.tendermint.mempool.Txs value) {
      if (txsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sum_ = value;
        onChanged();
      } else {
        txsBuilder_.setMessage(value);
      }
      sumCase_ = 1;
      return this;
    }
    /**
     * <code>.tendermint.mempool.Txs txs = 1 [json_name = "txs"];</code>
     */
    public Builder setTxs(
        com.tendermint.mempool.Txs.Builder builderForValue) {
      if (txsBuilder_ == null) {
        sum_ = builderForValue.build();
        onChanged();
      } else {
        txsBuilder_.setMessage(builderForValue.build());
      }
      sumCase_ = 1;
      return this;
    }
    /**
     * <code>.tendermint.mempool.Txs txs = 1 [json_name = "txs"];</code>
     */
    public Builder mergeTxs(com.tendermint.mempool.Txs value) {
      if (txsBuilder_ == null) {
        if (sumCase_ == 1 &&
            sum_ != com.tendermint.mempool.Txs.getDefaultInstance()) {
          sum_ = com.tendermint.mempool.Txs.newBuilder((com.tendermint.mempool.Txs) sum_)
              .mergeFrom(value).buildPartial();
        } else {
          sum_ = value;
        }
        onChanged();
      } else {
        if (sumCase_ == 1) {
          txsBuilder_.mergeFrom(value);
        } else {
          txsBuilder_.setMessage(value);
        }
      }
      sumCase_ = 1;
      return this;
    }
    /**
     * <code>.tendermint.mempool.Txs txs = 1 [json_name = "txs"];</code>
     */
    public Builder clearTxs() {
      if (txsBuilder_ == null) {
        if (sumCase_ == 1) {
          sumCase_ = 0;
          sum_ = null;
          onChanged();
        }
      } else {
        if (sumCase_ == 1) {
          sumCase_ = 0;
          sum_ = null;
        }
        txsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.tendermint.mempool.Txs txs = 1 [json_name = "txs"];</code>
     */
    public com.tendermint.mempool.Txs.Builder getTxsBuilder() {
      return getTxsFieldBuilder().getBuilder();
    }
    /**
     * <code>.tendermint.mempool.Txs txs = 1 [json_name = "txs"];</code>
     */
    @java.lang.Override
    public com.tendermint.mempool.TxsOrBuilder getTxsOrBuilder() {
      if ((sumCase_ == 1) && (txsBuilder_ != null)) {
        return txsBuilder_.getMessageOrBuilder();
      } else {
        if (sumCase_ == 1) {
          return (com.tendermint.mempool.Txs) sum_;
        }
        return com.tendermint.mempool.Txs.getDefaultInstance();
      }
    }
    /**
     * <code>.tendermint.mempool.Txs txs = 1 [json_name = "txs"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.mempool.Txs, com.tendermint.mempool.Txs.Builder, com.tendermint.mempool.TxsOrBuilder> 
        getTxsFieldBuilder() {
      if (txsBuilder_ == null) {
        if (!(sumCase_ == 1)) {
          sum_ = com.tendermint.mempool.Txs.getDefaultInstance();
        }
        txsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tendermint.mempool.Txs, com.tendermint.mempool.Txs.Builder, com.tendermint.mempool.TxsOrBuilder>(
                (com.tendermint.mempool.Txs) sum_,
                getParentForChildren(),
                isClean());
        sum_ = null;
      }
      sumCase_ = 1;
      onChanged();
      return txsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tendermint.mempool.Message)
  }

  // @@protoc_insertion_point(class_scope:tendermint.mempool.Message)
  private static final com.tendermint.mempool.Message DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tendermint.mempool.Message();
  }

  public static com.tendermint.mempool.Message getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Message>
      PARSER = new com.google.protobuf.AbstractParser<Message>() {
    @java.lang.Override
    public Message parsePartialFrom(
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

  public static com.google.protobuf.Parser<Message> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Message> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tendermint.mempool.Message getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

