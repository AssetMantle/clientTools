// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/crypto/ed25519/keys.proto

package com.cosmos.crypto.ed25519;

public final class KeysProto {
  private KeysProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_crypto_ed25519_PubKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_crypto_ed25519_PubKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_crypto_ed25519_PrivKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_crypto_ed25519_PrivKey_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n cosmos/crypto/ed25519/keys.proto\022\025cosm" +
      "os.crypto.ed25519\032\024gogoproto/gogo.proto\"" +
      ">\n\006PubKey\022.\n\003key\030\001 \001(\014B\034\372\336\037\030crypto/ed255" +
      "19.PublicKeyR\003key:\004\230\240\037\000\":\n\007PrivKey\022/\n\003ke" +
      "y\030\001 \001(\014B\035\372\336\037\031crypto/ed25519.PrivateKeyR\003" +
      "keyB\322\001\n\031com.cosmos.crypto.ed25519B\tKeysP" +
      "rotoP\001Z4github.com/AssetMantle/modules/c" +
      "osmos/crypto/ed25519\242\002\003CCE\252\002\025Cosmos.Cryp" +
      "to.Ed25519\312\002\025Cosmos\\Crypto\\Ed25519\342\002!Cos" +
      "mos\\Crypto\\Ed25519\\GPBMetadata\352\002\027Cosmos:" +
      ":Crypto::Ed25519b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_cosmos_crypto_ed25519_PubKey_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_crypto_ed25519_PubKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_crypto_ed25519_PubKey_descriptor,
        new String[] { "Key", });
    internal_static_cosmos_crypto_ed25519_PrivKey_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_crypto_ed25519_PrivKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_crypto_ed25519_PrivKey_descriptor,
        new String[] { "Key", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.casttype);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
