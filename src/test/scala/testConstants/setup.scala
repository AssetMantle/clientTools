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
  val accountNumber = 7
  val wallet1: Wallet = utilities.Wallet.getRandomWallet
  val wallet2: Wallet = utilities.Wallet.getRandomWallet
  val amount: Coin = Coin.newBuilder().setDenom(denom).setAmount("1000").build()
  val nubIdentityID: IdentityID = IdentityID(HashID(utilities.Secrets.base64URLDecode("YJu7-vpLARPfNs5_yiuDLb8xkKcNYjqH6Yq4IfqubTY=")))
  val assetClassificationID: ClassificationID = ClassificationID(HashID(utilities.Secrets.base64URLDecode("F9qhMX7DY9wR4ef0H9G7AkbXhO6dBZ0upQfY5YjJwdA=")))
  val identityClassificationID: ClassificationID = ClassificationID(HashID(utilities.Secrets.base64URLDecode("csDEQs6t38afuKucjrwilmD3hD3taCYSpaSzsMejbrs=")))
  val orderClassificationID: ClassificationID = ClassificationID(HashID(utilities.Secrets.base64URLDecode("ysq34ii4orui3lTGlLnrBrZpur4gj0wl_bX8Ku-H6KU=")))
  val issuedIdentityID: IdentityID = IdentityID(HashID(utilities.Secrets.base64URLDecode("eT5bl48-Kv8ztLB3Ulz63jIaWY28wjQFIVAODPtvvAs=")))
  val assetID: AssetID = AssetID(HashID(utilities.Secrets.base64URLDecode("s72oh5rJchCMgaK4Ujx0qvooRGvzWaj19iB-fQ3r2Cc=")))
  val accountUrl = "https://localhost:1317/cosmos/auth/v1beta1/accounts/mantle1mz2xdlhzjsmmzcez7jq84r7xuzh22v4lkpj35t" //"http://localhost/1317/" + accountPath + "/"
}