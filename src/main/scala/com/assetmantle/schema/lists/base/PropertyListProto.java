// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lists/base/property_list.proto

package com.assetmantle.schema.lists.base;

public final class PropertyListProto {
  private PropertyListProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_schema_lists_base_PropertyList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_schema_lists_base_PropertyList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036lists/base/property_list.proto\022\035assetm" +
      "antle.schema.lists.base\032\"properties/base" +
      "/any_property.proto\032\024gogoproto/gogo.prot" +
      "o\"l\n\014PropertyList\022V\n\016any_properties\030\001 \003(" +
      "\0132/.assetmantle.schema.properties.base.A" +
      "nyPropertyR\ranyProperties:\004\210\240\037\000B\373\001\n!com." +
      "assetmantle.schema.lists.baseB\021PropertyL" +
      "istProtoP\001Z+github.com/AssetMantle/schem" +
      "a/go/lists/base\242\002\004ASLB\252\002\035Assetmantle.Sch" +
      "ema.Lists.Base\312\002\035Assetmantle\\Schema\\List" +
      "s\\Base\342\002)Assetmantle\\Schema\\Lists\\Base\\G" +
      "PBMetadata\352\002 Assetmantle::Schema::Lists:" +
      ":Baseb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.assetmantle.schema.properties.base.AnyPropertyProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_assetmantle_schema_lists_base_PropertyList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_schema_lists_base_PropertyList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_schema_lists_base_PropertyList_descriptor,
        new java.lang.String[] { "AnyProperties", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.assetmantle.schema.properties.base.AnyPropertyProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
