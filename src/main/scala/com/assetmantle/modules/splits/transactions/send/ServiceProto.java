// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: splits/transactions/send/service.proto

package com.assetmantle.modules.splits.transactions.send;

public final class ServiceProto {
  private ServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&splits/transactions/send/service.proto" +
      "\022,assetmantle.modules.splits.transaction" +
      "s.send\032\034google/api/annotations.proto\032&sp" +
      "lits/transactions/send/message.proto\0323sp" +
      "lits/transactions/send/transaction_respo" +
      "nse.proto2\253\001\n\007Service\022\237\001\n\006Handle\0225.asset" +
      "mantle.modules.splits.transactions.send." +
      "Message\032A.assetmantle.modules.splits.tra" +
      "nsactions.send.TransactionResponse\"\033\202\323\344\223" +
      "\002\025\"\023/mantle/splits/sendB\321\002\n0com.assetman" +
      "tle.modules.splits.transactions.sendB\014Se" +
      "rviceProtoP\001Z9github.com/AssetMantle/mod" +
      "ules/x/splits/transactions/send\242\002\005AMSTS\252" +
      "\002,Assetmantle.Modules.Splits.Transaction" +
      "s.Send\312\002,Assetmantle\\Modules\\Splits\\Tran" +
      "sactions\\Send\342\0028Assetmantle\\Modules\\Spli" +
      "ts\\Transactions\\Send\\GPBMetadata\352\0020Asset" +
      "mantle::Modules::Splits::Transactions::S" +
      "endb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.assetmantle.modules.splits.transactions.send.MessageProto.getDescriptor(),
          com.assetmantle.modules.splits.transactions.send.TransactionResponseProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.assetmantle.modules.splits.transactions.send.MessageProto.getDescriptor();
    com.assetmantle.modules.splits.transactions.send.TransactionResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}