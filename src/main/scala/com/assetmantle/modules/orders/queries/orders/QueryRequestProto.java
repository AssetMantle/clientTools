// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: orders/queries/orders/query_request.proto

package com.assetmantle.modules.orders.queries.orders;

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
    internal_static_assetmantle_modules_orders_queries_orders_QueryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_modules_orders_queries_orders_QueryRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)orders/queries/orders/query_request.pr" +
      "oto\022)assetmantle.modules.orders.queries." +
      "orders\032*cosmos/base/query/v1beta1/pagina" +
      "tion.proto\"Y\n\014QueryRequest\022I\n\014page_reque" +
      "st\030\001 \001(\0132&.cosmos.base.query.v1beta1.Pag" +
      "eRequestR\013pageRequestB\304\002\n-com.assetmantl" +
      "e.modules.orders.queries.ordersB\021QueryRe" +
      "questProtoP\001Z6github.com/AssetMantle/mod" +
      "ules/x/orders/queries/orders\242\002\005AMOQO\252\002)A" +
      "ssetmantle.Modules.Orders.Queries.Orders" +
      "\312\002)Assetmantle\\Modules\\Orders\\Queries\\Or" +
      "ders\342\0025Assetmantle\\Modules\\Orders\\Querie" +
      "s\\Orders\\GPBMetadata\352\002-Assetmantle::Modu" +
      "les::Orders::Queries::Ordersb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor(),
        });
    internal_static_assetmantle_modules_orders_queries_orders_QueryRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_modules_orders_queries_orders_QueryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_modules_orders_queries_orders_QueryRequest_descriptor,
        new java.lang.String[] { "PageRequest", });
    com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}