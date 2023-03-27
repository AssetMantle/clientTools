// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: modules/classifications/internal/genesis/genesis.v1.proto

package com.classifications;

public interface GenesisOrBuilder extends
    // @@protoc_insertion_point(interface_extends:classifications.Genesis)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .classifications.Mappable mappables = 1 [json_name = "mappables"];</code>
   */
  java.util.List<Mappable>
      getMappablesList();
  /**
   * <code>repeated .classifications.Mappable mappables = 1 [json_name = "mappables"];</code>
   */
  Mappable getMappables(int index);
  /**
   * <code>repeated .classifications.Mappable mappables = 1 [json_name = "mappables"];</code>
   */
  int getMappablesCount();
  /**
   * <code>repeated .classifications.Mappable mappables = 1 [json_name = "mappables"];</code>
   */
  java.util.List<? extends MappableOrBuilder>
      getMappablesOrBuilderList();
  /**
   * <code>repeated .classifications.Mappable mappables = 1 [json_name = "mappables"];</code>
   */
  MappableOrBuilder getMappablesOrBuilder(
      int index);

  /**
   * <code>.parameters.ParameterList parameterList = 2 [json_name = "parameterList"];</code>
   * @return Whether the parameterList field is set.
   */
  boolean hasParameterList();
  /**
   * <code>.parameters.ParameterList parameterList = 2 [json_name = "parameterList"];</code>
   * @return The parameterList.
   */
  com.parameters.ParameterList getParameterList();
  /**
   * <code>.parameters.ParameterList parameterList = 2 [json_name = "parameterList"];</code>
   */
  com.parameters.ParameterListOrBuilder getParameterListOrBuilder();
}
