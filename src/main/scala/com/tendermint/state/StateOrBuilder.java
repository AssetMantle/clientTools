// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/state/types.proto

package com.tendermint.state;

public interface StateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tendermint.state.State)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tendermint.state.Version version = 1 [json_name = "version", (.gogoproto.nullable) = false];</code>
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   * <code>.tendermint.state.Version version = 1 [json_name = "version", (.gogoproto.nullable) = false];</code>
   * @return The version.
   */
  com.tendermint.state.Version getVersion();
  /**
   * <code>.tendermint.state.Version version = 1 [json_name = "version", (.gogoproto.nullable) = false];</code>
   */
  com.tendermint.state.VersionOrBuilder getVersionOrBuilder();

  /**
   * <pre>
   * immutable
   * </pre>
   *
   * <code>string chain_id = 2 [json_name = "chainId", (.gogoproto.customname) = "ChainID"];</code>
   * @return The chainId.
   */
  java.lang.String getChainId();
  /**
   * <pre>
   * immutable
   * </pre>
   *
   * <code>string chain_id = 2 [json_name = "chainId", (.gogoproto.customname) = "ChainID"];</code>
   * @return The bytes for chainId.
   */
  com.google.protobuf.ByteString
      getChainIdBytes();

  /**
   * <code>int64 initial_height = 14 [json_name = "initialHeight"];</code>
   * @return The initialHeight.
   */
  long getInitialHeight();

  /**
   * <pre>
   * LastBlockHeight=0 at genesis (ie. block(H=0) does not exist)
   * </pre>
   *
   * <code>int64 last_block_height = 3 [json_name = "lastBlockHeight"];</code>
   * @return The lastBlockHeight.
   */
  long getLastBlockHeight();

  /**
   * <code>.tendermint.types.BlockID last_block_id = 4 [json_name = "lastBlockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "LastBlockID"];</code>
   * @return Whether the lastBlockId field is set.
   */
  boolean hasLastBlockId();
  /**
   * <code>.tendermint.types.BlockID last_block_id = 4 [json_name = "lastBlockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "LastBlockID"];</code>
   * @return The lastBlockId.
   */
  com.tendermint.types.BlockID getLastBlockId();
  /**
   * <code>.tendermint.types.BlockID last_block_id = 4 [json_name = "lastBlockId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "LastBlockID"];</code>
   */
  com.tendermint.types.BlockIDOrBuilder getLastBlockIdOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp last_block_time = 5 [json_name = "lastBlockTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the lastBlockTime field is set.
   */
  boolean hasLastBlockTime();
  /**
   * <code>.google.protobuf.Timestamp last_block_time = 5 [json_name = "lastBlockTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The lastBlockTime.
   */
  com.google.protobuf.Timestamp getLastBlockTime();
  /**
   * <code>.google.protobuf.Timestamp last_block_time = 5 [json_name = "lastBlockTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastBlockTimeOrBuilder();

  /**
   * <pre>
   * LastValidators is used to validate block.LastCommit.
   * Validators are persisted to the database separately every time they change,
   * so we can query for historical validator sets.
   * Note that if s.LastBlockHeight causes a valset change,
   * we set s.LastHeightValidatorsChanged = s.LastBlockHeight + 1 + 1
   * Extra +1 due to nextValSet delay.
   * </pre>
   *
   * <code>.tendermint.types.ValidatorSet next_validators = 6 [json_name = "nextValidators"];</code>
   * @return Whether the nextValidators field is set.
   */
  boolean hasNextValidators();
  /**
   * <pre>
   * LastValidators is used to validate block.LastCommit.
   * Validators are persisted to the database separately every time they change,
   * so we can query for historical validator sets.
   * Note that if s.LastBlockHeight causes a valset change,
   * we set s.LastHeightValidatorsChanged = s.LastBlockHeight + 1 + 1
   * Extra +1 due to nextValSet delay.
   * </pre>
   *
   * <code>.tendermint.types.ValidatorSet next_validators = 6 [json_name = "nextValidators"];</code>
   * @return The nextValidators.
   */
  com.tendermint.types.ValidatorSet getNextValidators();
  /**
   * <pre>
   * LastValidators is used to validate block.LastCommit.
   * Validators are persisted to the database separately every time they change,
   * so we can query for historical validator sets.
   * Note that if s.LastBlockHeight causes a valset change,
   * we set s.LastHeightValidatorsChanged = s.LastBlockHeight + 1 + 1
   * Extra +1 due to nextValSet delay.
   * </pre>
   *
   * <code>.tendermint.types.ValidatorSet next_validators = 6 [json_name = "nextValidators"];</code>
   */
  com.tendermint.types.ValidatorSetOrBuilder getNextValidatorsOrBuilder();

  /**
   * <code>.tendermint.types.ValidatorSet validators = 7 [json_name = "validators"];</code>
   * @return Whether the validators field is set.
   */
  boolean hasValidators();
  /**
   * <code>.tendermint.types.ValidatorSet validators = 7 [json_name = "validators"];</code>
   * @return The validators.
   */
  com.tendermint.types.ValidatorSet getValidators();
  /**
   * <code>.tendermint.types.ValidatorSet validators = 7 [json_name = "validators"];</code>
   */
  com.tendermint.types.ValidatorSetOrBuilder getValidatorsOrBuilder();

  /**
   * <code>.tendermint.types.ValidatorSet last_validators = 8 [json_name = "lastValidators"];</code>
   * @return Whether the lastValidators field is set.
   */
  boolean hasLastValidators();
  /**
   * <code>.tendermint.types.ValidatorSet last_validators = 8 [json_name = "lastValidators"];</code>
   * @return The lastValidators.
   */
  com.tendermint.types.ValidatorSet getLastValidators();
  /**
   * <code>.tendermint.types.ValidatorSet last_validators = 8 [json_name = "lastValidators"];</code>
   */
  com.tendermint.types.ValidatorSetOrBuilder getLastValidatorsOrBuilder();

  /**
   * <code>int64 last_height_validators_changed = 9 [json_name = "lastHeightValidatorsChanged"];</code>
   * @return The lastHeightValidatorsChanged.
   */
  long getLastHeightValidatorsChanged();

  /**
   * <pre>
   * Consensus parameters used for validating blocks.
   * Changes returned by EndBlock and updated after Commit.
   * </pre>
   *
   * <code>.tendermint.types.ConsensusParams consensus_params = 10 [json_name = "consensusParams", (.gogoproto.nullable) = false];</code>
   * @return Whether the consensusParams field is set.
   */
  boolean hasConsensusParams();
  /**
   * <pre>
   * Consensus parameters used for validating blocks.
   * Changes returned by EndBlock and updated after Commit.
   * </pre>
   *
   * <code>.tendermint.types.ConsensusParams consensus_params = 10 [json_name = "consensusParams", (.gogoproto.nullable) = false];</code>
   * @return The consensusParams.
   */
  com.tendermint.types.ConsensusParams getConsensusParams();
  /**
   * <pre>
   * Consensus parameters used for validating blocks.
   * Changes returned by EndBlock and updated after Commit.
   * </pre>
   *
   * <code>.tendermint.types.ConsensusParams consensus_params = 10 [json_name = "consensusParams", (.gogoproto.nullable) = false];</code>
   */
  com.tendermint.types.ConsensusParamsOrBuilder getConsensusParamsOrBuilder();

  /**
   * <code>int64 last_height_consensus_params_changed = 11 [json_name = "lastHeightConsensusParamsChanged"];</code>
   * @return The lastHeightConsensusParamsChanged.
   */
  long getLastHeightConsensusParamsChanged();

  /**
   * <pre>
   * Merkle root of the results from executing prev block
   * </pre>
   *
   * <code>bytes last_results_hash = 12 [json_name = "lastResultsHash"];</code>
   * @return The lastResultsHash.
   */
  com.google.protobuf.ByteString getLastResultsHash();

  /**
   * <pre>
   * the latest AppHash we've received from calling abci.Commit()
   * </pre>
   *
   * <code>bytes app_hash = 13 [json_name = "appHash"];</code>
   * @return The appHash.
   */
  com.google.protobuf.ByteString getAppHash();
}
