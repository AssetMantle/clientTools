// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/v1beta1/authz.proto

package com.cosmos.bank.v1beta1;

public final class AuthzProto {
  private AuthzProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_bank_v1beta1_SendAuthorization_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_bank_v1beta1_SendAuthorization_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037cosmos/bank/v1beta1/authz.proto\022\023cosmo" +
      "s.bank.v1beta1\032\024gogoproto/gogo.proto\032\031co" +
      "smos_proto/cosmos.proto\032\036cosmos/base/v1b" +
      "eta1/coin.proto\"\224\001\n\021SendAuthorization\022l\n" +
      "\013spend_limit\030\001 \003(\0132\031.cosmos.base.v1beta1" +
      ".CoinB0\310\336\037\000\252\337\037(github.com/cosmos/cosmos-" +
      "sdk/types.CoinsR\nspendLimit:\021\322\264-\rAuthori" +
      "zationB\276\001\n\027com.cosmos.bank.v1beta1B\nAuth" +
      "zProtoP\001Z)github.com/cosmos/cosmos-sdk/x" +
      "/bank/types\242\002\003CBX\252\002\023Cosmos.Bank.V1beta1\312" +
      "\002\023Cosmos\\Bank\\V1beta1\342\002\037Cosmos\\Bank\\V1be" +
      "ta1\\GPBMetadata\352\002\025Cosmos::Bank::V1beta1b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
        });
    internal_static_cosmos_bank_v1beta1_SendAuthorization_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_bank_v1beta1_SendAuthorization_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_bank_v1beta1_SendAuthorization_descriptor,
        new java.lang.String[] { "SpendLimit", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.implementsInterface);
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
