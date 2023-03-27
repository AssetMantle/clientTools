// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/orders/internal/queries/order/queryResponse.v1.proto

package com.orders.queries.order;

public interface QueryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:orders.queries.order.QueryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool success = 1 [json_name = "success"];</code>
   * @return The success.
   */
  boolean getSuccess();

  /**
   * <code>string error = 2 [json_name = "error"];</code>
   * @return The error.
   */
  String getError();
  /**
   * <code>string error = 2 [json_name = "error"];</code>
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString
      getErrorBytes();

  /**
   * <code>repeated .orders.Mappable list = 3 [json_name = "list"];</code>
   */
  java.util.List<com.orders.Mappable> 
      getListList();
  /**
   * <code>repeated .orders.Mappable list = 3 [json_name = "list"];</code>
   */
  com.orders.Mappable getList(int index);
  /**
   * <code>repeated .orders.Mappable list = 3 [json_name = "list"];</code>
   */
  int getListCount();
  /**
   * <code>repeated .orders.Mappable list = 3 [json_name = "list"];</code>
   */
  java.util.List<? extends com.orders.MappableOrBuilder> 
      getListOrBuilderList();
  /**
   * <code>repeated .orders.Mappable list = 3 [json_name = "list"];</code>
   */
  com.orders.MappableOrBuilder getListOrBuilder(
      int index);
}
