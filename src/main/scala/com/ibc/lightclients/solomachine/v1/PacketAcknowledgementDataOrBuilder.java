// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/solomachine/v1/solomachine.proto

package com.ibc.lightclients.solomachine.v1;

public interface PacketAcknowledgementDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.lightclients.solomachine.v1.PacketAcknowledgementData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes path = 1 [json_name = "path"];</code>
   * @return The path.
   */
  com.google.protobuf.ByteString getPath();

  /**
   * <code>bytes acknowledgement = 2 [json_name = "acknowledgement"];</code>
   * @return The acknowledgement.
   */
  com.google.protobuf.ByteString getAcknowledgement();
}
