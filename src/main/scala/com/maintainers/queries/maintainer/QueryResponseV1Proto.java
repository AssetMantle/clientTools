// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/maintainers/internal/queries/maintainer/queryResponse.v1.proto

package com.maintainers.queries.maintainer;

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
    internal_static_maintainers_queries_maintainer_QueryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_maintainers_queries_maintainer_QueryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\nFmodules/maintainers/internal/queries/m" +
      "aintainer/queryResponse.v1.proto\022\036mainta" +
      "iners.queries.maintainer\032\024gogoproto/gogo" +
      ".proto\0327modules/maintainers/internal/map" +
      "pable/mappable.v1.proto\"p\n\rQueryResponse" +
      "\022\030\n\007success\030\001 \001(\010R\007success\022\024\n\005error\030\002 \001(" +
      "\tR\005error\022)\n\004list\030\003 \003(\0132\025.maintainers.Map" +
      "pableR\004list:\004\210\240\037\000B\244\002\n\"com.maintainers.qu" +
      "eries.maintainerB\024QueryResponseV1ProtoP\001" +
      "ZNgithub.com/AssetMantle/modules/modules" +
      "/maintainers/internal/queries/maintainer" +
      "\242\002\003MQM\252\002\036Maintainers.Queries.Maintainer\312" +
      "\002\036Maintainers\\Queries\\Maintainer\342\002*Maint" +
      "ainers\\Queries\\Maintainer\\GPBMetadata\352\002 " +
      "Maintainers::Queries::Maintainerb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.maintainers.MappableV1Proto.getDescriptor(),
        });
    internal_static_maintainers_queries_maintainer_QueryResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_maintainers_queries_maintainer_QueryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_maintainers_queries_maintainer_QueryResponse_descriptor,
        new String[] { "Success", "Error", "List", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.maintainers.MappableV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
