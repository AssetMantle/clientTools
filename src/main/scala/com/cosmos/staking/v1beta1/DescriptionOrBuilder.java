// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/staking.proto

package com.cosmos.staking.v1beta1;

public interface DescriptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.staking.v1beta1.Description)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * moniker defines a human-readable name for the validator.
   * </pre>
   *
   * <code>string moniker = 1 [json_name = "moniker"];</code>
   * @return The moniker.
   */
  java.lang.String getMoniker();
  /**
   * <pre>
   * moniker defines a human-readable name for the validator.
   * </pre>
   *
   * <code>string moniker = 1 [json_name = "moniker"];</code>
   * @return The bytes for moniker.
   */
  com.google.protobuf.ByteString
      getMonikerBytes();

  /**
   * <pre>
   * identity defines an optional identity signature (ex. UPort or Keybase).
   * </pre>
   *
   * <code>string identity = 2 [json_name = "identity"];</code>
   * @return The identity.
   */
  java.lang.String getIdentity();
  /**
   * <pre>
   * identity defines an optional identity signature (ex. UPort or Keybase).
   * </pre>
   *
   * <code>string identity = 2 [json_name = "identity"];</code>
   * @return The bytes for identity.
   */
  com.google.protobuf.ByteString
      getIdentityBytes();

  /**
   * <pre>
   * website defines an optional website link.
   * </pre>
   *
   * <code>string website = 3 [json_name = "website"];</code>
   * @return The website.
   */
  java.lang.String getWebsite();
  /**
   * <pre>
   * website defines an optional website link.
   * </pre>
   *
   * <code>string website = 3 [json_name = "website"];</code>
   * @return The bytes for website.
   */
  com.google.protobuf.ByteString
      getWebsiteBytes();

  /**
   * <pre>
   * security_contact defines an optional email for security contact.
   * </pre>
   *
   * <code>string security_contact = 4 [json_name = "securityContact", (.gogoproto.moretags) = "yaml:&#92;"security_contact&#92;""];</code>
   * @return The securityContact.
   */
  java.lang.String getSecurityContact();
  /**
   * <pre>
   * security_contact defines an optional email for security contact.
   * </pre>
   *
   * <code>string security_contact = 4 [json_name = "securityContact", (.gogoproto.moretags) = "yaml:&#92;"security_contact&#92;""];</code>
   * @return The bytes for securityContact.
   */
  com.google.protobuf.ByteString
      getSecurityContactBytes();

  /**
   * <pre>
   * details define other optional details.
   * </pre>
   *
   * <code>string details = 5 [json_name = "details"];</code>
   * @return The details.
   */
  java.lang.String getDetails();
  /**
   * <pre>
   * details define other optional details.
   * </pre>
   *
   * <code>string details = 5 [json_name = "details"];</code>
   * @return The bytes for details.
   */
  com.google.protobuf.ByteString
      getDetailsBytes();
}
