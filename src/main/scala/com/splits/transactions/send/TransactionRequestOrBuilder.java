// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/splits/internal/transactions/send/transactionRequest.v1.proto

package com.splits.transactions.send;

public interface TransactionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:splits.transactions.send.TransactionRequest)
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
   * <code>string from_i_d = 2 [json_name = "fromID"];</code>
   * @return The fromID.
   */
  java.lang.String getFromID();
  /**
   * <code>string from_i_d = 2 [json_name = "fromID"];</code>
   * @return The bytes for fromID.
   */
  com.google.protobuf.ByteString
      getFromIDBytes();

  /**
   * <code>string to_i_d = 3 [json_name = "toID"];</code>
   * @return The toID.
   */
  java.lang.String getToID();
  /**
   * <code>string to_i_d = 3 [json_name = "toID"];</code>
   * @return The bytes for toID.
   */
  com.google.protobuf.ByteString
      getToIDBytes();

  /**
   * <code>string ownable_i_d = 4 [json_name = "ownableID"];</code>
   * @return The ownableID.
   */
  java.lang.String getOwnableID();
  /**
   * <code>string ownable_i_d = 4 [json_name = "ownableID"];</code>
   * @return The bytes for ownableID.
   */
  com.google.protobuf.ByteString
      getOwnableIDBytes();

  /**
   * <code>string value = 5 [json_name = "value"];</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <code>string value = 5 [json_name = "value"];</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();
}
