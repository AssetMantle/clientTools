// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/distribution/v1beta1/distribution.proto

package com.cosmos.distribution.v1beta1;

public interface ValidatorSlashEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.distribution.v1beta1.ValidatorSlashEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 validator_period = 1 [json_name = "validatorPeriod", (.gogoproto.moretags) = "yaml:&#92;"validator_period&#92;""];</code>
   * @return The validatorPeriod.
   */
  long getValidatorPeriod();

  /**
   * <code>string fraction = 2 [json_name = "fraction", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The fraction.
   */
  String getFraction();
  /**
   * <code>string fraction = 2 [json_name = "fraction", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for fraction.
   */
  com.google.protobuf.ByteString
      getFractionBytes();
}
