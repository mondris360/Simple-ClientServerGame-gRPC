// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Credential.proto

package com.mondris.generatedProtobufClass;

public interface CredentialOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Credential)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.EmailCredential emailCredential = 1;</code>
   */
  boolean hasEmailCredential();
  /**
   * <code>.EmailCredential emailCredential = 1;</code>
   */
  com.mondris.generatedProtobufClass.EmailCredential getEmailCredential();
  /**
   * <code>.EmailCredential emailCredential = 1;</code>
   */
  com.mondris.generatedProtobufClass.EmailCredentialOrBuilder getEmailCredentialOrBuilder();

  /**
   * <code>.PhoneOTP phoneCredential = 2;</code>
   */
  boolean hasPhoneCredential();
  /**
   * <code>.PhoneOTP phoneCredential = 2;</code>
   */
  com.mondris.generatedProtobufClass.PhoneOTP getPhoneCredential();
  /**
   * <code>.PhoneOTP phoneCredential = 2;</code>
   */
  com.mondris.generatedProtobufClass.PhoneOTPOrBuilder getPhoneCredentialOrBuilder();

  public com.mondris.generatedProtobufClass.Credential.ModeCase getModeCase();
}