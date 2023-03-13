package TestSchema.TestData.Constants

import com.cosmos.base.v1beta1.Coin
import com.google.common.io.BaseEncoding.{base64, base64Url}
import schema.id.base.{AssetID, ClassificationID, HashID, IdentityID}

class Setup {
  def denom = "stake"

  def balanceSeeds: Array[String] = "april lady army royal budget exhibit rapid inhale detect autumn suffer grit fatigue gate minimum omit digital bind woman mix idea rapid turkey monkey".split(" ")
  def chainId = "test-chain-1"

  def balanceAccount = commonUtilities.Wallet.getWallet(balanceSeeds)

  def wallet1 = commonUtilities.Wallet.getRandomWallet
  def wallet2 = commonUtilities.Wallet.getRandomWallet

  def amount: Coin = Coin.newBuilder().setDenom(denom).setAmount("1000").build()

  def accountPath = "cosmos/auth/v1beta1/accounts"

  def secondaryIdentityID = IdentityID(HashID(base64Url().decode("BF4T-y714pGFqXC2zHI_McDZAdRhs-PNSolyu6MUEPo=")))

  def identityID = IdentityID(HashID(base64Url().decode("bi2i2mG0cJm61Soa9E3VzyYqmQDEcVs7DGAd4bkkqfk=")))

  def assetID = AssetID(HashID(base64Url().decode("mbil64D0TJZScClVWQLe8JlrmtqkTO6pMul9zfLFlBE=")))

  def classificationID = ClassificationID(HashID(base64Url().decode("b8kXKNMpPxApElF6Z80o6dyMvOtgBebJdG5CxdSHTwU=")))

  def accountUrl = "https://localhost:1317/cosmos/auth/v1beta1/accounts/mantle1mz2xdlhzjsmmzcez7jq84r7xuzh22v4lkpj35t" //"http://localhost/1317/" + accountPath + "/"
}
