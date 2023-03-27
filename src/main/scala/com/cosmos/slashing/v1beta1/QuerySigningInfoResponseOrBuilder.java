// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/slashing/v1beta1/query.proto

package com.cosmos.slashing.v1beta1;

public interface QuerySigningInfoResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.slashing.v1beta1.QuerySigningInfoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * val_signing_info is the signing info of requested val cons address
   * </pre>
   *
   * <code>.cosmos.slashing.v1beta1.ValidatorSigningInfo val_signing_info = 1 [json_name = "valSigningInfo", (.gogoproto.nullable) = false];</code>
   * @return Whether the valSigningInfo field is set.
   */
  boolean hasValSigningInfo();
  /**
   * <pre>
   * val_signing_info is the signing info of requested val cons address
   * </pre>
   *
   * <code>.cosmos.slashing.v1beta1.ValidatorSigningInfo val_signing_info = 1 [json_name = "valSigningInfo", (.gogoproto.nullable) = false];</code>
   * @return The valSigningInfo.
   */
  ValidatorSigningInfo getValSigningInfo();
  /**
   * <pre>
   * val_signing_info is the signing info of requested val cons address
   * </pre>
   *
   * <code>.cosmos.slashing.v1beta1.ValidatorSigningInfo val_signing_info = 1 [json_name = "valSigningInfo", (.gogoproto.nullable) = false];</code>
   */
  ValidatorSigningInfoOrBuilder getValSigningInfoOrBuilder();
}
