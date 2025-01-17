// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/channel/v1/tx.proto

package com.ibc.core.channel.v1;

/**
 * <pre>
 * ResponseResultType defines the possible outcomes of the execution of a message
 * </pre>
 *
 * Protobuf enum {@code ibc.core.channel.v1.ResponseResultType}
 */
public enum ResponseResultType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Default zero value enumeration
   * </pre>
   *
   * <code>RESPONSE_RESULT_TYPE_UNSPECIFIED = 0 [(.gogoproto.enumvalue_customname) = "UNSPECIFIED"];</code>
   */
  RESPONSE_RESULT_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * The message did not call the IBC application callbacks (because, for example, the packet had already been relayed)
   * </pre>
   *
   * <code>RESPONSE_RESULT_TYPE_NOOP = 1 [(.gogoproto.enumvalue_customname) = "NOOP"];</code>
   */
  RESPONSE_RESULT_TYPE_NOOP(1),
  /**
   * <pre>
   * The message was executed successfully
   * </pre>
   *
   * <code>RESPONSE_RESULT_TYPE_SUCCESS = 2 [(.gogoproto.enumvalue_customname) = "SUCCESS"];</code>
   */
  RESPONSE_RESULT_TYPE_SUCCESS(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Default zero value enumeration
   * </pre>
   *
   * <code>RESPONSE_RESULT_TYPE_UNSPECIFIED = 0 [(.gogoproto.enumvalue_customname) = "UNSPECIFIED"];</code>
   */
  public static final int RESPONSE_RESULT_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * The message did not call the IBC application callbacks (because, for example, the packet had already been relayed)
   * </pre>
   *
   * <code>RESPONSE_RESULT_TYPE_NOOP = 1 [(.gogoproto.enumvalue_customname) = "NOOP"];</code>
   */
  public static final int RESPONSE_RESULT_TYPE_NOOP_VALUE = 1;
  /**
   * <pre>
   * The message was executed successfully
   * </pre>
   *
   * <code>RESPONSE_RESULT_TYPE_SUCCESS = 2 [(.gogoproto.enumvalue_customname) = "SUCCESS"];</code>
   */
  public static final int RESPONSE_RESULT_TYPE_SUCCESS_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ResponseResultType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ResponseResultType forNumber(int value) {
    switch (value) {
      case 0: return RESPONSE_RESULT_TYPE_UNSPECIFIED;
      case 1: return RESPONSE_RESULT_TYPE_NOOP;
      case 2: return RESPONSE_RESULT_TYPE_SUCCESS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ResponseResultType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ResponseResultType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ResponseResultType>() {
          public ResponseResultType findValueByNumber(int number) {
            return ResponseResultType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.ibc.core.channel.v1.TxProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ResponseResultType[] VALUES = values();

  public static ResponseResultType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ResponseResultType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:ibc.core.channel.v1.ResponseResultType)
}

