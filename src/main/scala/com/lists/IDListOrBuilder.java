// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/lists/base/idList.v1.proto

package com.lists;

public interface IDListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lists.IDList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .ids.AnyID i_d_list = 1 [json_name = "iDList"];</code>
   */
  java.util.List<com.ids.AnyID> 
      getIDListList();
  /**
   * <code>repeated .ids.AnyID i_d_list = 1 [json_name = "iDList"];</code>
   */
  com.ids.AnyID getIDList(int index);
  /**
   * <code>repeated .ids.AnyID i_d_list = 1 [json_name = "iDList"];</code>
   */
  int getIDListCount();
  /**
   * <code>repeated .ids.AnyID i_d_list = 1 [json_name = "iDList"];</code>
   */
  java.util.List<? extends com.ids.AnyIDOrBuilder> 
      getIDListOrBuilderList();
  /**
   * <code>repeated .ids.AnyID i_d_list = 1 [json_name = "iDList"];</code>
   */
  com.ids.AnyIDOrBuilder getIDListOrBuilder(
      int index);
}
