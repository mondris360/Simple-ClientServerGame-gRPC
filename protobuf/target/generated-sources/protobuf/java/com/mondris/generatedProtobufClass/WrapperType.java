// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WrapperType.proto

package com.mondris.generatedProtobufClass;

public final class WrapperType {
  private WrapperType() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_School_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_School_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021WrapperType.proto\032\036google/protobuf/wra" +
      "ppers.proto\"\242\001\n\006School\0222\n\rtotalStudents\030" +
      "\001 \001(\0132\033.google.protobuf.Int32Value\0228\n\022av" +
      "eragePerformance\030\002 \001(\0132\034.google.protobuf" +
      ".DoubleValue\022*\n\004name\030\003 \001(\0132\034.google.prot" +
      "obuf.StringValueB&\n\"com.mondris.generate" +
      "dProtobufClassP\001b\006proto3"
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
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_School_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_School_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_School_descriptor,
        new java.lang.String[] { "TotalStudents", "AveragePerformance", "Name", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}