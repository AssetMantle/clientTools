// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/data/base/booleanData.v1.proto

package com.data;

public final class BooleanDataV1Proto {
  private BooleanDataV1Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_data_BooleanData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_data_BooleanData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n%schema/data/base/booleanData.v1.proto\022" +
      "\004data\032\024gogoproto/gogo.proto\")\n\013BooleanDa" +
      "ta\022\024\n\005value\030\001 \001(\010R\005value:\004\210\240\037\000B\177\n\010com.da" +
      "taB\022BooleanDataV1ProtoP\001Z/github.com/Ass" +
      "etMantle/modules/schema/data/base\242\002\003DXX\252" +
      "\002\004Data\312\002\004Data\342\002\020Data\\GPBMetadata\352\002\004Datab" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_data_BooleanData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_data_BooleanData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_data_BooleanData_descriptor,
        new String[] { "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
