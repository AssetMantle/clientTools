// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/transfer/v1/transfer.proto

package com.ibc.applications.transfer.v1;

public final class TransferProto {
  private TransferProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_transfer_v1_DenomTrace_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_transfer_v1_DenomTrace_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_transfer_v1_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_transfer_v1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n+ibc/applications/transfer/v1/transfer." +
      "proto\022\034ibc.applications.transfer.v1\032\024gog" +
      "oproto/gogo.proto\"?\n\nDenomTrace\022\022\n\004path\030" +
      "\001 \001(\tR\004path\022\035\n\nbase_denom\030\002 \001(\tR\tbaseDen" +
      "om\"\211\001\n\006Params\022:\n\014send_enabled\030\001 \001(\010B\027\362\336\037" +
      "\023yaml:\"send_enabled\"R\013sendEnabled\022C\n\017rec" +
      "eive_enabled\030\002 \001(\010B\032\362\336\037\026yaml:\"receive_en" +
      "abled\"R\016receiveEnabledB\214\002\n com.ibc.appli" +
      "cations.transfer.v1B\rTransferProtoP\001ZFgi" +
      "thub.com/AssetMantle/modules/ibc/applica" +
      "tions/transfer/v1;transferv1\242\002\003IAT\252\002\034Ibc" +
      ".Applications.Transfer.V1\312\002\034Ibc\\Applicat" +
      "ions\\Transfer\\V1\342\002(Ibc\\Applications\\Tran" +
      "sfer\\V1\\GPBMetadata\352\002\037Ibc::Applications:" +
      ":Transfer::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_ibc_applications_transfer_v1_DenomTrace_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ibc_applications_transfer_v1_DenomTrace_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_transfer_v1_DenomTrace_descriptor,
        new String[] { "Path", "BaseDenom", });
    internal_static_ibc_applications_transfer_v1_Params_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ibc_applications_transfer_v1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_transfer_v1_Params_descriptor,
        new String[] { "SendEnabled", "ReceiveEnabled", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.moretags);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
