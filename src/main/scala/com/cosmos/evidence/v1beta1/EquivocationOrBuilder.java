// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/evidence/v1beta1/evidence.proto

package com.cosmos.evidence.v1beta1;

public interface EquivocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.evidence.v1beta1.Equivocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 height = 1 [json_name = "height"];</code>
   * @return The height.
   */
  long getHeight();

  /**
   * <code>.google.protobuf.Timestamp time = 2 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the time field is set.
   */
  boolean hasTime();
  /**
   * <code>.google.protobuf.Timestamp time = 2 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The time.
   */
  com.google.protobuf.Timestamp getTime();
  /**
   * <code>.google.protobuf.Timestamp time = 2 [json_name = "time", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeOrBuilder();

  /**
   * <code>int64 power = 3 [json_name = "power"];</code>
   * @return The power.
   */
  long getPower();

  /**
   * <code>string consensus_address = 4 [json_name = "consensusAddress", (.gogoproto.moretags) = "yaml:&#92;"consensus_address&#92;""];</code>
   * @return The consensusAddress.
   */
  java.lang.String getConsensusAddress();
  /**
   * <code>string consensus_address = 4 [json_name = "consensusAddress", (.gogoproto.moretags) = "yaml:&#92;"consensus_address&#92;""];</code>
   * @return The bytes for consensusAddress.
   */
  com.google.protobuf.ByteString
      getConsensusAddressBytes();
}
