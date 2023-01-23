// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/channel/v1/query.proto

package com.ibc.core.channel.v1;

public interface QueryConnectionChannelsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.channel.v1.QueryConnectionChannelsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * list of channels associated with a connection.
   * </pre>
   *
   * <code>repeated .ibc.core.channel.v1.IdentifiedChannel channels = 1 [json_name = "channels"];</code>
   */
  java.util.List<com.ibc.core.channel.v1.IdentifiedChannel> 
      getChannelsList();
  /**
   * <pre>
   * list of channels associated with a connection.
   * </pre>
   *
   * <code>repeated .ibc.core.channel.v1.IdentifiedChannel channels = 1 [json_name = "channels"];</code>
   */
  com.ibc.core.channel.v1.IdentifiedChannel getChannels(int index);
  /**
   * <pre>
   * list of channels associated with a connection.
   * </pre>
   *
   * <code>repeated .ibc.core.channel.v1.IdentifiedChannel channels = 1 [json_name = "channels"];</code>
   */
  int getChannelsCount();
  /**
   * <pre>
   * list of channels associated with a connection.
   * </pre>
   *
   * <code>repeated .ibc.core.channel.v1.IdentifiedChannel channels = 1 [json_name = "channels"];</code>
   */
  java.util.List<? extends com.ibc.core.channel.v1.IdentifiedChannelOrBuilder> 
      getChannelsOrBuilderList();
  /**
   * <pre>
   * list of channels associated with a connection.
   * </pre>
   *
   * <code>repeated .ibc.core.channel.v1.IdentifiedChannel channels = 1 [json_name = "channels"];</code>
   */
  com.ibc.core.channel.v1.IdentifiedChannelOrBuilder getChannelsOrBuilder(
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