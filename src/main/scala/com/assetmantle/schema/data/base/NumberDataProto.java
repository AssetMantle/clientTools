// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data/base/number_data.proto

package com.assetmantle.schema.data.base;

public final class NumberDataProto {
  private NumberDataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_schema_data_base_NumberData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_schema_data_base_NumberData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033data/base/number_data.proto\022\034assetmant" +
      "le.schema.data.base\032\024gogoproto/gogo.prot" +
      "o\"(\n\nNumberData\022\024\n\005value\030\001 \001(\tR\005value:\004\210" +
      "\240\037\000B\363\001\n com.assetmantle.schema.data.base" +
      "B\017NumberDataProtoP\001Z*github.com/AssetMan" +
      "tle/schema/go/data/base\242\002\004ASDB\252\002\034Assetma" +
      "ntle.Schema.Data.Base\312\002\034Assetmantle\\Sche" +
      "ma\\Data\\Base\342\002(Assetmantle\\Schema\\Data\\B" +
      "ase\\GPBMetadata\352\002\037Assetmantle::Schema::D" +
      "ata::Baseb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_assetmantle_schema_data_base_NumberData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_schema_data_base_NumberData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_schema_data_base_NumberData_descriptor,
        new java.lang.String[] { "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
