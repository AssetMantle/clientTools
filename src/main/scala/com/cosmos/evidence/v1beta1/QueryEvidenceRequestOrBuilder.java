// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/evidence/v1beta1/query.proto

package com.cosmos.evidence.v1beta1;

public interface QueryEvidenceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.evidence.v1beta1.QueryEvidenceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * evidence_hash defines the hash of the requested evidence.
   * </pre>
   *
   * <code>bytes evidence_hash = 1 [json_name = "evidenceHash", (.gogoproto.casttype) = "github.com/tendermint/tendermint/libs/bytes.HexBytes"];</code>
   * @return The evidenceHash.
   */
  com.google.protobuf.ByteString getEvidenceHash();
}