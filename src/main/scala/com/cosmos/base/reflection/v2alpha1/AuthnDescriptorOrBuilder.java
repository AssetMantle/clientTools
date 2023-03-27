// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/reflection/v2alpha1/reflection.proto

package com.cosmos.base.reflection.v2alpha1;

public interface AuthnDescriptorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.base.reflection.v2alpha1.AuthnDescriptor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * sign_modes defines the supported signature algorithm
   * </pre>
   *
   * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
   */
  java.util.List<SigningModeDescriptor>
      getSignModesList();
  /**
   * <pre>
   * sign_modes defines the supported signature algorithm
   * </pre>
   *
   * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
   */
  SigningModeDescriptor getSignModes(int index);
  /**
   * <pre>
   * sign_modes defines the supported signature algorithm
   * </pre>
   *
   * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
   */
  int getSignModesCount();
  /**
   * <pre>
   * sign_modes defines the supported signature algorithm
   * </pre>
   *
   * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
   */
  java.util.List<? extends SigningModeDescriptorOrBuilder>
      getSignModesOrBuilderList();
  /**
   * <pre>
   * sign_modes defines the supported signature algorithm
   * </pre>
   *
   * <code>repeated .cosmos.base.reflection.v2alpha1.SigningModeDescriptor sign_modes = 1 [json_name = "signModes"];</code>
   */
  SigningModeDescriptorOrBuilder getSignModesOrBuilder(
      int index);
}
