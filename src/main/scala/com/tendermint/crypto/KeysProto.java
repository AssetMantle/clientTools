// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/crypto/keys.proto

package com.tendermint.crypto;

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
    internal_static_tendermint_crypto_PublicKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tendermint_crypto_PublicKey_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034tendermint/crypto/keys.proto\022\021tendermi" +
      "nt.crypto\032\024gogoproto/gogo.proto\"X\n\tPubli" +
      "cKey\022\032\n\007ed25519\030\001 \001(\014H\000R\007ed25519\022\036\n\tsecp" +
      "256k1\030\002 \001(\014H\000R\tsecp256k1:\010\350\240\037\001\350\241\037\001B\005\n\003su" +
      "mB\301\001\n\025com.tendermint.cryptoB\tKeysProtoP\001" +
      "Z8github.com/tendermint/tendermint/proto" +
      "/tendermint/crypto\242\002\003TCX\252\002\021Tendermint.Cr" +
      "ypto\312\002\021Tendermint\\Crypto\342\002\035Tendermint\\Cr" +
      "ypto\\GPBMetadata\352\002\022Tendermint::Cryptob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_tendermint_crypto_PublicKey_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tendermint_crypto_PublicKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tendermint_crypto_PublicKey_descriptor,
        new java.lang.String[] { "Ed25519", "Secp256K1", "Sum", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.compare);
    registry.add(com.gogoproto.GogoProto.equal);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
