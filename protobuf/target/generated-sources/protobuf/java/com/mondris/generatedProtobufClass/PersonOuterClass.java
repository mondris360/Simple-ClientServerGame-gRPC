// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Person.proto

package com.mondris.generatedProtobufClass;

public final class PersonOuterClass {
  private PersonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Person_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Person.proto\032\tCar.proto\032\rAddress.proto" +
      "\"Q\n\006Person\022\014\n\004name\030\001 \001(\t\022\013\n\003age\030\002 \001(\005\022\021\n" +
      "\003car\030\003 \003(\0132\004.Car\022\031\n\007address\030\004 \001(\0132\010.Addr" +
      "essB&\n\"com.mondris.generatedProtobufClas" +
      "sP\001b\006proto3"
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
          com.mondris.generatedProtobufClass.CarOuterClass.getDescriptor(),
          com.mondris.generatedProtobufClass.AddressOuterClass.getDescriptor(),
        }, assigner);
    internal_static_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Person_descriptor,
        new java.lang.String[] { "Name", "Age", "Car", "Address", });
    com.mondris.generatedProtobufClass.CarOuterClass.getDescriptor();
    com.mondris.generatedProtobufClass.AddressOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
