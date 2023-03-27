// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/transfer/v1/tx.proto

package com.ibc.applications.transfer.v1;

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
    internal_static_ibc_applications_transfer_v1_MsgTransfer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_transfer_v1_MsgTransfer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_transfer_v1_MsgTransferResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_transfer_v1_MsgTransferResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n%ibc/applications/transfer/v1/tx.proto\022" +
      "\034ibc.applications.transfer.v1\032\024gogoproto" +
      "/gogo.proto\032\036cosmos/base/v1beta1/coin.pr" +
      "oto\032\037ibc/core/client/v1/client.proto\"\252\003\n" +
      "\013MsgTransfer\0227\n\013source_port\030\001 \001(\tB\026\362\336\037\022y" +
      "aml:\"source_port\"R\nsourcePort\022@\n\016source_" +
      "channel\030\002 \001(\tB\031\362\336\037\025yaml:\"source_channel\"" +
      "R\rsourceChannel\0225\n\005token\030\003 \001(\0132\031.cosmos." +
      "base.v1beta1.CoinB\004\310\336\037\000R\005token\022\026\n\006sender" +
      "\030\004 \001(\tR\006sender\022\032\n\010receiver\030\005 \001(\tR\010receiv" +
      "er\022`\n\016timeout_height\030\006 \001(\0132\032.ibc.core.cl" +
      "ient.v1.HeightB\035\310\336\037\000\362\336\037\025yaml:\"timeout_he" +
      "ight\"R\rtimeoutHeight\022I\n\021timeout_timestam" +
      "p\030\007 \001(\004B\034\362\336\037\030yaml:\"timeout_timestamp\"R\020t" +
      "imeoutTimestamp:\010\210\240\037\000\350\240\037\000\"\025\n\023MsgTransfer" +
      "Response2o\n\003Msg\022h\n\010Transfer\022).ibc.applic" +
      "ations.transfer.v1.MsgTransfer\0321.ibc.app" +
      "lications.transfer.v1.MsgTransferRespons" +
      "eB\206\002\n com.ibc.applications.transfer.v1B\007" +
      "TxProtoP\001ZFgithub.com/AssetMantle/module" +
      "s/ibc/applications/transfer/v1;transferv" +
      "1\242\002\003IAT\252\002\034Ibc.Applications.Transfer.V1\312\002" +
      "\034Ibc\\Applications\\Transfer\\V1\342\002(Ibc\\Appl" +
      "ications\\Transfer\\V1\\GPBMetadata\352\002\037Ibc::" +
      "Applications::Transfer::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.ibc.core.client.v1.ClientProto.getDescriptor(),
        });
    internal_static_ibc_applications_transfer_v1_MsgTransfer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ibc_applications_transfer_v1_MsgTransfer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_transfer_v1_MsgTransfer_descriptor,
        new String[] { "SourcePort", "SourceChannel", "Token", "Sender", "Receiver", "TimeoutHeight", "TimeoutTimestamp", });
    internal_static_ibc_applications_transfer_v1_MsgTransferResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ibc_applications_transfer_v1_MsgTransferResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_transfer_v1_MsgTransferResponse_descriptor,
        new String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.ibc.core.client.v1.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
