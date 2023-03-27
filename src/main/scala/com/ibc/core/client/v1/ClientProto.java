// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/client/v1/client.proto

package com.ibc.core.client.v1;

public final class ClientProto {
  private ClientProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_client_v1_IdentifiedClientState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_client_v1_IdentifiedClientState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_client_v1_ConsensusStateWithHeight_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_client_v1_ConsensusStateWithHeight_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_client_v1_ClientConsensusStates_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_client_v1_ClientConsensusStates_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_client_v1_ClientUpdateProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_client_v1_ClientUpdateProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_client_v1_UpgradeProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_client_v1_UpgradeProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_client_v1_Height_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_client_v1_Height_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_client_v1_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_client_v1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\037ibc/core/client/v1/client.proto\022\022ibc.c" +
      "ore.client.v1\032\024gogoproto/gogo.proto\032\031goo" +
      "gle/protobuf/any.proto\032$cosmos/upgrade/v" +
      "1beta1/upgrade.proto\032\031cosmos_proto/cosmo" +
      "s.proto\"\234\001\n\025IdentifiedClientState\0221\n\tcli" +
      "ent_id\030\001 \001(\tB\024\362\336\037\020yaml:\"client_id\"R\010clie" +
      "ntId\022P\n\014client_state\030\002 \001(\0132\024.google.prot" +
      "obuf.AnyB\027\362\336\037\023yaml:\"client_state\"R\013clien" +
      "tState\"\257\001\n\030ConsensusStateWithHeight\0228\n\006h" +
      "eight\030\001 \001(\0132\032.ibc.core.client.v1.HeightB" +
      "\004\310\336\037\000R\006height\022Y\n\017consensus_state\030\002 \001(\0132\024" +
      ".google.protobuf.AnyB\032\362\336\037\026yaml:\"consensu" +
      "s_state\"R\016consensusState\"\304\001\n\025ClientConse" +
      "nsusStates\0221\n\tclient_id\030\001 \001(\tB\024\362\336\037\020yaml:" +
      "\"client_id\"R\010clientId\022x\n\020consensus_state" +
      "s\030\002 \003(\0132,.ibc.core.client.v1.ConsensusSt" +
      "ateWithHeightB\037\310\336\037\000\362\336\037\027yaml:\"consensus_s" +
      "tates\"R\017consensusStates\"\217\002\n\024ClientUpdate" +
      "Proposal\022\024\n\005title\030\001 \001(\tR\005title\022 \n\013descri" +
      "ption\030\002 \001(\tR\013description\022H\n\021subject_clie" +
      "nt_id\030\003 \001(\tB\034\362\336\037\030yaml:\"subject_client_id" +
      "\"R\017subjectClientId\022Q\n\024substitute_client_" +
      "id\030\004 \001(\tB\037\362\336\037\033yaml:\"substitute_client_id" +
      "\"R\022substituteClientId:\"\210\240\037\000\322\264-\032cosmos.go" +
      "v.v1beta1.Content\"\231\002\n\017UpgradeProposal\022\024\n" +
      "\005title\030\001 \001(\tR\005title\022 \n\013description\030\002 \001(\t" +
      "R\013description\0226\n\004plan\030\003 \001(\0132\034.cosmos.upg" +
      "rade.v1beta1.PlanB\004\310\336\037\000R\004plan\022j\n\025upgrade" +
      "d_client_state\030\004 \001(\0132\024.google.protobuf.A" +
      "nyB \362\336\037\034yaml:\"upgraded_client_state\"R\023up" +
      "gradedClientState:*\210\240\037\000\230\240\037\000\350\240\037\001\322\264-\032cosmo" +
      "s.gov.v1beta1.Content\"\234\001\n\006Height\022C\n\017revi" +
      "sion_number\030\001 \001(\004B\032\362\336\037\026yaml:\"revision_nu" +
      "mber\"R\016revisionNumber\022C\n\017revision_height" +
      "\030\002 \001(\004B\032\362\336\037\026yaml:\"revision_height\"R\016revi" +
      "sionHeight:\010\210\240\037\000\230\240\037\000\"M\n\006Params\022C\n\017allowe" +
      "d_clients\030\001 \003(\tB\032\362\336\037\026yaml:\"allowed_clien" +
      "ts\"R\016allowedClientsB\314\001\n\026com.ibc.core.cli" +
      "ent.v1B\013ClientProtoP\001Z:github.com/AssetM" +
      "antle/modules/ibc/core/client/v1;clientv" +
      "1\242\002\003ICC\252\002\022Ibc.Core.Client.V1\312\002\022Ibc\\Core\\" +
      "Client\\V1\342\002\036Ibc\\Core\\Client\\V1\\GPBMetada" +
      "ta\352\002\025Ibc::Core::Client::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.cosmos.upgrade.v1beta1.UpgradeProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
        });
    internal_static_ibc_core_client_v1_IdentifiedClientState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ibc_core_client_v1_IdentifiedClientState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_client_v1_IdentifiedClientState_descriptor,
        new String[] { "ClientId", "ClientState", });
    internal_static_ibc_core_client_v1_ConsensusStateWithHeight_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ibc_core_client_v1_ConsensusStateWithHeight_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_client_v1_ConsensusStateWithHeight_descriptor,
        new String[] { "Height", "ConsensusState", });
    internal_static_ibc_core_client_v1_ClientConsensusStates_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ibc_core_client_v1_ClientConsensusStates_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_client_v1_ClientConsensusStates_descriptor,
        new String[] { "ClientId", "ConsensusStates", });
    internal_static_ibc_core_client_v1_ClientUpdateProposal_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ibc_core_client_v1_ClientUpdateProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_client_v1_ClientUpdateProposal_descriptor,
        new String[] { "Title", "Description", "SubjectClientId", "SubstituteClientId", });
    internal_static_ibc_core_client_v1_UpgradeProposal_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ibc_core_client_v1_UpgradeProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_client_v1_UpgradeProposal_descriptor,
        new String[] { "Title", "Description", "Plan", "UpgradedClientState", });
    internal_static_ibc_core_client_v1_Height_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ibc_core_client_v1_Height_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_client_v1_Height_descriptor,
        new String[] { "RevisionNumber", "RevisionHeight", });
    internal_static_ibc_core_client_v1_Params_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_ibc_core_client_v1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_client_v1_Params_descriptor,
        new String[] { "AllowedClients", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.implementsInterface);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.cosmos.upgrade.v1beta1.UpgradeProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
