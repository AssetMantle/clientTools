// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/orders/internal/transactions/modify/service.v1.proto

package orders.transactions.modify;

public final class ServiceV1 {
  private ServiceV1() {}
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
      "\n<modules/orders/internal/transactions/m" +
      "odify/service.v1.proto\022\032orders.transacti" +
      "ons.modify\032\034google/api/annotations.proto" +
      "\032<modules/orders/internal/transactions/m" +
      "odify/message.v1.proto\032=modules/orders/i" +
      "nternal/transactions/modify/response.v1." +
      "proto2}\n\007Service\022r\n\006Handle\022#.orders.tran" +
      "sactions.modify.Message\032$.orders.transac" +
      "tions.modify.Response\"\035\202\323\344\223\002\027\"\025/mantle/o" +
      "rders/modifyb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          orders.transactions.modify.MessageV1.getDescriptor(),
          orders.transactions.modify.ResponseV1.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    orders.transactions.modify.MessageV1.getDescriptor();
    orders.transactions.modify.ResponseV1.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
