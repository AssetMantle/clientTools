// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/reflection/v2alpha1/reflection.proto

package com.cosmos.base.reflection.v2alpha1;

public interface InterfaceAcceptingMessageDescriptorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.base.reflection.v2alpha1.InterfaceAcceptingMessageDescriptor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * fullname is the protobuf fullname of the type containing the interface
   * </pre>
   *
   * <code>string fullname = 1 [json_name = "fullname"];</code>
   * @return The fullname.
   */
  String getFullname();
  /**
   * <pre>
   * fullname is the protobuf fullname of the type containing the interface
   * </pre>
   *
   * <code>string fullname = 1 [json_name = "fullname"];</code>
   * @return The bytes for fullname.
   */
  com.google.protobuf.ByteString
      getFullnameBytes();

  /**
   * <pre>
   * field_descriptor_names is a list of the protobuf name (not fullname) of the field
   * which contains the interface as google.protobuf.Any (the interface is the same, but
   * it can be in multiple fields of the same proto message)
   * </pre>
   *
   * <code>repeated string field_descriptor_names = 2 [json_name = "fieldDescriptorNames"];</code>
   * @return A list containing the fieldDescriptorNames.
   */
  java.util.List<String>
      getFieldDescriptorNamesList();
  /**
   * <pre>
   * field_descriptor_names is a list of the protobuf name (not fullname) of the field
   * which contains the interface as google.protobuf.Any (the interface is the same, but
   * it can be in multiple fields of the same proto message)
   * </pre>
   *
   * <code>repeated string field_descriptor_names = 2 [json_name = "fieldDescriptorNames"];</code>
   * @return The count of fieldDescriptorNames.
   */
  int getFieldDescriptorNamesCount();
  /**
   * <pre>
   * field_descriptor_names is a list of the protobuf name (not fullname) of the field
   * which contains the interface as google.protobuf.Any (the interface is the same, but
   * it can be in multiple fields of the same proto message)
   * </pre>
   *
   * <code>repeated string field_descriptor_names = 2 [json_name = "fieldDescriptorNames"];</code>
   * @param index The index of the element to return.
   * @return The fieldDescriptorNames at the given index.
   */
  String getFieldDescriptorNames(int index);
  /**
   * <pre>
   * field_descriptor_names is a list of the protobuf name (not fullname) of the field
   * which contains the interface as google.protobuf.Any (the interface is the same, but
   * it can be in multiple fields of the same proto message)
   * </pre>
   *
   * <code>repeated string field_descriptor_names = 2 [json_name = "fieldDescriptorNames"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the fieldDescriptorNames at the given index.
   */
  com.google.protobuf.ByteString
      getFieldDescriptorNamesBytes(int index);
}
