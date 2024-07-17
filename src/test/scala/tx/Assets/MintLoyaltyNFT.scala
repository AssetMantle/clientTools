
package tx.Assets

import com.google.protobuf
import org.bitcoinj.core.ECKey
import org.scalatest.funsuite.AnyFunSuite
import schema.data.base._
import schema.id.base.{ClassificationID, HashID, PropertyID, StringID}
import schema.list.PropertyList
import schema.property.base.{MesaProperty, MetaProperty}

class MintLoyaltyNFT extends AnyFunSuite {

  private def hexToByteArray(s: String) = s.sliding(2, 2).toArray.map(Integer.parseInt(_, 16).toByte)

  val a: Seq[(String, Array[Byte], String)] = Seq(
    ("https://assetmantle-marketplace-collections.s3.ap-south-1.amazonaws.com/803C8C529D4C79B6/nfts/636c103868f11bc679befeab9c3d17eb30e8c12d4b0b31008ea962cf30ae8b1a.jpg", hexToByteArray("636c103868f11bc679befeab9c3d17eb30e8c12d4b0b31008ea962cf30ae8b1a"), "jpg"),
    ("https://assetmantle-marketplace-collections.s3.ap-south-1.amazonaws.com/803C8C529D4C79B6/nfts/1802cdd900bda290c2985ea1946217fcf1f8c9c491682486a7d6cdadfabde432.jpg", hexToByteArray("1802cdd900bda290c2985ea1946217fcf1f8c9c491682486a7d6cdadfabde432"), "jpg"),
    ("https://assetmantle-marketplace-collections.s3.ap-south-1.amazonaws.com/803C8C529D4C79B6/nfts/fe2585e864592613cc84a073d9a7e0045762feb7281a2ba442eee8a3a2c52d65.jpg", hexToByteArray("fe2585e864592613cc84a073d9a7e0045762feb7281a2ba442eee8a3a2c52d65"), "jpg"),
    ("https://assetmantle-marketplace-collections.s3.ap-south-1.amazonaws.com/803C8C529D4C79B6/nfts/c7accd8d72d65823b88ede51f74483de32314339220b35272afe450496b6afa8.jpg", hexToByteArray("c7accd8d72d65823b88ede51f74483de32314339220b35272afe450496b6afa8"), "jpg"),
    ("https://assetmantle-marketplace-collections.s3.ap-south-1.amazonaws.com/803C8C529D4C79B6/nfts/7704ea41e493cd5283ee50e05bf7890078d22005210f10fd985f50b887f4445c.jpg", hexToByteArray("7704ea41e493cd5283ee50e05bf7890078d22005210f10fd985f50b887f4445c"), "jpg"),
    ("https://assetmantle-marketplace-collections.s3.ap-south-1.amazonaws.com/803C8C529D4C79B6/nfts/ea2a45487887fde3f33d7b64cdde2712b23b93ac598077f365ec6d1310c83de8.jpg", hexToByteArray("ea2a45487887fde3f33d7b64cdde2712b23b93ac598077f365ec6d1310c83de8"), "jpg"),
    ("https://assetmantle-marketplace-collections.s3.ap-south-1.amazonaws.com/C395A2ECE13B3B03/nfts/4ac4cfbdff16240e1e9786f05afb61015b939e18b3686de15f5f0381508312d4.png", hexToByteArray("4ac4cfbdff16240e1e9786f05afb61015b939e18b3686de15f5f0381508312d4"), "png"),
    ("https://assetmantle-marketplace-collections.s3.ap-south-1.amazonaws.com/C395A2ECE13B3B03/nfts/dccbf017b0310ba2838928451071c31062d9282a568155305c4479c8c97ef03c.png", hexToByteArray("dccbf017b0310ba2838928451071c31062d9282a568155305c4479c8c97ef03c"), "png"),
    ("https://assetmantle-marketplace-collections.s3.ap-south-1.amazonaws.com/C395A2ECE13B3B03/nfts/afb166bd900fa662783305aec3ba46ebbe2dfd3bcd2a5a0bde793542a2934141.png", hexToByteArray("afb166bd900fa662783305aec3ba46ebbe2dfd3bcd2a5a0bde793542a2934141"), "png"),
    ("https://assetmantle-marketplace-collections.s3.ap-south-1.amazonaws.com/C395A2ECE13B3B03/nfts/226fd44c0ac48d6db6b680c6e99e8434dada7caeaafd63709fb84a68cf0c204d.png", hexToByteArray("226fd44c0ac48d6db6b680c6e99e8434dada7caeaafd63709fb84a68cf0c204d"), "png"),
    ("https://assetmantle-marketplace-collections.s3.ap-south-1.amazonaws.com/C395A2ECE13B3B03/nfts/3a60d9d4fb2f950a4fe07cc1f7e393c3f42931bacd081cd937b905af98a56b83.png", hexToByteArray("3a60d9d4fb2f950a4fe07cc1f7e393c3f42931bacd081cd937b905af98a56b83"), "png"),
    ("https://assetmantle-marketplace-collections.s3.ap-south-1.amazonaws.com/C395A2ECE13B3B03/nfts/02ea287d087beb3e7a731383725f2e401ecd8c53be82c28980951750491e55c1.png", hexToByteArray("02ea287d087beb3e7a731383725f2e401ecd8c53be82c28980951750491e55c1"), "png")
  )

