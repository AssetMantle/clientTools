// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assets/transactions/burn/service.proto

package com.assetmantle.modules.assets.transactions.burn;

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
      "\n&assets/transactions/burn/service.proto" +
      "\022,assetmantle.modules.assets.transaction" +
      "s.burn\032\034google/api/annotations.proto\032&as" +
      "sets/transactions/burn/message.proto\0323as" +
      "sets/transactions/burn/transaction_respo" +
      "nse.proto2\253\001\n\007Service\022\237\001\n\006Handle\0225.asset" +
      "mantle.modules.assets.transactions.burn." +
      "Message\032A.assetmantle.modules.assets.tra" +
      "nsactions.burn.TransactionResponse\"\033\202\323\344\223" +
      "\002\025\"\023/mantle/assets/burnB\321\002\n0com.assetman" +
      "tle.modules.assets.transactions.burnB\014Se" +
      "rviceProtoP\001Z9github.com/AssetMantle/mod" +
      "ules/x/assets/transactions/burn\242\002\005AMATB\252" +
      "\002,Assetmantle.Modules.Assets.Transaction" +
      "s.Burn\312\002,Assetmantle\\Modules\\Assets\\Tran" +
      "sactions\\Burn\342\0028Assetmantle\\Modules\\Asse" +
      "ts\\Transactions\\Burn\\GPBMetadata\352\0020Asset" +
      "mantle::Modules::Assets::Transactions::B" +
      "urnb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.assetmantle.modules.assets.transactions.burn.MessageProto.getDescriptor(),
          com.assetmantle.modules.assets.transactions.burn.TransactionResponseProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.assetmantle.modules.assets.transactions.burn.MessageProto.getDescriptor();
    com.assetmantle.modules.assets.transactions.burn.TransactionResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}