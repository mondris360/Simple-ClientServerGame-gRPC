// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EmailCredential.proto

package com.mondris.generatedProtobufClass;

public final class EmailCredentialOuterClass {
  private EmailCredentialOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EmailCredential_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EmailCredential_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025EmailCredential.proto\"2\n\017EmailCredenti" +
      "al\022\r\n\005email\030\001 \001(\t\022\020\n\010password\030\002 \001(\tB&\n\"c" +
      "om.mondris.generatedProtobufClassP\001b\006pro" +
      "to3"
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
        }, assigner);
    internal_static_EmailCredential_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EmailCredential_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EmailCredential_descriptor,
        new java.lang.String[] { "Email", "Password", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
