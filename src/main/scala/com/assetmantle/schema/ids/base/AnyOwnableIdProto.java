// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ids/base/any_ownable_id.proto

package com.assetmantle.schema.ids.base;

public final class AnyOwnableIdProto {
  private AnyOwnableIdProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_schema_ids_base_AnyOwnableID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_schema_ids_base_AnyOwnableID_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035ids/base/any_ownable_id.proto\022\033assetma" +
      "ntle.schema.ids.base\032\024gogoproto/gogo.pro" +
      "to\032\027ids/base/asset_id.proto\032\026ids/base/co" +
      "in_id.proto\"\241\001\n\014AnyOwnableID\022B\n\tasset_i_" +
      "d\030\001 \001(\0132$.assetmantle.schema.ids.base.As" +
      "setIDH\000R\007assetID\022?\n\010coin_i_d\030\002 \001(\0132#.ass" +
      "etmantle.schema.ids.base.CoinIDH\000R\006coinI" +
      "D:\004\210\240\037\000B\006\n\004implB\357\001\n\037com.assetmantle.sche" +
      "ma.ids.baseB\021AnyOwnableIdProtoP\001Z)github" +
      ".com/AssetMantle/schema/go/ids/base\242\002\004AS" +
      "IB\252\002\033Assetmantle.Schema.Ids.Base\312\002\033Asset" +
      "mantle\\Schema\\Ids\\Base\342\002\'Assetmantle\\Sch" +
      "ema\\Ids\\Base\\GPBMetadata\352\002\036Assetmantle::" +
      "Schema::Ids::Baseb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.assetmantle.schema.ids.base.AssetIdProto.getDescriptor(),
          com.assetmantle.schema.ids.base.CoinIdProto.getDescriptor(),
        });
    internal_static_assetmantle_schema_ids_base_AnyOwnableID_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_schema_ids_base_AnyOwnableID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_schema_ids_base_AnyOwnableID_descriptor,
        new java.lang.String[] { "AssetID", "CoinID", "Impl", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.assetmantle.schema.ids.base.AssetIdProto.getDescriptor();
    com.assetmantle.schema.ids.base.CoinIdProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}