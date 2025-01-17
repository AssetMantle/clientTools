// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/feegrant/v1beta1/query.proto

package com.cosmos.feegrant.v1beta1;

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
    internal_static_cosmos_feegrant_v1beta1_QueryAllowanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_feegrant_v1beta1_QueryAllowanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_feegrant_v1beta1_QueryAllowanceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_feegrant_v1beta1_QueryAllowanceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_feegrant_v1beta1_QueryAllowancesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_feegrant_v1beta1_QueryAllowancesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_feegrant_v1beta1_QueryAllowancesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_feegrant_v1beta1_QueryAllowancesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_feegrant_v1beta1_QueryAllowancesByGranterRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_feegrant_v1beta1_QueryAllowancesByGranterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_feegrant_v1beta1_QueryAllowancesByGranterResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_feegrant_v1beta1_QueryAllowancesByGranterResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#cosmos/feegrant/v1beta1/query.proto\022\027c" +
      "osmos.feegrant.v1beta1\032&cosmos/feegrant/" +
      "v1beta1/feegrant.proto\032*cosmos/base/quer" +
      "y/v1beta1/pagination.proto\032\034google/api/a" +
      "nnotations.proto\"K\n\025QueryAllowanceReques" +
      "t\022\030\n\007granter\030\001 \001(\tR\007granter\022\030\n\007grantee\030\002" +
      " \001(\tR\007grantee\"V\n\026QueryAllowanceResponse\022" +
      "<\n\tallowance\030\001 \001(\0132\036.cosmos.feegrant.v1b" +
      "eta1.GrantR\tallowance\"z\n\026QueryAllowances" +
      "Request\022\030\n\007grantee\030\001 \001(\tR\007grantee\022F\n\npag" +
      "ination\030\002 \001(\0132&.cosmos.base.query.v1beta" +
      "1.PageRequestR\npagination\"\242\001\n\027QueryAllow" +
      "ancesResponse\022>\n\nallowances\030\001 \003(\0132\036.cosm" +
      "os.feegrant.v1beta1.GrantR\nallowances\022G\n" +
      "\npagination\030\002 \001(\0132\'.cosmos.base.query.v1" +
      "beta1.PageResponseR\npagination\"\203\001\n\037Query" +
      "AllowancesByGranterRequest\022\030\n\007granter\030\001 " +
      "\001(\tR\007granter\022F\n\npagination\030\002 \001(\0132&.cosmo" +
      "s.base.query.v1beta1.PageRequestR\npagina" +
      "tion\"\253\001\n QueryAllowancesByGranterRespons" +
      "e\022>\n\nallowances\030\001 \003(\0132\036.cosmos.feegrant." +
      "v1beta1.GrantR\nallowances\022G\n\npagination\030" +
      "\002 \001(\0132\'.cosmos.base.query.v1beta1.PageRe" +
      "sponseR\npagination2\237\004\n\005Query\022\254\001\n\tAllowan" +
      "ce\022..cosmos.feegrant.v1beta1.QueryAllowa" +
      "nceRequest\032/.cosmos.feegrant.v1beta1.Que" +
      "ryAllowanceResponse\">\202\323\344\223\0028\0226/cosmos/fee" +
      "grant/v1beta1/allowance/{granter}/{grant" +
      "ee}\022\246\001\n\nAllowances\022/.cosmos.feegrant.v1b" +
      "eta1.QueryAllowancesRequest\0320.cosmos.fee" +
      "grant.v1beta1.QueryAllowancesResponse\"5\202" +
      "\323\344\223\002/\022-/cosmos/feegrant/v1beta1/allowanc" +
      "es/{grantee}\022\275\001\n\023AllowancesByGranter\0228.c" +
      "osmos.feegrant.v1beta1.QueryAllowancesBy" +
      "GranterRequest\0329.cosmos.feegrant.v1beta1" +
      ".QueryAllowancesByGranterResponse\"1\202\323\344\223\002" +
      "+\022)/cosmos/feegrant/v1beta1/issued/{gran" +
      "ter}B\320\001\n\033com.cosmos.feegrant.v1beta1B\nQu" +
      "eryProtoP\001Z\'github.com/cosmos/cosmos-sdk" +
      "/x/feegrant\242\002\003CFX\252\002\027Cosmos.Feegrant.V1be" +
      "ta1\312\002\027Cosmos\\Feegrant\\V1beta1\342\002#Cosmos\\F" +
      "eegrant\\V1beta1\\GPBMetadata\352\002\031Cosmos::Fe" +
      "egrant::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.feegrant.v1beta1.FeegrantProto.getDescriptor(),
          com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_cosmos_feegrant_v1beta1_QueryAllowanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_feegrant_v1beta1_QueryAllowanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_feegrant_v1beta1_QueryAllowanceRequest_descriptor,
        new java.lang.String[] { "Granter", "Grantee", });
    internal_static_cosmos_feegrant_v1beta1_QueryAllowanceResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_feegrant_v1beta1_QueryAllowanceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_feegrant_v1beta1_QueryAllowanceResponse_descriptor,
        new java.lang.String[] { "Allowance", });
    internal_static_cosmos_feegrant_v1beta1_QueryAllowancesRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_feegrant_v1beta1_QueryAllowancesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_feegrant_v1beta1_QueryAllowancesRequest_descriptor,
        new java.lang.String[] { "Grantee", "Pagination", });
    internal_static_cosmos_feegrant_v1beta1_QueryAllowancesResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cosmos_feegrant_v1beta1_QueryAllowancesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_feegrant_v1beta1_QueryAllowancesResponse_descriptor,
        new java.lang.String[] { "Allowances", "Pagination", });
    internal_static_cosmos_feegrant_v1beta1_QueryAllowancesByGranterRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_cosmos_feegrant_v1beta1_QueryAllowancesByGranterRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_feegrant_v1beta1_QueryAllowancesByGranterRequest_descriptor,
        new java.lang.String[] { "Granter", "Pagination", });
    internal_static_cosmos_feegrant_v1beta1_QueryAllowancesByGranterResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_cosmos_feegrant_v1beta1_QueryAllowancesByGranterResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_feegrant_v1beta1_QueryAllowancesByGranterResponse_descriptor,
        new java.lang.String[] { "Allowances", "Pagination", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.feegrant.v1beta1.FeegrantProto.getDescriptor();
    com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
