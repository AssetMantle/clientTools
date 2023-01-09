// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/query.proto

package com.cosmos.gov.v1beta1;

public interface QueryDepositRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.gov.v1beta1.QueryDepositRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * proposal_id defines the unique id of the proposal.
   * </pre>
   *
   * <code>uint64 proposal_id = 1 [json_name = "proposalId"];</code>
   * @return The proposalId.
   */
  long getProposalId();

  /**
   * <pre>
   * depositor defines the deposit addresses from the proposals.
   * </pre>
   *
   * <code>string depositor = 2 [json_name = "depositor"];</code>
   * @return The depositor.
   */
  java.lang.String getDepositor();
  /**
   * <pre>
   * depositor defines the deposit addresses from the proposals.
   * </pre>
   *
   * <code>string depositor = 2 [json_name = "depositor"];</code>
   * @return The bytes for depositor.
   */
  com.google.protobuf.ByteString
      getDepositorBytes();
}