// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/assets/internal/queries/asset/queryRequest.v1.proto

package com.assets.queries.asset;

public final class QueryRequestV1Proto {
  private QueryRequestV1Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assets_queries_asset_QueryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assets_queries_asset_QueryRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;modules/assets/internal/queries/asset/" +
      "queryRequest.v1.proto\022\024assets.queries.as" +
      "set\032 schema/ids/base/assetID.v1.proto\"8\n" +
      "\014QueryRequest\022(\n\tasset_i_d\030\001 \001(\0132\014.ids.A" +
      "ssetIDR\007assetIDB\347\001\n\030com.assets.queries.a" +
      "ssetB\023QueryRequestV1ProtoP\001ZDgithub.com/" +
      "AssetMantle/modules/modules/assets/inter" +
      "nal/queries/asset\242\002\003AQA\252\002\024Assets.Queries" +
      ".Asset\312\002\024Assets\\Queries\\Asset\342\002 Assets\\Q" +
      "ueries\\Asset\\GPBMetadata\352\002\026Assets::Queri" +
      "es::Assetb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.ids.AssetIDV1Proto.getDescriptor(),
        });
    internal_static_assets_queries_asset_QueryRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assets_queries_asset_QueryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assets_queries_asset_QueryRequest_descriptor,
        new java.lang.String[] { "AssetID", });
    com.ids.AssetIDV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
