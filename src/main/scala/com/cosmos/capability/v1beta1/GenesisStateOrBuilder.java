// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/capability/v1beta1/genesis.proto

package com.cosmos.capability.v1beta1;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.capability.v1beta1.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * index is the capability global index.
   * </pre>
   *
   * <code>uint64 index = 1 [json_name = "index"];</code>
   * @return The index.
   */
  long getIndex();

  /**
   * <pre>
   * owners represents a map from index to owners of the capability index
   * index key is string to allow amino marshalling.
   * </pre>
   *
   * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [json_name = "owners", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.cosmos.capability.v1beta1.GenesisOwners> 
      getOwnersList();
  /**
   * <pre>
   * owners represents a map from index to owners of the capability index
   * index key is string to allow amino marshalling.
   * </pre>
   *
   * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [json_name = "owners", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.capability.v1beta1.GenesisOwners getOwners(int index);
  /**
   * <pre>
   * owners represents a map from index to owners of the capability index
   * index key is string to allow amino marshalling.
   * </pre>
   *
   * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [json_name = "owners", (.gogoproto.nullable) = false];</code>
   */
  int getOwnersCount();
  /**
   * <pre>
   * owners represents a map from index to owners of the capability index
   * index key is string to allow amino marshalling.
   * </pre>
   *
   * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [json_name = "owners", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.cosmos.capability.v1beta1.GenesisOwnersOrBuilder> 
      getOwnersOrBuilderList();
  /**
   * <pre>
   * owners represents a map from index to owners of the capability index
   * index key is string to allow amino marshalling.
   * </pre>
   *
   * <code>repeated .cosmos.capability.v1beta1.GenesisOwners owners = 2 [json_name = "owners", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.capability.v1beta1.GenesisOwnersOrBuilder getOwnersOrBuilder(
      int index);
}
