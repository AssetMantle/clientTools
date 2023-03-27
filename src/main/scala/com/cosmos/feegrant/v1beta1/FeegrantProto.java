// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/feegrant/v1beta1/feegrant.proto

package com.cosmos.feegrant.v1beta1;

public final class FeegrantProto {
  private FeegrantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_feegrant_v1beta1_BasicAllowance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_feegrant_v1beta1_BasicAllowance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_feegrant_v1beta1_PeriodicAllowance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_feegrant_v1beta1_PeriodicAllowance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_feegrant_v1beta1_AllowedMsgAllowance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_feegrant_v1beta1_AllowedMsgAllowance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_feegrant_v1beta1_Grant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_feegrant_v1beta1_Grant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n&cosmos/feegrant/v1beta1/feegrant.proto" +
      "\022\027cosmos.feegrant.v1beta1\032\024gogoproto/gog" +
      "o.proto\032\031google/protobuf/any.proto\032\031cosm" +
      "os_proto/cosmos.proto\032\036cosmos/base/v1bet" +
      "a1/coin.proto\032\037google/protobuf/timestamp" +
      ".proto\032\036google/protobuf/duration.proto\"\323" +
      "\001\n\016BasicAllowance\022l\n\013spend_limit\030\001 \003(\0132\031" +
      ".cosmos.base.v1beta1.CoinB0\310\336\037\000\252\337\037(githu" +
      "b.com/cosmos/cosmos-sdk/types.CoinsR\nspe" +
      "ndLimit\022@\n\nexpiration\030\002 \001(\0132\032.google.pro" +
      "tobuf.TimestampB\004\220\337\037\001R\nexpiration:\021\322\264-\rF" +
      "eeAllowanceI\"\343\003\n\021PeriodicAllowance\022C\n\005ba" +
      "sic\030\001 \001(\0132\'.cosmos.feegrant.v1beta1.Basi" +
      "cAllowanceB\004\310\336\037\000R\005basic\022;\n\006period\030\002 \001(\0132" +
      "\031.google.protobuf.DurationB\010\310\336\037\000\230\337\037\001R\006pe" +
      "riod\022y\n\022period_spend_limit\030\003 \003(\0132\031.cosmo" +
      "s.base.v1beta1.CoinB0\310\336\037\000\252\337\037(github.com/" +
      "cosmos/cosmos-sdk/types.CoinsR\020periodSpe" +
      "ndLimit\022u\n\020period_can_spend\030\004 \003(\0132\031.cosm" +
      "os.base.v1beta1.CoinB0\310\336\037\000\252\337\037(github.com" +
      "/cosmos/cosmos-sdk/types.CoinsR\016periodCa" +
      "nSpend\022G\n\014period_reset\030\005 \001(\0132\032.google.pr" +
      "otobuf.TimestampB\010\310\336\037\000\220\337\037\001R\013periodReset:" +
      "\021\322\264-\rFeeAllowanceI\"\236\001\n\023AllowedMsgAllowan" +
      "ce\022E\n\tallowance\030\001 \001(\0132\024.google.protobuf." +
      "AnyB\021\312\264-\rFeeAllowanceIR\tallowance\022)\n\020all" +
      "owed_messages\030\002 \003(\tR\017allowedMessages:\025\210\240" +
      "\037\000\322\264-\rFeeAllowanceI\"\202\001\n\005Grant\022\030\n\007granter" +
      "\030\001 \001(\tR\007granter\022\030\n\007grantee\030\002 \001(\tR\007grante" +
      "e\022E\n\tallowance\030\003 \001(\0132\024.google.protobuf.A" +
      "nyB\021\312\264-\rFeeAllowanceIR\tallowanceB\362\001\n\033com" +
      ".cosmos.feegrant.v1beta1B\rFeegrantProtoP" +
      "\001ZFgithub.com/AssetMantle/modules/cosmos" +
      "/feegrant/v1beta1;feegrantv1beta1\242\002\003CFX\252" +
      "\002\027Cosmos.Feegrant.V1beta1\312\002\027Cosmos\\Feegr" +
      "ant\\V1beta1\342\002#Cosmos\\Feegrant\\V1beta1\\GP" +
      "BMetadata\352\002\031Cosmos::Feegrant::V1beta1b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_cosmos_feegrant_v1beta1_BasicAllowance_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_feegrant_v1beta1_BasicAllowance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_feegrant_v1beta1_BasicAllowance_descriptor,
        new String[] { "SpendLimit", "Expiration", });
    internal_static_cosmos_feegrant_v1beta1_PeriodicAllowance_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_feegrant_v1beta1_PeriodicAllowance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_feegrant_v1beta1_PeriodicAllowance_descriptor,
        new String[] { "Basic", "Period", "PeriodSpendLimit", "PeriodCanSpend", "PeriodReset", });
    internal_static_cosmos_feegrant_v1beta1_AllowedMsgAllowance_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_feegrant_v1beta1_AllowedMsgAllowance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_feegrant_v1beta1_AllowedMsgAllowance_descriptor,
        new String[] { "Allowance", "AllowedMessages", });
    internal_static_cosmos_feegrant_v1beta1_Grant_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cosmos_feegrant_v1beta1_Grant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_feegrant_v1beta1_Grant_descriptor,
        new String[] { "Granter", "Grantee", "Allowance", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.acceptsInterface);
    registry.add(com.cosmos_proto.CosmosProto.implementsInterface);
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdduration);
    registry.add(com.gogoproto.GogoProto.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
