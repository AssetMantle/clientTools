// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/upgrade/v1beta1/query.proto

package com.cosmos.upgrade.v1beta1;

@Deprecated public interface QueryUpgradedConsensusStateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.upgrade.v1beta1.QueryUpgradedConsensusStateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * last height of the current chain must be sent in request
   * as this is the height under which next consensus state is stored
   * </pre>
   *
   * <code>int64 last_height = 1 [json_name = "lastHeight"];</code>
   * @return The lastHeight.
   */
  long getLastHeight();
}
