// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/interchain_accounts/v1/metadata.proto

package com.ibc.applications.interchain_accounts.v1;

public interface MetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.applications.interchain_accounts.v1.Metadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * version defines the ICS27 protocol version
   * </pre>
   *
   * <code>string version = 1 [json_name = "version"];</code>
   * @return The version.
   */
  String getVersion();
  /**
   * <pre>
   * version defines the ICS27 protocol version
   * </pre>
   *
   * <code>string version = 1 [json_name = "version"];</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * controller_connection_id is the connection identifier associated with the controller chain
   * </pre>
   *
   * <code>string controller_connection_id = 2 [json_name = "controllerConnectionId", (.gogoproto.moretags) = "yaml:&#92;"controller_connection_id&#92;""];</code>
   * @return The controllerConnectionId.
   */
  String getControllerConnectionId();
  /**
   * <pre>
   * controller_connection_id is the connection identifier associated with the controller chain
   * </pre>
   *
   * <code>string controller_connection_id = 2 [json_name = "controllerConnectionId", (.gogoproto.moretags) = "yaml:&#92;"controller_connection_id&#92;""];</code>
   * @return The bytes for controllerConnectionId.
   */
  com.google.protobuf.ByteString
      getControllerConnectionIdBytes();

  /**
   * <pre>
   * host_connection_id is the connection identifier associated with the host chain
   * </pre>
   *
   * <code>string host_connection_id = 3 [json_name = "hostConnectionId", (.gogoproto.moretags) = "yaml:&#92;"host_connection_id&#92;""];</code>
   * @return The hostConnectionId.
   */
  String getHostConnectionId();
  /**
   * <pre>
   * host_connection_id is the connection identifier associated with the host chain
   * </pre>
   *
   * <code>string host_connection_id = 3 [json_name = "hostConnectionId", (.gogoproto.moretags) = "yaml:&#92;"host_connection_id&#92;""];</code>
   * @return The bytes for hostConnectionId.
   */
  com.google.protobuf.ByteString
      getHostConnectionIdBytes();

  /**
   * <pre>
   * address defines the interchain account address to be fulfilled upon the OnChanOpenTry handshake step
   * NOTE: the address field is empty on the OnChanOpenInit handshake step
   * </pre>
   *
   * <code>string address = 4 [json_name = "address"];</code>
   * @return The address.
   */
  String getAddress();
  /**
   * <pre>
   * address defines the interchain account address to be fulfilled upon the OnChanOpenTry handshake step
   * NOTE: the address field is empty on the OnChanOpenInit handshake step
   * </pre>
   *
   * <code>string address = 4 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * encoding defines the supported codec format
   * </pre>
   *
   * <code>string encoding = 5 [json_name = "encoding"];</code>
   * @return The encoding.
   */
  String getEncoding();
  /**
   * <pre>
   * encoding defines the supported codec format
   * </pre>
   *
   * <code>string encoding = 5 [json_name = "encoding"];</code>
   * @return The bytes for encoding.
   */
  com.google.protobuf.ByteString
      getEncodingBytes();

  /**
   * <pre>
   * tx_type defines the type of transactions the interchain account can execute
   * </pre>
   *
   * <code>string tx_type = 6 [json_name = "txType"];</code>
   * @return The txType.
   */
  String getTxType();
  /**
   * <pre>
   * tx_type defines the type of transactions the interchain account can execute
   * </pre>
   *
   * <code>string tx_type = 6 [json_name = "txType"];</code>
   * @return The bytes for txType.
   */
  com.google.protobuf.ByteString
      getTxTypeBytes();
}
