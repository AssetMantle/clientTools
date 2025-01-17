// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/abci/v1beta1/abci.proto

package com.cosmos.base.abci.v1beta1;

public interface ResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.base.abci.v1beta1.Result)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Data is any data returned from message or handler execution. It MUST be
   * length prefixed in order to separate data from multiple message executions.
   * </pre>
   *
   * <code>bytes data = 1 [json_name = "data"];</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();

  /**
   * <pre>
   * Log contains the log information from message or handler execution.
   * </pre>
   *
   * <code>string log = 2 [json_name = "log"];</code>
   * @return The log.
   */
  java.lang.String getLog();
  /**
   * <pre>
   * Log contains the log information from message or handler execution.
   * </pre>
   *
   * <code>string log = 2 [json_name = "log"];</code>
   * @return The bytes for log.
   */
  com.google.protobuf.ByteString
      getLogBytes();

  /**
   * <pre>
   * Events contains a slice of Event objects that were emitted during message
   * or handler execution.
   * </pre>
   *
   * <code>repeated .tendermint.abci.Event events = 3 [json_name = "events", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.tendermint.abci.Event> 
      getEventsList();
  /**
   * <pre>
   * Events contains a slice of Event objects that were emitted during message
   * or handler execution.
   * </pre>
   *
   * <code>repeated .tendermint.abci.Event events = 3 [json_name = "events", (.gogoproto.nullable) = false];</code>
   */
  com.tendermint.abci.Event getEvents(int index);
  /**
   * <pre>
   * Events contains a slice of Event objects that were emitted during message
   * or handler execution.
   * </pre>
   *
   * <code>repeated .tendermint.abci.Event events = 3 [json_name = "events", (.gogoproto.nullable) = false];</code>
   */
  int getEventsCount();
  /**
   * <pre>
   * Events contains a slice of Event objects that were emitted during message
   * or handler execution.
   * </pre>
   *
   * <code>repeated .tendermint.abci.Event events = 3 [json_name = "events", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.tendermint.abci.EventOrBuilder> 
      getEventsOrBuilderList();
  /**
   * <pre>
   * Events contains a slice of Event objects that were emitted during message
   * or handler execution.
   * </pre>
   *
   * <code>repeated .tendermint.abci.Event events = 3 [json_name = "events", (.gogoproto.nullable) = false];</code>
   */
  com.tendermint.abci.EventOrBuilder getEventsOrBuilder(
      int index);
}
