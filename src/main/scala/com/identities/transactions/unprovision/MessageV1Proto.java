// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/identities/internal/transactions/unprovision/message.v1.proto

package com.identities.transactions.unprovision;

public final class MessageV1Proto {
  private MessageV1Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_identities_transactions_unprovision_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_identities_transactions_unprovision_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\nEmodules/identities/internal/transactio" +
      "ns/unprovision/message.v1.proto\022#identit" +
      "ies.transactions.unprovision\032#schema/ids" +
      "/base/identityID.v1.proto\"`\n\007Message\022\022\n\004" +
      "from\030\001 \001(\tR\004from\022\016\n\002to\030\002 \001(\tR\002to\0221\n\014iden" +
      "tity_i_d\030\003 \001(\0132\017.ids.IdentityIDR\nidentit" +
      "yIDB\274\002\n\'com.identities.transactions.unpr" +
      "ovisionB\016MessageV1ProtoP\001ZSgithub.com/As" +
      "setMantle/modules/modules/identities/int" +
      "ernal/transactions/unprovision\242\002\003ITU\252\002#I" +
      "dentities.Transactions.Unprovision\312\002#Ide" +
      "ntities\\Transactions\\Unprovision\342\002/Ident" +
      "ities\\Transactions\\Unprovision\\GPBMetada" +
      "ta\352\002%Identities::Transactions::Unprovisi" +
      "onb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.ids.IdentityIDV1Proto.getDescriptor(),
        });
    internal_static_identities_transactions_unprovision_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_identities_transactions_unprovision_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_identities_transactions_unprovision_Message_descriptor,
        new String[] { "From", "To", "IdentityID", });
    com.ids.IdentityIDV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
