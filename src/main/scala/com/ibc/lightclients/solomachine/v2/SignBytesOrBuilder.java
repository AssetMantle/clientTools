// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/solomachine/v2/solomachine.proto

package com.ibc.lightclients.solomachine.v2;

public interface SignBytesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.lightclients.solomachine.v2.SignBytes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 sequence = 1 [json_name = "sequence"];</code>
   * @return The sequence.
   */
  long getSequence();

  /**
   * <code>uint64 timestamp = 2 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <code>string diversifier = 3 [json_name = "diversifier"];</code>
   * @return The diversifier.
   */
  String getDiversifier();
  /**
   * <code>string diversifier = 3 [json_name = "diversifier"];</code>
   * @return The bytes for diversifier.
   */
  com.google.protobuf.ByteString
      getDiversifierBytes();

  /**
   * <pre>
   * type of the data used
   * </pre>
   *
   * <code>.ibc.lightclients.solomachine.v2.DataType data_type = 4 [json_name = "dataType", (.gogoproto.moretags) = "yaml:&#92;"data_type&#92;""];</code>
   * @return The enum numeric value on the wire for dataType.
   */
  int getDataTypeValue();
  /**
   * <pre>
   * type of the data used
   * </pre>
   *
   * <code>.ibc.lightclients.solomachine.v2.DataType data_type = 4 [json_name = "dataType", (.gogoproto.moretags) = "yaml:&#92;"data_type&#92;""];</code>
   * @return The dataType.
   */
  DataType getDataType();

  /**
   * <pre>
   * marshaled data
   * </pre>
   *
   * <code>bytes data = 5 [json_name = "data"];</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();
}
