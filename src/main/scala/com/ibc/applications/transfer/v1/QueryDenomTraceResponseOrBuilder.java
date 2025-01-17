// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/transfer/v1/query.proto

package com.ibc.applications.transfer.v1;

public interface QueryDenomTraceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.applications.transfer.v1.QueryDenomTraceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * denom_trace returns the requested denomination trace information.
   * </pre>
   *
   * <code>.ibc.applications.transfer.v1.DenomTrace denom_trace = 1 [json_name = "denomTrace"];</code>
   * @return Whether the denomTrace field is set.
   */
  boolean hasDenomTrace();
  /**
   * <pre>
   * denom_trace returns the requested denomination trace information.
   * </pre>
   *
   * <code>.ibc.applications.transfer.v1.DenomTrace denom_trace = 1 [json_name = "denomTrace"];</code>
   * @return The denomTrace.
   */
  com.ibc.applications.transfer.v1.DenomTrace getDenomTrace();
  /**
   * <pre>
   * denom_trace returns the requested denomination trace information.
   * </pre>
   *
   * <code>.ibc.applications.transfer.v1.DenomTrace denom_trace = 1 [json_name = "denomTrace"];</code>
   */
  com.ibc.applications.transfer.v1.DenomTraceOrBuilder getDenomTraceOrBuilder();
}
