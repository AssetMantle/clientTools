// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/slashing/v1beta1/slashing.proto

package com.cosmos.slashing.v1beta1;

public final class SlashingProto {
  private SlashingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_slashing_v1beta1_ValidatorSigningInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_slashing_v1beta1_ValidatorSigningInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_slashing_v1beta1_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_slashing_v1beta1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n&cosmos/slashing/v1beta1/slashing.proto" +
      "\022\027cosmos.slashing.v1beta1\032\024gogoproto/gog" +
      "o.proto\032\036google/protobuf/duration.proto\032" +
      "\037google/protobuf/timestamp.proto\"\210\003\n\024Val" +
      "idatorSigningInfo\022\030\n\007address\030\001 \001(\tR\007addr" +
      "ess\022:\n\014start_height\030\002 \001(\003B\027\362\336\037\023yaml:\"sta" +
      "rt_height\"R\013startHeight\022:\n\014index_offset\030" +
      "\003 \001(\003B\027\362\336\037\023yaml:\"index_offset\"R\013indexOff" +
      "set\022^\n\014jailed_until\030\004 \001(\0132\032.google.proto" +
      "buf.TimestampB\037\310\336\037\000\362\336\037\023yaml:\"jailed_unti" +
      "l\"\220\337\037\001R\013jailedUntil\022\036\n\ntombstoned\030\005 \001(\010R" +
      "\ntombstoned\022T\n\025missed_blocks_counter\030\006 \001" +
      "(\003B \362\336\037\034yaml:\"missed_blocks_counter\"R\023mi" +
      "ssedBlocksCounter:\010\230\240\037\000\350\240\037\001\"\371\004\n\006Params\022Q" +
      "\n\024signed_blocks_window\030\001 \001(\003B\037\362\336\037\033yaml:\"" +
      "signed_blocks_window\"R\022signedBlocksWindo" +
      "w\022\201\001\n\025min_signed_per_window\030\002 \001(\014BN\310\336\037\000\332" +
      "\336\037&github.com/cosmos/cosmos-sdk/types.De" +
      "c\362\336\037\034yaml:\"min_signed_per_window\"R\022minSi" +
      "gnedPerWindow\022z\n\026downtime_jail_duration\030" +
      "\003 \001(\0132\031.google.protobuf.DurationB)\310\336\037\000\362\336" +
      "\037\035yaml:\"downtime_jail_duration\"\230\337\037\001R\024dow" +
      "ntimeJailDuration\022\220\001\n\032slash_fraction_dou" +
      "ble_sign\030\004 \001(\014BS\310\336\037\000\332\336\037&github.com/cosmo" +
      "s/cosmos-sdk/types.Dec\362\336\037!yaml:\"slash_fr" +
      "action_double_sign\"R\027slashFractionDouble" +
      "Sign\022\210\001\n\027slash_fraction_downtime\030\005 \001(\014BP" +
      "\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/typ" +
      "es.Dec\362\336\037\036yaml:\"slash_fraction_downtime\"" +
      "R\025slashFractionDowntimeB\366\001\n\033com.cosmos.s" +
      "lashing.v1beta1B\rSlashingProtoP\001ZFgithub" +
      ".com/AssetMantle/modules/cosmos/slashing" +
      "/v1beta1;slashingv1beta1\242\002\003CSX\252\002\027Cosmos." +
      "Slashing.V1beta1\312\002\027Cosmos\\Slashing\\V1bet" +
      "a1\342\002#Cosmos\\Slashing\\V1beta1\\GPBMetadata" +
      "\352\002\031Cosmos::Slashing::V1beta1\250\342\036\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_cosmos_slashing_v1beta1_ValidatorSigningInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_slashing_v1beta1_ValidatorSigningInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_slashing_v1beta1_ValidatorSigningInfo_descriptor,
        new String[] { "Address", "StartHeight", "IndexOffset", "JailedUntil", "Tombstoned", "MissedBlocksCounter", });
    internal_static_cosmos_slashing_v1beta1_Params_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_slashing_v1beta1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_slashing_v1beta1_Params_descriptor,
        new String[] { "SignedBlocksWindow", "MinSignedPerWindow", "DowntimeJailDuration", "SlashFractionDoubleSign", "SlashFractionDowntime", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.equalAll);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdduration);
    registry.add(com.gogoproto.GogoProto.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
