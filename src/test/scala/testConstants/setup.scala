package testConstants

import com.cosmos.base.v1beta1.Coin
import schema.id.base._
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
  val nubIdentityID: IdentityID = IdentityID("YJu7-vpLARPfNs5_yiuDLb8xkKcNYjqH6Yq4IfqubTY=")

  val identityClassificationID: ClassificationID = ClassificationID(HashID(utilities.Secrets.base64URLDecode("pDnfxVwBl0jjS1m-spl6wIOFSNi_v1xD9DRo1j3kyn0=")))
  val issuedIdentityID: IdentityID = IdentityID("W0p4YzyXwR5KT_q6RE_xUTMYe1b5cnKSG5tmUYwm61I=")

  val assetClassificationID: ClassificationID = ClassificationID(HashID(utilities.Secrets.base64URLDecode("jbjL_4o9eLgMuw0nrFebUs_ClhitVxdFytC_TkPBuYA=")))
  val assetID: AssetID = AssetID("TdsUrqD8gum-6yIE6InQ9XvT-y2v3IJEzz7GEOVbRMA=")

  val orderClassificationID: ClassificationID = ClassificationID("749Z0oWMLrQ5bBU5MEDA1T-qaXwc3rHNRcHOszM9Brs=")
  val orderID: OrderID = OrderID("XRXUoNNxF1S8HJP4UlYyOFFgkMcqBHdcm3WMrYAcgt8=")

  val provisionAddress: String = "mantle1433c99e73pw6dhm3jvjxfx7u0x03n2v2zqx826"
  val accountUrl = "https://localhost:1317/cosmos/auth/v1beta1/accounts/mantle1mz2xdlhzjsmmzcez7jq84r7xuzh22v4lkpj35t" //"http://localhost/1317/" + accountPath + "/"
}
