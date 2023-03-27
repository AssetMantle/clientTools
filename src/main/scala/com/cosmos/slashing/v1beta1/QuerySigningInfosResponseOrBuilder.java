// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/slashing/v1beta1/query.proto

package com.cosmos.slashing.v1beta1;

public interface QuerySigningInfosResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.slashing.v1beta1.QuerySigningInfosResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * info is the signing info of all validators
   * </pre>
   *
   * <code>repeated .cosmos.slashing.v1beta1.ValidatorSigningInfo info = 1 [json_name = "info", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<ValidatorSigningInfo>
      getInfoList();
  /**
   * <pre>
   * info is the signing info of all validators
   * </pre>
   *
   * <code>repeated .cosmos.slashing.v1beta1.ValidatorSigningInfo info = 1 [json_name = "info", (.gogoproto.nullable) = false];</code>
   */
  ValidatorSigningInfo getInfo(int index);
  /**
   * <pre>
   * info is the signing info of all validators
   * </pre>
   *
   * <code>repeated .cosmos.slashing.v1beta1.ValidatorSigningInfo info = 1 [json_name = "info", (.gogoproto.nullable) = false];</code>
   */
  int getInfoCount();
  /**
   * <pre>
   * info is the signing info of all validators
   * </pre>
   *
   * <code>repeated .cosmos.slashing.v1beta1.ValidatorSigningInfo info = 1 [json_name = "info", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends ValidatorSigningInfoOrBuilder>
      getInfoOrBuilderList();
  /**
   * <pre>
   * info is the signing info of all validators
   * </pre>
   *
   * <code>repeated .cosmos.slashing.v1beta1.ValidatorSigningInfo info = 1 [json_name = "info", (.gogoproto.nullable) = false];</code>
   */
  ValidatorSigningInfoOrBuilder getInfoOrBuilder(
      int index);

  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
