// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/p2p/conn.proto

package com.tendermint.p2p;

public interface PacketMsgOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tendermint.p2p.PacketMsg)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 channel_id = 1 [json_name = "channelId", (.gogoproto.customname) = "ChannelID"];</code>
   * @return The channelId.
   */
  int getChannelId();

  /**
   * <code>bool eof = 2 [json_name = "eof", (.gogoproto.customname) = "EOF"];</code>
   * @return The eof.
   */
  boolean getEof();

  /**
   * <code>bytes data = 3 [json_name = "data"];</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();
}
