// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: classifications/mappable/mappable.proto

package com.assetmantle.modules.classifications.mappable;

public final class MappableProto {
  private MappableProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_modules_classifications_mappable_Mappable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_modules_classifications_mappable_Mappable_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'classifications/mappable/mappable.prot" +
      "o\022,assetmantle.modules.classifications.m" +
      "appable\032\035documents/base/document.proto\"_" +
      "\n\010Mappable\022S\n\016classification\030\001 \001(\0132+.ass" +
      "etmantle.schema.documents.base.DocumentR" +
      "\016classificationB\320\002\n0com.assetmantle.modu" +
      "les.classifications.mappableB\rMappablePr" +
      "otoP\001Z9github.com/AssetMantle/modules/x/" +
      "classifications/mappable\242\002\004AMCM\252\002,Assetm" +
      "antle.Modules.Classifications.Mappable\312\002" +
      ",Assetmantle\\Modules\\Classifications\\Map" +
      "pable\342\0028Assetmantle\\Modules\\Classificati" +
      "ons\\Mappable\\GPBMetadata\352\002/Assetmantle::" +
      "Modules::Classifications::Mappableb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.assetmantle.schema.documents.base.DocumentProto.getDescriptor(),
        });
    internal_static_assetmantle_modules_classifications_mappable_Mappable_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_modules_classifications_mappable_Mappable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_modules_classifications_mappable_Mappable_descriptor,
        new java.lang.String[] { "Classification", });
    com.assetmantle.schema.documents.base.DocumentProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
