// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: maintainers/mappable/mappable.proto

package com.assetmantle.modules.maintainers.mappable;

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
    internal_static_assetmantle_modules_maintainers_mappable_Mappable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_modules_maintainers_mappable_Mappable_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#maintainers/mappable/mappable.proto\022(a" +
      "ssetmantle.modules.maintainers.mappable\032" +
      "\035documents/base/document.proto\"W\n\010Mappab" +
      "le\022K\n\nmaintainer\030\001 \001(\0132+.assetmantle.sch" +
      "ema.documents.base.DocumentR\nmaintainerB" +
      "\270\002\n,com.assetmantle.modules.maintainers." +
      "mappableB\rMappableProtoP\001Z5github.com/As" +
      "setMantle/modules/x/maintainers/mappable" +
      "\242\002\004AMMM\252\002(Assetmantle.Modules.Maintainer" +
      "s.Mappable\312\002(Assetmantle\\Modules\\Maintai" +
      "ners\\Mappable\342\0024Assetmantle\\Modules\\Main" +
      "tainers\\Mappable\\GPBMetadata\352\002+Assetmant" +
      "le::Modules::Maintainers::Mappableb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.assetmantle.schema.documents.base.DocumentProto.getDescriptor(),
        });
    internal_static_assetmantle_modules_maintainers_mappable_Mappable_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_modules_maintainers_mappable_Mappable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_modules_maintainers_mappable_Mappable_descriptor,
        new java.lang.String[] { "Maintainer", });
    com.assetmantle.schema.documents.base.DocumentProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}