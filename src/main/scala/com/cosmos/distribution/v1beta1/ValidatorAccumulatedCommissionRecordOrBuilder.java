// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/genesis.proto

package com.cosmos.distribution.v1beta1;

public interface ValidatorAccumulatedCommissionRecordOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionRecord)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * validator_address is the address of the validator.
   * </pre>
   *
   * <code>string validator_address = 1 [json_name = "validatorAddress", (.gogoproto.moretags) = "yaml:&#92;"validator_address&#92;""];</code>
   * @return The validatorAddress.
   */
  String getValidatorAddress();
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
   * accumulated is the accumulated commission of a validator.
   * </pre>
   *
   * <code>.cosmos.distribution.v1beta1.ValidatorAccumulatedCommission accumulated = 2 [json_name = "accumulated", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accumulated&#92;""];</code>
   * @return Whether the accumulated field is set.
   */
  boolean hasAccumulated();
  /**
   * <pre>
   * accumulated is the accumulated commission of a validator.
   * </pre>
   *
   * <code>.cosmos.distribution.v1beta1.ValidatorAccumulatedCommission accumulated = 2 [json_name = "accumulated", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accumulated&#92;""];</code>
   * @return The accumulated.
   */
  ValidatorAccumulatedCommission getAccumulated();
  /**
   * <pre>
   * accumulated is the accumulated commission of a validator.
   * </pre>
   *
   * <code>.cosmos.distribution.v1beta1.ValidatorAccumulatedCommission accumulated = 2 [json_name = "accumulated", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"accumulated&#92;""];</code>
   */
  ValidatorAccumulatedCommissionOrBuilder getAccumulatedOrBuilder();
}
