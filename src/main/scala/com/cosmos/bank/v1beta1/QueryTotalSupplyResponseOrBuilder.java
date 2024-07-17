// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/v1beta1/query.proto

package com.cosmos.bank.v1beta1;

public interface QueryTotalSupplyResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.bank.v1beta1.QueryTotalSupplyResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * supply is the supply of the coins
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin supply = 1 [json_name = "supply", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getSupplyList();
  /**
   * <pre>
   * supply is the supply of the coins
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin supply = 1 [json_name = "supply", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getSupply(int index);
  /**
   * <pre>
   * supply is the supply of the coins
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin supply = 1 [json_name = "supply", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getSupplyCount();
  /**
   * <pre>
   * supply is the supply of the coins
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin supply = 1 [json_name = "supply", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getSupplyOrBuilderList();
  /**
   * <pre>
   * supply is the supply of the coins
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin supply = 1 [json_name = "supply", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getSupplyOrBuilder(
      int index);

  /**
   * <pre>
   * pagination defines the pagination in the response.
   *
   * Since: cosmos-sdk 0.43
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination defines the pagination in the response.
   *
   * Since: cosmos-sdk 0.43
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <pre>
   * pagination defines the pagination in the response.
   *
   * Since: cosmos-sdk 0.43
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
