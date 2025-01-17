// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/query.proto

package com.cosmos.gov.v1beta1;

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
    internal_static_cosmos_gov_v1beta1_QueryProposalRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryProposalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryProposalResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryProposalResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryProposalsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryProposalsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryProposalsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryProposalsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryVoteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryVoteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryVoteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryVoteResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryVotesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryVotesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryVotesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryVotesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryParamsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryParamsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryParamsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryDepositRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryDepositRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryDepositResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryDepositResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryDepositsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryDepositsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryDepositsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryDepositsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryTallyResultRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryTallyResultRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_QueryTallyResultResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_QueryTallyResultResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036cosmos/gov/v1beta1/query.proto\022\022cosmos" +
      ".gov.v1beta1\032*cosmos/base/query/v1beta1/" +
      "pagination.proto\032\024gogoproto/gogo.proto\032\034" +
      "google/api/annotations.proto\032\034cosmos/gov" +
      "/v1beta1/gov.proto\"7\n\024QueryProposalReque" +
      "st\022\037\n\013proposal_id\030\001 \001(\004R\nproposalId\"W\n\025Q" +
      "ueryProposalResponse\022>\n\010proposal\030\001 \001(\0132\034" +
      ".cosmos.gov.v1beta1.ProposalB\004\310\336\037\000R\010prop" +
      "osal\"\352\001\n\025QueryProposalsRequest\022K\n\017propos" +
      "al_status\030\001 \001(\0162\".cosmos.gov.v1beta1.Pro" +
      "posalStatusR\016proposalStatus\022\024\n\005voter\030\002 \001" +
      "(\tR\005voter\022\034\n\tdepositor\030\003 \001(\tR\tdepositor\022" +
      "F\n\npagination\030\004 \001(\0132&.cosmos.base.query." +
      "v1beta1.PageRequestR\npagination:\010\210\240\037\000\350\240\037" +
      "\000\"\243\001\n\026QueryProposalsResponse\022@\n\tproposal" +
      "s\030\001 \003(\0132\034.cosmos.gov.v1beta1.ProposalB\004\310" +
      "\336\037\000R\tproposals\022G\n\npagination\030\002 \001(\0132\'.cos" +
      "mos.base.query.v1beta1.PageResponseR\npag" +
      "ination\"S\n\020QueryVoteRequest\022\037\n\013proposal_" +
      "id\030\001 \001(\004R\nproposalId\022\024\n\005voter\030\002 \001(\tR\005vot" +
      "er:\010\210\240\037\000\350\240\037\000\"G\n\021QueryVoteResponse\0222\n\004vot" +
      "e\030\001 \001(\0132\030.cosmos.gov.v1beta1.VoteB\004\310\336\037\000R" +
      "\004vote\"|\n\021QueryVotesRequest\022\037\n\013proposal_i" +
      "d\030\001 \001(\004R\nproposalId\022F\n\npagination\030\002 \001(\0132" +
      "&.cosmos.base.query.v1beta1.PageRequestR" +
      "\npagination\"\223\001\n\022QueryVotesResponse\0224\n\005vo" +
      "tes\030\001 \003(\0132\030.cosmos.gov.v1beta1.VoteB\004\310\336\037" +
      "\000R\005votes\022G\n\npagination\030\002 \001(\0132\'.cosmos.ba" +
      "se.query.v1beta1.PageResponseR\npaginatio" +
      "n\"5\n\022QueryParamsRequest\022\037\n\013params_type\030\001" +
      " \001(\tR\nparamsType\"\374\001\n\023QueryParamsResponse" +
      "\022K\n\rvoting_params\030\001 \001(\0132 .cosmos.gov.v1b" +
      "eta1.VotingParamsB\004\310\336\037\000R\014votingParams\022N\n" +
      "\016deposit_params\030\002 \001(\0132!.cosmos.gov.v1bet" +
      "a1.DepositParamsB\004\310\336\037\000R\rdepositParams\022H\n" +
      "\014tally_params\030\003 \001(\0132\037.cosmos.gov.v1beta1" +
      ".TallyParamsB\004\310\336\037\000R\013tallyParams\"^\n\023Query" +
      "DepositRequest\022\037\n\013proposal_id\030\001 \001(\004R\npro" +
      "posalId\022\034\n\tdepositor\030\002 \001(\tR\tdepositor:\010\210" +
      "\240\037\000\350\240\037\000\"S\n\024QueryDepositResponse\022;\n\007depos" +
      "it\030\001 \001(\0132\033.cosmos.gov.v1beta1.DepositB\004\310" +
      "\336\037\000R\007deposit\"\177\n\024QueryDepositsRequest\022\037\n\013" +
      "proposal_id\030\001 \001(\004R\nproposalId\022F\n\npaginat" +
      "ion\030\002 \001(\0132&.cosmos.base.query.v1beta1.Pa" +
      "geRequestR\npagination\"\237\001\n\025QueryDepositsR" +
      "esponse\022=\n\010deposits\030\001 \003(\0132\033.cosmos.gov.v" +
      "1beta1.DepositB\004\310\336\037\000R\010deposits\022G\n\npagina" +
      "tion\030\002 \001(\0132\'.cosmos.base.query.v1beta1.P" +
      "ageResponseR\npagination\":\n\027QueryTallyRes" +
      "ultRequest\022\037\n\013proposal_id\030\001 \001(\004R\nproposa" +
      "lId\"W\n\030QueryTallyResultResponse\022;\n\005tally" +
      "\030\001 \001(\0132\037.cosmos.gov.v1beta1.TallyResultB" +
      "\004\310\336\037\000R\005tally2\324\t\n\005Query\022\224\001\n\010Proposal\022(.co" +
      "smos.gov.v1beta1.QueryProposalRequest\032)." +
      "cosmos.gov.v1beta1.QueryProposalResponse" +
      "\"3\202\323\344\223\002-\022+/cosmos/gov/v1beta1/proposals/" +
      "{proposal_id}\022\211\001\n\tProposals\022).cosmos.gov" +
      ".v1beta1.QueryProposalsRequest\032*.cosmos." +
      "gov.v1beta1.QueryProposalsResponse\"%\202\323\344\223" +
      "\002\037\022\035/cosmos/gov/v1beta1/proposals\022\226\001\n\004Vo" +
      "te\022$.cosmos.gov.v1beta1.QueryVoteRequest" +
      "\032%.cosmos.gov.v1beta1.QueryVoteResponse\"" +
      "A\202\323\344\223\002;\0229/cosmos/gov/v1beta1/proposals/{" +
      "proposal_id}/votes/{voter}\022\221\001\n\005Votes\022%.c" +
      "osmos.gov.v1beta1.QueryVotesRequest\032&.co" +
      "smos.gov.v1beta1.QueryVotesResponse\"9\202\323\344" +
      "\223\0023\0221/cosmos/gov/v1beta1/proposals/{prop" +
      "osal_id}/votes\022\213\001\n\006Params\022&.cosmos.gov.v" +
      "1beta1.QueryParamsRequest\032\'.cosmos.gov.v" +
      "1beta1.QueryParamsResponse\"0\202\323\344\223\002*\022(/cos" +
      "mos/gov/v1beta1/params/{params_type}\022\246\001\n" +
      "\007Deposit\022\'.cosmos.gov.v1beta1.QueryDepos" +
      "itRequest\032(.cosmos.gov.v1beta1.QueryDepo" +
      "sitResponse\"H\202\323\344\223\002B\022@/cosmos/gov/v1beta1" +
      "/proposals/{proposal_id}/deposits/{depos" +
      "itor}\022\235\001\n\010Deposits\022(.cosmos.gov.v1beta1." +
      "QueryDepositsRequest\032).cosmos.gov.v1beta" +
      "1.QueryDepositsResponse\"<\202\323\344\223\0026\0224/cosmos" +
      "/gov/v1beta1/proposals/{proposal_id}/dep" +
      "osits\022\243\001\n\013TallyResult\022+.cosmos.gov.v1bet" +
      "a1.QueryTallyResultRequest\032,.cosmos.gov." +
      "v1beta1.QueryTallyResultResponse\"9\202\323\344\223\0023" +
      "\0221/cosmos/gov/v1beta1/proposals/{proposa" +
      "l_id}/tallyB\270\001\n\026com.cosmos.gov.v1beta1B\n" +
      "QueryProtoP\001Z(github.com/cosmos/cosmos-s" +
      "dk/x/gov/types\242\002\003CGX\252\002\022Cosmos.Gov.V1beta" +
      "1\312\002\022Cosmos\\Gov\\V1beta1\342\002\036Cosmos\\Gov\\V1be" +
      "ta1\\GPBMetadata\352\002\024Cosmos::Gov::V1beta1b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.cosmos.gov.v1beta1.GovProto.getDescriptor(),
        });
    internal_static_cosmos_gov_v1beta1_QueryProposalRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_gov_v1beta1_QueryProposalRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryProposalRequest_descriptor,
        new java.lang.String[] { "ProposalId", });
    internal_static_cosmos_gov_v1beta1_QueryProposalResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_gov_v1beta1_QueryProposalResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryProposalResponse_descriptor,
        new java.lang.String[] { "Proposal", });
    internal_static_cosmos_gov_v1beta1_QueryProposalsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_gov_v1beta1_QueryProposalsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryProposalsRequest_descriptor,
        new java.lang.String[] { "ProposalStatus", "Voter", "Depositor", "Pagination", });
    internal_static_cosmos_gov_v1beta1_QueryProposalsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cosmos_gov_v1beta1_QueryProposalsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryProposalsResponse_descriptor,
        new java.lang.String[] { "Proposals", "Pagination", });
    internal_static_cosmos_gov_v1beta1_QueryVoteRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_cosmos_gov_v1beta1_QueryVoteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryVoteRequest_descriptor,
        new java.lang.String[] { "ProposalId", "Voter", });
    internal_static_cosmos_gov_v1beta1_QueryVoteResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_cosmos_gov_v1beta1_QueryVoteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryVoteResponse_descriptor,
        new java.lang.String[] { "Vote", });
    internal_static_cosmos_gov_v1beta1_QueryVotesRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_cosmos_gov_v1beta1_QueryVotesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryVotesRequest_descriptor,
        new java.lang.String[] { "ProposalId", "Pagination", });
    internal_static_cosmos_gov_v1beta1_QueryVotesResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_cosmos_gov_v1beta1_QueryVotesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryVotesResponse_descriptor,
        new java.lang.String[] { "Votes", "Pagination", });
    internal_static_cosmos_gov_v1beta1_QueryParamsRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_cosmos_gov_v1beta1_QueryParamsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryParamsRequest_descriptor,
        new java.lang.String[] { "ParamsType", });
    internal_static_cosmos_gov_v1beta1_QueryParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_cosmos_gov_v1beta1_QueryParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryParamsResponse_descriptor,
        new java.lang.String[] { "VotingParams", "DepositParams", "TallyParams", });
    internal_static_cosmos_gov_v1beta1_QueryDepositRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_cosmos_gov_v1beta1_QueryDepositRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryDepositRequest_descriptor,
        new java.lang.String[] { "ProposalId", "Depositor", });
    internal_static_cosmos_gov_v1beta1_QueryDepositResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_cosmos_gov_v1beta1_QueryDepositResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryDepositResponse_descriptor,
        new java.lang.String[] { "Deposit", });
    internal_static_cosmos_gov_v1beta1_QueryDepositsRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_cosmos_gov_v1beta1_QueryDepositsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryDepositsRequest_descriptor,
        new java.lang.String[] { "ProposalId", "Pagination", });
    internal_static_cosmos_gov_v1beta1_QueryDepositsResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_cosmos_gov_v1beta1_QueryDepositsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryDepositsResponse_descriptor,
        new java.lang.String[] { "Deposits", "Pagination", });
    internal_static_cosmos_gov_v1beta1_QueryTallyResultRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_cosmos_gov_v1beta1_QueryTallyResultRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryTallyResultRequest_descriptor,
        new java.lang.String[] { "ProposalId", });
    internal_static_cosmos_gov_v1beta1_QueryTallyResultResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_cosmos_gov_v1beta1_QueryTallyResultResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_QueryTallyResultResponse_descriptor,
        new java.lang.String[] { "Tally", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.cosmos.gov.v1beta1.GovProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
