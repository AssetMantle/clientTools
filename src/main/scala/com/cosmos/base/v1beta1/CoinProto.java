// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/v1beta1/coin.proto

package com.cosmos.base.v1beta1;

public final class CoinProto {
  private CoinProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_base_v1beta1_Coin_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_base_v1beta1_Coin_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_base_v1beta1_DecCoin_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_base_v1beta1_DecCoin_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_base_v1beta1_IntProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_base_v1beta1_IntProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_base_v1beta1_DecProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_base_v1beta1_DecProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\036cosmos/base/v1beta1/coin.proto\022\023cosmos" +
      ".base.v1beta1\032\024gogoproto/gogo.proto\"G\n\004C" +
      "oin\022\024\n\005denom\030\001 \001(\tR\005denom\022#\n\006amount\030\002 \001(" +
      "\tB\013\310\336\037\000\332\336\037\003IntR\006amount:\004\350\240\037\001\"J\n\007DecCoin\022" +
      "\024\n\005denom\030\001 \001(\tR\005denom\022#\n\006amount\030\002 \001(\tB\013\310" +
      "\336\037\000\332\336\037\003DecR\006amount:\004\350\240\037\001\")\n\010IntProto\022\035\n\003" +
      "int\030\001 \001(\tB\013\310\336\037\000\332\336\037\003IntR\003int\")\n\010DecProto\022" +
      "\035\n\003dec\030\001 \001(\tB\013\310\336\037\000\332\336\037\003DecR\003decB\332\001\n\027com.c" +
      "osmos.base.v1beta1B\tCoinProtoP\001Z>github." +
      "com/AssetMantle/modules/cosmos/base/v1be" +
      "ta1;basev1beta1\242\002\003CBX\252\002\023Cosmos.Base.V1be" +
      "ta1\312\002\023Cosmos\\Base\\V1beta1\342\002\037Cosmos\\Base\\" +
      "V1beta1\\GPBMetadata\352\002\025Cosmos::Base::V1be" +
      "ta1\330\341\036\000\200\342\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_cosmos_base_v1beta1_Coin_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_base_v1beta1_Coin_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_base_v1beta1_Coin_descriptor,
        new String[] { "Denom", "Amount", });
    internal_static_cosmos_base_v1beta1_DecCoin_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_base_v1beta1_DecCoin_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_base_v1beta1_DecCoin_descriptor,
        new String[] { "Denom", "Amount", });
    internal_static_cosmos_base_v1beta1_IntProto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_base_v1beta1_IntProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_base_v1beta1_IntProto_descriptor,
        new String[] { "Int", });
    internal_static_cosmos_base_v1beta1_DecProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cosmos_base_v1beta1_DecProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_base_v1beta1_DecProto_descriptor,
        new String[] { "Dec", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoStringerAll);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stringerAll);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
