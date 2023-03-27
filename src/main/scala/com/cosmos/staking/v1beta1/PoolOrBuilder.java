// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/staking.proto

package com.cosmos.staking.v1beta1;

public interface PoolOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.staking.v1beta1.Pool)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string not_bonded_tokens = 1 [json_name = "notBondedTokens", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.jsontag) = "not_bonded_tokens"];</code>
   * @return The notBondedTokens.
   */
  String getNotBondedTokens();
  /**
   * <code>string not_bonded_tokens = 1 [json_name = "notBondedTokens", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.jsontag) = "not_bonded_tokens"];</code>
   * @return The bytes for notBondedTokens.
   */
  com.google.protobuf.ByteString
      getNotBondedTokensBytes();

  /**
   * <code>string bonded_tokens = 2 [json_name = "bondedTokens", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.jsontag) = "bonded_tokens", (.gogoproto.moretags) = "yaml:&#92;"bonded_tokens&#92;""];</code>
   * @return The bondedTokens.
   */
  String getBondedTokens();
  /**
   * <code>string bonded_tokens = 2 [json_name = "bondedTokens", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.jsontag) = "bonded_tokens", (.gogoproto.moretags) = "yaml:&#92;"bonded_tokens&#92;""];</code>
   * @return The bytes for bondedTokens.
   */
  com.google.protobuf.ByteString
      getBondedTokensBytes();
}
