// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qualified/base/mutables.proto

package com.assetmantle.schema.qualified.base;

public final class MutablesProto {
  private MutablesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_schema_qualified_base_Mutables_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_schema_qualified_base_Mutables_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035qualified/base/mutables.proto\022!assetma" +
      "ntle.schema.qualified.base\032\024gogoproto/go" +
      "go.proto\032\036lists/base/property_list.proto" +
      "\"b\n\010Mutables\022P\n\rproperty_list\030\001 \001(\0132+.as" +
      "setmantle.schema.lists.base.PropertyList" +
      "R\014propertyList:\004\210\240\037\000B\217\002\n%com.assetmantle" +
      ".schema.qualified.baseB\rMutablesProtoP\001Z" +
      "/github.com/AssetMantle/schema/go/qualif" +
      "ied/base\242\002\004ASQB\252\002!Assetmantle.Schema.Qua" +
      "lified.Base\312\002!Assetmantle\\Schema\\Qualifi" +
      "ed\\Base\342\002-Assetmantle\\Schema\\Qualified\\B" +
      "ase\\GPBMetadata\352\002$Assetmantle::Schema::Q" +
      "ualified::Baseb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.assetmantle.schema.lists.base.PropertyListProto.getDescriptor(),
        });
    internal_static_assetmantle_schema_qualified_base_Mutables_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_schema_qualified_base_Mutables_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_schema_qualified_base_Mutables_descriptor,
        new java.lang.String[] { "PropertyList", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.assetmantle.schema.lists.base.PropertyListProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
