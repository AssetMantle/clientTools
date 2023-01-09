// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/data/base/anyData.v1.proto

package com.data;

public interface AnyDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.AnyData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.data.AccAddressData acc_address_data = 1 [json_name = "accAddressData"];</code>
   * @return Whether the accAddressData field is set.
   */
  boolean hasAccAddressData();
  /**
   * <code>.data.AccAddressData acc_address_data = 1 [json_name = "accAddressData"];</code>
   * @return The accAddressData.
   */
  com.data.AccAddressData getAccAddressData();
  /**
   * <code>.data.AccAddressData acc_address_data = 1 [json_name = "accAddressData"];</code>
   */
  com.data.AccAddressDataOrBuilder getAccAddressDataOrBuilder();

  /**
   * <code>.data.BooleanData boolean_data = 2 [json_name = "booleanData"];</code>
   * @return Whether the booleanData field is set.
   */
  boolean hasBooleanData();
  /**
   * <code>.data.BooleanData boolean_data = 2 [json_name = "booleanData"];</code>
   * @return The booleanData.
   */
  com.data.BooleanData getBooleanData();
  /**
   * <code>.data.BooleanData boolean_data = 2 [json_name = "booleanData"];</code>
   */
  com.data.BooleanDataOrBuilder getBooleanDataOrBuilder();

  /**
   * <code>.data.DecData dec_data = 3 [json_name = "decData"];</code>
   * @return Whether the decData field is set.
   */
  boolean hasDecData();
  /**
   * <code>.data.DecData dec_data = 3 [json_name = "decData"];</code>
   * @return The decData.
   */
  com.data.DecData getDecData();
  /**
   * <code>.data.DecData dec_data = 3 [json_name = "decData"];</code>
   */
  com.data.DecDataOrBuilder getDecDataOrBuilder();

  /**
   * <code>.data.HeightData height_data = 4 [json_name = "heightData"];</code>
   * @return Whether the heightData field is set.
   */
  boolean hasHeightData();
  /**
   * <code>.data.HeightData height_data = 4 [json_name = "heightData"];</code>
   * @return The heightData.
   */
  com.data.HeightData getHeightData();
  /**
   * <code>.data.HeightData height_data = 4 [json_name = "heightData"];</code>
   */
  com.data.HeightDataOrBuilder getHeightDataOrBuilder();

  /**
   * <code>.data.IDData i_d_data = 5 [json_name = "iDData"];</code>
   * @return Whether the iDData field is set.
   */
  boolean hasIDData();
  /**
   * <code>.data.IDData i_d_data = 5 [json_name = "iDData"];</code>
   * @return The iDData.
   */
  com.data.IDData getIDData();
  /**
   * <code>.data.IDData i_d_data = 5 [json_name = "iDData"];</code>
   */
  com.data.IDDataOrBuilder getIDDataOrBuilder();

  /**
   * <code>.data.StringData string_data = 6 [json_name = "stringData"];</code>
   * @return Whether the stringData field is set.
   */
  boolean hasStringData();
  /**
   * <code>.data.StringData string_data = 6 [json_name = "stringData"];</code>
   * @return The stringData.
   */
  com.data.StringData getStringData();
  /**
   * <code>.data.StringData string_data = 6 [json_name = "stringData"];</code>
   */
  com.data.StringDataOrBuilder getStringDataOrBuilder();

  /**
   * <code>string list_data = 7 [json_name = "listData", (.gogoproto.customtype) = "ListData"];</code>
   * @return Whether the listData field is set.
   */
  boolean hasListData();
  /**
   * <code>string list_data = 7 [json_name = "listData", (.gogoproto.customtype) = "ListData"];</code>
   * @return The listData.
   */
  java.lang.String getListData();
  /**
   * <code>string list_data = 7 [json_name = "listData", (.gogoproto.customtype) = "ListData"];</code>
   * @return The bytes for listData.
   */
  com.google.protobuf.ByteString
      getListDataBytes();

  com.data.AnyData.ImplCase getImplCase();
}