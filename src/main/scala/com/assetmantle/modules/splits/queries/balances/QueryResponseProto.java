// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: splits/queries/balances/query_response.proto

package com.assetmantle.modules.splits.queries.balances;

public final class QueryResponseProto {
  private QueryResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_modules_splits_queries_balances_QueryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_modules_splits_queries_balances_QueryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,splits/queries/balances/query_response" +
      ".proto\022+assetmantle.modules.splits.queri" +
      "es.balances\032\024gogoproto/gogo.proto\032\032split" +
      "s/record/record.proto\"T\n\rQueryResponse\022=" +
      "\n\004list\030\001 \003(\0132).assetmantle.modules.split" +
      "s.record.RecordR\004list:\004\210\240\037\000B\321\002\n/com.asse" +
      "tmantle.modules.splits.queries.balancesB" +
      "\022QueryResponseProtoP\001Z8github.com/AssetM" +
      "antle/modules/x/splits/queries/balances\242" +
      "\002\005AMSQB\252\002+Assetmantle.Modules.Splits.Que" +
      "ries.Balances\312\002+Assetmantle\\Modules\\Spli" +
      "ts\\Queries\\Balances\342\0027Assetmantle\\Module" +
      "s\\Splits\\Queries\\Balances\\GPBMetadata\352\002/" +
      "Assetmantle::Modules::Splits::Queries::B" +
      "alancesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.assetmantle.modules.splits.record.RecordProto.getDescriptor(),
        });
    internal_static_assetmantle_modules_splits_queries_balances_QueryResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_modules_splits_queries_balances_QueryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_modules_splits_queries_balances_QueryResponse_descriptor,
        new java.lang.String[] { "List", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.assetmantle.modules.splits.record.RecordProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
