// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: confio/proofs.proto

package com.ics23;

public interface CompressedNonExistenceProofOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ics23.CompressedNonExistenceProof)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * TODO: remove this as unnecessary??? we prove a range
   * </pre>
   *
   * <code>bytes key = 1 [json_name = "key"];</code>
   * @return The key.
   */
  com.google.protobuf.ByteString getKey();

  /**
   * <code>.ics23.CompressedExistenceProof left = 2 [json_name = "left"];</code>
   * @return Whether the left field is set.
   */
  boolean hasLeft();
  /**
   * <code>.ics23.CompressedExistenceProof left = 2 [json_name = "left"];</code>
   * @return The left.
   */
  com.ics23.CompressedExistenceProof getLeft();
  /**
   * <code>.ics23.CompressedExistenceProof left = 2 [json_name = "left"];</code>
   */
  com.ics23.CompressedExistenceProofOrBuilder getLeftOrBuilder();

  /**
   * <code>.ics23.CompressedExistenceProof right = 3 [json_name = "right"];</code>
   * @return Whether the right field is set.
   */
  boolean hasRight();
  /**
   * <code>.ics23.CompressedExistenceProof right = 3 [json_name = "right"];</code>
   * @return The right.
   */
  com.ics23.CompressedExistenceProof getRight();
  /**
   * <code>.ics23.CompressedExistenceProof right = 3 [json_name = "right"];</code>
   */
  com.ics23.CompressedExistenceProofOrBuilder getRightOrBuilder();
}
