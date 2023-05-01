// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: orders/genesis/genesis.proto

package com.assetmantle.modules.orders.genesis;

public interface GenesisOrBuilder extends
    // @@protoc_insertion_point(interface_extends:assetmantle.modules.orders.genesis.Genesis)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .assetmantle.modules.orders.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
   */
  java.util.List<com.assetmantle.modules.orders.mappable.Mappable> 
      getMappablesList();
  /**
   * <code>repeated .assetmantle.modules.orders.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
   */
  com.assetmantle.modules.orders.mappable.Mappable getMappables(int index);
  /**
   * <code>repeated .assetmantle.modules.orders.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
   */
  int getMappablesCount();
  /**
   * <code>repeated .assetmantle.modules.orders.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
   */
  java.util.List<? extends com.assetmantle.modules.orders.mappable.MappableOrBuilder> 
      getMappablesOrBuilderList();
  /**
   * <code>repeated .assetmantle.modules.orders.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
   */
  com.assetmantle.modules.orders.mappable.MappableOrBuilder getMappablesOrBuilder(
      int index);

  /**
   * <code>.assetmantle.schema.parameters.base.ParameterList parameter_list = 2 [json_name = "parameterList"];</code>
   * @return Whether the parameterList field is set.
   */
  boolean hasParameterList();
  /**
   * <code>.assetmantle.schema.parameters.base.ParameterList parameter_list = 2 [json_name = "parameterList"];</code>
   * @return The parameterList.
   */
  com.assetmantle.schema.parameters.base.ParameterList getParameterList();
  /**
   * <code>.assetmantle.schema.parameters.base.ParameterList parameter_list = 2 [json_name = "parameterList"];</code>
   */
  com.assetmantle.schema.parameters.base.ParameterListOrBuilder getParameterListOrBuilder();
}