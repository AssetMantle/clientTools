// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/orders/internal/transactions/immediate/service.v1.proto

package orders.transactions.immediate;

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
      "\n?modules/orders/internal/transactions/i" +
      "mmediate/service.v1.proto\022\035orders.transa" +
      "ctions.immediate\032\034google/api/annotations" +
      ".proto\032?modules/orders/internal/transact" +
      "ions/immediate/message.v1.proto\032@modules" +
      "/orders/internal/transactions/immediate/" +
      "response.v1.proto2\206\001\n\007Service\022{\n\006Handle\022" +
      "&.orders.transactions.immediate.Message\032" +
      "\'.orders.transactions.immediate.Response" +
      "\" \202\323\344\223\002\032\"\030/mantle/orders/immediateb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          orders.transactions.immediate.MessageV1.getDescriptor(),
          orders.transactions.immediate.ResponseV1.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    orders.transactions.immediate.MessageV1.getDescriptor();
    orders.transactions.immediate.ResponseV1.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
