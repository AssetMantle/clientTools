// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/authz/v1beta1/event.proto

package com.cosmos.authz.v1beta1;

public interface EventRevokeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.authz.v1beta1.EventRevoke)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Msg type URL for which an autorization is revoked
   * </pre>
   *
   * <code>string msg_type_url = 2 [json_name = "msgTypeUrl"];</code>
   * @return The msgTypeUrl.
   */
  java.lang.String getMsgTypeUrl();
  /**
   * <pre>
   * Msg type URL for which an autorization is revoked
   * </pre>
   *
   * <code>string msg_type_url = 2 [json_name = "msgTypeUrl"];</code>
   * @return The bytes for msgTypeUrl.
   */
  com.google.protobuf.ByteString
      getMsgTypeUrlBytes();

  /**
   * <pre>
   * Granter account address
   * </pre>
   *
   * <code>string granter = 3 [json_name = "granter"];</code>
   * @return The granter.
   */
  java.lang.String getGranter();
  /**
   * <pre>
   * Granter account address
   * </pre>
   *
   * <code>string granter = 3 [json_name = "granter"];</code>
   * @return The bytes for granter.
   */
  com.google.protobuf.ByteString
      getGranterBytes();

  /**
   * <pre>
   * Grantee account address
   * </pre>
   *
   * <code>string grantee = 4 [json_name = "grantee"];</code>
   * @return The grantee.
   */
  java.lang.String getGrantee();
  /**
   * <pre>
   * Grantee account address
   * </pre>
   *
   * <code>string grantee = 4 [json_name = "grantee"];</code>
   * @return The bytes for grantee.
   */
  com.google.protobuf.ByteString
      getGranteeBytes();
}
