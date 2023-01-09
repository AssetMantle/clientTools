// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/tendermint/v1beta1/query.proto

package com.cosmos.base.tendermint.v1beta1;

public interface ModuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.base.tendermint.v1beta1.Module)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * module path
   * </pre>
   *
   * <code>string path = 1 [json_name = "path"];</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <pre>
   * module path
   * </pre>
   *
   * <code>string path = 1 [json_name = "path"];</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <pre>
   * module version
   * </pre>
   *
   * <code>string version = 2 [json_name = "version"];</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * module version
   * </pre>
   *
   * <code>string version = 2 [json_name = "version"];</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * checksum
   * </pre>
   *
   * <code>string sum = 3 [json_name = "sum"];</code>
   * @return The sum.
   */
  java.lang.String getSum();
  /**
   * <pre>
   * checksum
   * </pre>
   *
   * <code>string sum = 3 [json_name = "sum"];</code>
   * @return The bytes for sum.
   */
  com.google.protobuf.ByteString
      getSumBytes();
}