// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/orders/internal/transactions/take/message.v1.proto

package com.orders.transactions.take;

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
    internal_static_orders_transactions_take_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_orders_transactions_take_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:modules/orders/internal/transactions/t" +
      "ake/message.v1.proto\022\030orders.transaction" +
      "s.take\032\024gogoproto/gogo.proto\032#schema/ids" +
      "/base/identityID.v1.proto\032 schema/ids/ba" +
      "se/orderID.v1.proto\"\322\001\n\007Message\022\022\n\004from\030" +
      "\001 \001(\tR\004from\022)\n\010from_i_d\030\002 \001(\0132\017.ids.Iden" +
      "tityIDR\006fromID\022^\n\023taker_ownable_split\030\003 " +
      "\001(\tB.\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sd" +
      "k/types.DecR\021takerOwnableSplit\022(\n\torder_" +
      "i_d\030\004 \001(\0132\014.ids.OrderIDR\007orderIDB\372\001\n\034com" +
      ".orders.transactions.takeB\016MessageV1Prot" +
      "oP\001ZHgithub.com/AssetMantle/modules/modu" +
      "les/orders/internal/transactions/take\242\002\003" +
      "OTT\252\002\030Orders.Transactions.Take\312\002\030Orders\\" +
      "Transactions\\Take\342\002$Orders\\Transactions\\" +
      "Take\\GPBMetadata\352\002\032Orders::Transactions:" +
      ":Takeb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.ids.IdentityIDV1Proto.getDescriptor(),
          com.ids.OrderIDV1Proto.getDescriptor(),
        });
    internal_static_orders_transactions_take_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_orders_transactions_take_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_orders_transactions_take_Message_descriptor,
        new java.lang.String[] { "From", "FromID", "TakerOwnableSplit", "OrderID", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.ids.IdentityIDV1Proto.getDescriptor();
    com.ids.OrderIDV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}