// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: maintainers/queries/maintainers/query_request.proto

package com.assetmantle.modules.maintainers.queries.maintainers;

public interface QueryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:assetmantle.modules.maintainers.queries.maintainers.QueryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
   * @return Whether the pageRequest field is set.
   */
  boolean hasPageRequest();
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
   * @return The pageRequest.
   */
  com.cosmos.base.query.v1beta1.PageRequest getPageRequest();
  /**
   * <code>.cosmos.base.query.v1beta1.PageRequest page_request = 1 [json_name = "pageRequest"];</code>
   */
  com.cosmos.base.query.v1beta1.PageRequestOrBuilder getPageRequestOrBuilder();
}