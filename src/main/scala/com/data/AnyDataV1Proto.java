// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/data/base/anyData.v1.proto

package com.data;

public final class AnyDataV1Proto {
  private AnyDataV1Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_data_AnyData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_data_AnyData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_data_ListData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_data_ListData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_data_AnyDataList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_data_AnyDataList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n!schema/data/base/anyData.v1.proto\022\004dat" +
      "a\032(schema/data/base/accAddressData.v1.pr" +
      "oto\032%schema/data/base/booleanData.v1.pro" +
      "to\032!schema/data/base/decData.v1.proto\032$s" +
      "chema/data/base/heightData.v1.proto\032 sch" +
      "ema/data/base/idData.v1.proto\032$schema/da" +
      "ta/base/stringData.v1.proto\032\024gogoproto/g" +
      "ogo.proto\"\216\003\n\007AnyData\022@\n\020acc_address_dat" +
      "a\030\001 \001(\0132\024.data.AccAddressDataH\000R\016accAddr" +
      "essData\0226\n\014boolean_data\030\002 \001(\0132\021.data.Boo" +
      "leanDataH\000R\013booleanData\022*\n\010dec_data\030\003 \001(" +
      "\0132\r.data.DecDataH\000R\007decData\0223\n\013height_da" +
      "ta\030\004 \001(\0132\020.data.HeightDataH\000R\nheightData" +
      "\022(\n\010i_d_data\030\005 \001(\0132\014.data.IDDataH\000R\006iDDa" +
      "ta\0223\n\013string_data\030\006 \001(\0132\020.data.StringDat" +
      "aH\000R\nstringData\022;\n\tlist_data\030\007 \001(\0132\016.dat" +
      "a.ListDataB\014\332\336\037\010ListDataH\000R\010listData:\004\210\240" +
      "\037\000B\006\n\004impl\"9\n\010ListData\022\'\n\005value\030\001 \001(\0132\021." +
      "data.AnyDataListR\005value:\004\210\240\037\000\"?\n\013AnyData" +
      "List\022*\n\tdata_list\030\001 \003(\0132\r.data.AnyDataR\010" +
      "dataList:\004\210\240\037\000B{\n\010com.dataB\016AnyDataV1Pro" +
      "toP\001Z/github.com/AssetMantle/modules/sch" +
      "ema/data/base\242\002\003DXX\252\002\004Data\312\002\004Data\342\002\020Data" +
      "\\GPBMetadata\352\002\004Datab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          AccAddressDataV1Proto.getDescriptor(),
          BooleanDataV1Proto.getDescriptor(),
          DecDataV1Proto.getDescriptor(),
          HeightDataV1Proto.getDescriptor(),
          IdDataV1Proto.getDescriptor(),
          StringDataV1Proto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_data_AnyData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_data_AnyData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_data_AnyData_descriptor,
        new String[] { "AccAddressData", "BooleanData", "DecData", "HeightData", "IDData", "StringData", "ListData", "Impl", });
    internal_static_data_ListData_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_data_ListData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_data_ListData_descriptor,
        new String[] { "Value", });
    internal_static_data_AnyDataList_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_data_AnyDataList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_data_AnyDataList_descriptor,
        new String[] { "DataList", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    AccAddressDataV1Proto.getDescriptor();
    BooleanDataV1Proto.getDescriptor();
    DecDataV1Proto.getDescriptor();
    HeightDataV1Proto.getDescriptor();
    IdDataV1Proto.getDescriptor();
    StringDataV1Proto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
