// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identities/transactions/quash/service.proto

package com.assetmantle.modules.identities.transactions.quash;

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
      "\n+identities/transactions/quash/service." +
      "proto\0221assetmantle.modules.identities.tr" +
      "ansactions.quash\032\034google/api/annotations" +
      ".proto\032+identities/transactions/quash/me" +
      "ssage.proto\0328identities/transactions/qua" +
      "sh/transaction_response.proto2\266\001\n\003Msg\022\256\001" +
      "\n\006Handle\022:.assetmantle.modules.identitie" +
      "s.transactions.quash.Message\032F.assetmant" +
      "le.modules.identities.transactions.quash" +
      ".TransactionResponse\" \202\323\344\223\002\032\"\030/mantle/id" +
      "entities/quashB\357\002\n5com.assetmantle.modul" +
      "es.identities.transactions.quashB\014Servic" +
      "eProtoP\001Z>github.com/AssetMantle/modules" +
      "/x/identities/transactions/quash\242\002\005AMITQ" +
      "\252\0021Assetmantle.Modules.Identities.Transa" +
      "ctions.Quash\312\0021Assetmantle\\Modules\\Ident" +
      "ities\\Transactions\\Quash\342\002=Assetmantle\\M" +
      "odules\\Identities\\Transactions\\Quash\\GPB" +
      "Metadata\352\0025Assetmantle::Modules::Identit" +
      "ies::Transactions::Quashb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.assetmantle.modules.identities.transactions.quash.MessageProto.getDescriptor(),
          com.assetmantle.modules.identities.transactions.quash.TransactionResponseProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.assetmantle.modules.identities.transactions.quash.MessageProto.getDescriptor();
    com.assetmantle.modules.identities.transactions.quash.TransactionResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
