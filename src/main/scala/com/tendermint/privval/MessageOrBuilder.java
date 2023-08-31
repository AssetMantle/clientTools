// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tendermint/privval/types.proto

package com.tendermint.privval;

public interface MessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tendermint.privval.Message)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tendermint.privval.PubKeyRequest pub_key_request = 1 [json_name = "pubKeyRequest"];</code>
   * @return Whether the pubKeyRequest field is set.
   */
  boolean hasPubKeyRequest();
  /**
   * <code>.tendermint.privval.PubKeyRequest pub_key_request = 1 [json_name = "pubKeyRequest"];</code>
   * @return The pubKeyRequest.
   */
  com.tendermint.privval.PubKeyRequest getPubKeyRequest();
  /**
   * <code>.tendermint.privval.PubKeyRequest pub_key_request = 1 [json_name = "pubKeyRequest"];</code>
   */
  com.tendermint.privval.PubKeyRequestOrBuilder getPubKeyRequestOrBuilder();

  /**
   * <code>.tendermint.privval.PubKeyResponse pub_key_response = 2 [json_name = "pubKeyResponse"];</code>
   * @return Whether the pubKeyResponse field is set.
   */
  boolean hasPubKeyResponse();
  /**
   * <code>.tendermint.privval.PubKeyResponse pub_key_response = 2 [json_name = "pubKeyResponse"];</code>
   * @return The pubKeyResponse.
   */
  com.tendermint.privval.PubKeyResponse getPubKeyResponse();
  /**
   * <code>.tendermint.privval.PubKeyResponse pub_key_response = 2 [json_name = "pubKeyResponse"];</code>
   */
  com.tendermint.privval.PubKeyResponseOrBuilder getPubKeyResponseOrBuilder();

  /**
   * <code>.tendermint.privval.SignVoteRequest sign_vote_request = 3 [json_name = "signVoteRequest"];</code>
   * @return Whether the signVoteRequest field is set.
   */
  boolean hasSignVoteRequest();
  /**
   * <code>.tendermint.privval.SignVoteRequest sign_vote_request = 3 [json_name = "signVoteRequest"];</code>
   * @return The signVoteRequest.
   */
  com.tendermint.privval.SignVoteRequest getSignVoteRequest();
  /**
   * <code>.tendermint.privval.SignVoteRequest sign_vote_request = 3 [json_name = "signVoteRequest"];</code>
   */
  com.tendermint.privval.SignVoteRequestOrBuilder getSignVoteRequestOrBuilder();

  /**
   * <code>.tendermint.privval.SignedVoteResponse signed_vote_response = 4 [json_name = "signedVoteResponse"];</code>
   * @return Whether the signedVoteResponse field is set.
   */
  boolean hasSignedVoteResponse();
  /**
   * <code>.tendermint.privval.SignedVoteResponse signed_vote_response = 4 [json_name = "signedVoteResponse"];</code>
   * @return The signedVoteResponse.
   */
  com.tendermint.privval.SignedVoteResponse getSignedVoteResponse();
  /**
   * <code>.tendermint.privval.SignedVoteResponse signed_vote_response = 4 [json_name = "signedVoteResponse"];</code>
   */
  com.tendermint.privval.SignedVoteResponseOrBuilder getSignedVoteResponseOrBuilder();

  /**
   * <code>.tendermint.privval.SignProposalRequest sign_proposal_request = 5 [json_name = "signProposalRequest"];</code>
   * @return Whether the signProposalRequest field is set.
   */
  boolean hasSignProposalRequest();
  /**
   * <code>.tendermint.privval.SignProposalRequest sign_proposal_request = 5 [json_name = "signProposalRequest"];</code>
   * @return The signProposalRequest.
   */
  com.tendermint.privval.SignProposalRequest getSignProposalRequest();
  /**
   * <code>.tendermint.privval.SignProposalRequest sign_proposal_request = 5 [json_name = "signProposalRequest"];</code>
   */
  com.tendermint.privval.SignProposalRequestOrBuilder getSignProposalRequestOrBuilder();

  /**
   * <code>.tendermint.privval.SignedProposalResponse signed_proposal_response = 6 [json_name = "signedProposalResponse"];</code>
   * @return Whether the signedProposalResponse field is set.
   */
  boolean hasSignedProposalResponse();
  /**
   * <code>.tendermint.privval.SignedProposalResponse signed_proposal_response = 6 [json_name = "signedProposalResponse"];</code>
   * @return The signedProposalResponse.
   */
  com.tendermint.privval.SignedProposalResponse getSignedProposalResponse();
  /**
   * <code>.tendermint.privval.SignedProposalResponse signed_proposal_response = 6 [json_name = "signedProposalResponse"];</code>
   */
  com.tendermint.privval.SignedProposalResponseOrBuilder getSignedProposalResponseOrBuilder();

  /**
   * <code>.tendermint.privval.PingRequest ping_request = 7 [json_name = "pingRequest"];</code>
   * @return Whether the pingRequest field is set.
   */
  boolean hasPingRequest();
  /**
   * <code>.tendermint.privval.PingRequest ping_request = 7 [json_name = "pingRequest"];</code>
   * @return The pingRequest.
   */
  com.tendermint.privval.PingRequest getPingRequest();
  /**
   * <code>.tendermint.privval.PingRequest ping_request = 7 [json_name = "pingRequest"];</code>
   */
  com.tendermint.privval.PingRequestOrBuilder getPingRequestOrBuilder();

  /**
   * <code>.tendermint.privval.PingResponse ping_response = 8 [json_name = "pingResponse"];</code>
   * @return Whether the pingResponse field is set.
   */
  boolean hasPingResponse();
  /**
   * <code>.tendermint.privval.PingResponse ping_response = 8 [json_name = "pingResponse"];</code>
   * @return The pingResponse.
   */
  com.tendermint.privval.PingResponse getPingResponse();
  /**
   * <code>.tendermint.privval.PingResponse ping_response = 8 [json_name = "pingResponse"];</code>
   */
  com.tendermint.privval.PingResponseOrBuilder getPingResponseOrBuilder();

  com.tendermint.privval.Message.SumCase getSumCase();
}