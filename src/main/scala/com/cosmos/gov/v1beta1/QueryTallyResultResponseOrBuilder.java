// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/query.proto

package com.cosmos.gov.v1beta1;

public interface QueryTallyResultResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.gov.v1beta1.QueryTallyResultResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * tally defines the requested tally.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.TallyResult tally = 1 [json_name = "tally", (.gogoproto.nullable) = false];</code>
   * @return Whether the tally field is set.
   */
  boolean hasTally();
  /**
   * <pre>
   * tally defines the requested tally.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.TallyResult tally = 1 [json_name = "tally", (.gogoproto.nullable) = false];</code>
   * @return The tally.
   */
  TallyResult getTally();
  /**
   * <pre>
   * tally defines the requested tally.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.TallyResult tally = 1 [json_name = "tally", (.gogoproto.nullable) = false];</code>
   */
  TallyResultOrBuilder getTallyOrBuilder();
}
