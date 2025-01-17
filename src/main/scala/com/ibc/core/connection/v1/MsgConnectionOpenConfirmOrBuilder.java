// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/connection/v1/tx.proto

package com.ibc.core.connection.v1;

public interface MsgConnectionOpenConfirmOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.connection.v1.MsgConnectionOpenConfirm)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string connection_id = 1 [json_name = "connectionId", (.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
   * @return The connectionId.
   */
  java.lang.String getConnectionId();
  /**
   * <code>string connection_id = 1 [json_name = "connectionId", (.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
   * @return The bytes for connectionId.
   */
  com.google.protobuf.ByteString
      getConnectionIdBytes();

  /**
   * <pre>
   * proof for the change of the connection state on Chain A: `INIT -&gt; OPEN`
   * </pre>
   *
   * <code>bytes proof_ack = 2 [json_name = "proofAck", (.gogoproto.moretags) = "yaml:&#92;"proof_ack&#92;""];</code>
   * @return The proofAck.
   */
  com.google.protobuf.ByteString getProofAck();

  /**
   * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
   * @return Whether the proofHeight field is set.
   */
  boolean hasProofHeight();
  /**
   * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
   * @return The proofHeight.
   */
  com.ibc.core.client.v1.Height getProofHeight();
  /**
   * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"proof_height&#92;""];</code>
   */
  com.ibc.core.client.v1.HeightOrBuilder getProofHeightOrBuilder();

  /**
   * <code>string signer = 4 [json_name = "signer"];</code>
   * @return The signer.
   */
  java.lang.String getSigner();
  /**
   * <code>string signer = 4 [json_name = "signer"];</code>
   * @return The bytes for signer.
   */
  com.google.protobuf.ByteString
      getSignerBytes();
}
