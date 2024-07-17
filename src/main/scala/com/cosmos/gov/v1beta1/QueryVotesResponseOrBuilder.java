// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/query.proto

package com.cosmos.gov.v1beta1;

public interface QueryVotesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.gov.v1beta1.QueryVotesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * votes defined the queried votes.
   * </pre>
   *
   * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.cosmos.gov.v1beta1.Vote> 
      getVotesList();
  /**
   * <pre>
   * votes defined the queried votes.
   * </pre>
   *
   * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.gov.v1beta1.Vote getVotes(int index);
  /**
   * <pre>
   * votes defined the queried votes.
   * </pre>
   *
   * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false];</code>
   */
  int getVotesCount();
  /**
   * <pre>
   * votes defined the queried votes.
   * </pre>
   *
   * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.cosmos.gov.v1beta1.VoteOrBuilder> 
      getVotesOrBuilderList();
  /**
   * <pre>
   * votes defined the queried votes.
   * </pre>
   *
   * <code>repeated .cosmos.gov.v1beta1.Vote votes = 1 [json_name = "votes", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.gov.v1beta1.VoteOrBuilder getVotesOrBuilder(
      int index);

  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
