// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package com.cosmos.staking.v1beta1;

public interface QueryDelegatorValidatorResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.staking.v1beta1.QueryDelegatorValidatorResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * validator defines the the validator info.
   * </pre>
   *
   * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
   * @return Whether the validator field is set.
   */
  boolean hasValidator();
  /**
   * <pre>
   * validator defines the the validator info.
   * </pre>
   *
   * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
   * @return The validator.
   */
  Validator getValidator();
  /**
   * <pre>
   * validator defines the the validator info.
   * </pre>
   *
   * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
   */
  ValidatorOrBuilder getValidatorOrBuilder();
}
