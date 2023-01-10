// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/interchain_accounts/v1/genesis.proto

package com.ibc.applications.interchain_accounts.v1;

public final class GenesisProto {
  private GenesisProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_interchain_accounts_v1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_interchain_accounts_v1_GenesisState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_interchain_accounts_v1_ControllerGenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_interchain_accounts_v1_ControllerGenesisState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_interchain_accounts_v1_HostGenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_interchain_accounts_v1_HostGenesisState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_interchain_accounts_v1_ActiveChannel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_interchain_accounts_v1_ActiveChannel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_interchain_accounts_v1_RegisteredInterchainAccount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_interchain_accounts_v1_RegisteredInterchainAccount_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5ibc/applications/interchain_accounts/v" +
      "1/genesis.proto\022\'ibc.applications.interc" +
      "hain_accounts.v1\032\024gogoproto/gogo.proto\032C" +
      "ibc/applications/interchain_accounts/con" +
      "troller/v1/controller.proto\0327ibc/applica" +
      "tions/interchain_accounts/host/v1/host.p" +
      "roto\"\300\002\n\014GenesisState\022\242\001\n\030controller_gen" +
      "esis_state\030\001 \001(\0132?.ibc.applications.inte" +
      "rchain_accounts.v1.ControllerGenesisStat" +
      "eB\'\310\336\037\000\362\336\037\037yaml:\"controller_genesis_stat" +
      "e\"R\026controllerGenesisState\022\212\001\n\022host_gene" +
      "sis_state\030\002 \001(\01329.ibc.applications.inter" +
      "chain_accounts.v1.HostGenesisStateB!\310\336\037\000" +
      "\362\336\037\031yaml:\"host_genesis_state\"R\020hostGenes" +
      "isState\"\245\003\n\026ControllerGenesisState\022\177\n\017ac" +
      "tive_channels\030\001 \003(\01326.ibc.applications.i" +
      "nterchain_accounts.v1.ActiveChannelB\036\310\336\037" +
      "\000\362\336\037\026yaml:\"active_channels\"R\016activeChann" +
      "els\022\231\001\n\023interchain_accounts\030\002 \003(\0132D.ibc." +
      "applications.interchain_accounts.v1.Regi" +
      "steredInterchainAccountB\"\310\336\037\000\362\336\037\032yaml:\"i" +
      "nterchain_accounts\"R\022interchainAccounts\022" +
      "\024\n\005ports\030\003 \003(\tR\005ports\022X\n\006params\030\004 \001(\0132:." +
      "ibc.applications.interchain_accounts.con" +
      "troller.v1.ParamsB\004\310\336\037\000R\006params\"\227\003\n\020Host" +
      "GenesisState\022\177\n\017active_channels\030\001 \003(\01326." +
      "ibc.applications.interchain_accounts.v1." +
      "ActiveChannelB\036\310\336\037\000\362\336\037\026yaml:\"active_chan" +
      "nels\"R\016activeChannels\022\231\001\n\023interchain_acc" +
      "ounts\030\002 \003(\0132D.ibc.applications.interchai" +
      "n_accounts.v1.RegisteredInterchainAccoun" +
      "tB\"\310\336\037\000\362\336\037\032yaml:\"interchain_accounts\"R\022i" +
      "nterchainAccounts\022\022\n\004port\030\003 \001(\tR\004port\022R\n" +
      "\006params\030\004 \001(\01324.ibc.applications.interch" +
      "ain_accounts.host.v1.ParamsB\004\310\336\037\000R\006param" +
      "s\"\261\001\n\rActiveChannel\022=\n\rconnection_id\030\001 \001" +
      "(\tB\030\362\336\037\024yaml:\"connection_id\"R\014connection" +
      "Id\022+\n\007port_id\030\002 \001(\tB\022\362\336\037\016yaml:\"port_id\"R" +
      "\006portId\0224\n\nchannel_id\030\003 \001(\tB\025\362\336\037\021yaml:\"c" +
      "hannel_id\"R\tchannelId\"\316\001\n\033RegisteredInte" +
      "rchainAccount\022=\n\rconnection_id\030\001 \001(\tB\030\362\336" +
      "\037\024yaml:\"connection_id\"R\014connectionId\022+\n\007" +
      "port_id\030\002 \001(\tB\022\362\336\037\016yaml:\"port_id\"R\006portI" +
      "d\022C\n\017account_address\030\003 \001(\tB\032\362\336\037\026yaml:\"ac" +
      "count_address\"R\016accountAddressB\324\002\n+com.i" +
      "bc.applications.interchain_accounts.v1B\014" +
      "GenesisProtoP\001Z\\github.com/AssetMantle/m" +
      "odules/ibc/applications/interchain_accou" +
      "nts/v1;interchain_accountsv1\242\002\003IAI\252\002&Ibc" +
      ".Applications.InterchainAccounts.V1\312\002&Ib" +
      "c\\Applications\\InterchainAccounts\\V1\342\0022I" +
      "bc\\Applications\\InterchainAccounts\\V1\\GP" +
      "BMetadata\352\002)Ibc::Applications::Interchai" +
      "nAccounts::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.ibc.applications.interchain_accounts.controller.v1.ControllerProto.getDescriptor(),
          com.ibc.applications.interchain_accounts.host.v1.HostProto.getDescriptor(),
        });
    internal_static_ibc_applications_interchain_accounts_v1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ibc_applications_interchain_accounts_v1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_interchain_accounts_v1_GenesisState_descriptor,
        new java.lang.String[] { "ControllerGenesisState", "HostGenesisState", });
    internal_static_ibc_applications_interchain_accounts_v1_ControllerGenesisState_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ibc_applications_interchain_accounts_v1_ControllerGenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_interchain_accounts_v1_ControllerGenesisState_descriptor,
        new java.lang.String[] { "ActiveChannels", "InterchainAccounts", "Ports", "Params", });
    internal_static_ibc_applications_interchain_accounts_v1_HostGenesisState_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ibc_applications_interchain_accounts_v1_HostGenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_interchain_accounts_v1_HostGenesisState_descriptor,
        new java.lang.String[] { "ActiveChannels", "InterchainAccounts", "Port", "Params", });
    internal_static_ibc_applications_interchain_accounts_v1_ActiveChannel_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ibc_applications_interchain_accounts_v1_ActiveChannel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_interchain_accounts_v1_ActiveChannel_descriptor,
        new java.lang.String[] { "ConnectionId", "PortId", "ChannelId", });
    internal_static_ibc_applications_interchain_accounts_v1_RegisteredInterchainAccount_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ibc_applications_interchain_accounts_v1_RegisteredInterchainAccount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_interchain_accounts_v1_RegisteredInterchainAccount_descriptor,
        new java.lang.String[] { "ConnectionId", "PortId", "AccountAddress", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.ibc.applications.interchain_accounts.controller.v1.ControllerProto.getDescriptor();
    com.ibc.applications.interchain_accounts.host.v1.HostProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}