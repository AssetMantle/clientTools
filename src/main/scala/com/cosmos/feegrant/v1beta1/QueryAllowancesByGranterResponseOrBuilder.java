// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/feegrant/v1beta1/query.proto

package com.cosmos.feegrant.v1beta1;

public interface QueryAllowancesByGranterResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.feegrant.v1beta1.QueryAllowancesByGranterResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * allowances that have been issued by the granter.
   * </pre>
   *
   * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances"];</code>
   */
  java.util.List<Grant>
      getAllowancesList();
  /**
   * <pre>
   * allowances that have been issued by the granter.
   * </pre>
   *
   * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances"];</code>
   */
  Grant getAllowances(int index);
  /**
   * <pre>
   * allowances that have been issued by the granter.
   * </pre>
   *
   * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances"];</code>
   */
  int getAllowancesCount();
  /**
   * <pre>
   * allowances that have been issued by the granter.
   * </pre>
   *
   * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances"];</code>
   */
  java.util.List<? extends GrantOrBuilder>
      getAllowancesOrBuilderList();
  /**
   * <pre>
   * allowances that have been issued by the granter.
   * </pre>
   *
   * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances"];</code>
   */
  GrantOrBuilder getAllowancesOrBuilder(
      int index);

  /**
   * <pre>
   * pagination defines an pagination for the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination defines an pagination for the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <pre>
   * pagination defines an pagination for the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
