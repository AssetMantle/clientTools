// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/abci/v1beta1/abci.proto

package com.cosmos.base.abci.v1beta1;

public interface TxMsgDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.base.abci.v1beta1.TxMsgData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cosmos.base.abci.v1beta1.MsgData data = 1 [json_name = "data"];</code>
   */
  java.util.List<com.cosmos.base.abci.v1beta1.MsgData> 
      getDataList();
  /**
   * <code>repeated .cosmos.base.abci.v1beta1.MsgData data = 1 [json_name = "data"];</code>
   */
  com.cosmos.base.abci.v1beta1.MsgData getData(int index);
  /**
   * <code>repeated .cosmos.base.abci.v1beta1.MsgData data = 1 [json_name = "data"];</code>
   */
  int getDataCount();
  /**
   * <code>repeated .cosmos.base.abci.v1beta1.MsgData data = 1 [json_name = "data"];</code>
   */
  java.util.List<? extends com.cosmos.base.abci.v1beta1.MsgDataOrBuilder> 
      getDataOrBuilderList();
  /**
   * <code>repeated .cosmos.base.abci.v1beta1.MsgData data = 1 [json_name = "data"];</code>
   */
  com.cosmos.base.abci.v1beta1.MsgDataOrBuilder getDataOrBuilder(
      int index);
}
