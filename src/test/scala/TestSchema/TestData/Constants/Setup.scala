package TestSchema.TestData.Constants

import com.cosmos.base.v1beta1.Coin

class Setup {
  def denom = "umntl"

  def balanceSeeds: Array[String] = "april lady army royal budget exhibit rapid inhale detect autumn suffer grit fatigue gate minimum omit digital bind woman mix idea rapid turkey monkey".split(" ")
  def chainId = "test-mantle-2"

  def balanceAccount = commonUtilities.Wallet.getWallet(balanceSeeds)

  def wallet1 = commonUtilities.Wallet.getRandomWallet
  def wallet2 = commonUtilities.Wallet.getRandomWallet

  def amount: Coin = Coin.newBuilder().setDenom(denom).setAmount("1000").build()

  def accountPath = "cosmos/auth/v1beta1/accounts"

  def accountUrl = "https://rest.testnet.assetmantle.one:443/cosmos/auth/v1beta1/accounts/mantle1pkkayn066msg6kn33wnl5srhdt3tnu2vuet86j" //"http://localhost/1317/" + accountPath + "/"
}
