// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/connection/v1/tx.proto

package com.ibc.core.connection.v1;

public interface MsgConnectionOpenTryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.connection.v1.MsgConnectionOpenTry)
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
   * <pre>
   * in the case of crossing hello's, when both chains call OpenInit, we need
   * the connection identifier of the previous connection in state INIT
   * </pre>
   *
   * <code>string previous_connection_id = 2 [json_name = "previousConnectionId", (.gogoproto.moretags) = "yaml:&#92;"previous_connection_id&#92;""];</code>
   * @return The previousConnectionId.
   */
  String getPreviousConnectionId();
  /**
   * <pre>
   * in the case of crossing hello's, when both chains call OpenInit, we need
   * the connection identifier of the previous connection in state INIT
   * </pre>
   *
   * <code>string previous_connection_id = 2 [json_name = "previousConnectionId", (.gogoproto.moretags) = "yaml:&#92;"previous_connection_id&#92;""];</code>
   * @return The bytes for previousConnectionId.
   */
  com.google.protobuf.ByteString
      getPreviousConnectionIdBytes();

  /**
   * <code>.google.protobuf.Any client_state = 3 [json_name = "clientState", (.gogoproto.moretags) = "yaml:&#92;"client_state&#92;""];</code>
   * @return Whether the clientState field is set.
   */
  boolean hasClientState();
  /**
   * <code>.google.protobuf.Any client_state = 3 [json_name = "clientState", (.gogoproto.moretags) = "yaml:&#92;"client_state&#92;""];</code>
   * @return The clientState.
   */
  com.google.protobuf.Any getClientState();
  /**
   * <code>.google.protobuf.Any client_state = 3 [json_name = "clientState", (.gogoproto.moretags) = "yaml:&#92;"client_state&#92;""];</code>
   */
  com.google.protobuf.AnyOrBuilder getClientStateOrBuilder();

  /**
   * <code>.ibc.core.connection.v1.Counterparty counterparty = 4 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
   * @return Whether the counterparty field is set.
   */
  boolean hasCounterparty();
  /**
   * <code>.ibc.core.connection.v1.Counterparty counterparty = 4 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
   * @return The counterparty.
   */
  Counterparty getCounterparty();
  /**
   * <code>.ibc.core.connection.v1.Counterparty counterparty = 4 [json_name = "counterparty", (.gogoproto.nullable) = false];</code>
   */
  CounterpartyOrBuilder getCounterpartyOrBuilder();

  /**
   * <code>uint64 delay_period = 5 [json_name = "delayPeriod", (.gogoproto.moretags) = "yaml:&#92;"delay_period&#92;""];</code>
   * @return The delayPeriod.
   */
  long getDelayPeriod();

  /**
   * <code>repeated .ibc.core.connection.v1.Version counterparty_versions = 6 [json_name = "counterpartyVersions", (.gogoproto.moretags) = "yaml:&#92;"counterparty_versions&#92;""];</code>
   */
  java.util.List<Version>
      getCounterpartyVersionsList();
  /**
   * <code>repeated .ibc.core.connection.v1.Version counterparty_versions = 6 [json_name = "counterpartyVersions", (.gogoproto.moretags) = "yaml:&#92;"counterparty_versions&#92;""];</code>
   */
  Version getCounterpartyVersions(int index);
  /**
   * <code>repeated .ibc.core.connection.v1.Version counterparty_versions = 6 [json_name = "counterpartyVersions", (.gogoproto.moretags) = "yaml:&#92;"counterparty_versions&#92;""];</code>
   */
  int getCounterpartyVersionsCount();
  /**
   * <code>repeated .ibc.core.connection.v1.Version counterparty_versions = 6 [json_name = "counterpartyVersions", (.gogoproto.moretags) = "yaml:&#92;"counterparty_versions&#92;""];</code>
   */
  java.util.List<? extends VersionOrBuilder>
      getCounterpartyVersionsOrBuilderList();
  /**
   * <code>repeated .ibc.core.connection.v1.Version counterparty_versions = 6 [json_name = "counterpartyVersions", (.gogoproto.moretags) = "yaml:&#92;"counterparty_versions&#92;""];</code>
   */
  VersionOrBuilder getCounterpartyVersionsOrBuilder(
      int index);

  /**
   * <code>.ibc.core.client.v1.Height proof_height = 7 [json_name = "proofHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
   * @return Whether the proofHeight field is set.
   */
  boolean hasProofHeight();
  /**
   * <code>.ibc.core.client.v1.Height proof_height = 7 [json_name = "proofHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
   * @return The proofHeight.
   */
  com.ibc.core.client.v1.Height getProofHeight();
  /**
   * <code>.ibc.core.client.v1.Height proof_height = 7 [json_name = "proofHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
   */
  com.ibc.core.client.v1.HeightOrBuilder getProofHeightOrBuilder();

  /**
   * <pre>
   * proof of the initialization the connection on Chain A: `UNITIALIZED -&gt;
   * INIT`
   * </pre>
   *
   * <code>bytes proof_init = 8 [json_name = "proofInit", (.gogoproto.moretags) = "yaml:&#92;"proof_init&#92;""];</code>
   * @return The proofInit.
   */
  com.google.protobuf.ByteString getProofInit();

  /**
   * <pre>
   * proof of client state included in message
   * </pre>
   *
   * <code>bytes proof_client = 9 [json_name = "proofClient", (.gogoproto.moretags) = "yaml:&#92;"proof_client&#92;""];</code>
   * @return The proofClient.
   */
  com.google.protobuf.ByteString getProofClient();

  /**
   * <pre>
   * proof of client consensus state
   * </pre>
   *
   * <code>bytes proof_consensus = 10 [json_name = "proofConsensus", (.gogoproto.moretags) = "yaml:&#92;"proof_consensus&#92;""];</code>
   * @return The proofConsensus.
   */
  com.google.protobuf.ByteString getProofConsensus();

  /**
   * <code>.ibc.core.client.v1.Height consensus_height = 11 [json_name = "consensusHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"consensus_height&#92;""];</code>
   * @return Whether the consensusHeight field is set.
   */
  boolean hasConsensusHeight();
  /**
   * <code>.ibc.core.client.v1.Height consensus_height = 11 [json_name = "consensusHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"consensus_height&#92;""];</code>
   * @return The consensusHeight.
   */
  com.ibc.core.client.v1.Height getConsensusHeight();
  /**
   * <code>.ibc.core.client.v1.Height consensus_height = 11 [json_name = "consensusHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"consensus_height&#92;""];</code>
   */
  com.ibc.core.client.v1.HeightOrBuilder getConsensusHeightOrBuilder();

  /**
   * <code>string signer = 12 [json_name = "signer"];</code>
   * @return The signer.
   */
  String getSigner();
  /**
   * <code>string signer = 12 [json_name = "signer"];</code>
   * @return The bytes for signer.
   */
  com.google.protobuf.ByteString
      getSignerBytes();
}
