// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/commitment/v1/commitment.proto

package com.ibc.core.commitment.v1;

public final class CommitmentProto {
  private CommitmentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_commitment_v1_MerkleRoot_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_commitment_v1_MerkleRoot_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_commitment_v1_MerklePrefix_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_commitment_v1_MerklePrefix_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_commitment_v1_MerklePath_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_commitment_v1_MerklePath_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_commitment_v1_MerkleProof_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_commitment_v1_MerkleProof_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\'ibc/core/commitment/v1/commitment.prot" +
      "o\022\026ibc.core.commitment.v1\032\024gogoproto/gog" +
      "o.proto\032\014proofs.proto\"&\n\nMerkleRoot\022\022\n\004h" +
      "ash\030\001 \001(\014R\004hash:\004\210\240\037\000\"D\n\014MerklePrefix\0224\n" +
      "\nkey_prefix\030\001 \001(\014B\025\362\336\037\021yaml:\"key_prefix\"" +
      "R\tkeyPrefix\"B\n\nMerklePath\022.\n\010key_path\030\001 " +
      "\003(\tB\023\362\336\037\017yaml:\"key_path\"R\007keyPath:\004\230\240\037\000\"" +
      "=\n\013MerkleProof\022.\n\006proofs\030\001 \003(\0132\026.ics23.C" +
      "ommitmentProofR\006proofsB\354\001\n\032com.ibc.core." +
      "commitment.v1B\017CommitmentProtoP\001ZBgithub" +
      ".com/AssetMantle/modules/ibc/core/commit" +
      "ment/v1;commitmentv1\242\002\003ICC\252\002\026Ibc.Core.Co" +
      "mmitment.V1\312\002\026Ibc\\Core\\Commitment\\V1\342\002\"I" +
      "bc\\Core\\Commitment\\V1\\GPBMetadata\352\002\031Ibc:" +
      ":Core::Commitment::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.ics23.ProofsProto.getDescriptor(),
        });
    internal_static_ibc_core_commitment_v1_MerkleRoot_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ibc_core_commitment_v1_MerkleRoot_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_commitment_v1_MerkleRoot_descriptor,
        new String[] { "Hash", });
    internal_static_ibc_core_commitment_v1_MerklePrefix_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ibc_core_commitment_v1_MerklePrefix_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_commitment_v1_MerklePrefix_descriptor,
        new String[] { "KeyPrefix", });
    internal_static_ibc_core_commitment_v1_MerklePath_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ibc_core_commitment_v1_MerklePath_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_commitment_v1_MerklePath_descriptor,
        new String[] { "KeyPath", });
    internal_static_ibc_core_commitment_v1_MerkleProof_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ibc_core_commitment_v1_MerkleProof_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_commitment_v1_MerkleProof_descriptor,
        new String[] { "Proofs", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.moretags);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.ics23.ProofsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
