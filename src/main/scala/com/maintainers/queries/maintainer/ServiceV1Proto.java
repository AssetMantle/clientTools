// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/maintainers/internal/queries/maintainer/service.v1.proto

package com.maintainers.queries.maintainer;

public final class ServiceV1Proto {
  private ServiceV1Proto() {}
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
    String[] descriptorData = {
      "\n@modules/maintainers/internal/queries/m" +
      "aintainer/service.v1.proto\022\036maintainers." +
      "queries.maintainer\032\034google/api/annotatio" +
      "ns.proto\032Emodules/maintainers/internal/q" +
      "ueries/maintainer/queryRequest.v1.proto\032" +
      "Fmodules/maintainers/internal/queries/ma" +
      "intainer/queryResponse.v1.proto2\241\001\n\007Serv" +
      "ice\022\225\001\n\006Handle\022,.maintainers.queries.mai" +
      "ntainer.QueryRequest\032-.maintainers.queri" +
      "es.maintainer.QueryResponse\".\202\323\344\223\002(\022&/ma" +
      "ntle/maintainers/v1beta1/maintainerB\236\002\n\"" +
      "com.maintainers.queries.maintainerB\016Serv" +
      "iceV1ProtoP\001ZNgithub.com/AssetMantle/mod" +
      "ules/modules/maintainers/internal/querie" +
      "s/maintainer\242\002\003MQM\252\002\036Maintainers.Queries" +
      ".Maintainer\312\002\036Maintainers\\Queries\\Mainta" +
      "iner\342\002*Maintainers\\Queries\\Maintainer\\GP" +
      "BMetadata\352\002 Maintainers::Queries::Mainta" +
      "inerb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          QueryRequestV1Proto.getDescriptor(),
          QueryResponseV1Proto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    QueryRequestV1Proto.getDescriptor();
    QueryResponseV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
