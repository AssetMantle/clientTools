// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/abci/types.proto

package com.tendermint.abci;

public interface RequestApplySnapshotChunkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tendermint.abci.RequestApplySnapshotChunk)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 index = 1 [json_name = "index"];</code>
   * @return The index.
   */
  int getIndex();

  /**
   * <code>bytes chunk = 2 [json_name = "chunk"];</code>
   * @return The chunk.
   */
  com.google.protobuf.ByteString getChunk();

  /**
   * <code>string sender = 3 [json_name = "sender"];</code>
   * @return The sender.
   */
  java.lang.String getSender();
  /**
   * <code>string sender = 3 [json_name = "sender"];</code>
   * @return The bytes for sender.
   */
  com.google.protobuf.ByteString
      getSenderBytes();
}