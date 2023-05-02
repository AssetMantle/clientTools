package constants

import org.bitcoinj.crypto.ChildNumber

object Blockchain {

  val AccountPrefix = "mantle"
  val ValidatorPrefix: String = AccountPrefix + "valoper"
  val ValidatorConsensusPublicPrefix: String = AccountPrefix + "valconspub"
  val CoinType = 118
  val DefaultHDPath: Seq[ChildNumber] = Seq(
    new ChildNumber(44, true),
    new ChildNumber(CoinType, true),
    new ChildNumber(0, true),
    new ChildNumber(0, false),
    new ChildNumber(0, false)
  )

  val IDSeparator = "."

  object PublicKey {
    val MULTI_SIG = "/cosmos.crypto.multisig.LegacyAminoPubKey"
    val SINGLE_SECP256K1 = "/cosmos.crypto.secp256k1.PubKey"
    val SINGLE_SECP256R1 = "/cosmos.crypto.secp256r1.PubKey"
    val VALIDATOR = "/cosmos.crypto.ed25519.PubKey"
  }

  object Account {
    val BASE = "/cosmos.auth.v1beta1.BaseAccount"
    val CONTINUOUS_VESTING = "/cosmos.vesting.v1beta1.ContinuousVestingAccount"
    val DELAYED_VESTING = "/cosmos.vesting.v1beta1.DelayedVestingAccount"
    val MODULE = "/cosmos.auth.v1beta1.ModuleAccount"
    val PERIODIC_VESTING = "/cosmos.vesting.v1beta1.PeriodicVestingAccount"
  }

  object ValidatorStatus {
    val BONDED = "BOND_STATUS_BONDED"
    val UNBONDED = "BOND_STATUS_UNBONDED"
    val UNBONDING = "BOND_STATUS_UNBONDING"
  }
}
