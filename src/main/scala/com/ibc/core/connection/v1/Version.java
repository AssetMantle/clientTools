// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/connection/v1/connection.proto

package com.ibc.core.connection.v1;

/**
 * <pre>
 * Version defines the versioning scheme used to negotiate the IBC verison in
 * the connection handshake.
 * </pre>
 *
 * Protobuf type {@code ibc.core.connection.v1.Version}
 */
public final class Version extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.core.connection.v1.Version)
    VersionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Version.newBuilder() to construct.
  private Version(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Version() {
    identifier_ = "";
    features_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new Version();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ConnectionProto.internal_static_ibc_core_connection_v1_Version_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ConnectionProto.internal_static_ibc_core_connection_v1_Version_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Version.class, Builder.class);
  }

  public static final int IDENTIFIER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile Object identifier_ = "";
  /**
   * <pre>
   * unique version identifier
   * </pre>
   *
   * <code>string identifier = 1 [json_name = "identifier"];</code>
   * @return The identifier.
   */
  @Override
  public String getIdentifier() {
    Object ref = identifier_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      identifier_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * unique version identifier
   * </pre>
   *
   * <code>string identifier = 1 [json_name = "identifier"];</code>
   * @return The bytes for identifier.
   */
  @Override
  public com.google.protobuf.ByteString
      getIdentifierBytes() {
    Object ref = identifier_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      identifier_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FEATURES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList features_;
  /**
   * <pre>
   * list of features compatible with the specified identifier
   * </pre>
   *
   * <code>repeated string features = 2 [json_name = "features"];</code>
   * @return A list containing the features.
   */
  public com.google.protobuf.ProtocolStringList
      getFeaturesList() {
    return features_;
  }
  /**
   * <pre>
   * list of features compatible with the specified identifier
   * </pre>
   *
   * <code>repeated string features = 2 [json_name = "features"];</code>
   * @return The count of features.
   */
  public int getFeaturesCount() {
    return features_.size();
  }
  /**
   * <pre>
   * list of features compatible with the specified identifier
   * </pre>
   *
   * <code>repeated string features = 2 [json_name = "features"];</code>
   * @param index The index of the element to return.
   * @return The features at the given index.
   */
  public String getFeatures(int index) {
    return features_.get(index);
  }
  /**
   * <pre>
   * list of features compatible with the specified identifier
   * </pre>
   *
   * <code>repeated string features = 2 [json_name = "features"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the features at the given index.
   */
  public com.google.protobuf.ByteString
      getFeaturesBytes(int index) {
    return features_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(identifier_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, identifier_);
    }
    for (int i = 0; i < features_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, features_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(identifier_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, identifier_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < features_.size(); i++) {
        dataSize += computeStringSizeNoTag(features_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getFeaturesList().size();
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
    if (!(obj instanceof Version)) {
      return super.equals(obj);
    }
    Version other = (Version) obj;

    if (!getIdentifier()
        .equals(other.getIdentifier())) return false;
    if (!getFeaturesList()
        .equals(other.getFeaturesList())) return false;
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
    hash = (37 * hash) + IDENTIFIER_FIELD_NUMBER;
    hash = (53 * hash) + getIdentifier().hashCode();
    if (getFeaturesCount() > 0) {
      hash = (37 * hash) + FEATURES_FIELD_NUMBER;
      hash = (53 * hash) + getFeaturesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Version parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Version parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Version parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Version parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Version parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Version parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Version parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Version parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Version parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Version parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Version parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Version parseFrom(
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
  public static Builder newBuilder(Version prototype) {
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
   * Version defines the versioning scheme used to negotiate the IBC verison in
   * the connection handshake.
   * </pre>
   *
   * Protobuf type {@code ibc.core.connection.v1.Version}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.core.connection.v1.Version)
      VersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ConnectionProto.internal_static_ibc_core_connection_v1_Version_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ConnectionProto.internal_static_ibc_core_connection_v1_Version_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Version.class, Builder.class);
    }

    // Construct using com.ibc.core.connection.v1.Version.newBuilder()
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
      identifier_ = "";
      features_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ConnectionProto.internal_static_ibc_core_connection_v1_Version_descriptor;
    }

    @Override
    public Version getDefaultInstanceForType() {
      return Version.getDefaultInstance();
    }

    @Override
    public Version build() {
      Version result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Version buildPartial() {
      Version result = new Version(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(Version result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        features_ = features_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.features_ = features_;
    }

    private void buildPartial0(Version result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.identifier_ = identifier_;
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
      if (other instanceof Version) {
        return mergeFrom((Version)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Version other) {
      if (other == Version.getDefaultInstance()) return this;
      if (!other.getIdentifier().isEmpty()) {
        identifier_ = other.identifier_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.features_.isEmpty()) {
        if (features_.isEmpty()) {
          features_ = other.features_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureFeaturesIsMutable();
          features_.addAll(other.features_);
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
              identifier_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              String s = input.readStringRequireUtf8();
              ensureFeaturesIsMutable();
              features_.add(s);
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

    private Object identifier_ = "";
    /**
     * <pre>
     * unique version identifier
     * </pre>
     *
     * <code>string identifier = 1 [json_name = "identifier"];</code>
     * @return The identifier.
     */
    public String getIdentifier() {
      Object ref = identifier_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        identifier_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * unique version identifier
     * </pre>
     *
     * <code>string identifier = 1 [json_name = "identifier"];</code>
     * @return The bytes for identifier.
     */
    public com.google.protobuf.ByteString
        getIdentifierBytes() {
      Object ref = identifier_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        identifier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * unique version identifier
     * </pre>
     *
     * <code>string identifier = 1 [json_name = "identifier"];</code>
     * @param value The identifier to set.
     * @return This builder for chaining.
     */
    public Builder setIdentifier(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      identifier_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * unique version identifier
     * </pre>
     *
     * <code>string identifier = 1 [json_name = "identifier"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIdentifier() {
      identifier_ = getDefaultInstance().getIdentifier();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * unique version identifier
     * </pre>
     *
     * <code>string identifier = 1 [json_name = "identifier"];</code>
     * @param value The bytes for identifier to set.
     * @return This builder for chaining.
     */
    public Builder setIdentifierBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      identifier_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList features_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureFeaturesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        features_ = new com.google.protobuf.LazyStringArrayList(features_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * list of features compatible with the specified identifier
     * </pre>
     *
     * <code>repeated string features = 2 [json_name = "features"];</code>
     * @return A list containing the features.
     */
    public com.google.protobuf.ProtocolStringList
        getFeaturesList() {
      return features_.getUnmodifiableView();
    }
    /**
     * <pre>
     * list of features compatible with the specified identifier
     * </pre>
     *
     * <code>repeated string features = 2 [json_name = "features"];</code>
     * @return The count of features.
     */
    public int getFeaturesCount() {
      return features_.size();
    }
    /**
     * <pre>
     * list of features compatible with the specified identifier
     * </pre>
     *
     * <code>repeated string features = 2 [json_name = "features"];</code>
     * @param index The index of the element to return.
     * @return The features at the given index.
     */
    public String getFeatures(int index) {
      return features_.get(index);
    }
    /**
     * <pre>
     * list of features compatible with the specified identifier
     * </pre>
     *
     * <code>repeated string features = 2 [json_name = "features"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the features at the given index.
     */
    public com.google.protobuf.ByteString
        getFeaturesBytes(int index) {
      return features_.getByteString(index);
    }
    /**
     * <pre>
     * list of features compatible with the specified identifier
     * </pre>
     *
     * <code>repeated string features = 2 [json_name = "features"];</code>
     * @param index The index to set the value at.
     * @param value The features to set.
     * @return This builder for chaining.
     */
    public Builder setFeatures(
        int index, String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureFeaturesIsMutable();
      features_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of features compatible with the specified identifier
     * </pre>
     *
     * <code>repeated string features = 2 [json_name = "features"];</code>
     * @param value The features to add.
     * @return This builder for chaining.
     */
    public Builder addFeatures(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureFeaturesIsMutable();
      features_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of features compatible with the specified identifier
     * </pre>
     *
     * <code>repeated string features = 2 [json_name = "features"];</code>
     * @param values The features to add.
     * @return This builder for chaining.
     */
    public Builder addAllFeatures(
        Iterable<String> values) {
      ensureFeaturesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, features_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of features compatible with the specified identifier
     * </pre>
     *
     * <code>repeated string features = 2 [json_name = "features"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFeatures() {
      features_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of features compatible with the specified identifier
     * </pre>
     *
     * <code>repeated string features = 2 [json_name = "features"];</code>
     * @param value The bytes of the features to add.
     * @return This builder for chaining.
     */
    public Builder addFeaturesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureFeaturesIsMutable();
      features_.add(value);
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


    // @@protoc_insertion_point(builder_scope:ibc.core.connection.v1.Version)
  }

  // @@protoc_insertion_point(class_scope:ibc.core.connection.v1.Version)
  private static final Version DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Version();
  }

  public static Version getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Version>
      PARSER = new com.google.protobuf.AbstractParser<Version>() {
    @Override
    public Version parsePartialFrom(
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

  public static com.google.protobuf.Parser<Version> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Version> getParserForType() {
    return PARSER;
  }

  @Override
  public Version getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

