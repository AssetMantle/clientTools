// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/distribution.proto

package com.cosmos.distribution.v1beta1;

public interface ValidatorCurrentRewardsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.distribution.v1beta1.ValidatorCurrentRewards)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.DecCoin> 
      getRewardsList();
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  com.cosmos.base.v1beta1.DecCoin getRewards(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  int getRewardsCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.DecCoinOrBuilder> 
      getRewardsOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  com.cosmos.base.v1beta1.DecCoinOrBuilder getRewardsOrBuilder(
      int index);

  /**
   * <code>uint64 period = 2 [json_name = "period"];</code>
   * @return The period.
   */
  long getPeriod();
}
