// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/abci/types.proto

package com.tendermint.abci;

public interface ResponseSetOptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tendermint.abci.ResponseSetOption)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 code = 1 [json_name = "code"];</code>
   * @return The code.
   */
  int getCode();

  /**
   * <pre>
   * bytes data = 2;
   * </pre>
   *
   * <code>string log = 3 [json_name = "log"];</code>
   * @return The log.
   */
  String getLog();
  /**
   * <pre>
   * bytes data = 2;
   * </pre>
   *
   * <code>string log = 3 [json_name = "log"];</code>
   * @return The bytes for log.
   */
  com.google.protobuf.ByteString
      getLogBytes();

  /**
   * <code>string info = 4 [json_name = "info"];</code>
   * @return The info.
   */
  String getInfo();
  /**
   * <code>string info = 4 [json_name = "info"];</code>
   * @return The bytes for info.
   */
  com.google.protobuf.ByteString
      getInfoBytes();
}
