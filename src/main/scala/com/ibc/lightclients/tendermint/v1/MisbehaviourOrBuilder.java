// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/tendermint/v1/tendermint.proto

package com.ibc.lightclients.tendermint.v1;

public interface MisbehaviourOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.lightclients.tendermint.v1.Misbehaviour)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
   * @return The clientId.
   */
  String getClientId();
  /**
   * <code>string client_id = 1 [json_name = "clientId", (.gogoproto.moretags) = "yaml:&#92;"client_id&#92;""];</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <code>.ibc.lightclients.tendermint.v1.Header header_1 = 2 [json_name = "header1", (.gogoproto.customname) = "Header1", (.gogoproto.moretags) = "yaml:&#92;"header_1&#92;""];</code>
   * @return Whether the header1 field is set.
   */
  boolean hasHeader1();
  /**
   * <code>.ibc.lightclients.tendermint.v1.Header header_1 = 2 [json_name = "header1", (.gogoproto.customname) = "Header1", (.gogoproto.moretags) = "yaml:&#92;"header_1&#92;""];</code>
   * @return The header1.
   */
  Header getHeader1();
  /**
   * <code>.ibc.lightclients.tendermint.v1.Header header_1 = 2 [json_name = "header1", (.gogoproto.customname) = "Header1", (.gogoproto.moretags) = "yaml:&#92;"header_1&#92;""];</code>
   */
  HeaderOrBuilder getHeader1OrBuilder();

  /**
   * <code>.ibc.lightclients.tendermint.v1.Header header_2 = 3 [json_name = "header2", (.gogoproto.customname) = "Header2", (.gogoproto.moretags) = "yaml:&#92;"header_2&#92;""];</code>
   * @return Whether the header2 field is set.
   */
  boolean hasHeader2();
  /**
   * <code>.ibc.lightclients.tendermint.v1.Header header_2 = 3 [json_name = "header2", (.gogoproto.customname) = "Header2", (.gogoproto.moretags) = "yaml:&#92;"header_2&#92;""];</code>
   * @return The header2.
   */
  Header getHeader2();
  /**
   * <code>.ibc.lightclients.tendermint.v1.Header header_2 = 3 [json_name = "header2", (.gogoproto.customname) = "Header2", (.gogoproto.moretags) = "yaml:&#92;"header_2&#92;""];</code>
   */
  HeaderOrBuilder getHeader2OrBuilder();
}
