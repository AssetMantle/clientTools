// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/ids/base/dataID.v1.proto

package com.ids;

public interface DataIDOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ids.DataID)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ids.StringID type_i_d = 1 [json_name = "typeID"];</code>
   * @return Whether the typeID field is set.
   */
  boolean hasTypeID();
  /**
   * <code>.ids.StringID type_i_d = 1 [json_name = "typeID"];</code>
   * @return The typeID.
   */
  com.ids.StringID getTypeID();
  /**
   * <code>.ids.StringID type_i_d = 1 [json_name = "typeID"];</code>
   */
  com.ids.StringIDOrBuilder getTypeIDOrBuilder();

  /**
   * <code>.ids.HashID hash_i_d = 2 [json_name = "hashID"];</code>
   * @return Whether the hashID field is set.
   */
  boolean hasHashID();
  /**
   * <code>.ids.HashID hash_i_d = 2 [json_name = "hashID"];</code>
   * @return The hashID.
   */
  com.ids.HashID getHashID();
  /**
   * <code>.ids.HashID hash_i_d = 2 [json_name = "hashID"];</code>
   */
  com.ids.HashIDOrBuilder getHashIDOrBuilder();
}