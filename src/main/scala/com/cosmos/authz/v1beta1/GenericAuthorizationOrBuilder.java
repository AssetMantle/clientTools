// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/authz/v1beta1/authz.proto

package com.cosmos.authz.v1beta1;

public interface GenericAuthorizationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.authz.v1beta1.GenericAuthorization)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Msg, identified by it's type URL, to grant unrestricted permissions to execute
   * </pre>
   *
   * <code>string msg = 1 [json_name = "msg"];</code>
   * @return The msg.
   */
  String getMsg();
  /**
   * <pre>
   * Msg, identified by it's type URL, to grant unrestricted permissions to execute
   * </pre>
   *
   * <code>string msg = 1 [json_name = "msg"];</code>
   * @return The bytes for msg.
   */
  com.google.protobuf.ByteString
      getMsgBytes();
}
