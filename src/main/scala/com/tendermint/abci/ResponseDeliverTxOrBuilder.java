// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/abci/types.proto

package com.tendermint.abci;

public interface ResponseDeliverTxOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tendermint.abci.ResponseDeliverTx)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 code = 1 [json_name = "code"];</code>
   * @return The code.
   */
  int getCode();

  /**
   * <code>bytes data = 2 [json_name = "data"];</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();

  /**
   * <pre>
   * nondeterministic
   * </pre>
   *
   * <code>string log = 3 [json_name = "log"];</code>
   * @return The log.
   */
  java.lang.String getLog();
  /**
   * <pre>
   * nondeterministic
   * </pre>
   *
   * <code>string log = 3 [json_name = "log"];</code>
   * @return The bytes for log.
   */
  com.google.protobuf.ByteString
      getLogBytes();

  /**
   * <pre>
   * nondeterministic
   * </pre>
   *
   * <code>string info = 4 [json_name = "info"];</code>
   * @return The info.
   */
  java.lang.String getInfo();
  /**
   * <pre>
   * nondeterministic
   * </pre>
   *
   * <code>string info = 4 [json_name = "info"];</code>
   * @return The bytes for info.
   */
  com.google.protobuf.ByteString
      getInfoBytes();

  /**
   * <code>int64 gas_wanted = 5 [json_name = "gas_wanted"];</code>
   * @return The gasWanted.
   */
  long getGasWanted();

  /**
   * <code>int64 gas_used = 6 [json_name = "gas_used"];</code>
   * @return The gasUsed.
   */
  long getGasUsed();

  /**
   * <code>repeated .tendermint.abci.Event events = 7 [json_name = "events", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "events,omitempty"];</code>
   */
  java.util.List<com.tendermint.abci.Event> 
      getEventsList();
  /**
   * <code>repeated .tendermint.abci.Event events = 7 [json_name = "events", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "events,omitempty"];</code>
   */
  com.tendermint.abci.Event getEvents(int index);
  /**
   * <code>repeated .tendermint.abci.Event events = 7 [json_name = "events", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "events,omitempty"];</code>
   */
  int getEventsCount();
  /**
   * <code>repeated .tendermint.abci.Event events = 7 [json_name = "events", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "events,omitempty"];</code>
   */
  java.util.List<? extends com.tendermint.abci.EventOrBuilder> 
      getEventsOrBuilderList();
  /**
   * <code>repeated .tendermint.abci.Event events = 7 [json_name = "events", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "events,omitempty"];</code>
   */
  com.tendermint.abci.EventOrBuilder getEventsOrBuilder(
      int index);

  /**
   * <code>string codespace = 8 [json_name = "codespace"];</code>
   * @return The codespace.
   */
  java.lang.String getCodespace();
  /**
   * <code>string codespace = 8 [json_name = "codespace"];</code>
   * @return The bytes for codespace.
   */
  com.google.protobuf.ByteString
      getCodespaceBytes();
}
