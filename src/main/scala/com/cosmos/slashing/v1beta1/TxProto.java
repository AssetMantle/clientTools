// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/slashing/v1beta1/tx.proto

package com.cosmos.slashing.v1beta1;

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
    internal_static_cosmos_slashing_v1beta1_MsgUnjail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_slashing_v1beta1_MsgUnjail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_slashing_v1beta1_MsgUnjailResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_slashing_v1beta1_MsgUnjailResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n cosmos/slashing/v1beta1/tx.proto\022\027cosm" +
      "os.slashing.v1beta1\032\024gogoproto/gogo.prot" +
      "o\"[\n\tMsgUnjail\022D\n\016validator_addr\030\001 \001(\tB\035" +
      "\352\336\037\007address\362\336\037\016yaml:\"address\"R\rvalidator" +
      "Addr:\010\210\240\037\000\230\240\037\001\"\023\n\021MsgUnjailResponse2_\n\003M" +
      "sg\022X\n\006Unjail\022\".cosmos.slashing.v1beta1.M" +
      "sgUnjail\032*.cosmos.slashing.v1beta1.MsgUn" +
      "jailResponseB\327\001\n\033com.cosmos.slashing.v1b" +
      "eta1B\007TxProtoP\001Z-github.com/cosmos/cosmo" +
      "s-sdk/x/slashing/types\242\002\003CSX\252\002\027Cosmos.Sl" +
      "ashing.V1beta1\312\002\027Cosmos\\Slashing\\V1beta1" +
      "\342\002#Cosmos\\Slashing\\V1beta1\\GPBMetadata\352\002" +
      "\031Cosmos::Slashing::V1beta1\250\342\036\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_cosmos_slashing_v1beta1_MsgUnjail_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_slashing_v1beta1_MsgUnjail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_slashing_v1beta1_MsgUnjail_descriptor,
        new java.lang.String[] { "ValidatorAddr", });
    internal_static_cosmos_slashing_v1beta1_MsgUnjailResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_slashing_v1beta1_MsgUnjailResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_slashing_v1beta1_MsgUnjailResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.equalAll);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.jsontag);
    registry.add(com.gogoproto.GogoProto.moretags);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
