// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/interchain_accounts/v1/genesis.proto

package com.ibc.applications.interchain_accounts.v1;

/**
 * <pre>
 * GenesisState defines the interchain accounts genesis state
 * </pre>
 *
 * Protobuf type {@code ibc.applications.interchain_accounts.v1.GenesisState}
 */
public final class GenesisState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.applications.interchain_accounts.v1.GenesisState)
    GenesisStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenesisState.newBuilder() to construct.
  private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenesisState() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenesisState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return GenesisProto.internal_static_ibc_applications_interchain_accounts_v1_GenesisState_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GenesisProto.internal_static_ibc_applications_interchain_accounts_v1_GenesisState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            GenesisState.class, Builder.class);
  }

  public static final int CONTROLLER_GENESIS_STATE_FIELD_NUMBER = 1;
  private ControllerGenesisState controllerGenesisState_;
  /**
   * <code>.ibc.applications.interchain_accounts.v1.ControllerGenesisState controller_genesis_state = 1 [json_name = "controllerGenesisState", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"controller_genesis_state&#92;""];</code>
   * @return Whether the controllerGenesisState field is set.
   */
  @Override
  public boolean hasControllerGenesisState() {
    return controllerGenesisState_ != null;
  }
  /**
   * <code>.ibc.applications.interchain_accounts.v1.ControllerGenesisState controller_genesis_state = 1 [json_name = "controllerGenesisState", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"controller_genesis_state&#92;""];</code>
   * @return The controllerGenesisState.
   */
  @Override
  public ControllerGenesisState getControllerGenesisState() {
    return controllerGenesisState_ == null ? ControllerGenesisState.getDefaultInstance() : controllerGenesisState_;
  }
  /**
   * <code>.ibc.applications.interchain_accounts.v1.ControllerGenesisState controller_genesis_state = 1 [json_name = "controllerGenesisState", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"controller_genesis_state&#92;""];</code>
   */
  @Override
  public ControllerGenesisStateOrBuilder getControllerGenesisStateOrBuilder() {
    return controllerGenesisState_ == null ? ControllerGenesisState.getDefaultInstance() : controllerGenesisState_;
  }

  public static final int HOST_GENESIS_STATE_FIELD_NUMBER = 2;
  private HostGenesisState hostGenesisState_;
  /**
   * <code>.ibc.applications.interchain_accounts.v1.HostGenesisState host_genesis_state = 2 [json_name = "hostGenesisState", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"host_genesis_state&#92;""];</code>
   * @return Whether the hostGenesisState field is set.
   */
  @Override
  public boolean hasHostGenesisState() {
    return hostGenesisState_ != null;
  }
  /**
   * <code>.ibc.applications.interchain_accounts.v1.HostGenesisState host_genesis_state = 2 [json_name = "hostGenesisState", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"host_genesis_state&#92;""];</code>
   * @return The hostGenesisState.
   */
  @Override
  public HostGenesisState getHostGenesisState() {
    return hostGenesisState_ == null ? HostGenesisState.getDefaultInstance() : hostGenesisState_;
  }
  /**
   * <code>.ibc.applications.interchain_accounts.v1.HostGenesisState host_genesis_state = 2 [json_name = "hostGenesisState", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"host_genesis_state&#92;""];</code>
   */
  @Override
  public HostGenesisStateOrBuilder getHostGenesisStateOrBuilder() {
    return hostGenesisState_ == null ? HostGenesisState.getDefaultInstance() : hostGenesisState_;
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
    if (controllerGenesisState_ != null) {
      output.writeMessage(1, getControllerGenesisState());
    }
    if (hostGenesisState_ != null) {
      output.writeMessage(2, getHostGenesisState());
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (controllerGenesisState_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getControllerGenesisState());
    }
    if (hostGenesisState_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getHostGenesisState());
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

    if (hasControllerGenesisState() != other.hasControllerGenesisState()) return false;
    if (hasControllerGenesisState()) {
      if (!getControllerGenesisState()
          .equals(other.getControllerGenesisState())) return false;
    }
    if (hasHostGenesisState() != other.hasHostGenesisState()) return false;
    if (hasHostGenesisState()) {
      if (!getHostGenesisState()
          .equals(other.getHostGenesisState())) return false;
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
    if (hasControllerGenesisState()) {
      hash = (37 * hash) + CONTROLLER_GENESIS_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getControllerGenesisState().hashCode();
    }
    if (hasHostGenesisState()) {
      hash = (37 * hash) + HOST_GENESIS_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getHostGenesisState().hashCode();
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
   * GenesisState defines the interchain accounts genesis state
   * </pre>
   *
   * Protobuf type {@code ibc.applications.interchain_accounts.v1.GenesisState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.applications.interchain_accounts.v1.GenesisState)
      GenesisStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GenesisProto.internal_static_ibc_applications_interchain_accounts_v1_GenesisState_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GenesisProto.internal_static_ibc_applications_interchain_accounts_v1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GenesisState.class, Builder.class);
    }

    // Construct using com.ibc.applications.interchain_accounts.v1.GenesisState.newBuilder()
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
      controllerGenesisState_ = null;
      if (controllerGenesisStateBuilder_ != null) {
        controllerGenesisStateBuilder_.dispose();
        controllerGenesisStateBuilder_ = null;
      }
      hostGenesisState_ = null;
      if (hostGenesisStateBuilder_ != null) {
        hostGenesisStateBuilder_.dispose();
        hostGenesisStateBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GenesisProto.internal_static_ibc_applications_interchain_accounts_v1_GenesisState_descriptor;
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
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(GenesisState result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.controllerGenesisState_ = controllerGenesisStateBuilder_ == null
            ? controllerGenesisState_
            : controllerGenesisStateBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.hostGenesisState_ = hostGenesisStateBuilder_ == null
            ? hostGenesisState_
            : hostGenesisStateBuilder_.build();
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
      if (other instanceof GenesisState) {
        return mergeFrom((GenesisState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(GenesisState other) {
      if (other == GenesisState.getDefaultInstance()) return this;
      if (other.hasControllerGenesisState()) {
        mergeControllerGenesisState(other.getControllerGenesisState());
      }
      if (other.hasHostGenesisState()) {
        mergeHostGenesisState(other.getHostGenesisState());
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
              input.readMessage(
                  getControllerGenesisStateFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getHostGenesisStateFieldBuilder().getBuilder(),
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

    private ControllerGenesisState controllerGenesisState_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ControllerGenesisState, ControllerGenesisState.Builder, ControllerGenesisStateOrBuilder> controllerGenesisStateBuilder_;
    /**
     * <code>.ibc.applications.interchain_accounts.v1.ControllerGenesisState controller_genesis_state = 1 [json_name = "controllerGenesisState", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"controller_genesis_state&#92;""];</code>
     * @return Whether the controllerGenesisState field is set.
     */
    public boolean hasControllerGenesisState() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.ibc.applications.interchain_accounts.v1.ControllerGenesisState controller_genesis_state = 1 [json_name = "controllerGenesisState", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"controller_genesis_state&#92;""];</code>
     * @return The controllerGenesisState.
     */
    public ControllerGenesisState getControllerGenesisState() {
      if (controllerGenesisStateBuilder_ == null) {
        return controllerGenesisState_ == null ? ControllerGenesisState.getDefaultInstance() : controllerGenesisState_;
      } else {
        return controllerGenesisStateBuilder_.getMessage();
      }
    }
    /**
     * <code>.ibc.applications.interchain_accounts.v1.ControllerGenesisState controller_genesis_state = 1 [json_name = "controllerGenesisState", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"controller_genesis_state&#92;""];</code>
     */
    public Builder setControllerGenesisState(ControllerGenesisState value) {
      if (controllerGenesisStateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        controllerGenesisState_ = value;
      } else {
        controllerGenesisStateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.applications.interchain_accounts.v1.ControllerGenesisState controller_genesis_state = 1 [json_name = "controllerGenesisState", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"controller_genesis_state&#92;""];</code>
     */
    public Builder setControllerGenesisState(
        ControllerGenesisState.Builder builderForValue) {
      if (controllerGenesisStateBuilder_ == null) {
        controllerGenesisState_ = builderForValue.build();
      } else {
        controllerGenesisStateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.applications.interchain_accounts.v1.ControllerGenesisState controller_genesis_state = 1 [json_name = "controllerGenesisState", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"controller_genesis_state&#92;""];</code>
     */
    public Builder mergeControllerGenesisState(ControllerGenesisState value) {
      if (controllerGenesisStateBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          controllerGenesisState_ != null &&
          controllerGenesisState_ != ControllerGenesisState.getDefaultInstance()) {
          getControllerGenesisStateBuilder().mergeFrom(value);
        } else {
          controllerGenesisState_ = value;
        }
      } else {
        controllerGenesisStateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.applications.interchain_accounts.v1.ControllerGenesisState controller_genesis_state = 1 [json_name = "controllerGenesisState", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"controller_genesis_state&#92;""];</code>
     */
    public Builder clearControllerGenesisState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      controllerGenesisState_ = null;
      if (controllerGenesisStateBuilder_ != null) {
        controllerGenesisStateBuilder_.dispose();
        controllerGenesisStateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.applications.interchain_accounts.v1.ControllerGenesisState controller_genesis_state = 1 [json_name = "controllerGenesisState", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"controller_genesis_state&#92;""];</code>
     */
    public ControllerGenesisState.Builder getControllerGenesisStateBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getControllerGenesisStateFieldBuilder().getBuilder();
    }
    /**
     * <code>.ibc.applications.interchain_accounts.v1.ControllerGenesisState controller_genesis_state = 1 [json_name = "controllerGenesisState", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"controller_genesis_state&#92;""];</code>
     */
    public ControllerGenesisStateOrBuilder getControllerGenesisStateOrBuilder() {
      if (controllerGenesisStateBuilder_ != null) {
        return controllerGenesisStateBuilder_.getMessageOrBuilder();
      } else {
        return controllerGenesisState_ == null ?
            ControllerGenesisState.getDefaultInstance() : controllerGenesisState_;
      }
    }
    /**
     * <code>.ibc.applications.interchain_accounts.v1.ControllerGenesisState controller_genesis_state = 1 [json_name = "controllerGenesisState", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"controller_genesis_state&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ControllerGenesisState, ControllerGenesisState.Builder, ControllerGenesisStateOrBuilder>
        getControllerGenesisStateFieldBuilder() {
      if (controllerGenesisStateBuilder_ == null) {
        controllerGenesisStateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ControllerGenesisState, ControllerGenesisState.Builder, ControllerGenesisStateOrBuilder>(
                getControllerGenesisState(),
                getParentForChildren(),
                isClean());
        controllerGenesisState_ = null;
      }
      return controllerGenesisStateBuilder_;
    }

    private HostGenesisState hostGenesisState_;
    private com.google.protobuf.SingleFieldBuilderV3<
        HostGenesisState, HostGenesisState.Builder, HostGenesisStateOrBuilder> hostGenesisStateBuilder_;
    /**
     * <code>.ibc.applications.interchain_accounts.v1.HostGenesisState host_genesis_state = 2 [json_name = "hostGenesisState", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"host_genesis_state&#92;""];</code>
     * @return Whether the hostGenesisState field is set.
     */
    public boolean hasHostGenesisState() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.ibc.applications.interchain_accounts.v1.HostGenesisState host_genesis_state = 2 [json_name = "hostGenesisState", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"host_genesis_state&#92;""];</code>
     * @return The hostGenesisState.
     */
    public HostGenesisState getHostGenesisState() {
      if (hostGenesisStateBuilder_ == null) {
        return hostGenesisState_ == null ? HostGenesisState.getDefaultInstance() : hostGenesisState_;
      } else {
        return hostGenesisStateBuilder_.getMessage();
      }
    }
    /**
     * <code>.ibc.applications.interchain_accounts.v1.HostGenesisState host_genesis_state = 2 [json_name = "hostGenesisState", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"host_genesis_state&#92;""];</code>
     */
    public Builder setHostGenesisState(HostGenesisState value) {
      if (hostGenesisStateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hostGenesisState_ = value;
      } else {
        hostGenesisStateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.applications.interchain_accounts.v1.HostGenesisState host_genesis_state = 2 [json_name = "hostGenesisState", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"host_genesis_state&#92;""];</code>
     */
    public Builder setHostGenesisState(
        HostGenesisState.Builder builderForValue) {
      if (hostGenesisStateBuilder_ == null) {
        hostGenesisState_ = builderForValue.build();
      } else {
        hostGenesisStateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.applications.interchain_accounts.v1.HostGenesisState host_genesis_state = 2 [json_name = "hostGenesisState", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"host_genesis_state&#92;""];</code>
     */
    public Builder mergeHostGenesisState(HostGenesisState value) {
      if (hostGenesisStateBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          hostGenesisState_ != null &&
          hostGenesisState_ != HostGenesisState.getDefaultInstance()) {
          getHostGenesisStateBuilder().mergeFrom(value);
        } else {
          hostGenesisState_ = value;
        }
      } else {
        hostGenesisStateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.applications.interchain_accounts.v1.HostGenesisState host_genesis_state = 2 [json_name = "hostGenesisState", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"host_genesis_state&#92;""];</code>
     */
    public Builder clearHostGenesisState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      hostGenesisState_ = null;
      if (hostGenesisStateBuilder_ != null) {
        hostGenesisStateBuilder_.dispose();
        hostGenesisStateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ibc.applications.interchain_accounts.v1.HostGenesisState host_genesis_state = 2 [json_name = "hostGenesisState", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"host_genesis_state&#92;""];</code>
     */
    public HostGenesisState.Builder getHostGenesisStateBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getHostGenesisStateFieldBuilder().getBuilder();
    }
    /**
     * <code>.ibc.applications.interchain_accounts.v1.HostGenesisState host_genesis_state = 2 [json_name = "hostGenesisState", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"host_genesis_state&#92;""];</code>
     */
    public HostGenesisStateOrBuilder getHostGenesisStateOrBuilder() {
      if (hostGenesisStateBuilder_ != null) {
        return hostGenesisStateBuilder_.getMessageOrBuilder();
      } else {
        return hostGenesisState_ == null ?
            HostGenesisState.getDefaultInstance() : hostGenesisState_;
      }
    }
    /**
     * <code>.ibc.applications.interchain_accounts.v1.HostGenesisState host_genesis_state = 2 [json_name = "hostGenesisState", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"host_genesis_state&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        HostGenesisState, HostGenesisState.Builder, HostGenesisStateOrBuilder>
        getHostGenesisStateFieldBuilder() {
      if (hostGenesisStateBuilder_ == null) {
        hostGenesisStateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            HostGenesisState, HostGenesisState.Builder, HostGenesisStateOrBuilder>(
                getHostGenesisState(),
                getParentForChildren(),
                isClean());
        hostGenesisState_ = null;
      }
      return hostGenesisStateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ibc.applications.interchain_accounts.v1.GenesisState)
  }

  // @@protoc_insertion_point(class_scope:ibc.applications.interchain_accounts.v1.GenesisState)
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

