// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/interchain_accounts/host/v1/host.proto

package com.ibc.applications.interchain_accounts.host.v1;

public final class HostProto {
  private HostProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_interchain_accounts_host_v1_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_interchain_accounts_host_v1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n7ibc/applications/interchain_accounts/h" +
      "ost/v1/host.proto\022,ibc.applications.inte" +
      "rchain_accounts.host.v1\032\024gogoproto/gogo." +
      "proto\"\206\001\n\006Params\022:\n\014host_enabled\030\001 \001(\010B\027" +
      "\362\336\037\023yaml:\"host_enabled\"R\013hostEnabled\022@\n\016" +
      "allow_messages\030\002 \003(\tB\031\362\336\037\025yaml:\"allow_me" +
      "ssages\"R\rallowMessagesB\342\002\n0com.ibc.appli" +
      "cations.interchain_accounts.host.v1B\tHos" +
      "tProtoP\001ZRgithub.com/AssetMantle/modules" +
      "/ibc/applications/interchain_accounts/ho" +
      "st/v1;hostv1\242\002\004IAIH\252\002+Ibc.Applications.I" +
      "nterchainAccounts.Host.V1\312\002+Ibc\\Applicat" +
      "ions\\InterchainAccounts\\Host\\V1\342\0027Ibc\\Ap" +
      "plications\\InterchainAccounts\\Host\\V1\\GP" +
      "BMetadata\352\002/Ibc::Applications::Interchai" +
      "nAccounts::Host::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_ibc_applications_interchain_accounts_host_v1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ibc_applications_interchain_accounts_host_v1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_interchain_accounts_host_v1_Params_descriptor,
        new String[] { "HostEnabled", "AllowMessages", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.moretags);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
