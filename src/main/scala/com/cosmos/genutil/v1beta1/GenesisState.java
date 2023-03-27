// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/genutil/v1beta1/genesis.proto

package com.cosmos.genutil.v1beta1;

/**
 * <pre>
 * GenesisState defines the raw genesis transaction in JSON.
 * </pre>
 *
 * Protobuf type {@code cosmos.genutil.v1beta1.GenesisState}
 */
public final class GenesisState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.genutil.v1beta1.GenesisState)
    GenesisStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenesisState.newBuilder() to construct.
  private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenesisState() {
    genTxs_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenesisState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return GenesisProto.internal_static_cosmos_genutil_v1beta1_GenesisState_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GenesisProto.internal_static_cosmos_genutil_v1beta1_GenesisState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            GenesisState.class, Builder.class);
  }

  public static final int GEN_TXS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.protobuf.ByteString> genTxs_;
  /**
   * <pre>
   * gen_txs defines the genesis transactions.
   * </pre>
   *
   * <code>repeated bytes gen_txs = 1 [json_name = "genTxs", (.gogoproto.jsontag) = "gentxs", (.gogoproto.moretags) = "yaml:&#92;"gentxs&#92;"", (.gogoproto.casttype) = "encoding/json.RawMessage"];</code>
   * @return A list containing the genTxs.
   */
  @Override
  public java.util.List<com.google.protobuf.ByteString>
      getGenTxsList() {
    return genTxs_;
  }
  /**
   * <pre>
   * gen_txs defines the genesis transactions.
   * </pre>
   *
   * <code>repeated bytes gen_txs = 1 [json_name = "genTxs", (.gogoproto.jsontag) = "gentxs", (.gogoproto.moretags) = "yaml:&#92;"gentxs&#92;"", (.gogoproto.casttype) = "encoding/json.RawMessage"];</code>
   * @return The count of genTxs.
   */
  public int getGenTxsCount() {
    return genTxs_.size();
  }
  /**
   * <pre>
   * gen_txs defines the genesis transactions.
   * </pre>
   *
   * <code>repeated bytes gen_txs = 1 [json_name = "genTxs", (.gogoproto.jsontag) = "gentxs", (.gogoproto.moretags) = "yaml:&#92;"gentxs&#92;"", (.gogoproto.casttype) = "encoding/json.RawMessage"];</code>
   * @param index The index of the element to return.
   * @return The genTxs at the given index.
   */
  public com.google.protobuf.ByteString getGenTxs(int index) {
    return genTxs_.get(index);
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
    for (int i = 0; i < genTxs_.size(); i++) {
      output.writeBytes(1, genTxs_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < genTxs_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(genTxs_.get(i));
      }
      size += dataSize;
      size += 1 * getGenTxsList().size();
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
    if (!(obj instanceof GenesisState)) {
      return super.equals(obj);
    }
    GenesisState other = (GenesisState) obj;

    if (!getGenTxsList()
        .equals(other.getGenTxsList())) return false;
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
    if (getGenTxsCount() > 0) {
      hash = (37 * hash) + GEN_TXS_FIELD_NUMBER;
      hash = (53 * hash) + getGenTxsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static GenesisState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GenesisState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GenesisState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GenesisState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GenesisState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GenesisState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GenesisState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GenesisState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static GenesisState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static GenesisState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static GenesisState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GenesisState parseFrom(
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
  public static Builder newBuilder(GenesisState prototype) {
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
   * GenesisState defines the raw genesis transaction in JSON.
   * </pre>
   *
   * Protobuf type {@code cosmos.genutil.v1beta1.GenesisState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.genutil.v1beta1.GenesisState)
      GenesisStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GenesisProto.internal_static_cosmos_genutil_v1beta1_GenesisState_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GenesisProto.internal_static_cosmos_genutil_v1beta1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GenesisState.class, Builder.class);
    }

    // Construct using com.cosmos.genutil.v1beta1.GenesisState.newBuilder()
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
      genTxs_ = java.util.Collections.emptyList();
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GenesisProto.internal_static_cosmos_genutil_v1beta1_GenesisState_descriptor;
    }

    @Override
    public GenesisState getDefaultInstanceForType() {
      return GenesisState.getDefaultInstance();
    }

    @Override
    public GenesisState build() {
      GenesisState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public GenesisState buildPartial() {
      GenesisState result = new GenesisState(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(GenesisState result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        genTxs_ = java.util.Collections.unmodifiableList(genTxs_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.genTxs_ = genTxs_;
    }

    private void buildPartial0(GenesisState result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof GenesisState) {
        return mergeFrom((GenesisState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(GenesisState other) {
      if (other == GenesisState.getDefaultInstance()) return this;
      if (!other.genTxs_.isEmpty()) {
        if (genTxs_.isEmpty()) {
          genTxs_ = other.genTxs_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureGenTxsIsMutable();
          genTxs_.addAll(other.genTxs_);
        }
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
            case 10: {
              com.google.protobuf.ByteString v = input.readBytes();
              ensureGenTxsIsMutable();
              genTxs_.add(v);
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

    private java.util.List<com.google.protobuf.ByteString> genTxs_ = java.util.Collections.emptyList();
    private void ensureGenTxsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        genTxs_ = new java.util.ArrayList<com.google.protobuf.ByteString>(genTxs_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * gen_txs defines the genesis transactions.
     * </pre>
     *
     * <code>repeated bytes gen_txs = 1 [json_name = "genTxs", (.gogoproto.jsontag) = "gentxs", (.gogoproto.moretags) = "yaml:&#92;"gentxs&#92;"", (.gogoproto.casttype) = "encoding/json.RawMessage"];</code>
     * @return A list containing the genTxs.
     */
    public java.util.List<com.google.protobuf.ByteString>
        getGenTxsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(genTxs_) : genTxs_;
    }
    /**
     * <pre>
     * gen_txs defines the genesis transactions.
     * </pre>
     *
     * <code>repeated bytes gen_txs = 1 [json_name = "genTxs", (.gogoproto.jsontag) = "gentxs", (.gogoproto.moretags) = "yaml:&#92;"gentxs&#92;"", (.gogoproto.casttype) = "encoding/json.RawMessage"];</code>
     * @return The count of genTxs.
     */
    public int getGenTxsCount() {
      return genTxs_.size();
    }
    /**
     * <pre>
     * gen_txs defines the genesis transactions.
     * </pre>
     *
     * <code>repeated bytes gen_txs = 1 [json_name = "genTxs", (.gogoproto.jsontag) = "gentxs", (.gogoproto.moretags) = "yaml:&#92;"gentxs&#92;"", (.gogoproto.casttype) = "encoding/json.RawMessage"];</code>
     * @param index The index of the element to return.
     * @return The genTxs at the given index.
     */
    public com.google.protobuf.ByteString getGenTxs(int index) {
      return genTxs_.get(index);
    }
    /**
     * <pre>
     * gen_txs defines the genesis transactions.
     * </pre>
     *
     * <code>repeated bytes gen_txs = 1 [json_name = "genTxs", (.gogoproto.jsontag) = "gentxs", (.gogoproto.moretags) = "yaml:&#92;"gentxs&#92;"", (.gogoproto.casttype) = "encoding/json.RawMessage"];</code>
     * @param index The index to set the value at.
     * @param value The genTxs to set.
     * @return This builder for chaining.
     */
    public Builder setGenTxs(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      ensureGenTxsIsMutable();
      genTxs_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * gen_txs defines the genesis transactions.
     * </pre>
     *
     * <code>repeated bytes gen_txs = 1 [json_name = "genTxs", (.gogoproto.jsontag) = "gentxs", (.gogoproto.moretags) = "yaml:&#92;"gentxs&#92;"", (.gogoproto.casttype) = "encoding/json.RawMessage"];</code>
     * @param value The genTxs to add.
     * @return This builder for chaining.
     */
    public Builder addGenTxs(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      ensureGenTxsIsMutable();
      genTxs_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * gen_txs defines the genesis transactions.
     * </pre>
     *
     * <code>repeated bytes gen_txs = 1 [json_name = "genTxs", (.gogoproto.jsontag) = "gentxs", (.gogoproto.moretags) = "yaml:&#92;"gentxs&#92;"", (.gogoproto.casttype) = "encoding/json.RawMessage"];</code>
     * @param values The genTxs to add.
     * @return This builder for chaining.
     */
    public Builder addAllGenTxs(
        Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureGenTxsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, genTxs_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * gen_txs defines the genesis transactions.
     * </pre>
     *
     * <code>repeated bytes gen_txs = 1 [json_name = "genTxs", (.gogoproto.jsontag) = "gentxs", (.gogoproto.moretags) = "yaml:&#92;"gentxs&#92;"", (.gogoproto.casttype) = "encoding/json.RawMessage"];</code>
     * @return This builder for chaining.
     */
    public Builder clearGenTxs() {
      genTxs_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:cosmos.genutil.v1beta1.GenesisState)
  }

  // @@protoc_insertion_point(class_scope:cosmos.genutil.v1beta1.GenesisState)
  private static final GenesisState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GenesisState();
  }

  public static GenesisState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenesisState>
      PARSER = new com.google.protobuf.AbstractParser<GenesisState>() {
    @Override
    public GenesisState parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenesisState> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<GenesisState> getParserForType() {
    return PARSER;
  }

  @Override
  public GenesisState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

