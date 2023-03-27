// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/connection/v1/query.proto

package com.ibc.core.connection.v1;

public interface QueryConnectionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.connection.v1.QueryConnectionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * list of stored connections of the chain.
   * </pre>
   *
   * <code>repeated .ibc.core.connection.v1.IdentifiedConnection connections = 1 [json_name = "connections"];</code>
   */
  java.util.List<IdentifiedConnection>
      getConnectionsList();
  /**
   * <pre>
   * list of stored connections of the chain.
   * </pre>
   *
   * <code>repeated .ibc.core.connection.v1.IdentifiedConnection connections = 1 [json_name = "connections"];</code>
   */
  IdentifiedConnection getConnections(int index);
  /**
   * <pre>
   * list of stored connections of the chain.
   * </pre>
   *
   * <code>repeated .ibc.core.connection.v1.IdentifiedConnection connections = 1 [json_name = "connections"];</code>
   */
  int getConnectionsCount();
  /**
   * <pre>
   * list of stored connections of the chain.
   * </pre>
   *
   * <code>repeated .ibc.core.connection.v1.IdentifiedConnection connections = 1 [json_name = "connections"];</code>
   */
  java.util.List<? extends IdentifiedConnectionOrBuilder>
      getConnectionsOrBuilderList();
  /**
   * <pre>
   * list of stored connections of the chain.
   * </pre>
   *
   * <code>repeated .ibc.core.connection.v1.IdentifiedConnection connections = 1 [json_name = "connections"];</code>
   */
  IdentifiedConnectionOrBuilder getConnectionsOrBuilder(
      int index);

  /**
   * <pre>
   * pagination response
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination response
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <pre>
   * pagination response
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();

  /**
   * <pre>
   * query block height
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height height = 3 [json_name = "height", (.gogoproto.nullable) = false];</code>
   * @return Whether the height field is set.
   */
  boolean hasHeight();
  /**
   * <pre>
   * query block height
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height height = 3 [json_name = "height", (.gogoproto.nullable) = false];</code>
   * @return The height.
   */
  com.ibc.core.client.v1.Height getHeight();
  /**
   * <pre>
   * query block height
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height height = 3 [json_name = "height", (.gogoproto.nullable) = false];</code>
   */
  com.ibc.core.client.v1.HeightOrBuilder getHeightOrBuilder();
}
