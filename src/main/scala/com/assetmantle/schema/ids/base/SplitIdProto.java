// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ids/base/split_id.proto

package com.assetmantle.schema.ids.base;

public final class SplitIdProto {
  private SplitIdProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_schema_ids_base_SplitID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_schema_ids_base_SplitID_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ids/base/split_id.proto\022\033assetmantle.s" +
      "chema.ids.base\032\024gogoproto/gogo.proto\032\027id" +
      "s/base/asset_id.proto\032\032ids/base/identity" +
      "_id.proto\"\226\001\n\007SplitID\022@\n\tasset_i_d\030\001 \001(\013" +
      "2$.assetmantle.schema.ids.base.AssetIDR\007" +
      "assetID\022C\n\towner_i_d\030\002 \001(\0132\'.assetmantle" +
      ".schema.ids.base.IdentityIDR\007ownerID:\004\210\240" +
      "\037\000B\352\001\n\037com.assetmantle.schema.ids.baseB\014" +
      "SplitIdProtoP\001Z)github.com/AssetMantle/s" +
      "chema/go/ids/base\242\002\004ASIB\252\002\033Assetmantle.S" +
      "chema.Ids.Base\312\002\033Assetmantle\\Schema\\Ids\\" +
      "Base\342\002\'Assetmantle\\Schema\\Ids\\Base\\GPBMe" +
      "tadata\352\002\036Assetmantle::Schema::Ids::Baseb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.assetmantle.schema.ids.base.AssetIdProto.getDescriptor(),
          com.assetmantle.schema.ids.base.IdentityIdProto.getDescriptor(),
        });
    internal_static_assetmantle_schema_ids_base_SplitID_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_schema_ids_base_SplitID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_schema_ids_base_SplitID_descriptor,
        new java.lang.String[] { "AssetID", "OwnerID", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.assetmantle.schema.ids.base.AssetIdProto.getDescriptor();
    com.assetmantle.schema.ids.base.IdentityIdProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
