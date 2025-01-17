// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/crypto/multisig/keys.proto

package com.cosmos.crypto.multisig;

public interface LegacyAminoPubKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.crypto.multisig.LegacyAminoPubKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 threshold = 1 [json_name = "threshold", (.gogoproto.moretags) = "yaml:&#92;"threshold&#92;""];</code>
   * @return The threshold.
   */
  int getThreshold();

  /**
   * <code>repeated .google.protobuf.Any public_keys = 2 [json_name = "publicKeys", (.gogoproto.customname) = "PubKeys", (.gogoproto.moretags) = "yaml:&#92;"pubkeys&#92;""];</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getPublicKeysList();
  /**
   * <code>repeated .google.protobuf.Any public_keys = 2 [json_name = "publicKeys", (.gogoproto.customname) = "PubKeys", (.gogoproto.moretags) = "yaml:&#92;"pubkeys&#92;""];</code>
   */
  com.google.protobuf.Any getPublicKeys(int index);
  /**
   * <code>repeated .google.protobuf.Any public_keys = 2 [json_name = "publicKeys", (.gogoproto.customname) = "PubKeys", (.gogoproto.moretags) = "yaml:&#92;"pubkeys&#92;""];</code>
   */
  int getPublicKeysCount();
  /**
   * <code>repeated .google.protobuf.Any public_keys = 2 [json_name = "publicKeys", (.gogoproto.customname) = "PubKeys", (.gogoproto.moretags) = "yaml:&#92;"pubkeys&#92;""];</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getPublicKeysOrBuilderList();
  /**
   * <code>repeated .google.protobuf.Any public_keys = 2 [json_name = "publicKeys", (.gogoproto.customname) = "PubKeys", (.gogoproto.moretags) = "yaml:&#92;"pubkeys&#92;""];</code>
   */
  com.google.protobuf.AnyOrBuilder getPublicKeysOrBuilder(
      int index);
}
