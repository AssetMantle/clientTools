// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package com.cosmos.staking.v1beta1;

public interface QueryDelegatorValidatorRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.staking.v1beta1.QueryDelegatorValidatorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * delegator_addr defines the delegator address to query for.
   * </pre>
   *
   * <code>string delegator_addr = 1 [json_name = "delegatorAddr"];</code>
   * @return The delegatorAddr.
   */
  String getDelegatorAddr();
  /**
   * <pre>
   * delegator_addr defines the delegator address to query for.
   * </pre>
   *
   * <code>string delegator_addr = 1 [json_name = "delegatorAddr"];</code>
   * @return The bytes for delegatorAddr.
   */
  com.google.protobuf.ByteString
      getDelegatorAddrBytes();

  /**
   * <pre>
   * validator_addr defines the validator address to query for.
   * </pre>
   *
   * <code>string validator_addr = 2 [json_name = "validatorAddr"];</code>
   * @return The validatorAddr.
   */
  String getValidatorAddr();
  /**
   * <pre>
   * validator_addr defines the validator address to query for.
   * </pre>
   *
   * <code>string validator_addr = 2 [json_name = "validatorAddr"];</code>
   * @return The bytes for validatorAddr.
   */
  com.google.protobuf.ByteString
      getValidatorAddrBytes();
}
