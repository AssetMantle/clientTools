// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/orders/internal/transactions/cancel/service.v1.proto

package com.orders.transactions.cancel;

public final class ServiceV1Proto {
  private ServiceV1Proto() {}
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
      "\n<modules/orders/internal/transactions/c" +
      "ancel/service.v1.proto\022\032orders.transacti" +
      "ons.cancel\032\034google/api/annotations.proto" +
      "\032<modules/orders/internal/transactions/c" +
      "ancel/message.v1.proto\032=modules/orders/i" +
      "nternal/transactions/cancel/response.v1." +
      "proto2}\n\007Service\022r\n\006Handle\022#.orders.tran" +
      "sactions.cancel.Message\032$.orders.transac" +
      "tions.cancel.Response\"\035\202\323\344\223\002\027\"\025/mantle/o" +
      "rders/cancelB\206\002\n\036com.orders.transactions" +
      ".cancelB\016ServiceV1ProtoP\001ZJgithub.com/As" +
      "setMantle/modules/modules/orders/interna" +
      "l/transactions/cancel\242\002\003OTC\252\002\032Orders.Tra" +
      "nsactions.Cancel\312\002\032Orders\\Transactions\\C" +
      "ancel\342\002&Orders\\Transactions\\Cancel\\GPBMe" +
      "tadata\352\002\034Orders::Transactions::Cancelb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.orders.transactions.cancel.MessageV1Proto.getDescriptor(),
          com.orders.transactions.cancel.ResponseV1Proto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.orders.transactions.cancel.MessageV1Proto.getDescriptor();
    com.orders.transactions.cancel.ResponseV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}