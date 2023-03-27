// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/gov.proto

package com.cosmos.gov.v1beta1;

public final class GovProto {
  private GovProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_WeightedVoteOption_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_WeightedVoteOption_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_TextProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_TextProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_Deposit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_Deposit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_Proposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_Proposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_TallyResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_TallyResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_Vote_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_Vote_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_DepositParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_DepositParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_VotingParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_VotingParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_TallyParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_TallyParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\034cosmos/gov/v1beta1/gov.proto\022\022cosmos.g" +
      "ov.v1beta1\032\036cosmos/base/v1beta1/coin.pro" +
      "to\032\024gogoproto/gogo.proto\032\031cosmos_proto/c" +
      "osmos.proto\032\037google/protobuf/timestamp.p" +
      "roto\032\031google/protobuf/any.proto\032\036google/" +
      "protobuf/duration.proto\"\245\001\n\022WeightedVote" +
      "Option\0226\n\006option\030\001 \001(\0162\036.cosmos.gov.v1be" +
      "ta1.VoteOptionR\006option\022W\n\006weight\030\002 \001(\tB?" +
      "\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/typ" +
      "es.Dec\362\336\037\ryaml:\"weight\"R\006weight\"W\n\014TextP" +
      "roposal\022\024\n\005title\030\001 \001(\tR\005title\022 \n\013descrip" +
      "tion\030\002 \001(\tR\013description:\017\350\240\037\001\322\264-\007Content" +
      "\"\317\001\n\007Deposit\0227\n\013proposal_id\030\001 \001(\004B\026\362\336\037\022y" +
      "aml:\"proposal_id\"R\nproposalId\022\034\n\tdeposit" +
      "or\030\002 \001(\tR\tdepositor\022c\n\006amount\030\003 \003(\0132\031.co" +
      "smos.base.v1beta1.CoinB0\310\336\037\000\252\337\037(github.c" +
      "om/cosmos/cosmos-sdk/types.CoinsR\006amount" +
      ":\010\210\240\037\000\350\240\037\000\"\366\006\n\010Proposal\0224\n\013proposal_id\030\001" +
      " \001(\004B\023\352\336\037\002id\362\336\037\tyaml:\"id\"R\nproposalId\022;\n" +
      "\007content\030\002 \001(\0132\024.google.protobuf.AnyB\013\312\264" +
      "-\007ContentR\007content\022V\n\006status\030\003 \001(\0162\".cos" +
      "mos.gov.v1beta1.ProposalStatusB\032\362\336\037\026yaml" +
      ":\"proposal_status\"R\006status\022p\n\022final_tall" +
      "y_result\030\004 \001(\0132\037.cosmos.gov.v1beta1.Tall" +
      "yResultB!\310\336\037\000\362\336\037\031yaml:\"final_tally_resul" +
      "t\"R\020finalTallyResult\022[\n\013submit_time\030\005 \001(" +
      "\0132\032.google.protobuf.TimestampB\036\310\336\037\000\362\336\037\022y" +
      "aml:\"submit_time\"\220\337\037\001R\nsubmitTime\022i\n\020dep" +
      "osit_end_time\030\006 \001(\0132\032.google.protobuf.Ti" +
      "mestampB#\310\336\037\000\362\336\037\027yaml:\"deposit_end_time\"" +
      "\220\337\037\001R\016depositEndTime\022\210\001\n\rtotal_deposit\030\007" +
      " \003(\0132\031.cosmos.base.v1beta1.CoinBH\310\336\037\000\362\336\037" +
      "\024yaml:\"total_deposit\"\252\337\037(github.com/cosm" +
      "os/cosmos-sdk/types.CoinsR\014totalDeposit\022" +
      "l\n\021voting_start_time\030\010 \001(\0132\032.google.prot" +
      "obuf.TimestampB$\310\336\037\000\362\336\037\030yaml:\"voting_sta" +
      "rt_time\"\220\337\037\001R\017votingStartTime\022f\n\017voting_" +
      "end_time\030\t \001(\0132\032.google.protobuf.Timesta" +
      "mpB\"\310\336\037\000\362\336\037\026yaml:\"voting_end_time\"\220\337\037\001R\r" +
      "votingEndTime:\004\350\240\037\001\"\310\002\n\013TallyResult\022@\n\003y" +
      "es\030\001 \001(\tB.\310\336\037\000\332\336\037&github.com/cosmos/cosm" +
      "os-sdk/types.IntR\003yes\022H\n\007abstain\030\002 \001(\tB." +
      "\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/typ" +
      "es.IntR\007abstain\022>\n\002no\030\003 \001(\tB.\310\336\037\000\332\336\037&git" +
      "hub.com/cosmos/cosmos-sdk/types.IntR\002no\022" +
      "g\n\014no_with_veto\030\004 \001(\tBE\310\336\037\000\332\336\037&github.co" +
      "m/cosmos/cosmos-sdk/types.Int\362\336\037\023yaml:\"n" +
      "o_with_veto\"R\nnoWithVeto:\004\350\240\037\001\"\343\001\n\004Vote\022" +
      "7\n\013proposal_id\030\001 \001(\004B\026\362\336\037\022yaml:\"proposal" +
      "_id\"R\nproposalId\022\024\n\005voter\030\002 \001(\tR\005voter\022:" +
      "\n\006option\030\003 \001(\0162\036.cosmos.gov.v1beta1.Vote" +
      "OptionB\002\030\001R\006option\022F\n\007options\030\004 \003(\0132&.co" +
      "smos.gov.v1beta1.WeightedVoteOptionB\004\310\336\037" +
      "\000R\007options:\010\230\240\037\000\350\240\037\000\"\276\002\n\rDepositParams\022\233" +
      "\001\n\013min_deposit\030\001 \003(\0132\031.cosmos.base.v1bet" +
      "a1.CoinB_\310\336\037\000\352\336\037\025min_deposit,omitempty\362\336" +
      "\037\022yaml:\"min_deposit\"\252\337\037(github.com/cosmo" +
      "s/cosmos-sdk/types.CoinsR\nminDeposit\022\216\001\n" +
      "\022max_deposit_period\030\002 \001(\0132\031.google.proto" +
      "buf.DurationBE\310\336\037\000\352\336\037\034max_deposit_period" +
      ",omitempty\362\336\037\031yaml:\"max_deposit_period\"\230" +
      "\337\037\001R\020maxDepositPeriod\"\213\001\n\014VotingParams\022{" +
      "\n\rvoting_period\030\001 \001(\0132\031.google.protobuf." +
      "DurationB;\310\336\037\000\352\336\037\027voting_period,omitempt" +
      "y\362\336\037\024yaml:\"voting_period\"\230\337\037\001R\014votingPer" +
      "iod\"\333\002\n\013TallyParams\022Z\n\006quorum\030\001 \001(\014BB\310\336\037" +
      "\000\332\336\037&github.com/cosmos/cosmos-sdk/types." +
      "Dec\352\336\037\020quorum,omitemptyR\006quorum\022c\n\tthres" +
      "hold\030\002 \001(\014BE\310\336\037\000\332\336\037&github.com/cosmos/co" +
      "smos-sdk/types.Dec\352\336\037\023threshold,omitempt" +
      "yR\tthreshold\022\212\001\n\016veto_threshold\030\003 \001(\014Bc\310" +
      "\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/type" +
      "s.Dec\352\336\037\030veto_threshold,omitempty\362\336\037\025yam" +
      "l:\"veto_threshold\"R\rvetoThreshold*\346\001\n\nVo" +
      "teOption\022,\n\027VOTE_OPTION_UNSPECIFIED\020\000\032\017\212" +
      "\235 \013OptionEmpty\022\"\n\017VOTE_OPTION_YES\020\001\032\r\212\235 " +
      "\tOptionYes\022*\n\023VOTE_OPTION_ABSTAIN\020\002\032\021\212\235 " +
      "\rOptionAbstain\022 \n\016VOTE_OPTION_NO\020\003\032\014\212\235 \010" +
      "OptionNo\0222\n\030VOTE_OPTION_NO_WITH_VETO\020\004\032\024" +
      "\212\235 \020OptionNoWithVeto\032\004\210\243\036\000*\314\002\n\016ProposalS" +
      "tatus\022.\n\033PROPOSAL_STATUS_UNSPECIFIED\020\000\032\r" +
      "\212\235 \tStatusNil\022;\n\036PROPOSAL_STATUS_DEPOSIT" +
      "_PERIOD\020\001\032\027\212\235 \023StatusDepositPeriod\0229\n\035PR" +
      "OPOSAL_STATUS_VOTING_PERIOD\020\002\032\026\212\235 \022Statu" +
      "sVotingPeriod\022,\n\026PROPOSAL_STATUS_PASSED\020" +
      "\003\032\020\212\235 \014StatusPassed\0220\n\030PROPOSAL_STATUS_R" +
      "EJECTED\020\004\032\022\212\235 \016StatusRejected\022,\n\026PROPOSA" +
      "L_STATUS_FAILED\020\005\032\020\212\235 \014StatusFailed\032\004\210\243\036" +
      "\000B\326\001\n\026com.cosmos.gov.v1beta1B\010GovProtoP\001" +
      "Z<github.com/AssetMantle/modules/cosmos/" +
      "gov/v1beta1;govv1beta1\242\002\003CGX\252\002\022Cosmos.Go" +
      "v.V1beta1\312\002\022Cosmos\\Gov\\V1beta1\342\002\036Cosmos\\" +
      "Gov\\V1beta1\\GPBMetadata\352\002\024Cosmos::Gov::V" +
      "1beta1\310\341\036\000\330\341\036\000\200\342\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_cosmos_gov_v1beta1_WeightedVoteOption_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_gov_v1beta1_WeightedVoteOption_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_WeightedVoteOption_descriptor,
        new String[] { "Option", "Weight", });
    internal_static_cosmos_gov_v1beta1_TextProposal_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_gov_v1beta1_TextProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_TextProposal_descriptor,
        new String[] { "Title", "Description", });
    internal_static_cosmos_gov_v1beta1_Deposit_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_gov_v1beta1_Deposit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_Deposit_descriptor,
        new String[] { "ProposalId", "Depositor", "Amount", });
    internal_static_cosmos_gov_v1beta1_Proposal_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cosmos_gov_v1beta1_Proposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_Proposal_descriptor,
        new String[] { "ProposalId", "Content", "Status", "FinalTallyResult", "SubmitTime", "DepositEndTime", "TotalDeposit", "VotingStartTime", "VotingEndTime", });
    internal_static_cosmos_gov_v1beta1_TallyResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_cosmos_gov_v1beta1_TallyResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_TallyResult_descriptor,
        new String[] { "Yes", "Abstain", "No", "NoWithVeto", });
    internal_static_cosmos_gov_v1beta1_Vote_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_cosmos_gov_v1beta1_Vote_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_Vote_descriptor,
        new String[] { "ProposalId", "Voter", "Option", "Options", });
    internal_static_cosmos_gov_v1beta1_DepositParams_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_cosmos_gov_v1beta1_DepositParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_DepositParams_descriptor,
        new String[] { "MinDeposit", "MaxDepositPeriod", });
    internal_static_cosmos_gov_v1beta1_VotingParams_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_cosmos_gov_v1beta1_VotingParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_VotingParams_descriptor,
        new String[] { "VotingPeriod", });
    internal_static_cosmos_gov_v1beta1_TallyParams_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_cosmos_gov_v1beta1_TallyParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_TallyParams_descriptor,
        new String[] { "Quorum", "Threshold", "VetoThreshold", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.acceptsInterface);
    registry.add(com.cosmos_proto.CosmosProto.implementsInterface);
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.enumvalueCustomname);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoEnumPrefix);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.goprotoStringerAll);
    registry.add(com.gogoproto.GogoProto.jsontag);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdduration);
    registry.add(com.gogoproto.GogoProto.stdtime);
    registry.add(com.gogoproto.GogoProto.stringerAll);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
