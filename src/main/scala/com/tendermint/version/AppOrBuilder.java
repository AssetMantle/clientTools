// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/version/types.proto

package com.tendermint.version;

public interface AppOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tendermint.version.App)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 protocol = 1 [json_name = "protocol"];</code>
   * @return The protocol.
   */
  long getProtocol();

  /**
   * <code>string software = 2 [json_name = "software"];</code>
   * @return The software.
   */
  String getSoftware();
  /**
   * <code>string software = 2 [json_name = "software"];</code>
   * @return The bytes for software.
   */
  com.google.protobuf.ByteString
      getSoftwareBytes();
}
