// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/feegrant/v1beta1/genesis.proto

package com.cosmos.feegrant.v1beta1;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.feegrant.v1beta1.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<Grant>
      getAllowancesList();
  /**
   * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false];</code>
   */
  Grant getAllowances(int index);
  /**
   * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false];</code>
   */
  int getAllowancesCount();
  /**
   * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends GrantOrBuilder>
      getAllowancesOrBuilderList();
  /**
   * <code>repeated .cosmos.feegrant.v1beta1.Grant allowances = 1 [json_name = "allowances", (.gogoproto.nullable) = false];</code>
   */
  GrantOrBuilder getAllowancesOrBuilder(
      int index);
}
