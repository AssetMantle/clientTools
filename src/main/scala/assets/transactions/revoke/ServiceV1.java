// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/assets/internal/transactions/revoke/service.v1.proto

package assets.transactions.revoke;

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
      "\n<modules/assets/internal/transactions/r" +
      "evoke/service.v1.proto\022\032assets.transacti" +
      "ons.revoke\032\034google/api/annotations.proto" +
      "\032<modules/assets/internal/transactions/r" +
      "evoke/message.v1.proto\032=modules/assets/i" +
      "nternal/transactions/revoke/response.v1." +
      "proto2}\n\007Service\022r\n\006Handle\022#.assets.tran" +
      "sactions.revoke.Message\032$.assets.transac" +
      "tions.revoke.Response\"\035\202\323\344\223\002\027\"\025/mantle/a" +
      "ssets/revokeb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          assets.transactions.revoke.MessageV1.getDescriptor(),
          assets.transactions.revoke.ResponseV1.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    assets.transactions.revoke.MessageV1.getDescriptor();
    assets.transactions.revoke.ResponseV1.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
