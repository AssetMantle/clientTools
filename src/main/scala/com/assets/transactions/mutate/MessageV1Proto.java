// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/assets/internal/transactions/mutate/message.v1.proto

package com.assets.transactions.mutate;

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
    internal_static_assets_transactions_mutate_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assets_transactions_mutate_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<modules/assets/internal/transactions/m" +
      "utate/message.v1.proto\022\032assets.transacti" +
      "ons.mutate\032 schema/ids/base/assetID.v1.p" +
      "roto\032#schema/ids/base/identityID.v1.prot" +
      "o\032\'schema/lists/base/propertyList.v1.pro" +
      "to\"\203\002\n\007Message\022\022\n\004from\030\001 \001(\tR\004from\022)\n\010fr" +
      "om_i_d\030\002 \001(\0132\017.ids.IdentityIDR\006fromID\022(\n" +
      "\tasset_i_d\030\003 \001(\0132\014.ids.AssetIDR\007assetID\022" +
      "K\n\027mutable_meta_properties\030\004 \001(\0132\023.lists" +
      ".PropertyListR\025mutableMetaProperties\022B\n\022" +
      "mutable_properties\030\005 \001(\0132\023.lists.Propert" +
      "yListR\021mutablePropertiesB\206\002\n\036com.assets." +
      "transactions.mutateB\016MessageV1ProtoP\001ZJg" +
      "ithub.com/AssetMantle/modules/modules/as" +
      "sets/internal/transactions/mutate\242\002\003ATM\252" +
      "\002\032Assets.Transactions.Mutate\312\002\032Assets\\Tr" +
      "ansactions\\Mutate\342\002&Assets\\Transactions\\" +
      "Mutate\\GPBMetadata\352\002\034Assets::Transaction" +
      "s::Mutateb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.ids.AssetIDV1Proto.getDescriptor(),
          com.ids.IdentityIDV1Proto.getDescriptor(),
          com.lists.PropertyListV1Proto.getDescriptor(),
        });
    internal_static_assets_transactions_mutate_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assets_transactions_mutate_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assets_transactions_mutate_Message_descriptor,
        new java.lang.String[] { "From", "FromID", "AssetID", "MutableMetaProperties", "MutableProperties", });
    com.ids.AssetIDV1Proto.getDescriptor();
    com.ids.IdentityIDV1Proto.getDescriptor();
    com.lists.PropertyListV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}