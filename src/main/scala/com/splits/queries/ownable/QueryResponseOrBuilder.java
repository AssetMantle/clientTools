// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/splits/internal/queries/ownable/queryResponse.v1.proto

package com.splits.queries.ownable;

public interface QueryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:splits.queries.ownable.QueryResponse)
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
   * <code>string value = 3 [json_name = "value"];</code>
   * @return The value.
   */
  String getValue();
  /**
   * <code>string value = 3 [json_name = "value"];</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();
}
