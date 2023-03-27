// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/tx/v1beta1/tx.proto

package com.cosmos.tx.v1beta1;

public interface ModeInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.tx.v1beta1.ModeInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * single represents a single signer
   * </pre>
   *
   * <code>.cosmos.tx.v1beta1.ModeInfo.Single single = 1 [json_name = "single"];</code>
   * @return Whether the single field is set.
   */
  boolean hasSingle();
  /**
   * <pre>
   * single represents a single signer
   * </pre>
   *
   * <code>.cosmos.tx.v1beta1.ModeInfo.Single single = 1 [json_name = "single"];</code>
   * @return The single.
   */
  ModeInfo.Single getSingle();
  /**
   * <pre>
   * single represents a single signer
   * </pre>
   *
   * <code>.cosmos.tx.v1beta1.ModeInfo.Single single = 1 [json_name = "single"];</code>
   */
  ModeInfo.SingleOrBuilder getSingleOrBuilder();

  /**
   * <pre>
   * multi represents a nested multisig signer
   * </pre>
   *
   * <code>.cosmos.tx.v1beta1.ModeInfo.Multi multi = 2 [json_name = "multi"];</code>
   * @return Whether the multi field is set.
   */
  boolean hasMulti();
  /**
   * <pre>
   * multi represents a nested multisig signer
   * </pre>
   *
   * <code>.cosmos.tx.v1beta1.ModeInfo.Multi multi = 2 [json_name = "multi"];</code>
   * @return The multi.
   */
  ModeInfo.Multi getMulti();
  /**
   * <pre>
   * multi represents a nested multisig signer
   * </pre>
   *
   * <code>.cosmos.tx.v1beta1.ModeInfo.Multi multi = 2 [json_name = "multi"];</code>
   */
  ModeInfo.MultiOrBuilder getMultiOrBuilder();

  ModeInfo.SumCase getSumCase();
}
