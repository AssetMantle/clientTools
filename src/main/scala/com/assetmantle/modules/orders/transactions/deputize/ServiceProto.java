// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: orders/transactions/deputize/service.proto

package com.assetmantle.modules.orders.transactions.deputize;

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
      "\n*orders/transactions/deputize/service.p" +
      "roto\0220assetmantle.modules.orders.transac" +
      "tions.deputize\032\034google/api/annotations.p" +
      "roto\032*orders/transactions/deputize/messa" +
      "ge.proto\0327orders/transactions/deputize/t" +
      "ransaction_response.proto2\267\001\n\007Service\022\253\001" +
      "\n\006Handle\0229.assetmantle.modules.orders.tr" +
      "ansactions.deputize.Message\032E.assetmantl" +
      "e.modules.orders.transactions.deputize.T" +
      "ransactionResponse\"\037\202\323\344\223\002\031\"\027/mantle/orde" +
      "rs/deputizeB\351\002\n4com.assetmantle.modules." +
      "orders.transactions.deputizeB\014ServicePro" +
      "toP\001Z=github.com/AssetMantle/modules/x/o" +
      "rders/transactions/deputize\242\002\005AMOTD\252\0020As" +
      "setmantle.Modules.Orders.Transactions.De" +
      "putize\312\0020Assetmantle\\Modules\\Orders\\Tran" +
      "sactions\\Deputize\342\002<Assetmantle\\Modules\\" +
      "Orders\\Transactions\\Deputize\\GPBMetadata" +
      "\352\0024Assetmantle::Modules::Orders::Transac" +
      "tions::Deputizeb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.assetmantle.modules.orders.transactions.deputize.MessageProto.getDescriptor(),
          com.assetmantle.modules.orders.transactions.deputize.TransactionResponseProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.assetmantle.modules.orders.transactions.deputize.MessageProto.getDescriptor();
    com.assetmantle.modules.orders.transactions.deputize.TransactionResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}