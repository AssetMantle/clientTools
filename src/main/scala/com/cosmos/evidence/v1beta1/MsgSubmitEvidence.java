// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/evidence/v1beta1/tx.proto

package com.cosmos.evidence.v1beta1;

/**
 * <pre>
 * MsgSubmitEvidence represents a message that supports submitting arbitrary
 * Evidence of misbehavior such as equivocation or counterfactual signing.
 * </pre>
 *
 * Protobuf type {@code cosmos.evidence.v1beta1.MsgSubmitEvidence}
 */
public final class MsgSubmitEvidence extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.evidence.v1beta1.MsgSubmitEvidence)
    MsgSubmitEvidenceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgSubmitEvidence.newBuilder() to construct.
  private MsgSubmitEvidence(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgSubmitEvidence() {
    submitter_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgSubmitEvidence();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return TxProto.internal_static_cosmos_evidence_v1beta1_MsgSubmitEvidence_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return TxProto.internal_static_cosmos_evidence_v1beta1_MsgSubmitEvidence_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            MsgSubmitEvidence.class, Builder.class);
  }

  public static final int SUBMITTER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile Object submitter_ = "";
  /**
   * <code>string submitter = 1 [json_name = "submitter"];</code>
   * @return The submitter.
   */
  @Override
  public String getSubmitter() {
    Object ref = submitter_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      submitter_ = s;
      return s;
    }
  }
  /**
   * <code>string submitter = 1 [json_name = "submitter"];</code>
   * @return The bytes for submitter.
   */
  @Override
  public com.google.protobuf.ByteString
      getSubmitterBytes() {
    Object ref = submitter_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      submitter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVIDENCE_FIELD_NUMBER = 2;
  private com.google.protobuf.Any evidence_;
  /**
   * <code>.google.protobuf.Any evidence = 2 [json_name = "evidence", (.cosmos_proto.accepts_interface) = "Evidence"];</code>
   * @return Whether the evidence field is set.
   */
  @Override
  public boolean hasEvidence() {
    return evidence_ != null;
  }
  /**
   * <code>.google.protobuf.Any evidence = 2 [json_name = "evidence", (.cosmos_proto.accepts_interface) = "Evidence"];</code>
   * @return The evidence.
   */
  @Override
  public com.google.protobuf.Any getEvidence() {
    return evidence_ == null ? com.google.protobuf.Any.getDefaultInstance() : evidence_;
  }
  /**
   * <code>.google.protobuf.Any evidence = 2 [json_name = "evidence", (.cosmos_proto.accepts_interface) = "Evidence"];</code>
   */
  @Override
  public com.google.protobuf.AnyOrBuilder getEvidenceOrBuilder() {
    return evidence_ == null ? com.google.protobuf.Any.getDefaultInstance() : evidence_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(submitter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, submitter_);
    }
    if (evidence_ != null) {
      output.writeMessage(2, getEvidence());
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(submitter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, submitter_);
    }
    if (evidence_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEvidence());
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
    if (!(obj instanceof MsgSubmitEvidence)) {
      return super.equals(obj);
    }
    MsgSubmitEvidence other = (MsgSubmitEvidence) obj;

    if (!getSubmitter()
        .equals(other.getSubmitter())) return false;
    if (hasEvidence() != other.hasEvidence()) return false;
    if (hasEvidence()) {
      if (!getEvidence()
          .equals(other.getEvidence())) return false;
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
    hash = (37 * hash) + SUBMITTER_FIELD_NUMBER;
    hash = (53 * hash) + getSubmitter().hashCode();
    if (hasEvidence()) {
      hash = (37 * hash) + EVIDENCE_FIELD_NUMBER;
      hash = (53 * hash) + getEvidence().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static MsgSubmitEvidence parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MsgSubmitEvidence parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MsgSubmitEvidence parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MsgSubmitEvidence parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MsgSubmitEvidence parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MsgSubmitEvidence parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MsgSubmitEvidence parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MsgSubmitEvidence parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static MsgSubmitEvidence parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static MsgSubmitEvidence parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static MsgSubmitEvidence parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MsgSubmitEvidence parseFrom(
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
  public static Builder newBuilder(MsgSubmitEvidence prototype) {
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
   * MsgSubmitEvidence represents a message that supports submitting arbitrary
   * Evidence of misbehavior such as equivocation or counterfactual signing.
   * </pre>
   *
   * Protobuf type {@code cosmos.evidence.v1beta1.MsgSubmitEvidence}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.evidence.v1beta1.MsgSubmitEvidence)
      MsgSubmitEvidenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TxProto.internal_static_cosmos_evidence_v1beta1_MsgSubmitEvidence_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TxProto.internal_static_cosmos_evidence_v1beta1_MsgSubmitEvidence_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MsgSubmitEvidence.class, Builder.class);
    }

    // Construct using com.cosmos.evidence.v1beta1.MsgSubmitEvidence.newBuilder()
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
      submitter_ = "";
      evidence_ = null;
      if (evidenceBuilder_ != null) {
        evidenceBuilder_.dispose();
        evidenceBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return TxProto.internal_static_cosmos_evidence_v1beta1_MsgSubmitEvidence_descriptor;
    }

    @Override
    public MsgSubmitEvidence getDefaultInstanceForType() {
      return MsgSubmitEvidence.getDefaultInstance();
    }

    @Override
    public MsgSubmitEvidence build() {
      MsgSubmitEvidence result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public MsgSubmitEvidence buildPartial() {
      MsgSubmitEvidence result = new MsgSubmitEvidence(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(MsgSubmitEvidence result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.submitter_ = submitter_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.evidence_ = evidenceBuilder_ == null
            ? evidence_
            : evidenceBuilder_.build();
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
      if (other instanceof MsgSubmitEvidence) {
        return mergeFrom((MsgSubmitEvidence)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(MsgSubmitEvidence other) {
      if (other == MsgSubmitEvidence.getDefaultInstance()) return this;
      if (!other.getSubmitter().isEmpty()) {
        submitter_ = other.submitter_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasEvidence()) {
        mergeEvidence(other.getEvidence());
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
              submitter_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getEvidenceFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private Object submitter_ = "";
    /**
     * <code>string submitter = 1 [json_name = "submitter"];</code>
     * @return The submitter.
     */
    public String getSubmitter() {
      Object ref = submitter_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        submitter_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string submitter = 1 [json_name = "submitter"];</code>
     * @return The bytes for submitter.
     */
    public com.google.protobuf.ByteString
        getSubmitterBytes() {
      Object ref = submitter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        submitter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string submitter = 1 [json_name = "submitter"];</code>
     * @param value The submitter to set.
     * @return This builder for chaining.
     */
    public Builder setSubmitter(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      submitter_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string submitter = 1 [json_name = "submitter"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSubmitter() {
      submitter_ = getDefaultInstance().getSubmitter();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string submitter = 1 [json_name = "submitter"];</code>
     * @param value The bytes for submitter to set.
     * @return This builder for chaining.
     */
    public Builder setSubmitterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      submitter_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Any evidence_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> evidenceBuilder_;
    /**
     * <code>.google.protobuf.Any evidence = 2 [json_name = "evidence", (.cosmos_proto.accepts_interface) = "Evidence"];</code>
     * @return Whether the evidence field is set.
     */
    public boolean hasEvidence() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.google.protobuf.Any evidence = 2 [json_name = "evidence", (.cosmos_proto.accepts_interface) = "Evidence"];</code>
     * @return The evidence.
     */
    public com.google.protobuf.Any getEvidence() {
      if (evidenceBuilder_ == null) {
        return evidence_ == null ? com.google.protobuf.Any.getDefaultInstance() : evidence_;
      } else {
        return evidenceBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Any evidence = 2 [json_name = "evidence", (.cosmos_proto.accepts_interface) = "Evidence"];</code>
     */
    public Builder setEvidence(com.google.protobuf.Any value) {
      if (evidenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        evidence_ = value;
      } else {
        evidenceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any evidence = 2 [json_name = "evidence", (.cosmos_proto.accepts_interface) = "Evidence"];</code>
     */
    public Builder setEvidence(
        com.google.protobuf.Any.Builder builderForValue) {
      if (evidenceBuilder_ == null) {
        evidence_ = builderForValue.build();
      } else {
        evidenceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any evidence = 2 [json_name = "evidence", (.cosmos_proto.accepts_interface) = "Evidence"];</code>
     */
    public Builder mergeEvidence(com.google.protobuf.Any value) {
      if (evidenceBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          evidence_ != null &&
          evidence_ != com.google.protobuf.Any.getDefaultInstance()) {
          getEvidenceBuilder().mergeFrom(value);
        } else {
          evidence_ = value;
        }
      } else {
        evidenceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any evidence = 2 [json_name = "evidence", (.cosmos_proto.accepts_interface) = "Evidence"];</code>
     */
    public Builder clearEvidence() {
      bitField0_ = (bitField0_ & ~0x00000002);
      evidence_ = null;
      if (evidenceBuilder_ != null) {
        evidenceBuilder_.dispose();
        evidenceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any evidence = 2 [json_name = "evidence", (.cosmos_proto.accepts_interface) = "Evidence"];</code>
     */
    public com.google.protobuf.Any.Builder getEvidenceBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEvidenceFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Any evidence = 2 [json_name = "evidence", (.cosmos_proto.accepts_interface) = "Evidence"];</code>
     */
    public com.google.protobuf.AnyOrBuilder getEvidenceOrBuilder() {
      if (evidenceBuilder_ != null) {
        return evidenceBuilder_.getMessageOrBuilder();
      } else {
        return evidence_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : evidence_;
      }
    }
    /**
     * <code>.google.protobuf.Any evidence = 2 [json_name = "evidence", (.cosmos_proto.accepts_interface) = "Evidence"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getEvidenceFieldBuilder() {
      if (evidenceBuilder_ == null) {
        evidenceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getEvidence(),
                getParentForChildren(),
                isClean());
        evidence_ = null;
      }
      return evidenceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.evidence.v1beta1.MsgSubmitEvidence)
  }

  // @@protoc_insertion_point(class_scope:cosmos.evidence.v1beta1.MsgSubmitEvidence)
  private static final MsgSubmitEvidence DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new MsgSubmitEvidence();
  }

  public static MsgSubmitEvidence getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgSubmitEvidence>
      PARSER = new com.google.protobuf.AbstractParser<MsgSubmitEvidence>() {
    @Override
    public MsgSubmitEvidence parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgSubmitEvidence> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<MsgSubmitEvidence> getParserForType() {
    return PARSER;
  }

  @Override
  public MsgSubmitEvidence getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

