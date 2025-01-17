// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/snapshots/v1beta1/snapshot.proto

package com.cosmos.base.snapshots.v1beta1;

public interface MetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.base.snapshots.v1beta1.Metadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * SHA-256 chunk hashes
   * </pre>
   *
   * <code>repeated bytes chunk_hashes = 1 [json_name = "chunkHashes"];</code>
   * @return A list containing the chunkHashes.
   */
  java.util.List<com.google.protobuf.ByteString> getChunkHashesList();
  /**
   * <pre>
   * SHA-256 chunk hashes
   * </pre>
   *
   * <code>repeated bytes chunk_hashes = 1 [json_name = "chunkHashes"];</code>
   * @return The count of chunkHashes.
   */
  int getChunkHashesCount();
  /**
   * <pre>
   * SHA-256 chunk hashes
   * </pre>
   *
   * <code>repeated bytes chunk_hashes = 1 [json_name = "chunkHashes"];</code>
   * @param index The index of the element to return.
   * @return The chunkHashes at the given index.
   */
  com.google.protobuf.ByteString getChunkHashes(int index);
}
