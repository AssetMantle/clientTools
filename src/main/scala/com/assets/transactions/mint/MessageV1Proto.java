// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/assets/internal/transactions/mint/message.v1.proto

package com.assets.transactions.mint;

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
    internal_static_assets_transactions_mint_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assets_transactions_mint_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n:modules/assets/internal/transactions/m" +
      "int/message.v1.proto\022\030assets.transaction" +
      "s.mint\032)schema/ids/base/classificationID" +
      ".v1.proto\032#schema/ids/base/identityID.v1" +
      ".proto\032\'schema/lists/base/propertyList.v" +
      "1.proto\"\336\003\n\007Message\022\022\n\004from\030\001 \001(\tR\004from\022" +
      ")\n\010from_i_d\030\002 \001(\0132\017.ids.IdentityIDR\006from" +
      "ID\022%\n\006to_i_d\030\003 \001(\0132\017.ids.IdentityIDR\004toI" +
      "D\022C\n\022classification_i_d\030\004 \001(\0132\025.ids.Clas" +
      "sificationIDR\020classificationID\022O\n\031immuta" +
      "ble_meta_properties\030\005 \001(\0132\023.lists.Proper" +
      "tyListR\027immutableMetaProperties\022F\n\024immut" +
      "able_properties\030\006 \001(\0132\023.lists.PropertyLi" +
      "stR\023immutableProperties\022K\n\027mutable_meta_" +
      "properties\030\007 \001(\0132\023.lists.PropertyListR\025m" +
      "utableMetaProperties\022B\n\022mutable_properti" +
      "es\030\010 \001(\0132\023.lists.PropertyListR\021mutablePr" +
      "opertiesB\372\001\n\034com.assets.transactions.min" +
      "tB\016MessageV1ProtoP\001ZHgithub.com/AssetMan" +
      "tle/modules/modules/assets/internal/tran" +
      "sactions/mint\242\002\003ATM\252\002\030Assets.Transaction" +
      "s.Mint\312\002\030Assets\\Transactions\\Mint\342\002$Asse" +
      "ts\\Transactions\\Mint\\GPBMetadata\352\002\032Asset" +
      "s::Transactions::Mintb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.ids.ClassificationIDV1Proto.getDescriptor(),
          com.ids.IdentityIDV1Proto.getDescriptor(),
          com.lists.PropertyListV1Proto.getDescriptor(),
        });
    internal_static_assets_transactions_mint_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assets_transactions_mint_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assets_transactions_mint_Message_descriptor,
        new String[] { "From", "FromID", "ToID", "ClassificationID", "ImmutableMetaProperties", "ImmutableProperties", "MutableMetaProperties", "MutableProperties", });
    com.ids.ClassificationIDV1Proto.getDescriptor();
    com.ids.IdentityIDV1Proto.getDescriptor();
    com.lists.PropertyListV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
