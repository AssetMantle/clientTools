// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/httpBody.proto

package com.google.api;

public interface HttpBodyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.HttpBody)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The HTTP Content-Type header value specifying the content type of the body.
   * </pre>
   *
   * <code>string content_type = 1 [json_name = "contentType"];</code>
   * @return The contentType.
   */
  String getContentType();
  /**
   * <pre>
   * The HTTP Content-Type header value specifying the content type of the body.
   * </pre>
   *
   * <code>string content_type = 1 [json_name = "contentType"];</code>
   * @return The bytes for contentType.
   */
  com.google.protobuf.ByteString
      getContentTypeBytes();

  /**
   * <pre>
   * The HTTP request/response body as raw binary.
   * </pre>
   *
   * <code>bytes data = 2 [json_name = "data"];</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();

  /**
   * <pre>
   * Application specific response metadata. Must be set in the first response
   * for streaming APIs.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extensions = 3 [json_name = "extensions"];</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getExtensionsList();
  /**
   * <pre>
   * Application specific response metadata. Must be set in the first response
   * for streaming APIs.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extensions = 3 [json_name = "extensions"];</code>
   */
  com.google.protobuf.Any getExtensions(int index);
  /**
   * <pre>
   * Application specific response metadata. Must be set in the first response
   * for streaming APIs.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extensions = 3 [json_name = "extensions"];</code>
   */
  int getExtensionsCount();
  /**
   * <pre>
   * Application specific response metadata. Must be set in the first response
   * for streaming APIs.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extensions = 3 [json_name = "extensions"];</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getExtensionsOrBuilderList();
  /**
   * <pre>
   * Application specific response metadata. Must be set in the first response
   * for streaming APIs.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extensions = 3 [json_name = "extensions"];</code>
   */
  com.google.protobuf.AnyOrBuilder getExtensionsOrBuilder(
      int index);
}
