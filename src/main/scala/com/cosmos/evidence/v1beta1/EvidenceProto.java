// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/evidence/v1beta1/evidence.proto

package com.cosmos.evidence.v1beta1;

public final class EvidenceProto {
  private EvidenceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_evidence_v1beta1_Equivocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_evidence_v1beta1_Equivocation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&cosmos/evidence/v1beta1/evidence.proto" +
      "\022\027cosmos.evidence.v1beta1\032\024gogoproto/gog" +
      "o.proto\032\037google/protobuf/timestamp.proto" +
      "\"\317\001\n\014Equivocation\022\026\n\006height\030\001 \001(\003R\006heigh" +
      "t\0228\n\004time\030\002 \001(\0132\032.google.protobuf.Timest" +
      "ampB\010\310\336\037\000\220\337\037\001R\004time\022\024\n\005power\030\003 \001(\003R\005powe" +
      "r\022I\n\021consensus_address\030\004 \001(\tB\034\362\336\037\030yaml:\"" +
      "consensus_address\"R\020consensusAddress:\014\210\240" +
      "\037\000\230\240\037\000\350\240\037\000B\335\001\n\033com.cosmos.evidence.v1bet" +
      "a1B\rEvidenceProtoP\001Z-github.com/cosmos/c" +
      "osmos-sdk/x/evidence/types\242\002\003CEX\252\002\027Cosmo" +
      "s.Evidence.V1beta1\312\002\027Cosmos\\Evidence\\V1b" +
      "eta1\342\002#Cosmos\\Evidence\\V1beta1\\GPBMetada" +
      "ta\352\002\031Cosmos::Evidence::V1beta1\250\342\036\001b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_cosmos_evidence_v1beta1_Equivocation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_evidence_v1beta1_Equivocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_evidence_v1beta1_Equivocation_descriptor,
        new java.lang.String[] { "Height", "Time", "Power", "ConsensusAddress", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.equalAll);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
