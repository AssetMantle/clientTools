// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/identities/internal/queries/identity/queryResponse.v1.proto

package com.identities.queries.identity;

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
    internal_static_identities_queries_identity_QueryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identities_queries_identity_QueryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCmodules/identities/internal/queries/id" +
      "entity/queryResponse.v1.proto\022\033identitie" +
      "s.queries.identity\032\024gogoproto/gogo.proto" +
      "\0326modules/identities/internal/mappable/m" +
      "appable.v1.proto\"o\n\rQueryResponse\022\030\n\007suc" +
      "cess\030\001 \001(\010R\007success\022\024\n\005error\030\002 \001(\tR\005erro" +
      "r\022(\n\004list\030\003 \003(\0132\024.identities.MappableR\004l" +
      "ist:\004\210\240\037\000B\222\002\n\037com.identities.queries.ide" +
      "ntityB\024QueryResponseV1ProtoP\001ZKgithub.co" +
      "m/AssetMantle/modules/modules/identities" +
      "/internal/queries/identity\242\002\003IQI\252\002\033Ident" +
      "ities.Queries.Identity\312\002\033Identities\\Quer" +
      "ies\\Identity\342\002\'Identities\\Queries\\Identi" +
      "ty\\GPBMetadata\352\002\035Identities::Queries::Id" +
      "entityb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.identities.MappableV1Proto.getDescriptor(),
        });
    internal_static_identities_queries_identity_QueryResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_identities_queries_identity_QueryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identities_queries_identity_QueryResponse_descriptor,
        new java.lang.String[] { "Success", "Error", "List", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.identities.MappableV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
