// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/query.proto

package com.cosmos.gov.v1beta1;

/**
 * <pre>
 * QueryProposalsRequest is the request type for the Query/Proposals RPC method.
 * </pre>
 *
 * Protobuf type {@code cosmos.gov.v1beta1.QueryProposalsRequest}
 */
public final class QueryProposalsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.gov.v1beta1.QueryProposalsRequest)
    QueryProposalsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryProposalsRequest.newBuilder() to construct.
  private QueryProposalsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryProposalsRequest() {
    proposalStatus_ = 0;
    voter_ = "";
    depositor_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryProposalsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return QueryProto.internal_static_cosmos_gov_v1beta1_QueryProposalsRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return QueryProto.internal_static_cosmos_gov_v1beta1_QueryProposalsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            QueryProposalsRequest.class, Builder.class);
  }

  public static final int PROPOSAL_STATUS_FIELD_NUMBER = 1;
  private int proposalStatus_ = 0;
  /**
   * <pre>
   * proposal_status defines the status of the proposals.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.ProposalStatus proposal_status = 1 [json_name = "proposalStatus"];</code>
   * @return The enum numeric value on the wire for proposalStatus.
   */
  @Override public int getProposalStatusValue() {
    return proposalStatus_;
  }
  /**
   * <pre>
   * proposal_status defines the status of the proposals.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.ProposalStatus proposal_status = 1 [json_name = "proposalStatus"];</code>
   * @return The proposalStatus.
   */
  @Override public ProposalStatus getProposalStatus() {
    ProposalStatus result = ProposalStatus.forNumber(proposalStatus_);
    return result == null ? ProposalStatus.UNRECOGNIZED : result;
  }

  public static final int VOTER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile Object voter_ = "";
  /**
   * <pre>
   * voter defines the voter address for the proposals.
   * </pre>
   *
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
   * <pre>
   * voter defines the voter address for the proposals.
   * </pre>
   *
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

  public static final int DEPOSITOR_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile Object depositor_ = "";
  /**
   * <pre>
   * depositor defines the deposit addresses from the proposals.
   * </pre>
   *
   * <code>string depositor = 3 [json_name = "depositor"];</code>
   * @return The depositor.
   */
  @Override
  public String getDepositor() {
    Object ref = depositor_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      depositor_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * depositor defines the deposit addresses from the proposals.
   * </pre>
   *
   * <code>string depositor = 3 [json_name = "depositor"];</code>
   * @return The bytes for depositor.
   */
  @Override
  public com.google.protobuf.ByteString
      getDepositorBytes() {
    Object ref = depositor_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      depositor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGINATION_FIELD_NUMBER = 4;
  private com.cosmos.base.query.v1beta1.PageRequest pagination_;
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  @Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  @Override
  public com.cosmos.base.query.v1beta1.PageRequest getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pagination_;
  }
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4 [json_name = "pagination"];</code>
   */
  @Override
  public com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pagination_;
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
    if (proposalStatus_ != ProposalStatus.PROPOSAL_STATUS_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, proposalStatus_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(voter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, voter_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(depositor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, depositor_);
    }
    if (pagination_ != null) {
      output.writeMessage(4, getPagination());
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (proposalStatus_ != ProposalStatus.PROPOSAL_STATUS_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, proposalStatus_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(voter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, voter_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(depositor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, depositor_);
    }
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getPagination());
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
    if (!(obj instanceof QueryProposalsRequest)) {
      return super.equals(obj);
    }
    QueryProposalsRequest other = (QueryProposalsRequest) obj;

    if (proposalStatus_ != other.proposalStatus_) return false;
    if (!getVoter()
        .equals(other.getVoter())) return false;
    if (!getDepositor()
        .equals(other.getDepositor())) return false;
    if (hasPagination() != other.hasPagination()) return false;
    if (hasPagination()) {
      if (!getPagination()
          .equals(other.getPagination())) return false;
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
    hash = (37 * hash) + PROPOSAL_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + proposalStatus_;
    hash = (37 * hash) + VOTER_FIELD_NUMBER;
    hash = (53 * hash) + getVoter().hashCode();
    hash = (37 * hash) + DEPOSITOR_FIELD_NUMBER;
    hash = (53 * hash) + getDepositor().hashCode();
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static QueryProposalsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryProposalsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryProposalsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryProposalsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryProposalsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryProposalsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryProposalsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static QueryProposalsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static QueryProposalsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static QueryProposalsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static QueryProposalsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static QueryProposalsRequest parseFrom(
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
  public static Builder newBuilder(QueryProposalsRequest prototype) {
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
   * QueryProposalsRequest is the request type for the Query/Proposals RPC method.
   * </pre>
   *
   * Protobuf type {@code cosmos.gov.v1beta1.QueryProposalsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.gov.v1beta1.QueryProposalsRequest)
      QueryProposalsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return QueryProto.internal_static_cosmos_gov_v1beta1_QueryProposalsRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return QueryProto.internal_static_cosmos_gov_v1beta1_QueryProposalsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              QueryProposalsRequest.class, Builder.class);
    }

    // Construct using com.cosmos.gov.v1beta1.QueryProposalsRequest.newBuilder()
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
      proposalStatus_ = 0;
      voter_ = "";
      depositor_ = "";
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return QueryProto.internal_static_cosmos_gov_v1beta1_QueryProposalsRequest_descriptor;
    }

    @Override
    public QueryProposalsRequest getDefaultInstanceForType() {
      return QueryProposalsRequest.getDefaultInstance();
    }

    @Override
    public QueryProposalsRequest build() {
      QueryProposalsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public QueryProposalsRequest buildPartial() {
      QueryProposalsRequest result = new QueryProposalsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(QueryProposalsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.proposalStatus_ = proposalStatus_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.voter_ = voter_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.depositor_ = depositor_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
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
      if (other instanceof QueryProposalsRequest) {
        return mergeFrom((QueryProposalsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(QueryProposalsRequest other) {
      if (other == QueryProposalsRequest.getDefaultInstance()) return this;
      if (other.proposalStatus_ != 0) {
        setProposalStatusValue(other.getProposalStatusValue());
      }
      if (!other.getVoter().isEmpty()) {
        voter_ = other.voter_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDepositor().isEmpty()) {
        depositor_ = other.depositor_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasPagination()) {
        mergePagination(other.getPagination());
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
              proposalStatus_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              voter_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              depositor_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getPaginationFieldBuilder().getBuilder(),
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

    private int proposalStatus_ = 0;
    /**
     * <pre>
     * proposal_status defines the status of the proposals.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.ProposalStatus proposal_status = 1 [json_name = "proposalStatus"];</code>
     * @return The enum numeric value on the wire for proposalStatus.
     */
    @Override public int getProposalStatusValue() {
      return proposalStatus_;
    }
    /**
     * <pre>
     * proposal_status defines the status of the proposals.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.ProposalStatus proposal_status = 1 [json_name = "proposalStatus"];</code>
     * @param value The enum numeric value on the wire for proposalStatus to set.
     * @return This builder for chaining.
     */
    public Builder setProposalStatusValue(int value) {
      proposalStatus_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * proposal_status defines the status of the proposals.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.ProposalStatus proposal_status = 1 [json_name = "proposalStatus"];</code>
     * @return The proposalStatus.
     */
    @Override
    public ProposalStatus getProposalStatus() {
      ProposalStatus result = ProposalStatus.forNumber(proposalStatus_);
      return result == null ? ProposalStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * proposal_status defines the status of the proposals.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.ProposalStatus proposal_status = 1 [json_name = "proposalStatus"];</code>
     * @param value The proposalStatus to set.
     * @return This builder for chaining.
     */
    public Builder setProposalStatus(ProposalStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      proposalStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * proposal_status defines the status of the proposals.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta1.ProposalStatus proposal_status = 1 [json_name = "proposalStatus"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProposalStatus() {
      bitField0_ = (bitField0_ & ~0x00000001);
      proposalStatus_ = 0;
      onChanged();
      return this;
    }

    private Object voter_ = "";
    /**
     * <pre>
     * voter defines the voter address for the proposals.
     * </pre>
     *
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
     * <pre>
     * voter defines the voter address for the proposals.
     * </pre>
     *
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
     * <pre>
     * voter defines the voter address for the proposals.
     * </pre>
     *
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
     * <pre>
     * voter defines the voter address for the proposals.
     * </pre>
     *
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
     * <pre>
     * voter defines the voter address for the proposals.
     * </pre>
     *
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

    private Object depositor_ = "";
    /**
     * <pre>
     * depositor defines the deposit addresses from the proposals.
     * </pre>
     *
     * <code>string depositor = 3 [json_name = "depositor"];</code>
     * @return The depositor.
     */
    public String getDepositor() {
      Object ref = depositor_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        depositor_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * depositor defines the deposit addresses from the proposals.
     * </pre>
     *
     * <code>string depositor = 3 [json_name = "depositor"];</code>
     * @return The bytes for depositor.
     */
    public com.google.protobuf.ByteString
        getDepositorBytes() {
      Object ref = depositor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        depositor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * depositor defines the deposit addresses from the proposals.
     * </pre>
     *
     * <code>string depositor = 3 [json_name = "depositor"];</code>
     * @param value The depositor to set.
     * @return This builder for chaining.
     */
    public Builder setDepositor(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      depositor_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * depositor defines the deposit addresses from the proposals.
     * </pre>
     *
     * <code>string depositor = 3 [json_name = "depositor"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDepositor() {
      depositor_ = getDefaultInstance().getDepositor();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * depositor defines the deposit addresses from the proposals.
     * </pre>
     *
     * <code>string depositor = 3 [json_name = "depositor"];</code>
     * @param value The bytes for depositor to set.
     * @return This builder for chaining.
     */
    public Builder setDepositorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      depositor_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.cosmos.base.query.v1beta1.PageRequest pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageRequest, com.cosmos.base.query.v1beta1.PageRequest.Builder, com.cosmos.base.query.v1beta1.PageRequestOrBuilder> paginationBuilder_;
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4 [json_name = "pagination"];</code>
     * @return The pagination.
     */
    public com.cosmos.base.query.v1beta1.PageRequest getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4 [json_name = "pagination"];</code>
     */
    public Builder setPagination(com.cosmos.base.query.v1beta1.PageRequest value) {
      if (paginationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pagination_ = value;
      } else {
        paginationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4 [json_name = "pagination"];</code>
     */
    public Builder setPagination(
        com.cosmos.base.query.v1beta1.PageRequest.Builder builderForValue) {
      if (paginationBuilder_ == null) {
        pagination_ = builderForValue.build();
      } else {
        paginationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4 [json_name = "pagination"];</code>
     */
    public Builder mergePagination(com.cosmos.base.query.v1beta1.PageRequest value) {
      if (paginationBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          pagination_ != null &&
          pagination_ != com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance()) {
          getPaginationBuilder().mergeFrom(value);
        } else {
          pagination_ = value;
        }
      } else {
        paginationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4 [json_name = "pagination"];</code>
     */
    public Builder clearPagination() {
      bitField0_ = (bitField0_ & ~0x00000008);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageRequest.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            com.cosmos.base.query.v1beta1.PageRequest.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4 [json_name = "pagination"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageRequest, com.cosmos.base.query.v1beta1.PageRequest.Builder, com.cosmos.base.query.v1beta1.PageRequestOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.query.v1beta1.PageRequest, com.cosmos.base.query.v1beta1.PageRequest.Builder, com.cosmos.base.query.v1beta1.PageRequestOrBuilder>(
                getPagination(),
                getParentForChildren(),
                isClean());
        pagination_ = null;
      }
      return paginationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.gov.v1beta1.QueryProposalsRequest)
  }

  // @@protoc_insertion_point(class_scope:cosmos.gov.v1beta1.QueryProposalsRequest)
  private static final QueryProposalsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new QueryProposalsRequest();
  }

  public static QueryProposalsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryProposalsRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryProposalsRequest>() {
    @Override
    public QueryProposalsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryProposalsRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<QueryProposalsRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public QueryProposalsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

