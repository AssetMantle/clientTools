// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/authz/v1beta1/tx.proto

package com.cosmos.authz.v1beta1;

public interface MsgRevokeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.authz.v1beta1.MsgRevoke)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string granter = 1 [json_name = "granter"];</code>
   * @return The granter.
   */
  String getGranter();
  /**
   * <code>string granter = 1 [json_name = "granter"];</code>
   * @return The bytes for granter.
   */
  com.google.protobuf.ByteString
      getGranterBytes();

  /**
   * <code>string grantee = 2 [json_name = "grantee"];</code>
   * @return The grantee.
   */
  String getGrantee();
  /**
   * <code>string grantee = 2 [json_name = "grantee"];</code>
   * @return The bytes for grantee.
   */
  com.google.protobuf.ByteString
      getGranteeBytes();

  /**
   * <code>string msg_type_url = 3 [json_name = "msgTypeUrl"];</code>
   * @return The msgTypeUrl.
   */
  String getMsgTypeUrl();
  /**
   * <code>string msg_type_url = 3 [json_name = "msgTypeUrl"];</code>
   * @return The bytes for msgTypeUrl.
   */
  com.google.protobuf.ByteString
      getMsgTypeUrlBytes();
}
