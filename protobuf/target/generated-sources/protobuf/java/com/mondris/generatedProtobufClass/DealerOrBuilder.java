// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Dealer.proto

package com.mondris.generatedProtobufClass;

public interface DealerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Dealer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;int32, .Car&gt; models = 1;</code>
   */
  int getModelsCount();
  /**
   * <code>map&lt;int32, .Car&gt; models = 1;</code>
   */
  boolean containsModels(
      int key);
  /**
   * Use {@link #getModelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, com.mondris.generatedProtobufClass.Car>
  getModels();
  /**
   * <code>map&lt;int32, .Car&gt; models = 1;</code>
   */
  java.util.Map<java.lang.Integer, com.mondris.generatedProtobufClass.Car>
  getModelsMap();
  /**
   * <code>map&lt;int32, .Car&gt; models = 1;</code>
   */

  com.mondris.generatedProtobufClass.Car getModelsOrDefault(
      int key,
      com.mondris.generatedProtobufClass.Car defaultValue);
  /**
   * <code>map&lt;int32, .Car&gt; models = 1;</code>
   */

  com.mondris.generatedProtobufClass.Car getModelsOrThrow(
      int key);
}
