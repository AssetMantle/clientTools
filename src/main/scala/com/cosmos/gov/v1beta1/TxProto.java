// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/tx.proto

package com.cosmos.gov.v1beta1;

public final class TxProto {
  private TxProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_MsgSubmitProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_MsgSubmitProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_MsgSubmitProposalResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_MsgSubmitProposalResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_MsgVote_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_MsgVote_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_MsgVoteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_MsgVoteResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_MsgVoteWeighted_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_MsgVoteWeighted_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_MsgVoteWeightedResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_MsgVoteWeightedResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_MsgDeposit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_MsgDeposit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_MsgDepositResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_MsgDepositResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\033cosmos/gov/v1beta1/tx.proto\022\022cosmos.go" +
      "v.v1beta1\032\036cosmos/base/v1beta1/coin.prot" +
      "o\032\034cosmos/gov/v1beta1/gov.proto\032\031cosmos_" +
      "proto/cosmos.proto\032\024gogoproto/gogo.proto" +
      "\032\031google/protobuf/any.proto\"\217\002\n\021MsgSubmi" +
      "tProposal\022;\n\007content\030\001 \001(\0132\024.google.prot" +
      "obuf.AnyB\013\312\264-\007ContentR\007content\022\216\001\n\017initi" +
      "al_deposit\030\002 \003(\0132\031.cosmos.base.v1beta1.C" +
      "oinBJ\310\336\037\000\362\336\037\026yaml:\"initial_deposit\"\252\337\037(g" +
      "ithub.com/cosmos/cosmos-sdk/types.CoinsR" +
      "\016initialDeposit\022\032\n\010proposer\030\003 \001(\tR\010propo" +
      "ser:\020\210\240\037\000\230\240\037\000\350\240\037\000\200\334 \000\"c\n\031MsgSubmitPropos" +
      "alResponse\022F\n\013proposal_id\030\001 \001(\004B%\352\336\037\013pro" +
      "posal_id\362\336\037\022yaml:\"proposal_id\"R\nproposal" +
      "Id\"\261\001\n\007MsgVote\022F\n\013proposal_id\030\001 \001(\004B%\352\336\037" +
      "\013proposal_id\362\336\037\022yaml:\"proposal_id\"R\nprop" +
      "osalId\022\024\n\005voter\030\002 \001(\tR\005voter\0226\n\006option\030\003" +
      " \001(\0162\036.cosmos.gov.v1beta1.VoteOptionR\006op" +
      "tion:\020\210\240\037\000\230\240\037\000\350\240\037\000\200\334 \000\"\021\n\017MsgVoteRespons" +
      "e\"\272\001\n\017MsgVoteWeighted\0227\n\013proposal_id\030\001 \001" +
      "(\004B\026\362\336\037\022yaml:\"proposal_id\"R\nproposalId\022\024" +
      "\n\005voter\030\002 \001(\tR\005voter\022F\n\007options\030\003 \003(\0132&." +
      "cosmos.gov.v1beta1.WeightedVoteOptionB\004\310" +
      "\336\037\000R\007options:\020\210\240\037\000\230\240\037\000\350\240\037\000\200\334 \000\"\031\n\027MsgVot" +
      "eWeightedResponse\"\351\001\n\nMsgDeposit\022F\n\013prop" +
      "osal_id\030\001 \001(\004B%\352\336\037\013proposal_id\362\336\037\022yaml:\"" +
      "proposal_id\"R\nproposalId\022\034\n\tdepositor\030\002 " +
      "\001(\tR\tdepositor\022c\n\006amount\030\003 \003(\0132\031.cosmos." +
      "base.v1beta1.CoinB0\310\336\037\000\252\337\037(github.com/co" +
      "smos/cosmos-sdk/types.CoinsR\006amount:\020\210\240\037" +
      "\000\230\240\037\000\350\240\037\000\200\334 \000\"\024\n\022MsgDepositResponse2\354\002\n\003" +
      "Msg\022f\n\016SubmitProposal\022%.cosmos.gov.v1bet" +
      "a1.MsgSubmitProposal\032-.cosmos.gov.v1beta" +
      "1.MsgSubmitProposalResponse\022H\n\004Vote\022\033.co" +
      "smos.gov.v1beta1.MsgVote\032#.cosmos.gov.v1" +
      "beta1.MsgVoteResponse\022`\n\014VoteWeighted\022#." +
      "cosmos.gov.v1beta1.MsgVoteWeighted\032+.cos" +
      "mos.gov.v1beta1.MsgVoteWeightedResponse\022" +
      "Q\n\007Deposit\022\036.cosmos.gov.v1beta1.MsgDepos" +
      "it\032&.cosmos.gov.v1beta1.MsgDepositRespon" +
      "seB\311\001\n\026com.cosmos.gov.v1beta1B\007TxProtoP\001" +
      "Z<github.com/AssetMantle/modules/cosmos/" +
      "gov/v1beta1;govv1beta1\242\002\003CGX\252\002\022Cosmos.Go" +
      "v.V1beta1\312\002\022Cosmos\\Gov\\V1beta1\342\002\036Cosmos\\" +
      "Gov\\V1beta1\\GPBMetadata\352\002\024Cosmos::Gov::V" +
      "1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          GovProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
        });
    internal_static_cosmos_gov_v1beta1_MsgSubmitProposal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_gov_v1beta1_MsgSubmitProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_MsgSubmitProposal_descriptor,
        new String[] { "Content", "InitialDeposit", "Proposer", });
    internal_static_cosmos_gov_v1beta1_MsgSubmitProposalResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_gov_v1beta1_MsgSubmitProposalResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_MsgSubmitProposalResponse_descriptor,
        new String[] { "ProposalId", });
    internal_static_cosmos_gov_v1beta1_MsgVote_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_gov_v1beta1_MsgVote_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_MsgVote_descriptor,
        new String[] { "ProposalId", "Voter", "Option", });
    internal_static_cosmos_gov_v1beta1_MsgVoteResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cosmos_gov_v1beta1_MsgVoteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_MsgVoteResponse_descriptor,
        new String[] { });
    internal_static_cosmos_gov_v1beta1_MsgVoteWeighted_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_cosmos_gov_v1beta1_MsgVoteWeighted_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_MsgVoteWeighted_descriptor,
        new String[] { "ProposalId", "Voter", "Options", });
    internal_static_cosmos_gov_v1beta1_MsgVoteWeightedResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_cosmos_gov_v1beta1_MsgVoteWeightedResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_MsgVoteWeightedResponse_descriptor,
        new String[] { });
    internal_static_cosmos_gov_v1beta1_MsgDeposit_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_cosmos_gov_v1beta1_MsgDeposit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_MsgDeposit_descriptor,
        new String[] { "ProposalId", "Depositor", "Amount", });
    internal_static_cosmos_gov_v1beta1_MsgDepositResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_cosmos_gov_v1beta1_MsgDepositResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_MsgDepositResponse_descriptor,
        new String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.acceptsInterface);
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.jsontag);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stringer);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    GovProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
