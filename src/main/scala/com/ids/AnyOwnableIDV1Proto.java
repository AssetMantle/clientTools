// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/ids/base/anyOwnableID.v1.proto

package com.ids;

public final class AnyOwnableIDV1Proto {
  private AnyOwnableIDV1Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ids_AnyOwnableID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ids_AnyOwnableID_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n%schema/ids/base/anyOwnableID.v1.proto\022" +
      "\003ids\032\024gogoproto/gogo.proto\032 schema/ids/b" +
      "ase/assetID.v1.proto\032\037schema/ids/base/co" +
      "inID.v1.proto\"q\n\014AnyOwnableID\022*\n\tasset_i" +
      "_d\030\001 \001(\0132\014.ids.AssetIDH\000R\007assetID\022\'\n\010coi" +
      "n_i_d\030\002 \001(\0132\013.ids.CoinIDH\000R\006coinID:\004\210\240\037\000" +
      "B\006\n\004implBz\n\007com.idsB\023AnyOwnableIDV1Proto" +
      "P\001Z.github.com/AssetMantle/modules/schem" +
      "a/ids/base\242\002\003IXX\252\002\003Ids\312\002\003Ids\342\002\017Ids\\GPBMe" +
      "tadata\352\002\003Idsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          AssetIDV1Proto.getDescriptor(),
          CoinIDV1Proto.getDescriptor(),
        });
    internal_static_ids_AnyOwnableID_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ids_AnyOwnableID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ids_AnyOwnableID_descriptor,
        new String[] { "AssetID", "CoinID", "Impl", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    AssetIDV1Proto.getDescriptor();
    CoinIDV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
