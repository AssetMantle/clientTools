// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/query.proto

package com.cosmos.gov.v1beta1;

public interface QueryDepositsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.gov.v1beta1.QueryDepositsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cosmos.gov.v1beta1.Deposit deposits = 1 [json_name = "deposits", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.cosmos.gov.v1beta1.Deposit> 
      getDepositsList();
  /**
   * <code>repeated .cosmos.gov.v1beta1.Deposit deposits = 1 [json_name = "deposits", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.gov.v1beta1.Deposit getDeposits(int index);
  /**
   * <code>repeated .cosmos.gov.v1beta1.Deposit deposits = 1 [json_name = "deposits", (.gogoproto.nullable) = false];</code>
   */
  int getDepositsCount();
  /**
   * <code>repeated .cosmos.gov.v1beta1.Deposit deposits = 1 [json_name = "deposits", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.cosmos.gov.v1beta1.DepositOrBuilder> 
      getDepositsOrBuilderList();
  /**
   * <code>repeated .cosmos.gov.v1beta1.Deposit deposits = 1 [json_name = "deposits", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.gov.v1beta1.DepositOrBuilder getDepositsOrBuilder(
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
