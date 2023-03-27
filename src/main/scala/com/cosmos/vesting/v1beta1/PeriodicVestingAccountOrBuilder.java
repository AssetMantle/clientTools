// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/vesting/v1beta1/vesting.proto

package com.cosmos.vesting.v1beta1;

public interface PeriodicVestingAccountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.vesting.v1beta1.PeriodicVestingAccount)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmos.vesting.v1beta1.BaseVestingAccount base_vesting_account = 1 [json_name = "baseVestingAccount", (.gogoproto.embed) = true];</code>
   * @return Whether the baseVestingAccount field is set.
   */
  boolean hasBaseVestingAccount();
  /**
   * <code>.cosmos.vesting.v1beta1.BaseVestingAccount base_vesting_account = 1 [json_name = "baseVestingAccount", (.gogoproto.embed) = true];</code>
   * @return The baseVestingAccount.
   */
  BaseVestingAccount getBaseVestingAccount();
  /**
   * <code>.cosmos.vesting.v1beta1.BaseVestingAccount base_vesting_account = 1 [json_name = "baseVestingAccount", (.gogoproto.embed) = true];</code>
   */
  BaseVestingAccountOrBuilder getBaseVestingAccountOrBuilder();

  /**
   * <code>int64 start_time = 2 [json_name = "startTime", (.gogoproto.moretags) = "yaml:&#92;"start_time&#92;""];</code>
   * @return The startTime.
   */
  long getStartTime();

  /**
   * <code>repeated .cosmos.vesting.v1beta1.Period vesting_periods = 3 [json_name = "vestingPeriods", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"vesting_periods&#92;""];</code>
   */
  java.util.List<Period>
      getVestingPeriodsList();
  /**
   * <code>repeated .cosmos.vesting.v1beta1.Period vesting_periods = 3 [json_name = "vestingPeriods", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"vesting_periods&#92;""];</code>
   */
  Period getVestingPeriods(int index);
  /**
   * <code>repeated .cosmos.vesting.v1beta1.Period vesting_periods = 3 [json_name = "vestingPeriods", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"vesting_periods&#92;""];</code>
   */
  int getVestingPeriodsCount();
  /**
   * <code>repeated .cosmos.vesting.v1beta1.Period vesting_periods = 3 [json_name = "vestingPeriods", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"vesting_periods&#92;""];</code>
   */
  java.util.List<? extends PeriodOrBuilder>
      getVestingPeriodsOrBuilderList();
  /**
   * <code>repeated .cosmos.vesting.v1beta1.Period vesting_periods = 3 [json_name = "vestingPeriods", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"vesting_periods&#92;""];</code>
   */
  PeriodOrBuilder getVestingPeriodsOrBuilder(
      int index);
}
