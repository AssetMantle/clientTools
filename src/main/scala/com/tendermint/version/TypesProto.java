// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/version/types.proto

package com.tendermint.version;

public final class TypesProto {
  private TypesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tendermint_version_App_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tendermint_version_App_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tendermint_version_Consensus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tendermint_version_Consensus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036tendermint/version/types.proto\022\022tender" +
      "mint.version\032\024gogoproto/gogo.proto\"=\n\003Ap" +
      "p\022\032\n\010protocol\030\001 \001(\004R\010protocol\022\032\n\010softwar" +
      "e\030\002 \001(\tR\010software\"9\n\tConsensus\022\024\n\005block\030" +
      "\001 \001(\004R\005block\022\020\n\003app\030\002 \001(\004R\003app:\004\350\240\037\001B\310\001\n" +
      "\026com.tendermint.versionB\nTypesProtoP\001Z9g" +
      "ithub.com/tendermint/tendermint/proto/te" +
      "ndermint/version\242\002\003TVX\252\002\022Tendermint.Vers" +
      "ion\312\002\022Tendermint\\Version\342\002\036Tendermint\\Ve" +
      "rsion\\GPBMetadata\352\002\023Tendermint::Versionb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_tendermint_version_App_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tendermint_version_App_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tendermint_version_App_descriptor,
        new java.lang.String[] { "Protocol", "Software", });
    internal_static_tendermint_version_Consensus_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tendermint_version_Consensus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tendermint_version_Consensus_descriptor,
        new java.lang.String[] { "Block", "App", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.equal);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
