// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package com.cosmos.staking.v1beta1;

public interface QueryUnbondingDelegationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.staking.v1beta1.QueryUnbondingDelegationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * unbond defines the unbonding information of a delegation.
   * </pre>
   *
   * <code>.cosmos.staking.v1beta1.UnbondingDelegation unbond = 1 [json_name = "unbond", (.gogoproto.nullable) = false];</code>
   * @return Whether the unbond field is set.
   */
  boolean hasUnbond();
  /**
   * <pre>
   * unbond defines the unbonding information of a delegation.
   * </pre>
   *
   * <code>.cosmos.staking.v1beta1.UnbondingDelegation unbond = 1 [json_name = "unbond", (.gogoproto.nullable) = false];</code>
   * @return The unbond.
   */
  com.cosmos.staking.v1beta1.UnbondingDelegation getUnbond();
  /**
   * <pre>
   * unbond defines the unbonding information of a delegation.
   * </pre>
   *
   * <code>.cosmos.staking.v1beta1.UnbondingDelegation unbond = 1 [json_name = "unbond", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.staking.v1beta1.UnbondingDelegationOrBuilder getUnbondOrBuilder();
}
