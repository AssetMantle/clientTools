// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/slashing/v1beta1/genesis.proto

package com.cosmos.slashing.v1beta1;

public interface ValidatorMissedBlocksOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.slashing.v1beta1.ValidatorMissedBlocks)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * address is the validator address.
   * </pre>
   *
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * address is the validator address.
   * </pre>
   *
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * missed_blocks is an array of missed blocks by the validator.
   * </pre>
   *
   * <code>repeated .cosmos.slashing.v1beta1.MissedBlock missed_blocks = 2 [json_name = "missedBlocks", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"missed_blocks&#92;""];</code>
   */
  java.util.List<com.cosmos.slashing.v1beta1.MissedBlock> 
      getMissedBlocksList();
  /**
   * <pre>
   * missed_blocks is an array of missed blocks by the validator.
   * </pre>
   *
   * <code>repeated .cosmos.slashing.v1beta1.MissedBlock missed_blocks = 2 [json_name = "missedBlocks", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"missed_blocks&#92;""];</code>
   */
  com.cosmos.slashing.v1beta1.MissedBlock getMissedBlocks(int index);
  /**
   * <pre>
   * missed_blocks is an array of missed blocks by the validator.
   * </pre>
   *
   * <code>repeated .cosmos.slashing.v1beta1.MissedBlock missed_blocks = 2 [json_name = "missedBlocks", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"missed_blocks&#92;""];</code>
   */
  int getMissedBlocksCount();
  /**
   * <pre>
   * missed_blocks is an array of missed blocks by the validator.
   * </pre>
   *
   * <code>repeated .cosmos.slashing.v1beta1.MissedBlock missed_blocks = 2 [json_name = "missedBlocks", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"missed_blocks&#92;""];</code>
   */
  java.util.List<? extends com.cosmos.slashing.v1beta1.MissedBlockOrBuilder> 
      getMissedBlocksOrBuilderList();
  /**
   * <pre>
   * missed_blocks is an array of missed blocks by the validator.
   * </pre>
   *
   * <code>repeated .cosmos.slashing.v1beta1.MissedBlock missed_blocks = 2 [json_name = "missedBlocks", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"missed_blocks&#92;""];</code>
   */
  com.cosmos.slashing.v1beta1.MissedBlockOrBuilder getMissedBlocksOrBuilder(
      int index);
}
