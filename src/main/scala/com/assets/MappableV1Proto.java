// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/assets/internal/mappable/mappable.v1.proto

package com.assets;

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
    internal_static_assets_Mappable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assets_Mappable_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n2modules/assets/internal/mappable/mappa" +
      "ble.v1.proto\022\006assets\032\'schema/documents/b" +
      "ase/document.v1.proto\"5\n\010Mappable\022)\n\005ass" +
      "et\030\001 \001(\0132\023.documents.DocumentR\005assetB\226\001\n" +
      "\ncom.assetsB\017MappableV1ProtoP\001Z?github.c" +
      "om/AssetMantle/modules/modules/assets/in" +
      "ternal/mappable\242\002\003AXX\252\002\006Assets\312\002\006Assets\342" +
      "\002\022Assets\\GPBMetadata\352\002\006Assetsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.documents.DocumentV1Proto.getDescriptor(),
        });
    internal_static_assets_Mappable_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assets_Mappable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assets_Mappable_descriptor,
        new String[] { "Asset", });
    com.documents.DocumentV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
