// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/orders/internal/transactions/take/transactionService.v1.proto

package orders.transactions.take;

public final class TransactionServiceV1 {
  private TransactionServiceV1() {}
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
      "\nEmodules/orders/internal/transactions/t" +
      "ake/transactionService.v1.proto\022\030orders." +
      "transactions.take\032\034google/api/annotation" +
      "s.proto\032:modules/orders/internal/transac" +
      "tions/take/message.v1.proto\032Fmodules/ord" +
      "ers/internal/transactions/take/transacti" +
      "onResponse.v1.proto2\203\001\n\013Transaction\022t\n\004T" +
      "ake\022!.orders.transactions.take.Message\032-" +
      ".orders.transactions.take.TransactionRes" +
      "ponse\"\032\202\323\344\223\002\024\"\022/mantle/metas/takeb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          orders.transactions.take.MessageV1.getDescriptor(),
          orders.transactions.take.TransactionResponseV1.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    orders.transactions.take.MessageV1.getDescriptor();
    orders.transactions.take.TransactionResponseV1.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
