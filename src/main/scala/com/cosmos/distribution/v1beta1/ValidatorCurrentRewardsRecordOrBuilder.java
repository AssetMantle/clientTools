// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/genesis.proto

package com.cosmos.distribution.v1beta1;

public interface ValidatorCurrentRewardsRecordOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * validator_address is the address of the validator.
   * </pre>
   *
   * <code>string validator_address = 1 [json_name = "validatorAddress", (.gogoproto.moretags) = "yaml:&#92;"validator_address&#92;""];</code>
   * @return The validatorAddress.
   */
  java.lang.String getValidatorAddress();
  /**
   * <pre>
   * validator_address is the address of the validator.
   * </pre>
   *
   * <code>string validator_address = 1 [json_name = "validatorAddress", (.gogoproto.moretags) = "yaml:&#92;"validator_address&#92;""];</code>
   * @return The bytes for validatorAddress.
   */
  com.google.protobuf.ByteString
      getValidatorAddressBytes();

  /**
   * <pre>
   * rewards defines the current rewards of a validator.
   * </pre>
   *
   * <code>.cosmos.distribution.v1beta1.ValidatorCurrentRewards rewards = 2 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"rewards&#92;""];</code>
   * @return Whether the rewards field is set.
   */
  boolean hasRewards();
  /**
   * <pre>
   * rewards defines the current rewards of a validator.
   * </pre>
   *
   * <code>.cosmos.distribution.v1beta1.ValidatorCurrentRewards rewards = 2 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"rewards&#92;""];</code>
   * @return The rewards.
   */
  com.cosmos.distribution.v1beta1.ValidatorCurrentRewards getRewards();
  /**
   * <pre>
   * rewards defines the current rewards of a validator.
   * </pre>
   *
   * <code>.cosmos.distribution.v1beta1.ValidatorCurrentRewards rewards = 2 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"rewards&#92;""];</code>
   */
  com.cosmos.distribution.v1beta1.ValidatorCurrentRewardsOrBuilder getRewardsOrBuilder();
}
