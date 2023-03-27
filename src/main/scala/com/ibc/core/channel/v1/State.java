// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/channel/v1/channel.proto

package com.ibc.core.channel.v1;

/**
 * <pre>
 * State defines if a channel is in one of the following states:
 * CLOSED, INIT, TRYOPEN, OPEN or UNINITIALIZED.
 * </pre>
 *
 * Protobuf enum {@code ibc.core.channel.v1.State}
 */
public enum State
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Default State
   * </pre>
   *
   * <code>STATE_UNINITIALIZED_UNSPECIFIED = 0 [(.gogoproto.enumvalue_customname) = "UNINITIALIZED"];</code>
   */
  STATE_UNINITIALIZED_UNSPECIFIED(0),
  /**
   * <pre>
   * A channel has just started the opening handshake.
   * </pre>
   *
   * <code>STATE_INIT = 1 [(.gogoproto.enumvalue_customname) = "INIT"];</code>
   */
  STATE_INIT(1),
  /**
   * <pre>
   * A channel has acknowledged the handshake step on the counterparty chain.
   * </pre>
   *
   * <code>STATE_TRYOPEN = 2 [(.gogoproto.enumvalue_customname) = "TRYOPEN"];</code>
   */
  STATE_TRYOPEN(2),
  /**
   * <pre>
   * A channel has completed the handshake. Open channels are
   * ready to send and receive packets.
   * </pre>
   *
   * <code>STATE_OPEN = 3 [(.gogoproto.enumvalue_customname) = "OPEN"];</code>
   */
  STATE_OPEN(3),
  /**
   * <pre>
   * A channel has been closed and can no longer be used to send or receive
   * packets.
   * </pre>
   *
   * <code>STATE_CLOSED = 4 [(.gogoproto.enumvalue_customname) = "CLOSED"];</code>
   */
  STATE_CLOSED(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Default State
   * </pre>
   *
   * <code>STATE_UNINITIALIZED_UNSPECIFIED = 0 [(.gogoproto.enumvalue_customname) = "UNINITIALIZED"];</code>
   */
  public static final int STATE_UNINITIALIZED_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * A channel has just started the opening handshake.
   * </pre>
   *
   * <code>STATE_INIT = 1 [(.gogoproto.enumvalue_customname) = "INIT"];</code>
   */
  public static final int STATE_INIT_VALUE = 1;
  /**
   * <pre>
   * A channel has acknowledged the handshake step on the counterparty chain.
   * </pre>
   *
   * <code>STATE_TRYOPEN = 2 [(.gogoproto.enumvalue_customname) = "TRYOPEN"];</code>
   */
  public static final int STATE_TRYOPEN_VALUE = 2;
  /**
   * <pre>
   * A channel has completed the handshake. Open channels are
   * ready to send and receive packets.
   * </pre>
   *
   * <code>STATE_OPEN = 3 [(.gogoproto.enumvalue_customname) = "OPEN"];</code>
   */
  public static final int STATE_OPEN_VALUE = 3;
  /**
   * <pre>
   * A channel has been closed and can no longer be used to send or receive
   * packets.
   * </pre>
   *
   * <code>STATE_CLOSED = 4 [(.gogoproto.enumvalue_customname) = "CLOSED"];</code>
   */
  public static final int STATE_CLOSED_VALUE = 4;


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
  public static State valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static State forNumber(int value) {
    switch (value) {
      case 0: return STATE_UNINITIALIZED_UNSPECIFIED;
      case 1: return STATE_INIT;
      case 2: return STATE_TRYOPEN;
      case 3: return STATE_OPEN;
      case 4: return STATE_CLOSED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<State>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      State> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<State>() {
          public State findValueByNumber(int number) {
            return State.forNumber(number);
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
    return ChannelProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final State[] VALUES = values();

  public static State valueOf(
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

  private State(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:ibc.core.channel.v1.State)
}

