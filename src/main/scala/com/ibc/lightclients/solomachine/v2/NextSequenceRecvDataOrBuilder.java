// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/solomachine/v2/solomachine.proto

package com.ibc.lightclients.solomachine.v2;

public interface NextSequenceRecvDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.lightclients.solomachine.v2.NextSequenceRecvData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes path = 1 [json_name = "path"];</code>
   * @return The path.
   */
  com.google.protobuf.ByteString getPath();

  /**
   * <code>uint64 next_seq_recv = 2 [json_name = "nextSeqRecv", (.gogoproto.moretags) = "yaml:&#92;"next_seq_recv&#92;""];</code>
   * @return The nextSeqRecv.
   */
  long getNextSeqRecv();
}
