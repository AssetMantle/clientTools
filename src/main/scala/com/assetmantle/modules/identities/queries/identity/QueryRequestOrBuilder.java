// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identities/queries/identity/query_request.proto

package com.assetmantle.modules.identities.queries.identity;

public interface QueryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:assetmantle.modules.identities.queries.identity.QueryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.assetmantle.schema.ids.base.IdentityID identity_i_d = 1 [json_name = "identityID"];</code>
   * @return Whether the identityID field is set.
   */
  boolean hasIdentityID();
  /**
   * <code>.assetmantle.schema.ids.base.IdentityID identity_i_d = 1 [json_name = "identityID"];</code>
   * @return The identityID.
   */
  com.assetmantle.schema.ids.base.IdentityID getIdentityID();
  /**
   * <code>.assetmantle.schema.ids.base.IdentityID identity_i_d = 1 [json_name = "identityID"];</code>
   */
  com.assetmantle.schema.ids.base.IdentityIDOrBuilder getIdentityIDOrBuilder();
}