package testConstants

import com.cosmos.base.v1beta1.Coin
import com.google.common.io.BaseEncoding.base64Url
import schema.id.base.{AssetID, ClassificationID, HashID, IdentityID}
import utilities.Wallet

object setup {
  val denom = "umntl"
  val chainRPC = "http://localhost:26657"
  val broadcastURI: String = chainRPC + "/broadcast_tx_sync?tx="
  val balanceSeeds: Array[String] = "april lady army royal budget exhibit rapid inhale detect autumn suffer grit fatigue gate minimum omit digital bind woman mix idea rapid turkey monkey".split(" ")
  val chainId = "test"
  val balanceAccount: Wallet = utilities.Wallet.getWallet(balanceSeeds)
  val accountNumber = 8
  val wallet1: Wallet = utilities.Wallet.getRandomWallet
  val wallet2: Wallet = utilities.Wallet.getRandomWallet
  val amount: Coin = Coin.newBuilder().setDenom(denom).setAmount("1000").build()
  val secondaryIdentityID: IdentityID = IdentityID(HashID(base64Url().decode("BF4T-y714pGFqXC2zHI_McDZAdRhs-PNSolyu6MUEPo=")))
  val identityID: IdentityID = IdentityID(HashID(base64Url().decode("bi2i2mG0cJm61Soa9E3VzyYqmQDEcVs7DGAd4bkkqfk=")))
  val assetID: AssetID = AssetID(HashID(base64Url().decode("mbil64D0TJZScClVWQLe8JlrmtqkTO6pMul9zfLFlBE=")))
  val classificationID: ClassificationID = ClassificationID(HashID(base64Url().decode("b8kXKNMpPxApElF6Z80o6dyMvOtgBebJdG5CxdSHTwU=")))
  val accountUrl = "https://localhost:1317/cosmos/auth/v1beta1/accounts/mantle1mz2xdlhzjsmmzcez7jq84r7xuzh22v4lkpj35t" //"http://localhost/1317/" + accountPath + "/"
}
