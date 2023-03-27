// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/tx.proto

package com.cosmos.staking.v1beta1;

public final class TxProto {
  private TxProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_staking_v1beta1_MsgCreateValidator_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_staking_v1beta1_MsgCreateValidator_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_staking_v1beta1_MsgCreateValidatorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_staking_v1beta1_MsgCreateValidatorResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_staking_v1beta1_MsgEditValidator_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_staking_v1beta1_MsgEditValidator_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_staking_v1beta1_MsgEditValidatorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_staking_v1beta1_MsgEditValidatorResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_staking_v1beta1_MsgDelegate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_staking_v1beta1_MsgDelegate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_staking_v1beta1_MsgDelegateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_staking_v1beta1_MsgDelegateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_staking_v1beta1_MsgBeginRedelegate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_staking_v1beta1_MsgBeginRedelegate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_staking_v1beta1_MsgBeginRedelegateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_staking_v1beta1_MsgBeginRedelegateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_staking_v1beta1_MsgUndelegate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_staking_v1beta1_MsgUndelegate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_staking_v1beta1_MsgUndelegateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_staking_v1beta1_MsgUndelegateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\037cosmos/staking/v1beta1/tx.proto\022\026cosmo" +
      "s.staking.v1beta1\032\031google/protobuf/any.p" +
      "roto\032\037google/protobuf/timestamp.proto\032\024g" +
      "ogoproto/gogo.proto\032\031cosmos_proto/cosmos" +
      ".proto\032\036cosmos/base/v1beta1/coin.proto\032$" +
      "cosmos/staking/v1beta1/staking.proto\"\315\004\n" +
      "\022MsgCreateValidator\022K\n\013description\030\001 \001(\013" +
      "2#.cosmos.staking.v1beta1.DescriptionB\004\310" +
      "\336\037\000R\013description\022M\n\ncommission\030\002 \001(\0132\'.c" +
      "osmos.staking.v1beta1.CommissionRatesB\004\310" +
      "\336\037\000R\ncommission\022|\n\023min_self_delegation\030\003" +
      " \001(\tBL\310\336\037\000\332\336\037&github.com/cosmos/cosmos-s" +
      "dk/types.Int\362\336\037\032yaml:\"min_self_delegatio" +
      "n\"R\021minSelfDelegation\022I\n\021delegator_addre" +
      "ss\030\004 \001(\tB\034\362\336\037\030yaml:\"delegator_address\"R\020" +
      "delegatorAddress\022I\n\021validator_address\030\005 " +
      "\001(\tB\034\362\336\037\030yaml:\"validator_address\"R\020valid" +
      "atorAddress\022F\n\006pubkey\030\006 \001(\0132\024.google.pro" +
      "tobuf.AnyB\030\312\264-\024cosmos.crypto.PubKeyR\006pub" +
      "key\0225\n\005value\030\007 \001(\0132\031.cosmos.base.v1beta1" +
      ".CoinB\004\310\336\037\000R\005value:\010\210\240\037\000\350\240\037\000\"\034\n\032MsgCreat" +
      "eValidatorResponse\"\223\003\n\020MsgEditValidator\022" +
      "K\n\013description\030\001 \001(\0132#.cosmos.staking.v1" +
      "beta1.DescriptionB\004\310\336\037\000R\013description\022?\n\021" +
      "validator_address\030\002 \001(\tB\022\362\336\037\016yaml:\"addre" +
      "ss\"R\020validatorAddress\022m\n\017commission_rate" +
      "\030\003 \001(\tBD\332\336\037&github.com/cosmos/cosmos-sdk" +
      "/types.Dec\362\336\037\026yaml:\"commission_rate\"R\016co" +
      "mmissionRate\022x\n\023min_self_delegation\030\004 \001(" +
      "\tBH\332\336\037&github.com/cosmos/cosmos-sdk/type" +
      "s.Int\362\336\037\032yaml:\"min_self_delegation\"R\021min" +
      "SelfDelegation:\010\210\240\037\000\350\240\037\000\"\032\n\030MsgEditValid" +
      "atorResponse\"\342\001\n\013MsgDelegate\022I\n\021delegato" +
      "r_address\030\001 \001(\tB\034\362\336\037\030yaml:\"delegator_add" +
      "ress\"R\020delegatorAddress\022I\n\021validator_add" +
      "ress\030\002 \001(\tB\034\362\336\037\030yaml:\"validator_address\"" +
      "R\020validatorAddress\0227\n\006amount\030\003 \001(\0132\031.cos" +
      "mos.base.v1beta1.CoinB\004\310\336\037\000R\006amount:\004\350\240\037" +
      "\000\"\025\n\023MsgDelegateResponse\"\312\002\n\022MsgBeginRed" +
      "elegate\022I\n\021delegator_address\030\001 \001(\tB\034\362\336\037\030" +
      "yaml:\"delegator_address\"R\020delegatorAddre" +
      "ss\022T\n\025validator_src_address\030\002 \001(\tB \362\336\037\034y" +
      "aml:\"validator_src_address\"R\023validatorSr" +
      "cAddress\022T\n\025validator_dst_address\030\003 \001(\tB" +
      " \362\336\037\034yaml:\"validator_dst_address\"R\023valid" +
      "atorDstAddress\0227\n\006amount\030\004 \001(\0132\031.cosmos." +
      "base.v1beta1.CoinB\004\310\336\037\000R\006amount:\004\350\240\037\000\"k\n" +
      "\032MsgBeginRedelegateResponse\022M\n\017completio" +
      "n_time\030\001 \001(\0132\032.google.protobuf.Timestamp" +
      "B\010\310\336\037\000\220\337\037\001R\016completionTime\"\344\001\n\rMsgUndele" +
      "gate\022I\n\021delegator_address\030\001 \001(\tB\034\362\336\037\030yam" +
      "l:\"delegator_address\"R\020delegatorAddress\022" +
      "I\n\021validator_address\030\002 \001(\tB\034\362\336\037\030yaml:\"va" +
      "lidator_address\"R\020validatorAddress\0227\n\006am" +
      "ount\030\003 \001(\0132\031.cosmos.base.v1beta1.CoinB\004\310" +
      "\336\037\000R\006amount:\004\350\240\037\000\"f\n\025MsgUndelegateRespon" +
      "se\022M\n\017completion_time\030\001 \001(\0132\032.google.pro" +
      "tobuf.TimestampB\010\310\336\037\000\220\337\037\001R\016completionTim" +
      "e2\232\004\n\003Msg\022q\n\017CreateValidator\022*.cosmos.st" +
      "aking.v1beta1.MsgCreateValidator\0322.cosmo" +
      "s.staking.v1beta1.MsgCreateValidatorResp" +
      "onse\022k\n\rEditValidator\022(.cosmos.staking.v" +
      "1beta1.MsgEditValidator\0320.cosmos.staking" +
      ".v1beta1.MsgEditValidatorResponse\022\\\n\010Del" +
      "egate\022#.cosmos.staking.v1beta1.MsgDelega" +
      "te\032+.cosmos.staking.v1beta1.MsgDelegateR" +
      "esponse\022q\n\017BeginRedelegate\022*.cosmos.stak" +
      "ing.v1beta1.MsgBeginRedelegate\0322.cosmos." +
      "staking.v1beta1.MsgBeginRedelegateRespon" +
      "se\022b\n\nUndelegate\022%.cosmos.staking.v1beta" +
      "1.MsgUndelegate\032-.cosmos.staking.v1beta1" +
      ".MsgUndelegateResponseB\345\001\n\032com.cosmos.st" +
      "aking.v1beta1B\007TxProtoP\001ZDgithub.com/Ass" +
      "etMantle/modules/cosmos/staking/v1beta1;" +
      "stakingv1beta1\242\002\003CSX\252\002\026Cosmos.Staking.V1" +
      "beta1\312\002\026Cosmos\\Staking\\V1beta1\342\002\"Cosmos\\" +
      "Staking\\V1beta1\\GPBMetadata\352\002\030Cosmos::St" +
      "aking::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          StakingProto.getDescriptor(),
        });
    internal_static_cosmos_staking_v1beta1_MsgCreateValidator_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_staking_v1beta1_MsgCreateValidator_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_staking_v1beta1_MsgCreateValidator_descriptor,
        new String[] { "Description", "Commission", "MinSelfDelegation", "DelegatorAddress", "ValidatorAddress", "Pubkey", "Value", });
    internal_static_cosmos_staking_v1beta1_MsgCreateValidatorResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_staking_v1beta1_MsgCreateValidatorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_staking_v1beta1_MsgCreateValidatorResponse_descriptor,
        new String[] { });
    internal_static_cosmos_staking_v1beta1_MsgEditValidator_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_staking_v1beta1_MsgEditValidator_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_staking_v1beta1_MsgEditValidator_descriptor,
        new String[] { "Description", "ValidatorAddress", "CommissionRate", "MinSelfDelegation", });
    internal_static_cosmos_staking_v1beta1_MsgEditValidatorResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cosmos_staking_v1beta1_MsgEditValidatorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_staking_v1beta1_MsgEditValidatorResponse_descriptor,
        new String[] { });
    internal_static_cosmos_staking_v1beta1_MsgDelegate_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_cosmos_staking_v1beta1_MsgDelegate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_staking_v1beta1_MsgDelegate_descriptor,
        new String[] { "DelegatorAddress", "ValidatorAddress", "Amount", });
    internal_static_cosmos_staking_v1beta1_MsgDelegateResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_cosmos_staking_v1beta1_MsgDelegateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_staking_v1beta1_MsgDelegateResponse_descriptor,
        new String[] { });
    internal_static_cosmos_staking_v1beta1_MsgBeginRedelegate_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_cosmos_staking_v1beta1_MsgBeginRedelegate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_staking_v1beta1_MsgBeginRedelegate_descriptor,
        new String[] { "DelegatorAddress", "ValidatorSrcAddress", "ValidatorDstAddress", "Amount", });
    internal_static_cosmos_staking_v1beta1_MsgBeginRedelegateResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_cosmos_staking_v1beta1_MsgBeginRedelegateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_staking_v1beta1_MsgBeginRedelegateResponse_descriptor,
        new String[] { "CompletionTime", });
    internal_static_cosmos_staking_v1beta1_MsgUndelegate_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_cosmos_staking_v1beta1_MsgUndelegate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_staking_v1beta1_MsgUndelegate_descriptor,
        new String[] { "DelegatorAddress", "ValidatorAddress", "Amount", });
    internal_static_cosmos_staking_v1beta1_MsgUndelegateResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_cosmos_staking_v1beta1_MsgUndelegateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_staking_v1beta1_MsgUndelegateResponse_descriptor,
        new String[] { "CompletionTime", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.acceptsInterface);
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    StakingProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
