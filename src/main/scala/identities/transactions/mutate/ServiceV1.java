// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/identities/internal/transactions/mutate/service.v1.proto

package identities.transactions.mutate;

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
      "\n@modules/identities/internal/transactio" +
      "ns/mutate/service.v1.proto\022\036identities.t" +
      "ransactions.mutate\032\034google/api/annotatio" +
      "ns.proto\032@modules/identities/internal/tr" +
      "ansactions/mutate/message.v1.proto\032Amodu" +
      "les/identities/internal/transactions/mut" +
      "ate/response.v1.proto2\211\001\n\007Service\022~\n\006Han" +
      "dle\022\'.identities.transactions.mutate.Mes" +
      "sage\032(.identities.transactions.mutate.Re" +
      "sponse\"!\202\323\344\223\002\033\"\031/mantle/identities/mutat" +
      "eb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          identities.transactions.mutate.MessageV1.getDescriptor(),
          identities.transactions.mutate.ResponseV1.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    identities.transactions.mutate.MessageV1.getDescriptor();
    identities.transactions.mutate.ResponseV1.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
