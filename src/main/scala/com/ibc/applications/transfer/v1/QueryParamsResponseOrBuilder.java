// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/transfer/v1/query.proto

package com.ibc.applications.transfer.v1;

public interface QueryParamsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.applications.transfer.v1.QueryParamsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * params defines the parameters of the module.
   * </pre>
   *
   * <code>.ibc.applications.transfer.v1.Params params = 1 [json_name = "params"];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <pre>
   * params defines the parameters of the module.
   * </pre>
   *
   * <code>.ibc.applications.transfer.v1.Params params = 1 [json_name = "params"];</code>
   * @return The params.
   */
  com.ibc.applications.transfer.v1.Params getParams();
  /**
   * <pre>
   * params defines the parameters of the module.
   * </pre>
   *
   * <code>.ibc.applications.transfer.v1.Params params = 1 [json_name = "params"];</code>
   */
  com.ibc.applications.transfer.v1.ParamsOrBuilder getParamsOrBuilder();
}
