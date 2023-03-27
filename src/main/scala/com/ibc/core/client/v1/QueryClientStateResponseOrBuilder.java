// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/client/v1/query.proto

package com.ibc.core.client.v1;

public interface QueryClientStateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.client.v1.QueryClientStateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * client state associated with the request identifier
   * </pre>
   *
   * <code>.google.protobuf.Any client_state = 1 [json_name = "clientState"];</code>
   * @return Whether the clientState field is set.
   */
  boolean hasClientState();
  /**
   * <pre>
   * client state associated with the request identifier
   * </pre>
   *
   * <code>.google.protobuf.Any client_state = 1 [json_name = "clientState"];</code>
   * @return The clientState.
   */
  com.google.protobuf.Any getClientState();
  /**
   * <pre>
   * client state associated with the request identifier
   * </pre>
   *
   * <code>.google.protobuf.Any client_state = 1 [json_name = "clientState"];</code>
   */
  com.google.protobuf.AnyOrBuilder getClientStateOrBuilder();

  /**
   * <pre>
   * merkle proof of existence
   * </pre>
   *
   * <code>bytes proof = 2 [json_name = "proof"];</code>
   * @return The proof.
   */
  com.google.protobuf.ByteString getProof();

  /**
   * <pre>
   * height at which the proof was retrieved
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
   * @return Whether the proofHeight field is set.
   */
  boolean hasProofHeight();
  /**
   * <pre>
   * height at which the proof was retrieved
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
   * @return The proofHeight.
   */
  Height getProofHeight();
  /**
   * <pre>
   * height at which the proof was retrieved
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height proof_height = 3 [json_name = "proofHeight", (.gogoproto.nullable) = false];</code>
   */
  HeightOrBuilder getProofHeightOrBuilder();
}
