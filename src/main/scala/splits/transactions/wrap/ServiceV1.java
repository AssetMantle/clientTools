// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/splits/internal/transactions/wrap/service.v1.proto

package splits.transactions.wrap;

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
      "\n:modules/splits/internal/transactions/w" +
      "rap/service.v1.proto\022\030splits.transaction" +
      "s.wrap\032\034google/api/annotations.proto\032:mo" +
      "dules/splits/internal/transactions/wrap/" +
      "message.v1.proto\032;modules/splits/interna" +
      "l/transactions/wrap/response.v1.proto2w\n" +
      "\007Service\022l\n\006Handle\022!.splits.transactions" +
      ".wrap.Message\032\".splits.transactions.wrap" +
      ".Response\"\033\202\323\344\223\002\025\"\023/mantle/splits/wrapb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          splits.transactions.wrap.MessageV1.getDescriptor(),
          splits.transactions.wrap.ResponseV1.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    splits.transactions.wrap.MessageV1.getDescriptor();
    splits.transactions.wrap.ResponseV1.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
