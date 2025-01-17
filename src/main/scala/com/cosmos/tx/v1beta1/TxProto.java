// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/tx/v1beta1/tx.proto

package com.cosmos.tx.v1beta1;

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
    internal_static_cosmos_tx_v1beta1_Tx_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_tx_v1beta1_Tx_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_tx_v1beta1_TxRaw_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_tx_v1beta1_TxRaw_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_tx_v1beta1_SignDoc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_tx_v1beta1_SignDoc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_tx_v1beta1_TxBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_tx_v1beta1_TxBody_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_tx_v1beta1_AuthInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_tx_v1beta1_AuthInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_tx_v1beta1_SignerInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_tx_v1beta1_SignerInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_tx_v1beta1_ModeInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_tx_v1beta1_ModeInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_tx_v1beta1_ModeInfo_Single_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_tx_v1beta1_ModeInfo_Single_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_tx_v1beta1_ModeInfo_Multi_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_tx_v1beta1_ModeInfo_Multi_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_tx_v1beta1_Fee_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_tx_v1beta1_Fee_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032cosmos/tx/v1beta1/tx.proto\022\021cosmos.tx." +
      "v1beta1\032\024gogoproto/gogo.proto\032-cosmos/cr" +
      "ypto/multisig/v1beta1/multisig.proto\032\036co" +
      "smos/base/v1beta1/coin.proto\032\'cosmos/tx/" +
      "signing/v1beta1/signing.proto\032\031google/pr" +
      "otobuf/any.proto\"\215\001\n\002Tx\022-\n\004body\030\001 \001(\0132\031." +
      "cosmos.tx.v1beta1.TxBodyR\004body\0228\n\tauth_i" +
      "nfo\030\002 \001(\0132\033.cosmos.tx.v1beta1.AuthInfoR\010" +
      "authInfo\022\036\n\nsignatures\030\003 \003(\014R\nsignatures" +
      "\"n\n\005TxRaw\022\035\n\nbody_bytes\030\001 \001(\014R\tbodyBytes" +
      "\022&\n\017auth_info_bytes\030\002 \001(\014R\rauthInfoBytes" +
      "\022\036\n\nsignatures\030\003 \003(\014R\nsignatures\"\222\001\n\007Sig" +
      "nDoc\022\035\n\nbody_bytes\030\001 \001(\014R\tbodyBytes\022&\n\017a" +
      "uth_info_bytes\030\002 \001(\014R\rauthInfoBytes\022\031\n\010c" +
      "hain_id\030\003 \001(\tR\007chainId\022%\n\016account_number" +
      "\030\004 \001(\004R\raccountNumber\"\225\002\n\006TxBody\0220\n\010mess" +
      "ages\030\001 \003(\0132\024.google.protobuf.AnyR\010messag" +
      "es\022\022\n\004memo\030\002 \001(\tR\004memo\022%\n\016timeout_height" +
      "\030\003 \001(\004R\rtimeoutHeight\022B\n\021extension_optio" +
      "ns\030\377\007 \003(\0132\024.google.protobuf.AnyR\020extensi" +
      "onOptions\022Z\n\036non_critical_extension_opti" +
      "ons\030\377\017 \003(\0132\024.google.protobuf.AnyR\033nonCri" +
      "ticalExtensionOptions\"v\n\010AuthInfo\022@\n\014sig" +
      "ner_infos\030\001 \003(\0132\035.cosmos.tx.v1beta1.Sign" +
      "erInfoR\013signerInfos\022(\n\003fee\030\002 \001(\0132\026.cosmo" +
      "s.tx.v1beta1.FeeR\003fee\"\227\001\n\nSignerInfo\0223\n\n" +
      "public_key\030\001 \001(\0132\024.google.protobuf.AnyR\t" +
      "publicKey\0228\n\tmode_info\030\002 \001(\0132\033.cosmos.tx" +
      ".v1beta1.ModeInfoR\010modeInfo\022\032\n\010sequence\030" +
      "\003 \001(\004R\010sequence\"\340\002\n\010ModeInfo\022<\n\006single\030\001" +
      " \001(\0132\".cosmos.tx.v1beta1.ModeInfo.Single" +
      "H\000R\006single\0229\n\005multi\030\002 \001(\0132!.cosmos.tx.v1" +
      "beta1.ModeInfo.MultiH\000R\005multi\032A\n\006Single\022" +
      "7\n\004mode\030\001 \001(\0162#.cosmos.tx.signing.v1beta" +
      "1.SignModeR\004mode\032\220\001\n\005Multi\022K\n\010bitarray\030\001" +
      " \001(\0132/.cosmos.crypto.multisig.v1beta1.Co" +
      "mpactBitArrayR\010bitarray\022:\n\nmode_infos\030\002 " +
      "\003(\0132\033.cosmos.tx.v1beta1.ModeInfoR\tmodeIn" +
      "fosB\005\n\003sum\"\267\001\n\003Fee\022c\n\006amount\030\001 \003(\0132\031.cos" +
      "mos.base.v1beta1.CoinB0\310\336\037\000\252\337\037(github.co" +
      "m/cosmos/cosmos-sdk/types.CoinsR\006amount\022" +
      "\033\n\tgas_limit\030\002 \001(\004R\010gasLimit\022\024\n\005payer\030\003 " +
      "\001(\tR\005payer\022\030\n\007granter\030\004 \001(\tR\007granterB\255\001\n" +
      "\025com.cosmos.tx.v1beta1B\007TxProtoP\001Z%githu" +
      "b.com/cosmos/cosmos-sdk/types/tx\242\002\003CTX\252\002" +
      "\021Cosmos.Tx.V1beta1\312\002\021Cosmos\\Tx\\V1beta1\342\002" +
      "\035Cosmos\\Tx\\V1beta1\\GPBMetadata\352\002\023Cosmos:" +
      ":Tx::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.crypto.multisig.v1beta1.MultisigProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.cosmos.tx.signing.v1beta1.SigningProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
        });
    internal_static_cosmos_tx_v1beta1_Tx_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_tx_v1beta1_Tx_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_tx_v1beta1_Tx_descriptor,
        new java.lang.String[] { "Body", "AuthInfo", "Signatures", });
    internal_static_cosmos_tx_v1beta1_TxRaw_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_tx_v1beta1_TxRaw_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_tx_v1beta1_TxRaw_descriptor,
        new java.lang.String[] { "BodyBytes", "AuthInfoBytes", "Signatures", });
    internal_static_cosmos_tx_v1beta1_SignDoc_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_tx_v1beta1_SignDoc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_tx_v1beta1_SignDoc_descriptor,
        new java.lang.String[] { "BodyBytes", "AuthInfoBytes", "ChainId", "AccountNumber", });
    internal_static_cosmos_tx_v1beta1_TxBody_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cosmos_tx_v1beta1_TxBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_tx_v1beta1_TxBody_descriptor,
        new java.lang.String[] { "Messages", "Memo", "TimeoutHeight", "ExtensionOptions", "NonCriticalExtensionOptions", });
    internal_static_cosmos_tx_v1beta1_AuthInfo_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_cosmos_tx_v1beta1_AuthInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_tx_v1beta1_AuthInfo_descriptor,
        new java.lang.String[] { "SignerInfos", "Fee", });
    internal_static_cosmos_tx_v1beta1_SignerInfo_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_cosmos_tx_v1beta1_SignerInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_tx_v1beta1_SignerInfo_descriptor,
        new java.lang.String[] { "PublicKey", "ModeInfo", "Sequence", });
    internal_static_cosmos_tx_v1beta1_ModeInfo_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_cosmos_tx_v1beta1_ModeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_tx_v1beta1_ModeInfo_descriptor,
        new java.lang.String[] { "Single", "Multi", "Sum", });
    internal_static_cosmos_tx_v1beta1_ModeInfo_Single_descriptor =
      internal_static_cosmos_tx_v1beta1_ModeInfo_descriptor.getNestedTypes().get(0);
    internal_static_cosmos_tx_v1beta1_ModeInfo_Single_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_tx_v1beta1_ModeInfo_Single_descriptor,
        new java.lang.String[] { "Mode", });
    internal_static_cosmos_tx_v1beta1_ModeInfo_Multi_descriptor =
      internal_static_cosmos_tx_v1beta1_ModeInfo_descriptor.getNestedTypes().get(1);
    internal_static_cosmos_tx_v1beta1_ModeInfo_Multi_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_tx_v1beta1_ModeInfo_Multi_descriptor,
        new java.lang.String[] { "Bitarray", "ModeInfos", });
    internal_static_cosmos_tx_v1beta1_Fee_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_cosmos_tx_v1beta1_Fee_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_tx_v1beta1_Fee_descriptor,
        new java.lang.String[] { "Amount", "GasLimit", "Payer", "Granter", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.crypto.multisig.v1beta1.MultisigProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.cosmos.tx.signing.v1beta1.SigningProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
