// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/identities/internal/mappable/mappable.v1.proto

package com.identities;

public final class MappableV1Proto {
  private MappableV1Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identities_Mappable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identities_Mappable_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6modules/identities/internal/mappable/m" +
      "appable.v1.proto\022\nidentities\032\'schema/doc" +
      "uments/base/document.v1.proto\";\n\010Mappabl" +
      "e\022/\n\010identity\030\001 \001(\0132\023.documents.Document" +
      "R\010identityB\256\001\n\016com.identitiesB\017MappableV" +
      "1ProtoP\001ZCgithub.com/AssetMantle/modules" +
      "/modules/identities/internal/mappable\242\002\003" +
      "IXX\252\002\nIdentities\312\002\nIdentities\342\002\026Identiti" +
      "es\\GPBMetadata\352\002\nIdentitiesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.documents.DocumentV1Proto.getDescriptor(),
        });
    internal_static_identities_Mappable_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_identities_Mappable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identities_Mappable_descriptor,
        new java.lang.String[] { "Identity", });
    com.documents.DocumentV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}