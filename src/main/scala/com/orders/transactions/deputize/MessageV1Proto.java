// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/orders/internal/transactions/deputize/message.v1.proto

package com.orders.transactions.deputize;

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
    internal_static_orders_transactions_deputize_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_orders_transactions_deputize_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n>modules/orders/internal/transactions/d" +
      "eputize/message.v1.proto\022\034orders.transac" +
      "tions.deputize\032)schema/ids/base/classifi" +
      "cationID.v1.proto\032#schema/ids/base/ident" +
      "ityID.v1.proto\032\'schema/lists/base/proper" +
      "tyList.v1.proto\"\222\004\n\007Message\022\022\n\004from\030\001 \001(" +
      "\tR\004from\022)\n\010from_i_d\030\002 \001(\0132\017.ids.Identity" +
      "IDR\006fromID\022%\n\006to_i_d\030\003 \001(\0132\017.ids.Identit" +
      "yIDR\004toID\022C\n\022classification_i_d\030\004 \001(\0132\025." +
      "ids.ClassificationIDR\020classificationID\022H" +
      "\n\025maintained_properties\030\005 \001(\0132\023.lists.Pr" +
      "opertyListR\024maintainedProperties\022$\n\016can_" +
      "mint_asset\030\006 \001(\010R\014canMintAsset\022$\n\016can_bu" +
      "rn_asset\030\007 \001(\010R\014canBurnAsset\0220\n\024can_renu" +
      "merate_asset\030\010 \001(\010R\022canRenumerateAsset\022," +
      "\n\022can_add_maintainer\030\t \001(\010R\020canAddMainta" +
      "iner\0222\n\025can_remove_maintainer\030\n \001(\010R\023can" +
      "RemoveMaintainer\0222\n\025can_mutate_maintaine" +
      "r\030\013 \001(\010R\023canMutateMaintainerB\222\002\n com.ord" +
      "ers.transactions.deputizeB\016MessageV1Prot" +
      "oP\001ZLgithub.com/AssetMantle/modules/modu" +
      "les/orders/internal/transactions/deputiz" +
      "e\242\002\003OTD\252\002\034Orders.Transactions.Deputize\312\002" +
      "\034Orders\\Transactions\\Deputize\342\002(Orders\\T" +
      "ransactions\\Deputize\\GPBMetadata\352\002\036Order" +
      "s::Transactions::Deputizeb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.ids.ClassificationIDV1Proto.getDescriptor(),
          com.ids.IdentityIDV1Proto.getDescriptor(),
          com.lists.PropertyListV1Proto.getDescriptor(),
        });
    internal_static_orders_transactions_deputize_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_orders_transactions_deputize_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_orders_transactions_deputize_Message_descriptor,
        new String[] { "From", "FromID", "ToID", "ClassificationID", "MaintainedProperties", "CanMintAsset", "CanBurnAsset", "CanRenumerateAsset", "CanAddMaintainer", "CanRemoveMaintainer", "CanMutateMaintainer", });
    com.ids.ClassificationIDV1Proto.getDescriptor();
    com.ids.IdentityIDV1Proto.getDescriptor();
    com.lists.PropertyListV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
