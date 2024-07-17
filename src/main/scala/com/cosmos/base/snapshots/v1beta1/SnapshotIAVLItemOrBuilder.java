// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/snapshots/v1beta1/snapshot.proto

package com.cosmos.base.snapshots.v1beta1;

public interface SnapshotIAVLItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.base.snapshots.v1beta1.SnapshotIAVLItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes key = 1 [json_name = "key"];</code>
   * @return The key.
   */
  com.google.protobuf.ByteString getKey();

  /**
   * <code>bytes value = 2 [json_name = "value"];</code>
   * @return The value.
   */
  com.google.protobuf.ByteString getValue();

  /**
   * <pre>
   * version is block height
   * </pre>
   *
   * <code>int64 version = 3 [json_name = "version"];</code>
   * @return The version.
   */
  long getVersion();

  /**
   * <pre>
   * height is depth of the tree.
   * </pre>
   *
   * <code>int32 height = 4 [json_name = "height"];</code>
   * @return The height.
   */
  int getHeight();
}
