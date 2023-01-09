// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/tx/v1beta1/tx.proto

package com.cosmos.tx.v1beta1;

public interface SignerInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.tx.v1beta1.SignerInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * public_key is the public key of the signer. It is optional for accounts
   * that already exist in state. If unset, the verifier can use the required &#92;
   * signer address for this position and lookup the public key.
   * </pre>
   *
   * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
   * @return Whether the publicKey field is set.
   */
  boolean hasPublicKey();
  /**
   * <pre>
   * public_key is the public key of the signer. It is optional for accounts
   * that already exist in state. If unset, the verifier can use the required &#92;
   * signer address for this position and lookup the public key.
   * </pre>
   *
   * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
   * @return The publicKey.
   */
  com.google.protobuf.Any getPublicKey();
  /**
   * <pre>
   * public_key is the public key of the signer. It is optional for accounts
   * that already exist in state. If unset, the verifier can use the required &#92;
   * signer address for this position and lookup the public key.
   * </pre>
   *
   * <code>.google.protobuf.Any public_key = 1 [json_name = "publicKey"];</code>
   */
  com.google.protobuf.AnyOrBuilder getPublicKeyOrBuilder();

  /**
   * <pre>
   * mode_info describes the signing mode of the signer and is a nested
   * structure to support nested multisig pubkey's
   * </pre>
   *
   * <code>.cosmos.tx.v1beta1.ModeInfo mode_info = 2 [json_name = "modeInfo"];</code>
   * @return Whether the modeInfo field is set.
   */
  boolean hasModeInfo();
  /**
   * <pre>
   * mode_info describes the signing mode of the signer and is a nested
   * structure to support nested multisig pubkey's
   * </pre>
   *
   * <code>.cosmos.tx.v1beta1.ModeInfo mode_info = 2 [json_name = "modeInfo"];</code>
   * @return The modeInfo.
   */
  com.cosmos.tx.v1beta1.ModeInfo getModeInfo();
  /**
   * <pre>
   * mode_info describes the signing mode of the signer and is a nested
   * structure to support nested multisig pubkey's
   * </pre>
   *
   * <code>.cosmos.tx.v1beta1.ModeInfo mode_info = 2 [json_name = "modeInfo"];</code>
   */
  com.cosmos.tx.v1beta1.ModeInfoOrBuilder getModeInfoOrBuilder();

  /**
   * <pre>
   * sequence is the sequence of the account, which describes the
   * number of committed transactions signed by a given address. It is used to
   * prevent replay attacks.
   * </pre>
   *
   * <code>uint64 sequence = 3 [json_name = "sequence"];</code>
   * @return The sequence.
   */
  long getSequence();
}
