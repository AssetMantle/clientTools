// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/identities/internal/transactions/issue/service.v1.proto

package com.identities.transactions.issue;

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
    String[] descriptorData = {
      "\n?modules/identities/internal/transactio" +
      "ns/issue/service.v1.proto\022\035identities.tr" +
      "ansactions.issue\032\034google/api/annotations" +
      ".proto\032?modules/identities/internal/tran" +
      "sactions/issue/message.v1.proto\032Kmodules" +
      "/identities/internal/transactions/issue/" +
      "transactionResponse.v1.proto2\222\001\n\007Service" +
      "\022\206\001\n\006Handle\022&.identities.transactions.is" +
      "sue.Message\0322.identities.transactions.is" +
      "sue.TransactionResponse\" \202\323\344\223\002\032\"\030/mantle" +
      "/identities/issueB\230\002\n!com.identities.tra" +
      "nsactions.issueB\016ServiceV1ProtoP\001ZMgithu" +
      "b.com/AssetMantle/modules/modules/identi" +
      "ties/internal/transactions/issue\242\002\003ITI\252\002" +
      "\035Identities.Transactions.Issue\312\002\035Identit" +
      "ies\\Transactions\\Issue\342\002)Identities\\Tran" +
      "sactions\\Issue\\GPBMetadata\352\002\037Identities:" +
      ":Transactions::Issueb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          MessageV1Proto.getDescriptor(),
          TransactionResponseV1Proto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    MessageV1Proto.getDescriptor();
    TransactionResponseV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
