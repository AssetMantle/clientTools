// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/ids/base/splitID.v1.proto

package com.ids;

public final class SplitIDV1Proto {
  private SplitIDV1Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ids_SplitID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ids_SplitID_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n schema/ids/base/splitID.v1.proto\022\003ids\032" +
      "#schema/ids/base/identityID.v1.proto\032\"sc" +
      "hema/ids/base/ownableID.v1.proto\032\024gogopr" +
      "oto/gogo.proto\"l\n\007SplitID\022+\n\towner_i_d\030\001" +
      " \001(\0132\017.ids.IdentityIDR\007ownerID\022.\n\013ownabl" +
      "e_i_d\030\002 \001(\0132\016.ids.OwnableIDR\townableID:\004" +
      "\210\240\037\000Bu\n\007com.idsB\016SplitIDV1ProtoP\001Z.githu" +
      "b.com/AssetMantle/modules/schema/ids/bas" +
      "e\242\002\003IXX\252\002\003Ids\312\002\003Ids\342\002\017Ids\\GPBMetadata\352\002\003" +
      "Idsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.ids.IdentityIDV1Proto.getDescriptor(),
          com.ids.OwnableIDV1Proto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_ids_SplitID_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ids_SplitID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ids_SplitID_descriptor,
        new java.lang.String[] { "OwnerID", "OwnableID", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.ids.IdentityIDV1Proto.getDescriptor();
    com.ids.OwnableIDV1Proto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
