// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identities/queries/identities/query_request.proto

package com.assetmantle.modules.identities.queries.identities;

public final class QueryRequestProto {
  private QueryRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_modules_identities_queries_identities_QueryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_modules_identities_queries_identities_QueryRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1identities/queries/identities/query_re" +
      "quest.proto\0221assetmantle.modules.identit" +
      "ies.queries.identities\032\030identities/key/k" +
      "ey.proto\"_\n\014QueryRequest\0229\n\003key\030\001 \001(\0132\'." +
      "assetmantle.modules.identities.key.KeyR\003" +
      "key\022\024\n\005limit\030\002 \001(\005R\005limitB\364\002\n5com.assetm" +
      "antle.modules.identities.queries.identit" +
      "iesB\021QueryRequestProtoP\001Z>github.com/Ass" +
      "etMantle/modules/x/identities/queries/id" +
      "entities\242\002\005AMIQI\252\0021Assetmantle.Modules.I" +
      "dentities.Queries.Identities\312\0021Assetmant" +
      "le\\Modules\\Identities\\Queries\\Identities" +
      "\342\002=Assetmantle\\Modules\\Identities\\Querie" +
      "s\\Identities\\GPBMetadata\352\0025Assetmantle::" +
      "Modules::Identities::Queries::Identities" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.assetmantle.modules.identities.key.KeyProto.getDescriptor(),
        });
    internal_static_assetmantle_modules_identities_queries_identities_QueryRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_modules_identities_queries_identities_QueryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_modules_identities_queries_identities_QueryRequest_descriptor,
        new java.lang.String[] { "Key", "Limit", });
    com.assetmantle.modules.identities.key.KeyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
