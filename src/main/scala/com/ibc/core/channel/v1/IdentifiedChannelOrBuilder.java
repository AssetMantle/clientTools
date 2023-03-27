// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/channel/v1/channel.proto

package com.ibc.core.channel.v1;

public interface IdentifiedChannelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.channel.v1.IdentifiedChannel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * current state of the channel end
   * </pre>
   *
   * <code>.ibc.core.channel.v1.State state = 1 [json_name = "state"];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * current state of the channel end
   * </pre>
   *
   * <code>.ibc.core.channel.v1.State state = 1 [json_name = "state"];</code>
   * @return The state.
   */
  State getState();

  /**
   * <pre>
   * whether the channel is ordered or unordered
   * </pre>
   *
   * <code>.ibc.core.channel.v1.Order ordering = 2 [json_name = "ordering"];</code>
   * @return The enum numeric value on the wire for ordering.
   */
  int getOrderingValue();
  /**
   * <pre>
   * whether the channel is ordered or unordered
   * </pre>
   *
   * <code>.ibc.core.channel.v1.Order ordering = 2 [json_name = "ordering"];</code>
   * @return The ordering.
   */
  Order getOrdering();

  /**
   * <pre>
   * counterparty channel end
   * </pre>
   *
   * <code>.ibc.core.channel.v1.Counterparty counterparty = 3 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
   * @return Whether the counterparty field is set.
   */
  boolean hasCounterparty();
  /**
   * <pre>
   * counterparty channel end
   * </pre>
   *
   * <code>.ibc.core.channel.v1.Counterparty counterparty = 3 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
   * @return The counterparty.
   */
  Counterparty getCounterparty();
  /**
   * <pre>
   * counterparty channel end
   * </pre>
   *
   * <code>.ibc.core.channel.v1.Counterparty counterparty = 3 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
   */
  CounterpartyOrBuilder getCounterpartyOrBuilder();

  /**
   * <pre>
   * list of connection identifiers, in order, along which packets sent on
   * this channel will travel
   * </pre>
   *
   * <code>repeated string connection_hops = 4 [json_name = "connectionHops", (.gogoproto.moretags) = "yaml:&#92;"connection_hops&#92;""];</code>
   * @return A list containing the connectionHops.
   */
  java.util.List<String>
      getConnectionHopsList();
  /**
   * <pre>
   * list of connection identifiers, in order, along which packets sent on
   * this channel will travel
   * </pre>
   *
   * <code>repeated string connection_hops = 4 [json_name = "connectionHops", (.gogoproto.moretags) = "yaml:&#92;"connection_hops&#92;""];</code>
   * @return The count of connectionHops.
   */
  int getConnectionHopsCount();
  /**
   * <pre>
   * list of connection identifiers, in order, along which packets sent on
   * this channel will travel
   * </pre>
   *
   * <code>repeated string connection_hops = 4 [json_name = "connectionHops", (.gogoproto.moretags) = "yaml:&#92;"connection_hops&#92;""];</code>
   * @param index The index of the element to return.
   * @return The connectionHops at the given index.
   */
  String getConnectionHops(int index);
  /**
   * <pre>
   * list of connection identifiers, in order, along which packets sent on
   * this channel will travel
   * </pre>
   *
   * <code>repeated string connection_hops = 4 [json_name = "connectionHops", (.gogoproto.moretags) = "yaml:&#92;"connection_hops&#92;""];</code>
   * @param index The index of the value to return.
   * @return The bytes of the connectionHops at the given index.
   */
  com.google.protobuf.ByteString
      getConnectionHopsBytes(int index);

  /**
   * <pre>
   * opaque channel version, which is agreed upon during the handshake
   * </pre>
   *
   * <code>string version = 5 [json_name = "version"];</code>
   * @return The version.
   */
  String getVersion();
  /**
   * <pre>
   * opaque channel version, which is agreed upon during the handshake
   * </pre>
   *
   * <code>string version = 5 [json_name = "version"];</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * port identifier
   * </pre>
   *
   * <code>string port_id = 6 [json_name = "portId"];</code>
   * @return The portId.
   */
  String getPortId();
  /**
   * <pre>
   * port identifier
   * </pre>
   *
   * <code>string port_id = 6 [json_name = "portId"];</code>
   * @return The bytes for portId.
   */
  com.google.protobuf.ByteString
      getPortIdBytes();

  /**
   * <pre>
   * channel identifier
   * </pre>
   *
   * <code>string channel_id = 7 [json_name = "channelId"];</code>
   * @return The channelId.
   */
  String getChannelId();
  /**
   * <pre>
   * channel identifier
   * </pre>
   *
   * <code>string channel_id = 7 [json_name = "channelId"];</code>
   * @return The bytes for channelId.
   */
  com.google.protobuf.ByteString
      getChannelIdBytes();
}
