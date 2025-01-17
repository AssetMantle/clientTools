// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/genesis.proto

package com.cosmos.staking.v1beta1;

public final class GenesisProto {
  private GenesisProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_staking_v1beta1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_staking_v1beta1_GenesisState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_staking_v1beta1_LastValidatorPower_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_staking_v1beta1_LastValidatorPower_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$cosmos/staking/v1beta1/genesis.proto\022\026" +
      "cosmos.staking.v1beta1\032\024gogoproto/gogo.p" +
      "roto\032$cosmos/staking/v1beta1/staking.pro" +
      "to\"\324\005\n\014GenesisState\022<\n\006params\030\001 \001(\0132\036.co" +
      "smos.staking.v1beta1.ParamsB\004\310\336\037\000R\006param" +
      "s\022s\n\020last_total_power\030\002 \001(\014BI\310\336\037\000\332\336\037&git" +
      "hub.com/cosmos/cosmos-sdk/types.Int\362\336\037\027y" +
      "aml:\"last_total_power\"R\016lastTotalPower\022\204" +
      "\001\n\025last_validator_powers\030\003 \003(\0132*.cosmos." +
      "staking.v1beta1.LastValidatorPowerB$\310\336\037\000" +
      "\362\336\037\034yaml:\"last_validator_powers\"R\023lastVa" +
      "lidatorPowers\022G\n\nvalidators\030\004 \003(\0132!.cosm" +
      "os.staking.v1beta1.ValidatorB\004\310\336\037\000R\nvali" +
      "dators\022J\n\013delegations\030\005 \003(\0132\".cosmos.sta" +
      "king.v1beta1.DelegationB\004\310\336\037\000R\013delegatio" +
      "ns\022\206\001\n\025unbonding_delegations\030\006 \003(\0132+.cos" +
      "mos.staking.v1beta1.UnbondingDelegationB" +
      "$\310\336\037\000\362\336\037\034yaml:\"unbonding_delegations\"R\024u" +
      "nbondingDelegations\022P\n\rredelegations\030\007 \003" +
      "(\0132$.cosmos.staking.v1beta1.Redelegation" +
      "B\004\310\336\037\000R\rredelegations\022\032\n\010exported\030\010 \001(\010R" +
      "\010exported\"N\n\022LastValidatorPower\022\030\n\007addre" +
      "ss\030\001 \001(\tR\007address\022\024\n\005power\030\002 \001(\003R\005power:" +
      "\010\210\240\037\000\350\240\037\000B\322\001\n\032com.cosmos.staking.v1beta1" +
      "B\014GenesisProtoP\001Z,github.com/cosmos/cosm" +
      "os-sdk/x/staking/types\242\002\003CSX\252\002\026Cosmos.St" +
      "aking.V1beta1\312\002\026Cosmos\\Staking\\V1beta1\342\002" +
      "\"Cosmos\\Staking\\V1beta1\\GPBMetadata\352\002\030Co" +
      "smos::Staking::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.staking.v1beta1.StakingProto.getDescriptor(),
        });
    internal_static_cosmos_staking_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_staking_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_staking_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "Params", "LastTotalPower", "LastValidatorPowers", "Validators", "Delegations", "UnbondingDelegations", "Redelegations", "Exported", });
    internal_static_cosmos_staking_v1beta1_LastValidatorPower_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_staking_v1beta1_LastValidatorPower_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_staking_v1beta1_LastValidatorPower_descriptor,
        new java.lang.String[] { "Address", "Power", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.staking.v1beta1.StakingProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
