// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Car.proto

package com.mondris.generatedProtobufClass;

/**
 * <pre>
 * protobuf for Car Object
 * </pre>
 *
 * Protobuf type {@code Car}
 */
public  final class Car extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Car)
    CarOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Car.newBuilder() to construct.
  private Car(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Car() {
    model_ = "";
    manufacturer_ = "";
    plateNumber_ = "";
    bodyColor_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Car(
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
            java.lang.String s = input.readStringRequireUtf8();

            model_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            manufacturer_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            plateNumber_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            bodyColor_ = rawValue;
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
    return com.mondris.generatedProtobufClass.CarOuterClass.internal_static_Car_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.mondris.generatedProtobufClass.CarOuterClass.internal_static_Car_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.mondris.generatedProtobufClass.Car.class, com.mondris.generatedProtobufClass.Car.Builder.class);
  }

  public static final int MODEL_FIELD_NUMBER = 1;
  private volatile java.lang.Object model_;
  /**
   * <code>string model = 1;</code>
   */
  public java.lang.String getModel() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      model_ = s;
      return s;
    }
  }
  /**
   * <code>string model = 1;</code>
   */
  public com.google.protobuf.ByteString
      getModelBytes() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      model_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MANUFACTURER_FIELD_NUMBER = 2;
  private volatile java.lang.Object manufacturer_;
  /**
   * <code>string manufacturer = 2;</code>
   */
  public java.lang.String getManufacturer() {
    java.lang.Object ref = manufacturer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      manufacturer_ = s;
      return s;
    }
  }
  /**
   * <code>string manufacturer = 2;</code>
   */
  public com.google.protobuf.ByteString
      getManufacturerBytes() {
    java.lang.Object ref = manufacturer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      manufacturer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLATENUMBER_FIELD_NUMBER = 3;
  private volatile java.lang.Object plateNumber_;
  /**
   * <code>string plateNumber = 3;</code>
   */
  public java.lang.String getPlateNumber() {
    java.lang.Object ref = plateNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      plateNumber_ = s;
      return s;
    }
  }
  /**
   * <code>string plateNumber = 3;</code>
   */
  public com.google.protobuf.ByteString
      getPlateNumberBytes() {
    java.lang.Object ref = plateNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      plateNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BODYCOLOR_FIELD_NUMBER = 4;
  private int bodyColor_;
  /**
   * <code>.BodyColor bodyColor = 4;</code>
   */
  public int getBodyColorValue() {
    return bodyColor_;
  }
  /**
   * <code>.BodyColor bodyColor = 4;</code>
   */
  public com.mondris.generatedProtobufClass.BodyColor getBodyColor() {
    @SuppressWarnings("deprecation")
    com.mondris.generatedProtobufClass.BodyColor result = com.mondris.generatedProtobufClass.BodyColor.valueOf(bodyColor_);
    return result == null ? com.mondris.generatedProtobufClass.BodyColor.UNRECOGNIZED : result;
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
    if (!getModelBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, model_);
    }
    if (!getManufacturerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, manufacturer_);
    }
    if (!getPlateNumberBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, plateNumber_);
    }
    if (bodyColor_ != com.mondris.generatedProtobufClass.BodyColor.Unknown.getNumber()) {
      output.writeEnum(4, bodyColor_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getModelBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, model_);
    }
    if (!getManufacturerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, manufacturer_);
    }
    if (!getPlateNumberBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, plateNumber_);
    }
    if (bodyColor_ != com.mondris.generatedProtobufClass.BodyColor.Unknown.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, bodyColor_);
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
    if (!(obj instanceof com.mondris.generatedProtobufClass.Car)) {
      return super.equals(obj);
    }
    com.mondris.generatedProtobufClass.Car other = (com.mondris.generatedProtobufClass.Car) obj;

    boolean result = true;
    result = result && getModel()
        .equals(other.getModel());
    result = result && getManufacturer()
        .equals(other.getManufacturer());
    result = result && getPlateNumber()
        .equals(other.getPlateNumber());
    result = result && bodyColor_ == other.bodyColor_;
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
    hash = (37 * hash) + MODEL_FIELD_NUMBER;
    hash = (53 * hash) + getModel().hashCode();
    hash = (37 * hash) + MANUFACTURER_FIELD_NUMBER;
    hash = (53 * hash) + getManufacturer().hashCode();
    hash = (37 * hash) + PLATENUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getPlateNumber().hashCode();
    hash = (37 * hash) + BODYCOLOR_FIELD_NUMBER;
    hash = (53 * hash) + bodyColor_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.mondris.generatedProtobufClass.Car parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mondris.generatedProtobufClass.Car parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mondris.generatedProtobufClass.Car parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mondris.generatedProtobufClass.Car parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mondris.generatedProtobufClass.Car parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mondris.generatedProtobufClass.Car parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mondris.generatedProtobufClass.Car parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mondris.generatedProtobufClass.Car parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mondris.generatedProtobufClass.Car parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.mondris.generatedProtobufClass.Car parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mondris.generatedProtobufClass.Car parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mondris.generatedProtobufClass.Car parseFrom(
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
  public static Builder newBuilder(com.mondris.generatedProtobufClass.Car prototype) {
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
   * protobuf for Car Object
   * </pre>
   *
   * Protobuf type {@code Car}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Car)
      com.mondris.generatedProtobufClass.CarOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mondris.generatedProtobufClass.CarOuterClass.internal_static_Car_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mondris.generatedProtobufClass.CarOuterClass.internal_static_Car_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mondris.generatedProtobufClass.Car.class, com.mondris.generatedProtobufClass.Car.Builder.class);
    }

    // Construct using com.mondris.generatedProtobufClass.Car.newBuilder()
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
      model_ = "";

      manufacturer_ = "";

      plateNumber_ = "";

      bodyColor_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.mondris.generatedProtobufClass.CarOuterClass.internal_static_Car_descriptor;
    }

    @java.lang.Override
    public com.mondris.generatedProtobufClass.Car getDefaultInstanceForType() {
      return com.mondris.generatedProtobufClass.Car.getDefaultInstance();
    }

    @java.lang.Override
    public com.mondris.generatedProtobufClass.Car build() {
      com.mondris.generatedProtobufClass.Car result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.mondris.generatedProtobufClass.Car buildPartial() {
      com.mondris.generatedProtobufClass.Car result = new com.mondris.generatedProtobufClass.Car(this);
      result.model_ = model_;
      result.manufacturer_ = manufacturer_;
      result.plateNumber_ = plateNumber_;
      result.bodyColor_ = bodyColor_;
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
      if (other instanceof com.mondris.generatedProtobufClass.Car) {
        return mergeFrom((com.mondris.generatedProtobufClass.Car)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.mondris.generatedProtobufClass.Car other) {
      if (other == com.mondris.generatedProtobufClass.Car.getDefaultInstance()) return this;
      if (!other.getModel().isEmpty()) {
        model_ = other.model_;
        onChanged();
      }
      if (!other.getManufacturer().isEmpty()) {
        manufacturer_ = other.manufacturer_;
        onChanged();
      }
      if (!other.getPlateNumber().isEmpty()) {
        plateNumber_ = other.plateNumber_;
        onChanged();
      }
      if (other.bodyColor_ != 0) {
        setBodyColorValue(other.getBodyColorValue());
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
      com.mondris.generatedProtobufClass.Car parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.mondris.generatedProtobufClass.Car) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object model_ = "";
    /**
     * <code>string model = 1;</code>
     */
    public java.lang.String getModel() {
      java.lang.Object ref = model_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        model_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string model = 1;</code>
     */
    public com.google.protobuf.ByteString
        getModelBytes() {
      java.lang.Object ref = model_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        model_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string model = 1;</code>
     */
    public Builder setModel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      model_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string model = 1;</code>
     */
    public Builder clearModel() {
      
      model_ = getDefaultInstance().getModel();
      onChanged();
      return this;
    }
    /**
     * <code>string model = 1;</code>
     */
    public Builder setModelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      model_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object manufacturer_ = "";
    /**
     * <code>string manufacturer = 2;</code>
     */
    public java.lang.String getManufacturer() {
      java.lang.Object ref = manufacturer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        manufacturer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string manufacturer = 2;</code>
     */
    public com.google.protobuf.ByteString
        getManufacturerBytes() {
      java.lang.Object ref = manufacturer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        manufacturer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string manufacturer = 2;</code>
     */
    public Builder setManufacturer(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      manufacturer_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string manufacturer = 2;</code>
     */
    public Builder clearManufacturer() {
      
      manufacturer_ = getDefaultInstance().getManufacturer();
      onChanged();
      return this;
    }
    /**
     * <code>string manufacturer = 2;</code>
     */
    public Builder setManufacturerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      manufacturer_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object plateNumber_ = "";
    /**
     * <code>string plateNumber = 3;</code>
     */
    public java.lang.String getPlateNumber() {
      java.lang.Object ref = plateNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        plateNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string plateNumber = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPlateNumberBytes() {
      java.lang.Object ref = plateNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        plateNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string plateNumber = 3;</code>
     */
    public Builder setPlateNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      plateNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string plateNumber = 3;</code>
     */
    public Builder clearPlateNumber() {
      
      plateNumber_ = getDefaultInstance().getPlateNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string plateNumber = 3;</code>
     */
    public Builder setPlateNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      plateNumber_ = value;
      onChanged();
      return this;
    }

    private int bodyColor_ = 0;
    /**
     * <code>.BodyColor bodyColor = 4;</code>
     */
    public int getBodyColorValue() {
      return bodyColor_;
    }
    /**
     * <code>.BodyColor bodyColor = 4;</code>
     */
    public Builder setBodyColorValue(int value) {
      bodyColor_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.BodyColor bodyColor = 4;</code>
     */
    public com.mondris.generatedProtobufClass.BodyColor getBodyColor() {
      @SuppressWarnings("deprecation")
      com.mondris.generatedProtobufClass.BodyColor result = com.mondris.generatedProtobufClass.BodyColor.valueOf(bodyColor_);
      return result == null ? com.mondris.generatedProtobufClass.BodyColor.UNRECOGNIZED : result;
    }
    /**
     * <code>.BodyColor bodyColor = 4;</code>
     */
    public Builder setBodyColor(com.mondris.generatedProtobufClass.BodyColor value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      bodyColor_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.BodyColor bodyColor = 4;</code>
     */
    public Builder clearBodyColor() {
      
      bodyColor_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:Car)
  }

  // @@protoc_insertion_point(class_scope:Car)
  private static final com.mondris.generatedProtobufClass.Car DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.mondris.generatedProtobufClass.Car();
  }

  public static com.mondris.generatedProtobufClass.Car getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Car>
      PARSER = new com.google.protobuf.AbstractParser<Car>() {
    @java.lang.Override
    public Car parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Car(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Car> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Car> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.mondris.generatedProtobufClass.Car getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
