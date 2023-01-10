// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/channel/v1/tx.proto

package com.ibc.core.channel.v1;

public interface MsgChannelOpenAckOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.channel.v1.MsgChannelOpenAck)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string port_id = 1 [json_name = "portId", (.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
   * @return The portId.
   */
  java.lang.String getPortId();
  /**
   * <code>string port_id = 1 [json_name = "portId", (.gogoproto.moretags) = "yaml:&#92;"port_id&#92;""];</code>
   * @return The bytes for portId.
   */
  com.google.protobuf.ByteString
      getPortIdBytes();

  /**
   * <code>string channel_id = 2 [json_name = "channelId", (.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
   * @return The channelId.
   */
  java.lang.String getChannelId();
  /**
   * <code>string channel_id = 2 [json_name = "channelId", (.gogoproto.moretags) = "yaml:&#92;"channel_id&#92;""];</code>
   * @return The bytes for channelId.
   */
  com.google.protobuf.ByteString
      getChannelIdBytes();

  /**
   * <code>string counterparty_channel_id = 3 [json_name = "counterpartyChannelId", (.gogoproto.moretags) = "yaml:&#92;"counterparty_channel_id&#92;""];</code>
   * @return The counterpartyChannelId.
   */
  java.lang.String getCounterpartyChannelId();
  /**
   * <code>string counterparty_channel_id = 3 [json_name = "counterpartyChannelId", (.gogoproto.moretags) = "yaml:&#92;"counterparty_channel_id&#92;""];</code>
   * @return The bytes for counterpartyChannelId.
   */
  com.google.protobuf.ByteString
      getCounterpartyChannelIdBytes();

  /**
   * <code>string counterparty_version = 4 [json_name = "counterpartyVersion", (.gogoproto.moretags) = "yaml:&#92;"counterparty_version&#92;""];</code>
   * @return The counterpartyVersion.
   */
  java.lang.String getCounterpartyVersion();
  /**
   * <code>string counterparty_version = 4 [json_name = "counterpartyVersion", (.gogoproto.moretags) = "yaml:&#92;"counterparty_version&#92;""];</code>
   * @return The bytes for counterpartyVersion.
   */
  com.google.protobuf.ByteString
      getCounterpartyVersionBytes();

  /**
   * <code>bytes proof_try = 5 [json_name = "proofTry", (.gogoproto.moretags) = "yaml:&#92;"proof_try&#92;""];</code>
   * @return The proofTry.
   */
  com.google.protobuf.ByteString getProofTry();

  /**
   * <code>.ibc.core.client.v1.Height proof_height = 6 [json_name = "proofHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
   * @return Whether the proofHeight field is set.
   */
  boolean hasProofHeight();
  /**
   * <code>.ibc.core.client.v1.Height proof_height = 6 [json_name = "proofHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
   * @return The proofHeight.
   */
  com.ibc.core.client.v1.Height getProofHeight();
  /**
   * <code>.ibc.core.client.v1.Height proof_height = 6 [json_name = "proofHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
   */
  com.ibc.core.client.v1.HeightOrBuilder getProofHeightOrBuilder();

  /**
   * <code>string signer = 7 [json_name = "signer"];</code>
   * @return The signer.
   */
  java.lang.String getSigner();
  /**
   * <code>string signer = 7 [json_name = "signer"];</code>
   * @return The bytes for signer.
   */
  com.google.protobuf.ByteString
      getSignerBytes();
}