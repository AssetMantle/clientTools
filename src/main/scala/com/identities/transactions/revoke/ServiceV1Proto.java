// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/identities/internal/transactions/revoke/service.v1.proto

package com.identities.transactions.revoke;

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
      "\n@modules/identities/internal/transactio" +
      "ns/revoke/service.v1.proto\022\036identities.t" +
      "ransactions.revoke\032\034google/api/annotatio" +
      "ns.proto\032@modules/identities/internal/tr" +
      "ansactions/revoke/message.v1.proto\032Lmodu" +
      "les/identities/internal/transactions/rev" +
      "oke/transactionResponse.v1.proto2\225\001\n\007Ser" +
      "vice\022\211\001\n\006Handle\022\'.identities.transaction" +
      "s.revoke.Message\0323.identities.transactio" +
      "ns.revoke.TransactionResponse\"!\202\323\344\223\002\033\"\031/" +
      "mantle/identities/revokeB\236\002\n\"com.identit" +
      "ies.transactions.revokeB\016ServiceV1ProtoP" +
      "\001ZNgithub.com/AssetMantle/modules/module" +
      "s/identities/internal/transactions/revok" +
      "e\242\002\003ITR\252\002\036Identities.Transactions.Revoke" +
      "\312\002\036Identities\\Transactions\\Revoke\342\002*Iden" +
      "tities\\Transactions\\Revoke\\GPBMetadata\352\002" +
      " Identities::Transactions::Revokeb\006proto" +
      "3"
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
