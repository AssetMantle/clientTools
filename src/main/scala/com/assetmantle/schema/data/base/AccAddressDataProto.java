// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data/base/acc_address_data.proto

package com.assetmantle.schema.data.base;

public final class AccAddressDataProto {
  private AccAddressDataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_schema_data_base_AccAddressData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_schema_data_base_AccAddressData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n data/base/acc_address_data.proto\022\034asse" +
      "tmantle.schema.data.base\032\024gogoproto/gogo" +
      ".proto\",\n\016AccAddressData\022\024\n\005value\030\001 \001(\014R" +
      "\005value:\004\210\240\037\000B\367\001\n com.assetmantle.schema." +
      "data.baseB\023AccAddressDataProtoP\001Z*github" +
      ".com/AssetMantle/schema/go/data/base\242\002\004A" +
      "SDB\252\002\034Assetmantle.Schema.Data.Base\312\002\034Ass" +
      "etmantle\\Schema\\Data\\Base\342\002(Assetmantle\\" +
      "Schema\\Data\\Base\\GPBMetadata\352\002\037Assetmant" +
      "le::Schema::Data::Baseb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_assetmantle_schema_data_base_AccAddressData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_schema_data_base_AccAddressData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_schema_data_base_AccAddressData_descriptor,
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
