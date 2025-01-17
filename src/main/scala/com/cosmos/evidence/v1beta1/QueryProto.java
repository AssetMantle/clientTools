// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/evidence/v1beta1/query.proto

package com.cosmos.evidence.v1beta1;

public final class QueryProto {
  private QueryProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_evidence_v1beta1_QueryEvidenceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_evidence_v1beta1_QueryEvidenceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_evidence_v1beta1_QueryEvidenceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_evidence_v1beta1_QueryEvidenceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_evidence_v1beta1_QueryAllEvidenceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_evidence_v1beta1_QueryAllEvidenceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_evidence_v1beta1_QueryAllEvidenceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_evidence_v1beta1_QueryAllEvidenceResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#cosmos/evidence/v1beta1/query.proto\022\027c" +
      "osmos.evidence.v1beta1\032*cosmos/base/quer" +
      "y/v1beta1/pagination.proto\032\024gogoproto/go" +
      "go.proto\032\031google/protobuf/any.proto\032\034goo" +
      "gle/api/annotations.proto\"u\n\024QueryEviden" +
      "ceRequest\022]\n\revidence_hash\030\001 \001(\014B8\372\336\0374gi" +
      "thub.com/tendermint/tendermint/libs/byte" +
      "s.HexBytesR\014evidenceHash\"I\n\025QueryEvidenc" +
      "eResponse\0220\n\010evidence\030\001 \001(\0132\024.google.pro" +
      "tobuf.AnyR\010evidence\"a\n\027QueryAllEvidenceR" +
      "equest\022F\n\npagination\030\001 \001(\0132&.cosmos.base" +
      ".query.v1beta1.PageRequestR\npagination\"\225" +
      "\001\n\030QueryAllEvidenceResponse\0220\n\010evidence\030" +
      "\001 \003(\0132\024.google.protobuf.AnyR\010evidence\022G\n" +
      "\npagination\030\002 \001(\0132\'.cosmos.base.query.v1" +
      "beta1.PageResponseR\npagination2\316\002\n\005Query" +
      "\022\244\001\n\010Evidence\022-.cosmos.evidence.v1beta1." +
      "QueryEvidenceRequest\032..cosmos.evidence.v" +
      "1beta1.QueryEvidenceResponse\"9\202\323\344\223\0023\0221/c" +
      "osmos/evidence/v1beta1/evidence/{evidenc" +
      "e_hash}\022\235\001\n\013AllEvidence\0220.cosmos.evidenc" +
      "e.v1beta1.QueryAllEvidenceRequest\0321.cosm" +
      "os.evidence.v1beta1.QueryAllEvidenceResp" +
      "onse\")\202\323\344\223\002#\022!/cosmos/evidence/v1beta1/e" +
      "videnceB\326\001\n\033com.cosmos.evidence.v1beta1B" +
      "\nQueryProtoP\001Z-github.com/cosmos/cosmos-" +
      "sdk/x/evidence/types\242\002\003CEX\252\002\027Cosmos.Evid" +
      "ence.V1beta1\312\002\027Cosmos\\Evidence\\V1beta1\342\002" +
      "#Cosmos\\Evidence\\V1beta1\\GPBMetadata\352\002\031C" +
      "osmos::Evidence::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_cosmos_evidence_v1beta1_QueryEvidenceRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_evidence_v1beta1_QueryEvidenceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_evidence_v1beta1_QueryEvidenceRequest_descriptor,
        new java.lang.String[] { "EvidenceHash", });
    internal_static_cosmos_evidence_v1beta1_QueryEvidenceResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_evidence_v1beta1_QueryEvidenceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_evidence_v1beta1_QueryEvidenceResponse_descriptor,
        new java.lang.String[] { "Evidence", });
    internal_static_cosmos_evidence_v1beta1_QueryAllEvidenceRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_evidence_v1beta1_QueryAllEvidenceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_evidence_v1beta1_QueryAllEvidenceRequest_descriptor,
        new java.lang.String[] { "Pagination", });
    internal_static_cosmos_evidence_v1beta1_QueryAllEvidenceResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cosmos_evidence_v1beta1_QueryAllEvidenceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_evidence_v1beta1_QueryAllEvidenceResponse_descriptor,
        new java.lang.String[] { "Evidence", "Pagination", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.casttype);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
