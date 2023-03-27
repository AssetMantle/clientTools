// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/interchain_accounts/controller/v1/query.proto

package com.ibc.applications.interchain_accounts.controller.v1;

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
    internal_static_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_interchain_accounts_controller_v1_QueryParamsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_interchain_accounts_controller_v1_QueryParamsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_interchain_accounts_controller_v1_QueryParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_interchain_accounts_controller_v1_QueryParamsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n>ibc/applications/interchain_accounts/c" +
      "ontroller/v1/query.proto\0222ibc.applicatio" +
      "ns.interchain_accounts.controller.v1\032Cib" +
      "c/applications/interchain_accounts/contr" +
      "oller/v1/controller.proto\032\024gogoproto/gog" +
      "o.proto\032\034google/api/annotations.proto\"t\n" +
      "\035QueryInterchainAccountRequest\022\024\n\005owner\030" +
      "\001 \001(\tR\005owner\022=\n\rconnection_id\030\002 \001(\tB\030\362\336\037" +
      "\024yaml:\"connection_id\"R\014connectionId\":\n\036Q" +
      "ueryInterchainAccountResponse\022\030\n\007address" +
      "\030\001 \001(\tR\007address\"\024\n\022QueryParamsRequest\"i\n" +
      "\023QueryParamsResponse\022R\n\006params\030\001 \001(\0132:.i" +
      "bc.applications.interchain_accounts.cont" +
      "roller.v1.ParamsR\006params2\374\003\n\005Query\022\232\002\n\021I" +
      "nterchainAccount\022Q.ibc.applications.inte" +
      "rchain_accounts.controller.v1.QueryInter" +
      "chainAccountRequest\032R.ibc.applications.i" +
      "nterchain_accounts.controller.v1.QueryIn" +
      "terchainAccountResponse\"^\202\323\344\223\002X\022V/ibc/ap" +
      "ps/interchain_accounts/controller/v1/own" +
      "ers/{owner}/connections/{connection_id}\022" +
      "\325\001\n\006Params\022F.ibc.applications.interchain" +
      "_accounts.controller.v1.QueryParamsReque" +
      "st\032G.ibc.applications.interchain_account" +
      "s.controller.v1.QueryParamsResponse\":\202\323\344" +
      "\223\0024\0222/ibc/apps/interchain_accounts/contr" +
      "oller/v1/paramsB\215\003\n6com.ibc.applications" +
      ".interchain_accounts.controller.v1B\nQuer" +
      "yProtoP\001Z^github.com/AssetMantle/modules" +
      "/ibc/applications/interchain_accounts/co" +
      "ntroller/v1;controllerv1\242\002\004IAIC\252\0021Ibc.Ap" +
      "plications.InterchainAccounts.Controller" +
      ".V1\312\0021Ibc\\Applications\\InterchainAccount" +
      "s\\Controller\\V1\342\002=Ibc\\Applications\\Inter" +
      "chainAccounts\\Controller\\V1\\GPBMetadata\352" +
      "\0025Ibc::Applications::InterchainAccounts:" +
      ":Controller::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ControllerProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountRequest_descriptor,
        new String[] { "Owner", "ConnectionId", });
    internal_static_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountResponse_descriptor,
        new String[] { "Address", });
    internal_static_ibc_applications_interchain_accounts_controller_v1_QueryParamsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ibc_applications_interchain_accounts_controller_v1_QueryParamsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_interchain_accounts_controller_v1_QueryParamsRequest_descriptor,
        new String[] { });
    internal_static_ibc_applications_interchain_accounts_controller_v1_QueryParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ibc_applications_interchain_accounts_controller_v1_QueryParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_interchain_accounts_controller_v1_QueryParamsResponse_descriptor,
        new String[] { "Params", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    ControllerProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
