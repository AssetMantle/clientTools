// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identities/transactions/deputize/message.proto

package com.assetmantle.modules.identities.transactions.deputize;

public final class MessageProto {
  private MessageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_modules_identities_transactions_deputize_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_modules_identities_transactions_deputize_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.identities/transactions/deputize/messa" +
      "ge.proto\0224assetmantle.modules.identities" +
      ".transactions.deputize\032 ids/base/classif" +
      "ication_id.proto\032\032ids/base/identity_id.p" +
      "roto\032\036lists/base/property_list.proto\"\362\004\n" +
      "\007Message\022\022\n\004from\030\001 \001(\tR\004from\022A\n\010from_i_d" +
      "\030\002 \001(\0132\'.assetmantle.schema.ids.base.Ide" +
      "ntityIDR\006fromID\022=\n\006to_i_d\030\003 \001(\0132\'.assetm" +
      "antle.schema.ids.base.IdentityIDR\004toID\022[" +
      "\n\022classification_i_d\030\004 \001(\0132-.assetmantle" +
      ".schema.ids.base.ClassificationIDR\020class" +
      "ificationID\022`\n\025maintained_properties\030\005 \001" +
      "(\0132+.assetmantle.schema.lists.base.Prope" +
      "rtyListR\024maintainedProperties\022$\n\016can_min" +
      "t_asset\030\006 \001(\010R\014canMintAsset\022$\n\016can_burn_" +
      "asset\030\007 \001(\010R\014canBurnAsset\0220\n\024can_renumer" +
      "ate_asset\030\010 \001(\010R\022canRenumerateAsset\022,\n\022c" +
      "an_add_maintainer\030\t \001(\010R\020canAddMaintaine" +
      "r\0222\n\025can_remove_maintainer\030\n \001(\010R\023canRem" +
      "oveMaintainer\0222\n\025can_mutate_maintainer\030\013" +
      " \001(\010R\023canMutateMaintainerB\201\003\n8com.assetm" +
      "antle.modules.identities.transactions.de" +
      "putizeB\014MessageProtoP\001ZAgithub.com/Asset" +
      "Mantle/modules/x/identities/transactions" +
      "/deputize\242\002\005AMITD\252\0024Assetmantle.Modules." +
      "Identities.Transactions.Deputize\312\0024Asset" +
      "mantle\\Modules\\Identities\\Transactions\\D" +
      "eputize\342\002@Assetmantle\\Modules\\Identities" +
      "\\Transactions\\Deputize\\GPBMetadata\352\0028Ass" +
      "etmantle::Modules::Identities::Transacti" +
      "ons::Deputizeb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.assetmantle.schema.ids.base.ClassificationIdProto.getDescriptor(),
          com.assetmantle.schema.ids.base.IdentityIdProto.getDescriptor(),
          com.assetmantle.schema.lists.base.PropertyListProto.getDescriptor(),
        });
    internal_static_assetmantle_modules_identities_transactions_deputize_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_modules_identities_transactions_deputize_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_modules_identities_transactions_deputize_Message_descriptor,
        new java.lang.String[] { "From", "FromID", "ToID", "ClassificationID", "MaintainedProperties", "CanMintAsset", "CanBurnAsset", "CanRenumerateAsset", "CanAddMaintainer", "CanRemoveMaintainer", "CanMutateMaintainer", });
    com.assetmantle.schema.ids.base.ClassificationIdProto.getDescriptor();
    com.assetmantle.schema.ids.base.IdentityIdProto.getDescriptor();
    com.assetmantle.schema.lists.base.PropertyListProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}