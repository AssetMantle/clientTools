// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data/base/list_data.proto

package com.assetmantle.schema.data.base;

public final class ListDataProto {
  private ListDataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_schema_data_base_ListData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_schema_data_base_ListData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031data/base/list_data.proto\022\034assetmantle" +
      ".schema.data.base\032!data/base/any_listabl" +
      "e_data.proto\032\024gogoproto/gogo.proto\"U\n\010Li" +
      "stData\022C\n\005value\030\001 \003(\0132-.assetmantle.sche" +
      "ma.data.base.AnyListableDataR\005value:\004\210\240\037" +
      "\000B\361\001\n com.assetmantle.schema.data.baseB\r" +
      "ListDataProtoP\001Z*github.com/AssetMantle/" +
      "schema/go/data/base\242\002\004ASDB\252\002\034Assetmantle" +
      ".Schema.Data.Base\312\002\034Assetmantle\\Schema\\D" +
      "ata\\Base\342\002(Assetmantle\\Schema\\Data\\Base\\" +
      "GPBMetadata\352\002\037Assetmantle::Schema::Data:" +
      ":Baseb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.assetmantle.schema.data.base.AnyListableDataProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_assetmantle_schema_data_base_ListData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_schema_data_base_ListData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_schema_data_base_ListData_descriptor,
        new java.lang.String[] { "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.assetmantle.schema.data.base.AnyListableDataProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
