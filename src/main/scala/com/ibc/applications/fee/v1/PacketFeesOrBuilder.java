// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/fee/v1/fee.proto

package com.ibc.applications.fee.v1;

public interface PacketFeesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.applications.fee.v1.PacketFees)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * list of packet fees
   * </pre>
   *
   * <code>repeated .ibc.applications.fee.v1.PacketFee packet_fees = 1 [json_name = "packetFees", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"packet_fees&#92;""];</code>
   */
  java.util.List<com.ibc.applications.fee.v1.PacketFee> 
      getPacketFeesList();
  /**
   * <pre>
   * list of packet fees
   * </pre>
   *
   * <code>repeated .ibc.applications.fee.v1.PacketFee packet_fees = 1 [json_name = "packetFees", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"packet_fees&#92;""];</code>
   */
  com.ibc.applications.fee.v1.PacketFee getPacketFees(int index);
  /**
   * <pre>
   * list of packet fees
   * </pre>
   *
   * <code>repeated .ibc.applications.fee.v1.PacketFee packet_fees = 1 [json_name = "packetFees", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"packet_fees&#92;""];</code>
   */
  int getPacketFeesCount();
  /**
   * <pre>
   * list of packet fees
   * </pre>
   *
   * <code>repeated .ibc.applications.fee.v1.PacketFee packet_fees = 1 [json_name = "packetFees", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"packet_fees&#92;""];</code>
   */
  java.util.List<? extends com.ibc.applications.fee.v1.PacketFeeOrBuilder> 
      getPacketFeesOrBuilderList();
  /**
   * <pre>
   * list of packet fees
   * </pre>
   *
   * <code>repeated .ibc.applications.fee.v1.PacketFee packet_fees = 1 [json_name = "packetFees", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"packet_fees&#92;""];</code>
   */
  com.ibc.applications.fee.v1.PacketFeeOrBuilder getPacketFeesOrBuilder(
      int index);
}