// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/query.proto

package com.cosmos.distribution.v1beta1;

public interface QueryValidatorOutstandingRewardsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.distribution.v1beta1.QueryValidatorOutstandingRewardsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmos.distribution.v1beta1.ValidatorOutstandingRewards rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false];</code>
   * @return Whether the rewards field is set.
   */
  boolean hasRewards();
  /**
   * <code>.cosmos.distribution.v1beta1.ValidatorOutstandingRewards rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false];</code>
   * @return The rewards.
   */
  ValidatorOutstandingRewards getRewards();
  /**
   * <code>.cosmos.distribution.v1beta1.ValidatorOutstandingRewards rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false];</code>
   */
  ValidatorOutstandingRewardsOrBuilder getRewardsOrBuilder();
}
