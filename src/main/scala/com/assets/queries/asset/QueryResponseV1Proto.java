// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/assets/internal/queries/asset/queryResponse.v1.proto

package com.assets.queries.asset;

public final class QueryResponseV1Proto {
  private QueryResponseV1Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assets_queries_asset_QueryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assets_queries_asset_QueryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n<modules/assets/internal/queries/asset/" +
      "queryResponse.v1.proto\022\024assets.queries.a" +
      "sset\032\024gogoproto/gogo.proto\0322modules/asse" +
      "ts/internal/mappable/mappable.v1.proto\"k" +
      "\n\rQueryResponse\022\030\n\007success\030\001 \001(\010R\007succes" +
      "s\022\024\n\005error\030\002 \001(\tR\005error\022$\n\004list\030\003 \003(\0132\020." +
      "assets.MappableR\004list:\004\210\240\037\000B\350\001\n\030com.asse" +
      "ts.queries.assetB\024QueryResponseV1ProtoP\001" +
      "ZDgithub.com/AssetMantle/modules/modules" +
      "/assets/internal/queries/asset\242\002\003AQA\252\002\024A" +
      "ssets.Queries.Asset\312\002\024Assets\\Queries\\Ass" +
      "et\342\002 Assets\\Queries\\Asset\\GPBMetadata\352\002\026" +
      "Assets::Queries::Assetb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.assets.MappableV1Proto.getDescriptor(),
        });
    internal_static_assets_queries_asset_QueryResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assets_queries_asset_QueryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assets_queries_asset_QueryResponse_descriptor,
        new String[] { "Success", "Error", "List", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.assets.MappableV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
