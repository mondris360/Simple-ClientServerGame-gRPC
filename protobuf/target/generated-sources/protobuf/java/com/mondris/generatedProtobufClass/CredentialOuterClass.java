// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Credential.proto

package com.mondris.generatedProtobufClass;

public final class CredentialOuterClass {
  private CredentialOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Credential_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Credential_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020Credential.proto\032\025EmailCredential.prot" +
      "o\032\016PhoneOTP.proto\"g\n\nCredential\022+\n\017email" +
      "Credential\030\001 \001(\0132\020.EmailCredentialH\000\022$\n\017" +
      "phoneCredential\030\002 \001(\0132\t.PhoneOTPH\000B\006\n\004mo" +
      "deB&\n\"com.mondris.generatedProtobufClass" +
      "P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.mondris.generatedProtobufClass.EmailCredentialOuterClass.getDescriptor(),
          com.mondris.generatedProtobufClass.PhoneOTPOuterClass.getDescriptor(),
        }, assigner);
    internal_static_Credential_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Credential_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Credential_descriptor,
        new java.lang.String[] { "EmailCredential", "PhoneCredential", "Mode", });
    com.mondris.generatedProtobufClass.EmailCredentialOuterClass.getDescriptor();
    com.mondris.generatedProtobufClass.PhoneOTPOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
