// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/channel/v1/channel.proto

package com.ibc.core.channel.v1;

public interface AcknowledgementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.channel.v1.Acknowledgement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes result = 21 [json_name = "result"];</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <code>bytes result = 21 [json_name = "result"];</code>
   * @return The result.
   */
  com.google.protobuf.ByteString getResult();

  /**
   * <code>string error = 22 [json_name = "error"];</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <code>string error = 22 [json_name = "error"];</code>
   * @return The error.
   */
  String getError();
  /**
   * <code>string error = 22 [json_name = "error"];</code>
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString
      getErrorBytes();

  Acknowledgement.ResponseCase getResponseCase();
}
