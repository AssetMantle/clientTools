// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ids/base/asset_id.proto

package com.assetmantle.schema.ids.base;

public final class AssetIdProto {
  private AssetIdProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_schema_ids_base_AssetID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_schema_ids_base_AssetID_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ids/base/asset_id.proto\022\033assetmantle.s" +
      "chema.ids.base\032\026ids/base/hash_id.proto\032\024" +
      "gogoproto/gogo.proto\"N\n\007AssetID\022=\n\010hash_" +
      "i_d\030\001 \001(\0132#.assetmantle.schema.ids.base." +
      "HashIDR\006hashID:\004\210\240\037\000B\352\001\n\037com.assetmantle" +
      ".schema.ids.baseB\014AssetIdProtoP\001Z)github" +
      ".com/AssetMantle/schema/go/ids/base\242\002\004AS" +
      "IB\252\002\033Assetmantle.Schema.Ids.Base\312\002\033Asset" +
      "mantle\\Schema\\Ids\\Base\342\002\'Assetmantle\\Sch" +
      "ema\\Ids\\Base\\GPBMetadata\352\002\036Assetmantle::" +
      "Schema::Ids::Baseb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.assetmantle.schema.ids.base.HashIdProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_assetmantle_schema_ids_base_AssetID_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_schema_ids_base_AssetID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_schema_ids_base_AssetID_descriptor,
        new java.lang.String[] { "HashID", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.assetmantle.schema.ids.base.HashIdProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
