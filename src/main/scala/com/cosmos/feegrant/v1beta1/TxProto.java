// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/feegrant/v1beta1/tx.proto

package com.cosmos.feegrant.v1beta1;

public final class TxProto {
  private TxProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_feegrant_v1beta1_MsgGrantAllowance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_feegrant_v1beta1_MsgGrantAllowance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_feegrant_v1beta1_MsgGrantAllowanceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_feegrant_v1beta1_MsgGrantAllowanceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_feegrant_v1beta1_MsgRevokeAllowance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_feegrant_v1beta1_MsgRevokeAllowance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_feegrant_v1beta1_MsgRevokeAllowanceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_feegrant_v1beta1_MsgRevokeAllowanceResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n cosmos/feegrant/v1beta1/tx.proto\022\027cosm" +
      "os.feegrant.v1beta1\032\024gogoproto/gogo.prot" +
      "o\032\031google/protobuf/any.proto\032\031cosmos_pro" +
      "to/cosmos.proto\"\216\001\n\021MsgGrantAllowance\022\030\n" +
      "\007granter\030\001 \001(\tR\007granter\022\030\n\007grantee\030\002 \001(\t" +
      "R\007grantee\022E\n\tallowance\030\003 \001(\0132\024.google.pr" +
      "otobuf.AnyB\021\312\264-\rFeeAllowanceIR\tallowance" +
      "\"\033\n\031MsgGrantAllowanceResponse\"H\n\022MsgRevo" +
      "keAllowance\022\030\n\007granter\030\001 \001(\tR\007granter\022\030\n" +
      "\007grantee\030\002 \001(\tR\007grantee\"\034\n\032MsgRevokeAllo" +
      "wanceResponse2\354\001\n\003Msg\022p\n\016GrantAllowance\022" +
      "*.cosmos.feegrant.v1beta1.MsgGrantAllowa" +
      "nce\0322.cosmos.feegrant.v1beta1.MsgGrantAl" +
      "lowanceResponse\022s\n\017RevokeAllowance\022+.cos" +
      "mos.feegrant.v1beta1.MsgRevokeAllowance\032" +
      "3.cosmos.feegrant.v1beta1.MsgRevokeAllow" +
      "anceResponseB\354\001\n\033com.cosmos.feegrant.v1b" +
      "eta1B\007TxProtoP\001ZFgithub.com/AssetMantle/" +
      "modules/cosmos/feegrant/v1beta1;feegrant" +
      "v1beta1\242\002\003CFX\252\002\027Cosmos.Feegrant.V1beta1\312" +
      "\002\027Cosmos\\Feegrant\\V1beta1\342\002#Cosmos\\Feegr" +
      "ant\\V1beta1\\GPBMetadata\352\002\031Cosmos::Feegra" +
      "nt::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
        });
    internal_static_cosmos_feegrant_v1beta1_MsgGrantAllowance_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_feegrant_v1beta1_MsgGrantAllowance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_feegrant_v1beta1_MsgGrantAllowance_descriptor,
        new java.lang.String[] { "Granter", "Grantee", "Allowance", });
    internal_static_cosmos_feegrant_v1beta1_MsgGrantAllowanceResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_feegrant_v1beta1_MsgGrantAllowanceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_feegrant_v1beta1_MsgGrantAllowanceResponse_descriptor,
        new java.lang.String[] { });
    internal_static_cosmos_feegrant_v1beta1_MsgRevokeAllowance_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_feegrant_v1beta1_MsgRevokeAllowance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_feegrant_v1beta1_MsgRevokeAllowance_descriptor,
        new java.lang.String[] { "Granter", "Grantee", });
    internal_static_cosmos_feegrant_v1beta1_MsgRevokeAllowanceResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cosmos_feegrant_v1beta1_MsgRevokeAllowanceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_feegrant_v1beta1_MsgRevokeAllowanceResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.acceptsInterface);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
