// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/types/types.proto

package com.tendermint.types;

public interface BlockIDOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tendermint.types.BlockID)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes hash = 1 [json_name = "hash"];</code>
   * @return The hash.
   */
  com.google.protobuf.ByteString getHash();

  /**
   * <code>.tendermint.types.PartSetHeader part_set_header = 2 [json_name = "partSetHeader", (.gogoproto.nullable) = false];</code>
   * @return Whether the partSetHeader field is set.
   */
  boolean hasPartSetHeader();
  /**
   * <code>.tendermint.types.PartSetHeader part_set_header = 2 [json_name = "partSetHeader", (.gogoproto.nullable) = false];</code>
   * @return The partSetHeader.
   */
  PartSetHeader getPartSetHeader();
  /**
   * <code>.tendermint.types.PartSetHeader part_set_header = 2 [json_name = "partSetHeader", (.gogoproto.nullable) = false];</code>
   */
  PartSetHeaderOrBuilder getPartSetHeaderOrBuilder();
}
