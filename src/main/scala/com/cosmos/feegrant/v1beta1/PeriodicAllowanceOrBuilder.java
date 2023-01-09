// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/feegrant/v1beta1/feegrant.proto

package com.cosmos.feegrant.v1beta1;

public interface PeriodicAllowanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.feegrant.v1beta1.PeriodicAllowance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * basic specifies a struct of `BasicAllowance`
   * </pre>
   *
   * <code>.cosmos.feegrant.v1beta1.BasicAllowance basic = 1 [json_name = "basic", (.gogoproto.nullable) = false];</code>
   * @return Whether the basic field is set.
   */
  boolean hasBasic();
  /**
   * <pre>
   * basic specifies a struct of `BasicAllowance`
   * </pre>
   *
   * <code>.cosmos.feegrant.v1beta1.BasicAllowance basic = 1 [json_name = "basic", (.gogoproto.nullable) = false];</code>
   * @return The basic.
   */
  com.cosmos.feegrant.v1beta1.BasicAllowance getBasic();
  /**
   * <pre>
   * basic specifies a struct of `BasicAllowance`
   * </pre>
   *
   * <code>.cosmos.feegrant.v1beta1.BasicAllowance basic = 1 [json_name = "basic", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.feegrant.v1beta1.BasicAllowanceOrBuilder getBasicOrBuilder();

  /**
   * <pre>
   * period specifies the time duration in which period_spend_limit coins can
   * be spent before that allowance is reset
   * </pre>
   *
   * <code>.google.protobuf.Duration period = 2 [json_name = "period", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   * @return Whether the period field is set.
   */
  boolean hasPeriod();
  /**
   * <pre>
   * period specifies the time duration in which period_spend_limit coins can
   * be spent before that allowance is reset
   * </pre>
   *
   * <code>.google.protobuf.Duration period = 2 [json_name = "period", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   * @return The period.
   */
  com.google.protobuf.Duration getPeriod();
  /**
   * <pre>
   * period specifies the time duration in which period_spend_limit coins can
   * be spent before that allowance is reset
   * </pre>
   *
   * <code>.google.protobuf.Duration period = 2 [json_name = "period", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   */
  com.google.protobuf.DurationOrBuilder getPeriodOrBuilder();

  /**
   * <pre>
   * period_spend_limit specifies the maximum number of coins that can be spent
   * in the period
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin period_spend_limit = 3 [json_name = "periodSpendLimit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getPeriodSpendLimitList();
  /**
   * <pre>
   * period_spend_limit specifies the maximum number of coins that can be spent
   * in the period
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin period_spend_limit = 3 [json_name = "periodSpendLimit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getPeriodSpendLimit(int index);
  /**
   * <pre>
   * period_spend_limit specifies the maximum number of coins that can be spent
   * in the period
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin period_spend_limit = 3 [json_name = "periodSpendLimit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getPeriodSpendLimitCount();
  /**
   * <pre>
   * period_spend_limit specifies the maximum number of coins that can be spent
   * in the period
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin period_spend_limit = 3 [json_name = "periodSpendLimit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getPeriodSpendLimitOrBuilderList();
  /**
   * <pre>
   * period_spend_limit specifies the maximum number of coins that can be spent
   * in the period
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin period_spend_limit = 3 [json_name = "periodSpendLimit", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getPeriodSpendLimitOrBuilder(
      int index);

  /**
   * <pre>
   * period_can_spend is the number of coins left to be spent before the period_reset time
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin period_can_spend = 4 [json_name = "periodCanSpend", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getPeriodCanSpendList();
  /**
   * <pre>
   * period_can_spend is the number of coins left to be spent before the period_reset time
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin period_can_spend = 4 [json_name = "periodCanSpend", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getPeriodCanSpend(int index);
  /**
   * <pre>
   * period_can_spend is the number of coins left to be spent before the period_reset time
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin period_can_spend = 4 [json_name = "periodCanSpend", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getPeriodCanSpendCount();
  /**
   * <pre>
   * period_can_spend is the number of coins left to be spent before the period_reset time
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin period_can_spend = 4 [json_name = "periodCanSpend", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getPeriodCanSpendOrBuilderList();
  /**
   * <pre>
   * period_can_spend is the number of coins left to be spent before the period_reset time
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin period_can_spend = 4 [json_name = "periodCanSpend", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getPeriodCanSpendOrBuilder(
      int index);

  /**
   * <pre>
   * period_reset is the time at which this period resets and a new one begins,
   * it is calculated from the start time of the first transaction after the
   * last period ended
   * </pre>
   *
   * <code>.google.protobuf.Timestamp period_reset = 5 [json_name = "periodReset", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the periodReset field is set.
   */
  boolean hasPeriodReset();
  /**
   * <pre>
   * period_reset is the time at which this period resets and a new one begins,
   * it is calculated from the start time of the first transaction after the
   * last period ended
   * </pre>
   *
   * <code>.google.protobuf.Timestamp period_reset = 5 [json_name = "periodReset", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The periodReset.
   */
  com.google.protobuf.Timestamp getPeriodReset();
  /**
   * <pre>
   * period_reset is the time at which this period resets and a new one begins,
   * it is calculated from the start time of the first transaction after the
   * last period ended
   * </pre>
   *
   * <code>.google.protobuf.Timestamp period_reset = 5 [json_name = "periodReset", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getPeriodResetOrBuilder();
}