// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/maintainers/internal/mappable/mappable.v1.proto

package com.maintainers;

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
    internal_static_maintainers_Mappable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_maintainers_Mappable_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7modules/maintainers/internal/mappable/" +
      "mappable.v1.proto\022\013maintainers\032\'schema/d" +
      "ocuments/base/document.v1.proto\"?\n\010Mappa" +
      "ble\0223\n\nmaintainer\030\001 \001(\0132\023.documents.Docu" +
      "mentR\nmaintainerB\264\001\n\017com.maintainersB\017Ma" +
      "ppableV1ProtoP\001ZDgithub.com/AssetMantle/" +
      "modules/modules/maintainers/internal/map" +
      "pable\242\002\003MXX\252\002\013Maintainers\312\002\013Maintainers\342" +
      "\002\027Maintainers\\GPBMetadata\352\002\013Maintainersb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.documents.DocumentV1Proto.getDescriptor(),
        });
    internal_static_maintainers_Mappable_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_maintainers_Mappable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_maintainers_Mappable_descriptor,
        new java.lang.String[] { "Maintainer", });
    com.documents.DocumentV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}