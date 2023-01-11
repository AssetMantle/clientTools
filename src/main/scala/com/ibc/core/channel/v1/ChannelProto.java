// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/channel/v1/channel.proto

package com.ibc.core.channel.v1;

public final class ChannelProto {
  private ChannelProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_channel_v1_Channel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_channel_v1_Channel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_channel_v1_IdentifiedChannel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_channel_v1_IdentifiedChannel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_channel_v1_Counterparty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_channel_v1_Counterparty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_channel_v1_Packet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_channel_v1_Packet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_channel_v1_PacketState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_channel_v1_PacketState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_core_channel_v1_Acknowledgement_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_core_channel_v1_Acknowledgement_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!ibc/core/channel/v1/channel.proto\022\023ibc" +
      ".core.channel.v1\032\024gogoproto/gogo.proto\032\037" +
      "ibc/core/client/v1/client.proto\"\245\002\n\007Chan" +
      "nel\0220\n\005state\030\001 \001(\0162\032.ibc.core.channel.v1" +
      ".StateR\005state\0226\n\010ordering\030\002 \001(\0162\032.ibc.co" +
      "re.channel.v1.OrderR\010ordering\022K\n\014counter" +
      "party\030\003 \001(\0132!.ibc.core.channel.v1.Counte" +
      "rpartyB\004\310\336\037\000R\014counterparty\022C\n\017connection" +
      "_hops\030\004 \003(\tB\032\362\336\037\026yaml:\"connection_hops\"R" +
      "\016connectionHops\022\030\n\007version\030\005 \001(\tR\007versio" +
      "n:\004\210\240\037\000\"\347\002\n\021IdentifiedChannel\0220\n\005state\030\001" +
      " \001(\0162\032.ibc.core.channel.v1.StateR\005state\022" +
      "6\n\010ordering\030\002 \001(\0162\032.ibc.core.channel.v1." +
      "OrderR\010ordering\022K\n\014counterparty\030\003 \001(\0132!." +
      "ibc.core.channel.v1.CounterpartyB\004\310\336\037\000R\014" +
      "counterparty\022C\n\017connection_hops\030\004 \003(\tB\032\362" +
      "\336\037\026yaml:\"connection_hops\"R\016connectionHop" +
      "s\022\030\n\007version\030\005 \001(\tR\007version\022\027\n\007port_id\030\006" +
      " \001(\tR\006portId\022\035\n\nchannel_id\030\007 \001(\tR\tchanne" +
      "lId:\004\210\240\037\000\"w\n\014Counterparty\022+\n\007port_id\030\001 \001" +
      "(\tB\022\362\336\037\016yaml:\"port_id\"R\006portId\0224\n\nchanne" +
      "l_id\030\002 \001(\tB\025\362\336\037\021yaml:\"channel_id\"R\tchann" +
      "elId:\004\210\240\037\000\"\377\003\n\006Packet\022\032\n\010sequence\030\001 \001(\004R" +
      "\010sequence\0227\n\013source_port\030\002 \001(\tB\026\362\336\037\022yaml" +
      ":\"source_port\"R\nsourcePort\022@\n\016source_cha" +
      "nnel\030\003 \001(\tB\031\362\336\037\025yaml:\"source_channel\"R\rs" +
      "ourceChannel\022F\n\020destination_port\030\004 \001(\tB\033" +
      "\362\336\037\027yaml:\"destination_port\"R\017destination" +
      "Port\022O\n\023destination_channel\030\005 \001(\tB\036\362\336\037\032y" +
      "aml:\"destination_channel\"R\022destinationCh" +
      "annel\022\022\n\004data\030\006 \001(\014R\004data\022`\n\016timeout_hei" +
      "ght\030\007 \001(\0132\032.ibc.core.client.v1.HeightB\035\310" +
      "\336\037\000\362\336\037\025yaml:\"timeout_height\"R\rtimeoutHei" +
      "ght\022I\n\021timeout_timestamp\030\010 \001(\004B\034\362\336\037\030yaml" +
      ":\"timeout_timestamp\"R\020timeoutTimestamp:\004" +
      "\210\240\037\000\"\246\001\n\013PacketState\022+\n\007port_id\030\001 \001(\tB\022\362" +
      "\336\037\016yaml:\"port_id\"R\006portId\0224\n\nchannel_id\030" +
      "\002 \001(\tB\025\362\336\037\021yaml:\"channel_id\"R\tchannelId\022" +
      "\032\n\010sequence\030\003 \001(\004R\010sequence\022\022\n\004data\030\004 \001(" +
      "\014R\004data:\004\210\240\037\000\"O\n\017Acknowledgement\022\030\n\006resu" +
      "lt\030\025 \001(\014H\000R\006result\022\026\n\005error\030\026 \001(\tH\000R\005err" +
      "orB\n\n\010response*\267\001\n\005State\0226\n\037STATE_UNINIT" +
      "IALIZED_UNSPECIFIED\020\000\032\021\212\235 \rUNINITIALIZED" +
      "\022\030\n\nSTATE_INIT\020\001\032\010\212\235 \004INIT\022\036\n\rSTATE_TRYO" +
      "PEN\020\002\032\013\212\235 \007TRYOPEN\022\030\n\nSTATE_OPEN\020\003\032\010\212\235 \004" +
      "OPEN\022\034\n\014STATE_CLOSED\020\004\032\n\212\235 \006CLOSED\032\004\210\243\036\000" +
      "*w\n\005Order\022$\n\026ORDER_NONE_UNSPECIFIED\020\000\032\010\212" +
      "\235 \004NONE\022\"\n\017ORDER_UNORDERED\020\001\032\r\212\235 \tUNORDE" +
      "RED\022\036\n\rORDER_ORDERED\020\002\032\013\212\235 \007ORDERED\032\004\210\243\036" +
      "\000B\324\001\n\027com.ibc.core.channel.v1B\014ChannelPr" +
      "otoP\001Z<github.com/AssetMantle/modules/ib" +
      "c/core/channel/v1;channelv1\242\002\003ICC\252\002\023Ibc." +
      "Core.Channel.V1\312\002\023Ibc\\Core\\Channel\\V1\342\002\037" +
      "Ibc\\Core\\Channel\\V1\\GPBMetadata\352\002\026Ibc::C" +
      "ore::Channel::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.ibc.core.client.v1.ClientProto.getDescriptor(),
        });
    internal_static_ibc_core_channel_v1_Channel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ibc_core_channel_v1_Channel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_channel_v1_Channel_descriptor,
        new java.lang.String[] { "State", "Ordering", "Counterparty", "ConnectionHops", "Version", });
    internal_static_ibc_core_channel_v1_IdentifiedChannel_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ibc_core_channel_v1_IdentifiedChannel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_channel_v1_IdentifiedChannel_descriptor,
        new java.lang.String[] { "State", "Ordering", "Counterparty", "ConnectionHops", "Version", "PortId", "ChannelId", });
    internal_static_ibc_core_channel_v1_Counterparty_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ibc_core_channel_v1_Counterparty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_channel_v1_Counterparty_descriptor,
        new java.lang.String[] { "PortId", "ChannelId", });
    internal_static_ibc_core_channel_v1_Packet_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ibc_core_channel_v1_Packet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_channel_v1_Packet_descriptor,
        new java.lang.String[] { "Sequence", "SourcePort", "SourceChannel", "DestinationPort", "DestinationChannel", "Data", "TimeoutHeight", "TimeoutTimestamp", });
    internal_static_ibc_core_channel_v1_PacketState_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ibc_core_channel_v1_PacketState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_channel_v1_PacketState_descriptor,
        new java.lang.String[] { "PortId", "ChannelId", "Sequence", "Data", });
    internal_static_ibc_core_channel_v1_Acknowledgement_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ibc_core_channel_v1_Acknowledgement_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_core_channel_v1_Acknowledgement_descriptor,
        new java.lang.String[] { "Result", "Error", "Response", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.enumvalueCustomname);
    registry.add(com.gogoproto.GogoProto.goprotoEnumPrefix);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.ibc.core.client.v1.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
