// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/properties/base/metaProperty.v1.proto

package com.properties;

public final class MetaPropertyV1Proto {
  private MetaPropertyV1Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_properties_MetaProperty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_properties_MetaProperty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n,schema/properties/base/metaProperty.v1" +
      ".proto\022\nproperties\032\024gogoproto/gogo.proto" +
      "\032!schema/data/base/anyData.v1.proto\032#sch" +
      "ema/ids/base/propertyID.v1.proto\"Y\n\014Meta" +
      "Property\022 \n\003i_d\030\001 \001(\0132\017.ids.PropertyIDR\002" +
      "iD\022!\n\004data\030\002 \001(\0132\r.data.AnyDataR\004data:\004\210" +
      "\240\037\000B\244\001\n\016com.propertiesB\023MetaPropertyV1Pr" +
      "otoP\001Z5github.com/AssetMantle/modules/sc" +
      "hema/properties/base\242\002\003PXX\252\002\nProperties\312" +
      "\002\nProperties\342\002\026Properties\\GPBMetadata\352\002\n" +
      "Propertiesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.data.AnyDataV1Proto.getDescriptor(),
          com.ids.PropertyIDV1Proto.getDescriptor(),
        });
    internal_static_properties_MetaProperty_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_properties_MetaProperty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_properties_MetaProperty_descriptor,
        new String[] { "ID", "Data", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.data.AnyDataV1Proto.getDescriptor();
    com.ids.PropertyIDV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
