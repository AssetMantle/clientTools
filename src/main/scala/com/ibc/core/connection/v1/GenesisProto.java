// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/connection/v1/genesis.proto

package com.ibc.core.connection.v1;

public final class GenesisProto {
  private GenesisProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_connection_v1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_connection_v1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$ibc/core/connection/v1/genesis.proto\022\026" +
      "ibc.core.connection.v1\032\024gogoproto/gogo.p" +
      "roto\032\'ibc/core/connection/v1/connection." +
      "proto\"\213\003\n\014GenesisState\022T\n\013connections\030\001 " +
      "\003(\0132,.ibc.core.connection.v1.IdentifiedC" +
      "onnectionB\004\310\336\037\000R\013connections\022\207\001\n\027client_" +
      "connection_paths\030\002 \003(\0132\'.ibc.core.connec" +
      "tion.v1.ConnectionPathsB&\310\336\037\000\362\336\037\036yaml:\"c" +
      "lient_connection_paths\"R\025clientConnectio" +
      "nPaths\022]\n\030next_connection_sequence\030\003 \001(\004" +
      "B#\362\336\037\037yaml:\"next_connection_sequence\"R\026n" +
      "extConnectionSequence\022<\n\006params\030\004 \001(\0132\036." +
      "ibc.core.connection.v1.ParamsB\004\310\336\037\000R\006par" +
      "amsB\351\001\n\032com.ibc.core.connection.v1B\014Gene" +
      "sisProtoP\001ZBgithub.com/AssetMantle/modul" +
      "es/ibc/core/connection/v1;connectionv1\242\002" +
      "\003ICC\252\002\026Ibc.Core.Connection.V1\312\002\026Ibc\\Core" +
      "\\Connection\\V1\342\002\"Ibc\\Core\\Connection\\V1\\" +
      "GPBMetadata\352\002\031Ibc::Core::Connection::V1b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.ibc.core.connection.v1.ConnectionProto.getDescriptor(),
        });
    internal_static_ibc_core_connection_v1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ibc_core_connection_v1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_connection_v1_GenesisState_descriptor,
        new java.lang.String[] { "Connections", "ClientConnectionPaths", "NextConnectionSequence", "Params", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.ibc.core.connection.v1.ConnectionProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
