// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/metas/internal/queries/meta/queryResponse.v1.proto

package com.metas.queries.meta;

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
    internal_static_metas_queries_meta_QueryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_metas_queries_meta_QueryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:modules/metas/internal/queries/meta/qu" +
      "eryResponse.v1.proto\022\022metas.queries.meta" +
      "\032\024gogoproto/gogo.proto\0321modules/metas/in" +
      "ternal/mappable/mappable.v1.proto\"j\n\rQue" +
      "ryResponse\022\030\n\007success\030\001 \001(\010R\007success\022\024\n\005" +
      "error\030\002 \001(\tR\005error\022#\n\004list\030\003 \003(\0132\017.metas" +
      ".MappableR\004list:\004\210\240\037\000B\334\001\n\026com.metas.quer" +
      "ies.metaB\024QueryResponseV1ProtoP\001ZBgithub" +
      ".com/AssetMantle/modules/modules/metas/i" +
      "nternal/queries/meta\242\002\003MQM\252\002\022Metas.Queri" +
      "es.Meta\312\002\022Metas\\Queries\\Meta\342\002\036Metas\\Que" +
      "ries\\Meta\\GPBMetadata\352\002\024Metas::Queries::" +
      "Metab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.metas.MappableV1Proto.getDescriptor(),
        });
    internal_static_metas_queries_meta_QueryResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_metas_queries_meta_QueryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_metas_queries_meta_QueryResponse_descriptor,
        new java.lang.String[] { "Success", "Error", "List", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.metas.MappableV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
