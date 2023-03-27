// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/connection/v1/connection.proto

package com.ibc.core.connection.v1;

public interface CounterpartyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.connection.v1.Counterparty)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * identifies the client on the counterparty chain associated with a given
   * connection.
   * </pre>
   *
   * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
   * @return The clientId.
   */
  String getClientId();
  /**
   * <pre>
   * identifies the client on the counterparty chain associated with a given
   * connection.
   * </pre>
   *
   * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <pre>
   * identifies the connection end on the counterparty chain associated with a
   * given connection.
   * </pre>
   *
   * <code>string connection_id = 2 [json_name = "connectionId", (.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
   * @return The connectionId.
   */
  String getConnectionId();
  /**
   * <pre>
   * identifies the connection end on the counterparty chain associated with a
   * given connection.
   * </pre>
   *
   * <code>string connection_id = 2 [json_name = "connectionId", (.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
   * @return The bytes for connectionId.
   */
  com.google.protobuf.ByteString
      getConnectionIdBytes();

  /**
   * <pre>
   * commitment merkle prefix of the counterparty chain.
   * </pre>
   *
   * <code>.ibc.core.commitment.v1.MerklePrefix prefix = 3 [json_name = "prefix", (.gogoproto.nullable) = false];</code>
   * @return Whether the prefix field is set.
   */
  boolean hasPrefix();
  /**
   * <pre>
   * commitment merkle prefix of the counterparty chain.
   * </pre>
   *
   * <code>.ibc.core.commitment.v1.MerklePrefix prefix = 3 [json_name = "prefix", (.gogoproto.nullable) = false];</code>
   * @return The prefix.
   */
  com.ibc.core.commitment.v1.MerklePrefix getPrefix();
  /**
   * <pre>
   * commitment merkle prefix of the counterparty chain.
   * </pre>
   *
   * <code>.ibc.core.commitment.v1.MerklePrefix prefix = 3 [json_name = "prefix", (.gogoproto.nullable) = false];</code>
   */
  com.ibc.core.commitment.v1.MerklePrefixOrBuilder getPrefixOrBuilder();
}
