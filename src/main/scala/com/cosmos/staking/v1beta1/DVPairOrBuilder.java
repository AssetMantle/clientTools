// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/staking.proto

package com.cosmos.staking.v1beta1;

public interface DVPairOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.staking.v1beta1.DVPair)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
   * @return The delegatorAddress.
   */
  String getDelegatorAddress();
  /**
   * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.gogoproto.moretags) = "yaml:&#92;"delegator_address&#92;""];</code>
   * @return The bytes for delegatorAddress.
   */
  com.google.protobuf.ByteString
      getDelegatorAddressBytes();

  /**
   * <code>string validator_address = 2 [json_name = "validatorAddress", (.gogoproto.moretags) = "yaml:&#92;"validator_address&#92;""];</code>
   * @return The validatorAddress.
   */
  String getValidatorAddress();
  /**
   * <code>string validator_address = 2 [json_name = "validatorAddress", (.gogoproto.moretags) = "yaml:&#92;"validator_address&#92;""];</code>
   * @return The bytes for validatorAddress.
   */
  com.google.protobuf.ByteString
      getValidatorAddressBytes();
}
