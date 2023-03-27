// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/solomachine/v1/solomachine.proto

package com.ibc.lightclients.solomachine.v1;

/**
 * <pre>
 * DataType defines the type of solo machine proof being created. This is done
 * to preserve uniqueness of different data sign byte encodings.
 * </pre>
 *
 * Protobuf enum {@code ibc.lightclients.solomachine.v1.DataType}
 */
public enum DataType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Default State
   * </pre>
   *
   * <code>DATA_TYPE_UNINITIALIZED_UNSPECIFIED = 0 [(.gogoproto.enumvalue_customname) = "UNSPECIFIED"];</code>
   */
  DATA_TYPE_UNINITIALIZED_UNSPECIFIED(0),
  /**
   * <pre>
   * Data type for client state verification
   * </pre>
   *
   * <code>DATA_TYPE_CLIENT_STATE = 1 [(.gogoproto.enumvalue_customname) = "CLIENT"];</code>
   */
  DATA_TYPE_CLIENT_STATE(1),
  /**
   * <pre>
   * Data type for consensus state verification
   * </pre>
   *
   * <code>DATA_TYPE_CONSENSUS_STATE = 2 [(.gogoproto.enumvalue_customname) = "CONSENSUS"];</code>
   */
  DATA_TYPE_CONSENSUS_STATE(2),
  /**
   * <pre>
   * Data type for connection state verification
   * </pre>
   *
   * <code>DATA_TYPE_CONNECTION_STATE = 3 [(.gogoproto.enumvalue_customname) = "CONNECTION"];</code>
   */
  DATA_TYPE_CONNECTION_STATE(3),
  /**
   * <pre>
   * Data type for channel state verification
   * </pre>
   *
   * <code>DATA_TYPE_CHANNEL_STATE = 4 [(.gogoproto.enumvalue_customname) = "CHANNEL"];</code>
   */
  DATA_TYPE_CHANNEL_STATE(4),
  /**
   * <pre>
   * Data type for packet commitment verification
   * </pre>
   *
   * <code>DATA_TYPE_PACKET_COMMITMENT = 5 [(.gogoproto.enumvalue_customname) = "PACKETCOMMITMENT"];</code>
   */
  DATA_TYPE_PACKET_COMMITMENT(5),
  /**
   * <pre>
   * Data type for packet acknowledgement verification
   * </pre>
   *
   * <code>DATA_TYPE_PACKET_ACKNOWLEDGEMENT = 6 [(.gogoproto.enumvalue_customname) = "PACKETACKNOWLEDGEMENT"];</code>
   */
  DATA_TYPE_PACKET_ACKNOWLEDGEMENT(6),
  /**
   * <pre>
   * Data type for packet receipt absence verification
   * </pre>
   *
   * <code>DATA_TYPE_PACKET_RECEIPT_ABSENCE = 7 [(.gogoproto.enumvalue_customname) = "PACKETRECEIPTABSENCE"];</code>
   */
  DATA_TYPE_PACKET_RECEIPT_ABSENCE(7),
  /**
   * <pre>
   * Data type for next sequence recv verification
   * </pre>
   *
   * <code>DATA_TYPE_NEXT_SEQUENCE_RECV = 8 [(.gogoproto.enumvalue_customname) = "NEXTSEQUENCERECV"];</code>
   */
  DATA_TYPE_NEXT_SEQUENCE_RECV(8),
  /**
   * <pre>
   * Data type for header verification
   * </pre>
   *
   * <code>DATA_TYPE_HEADER = 9 [(.gogoproto.enumvalue_customname) = "HEADER"];</code>
   */
  DATA_TYPE_HEADER(9),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Default State
   * </pre>
   *
   * <code>DATA_TYPE_UNINITIALIZED_UNSPECIFIED = 0 [(.gogoproto.enumvalue_customname) = "UNSPECIFIED"];</code>
   */
  public static final int DATA_TYPE_UNINITIALIZED_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Data type for client state verification
   * </pre>
   *
   * <code>DATA_TYPE_CLIENT_STATE = 1 [(.gogoproto.enumvalue_customname) = "CLIENT"];</code>
   */
  public static final int DATA_TYPE_CLIENT_STATE_VALUE = 1;
  /**
   * <pre>
   * Data type for consensus state verification
   * </pre>
   *
   * <code>DATA_TYPE_CONSENSUS_STATE = 2 [(.gogoproto.enumvalue_customname) = "CONSENSUS"];</code>
   */
  public static final int DATA_TYPE_CONSENSUS_STATE_VALUE = 2;
  /**
   * <pre>
   * Data type for connection state verification
   * </pre>
   *
   * <code>DATA_TYPE_CONNECTION_STATE = 3 [(.gogoproto.enumvalue_customname) = "CONNECTION"];</code>
   */
  public static final int DATA_TYPE_CONNECTION_STATE_VALUE = 3;
  /**
   * <pre>
   * Data type for channel state verification
   * </pre>
   *
   * <code>DATA_TYPE_CHANNEL_STATE = 4 [(.gogoproto.enumvalue_customname) = "CHANNEL"];</code>
   */
  public static final int DATA_TYPE_CHANNEL_STATE_VALUE = 4;
  /**
   * <pre>
   * Data type for packet commitment verification
   * </pre>
   *
   * <code>DATA_TYPE_PACKET_COMMITMENT = 5 [(.gogoproto.enumvalue_customname) = "PACKETCOMMITMENT"];</code>
   */
  public static final int DATA_TYPE_PACKET_COMMITMENT_VALUE = 5;
  /**
   * <pre>
   * Data type for packet acknowledgement verification
   * </pre>
   *
   * <code>DATA_TYPE_PACKET_ACKNOWLEDGEMENT = 6 [(.gogoproto.enumvalue_customname) = "PACKETACKNOWLEDGEMENT"];</code>
   */
  public static final int DATA_TYPE_PACKET_ACKNOWLEDGEMENT_VALUE = 6;
  /**
   * <pre>
   * Data type for packet receipt absence verification
   * </pre>
   *
   * <code>DATA_TYPE_PACKET_RECEIPT_ABSENCE = 7 [(.gogoproto.enumvalue_customname) = "PACKETRECEIPTABSENCE"];</code>
   */
  public static final int DATA_TYPE_PACKET_RECEIPT_ABSENCE_VALUE = 7;
  /**
   * <pre>
   * Data type for next sequence recv verification
   * </pre>
   *
   * <code>DATA_TYPE_NEXT_SEQUENCE_RECV = 8 [(.gogoproto.enumvalue_customname) = "NEXTSEQUENCERECV"];</code>
   */
  public static final int DATA_TYPE_NEXT_SEQUENCE_RECV_VALUE = 8;
  /**
   * <pre>
   * Data type for header verification
   * </pre>
   *
   * <code>DATA_TYPE_HEADER = 9 [(.gogoproto.enumvalue_customname) = "HEADER"];</code>
   */
  public static final int DATA_TYPE_HEADER_VALUE = 9;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static DataType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DataType forNumber(int value) {
    switch (value) {
      case 0: return DATA_TYPE_UNINITIALIZED_UNSPECIFIED;
      case 1: return DATA_TYPE_CLIENT_STATE;
      case 2: return DATA_TYPE_CONSENSUS_STATE;
      case 3: return DATA_TYPE_CONNECTION_STATE;
      case 4: return DATA_TYPE_CHANNEL_STATE;
      case 5: return DATA_TYPE_PACKET_COMMITMENT;
      case 6: return DATA_TYPE_PACKET_ACKNOWLEDGEMENT;
      case 7: return DATA_TYPE_PACKET_RECEIPT_ABSENCE;
      case 8: return DATA_TYPE_NEXT_SEQUENCE_RECV;
      case 9: return DATA_TYPE_HEADER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DataType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DataType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DataType>() {
          public DataType findValueByNumber(int number) {
            return DataType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new IllegalStateException(
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
    return SolomachineProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final DataType[] VALUES = values();

  public static DataType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DataType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:ibc.lightclients.solomachine.v1.DataType)
}

