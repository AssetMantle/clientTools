// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/v1beta1/bank.proto

package com.cosmos.bank.v1beta1;

public interface DenomUnitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.bank.v1beta1.DenomUnit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * denom represents the string name of the given denom unit (e.g uatom).
   * </pre>
   *
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <pre>
   * denom represents the string name of the given denom unit (e.g uatom).
   * </pre>
   *
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();

  /**
   * <pre>
   * exponent represents power of 10 exponent that one must
   * raise the base_denom to in order to equal the given DenomUnit's denom
   * 1 denom = 1^exponent base_denom
   * (e.g. with a base_denom of uatom, one can create a DenomUnit of 'atom' with
   * exponent = 6, thus: 1 atom = 10^6 uatom).
   * </pre>
   *
   * <code>uint32 exponent = 2 [json_name = "exponent"];</code>
   * @return The exponent.
   */
  int getExponent();

  /**
   * <pre>
   * aliases is a list of string aliases for the given denom
   * </pre>
   *
   * <code>repeated string aliases = 3 [json_name = "aliases"];</code>
   * @return A list containing the aliases.
   */
  java.util.List<java.lang.String>
      getAliasesList();
  /**
   * <pre>
   * aliases is a list of string aliases for the given denom
   * </pre>
   *
   * <code>repeated string aliases = 3 [json_name = "aliases"];</code>
   * @return The count of aliases.
   */
  int getAliasesCount();
  /**
   * <pre>
   * aliases is a list of string aliases for the given denom
   * </pre>
   *
   * <code>repeated string aliases = 3 [json_name = "aliases"];</code>
   * @param index The index of the element to return.
   * @return The aliases at the given index.
   */
  java.lang.String getAliases(int index);
  /**
   * <pre>
   * aliases is a list of string aliases for the given denom
   * </pre>
   *
   * <code>repeated string aliases = 3 [json_name = "aliases"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the aliases at the given index.
   */
  com.google.protobuf.ByteString
      getAliasesBytes(int index);
}
