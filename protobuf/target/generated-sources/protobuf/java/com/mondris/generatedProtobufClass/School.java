// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WrapperType.proto

package com.mondris.generatedProtobufClass;

/**
 * <pre>
 * using wrapper types in protobuf
 * </pre>
 *
 * Protobuf type {@code School}
 */
public  final class School extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:School)
    SchoolOrBuilder {
private static final long serialVersionUID = 0L;
  // Use School.newBuilder() to construct.
  private School(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private School() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private School(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.protobuf.Int32Value.Builder subBuilder = null;
            if (totalStudents_ != null) {
              subBuilder = totalStudents_.toBuilder();
            }
            totalStudents_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(totalStudents_);
              totalStudents_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.DoubleValue.Builder subBuilder = null;
            if (averagePerformance_ != null) {
              subBuilder = averagePerformance_.toBuilder();
            }
            averagePerformance_ = input.readMessage(com.google.protobuf.DoubleValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(averagePerformance_);
              averagePerformance_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (name_ != null) {
              subBuilder = name_.toBuilder();
            }
            name_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(name_);
              name_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.mondris.generatedProtobufClass.WrapperType.internal_static_School_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.mondris.generatedProtobufClass.WrapperType.internal_static_School_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.mondris.generatedProtobufClass.School.class, com.mondris.generatedProtobufClass.School.Builder.class);
  }

  public static final int TOTALSTUDENTS_FIELD_NUMBER = 1;
  private com.google.protobuf.Int32Value totalStudents_;
  /**
   * <code>.google.protobuf.Int32Value totalStudents = 1;</code>
   */
  public boolean hasTotalStudents() {
    return totalStudents_ != null;
  }
  /**
   * <code>.google.protobuf.Int32Value totalStudents = 1;</code>
   */
  public com.google.protobuf.Int32Value getTotalStudents() {
    return totalStudents_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : totalStudents_;
  }
  /**
   * <code>.google.protobuf.Int32Value totalStudents = 1;</code>
   */
  public com.google.protobuf.Int32ValueOrBuilder getTotalStudentsOrBuilder() {
    return getTotalStudents();
  }

  public static final int AVERAGEPERFORMANCE_FIELD_NUMBER = 2;
  private com.google.protobuf.DoubleValue averagePerformance_;
  /**
   * <code>.google.protobuf.DoubleValue averagePerformance = 2;</code>
   */
  public boolean hasAveragePerformance() {
    return averagePerformance_ != null;
  }
  /**
   * <code>.google.protobuf.DoubleValue averagePerformance = 2;</code>
   */
  public com.google.protobuf.DoubleValue getAveragePerformance() {
    return averagePerformance_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : averagePerformance_;
  }
  /**
   * <code>.google.protobuf.DoubleValue averagePerformance = 2;</code>
   */
  public com.google.protobuf.DoubleValueOrBuilder getAveragePerformanceOrBuilder() {
    return getAveragePerformance();
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private com.google.protobuf.StringValue name_;
  /**
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  public boolean hasName() {
    return name_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  public com.google.protobuf.StringValue getName() {
    return name_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : name_;
  }
  /**
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getNameOrBuilder() {
    return getName();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (totalStudents_ != null) {
      output.writeMessage(1, getTotalStudents());
    }
    if (averagePerformance_ != null) {
      output.writeMessage(2, getAveragePerformance());
    }
    if (name_ != null) {
      output.writeMessage(3, getName());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (totalStudents_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTotalStudents());
    }
    if (averagePerformance_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAveragePerformance());
    }
    if (name_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getName());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.mondris.generatedProtobufClass.School)) {
      return super.equals(obj);
    }
    com.mondris.generatedProtobufClass.School other = (com.mondris.generatedProtobufClass.School) obj;

    boolean result = true;
    result = result && (hasTotalStudents() == other.hasTotalStudents());
    if (hasTotalStudents()) {
      result = result && getTotalStudents()
          .equals(other.getTotalStudents());
    }
    result = result && (hasAveragePerformance() == other.hasAveragePerformance());
    if (hasAveragePerformance()) {
      result = result && getAveragePerformance()
          .equals(other.getAveragePerformance());
    }
    result = result && (hasName() == other.hasName());
    if (hasName()) {
      result = result && getName()
          .equals(other.getName());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTotalStudents()) {
      hash = (37 * hash) + TOTALSTUDENTS_FIELD_NUMBER;
      hash = (53 * hash) + getTotalStudents().hashCode();
    }
    if (hasAveragePerformance()) {
      hash = (37 * hash) + AVERAGEPERFORMANCE_FIELD_NUMBER;
      hash = (53 * hash) + getAveragePerformance().hashCode();
    }
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.mondris.generatedProtobufClass.School parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mondris.generatedProtobufClass.School parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mondris.generatedProtobufClass.School parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mondris.generatedProtobufClass.School parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mondris.generatedProtobufClass.School parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mondris.generatedProtobufClass.School parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mondris.generatedProtobufClass.School parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mondris.generatedProtobufClass.School parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mondris.generatedProtobufClass.School parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.mondris.generatedProtobufClass.School parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mondris.generatedProtobufClass.School parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mondris.generatedProtobufClass.School parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.mondris.generatedProtobufClass.School prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * using wrapper types in protobuf
   * </pre>
   *
   * Protobuf type {@code School}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:School)
      com.mondris.generatedProtobufClass.SchoolOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mondris.generatedProtobufClass.WrapperType.internal_static_School_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mondris.generatedProtobufClass.WrapperType.internal_static_School_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mondris.generatedProtobufClass.School.class, com.mondris.generatedProtobufClass.School.Builder.class);
    }

    // Construct using com.mondris.generatedProtobufClass.School.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (totalStudentsBuilder_ == null) {
        totalStudents_ = null;
      } else {
        totalStudents_ = null;
        totalStudentsBuilder_ = null;
      }
      if (averagePerformanceBuilder_ == null) {
        averagePerformance_ = null;
      } else {
        averagePerformance_ = null;
        averagePerformanceBuilder_ = null;
      }
      if (nameBuilder_ == null) {
        name_ = null;
      } else {
        name_ = null;
        nameBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.mondris.generatedProtobufClass.WrapperType.internal_static_School_descriptor;
    }

    @java.lang.Override
    public com.mondris.generatedProtobufClass.School getDefaultInstanceForType() {
      return com.mondris.generatedProtobufClass.School.getDefaultInstance();
    }

    @java.lang.Override
    public com.mondris.generatedProtobufClass.School build() {
      com.mondris.generatedProtobufClass.School result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.mondris.generatedProtobufClass.School buildPartial() {
      com.mondris.generatedProtobufClass.School result = new com.mondris.generatedProtobufClass.School(this);
      if (totalStudentsBuilder_ == null) {
        result.totalStudents_ = totalStudents_;
      } else {
        result.totalStudents_ = totalStudentsBuilder_.build();
      }
      if (averagePerformanceBuilder_ == null) {
        result.averagePerformance_ = averagePerformance_;
      } else {
        result.averagePerformance_ = averagePerformanceBuilder_.build();
      }
      if (nameBuilder_ == null) {
        result.name_ = name_;
      } else {
        result.name_ = nameBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.mondris.generatedProtobufClass.School) {
        return mergeFrom((com.mondris.generatedProtobufClass.School)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.mondris.generatedProtobufClass.School other) {
      if (other == com.mondris.generatedProtobufClass.School.getDefaultInstance()) return this;
      if (other.hasTotalStudents()) {
        mergeTotalStudents(other.getTotalStudents());
      }
      if (other.hasAveragePerformance()) {
        mergeAveragePerformance(other.getAveragePerformance());
      }
      if (other.hasName()) {
        mergeName(other.getName());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.mondris.generatedProtobufClass.School parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.mondris.generatedProtobufClass.School) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Int32Value totalStudents_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> totalStudentsBuilder_;
    /**
     * <code>.google.protobuf.Int32Value totalStudents = 1;</code>
     */
    public boolean hasTotalStudents() {
      return totalStudentsBuilder_ != null || totalStudents_ != null;
    }
    /**
     * <code>.google.protobuf.Int32Value totalStudents = 1;</code>
     */
    public com.google.protobuf.Int32Value getTotalStudents() {
      if (totalStudentsBuilder_ == null) {
        return totalStudents_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : totalStudents_;
      } else {
        return totalStudentsBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Int32Value totalStudents = 1;</code>
     */
    public Builder setTotalStudents(com.google.protobuf.Int32Value value) {
      if (totalStudentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        totalStudents_ = value;
        onChanged();
      } else {
        totalStudentsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value totalStudents = 1;</code>
     */
    public Builder setTotalStudents(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      if (totalStudentsBuilder_ == null) {
        totalStudents_ = builderForValue.build();
        onChanged();
      } else {
        totalStudentsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value totalStudents = 1;</code>
     */
    public Builder mergeTotalStudents(com.google.protobuf.Int32Value value) {
      if (totalStudentsBuilder_ == null) {
        if (totalStudents_ != null) {
          totalStudents_ =
            com.google.protobuf.Int32Value.newBuilder(totalStudents_).mergeFrom(value).buildPartial();
        } else {
          totalStudents_ = value;
        }
        onChanged();
      } else {
        totalStudentsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value totalStudents = 1;</code>
     */
    public Builder clearTotalStudents() {
      if (totalStudentsBuilder_ == null) {
        totalStudents_ = null;
        onChanged();
      } else {
        totalStudents_ = null;
        totalStudentsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value totalStudents = 1;</code>
     */
    public com.google.protobuf.Int32Value.Builder getTotalStudentsBuilder() {
      
      onChanged();
      return getTotalStudentsFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Int32Value totalStudents = 1;</code>
     */
    public com.google.protobuf.Int32ValueOrBuilder getTotalStudentsOrBuilder() {
      if (totalStudentsBuilder_ != null) {
        return totalStudentsBuilder_.getMessageOrBuilder();
      } else {
        return totalStudents_ == null ?
            com.google.protobuf.Int32Value.getDefaultInstance() : totalStudents_;
      }
    }
    /**
     * <code>.google.protobuf.Int32Value totalStudents = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> 
        getTotalStudentsFieldBuilder() {
      if (totalStudentsBuilder_ == null) {
        totalStudentsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder>(
                getTotalStudents(),
                getParentForChildren(),
                isClean());
        totalStudents_ = null;
      }
      return totalStudentsBuilder_;
    }

    private com.google.protobuf.DoubleValue averagePerformance_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> averagePerformanceBuilder_;
    /**
     * <code>.google.protobuf.DoubleValue averagePerformance = 2;</code>
     */
    public boolean hasAveragePerformance() {
      return averagePerformanceBuilder_ != null || averagePerformance_ != null;
    }
    /**
     * <code>.google.protobuf.DoubleValue averagePerformance = 2;</code>
     */
    public com.google.protobuf.DoubleValue getAveragePerformance() {
      if (averagePerformanceBuilder_ == null) {
        return averagePerformance_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : averagePerformance_;
      } else {
        return averagePerformanceBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.DoubleValue averagePerformance = 2;</code>
     */
    public Builder setAveragePerformance(com.google.protobuf.DoubleValue value) {
      if (averagePerformanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        averagePerformance_ = value;
        onChanged();
      } else {
        averagePerformanceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.DoubleValue averagePerformance = 2;</code>
     */
    public Builder setAveragePerformance(
        com.google.protobuf.DoubleValue.Builder builderForValue) {
      if (averagePerformanceBuilder_ == null) {
        averagePerformance_ = builderForValue.build();
        onChanged();
      } else {
        averagePerformanceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.DoubleValue averagePerformance = 2;</code>
     */
    public Builder mergeAveragePerformance(com.google.protobuf.DoubleValue value) {
      if (averagePerformanceBuilder_ == null) {
        if (averagePerformance_ != null) {
          averagePerformance_ =
            com.google.protobuf.DoubleValue.newBuilder(averagePerformance_).mergeFrom(value).buildPartial();
        } else {
          averagePerformance_ = value;
        }
        onChanged();
      } else {
        averagePerformanceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.DoubleValue averagePerformance = 2;</code>
     */
    public Builder clearAveragePerformance() {
      if (averagePerformanceBuilder_ == null) {
        averagePerformance_ = null;
        onChanged();
      } else {
        averagePerformance_ = null;
        averagePerformanceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.DoubleValue averagePerformance = 2;</code>
     */
    public com.google.protobuf.DoubleValue.Builder getAveragePerformanceBuilder() {
      
      onChanged();
      return getAveragePerformanceFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.DoubleValue averagePerformance = 2;</code>
     */
    public com.google.protobuf.DoubleValueOrBuilder getAveragePerformanceOrBuilder() {
      if (averagePerformanceBuilder_ != null) {
        return averagePerformanceBuilder_.getMessageOrBuilder();
      } else {
        return averagePerformance_ == null ?
            com.google.protobuf.DoubleValue.getDefaultInstance() : averagePerformance_;
      }
    }
    /**
     * <code>.google.protobuf.DoubleValue averagePerformance = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> 
        getAveragePerformanceFieldBuilder() {
      if (averagePerformanceBuilder_ == null) {
        averagePerformanceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder>(
                getAveragePerformance(),
                getParentForChildren(),
                isClean());
        averagePerformance_ = null;
      }
      return averagePerformanceBuilder_;
    }

    private com.google.protobuf.StringValue name_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> nameBuilder_;
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public boolean hasName() {
      return nameBuilder_ != null || name_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public com.google.protobuf.StringValue getName() {
      if (nameBuilder_ == null) {
        return name_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : name_;
      } else {
        return nameBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public Builder setName(com.google.protobuf.StringValue value) {
      if (nameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        name_ = value;
        onChanged();
      } else {
        nameBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public Builder setName(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (nameBuilder_ == null) {
        name_ = builderForValue.build();
        onChanged();
      } else {
        nameBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public Builder mergeName(com.google.protobuf.StringValue value) {
      if (nameBuilder_ == null) {
        if (name_ != null) {
          name_ =
            com.google.protobuf.StringValue.newBuilder(name_).mergeFrom(value).buildPartial();
        } else {
          name_ = value;
        }
        onChanged();
      } else {
        nameBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public Builder clearName() {
      if (nameBuilder_ == null) {
        name_ = null;
        onChanged();
      } else {
        name_ = null;
        nameBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public com.google.protobuf.StringValue.Builder getNameBuilder() {
      
      onChanged();
      return getNameFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getNameOrBuilder() {
      if (nameBuilder_ != null) {
        return nameBuilder_.getMessageOrBuilder();
      } else {
        return name_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : name_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getNameFieldBuilder() {
      if (nameBuilder_ == null) {
        nameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getName(),
                getParentForChildren(),
                isClean());
        name_ = null;
      }
      return nameBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:School)
  }

  // @@protoc_insertion_point(class_scope:School)
  private static final com.mondris.generatedProtobufClass.School DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.mondris.generatedProtobufClass.School();
  }

  public static com.mondris.generatedProtobufClass.School getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<School>
      PARSER = new com.google.protobuf.AbstractParser<School>() {
    @java.lang.Override
    public School parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new School(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<School> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<School> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.mondris.generatedProtobufClass.School getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

