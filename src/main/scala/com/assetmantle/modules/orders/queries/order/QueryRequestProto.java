// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: orders/queries/order/query_request.proto

package com.assetmantle.modules.orders.queries.order;

public final class QueryRequestProto {
  private QueryRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_modules_orders_queries_order_QueryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_modules_orders_queries_order_QueryRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(orders/queries/order/query_request.pro" +
      "to\022(assetmantle.modules.orders.queries.o" +
      "rder\032\027ids/base/order_id.proto\"P\n\014QueryRe" +
      "quest\022@\n\torder_i_d\030\001 \001(\0132$.assetmantle.s" +
      "chema.ids.base.OrderIDR\007orderIDB\276\002\n,com." +
      "assetmantle.modules.orders.queries.order" +
      "B\021QueryRequestProtoP\001Z5github.com/AssetM" +
      "antle/modules/x/orders/queries/order\242\002\005A" +
      "MOQO\252\002(Assetmantle.Modules.Orders.Querie" +
      "s.Order\312\002(Assetmantle\\Modules\\Orders\\Que" +
      "ries\\Order\342\0024Assetmantle\\Modules\\Orders\\" +
      "Queries\\Order\\GPBMetadata\352\002,Assetmantle:" +
      ":Modules::Orders::Queries::Orderb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.assetmantle.schema.ids.base.OrderIdProto.getDescriptor(),
        });
    internal_static_assetmantle_modules_orders_queries_order_QueryRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_modules_orders_queries_order_QueryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_modules_orders_queries_order_QueryRequest_descriptor,
        new java.lang.String[] { "OrderID", });
    com.assetmantle.schema.ids.base.OrderIdProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
