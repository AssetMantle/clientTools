// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/auth/v1beta1/query.proto

package com.cosmos.auth.v1beta1;

/**
 * <pre>
 * QueryAccountsResponse is the response type for the Query/Accounts RPC method.
 *
 * Since: cosmos-sdk 0.43
 * </pre>
 *
 * Protobuf type {@code cosmos.auth.v1beta1.QueryAccountsResponse}
 */
public final class QueryAccountsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.auth.v1beta1.QueryAccountsResponse)
    QueryAccountsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryAccountsResponse.newBuilder() to construct.
  private QueryAccountsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryAccountsResponse() {
    accounts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryAccountsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.auth.v1beta1.QueryProto.internal_static_cosmos_auth_v1beta1_QueryAccountsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.auth.v1beta1.QueryProto.internal_static_cosmos_auth_v1beta1_QueryAccountsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.auth.v1beta1.QueryAccountsResponse.class, com.cosmos.auth.v1beta1.QueryAccountsResponse.Builder.class);
  }

  public static final int ACCOUNTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.protobuf.Any> accounts_;
  /**
   * <pre>
   * accounts are the existing accounts
   * </pre>
   *
   * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.Any> getAccountsList() {
    return accounts_;
  }
  /**
   * <pre>
   * accounts are the existing accounts
   * </pre>
   *
   * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getAccountsOrBuilderList() {
    return accounts_;
  }
  /**
   * <pre>
   * accounts are the existing accounts
   * </pre>
   *
   * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
   */
  @java.lang.Override
  public int getAccountsCount() {
    return accounts_.size();
  }
  /**
   * <pre>
   * accounts are the existing accounts
   * </pre>
   *
   * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.Any getAccounts(int index) {
    return accounts_.get(index);
  }
  /**
   * <pre>
   * accounts are the existing accounts
   * </pre>
   *
   * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getAccountsOrBuilder(
      int index) {
    return accounts_.get(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private com.cosmos.base.query.v1beta1.PageResponse pagination_;
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
  }
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
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
    for (int i = 0; i < accounts_.size(); i++) {
      output.writeMessage(1, accounts_.get(i));
    }
    if (pagination_ != null) {
      output.writeMessage(2, getPagination());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < accounts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, accounts_.get(i));
    }
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPagination());
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
    if (!(obj instanceof com.cosmos.auth.v1beta1.QueryAccountsResponse)) {
      return super.equals(obj);
    }
    com.cosmos.auth.v1beta1.QueryAccountsResponse other = (com.cosmos.auth.v1beta1.QueryAccountsResponse) obj;

    if (!getAccountsList()
        .equals(other.getAccountsList())) return false;
    if (hasPagination() != other.hasPagination()) return false;
    if (hasPagination()) {
      if (!getPagination()
          .equals(other.getPagination())) return false;
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
    if (getAccountsCount() > 0) {
      hash = (37 * hash) + ACCOUNTS_FIELD_NUMBER;
      hash = (53 * hash) + getAccountsList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.auth.v1beta1.QueryAccountsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.auth.v1beta1.QueryAccountsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.auth.v1beta1.QueryAccountsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.auth.v1beta1.QueryAccountsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.auth.v1beta1.QueryAccountsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.auth.v1beta1.QueryAccountsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.auth.v1beta1.QueryAccountsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.auth.v1beta1.QueryAccountsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.auth.v1beta1.QueryAccountsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cosmos.auth.v1beta1.QueryAccountsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.auth.v1beta1.QueryAccountsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.auth.v1beta1.QueryAccountsResponse parseFrom(
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
  public static Builder newBuilder(com.cosmos.auth.v1beta1.QueryAccountsResponse prototype) {
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
   * <pre>
   * QueryAccountsResponse is the response type for the Query/Accounts RPC method.
   *
   * Since: cosmos-sdk 0.43
   * </pre>
   *
   * Protobuf type {@code cosmos.auth.v1beta1.QueryAccountsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.auth.v1beta1.QueryAccountsResponse)
      com.cosmos.auth.v1beta1.QueryAccountsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.auth.v1beta1.QueryProto.internal_static_cosmos_auth_v1beta1_QueryAccountsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.auth.v1beta1.QueryProto.internal_static_cosmos_auth_v1beta1_QueryAccountsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.auth.v1beta1.QueryAccountsResponse.class, com.cosmos.auth.v1beta1.QueryAccountsResponse.Builder.class);
    }

    // Construct using com.cosmos.auth.v1beta1.QueryAccountsResponse.newBuilder()
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
      if (accountsBuilder_ == null) {
        accounts_ = java.util.Collections.emptyList();
      } else {
        accounts_ = null;
        accountsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.auth.v1beta1.QueryProto.internal_static_cosmos_auth_v1beta1_QueryAccountsResponse_descriptor;
    }

    @java.lang.Override
    public com.cosmos.auth.v1beta1.QueryAccountsResponse getDefaultInstanceForType() {
      return com.cosmos.auth.v1beta1.QueryAccountsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.auth.v1beta1.QueryAccountsResponse build() {
      com.cosmos.auth.v1beta1.QueryAccountsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.auth.v1beta1.QueryAccountsResponse buildPartial() {
      com.cosmos.auth.v1beta1.QueryAccountsResponse result = new com.cosmos.auth.v1beta1.QueryAccountsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.cosmos.auth.v1beta1.QueryAccountsResponse result) {
      if (accountsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          accounts_ = java.util.Collections.unmodifiableList(accounts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.accounts_ = accounts_;
      } else {
        result.accounts_ = accountsBuilder_.build();
      }
    }

    private void buildPartial0(com.cosmos.auth.v1beta1.QueryAccountsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
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
      if (other instanceof com.cosmos.auth.v1beta1.QueryAccountsResponse) {
        return mergeFrom((com.cosmos.auth.v1beta1.QueryAccountsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.auth.v1beta1.QueryAccountsResponse other) {
      if (other == com.cosmos.auth.v1beta1.QueryAccountsResponse.getDefaultInstance()) return this;
      if (accountsBuilder_ == null) {
        if (!other.accounts_.isEmpty()) {
          if (accounts_.isEmpty()) {
            accounts_ = other.accounts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAccountsIsMutable();
            accounts_.addAll(other.accounts_);
          }
          onChanged();
        }
      } else {
        if (!other.accounts_.isEmpty()) {
          if (accountsBuilder_.isEmpty()) {
            accountsBuilder_.dispose();
            accountsBuilder_ = null;
            accounts_ = other.accounts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            accountsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAccountsFieldBuilder() : null;
          } else {
            accountsBuilder_.addAllMessages(other.accounts_);
          }
        }
      }
      if (other.hasPagination()) {
        mergePagination(other.getPagination());
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
              com.google.protobuf.Any m =
                  input.readMessage(
                      com.google.protobuf.Any.parser(),
                      extensionRegistry);
              if (accountsBuilder_ == null) {
                ensureAccountsIsMutable();
                accounts_.add(m);
              } else {
                accountsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPaginationFieldBuilder().getBuilder(),
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

    private java.util.List<com.google.protobuf.Any> accounts_ =
      java.util.Collections.emptyList();
    private void ensureAccountsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        accounts_ = new java.util.ArrayList<com.google.protobuf.Any>(accounts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> accountsBuilder_;

    /**
     * <pre>
     * accounts are the existing accounts
     * </pre>
     *
     * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
     */
    public java.util.List<com.google.protobuf.Any> getAccountsList() {
      if (accountsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(accounts_);
      } else {
        return accountsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * accounts are the existing accounts
     * </pre>
     *
     * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
     */
    public int getAccountsCount() {
      if (accountsBuilder_ == null) {
        return accounts_.size();
      } else {
        return accountsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * accounts are the existing accounts
     * </pre>
     *
     * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
     */
    public com.google.protobuf.Any getAccounts(int index) {
      if (accountsBuilder_ == null) {
        return accounts_.get(index);
      } else {
        return accountsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * accounts are the existing accounts
     * </pre>
     *
     * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
     */
    public Builder setAccounts(
        int index, com.google.protobuf.Any value) {
      if (accountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountsIsMutable();
        accounts_.set(index, value);
        onChanged();
      } else {
        accountsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * accounts are the existing accounts
     * </pre>
     *
     * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
     */
    public Builder setAccounts(
        int index, com.google.protobuf.Any.Builder builderForValue) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        accounts_.set(index, builderForValue.build());
        onChanged();
      } else {
        accountsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * accounts are the existing accounts
     * </pre>
     *
     * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
     */
    public Builder addAccounts(com.google.protobuf.Any value) {
      if (accountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountsIsMutable();
        accounts_.add(value);
        onChanged();
      } else {
        accountsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * accounts are the existing accounts
     * </pre>
     *
     * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
     */
    public Builder addAccounts(
        int index, com.google.protobuf.Any value) {
      if (accountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountsIsMutable();
        accounts_.add(index, value);
        onChanged();
      } else {
        accountsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * accounts are the existing accounts
     * </pre>
     *
     * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
     */
    public Builder addAccounts(
        com.google.protobuf.Any.Builder builderForValue) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        accounts_.add(builderForValue.build());
        onChanged();
      } else {
        accountsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * accounts are the existing accounts
     * </pre>
     *
     * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
     */
    public Builder addAccounts(
        int index, com.google.protobuf.Any.Builder builderForValue) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        accounts_.add(index, builderForValue.build());
        onChanged();
      } else {
        accountsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * accounts are the existing accounts
     * </pre>
     *
     * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
     */
    public Builder addAllAccounts(
        java.lang.Iterable<? extends com.google.protobuf.Any> values) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, accounts_);
        onChanged();
      } else {
        accountsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * accounts are the existing accounts
     * </pre>
     *
     * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
     */
    public Builder clearAccounts() {
      if (accountsBuilder_ == null) {
        accounts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        accountsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * accounts are the existing accounts
     * </pre>
     *
     * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
     */
    public Builder removeAccounts(int index) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        accounts_.remove(index);
        onChanged();
      } else {
        accountsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * accounts are the existing accounts
     * </pre>
     *
     * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
     */
    public com.google.protobuf.Any.Builder getAccountsBuilder(
        int index) {
      return getAccountsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * accounts are the existing accounts
     * </pre>
     *
     * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
     */
    public com.google.protobuf.AnyOrBuilder getAccountsOrBuilder(
        int index) {
      if (accountsBuilder_ == null) {
        return accounts_.get(index);  } else {
        return accountsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * accounts are the existing accounts
     * </pre>
     *
     * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
     */
    public java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
         getAccountsOrBuilderList() {
      if (accountsBuilder_ != null) {
        return accountsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(accounts_);
      }
    }
    /**
     * <pre>
     * accounts are the existing accounts
     * </pre>
     *
     * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
     */
    public com.google.protobuf.Any.Builder addAccountsBuilder() {
      return getAccountsFieldBuilder().addBuilder(
          com.google.protobuf.Any.getDefaultInstance());
    }
    /**
     * <pre>
     * accounts are the existing accounts
     * </pre>
     *
     * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
     */
    public com.google.protobuf.Any.Builder addAccountsBuilder(
        int index) {
      return getAccountsFieldBuilder().addBuilder(
          index, com.google.protobuf.Any.getDefaultInstance());
    }
    /**
     * <pre>
     * accounts are the existing accounts
     * </pre>
     *
     * <code>repeated .google.protobuf.Any accounts = 1 [json_name = "accounts", (.cosmos_proto.accepts_interface) = "AccountI"];</code>
     */
    public java.util.List<com.google.protobuf.Any.Builder> 
         getAccountsBuilderList() {
      return getAccountsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getAccountsFieldBuilder() {
      if (accountsBuilder_ == null) {
        accountsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                accounts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        accounts_ = null;
      }
      return accountsBuilder_;
    }

    private com.cosmos.base.query.v1beta1.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return The pagination.
     */
    public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pagination_ = value;
      } else {
        paginationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(
        com.cosmos.base.query.v1beta1.PageResponse.Builder builderForValue) {
      if (paginationBuilder_ == null) {
        pagination_ = builderForValue.build();
      } else {
        paginationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder mergePagination(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          pagination_ != null &&
          pagination_ != com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance()) {
          getPaginationBuilder().mergeFrom(value);
        } else {
          pagination_ = value;
        }
      } else {
        paginationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder clearPagination() {
      bitField0_ = (bitField0_ & ~0x00000002);
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
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponse.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder>(
                getPagination(),
                getParentForChildren(),
                isClean());
        pagination_ = null;
      }
      return paginationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cosmos.auth.v1beta1.QueryAccountsResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.auth.v1beta1.QueryAccountsResponse)
  private static final com.cosmos.auth.v1beta1.QueryAccountsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.auth.v1beta1.QueryAccountsResponse();
  }

  public static com.cosmos.auth.v1beta1.QueryAccountsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryAccountsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryAccountsResponse>() {
    @java.lang.Override
    public QueryAccountsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryAccountsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryAccountsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.auth.v1beta1.QueryAccountsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

