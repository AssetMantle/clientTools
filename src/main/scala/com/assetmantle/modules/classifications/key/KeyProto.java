// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: classifications/key/key.proto

package com.assetmantle.modules.classifications.key;

public final class KeyProto {
  private KeyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_modules_classifications_key_Key_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_modules_classifications_key_Key_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035classifications/key/key.proto\022\'assetma" +
      "ntle.modules.classifications.key\032 ids/ba" +
      "se/classification_id.proto\"b\n\003Key\022[\n\022cla" +
      "ssification_i_d\030\001 \001(\0132-.assetmantle.sche" +
      "ma.ids.base.ClassificationIDR\020classifica" +
      "tionIDB\255\002\n+com.assetmantle.modules.class" +
      "ifications.keyB\010KeyProtoP\001Z4github.com/A" +
      "ssetMantle/modules/x/classifications/key" +
      "\242\002\004AMCK\252\002\'Assetmantle.Modules.Classifica" +
      "tions.Key\312\002\'Assetmantle\\Modules\\Classifi" +
      "cations\\Key\342\0023Assetmantle\\Modules\\Classi" +
      "fications\\Key\\GPBMetadata\352\002*Assetmantle:" +
      ":Modules::Classifications::Keyb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.assetmantle.schema.ids.base.ClassificationIdProto.getDescriptor(),
        });
    internal_static_assetmantle_modules_classifications_key_Key_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_modules_classifications_key_Key_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_modules_classifications_key_Key_descriptor,
        new java.lang.String[] { "ClassificationID", });
    com.assetmantle.schema.ids.base.ClassificationIdProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}