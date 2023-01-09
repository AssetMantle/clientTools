// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/gov.proto

package com.cosmos.gov.v1beta1;

/**
 * <pre>
 * VoteOption enumerates the valid vote options for a given governance proposal.
 * </pre>
 *
 * Protobuf enum {@code cosmos.gov.v1beta1.VoteOption}
 */
public enum VoteOption
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * VOTE_OPTION_UNSPECIFIED defines a no-op vote option.
   * </pre>
   *
   * <code>VOTE_OPTION_UNSPECIFIED = 0 [(.gogoproto.enumvalue_customname) = "OptionEmpty"];</code>
   */
  VOTE_OPTION_UNSPECIFIED(0),
  /**
   * <pre>
   * VOTE_OPTION_YES defines a yes vote option.
   * </pre>
   *
   * <code>VOTE_OPTION_YES = 1 [(.gogoproto.enumvalue_customname) = "OptionYes"];</code>
   */
  VOTE_OPTION_YES(1),
  /**
   * <pre>
   * VOTE_OPTION_ABSTAIN defines an abstain vote option.
   * </pre>
   *
   * <code>VOTE_OPTION_ABSTAIN = 2 [(.gogoproto.enumvalue_customname) = "OptionAbstain"];</code>
   */
  VOTE_OPTION_ABSTAIN(2),
  /**
   * <pre>
   * VOTE_OPTION_NO defines a no vote option.
   * </pre>
   *
   * <code>VOTE_OPTION_NO = 3 [(.gogoproto.enumvalue_customname) = "OptionNo"];</code>
   */
  VOTE_OPTION_NO(3),
  /**
   * <pre>
   * VOTE_OPTION_NO_WITH_VETO defines a no with veto vote option.
   * </pre>
   *
   * <code>VOTE_OPTION_NO_WITH_VETO = 4 [(.gogoproto.enumvalue_customname) = "OptionNoWithVeto"];</code>
   */
  VOTE_OPTION_NO_WITH_VETO(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * VOTE_OPTION_UNSPECIFIED defines a no-op vote option.
   * </pre>
   *
   * <code>VOTE_OPTION_UNSPECIFIED = 0 [(.gogoproto.enumvalue_customname) = "OptionEmpty"];</code>
   */
  public static final int VOTE_OPTION_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * VOTE_OPTION_YES defines a yes vote option.
   * </pre>
   *
   * <code>VOTE_OPTION_YES = 1 [(.gogoproto.enumvalue_customname) = "OptionYes"];</code>
   */
  public static final int VOTE_OPTION_YES_VALUE = 1;
  /**
   * <pre>
   * VOTE_OPTION_ABSTAIN defines an abstain vote option.
   * </pre>
   *
   * <code>VOTE_OPTION_ABSTAIN = 2 [(.gogoproto.enumvalue_customname) = "OptionAbstain"];</code>
   */
  public static final int VOTE_OPTION_ABSTAIN_VALUE = 2;
  /**
   * <pre>
   * VOTE_OPTION_NO defines a no vote option.
   * </pre>
   *
   * <code>VOTE_OPTION_NO = 3 [(.gogoproto.enumvalue_customname) = "OptionNo"];</code>
   */
  public static final int VOTE_OPTION_NO_VALUE = 3;
  /**
   * <pre>
   * VOTE_OPTION_NO_WITH_VETO defines a no with veto vote option.
   * </pre>
   *
   * <code>VOTE_OPTION_NO_WITH_VETO = 4 [(.gogoproto.enumvalue_customname) = "OptionNoWithVeto"];</code>
   */
  public static final int VOTE_OPTION_NO_WITH_VETO_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static VoteOption valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VoteOption forNumber(int value) {
    switch (value) {
      case 0: return VOTE_OPTION_UNSPECIFIED;
      case 1: return VOTE_OPTION_YES;
      case 2: return VOTE_OPTION_ABSTAIN;
      case 3: return VOTE_OPTION_NO;
      case 4: return VOTE_OPTION_NO_WITH_VETO;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VoteOption>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      VoteOption> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VoteOption>() {
          public VoteOption findValueByNumber(int number) {
            return VoteOption.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.cosmos.gov.v1beta1.GovProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final VoteOption[] VALUES = values();

  public static VoteOption valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private VoteOption(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:cosmos.gov.v1beta1.VoteOption)
}

