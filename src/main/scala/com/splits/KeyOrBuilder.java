// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/splits/internal/key/key.v1.proto

package com.splits;

public interface KeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:splits.Key)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ids.SplitID split_i_d = 1 [json_name = "splitID"];</code>
   * @return Whether the splitID field is set.
   */
  boolean hasSplitID();
  /**
   * <code>.ids.SplitID split_i_d = 1 [json_name = "splitID"];</code>
   * @return The splitID.
   */
  com.ids.SplitID getSplitID();
  /**
   * <code>.ids.SplitID split_i_d = 1 [json_name = "splitID"];</code>
   */
  com.ids.SplitIDOrBuilder getSplitIDOrBuilder();
}