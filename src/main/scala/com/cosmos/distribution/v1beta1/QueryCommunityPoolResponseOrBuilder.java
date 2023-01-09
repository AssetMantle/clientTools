// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/query.proto

package com.cosmos.distribution.v1beta1;

public interface QueryCommunityPoolResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.distribution.v1beta1.QueryCommunityPoolResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * pool defines community pool's coins.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.DecCoin pool = 1 [json_name = "pool", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.DecCoin> 
      getPoolList();
  /**
   * <pre>
   * pool defines community pool's coins.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.DecCoin pool = 1 [json_name = "pool", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  com.cosmos.base.v1beta1.DecCoin getPool(int index);
  /**
   * <pre>
   * pool defines community pool's coins.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.DecCoin pool = 1 [json_name = "pool", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  int getPoolCount();
  /**
   * <pre>
   * pool defines community pool's coins.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.DecCoin pool = 1 [json_name = "pool", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.DecCoinOrBuilder> 
      getPoolOrBuilderList();
  /**
   * <pre>
   * pool defines community pool's coins.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.DecCoin pool = 1 [json_name = "pool", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
   */
  com.cosmos.base.v1beta1.DecCoinOrBuilder getPoolOrBuilder(
      int index);
}
