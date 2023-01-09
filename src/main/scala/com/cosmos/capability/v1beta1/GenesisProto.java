// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/capability/v1beta1/genesis.proto

package com.cosmos.capability.v1beta1;

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
    internal_static_cosmos_capability_v1beta1_GenesisOwners_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_capability_v1beta1_GenesisOwners_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_capability_v1beta1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_capability_v1beta1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'cosmos/capability/v1beta1/genesis.prot" +
      "o\022\031cosmos.capability.v1beta1\032\024gogoproto/" +
      "gogo.proto\032*cosmos/capability/v1beta1/ca" +
      "pability.proto\"\222\001\n\rGenesisOwners\022\024\n\005inde" +
      "x\030\001 \001(\004R\005index\022k\n\014index_owners\030\002 \001(\0132+.c" +
      "osmos.capability.v1beta1.CapabilityOwner" +
      "sB\033\310\336\037\000\362\336\037\023yaml:\"index_owners\"R\013indexOwn" +
      "ers\"l\n\014GenesisState\022\024\n\005index\030\001 \001(\004R\005inde" +
      "x\022F\n\006owners\030\002 \003(\0132(.cosmos.capability.v1" +
      "beta1.GenesisOwnersB\004\310\336\037\000R\006ownersB\377\001\n\035co" +
      "m.cosmos.capability.v1beta1B\014GenesisProt" +
      "oP\001ZJgithub.com/AssetMantle/modules/cosm" +
      "os/capability/v1beta1;capabilityv1beta1\242" +
      "\002\003CCX\252\002\031Cosmos.Capability.V1beta1\312\002\031Cosm" +
      "os\\Capability\\V1beta1\342\002%Cosmos\\Capabilit" +
      "y\\V1beta1\\GPBMetadata\352\002\033Cosmos::Capabili" +
      "ty::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.capability.v1beta1.CapabilityProto.getDescriptor(),
        });
    internal_static_cosmos_capability_v1beta1_GenesisOwners_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_capability_v1beta1_GenesisOwners_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_capability_v1beta1_GenesisOwners_descriptor,
        new java.lang.String[] { "Index", "IndexOwners", });
    internal_static_cosmos_capability_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_capability_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_capability_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "Index", "Owners", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.capability.v1beta1.CapabilityProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
