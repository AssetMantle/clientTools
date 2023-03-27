// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/assets/internal/transactions/define/message.v1.proto

package com.assets.transactions.define;

public interface MessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:assets.transactions.define.Message)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string from = 1 [json_name = "from"];</code>
   * @return The from.
   */
  String getFrom();
  /**
   * <code>string from = 1 [json_name = "from"];</code>
   * @return The bytes for from.
   */
  com.google.protobuf.ByteString
      getFromBytes();

  /**
   * <code>.ids.IdentityID from_i_d = 2 [json_name = "fromID"];</code>
   * @return Whether the fromID field is set.
   */
  boolean hasFromID();
  /**
   * <code>.ids.IdentityID from_i_d = 2 [json_name = "fromID"];</code>
   * @return The fromID.
   */
  com.ids.IdentityID getFromID();
  /**
   * <code>.ids.IdentityID from_i_d = 2 [json_name = "fromID"];</code>
   */
  com.ids.IdentityIDOrBuilder getFromIDOrBuilder();

  /**
   * <code>.lists.PropertyList immutable_meta_properties = 3 [json_name = "immutableMetaProperties"];</code>
   * @return Whether the immutableMetaProperties field is set.
   */
  boolean hasImmutableMetaProperties();
  /**
   * <code>.lists.PropertyList immutable_meta_properties = 3 [json_name = "immutableMetaProperties"];</code>
   * @return The immutableMetaProperties.
   */
  com.lists.PropertyList getImmutableMetaProperties();
  /**
   * <code>.lists.PropertyList immutable_meta_properties = 3 [json_name = "immutableMetaProperties"];</code>
   */
  com.lists.PropertyListOrBuilder getImmutableMetaPropertiesOrBuilder();

  /**
   * <code>.lists.PropertyList immutable_properties = 4 [json_name = "immutableProperties"];</code>
   * @return Whether the immutableProperties field is set.
   */
  boolean hasImmutableProperties();
  /**
   * <code>.lists.PropertyList immutable_properties = 4 [json_name = "immutableProperties"];</code>
   * @return The immutableProperties.
   */
  com.lists.PropertyList getImmutableProperties();
  /**
   * <code>.lists.PropertyList immutable_properties = 4 [json_name = "immutableProperties"];</code>
   */
  com.lists.PropertyListOrBuilder getImmutablePropertiesOrBuilder();

  /**
   * <code>.lists.PropertyList mutable_meta_properties = 5 [json_name = "mutableMetaProperties"];</code>
   * @return Whether the mutableMetaProperties field is set.
   */
  boolean hasMutableMetaProperties();
  /**
   * <code>.lists.PropertyList mutable_meta_properties = 5 [json_name = "mutableMetaProperties"];</code>
   * @return The mutableMetaProperties.
   */
  com.lists.PropertyList getMutableMetaProperties();
  /**
   * <code>.lists.PropertyList mutable_meta_properties = 5 [json_name = "mutableMetaProperties"];</code>
   */
  com.lists.PropertyListOrBuilder getMutableMetaPropertiesOrBuilder();

  /**
   * <code>.lists.PropertyList mutable_properties = 6 [json_name = "mutableProperties"];</code>
   * @return Whether the mutableProperties field is set.
   */
  boolean hasMutableProperties();
  /**
   * <code>.lists.PropertyList mutable_properties = 6 [json_name = "mutableProperties"];</code>
   * @return The mutableProperties.
   */
  com.lists.PropertyList getMutableProperties();
  /**
   * <code>.lists.PropertyList mutable_properties = 6 [json_name = "mutableProperties"];</code>
   */
  com.lists.PropertyListOrBuilder getMutablePropertiesOrBuilder();
}
