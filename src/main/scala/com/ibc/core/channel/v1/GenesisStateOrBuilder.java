// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/channel/v1/genesis.proto

package com.ibc.core.channel.v1;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.channel.v1.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .ibc.core.channel.v1.IdentifiedChannel channels = 1 [json_name = "channels", (.gogoproto.nullable) = false, (.gogoproto.casttype) = "IdentifiedChannel"];</code>
   */
  java.util.List<com.ibc.core.channel.v1.IdentifiedChannel> 
      getChannelsList();
  /**
   * <code>repeated .ibc.core.channel.v1.IdentifiedChannel channels = 1 [json_name = "channels", (.gogoproto.nullable) = false, (.gogoproto.casttype) = "IdentifiedChannel"];</code>
   */
  com.ibc.core.channel.v1.IdentifiedChannel getChannels(int index);
  /**
   * <code>repeated .ibc.core.channel.v1.IdentifiedChannel channels = 1 [json_name = "channels", (.gogoproto.nullable) = false, (.gogoproto.casttype) = "IdentifiedChannel"];</code>
   */
  int getChannelsCount();
  /**
   * <code>repeated .ibc.core.channel.v1.IdentifiedChannel channels = 1 [json_name = "channels", (.gogoproto.nullable) = false, (.gogoproto.casttype) = "IdentifiedChannel"];</code>
   */
  java.util.List<? extends com.ibc.core.channel.v1.IdentifiedChannelOrBuilder> 
      getChannelsOrBuilderList();
  /**
   * <code>repeated .ibc.core.channel.v1.IdentifiedChannel channels = 1 [json_name = "channels", (.gogoproto.nullable) = false, (.gogoproto.casttype) = "IdentifiedChannel"];</code>
   */
  com.ibc.core.channel.v1.IdentifiedChannelOrBuilder getChannelsOrBuilder(
      int index);

  /**
   * <code>repeated .ibc.core.channel.v1.PacketState acknowledgements = 2 [json_name = "acknowledgements", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.ibc.core.channel.v1.PacketState> 
      getAcknowledgementsList();
  /**
   * <code>repeated .ibc.core.channel.v1.PacketState acknowledgements = 2 [json_name = "acknowledgements", (.gogoproto.nullable) = false];</code>
   */
  com.ibc.core.channel.v1.PacketState getAcknowledgements(int index);
  /**
   * <code>repeated .ibc.core.channel.v1.PacketState acknowledgements = 2 [json_name = "acknowledgements", (.gogoproto.nullable) = false];</code>
   */
  int getAcknowledgementsCount();
  /**
   * <code>repeated .ibc.core.channel.v1.PacketState acknowledgements = 2 [json_name = "acknowledgements", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.ibc.core.channel.v1.PacketStateOrBuilder> 
      getAcknowledgementsOrBuilderList();
  /**
   * <code>repeated .ibc.core.channel.v1.PacketState acknowledgements = 2 [json_name = "acknowledgements", (.gogoproto.nullable) = false];</code>
   */
  com.ibc.core.channel.v1.PacketStateOrBuilder getAcknowledgementsOrBuilder(
      int index);

  /**
   * <code>repeated .ibc.core.channel.v1.PacketState commitments = 3 [json_name = "commitments", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.ibc.core.channel.v1.PacketState> 
      getCommitmentsList();
  /**
   * <code>repeated .ibc.core.channel.v1.PacketState commitments = 3 [json_name = "commitments", (.gogoproto.nullable) = false];</code>
   */
  com.ibc.core.channel.v1.PacketState getCommitments(int index);
  /**
   * <code>repeated .ibc.core.channel.v1.PacketState commitments = 3 [json_name = "commitments", (.gogoproto.nullable) = false];</code>
   */
  int getCommitmentsCount();
  /**
   * <code>repeated .ibc.core.channel.v1.PacketState commitments = 3 [json_name = "commitments", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.ibc.core.channel.v1.PacketStateOrBuilder> 
      getCommitmentsOrBuilderList();
  /**
   * <code>repeated .ibc.core.channel.v1.PacketState commitments = 3 [json_name = "commitments", (.gogoproto.nullable) = false];</code>
   */
  com.ibc.core.channel.v1.PacketStateOrBuilder getCommitmentsOrBuilder(
      int index);

  /**
   * <code>repeated .ibc.core.channel.v1.PacketState receipts = 4 [json_name = "receipts", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.ibc.core.channel.v1.PacketState> 
      getReceiptsList();
  /**
   * <code>repeated .ibc.core.channel.v1.PacketState receipts = 4 [json_name = "receipts", (.gogoproto.nullable) = false];</code>
   */
  com.ibc.core.channel.v1.PacketState getReceipts(int index);
  /**
   * <code>repeated .ibc.core.channel.v1.PacketState receipts = 4 [json_name = "receipts", (.gogoproto.nullable) = false];</code>
   */
  int getReceiptsCount();
  /**
   * <code>repeated .ibc.core.channel.v1.PacketState receipts = 4 [json_name = "receipts", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.ibc.core.channel.v1.PacketStateOrBuilder> 
      getReceiptsOrBuilderList();
  /**
   * <code>repeated .ibc.core.channel.v1.PacketState receipts = 4 [json_name = "receipts", (.gogoproto.nullable) = false];</code>
   */
  com.ibc.core.channel.v1.PacketStateOrBuilder getReceiptsOrBuilder(
      int index);

  /**
   * <code>repeated .ibc.core.channel.v1.PacketSequence send_sequences = 5 [json_name = "sendSequences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"send_sequences&#92;""];</code>
   */
  java.util.List<com.ibc.core.channel.v1.PacketSequence> 
      getSendSequencesList();
  /**
   * <code>repeated .ibc.core.channel.v1.PacketSequence send_sequences = 5 [json_name = "sendSequences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"send_sequences&#92;""];</code>
   */
  com.ibc.core.channel.v1.PacketSequence getSendSequences(int index);
  /**
   * <code>repeated .ibc.core.channel.v1.PacketSequence send_sequences = 5 [json_name = "sendSequences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"send_sequences&#92;""];</code>
   */
  int getSendSequencesCount();
  /**
   * <code>repeated .ibc.core.channel.v1.PacketSequence send_sequences = 5 [json_name = "sendSequences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"send_sequences&#92;""];</code>
   */
  java.util.List<? extends com.ibc.core.channel.v1.PacketSequenceOrBuilder> 
      getSendSequencesOrBuilderList();
  /**
   * <code>repeated .ibc.core.channel.v1.PacketSequence send_sequences = 5 [json_name = "sendSequences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"send_sequences&#92;""];</code>
   */
  com.ibc.core.channel.v1.PacketSequenceOrBuilder getSendSequencesOrBuilder(
      int index);

  /**
   * <code>repeated .ibc.core.channel.v1.PacketSequence recv_sequences = 6 [json_name = "recvSequences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"recv_sequences&#92;""];</code>
   */
  java.util.List<com.ibc.core.channel.v1.PacketSequence> 
      getRecvSequencesList();
  /**
   * <code>repeated .ibc.core.channel.v1.PacketSequence recv_sequences = 6 [json_name = "recvSequences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"recv_sequences&#92;""];</code>
   */
  com.ibc.core.channel.v1.PacketSequence getRecvSequences(int index);
  /**
   * <code>repeated .ibc.core.channel.v1.PacketSequence recv_sequences = 6 [json_name = "recvSequences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"recv_sequences&#92;""];</code>
   */
  int getRecvSequencesCount();
  /**
   * <code>repeated .ibc.core.channel.v1.PacketSequence recv_sequences = 6 [json_name = "recvSequences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"recv_sequences&#92;""];</code>
   */
  java.util.List<? extends com.ibc.core.channel.v1.PacketSequenceOrBuilder> 
      getRecvSequencesOrBuilderList();
  /**
   * <code>repeated .ibc.core.channel.v1.PacketSequence recv_sequences = 6 [json_name = "recvSequences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"recv_sequences&#92;""];</code>
   */
  com.ibc.core.channel.v1.PacketSequenceOrBuilder getRecvSequencesOrBuilder(
      int index);

  /**
   * <code>repeated .ibc.core.channel.v1.PacketSequence ack_sequences = 7 [json_name = "ackSequences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"ack_sequences&#92;""];</code>
   */
  java.util.List<com.ibc.core.channel.v1.PacketSequence> 
      getAckSequencesList();
  /**
   * <code>repeated .ibc.core.channel.v1.PacketSequence ack_sequences = 7 [json_name = "ackSequences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"ack_sequences&#92;""];</code>
   */
  com.ibc.core.channel.v1.PacketSequence getAckSequences(int index);
  /**
   * <code>repeated .ibc.core.channel.v1.PacketSequence ack_sequences = 7 [json_name = "ackSequences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"ack_sequences&#92;""];</code>
   */
  int getAckSequencesCount();
  /**
   * <code>repeated .ibc.core.channel.v1.PacketSequence ack_sequences = 7 [json_name = "ackSequences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"ack_sequences&#92;""];</code>
   */
  java.util.List<? extends com.ibc.core.channel.v1.PacketSequenceOrBuilder> 
      getAckSequencesOrBuilderList();
  /**
   * <code>repeated .ibc.core.channel.v1.PacketSequence ack_sequences = 7 [json_name = "ackSequences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"ack_sequences&#92;""];</code>
   */
  com.ibc.core.channel.v1.PacketSequenceOrBuilder getAckSequencesOrBuilder(
      int index);

  /**
   * <pre>
   * the sequence for the next generated channel identifier
   * </pre>
   *
   * <code>uint64 next_channel_sequence = 8 [json_name = "nextChannelSequence", (.gogoproto.moretags) = "yaml:&#92;"next_channel_sequence&#92;""];</code>
   * @return The nextChannelSequence.
   */
  long getNextChannelSequence();
}
