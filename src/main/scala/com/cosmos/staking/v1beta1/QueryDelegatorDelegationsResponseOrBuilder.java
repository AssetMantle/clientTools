// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package com.cosmos.staking.v1beta1;

public interface QueryDelegatorDelegationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.staking.v1beta1.QueryDelegatorDelegationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * delegation_responses defines all the delegations' info of a delegator.
   * </pre>
   *
   * <code>repeated .cosmos.staking.v1beta1.DelegationResponse delegation_responses = 1 [json_name = "delegationResponses", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<DelegationResponse>
      getDelegationResponsesList();
  /**
   * <pre>
   * delegation_responses defines all the delegations' info of a delegator.
   * </pre>
   *
   * <code>repeated .cosmos.staking.v1beta1.DelegationResponse delegation_responses = 1 [json_name = "delegationResponses", (.gogoproto.nullable) = false];</code>
   */
  DelegationResponse getDelegationResponses(int index);
  /**
   * <pre>
   * delegation_responses defines all the delegations' info of a delegator.
   * </pre>
   *
   * <code>repeated .cosmos.staking.v1beta1.DelegationResponse delegation_responses = 1 [json_name = "delegationResponses", (.gogoproto.nullable) = false];</code>
   */
  int getDelegationResponsesCount();
  /**
   * <pre>
   * delegation_responses defines all the delegations' info of a delegator.
   * </pre>
   *
   * <code>repeated .cosmos.staking.v1beta1.DelegationResponse delegation_responses = 1 [json_name = "delegationResponses", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends DelegationResponseOrBuilder>
      getDelegationResponsesOrBuilderList();
  /**
   * <pre>
   * delegation_responses defines all the delegations' info of a delegator.
   * </pre>
   *
   * <code>repeated .cosmos.staking.v1beta1.DelegationResponse delegation_responses = 1 [json_name = "delegationResponses", (.gogoproto.nullable) = false];</code>
   */
  DelegationResponseOrBuilder getDelegationResponsesOrBuilder(
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
