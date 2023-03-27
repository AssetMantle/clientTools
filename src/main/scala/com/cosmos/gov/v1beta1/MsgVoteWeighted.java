// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/tx.proto

package com.cosmos.gov.v1beta1;

/**
 * <pre>
 * MsgVoteWeighted defines a message to cast a vote.
 *
 * Since: cosmos-sdk 0.43
 * </pre>
 *
 * Protobuf type {@code cosmos.gov.v1beta1.MsgVoteWeighted}
 */
public final class MsgVoteWeighted extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.gov.v1beta1.MsgVoteWeighted)
    MsgVoteWeightedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgVoteWeighted.newBuilder() to construct.
  private MsgVoteWeighted(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgVoteWeighted() {
    voter_ = "";
    options_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgVoteWeighted();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return TxProto.internal_static_cosmos_gov_v1beta1_MsgVoteWeighted_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return TxProto.internal_static_cosmos_gov_v1beta1_MsgVoteWeighted_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            MsgVoteWeighted.class, Builder.class);
  }

  public static final int PROPOSAL_ID_FIELD_NUMBER = 1;
  private long proposalId_ = 0L;
  /**
   * <code>uint64 proposal_id = 1 [json_name = "proposalId", (.gogoproto.moretags) = "yaml:&#92;"proposal_id&#92;""];</code>
   * @return The proposalId.
   */
  @Override
  public long getProposalId() {
    return proposalId_;
  }

  public static final int VOTER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile Object voter_ = "";
  /**
   * <code>string voter = 2 [json_name = "voter"];</code>
   * @return The voter.
   */
  @Override
  public String getVoter() {
    Object ref = voter_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      voter_ = s;
      return s;
    }
  }
  /**
   * <code>string voter = 2 [json_name = "voter"];</code>
   * @return The bytes for voter.
   */
  @Override
  public com.google.protobuf.ByteString
      getVoterBytes() {
    Object ref = voter_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      voter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPTIONS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<WeightedVoteOption> options_;
  /**
   * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
   */
  @Override
  public java.util.List<WeightedVoteOption> getOptionsList() {
    return options_;
  }
  /**
   * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
   */
  @Override
  public java.util.List<? extends WeightedVoteOptionOrBuilder>
      getOptionsOrBuilderList() {
    return options_;
  }
  /**
   * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
   */
  @Override
  public int getOptionsCount() {
    return options_.size();
  }
  /**
   * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
   */
  @Override
  public WeightedVoteOption getOptions(int index) {
    return options_.get(index);
  }
  /**
   * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
   */
  @Override
  public WeightedVoteOptionOrBuilder getOptionsOrBuilder(
      int index) {
    return options_.get(index);
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
    if (proposalId_ != 0L) {
      output.writeUInt64(1, proposalId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(voter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, voter_);
    }
    for (int i = 0; i < options_.size(); i++) {
      output.writeMessage(3, options_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (proposalId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, proposalId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(voter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, voter_);
    }
    for (int i = 0; i < options_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, options_.get(i));
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
    if (!(obj instanceof MsgVoteWeighted)) {
      return super.equals(obj);
    }
    MsgVoteWeighted other = (MsgVoteWeighted) obj;

    if (getProposalId()
        != other.getProposalId()) return false;
    if (!getVoter()
        .equals(other.getVoter())) return false;
    if (!getOptionsList()
        .equals(other.getOptionsList())) return false;
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
    hash = (37 * hash) + PROPOSAL_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getProposalId());
    hash = (37 * hash) + VOTER_FIELD_NUMBER;
    hash = (53 * hash) + getVoter().hashCode();
    if (getOptionsCount() > 0) {
      hash = (37 * hash) + OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOptionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static MsgVoteWeighted parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MsgVoteWeighted parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MsgVoteWeighted parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MsgVoteWeighted parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MsgVoteWeighted parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MsgVoteWeighted parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MsgVoteWeighted parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MsgVoteWeighted parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static MsgVoteWeighted parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static MsgVoteWeighted parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static MsgVoteWeighted parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MsgVoteWeighted parseFrom(
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
  public static Builder newBuilder(MsgVoteWeighted prototype) {
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
   * MsgVoteWeighted defines a message to cast a vote.
   *
   * Since: cosmos-sdk 0.43
   * </pre>
   *
   * Protobuf type {@code cosmos.gov.v1beta1.MsgVoteWeighted}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.gov.v1beta1.MsgVoteWeighted)
      MsgVoteWeightedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TxProto.internal_static_cosmos_gov_v1beta1_MsgVoteWeighted_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TxProto.internal_static_cosmos_gov_v1beta1_MsgVoteWeighted_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MsgVoteWeighted.class, Builder.class);
    }

    // Construct using com.cosmos.gov.v1beta1.MsgVoteWeighted.newBuilder()
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
      proposalId_ = 0L;
      voter_ = "";
      if (optionsBuilder_ == null) {
        options_ = java.util.Collections.emptyList();
      } else {
        options_ = null;
        optionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return TxProto.internal_static_cosmos_gov_v1beta1_MsgVoteWeighted_descriptor;
    }

    @Override
    public MsgVoteWeighted getDefaultInstanceForType() {
      return MsgVoteWeighted.getDefaultInstance();
    }

    @Override
    public MsgVoteWeighted build() {
      MsgVoteWeighted result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public MsgVoteWeighted buildPartial() {
      MsgVoteWeighted result = new MsgVoteWeighted(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(MsgVoteWeighted result) {
      if (optionsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          options_ = java.util.Collections.unmodifiableList(options_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.options_ = options_;
      } else {
        result.options_ = optionsBuilder_.build();
      }
    }

    private void buildPartial0(MsgVoteWeighted result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.proposalId_ = proposalId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.voter_ = voter_;
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
      if (other instanceof MsgVoteWeighted) {
        return mergeFrom((MsgVoteWeighted)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(MsgVoteWeighted other) {
      if (other == MsgVoteWeighted.getDefaultInstance()) return this;
      if (other.getProposalId() != 0L) {
        setProposalId(other.getProposalId());
      }
      if (!other.getVoter().isEmpty()) {
        voter_ = other.voter_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (optionsBuilder_ == null) {
        if (!other.options_.isEmpty()) {
          if (options_.isEmpty()) {
            options_ = other.options_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureOptionsIsMutable();
            options_.addAll(other.options_);
          }
          onChanged();
        }
      } else {
        if (!other.options_.isEmpty()) {
          if (optionsBuilder_.isEmpty()) {
            optionsBuilder_.dispose();
            optionsBuilder_ = null;
            options_ = other.options_;
            bitField0_ = (bitField0_ & ~0x00000004);
            optionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOptionsFieldBuilder() : null;
          } else {
            optionsBuilder_.addAllMessages(other.options_);
          }
        }
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
              proposalId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              voter_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              WeightedVoteOption m =
                  input.readMessage(
                      WeightedVoteOption.parser(),
                      extensionRegistry);
              if (optionsBuilder_ == null) {
                ensureOptionsIsMutable();
                options_.add(m);
              } else {
                optionsBuilder_.addMessage(m);
              }
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

    private long proposalId_ ;
    /**
     * <code>uint64 proposal_id = 1 [json_name = "proposalId", (.gogoproto.moretags) = "yaml:&#92;"proposal_id&#92;""];</code>
     * @return The proposalId.
     */
    @Override
    public long getProposalId() {
      return proposalId_;
    }
    /**
     * <code>uint64 proposal_id = 1 [json_name = "proposalId", (.gogoproto.moretags) = "yaml:&#92;"proposal_id&#92;""];</code>
     * @param value The proposalId to set.
     * @return This builder for chaining.
     */
    public Builder setProposalId(long value) {

      proposalId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 proposal_id = 1 [json_name = "proposalId", (.gogoproto.moretags) = "yaml:&#92;"proposal_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearProposalId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      proposalId_ = 0L;
      onChanged();
      return this;
    }

    private Object voter_ = "";
    /**
     * <code>string voter = 2 [json_name = "voter"];</code>
     * @return The voter.
     */
    public String getVoter() {
      Object ref = voter_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        voter_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string voter = 2 [json_name = "voter"];</code>
     * @return The bytes for voter.
     */
    public com.google.protobuf.ByteString
        getVoterBytes() {
      Object ref = voter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        voter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string voter = 2 [json_name = "voter"];</code>
     * @param value The voter to set.
     * @return This builder for chaining.
     */
    public Builder setVoter(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      voter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string voter = 2 [json_name = "voter"];</code>
     * @return This builder for chaining.
     */
    public Builder clearVoter() {
      voter_ = getDefaultInstance().getVoter();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string voter = 2 [json_name = "voter"];</code>
     * @param value The bytes for voter to set.
     * @return This builder for chaining.
     */
    public Builder setVoterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      voter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.util.List<WeightedVoteOption> options_ =
      java.util.Collections.emptyList();
    private void ensureOptionsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        options_ = new java.util.ArrayList<WeightedVoteOption>(options_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        WeightedVoteOption, WeightedVoteOption.Builder, WeightedVoteOptionOrBuilder> optionsBuilder_;

    /**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<WeightedVoteOption> getOptionsList() {
      if (optionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(options_);
      } else {
        return optionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     */
    public int getOptionsCount() {
      if (optionsBuilder_ == null) {
        return options_.size();
      } else {
        return optionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     */
    public WeightedVoteOption getOptions(int index) {
      if (optionsBuilder_ == null) {
        return options_.get(index);
      } else {
        return optionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     */
    public Builder setOptions(
        int index, WeightedVoteOption value) {
      if (optionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOptionsIsMutable();
        options_.set(index, value);
        onChanged();
      } else {
        optionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     */
    public Builder setOptions(
        int index, WeightedVoteOption.Builder builderForValue) {
      if (optionsBuilder_ == null) {
        ensureOptionsIsMutable();
        options_.set(index, builderForValue.build());
        onChanged();
      } else {
        optionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     */
    public Builder addOptions(WeightedVoteOption value) {
      if (optionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOptionsIsMutable();
        options_.add(value);
        onChanged();
      } else {
        optionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     */
    public Builder addOptions(
        int index, WeightedVoteOption value) {
      if (optionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOptionsIsMutable();
        options_.add(index, value);
        onChanged();
      } else {
        optionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     */
    public Builder addOptions(
        WeightedVoteOption.Builder builderForValue) {
      if (optionsBuilder_ == null) {
        ensureOptionsIsMutable();
        options_.add(builderForValue.build());
        onChanged();
      } else {
        optionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     */
    public Builder addOptions(
        int index, WeightedVoteOption.Builder builderForValue) {
      if (optionsBuilder_ == null) {
        ensureOptionsIsMutable();
        options_.add(index, builderForValue.build());
        onChanged();
      } else {
        optionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllOptions(
        Iterable<? extends WeightedVoteOption> values) {
      if (optionsBuilder_ == null) {
        ensureOptionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, options_);
        onChanged();
      } else {
        optionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearOptions() {
      if (optionsBuilder_ == null) {
        options_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        optionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeOptions(int index) {
      if (optionsBuilder_ == null) {
        ensureOptionsIsMutable();
        options_.remove(index);
        onChanged();
      } else {
        optionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     */
    public WeightedVoteOption.Builder getOptionsBuilder(
        int index) {
      return getOptionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     */
    public WeightedVoteOptionOrBuilder getOptionsOrBuilder(
        int index) {
      if (optionsBuilder_ == null) {
        return options_.get(index);  } else {
        return optionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends WeightedVoteOptionOrBuilder>
         getOptionsOrBuilderList() {
      if (optionsBuilder_ != null) {
        return optionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(options_);
      }
    }
    /**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     */
    public WeightedVoteOption.Builder addOptionsBuilder() {
      return getOptionsFieldBuilder().addBuilder(
          WeightedVoteOption.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     */
    public WeightedVoteOption.Builder addOptionsBuilder(
        int index) {
      return getOptionsFieldBuilder().addBuilder(
          index, WeightedVoteOption.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<WeightedVoteOption.Builder>
         getOptionsBuilderList() {
      return getOptionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        WeightedVoteOption, WeightedVoteOption.Builder, WeightedVoteOptionOrBuilder>
        getOptionsFieldBuilder() {
      if (optionsBuilder_ == null) {
        optionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            WeightedVoteOption, WeightedVoteOption.Builder, WeightedVoteOptionOrBuilder>(
                options_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        options_ = null;
      }
      return optionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.gov.v1beta1.MsgVoteWeighted)
  }

  // @@protoc_insertion_point(class_scope:cosmos.gov.v1beta1.MsgVoteWeighted)
  private static final MsgVoteWeighted DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new MsgVoteWeighted();
  }

  public static MsgVoteWeighted getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgVoteWeighted>
      PARSER = new com.google.protobuf.AbstractParser<MsgVoteWeighted>() {
    @Override
    public MsgVoteWeighted parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgVoteWeighted> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<MsgVoteWeighted> getParserForType() {
    return PARSER;
  }

  @Override
  public MsgVoteWeighted getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

