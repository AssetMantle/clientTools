// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/identities/internal/transactions/revoke/message.v1.proto

package com.identities.transactions.revoke;

public interface MessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:identities.transactions.revoke.Message)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string from = 1 [json_name = "from"];</code>
   * @return The from.
   */
  java.lang.String getFrom();
  /**
   * <code>string from = 1 [json_name = "from"];</code>
   * @return The bytes for from.
   */
  com.google.protobuf.ByteString
      getFromBytes();

  /**
   * <code>.ids.IdentityID from_i_d = 2 [json_name = "fromID"];</code>
   * @return Whether the fromID field is set.
   */
  boolean hasFromID();
  /**
   * <code>.ids.IdentityID from_i_d = 2 [json_name = "fromID"];</code>
   * @return The fromID.
   */
  com.ids.IdentityID getFromID();
  /**
   * <code>.ids.IdentityID from_i_d = 2 [json_name = "fromID"];</code>
   */
  com.ids.IdentityIDOrBuilder getFromIDOrBuilder();

  /**
   * <code>.ids.IdentityID to_i_d = 3 [json_name = "toID"];</code>
   * @return Whether the toID field is set.
   */
  boolean hasToID();
  /**
   * <code>.ids.IdentityID to_i_d = 3 [json_name = "toID"];</code>
   * @return The toID.
   */
  com.ids.IdentityID getToID();
  /**
   * <code>.ids.IdentityID to_i_d = 3 [json_name = "toID"];</code>
   */
  com.ids.IdentityIDOrBuilder getToIDOrBuilder();

  /**
   * <code>.ids.ClassificationID classification_i_d = 4 [json_name = "classificationID"];</code>
   * @return Whether the classificationID field is set.
   */
  boolean hasClassificationID();
  /**
   * <code>.ids.ClassificationID classification_i_d = 4 [json_name = "classificationID"];</code>
   * @return The classificationID.
   */
  com.ids.ClassificationID getClassificationID();
  /**
   * <code>.ids.ClassificationID classification_i_d = 4 [json_name = "classificationID"];</code>
   */
  com.ids.ClassificationIDOrBuilder getClassificationIDOrBuilder();
}
