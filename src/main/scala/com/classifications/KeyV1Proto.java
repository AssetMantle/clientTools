// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/classifications/internal/key/key.v1.proto

package com.classifications;

public final class KeyV1Proto {
  private KeyV1Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_classifications_Key_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_classifications_Key_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n1modules/classifications/internal/key/k" +
      "ey.v1.proto\022\017classifications\032)schema/ids" +
      "/base/classificationID.v1.proto\"J\n\003Key\022C" +
      "\n\022classification_i_d\030\001 \001(\0132\025.ids.Classif" +
      "icationIDR\020classificationIDB\302\001\n\023com.clas" +
      "sificationsB\nKeyV1ProtoP\001ZCgithub.com/As" +
      "setMantle/modules/modules/classification" +
      "s/internal/key\242\002\003CXX\252\002\017Classifications\312\002" +
      "\017Classifications\342\002\033Classifications\\GPBMe" +
      "tadata\352\002\017Classificationsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.ids.ClassificationIDV1Proto.getDescriptor(),
        });
    internal_static_classifications_Key_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_classifications_Key_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_classifications_Key_descriptor,
        new String[] { "ClassificationID", });
    com.ids.ClassificationIDV1Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