  val seq = 19
  val msgs: Seq[protobuf.Any] = a.zipWithIndex.map { case (x, i) =>
    val immutableMetaProperties: Seq[MetaProperty] = Seq(
      MetaProperty(id = PropertyID(keyID = StringID("name"), typeID = schema.data.constants.StringDataTypeID), data = StringData(i.toString)),
      MetaProperty(id = PropertyID(keyID = StringID("collectionName"), typeID = schema.data.constants.StringDataTypeID), data = StringData(if (i % 3 == 0) "Stellar" else if ((i % 3) == 1) "Cosmic" else "Lunar")),
      MetaProperty(id = PropertyID(keyID = StringID("resource"), typeID = schema.data.constants.LinkedDataTypeID), data = LinkedData(resourceID = HashID(x._2), extensionID = StringID(x._3), serviceEndpoint = x._1))
    )
    val classificationID: ClassificationID = ClassificationID("r1zSkPTnHlZQeZwHSok4HB-sBz0Gw56r-AVWBPjmPjk=")

    val immutableProperties: Seq[MesaProperty] = Seq()

    val mutableMetaProperties: Seq[MetaProperty] = Seq(
      schema.constants.Properties.BondAmountProperty.copy(data = NumberData(656)),
      schema.constants.Properties.SupplyProperty.copy(data = NumberData(1L))
    )
    val mutableProperties: Seq[MesaProperty] = Seq()
    val msg: protobuf.Any = utilities.BlockchainTransaction.getMintAssetMsgAsAny(
      fromAddress = testConstants.setup.balanceAccount.address,
      fromID = testConstants.setup.nubIdentityID.asProtoIdentityID,
      toID = testConstants.setup.nubIdentityID.asProtoIdentityID,
      classificationID = classificationID.asProtoClassificationID,
      immutableMetaProperties = PropertyList(immutableMetaProperties).asProtoPropertyList,
      immutableProperties = PropertyList(immutableProperties).asProtoPropertyList,
      mutableMetaProperties = PropertyList(mutableMetaProperties).asProtoPropertyList,
      mutableProperties = PropertyList(mutableProperties).asProtoPropertyList)
    msg
  }
  val txRawBytes: Array[Byte] = utilities.BlockchainTransaction.getTxRawBytes(messages = msgs, fee = testConstants.setup.amount, gasLimit = 1000000, accountNumber = testConstants.setup.accountNumber, sequence = seq, ecKey = ECKey.fromPrivate(testConstants.setup.balanceAccount.privateKey), chainID = testConstants.setup.chainId)
  println("0x" + utilities.Encoding.byteArrayToString(txRawBytes))
  println(utilities.Tx.doTx(txRawBytes))
}
