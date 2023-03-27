// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/lightclients/tendermint/v1/tendermint.proto

package com.ibc.lightclients.tendermint.v1;

public interface ClientStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.lightclients.tendermint.v1.ClientState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string chain_id = 1 [json_name = "chainId"];</code>
   * @return The chainId.
   */
  String getChainId();
  /**
   * <code>string chain_id = 1 [json_name = "chainId"];</code>
   * @return The bytes for chainId.
   */
  com.google.protobuf.ByteString
      getChainIdBytes();

  /**
   * <code>.ibc.lightclients.tendermint.v1.Fraction trust_level = 2 [json_name = "trustLevel", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"trust_level&#92;""];</code>
   * @return Whether the trustLevel field is set.
   */
  boolean hasTrustLevel();
  /**
   * <code>.ibc.lightclients.tendermint.v1.Fraction trust_level = 2 [json_name = "trustLevel", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"trust_level&#92;""];</code>
   * @return The trustLevel.
   */
  Fraction getTrustLevel();
  /**
   * <code>.ibc.lightclients.tendermint.v1.Fraction trust_level = 2 [json_name = "trustLevel", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"trust_level&#92;""];</code>
   */
  FractionOrBuilder getTrustLevelOrBuilder();

  /**
   * <pre>
   * duration of the period since the LastestTimestamp during which the
   * submitted headers are valid for upgrade
   * </pre>
   *
   * <code>.google.protobuf.Duration trusting_period = 3 [json_name = "trustingPeriod", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"trusting_period&#92;"", (.gogoproto.stdduration) = true];</code>
   * @return Whether the trustingPeriod field is set.
   */
  boolean hasTrustingPeriod();
  /**
   * <pre>
   * duration of the period since the LastestTimestamp during which the
   * submitted headers are valid for upgrade
   * </pre>
   *
   * <code>.google.protobuf.Duration trusting_period = 3 [json_name = "trustingPeriod", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"trusting_period&#92;"", (.gogoproto.stdduration) = true];</code>
   * @return The trustingPeriod.
   */
  com.google.protobuf.Duration getTrustingPeriod();
  /**
   * <pre>
   * duration of the period since the LastestTimestamp during which the
   * submitted headers are valid for upgrade
   * </pre>
   *
   * <code>.google.protobuf.Duration trusting_period = 3 [json_name = "trustingPeriod", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"trusting_period&#92;"", (.gogoproto.stdduration) = true];</code>
   */
  com.google.protobuf.DurationOrBuilder getTrustingPeriodOrBuilder();

  /**
   * <pre>
   * duration of the staking unbonding period
   * </pre>
   *
   * <code>.google.protobuf.Duration unbonding_period = 4 [json_name = "unbondingPeriod", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"unbonding_period&#92;"", (.gogoproto.stdduration) = true];</code>
   * @return Whether the unbondingPeriod field is set.
   */
  boolean hasUnbondingPeriod();
  /**
   * <pre>
   * duration of the staking unbonding period
   * </pre>
   *
   * <code>.google.protobuf.Duration unbonding_period = 4 [json_name = "unbondingPeriod", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"unbonding_period&#92;"", (.gogoproto.stdduration) = true];</code>
   * @return The unbondingPeriod.
   */
  com.google.protobuf.Duration getUnbondingPeriod();
  /**
   * <pre>
   * duration of the staking unbonding period
   * </pre>
   *
   * <code>.google.protobuf.Duration unbonding_period = 4 [json_name = "unbondingPeriod", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"unbonding_period&#92;"", (.gogoproto.stdduration) = true];</code>
   */
  com.google.protobuf.DurationOrBuilder getUnbondingPeriodOrBuilder();

  /**
   * <pre>
   * defines how much new (untrusted) header's Time can drift into the future.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_clock_drift = 5 [json_name = "maxClockDrift", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"max_clock_drift&#92;"", (.gogoproto.stdduration) = true];</code>
   * @return Whether the maxClockDrift field is set.
   */
  boolean hasMaxClockDrift();
  /**
   * <pre>
   * defines how much new (untrusted) header's Time can drift into the future.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_clock_drift = 5 [json_name = "maxClockDrift", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"max_clock_drift&#92;"", (.gogoproto.stdduration) = true];</code>
   * @return The maxClockDrift.
   */
  com.google.protobuf.Duration getMaxClockDrift();
  /**
   * <pre>
   * defines how much new (untrusted) header's Time can drift into the future.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_clock_drift = 5 [json_name = "maxClockDrift", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"max_clock_drift&#92;"", (.gogoproto.stdduration) = true];</code>
   */
  com.google.protobuf.DurationOrBuilder getMaxClockDriftOrBuilder();

  /**
   * <pre>
   * Block height when the client was frozen due to a misbehaviour
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height frozen_height = 6 [json_name = "frozenHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"frozen_height&#92;""];</code>
   * @return Whether the frozenHeight field is set.
   */
  boolean hasFrozenHeight();
  /**
   * <pre>
   * Block height when the client was frozen due to a misbehaviour
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height frozen_height = 6 [json_name = "frozenHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"frozen_height&#92;""];</code>
   * @return The frozenHeight.
   */
  com.ibc.core.client.v1.Height getFrozenHeight();
  /**
   * <pre>
   * Block height when the client was frozen due to a misbehaviour
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height frozen_height = 6 [json_name = "frozenHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"frozen_height&#92;""];</code>
   */
  com.ibc.core.client.v1.HeightOrBuilder getFrozenHeightOrBuilder();

  /**
   * <pre>
   * Latest height the client was updated to
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height latest_height = 7 [json_name = "latestHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"latest_height&#92;""];</code>
   * @return Whether the latestHeight field is set.
   */
  boolean hasLatestHeight();
  /**
   * <pre>
   * Latest height the client was updated to
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height latest_height = 7 [json_name = "latestHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"latest_height&#92;""];</code>
   * @return The latestHeight.
   */
  com.ibc.core.client.v1.Height getLatestHeight();
  /**
   * <pre>
   * Latest height the client was updated to
   * </pre>
   *
   * <code>.ibc.core.client.v1.Height latest_height = 7 [json_name = "latestHeight", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"latest_height&#92;""];</code>
   */
  com.ibc.core.client.v1.HeightOrBuilder getLatestHeightOrBuilder();

  /**
   * <pre>
   * Proof specifications used in verifying counterparty state
   * </pre>
   *
   * <code>repeated .ics23.ProofSpec proof_specs = 8 [json_name = "proofSpecs", (.gogoproto.moretags) = "yaml:&#92;"proof_specs&#92;""];</code>
   */
  java.util.List<com.ics23.ProofSpec> 
      getProofSpecsList();
  /**
   * <pre>
   * Proof specifications used in verifying counterparty state
   * </pre>
   *
   * <code>repeated .ics23.ProofSpec proof_specs = 8 [json_name = "proofSpecs", (.gogoproto.moretags) = "yaml:&#92;"proof_specs&#92;""];</code>
   */
  com.ics23.ProofSpec getProofSpecs(int index);
  /**
   * <pre>
   * Proof specifications used in verifying counterparty state
   * </pre>
   *
   * <code>repeated .ics23.ProofSpec proof_specs = 8 [json_name = "proofSpecs", (.gogoproto.moretags) = "yaml:&#92;"proof_specs&#92;""];</code>
   */
  int getProofSpecsCount();
  /**
   * <pre>
   * Proof specifications used in verifying counterparty state
   * </pre>
   *
   * <code>repeated .ics23.ProofSpec proof_specs = 8 [json_name = "proofSpecs", (.gogoproto.moretags) = "yaml:&#92;"proof_specs&#92;""];</code>
   */
  java.util.List<? extends com.ics23.ProofSpecOrBuilder> 
      getProofSpecsOrBuilderList();
  /**
   * <pre>
   * Proof specifications used in verifying counterparty state
   * </pre>
   *
   * <code>repeated .ics23.ProofSpec proof_specs = 8 [json_name = "proofSpecs", (.gogoproto.moretags) = "yaml:&#92;"proof_specs&#92;""];</code>
   */
  com.ics23.ProofSpecOrBuilder getProofSpecsOrBuilder(
      int index);

  /**
   * <pre>
   * Path at which next upgraded client will be committed.
   * Each element corresponds to the key for a single CommitmentProof in the
   * chained proof. NOTE: ClientState must stored under
   * `{upgradePath}/{upgradeHeight}/clientState` ConsensusState must be stored
   * under `{upgradepath}/{upgradeHeight}/consensusState` For SDK chains using
   * the default upgrade module, upgrade_path should be []string{"upgrade",
   * "upgradedIBCState"}`
   * </pre>
   *
   * <code>repeated string upgrade_path = 9 [json_name = "upgradePath", (.gogoproto.moretags) = "yaml:&#92;"upgrade_path&#92;""];</code>
   * @return A list containing the upgradePath.
   */
  java.util.List<String>
      getUpgradePathList();
  /**
   * <pre>
   * Path at which next upgraded client will be committed.
   * Each element corresponds to the key for a single CommitmentProof in the
   * chained proof. NOTE: ClientState must stored under
   * `{upgradePath}/{upgradeHeight}/clientState` ConsensusState must be stored
   * under `{upgradepath}/{upgradeHeight}/consensusState` For SDK chains using
   * the default upgrade module, upgrade_path should be []string{"upgrade",
   * "upgradedIBCState"}`
   * </pre>
   *
   * <code>repeated string upgrade_path = 9 [json_name = "upgradePath", (.gogoproto.moretags) = "yaml:&#92;"upgrade_path&#92;""];</code>
   * @return The count of upgradePath.
   */
  int getUpgradePathCount();
  /**
   * <pre>
   * Path at which next upgraded client will be committed.
   * Each element corresponds to the key for a single CommitmentProof in the
   * chained proof. NOTE: ClientState must stored under
   * `{upgradePath}/{upgradeHeight}/clientState` ConsensusState must be stored
   * under `{upgradepath}/{upgradeHeight}/consensusState` For SDK chains using
   * the default upgrade module, upgrade_path should be []string{"upgrade",
   * "upgradedIBCState"}`
   * </pre>
   *
   * <code>repeated string upgrade_path = 9 [json_name = "upgradePath", (.gogoproto.moretags) = "yaml:&#92;"upgrade_path&#92;""];</code>
   * @param index The index of the element to return.
   * @return The upgradePath at the given index.
   */
  String getUpgradePath(int index);
  /**
   * <pre>
   * Path at which next upgraded client will be committed.
   * Each element corresponds to the key for a single CommitmentProof in the
   * chained proof. NOTE: ClientState must stored under
   * `{upgradePath}/{upgradeHeight}/clientState` ConsensusState must be stored
   * under `{upgradepath}/{upgradeHeight}/consensusState` For SDK chains using
   * the default upgrade module, upgrade_path should be []string{"upgrade",
   * "upgradedIBCState"}`
   * </pre>
   *
   * <code>repeated string upgrade_path = 9 [json_name = "upgradePath", (.gogoproto.moretags) = "yaml:&#92;"upgrade_path&#92;""];</code>
   * @param index The index of the value to return.
   * @return The bytes of the upgradePath at the given index.
   */
  com.google.protobuf.ByteString
      getUpgradePathBytes(int index);

  /**
   * <pre>
   * allow_update_after_expiry is deprecated
   * </pre>
   *
   * <code>bool allow_update_after_expiry = 10 [json_name = "allowUpdateAfterExpiry", deprecated = true, (.gogoproto.moretags) = "yaml:&#92;"allow_update_after_expiry&#92;""];</code>
   * @deprecated ibc.lightclients.tendermint.v1.ClientState.allow_update_after_expiry is deprecated.
   *     See ibc/lightclients/tendermint/v1/tendermint.proto;l=55
   * @return The allowUpdateAfterExpiry.
   */
  @Deprecated boolean getAllowUpdateAfterExpiry();

  /**
   * <pre>
   * allow_update_after_misbehaviour is deprecated
   * </pre>
   *
   * <code>bool allow_update_after_misbehaviour = 11 [json_name = "allowUpdateAfterMisbehaviour", deprecated = true, (.gogoproto.moretags) = "yaml:&#92;"allow_update_after_misbehaviour&#92;""];</code>
   * @deprecated ibc.lightclients.tendermint.v1.ClientState.allow_update_after_misbehaviour is deprecated.
   *     See ibc/lightclients/tendermint/v1/tendermint.proto;l=57
   * @return The allowUpdateAfterMisbehaviour.
   */
  @Deprecated boolean getAllowUpdateAfterMisbehaviour();
}
