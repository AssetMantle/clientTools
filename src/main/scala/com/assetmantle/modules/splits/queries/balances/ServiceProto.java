// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: splits/queries/balances/service.proto

package com.assetmantle.modules.splits.queries.balances;

public final class ServiceProto {
  private ServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%splits/queries/balances/service.proto\022" +
      "+assetmantle.modules.splits.queries.bala" +
      "nces\032\034google/api/annotations.proto\032+spli" +
      "ts/queries/balances/query_request.proto\032" +
      ",splits/queries/balances/query_response." +
      "proto2\262\001\n\005Query\022\250\001\n\006Handle\0229.assetmantle" +
      ".modules.splits.queries.balances.QueryRe" +
      "quest\032:.assetmantle.modules.splits.queri" +
      "es.balances.QueryResponse\"\'\202\323\344\223\002!\022\037/mant" +
      "le/splits/v1beta1/balancesB\313\002\n/com.asset" +
      "mantle.modules.splits.queries.balancesB\014" +
      "ServiceProtoP\001Z8github.com/AssetMantle/m" +
      "odules/x/splits/queries/balances\242\002\005AMSQB" +
      "\252\002+Assetmantle.Modules.Splits.Queries.Ba" +
      "lances\312\002+Assetmantle\\Modules\\Splits\\Quer" +
      "ies\\Balances\342\0027Assetmantle\\Modules\\Split" +
      "s\\Queries\\Balances\\GPBMetadata\352\002/Assetma" +
      "ntle::Modules::Splits::Queries::Balances" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.assetmantle.modules.splits.queries.balances.QueryRequestProto.getDescriptor(),
          com.assetmantle.modules.splits.queries.balances.QueryResponseProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.assetmantle.modules.splits.queries.balances.QueryRequestProto.getDescriptor();
    com.assetmantle.modules.splits.queries.balances.QueryResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}