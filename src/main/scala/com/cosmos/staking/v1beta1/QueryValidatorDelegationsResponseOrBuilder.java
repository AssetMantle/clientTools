// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package com.cosmos.staking.v1beta1;

public interface QueryValidatorDelegationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.staking.v1beta1.QueryValidatorDelegationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cosmos.staking.v1beta1.DelegationResponse delegation_responses = 1 [json_name = "delegationResponses", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "DelegationResponses"];</code>
   */
  java.util.List<com.cosmos.staking.v1beta1.DelegationResponse> 
      getDelegationResponsesList();
  /**
   * <code>repeated .cosmos.staking.v1beta1.DelegationResponse delegation_responses = 1 [json_name = "delegationResponses", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "DelegationResponses"];</code>
   */
  com.cosmos.staking.v1beta1.DelegationResponse getDelegationResponses(int index);
  /**
   * <code>repeated .cosmos.staking.v1beta1.DelegationResponse delegation_responses = 1 [json_name = "delegationResponses", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "DelegationResponses"];</code>
   */
  int getDelegationResponsesCount();
  /**
   * <code>repeated .cosmos.staking.v1beta1.DelegationResponse delegation_responses = 1 [json_name = "delegationResponses", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "DelegationResponses"];</code>
   */
  java.util.List<? extends com.cosmos.staking.v1beta1.DelegationResponseOrBuilder> 
      getDelegationResponsesOrBuilderList();
  /**
   * <code>repeated .cosmos.staking.v1beta1.DelegationResponse delegation_responses = 1 [json_name = "delegationResponses", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "DelegationResponses"];</code>
   */
  com.cosmos.staking.v1beta1.DelegationResponseOrBuilder getDelegationResponsesOrBuilder(
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