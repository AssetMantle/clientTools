// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/maintainers/internal/key/key.v1.proto

package com.maintainers;

public final class KeyV1Proto {
  private KeyV1Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_maintainers_Key_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_maintainers_Key_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-modules/maintainers/internal/key/key.v" +
      "1.proto\022\013maintainers\032%schema/ids/base/ma" +
      "intainerID.v1.proto\">\n\003Key\0227\n\016maintainer" +
      "_i_d\030\001 \001(\0132\021.ids.MaintainerIDR\014maintaine" +
      "rIDB\252\001\n\017com.maintainersB\nKeyV1ProtoP\001Z?g" +
      "ithub.com/AssetMantle/modules/modules/ma" +
      "intainers/internal/key\242\002\003MXX\252\002\013Maintaine" +
      "rs\312\002\013Maintainers\342\002\027Maintainers\\GPBMetada" +
      "ta\352\002\013Maintainersb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.ids.MaintainerIDV1Proto.getDescriptor(),
        });
    internal_static_maintainers_Key_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_maintainers_Key_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_maintainers_Key_descriptor,
        new java.lang.String[] { "MaintainerID", });
    com.ids.MaintainerIDV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
