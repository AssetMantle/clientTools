// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/query.proto

package com.cosmos.gov.v1beta1;

public interface QueryVoteResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.gov.v1beta1.QueryVoteResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * vote defined the queried vote.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.Vote vote = 1 [json_name = "vote", (.gogoproto.nullable) = false];</code>
   * @return Whether the vote field is set.
   */
  boolean hasVote();
  /**
   * <pre>
   * vote defined the queried vote.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.Vote vote = 1 [json_name = "vote", (.gogoproto.nullable) = false];</code>
   * @return The vote.
   */
  com.cosmos.gov.v1beta1.Vote getVote();
  /**
   * <pre>
   * vote defined the queried vote.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.Vote vote = 1 [json_name = "vote", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.gov.v1beta1.VoteOrBuilder getVoteOrBuilder();
}
