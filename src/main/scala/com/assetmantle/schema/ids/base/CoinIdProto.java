// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ids/base/coin_id.proto

package com.assetmantle.schema.ids.base;

public final class CoinIdProto {
  private CoinIdProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_schema_ids_base_CoinID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_schema_ids_base_CoinID_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026ids/base/coin_id.proto\022\033assetmantle.sc" +
      "hema.ids.base\032\024gogoproto/gogo.proto\032\030ids" +
      "/base/string_id.proto\"S\n\006CoinID\022C\n\nstrin" +
      "g_i_d\030\001 \001(\0132%.assetmantle.schema.ids.bas" +
      "e.StringIDR\010stringID:\004\210\240\037\000B\351\001\n\037com.asset" +
      "mantle.schema.ids.baseB\013CoinIdProtoP\001Z)g" +
      "ithub.com/AssetMantle/schema/go/ids/base" +
      "\242\002\004ASIB\252\002\033Assetmantle.Schema.Ids.Base\312\002\033" +
      "Assetmantle\\Schema\\Ids\\Base\342\002\'Assetmantl" +
      "e\\Schema\\Ids\\Base\\GPBMetadata\352\002\036Assetman" +
      "tle::Schema::Ids::Baseb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.assetmantle.schema.ids.base.StringIdProto.getDescriptor(),
        });
    internal_static_assetmantle_schema_ids_base_CoinID_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_schema_ids_base_CoinID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_schema_ids_base_CoinID_descriptor,
        new java.lang.String[] { "StringID", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.assetmantle.schema.ids.base.StringIdProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
