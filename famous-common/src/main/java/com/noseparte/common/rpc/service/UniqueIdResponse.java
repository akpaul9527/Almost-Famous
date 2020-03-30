// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package com.noseparte.common.rpc.service;

/**
 * <pre>
 *响应参数
 * </pre>
 *
 * Protobuf type {@code idservice.UniqueIdResponse}
 */
public  final class UniqueIdResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:idservice.UniqueIdResponse)
    UniqueIdResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UniqueIdResponse.newBuilder() to construct.
  private UniqueIdResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UniqueIdResponse() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new UniqueIdResponse();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UniqueIdResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
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
          case 8: {

            uniqueId_ = input.readSInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
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
    return com.noseparte.common.rpc.service.Service.internal_static_idservice_UniqueIdResponse_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.noseparte.common.rpc.service.Service.internal_static_idservice_UniqueIdResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.noseparte.common.rpc.service.UniqueIdResponse.class, com.noseparte.common.rpc.service.UniqueIdResponse.Builder.class);
  }

  public static final int UNIQUEID_FIELD_NUMBER = 1;
  private long uniqueId_;
  /**
   * <code>sint64 uniqueId = 1;</code>
   */
  public long getUniqueId() {
    return uniqueId_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (uniqueId_ != 0L) {
      output.writeSInt64(1, uniqueId_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (uniqueId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeSInt64Size(1, uniqueId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.noseparte.common.rpc.service.UniqueIdResponse)) {
      return super.equals(obj);
    }
    com.noseparte.common.rpc.service.UniqueIdResponse other = (com.noseparte.common.rpc.service.UniqueIdResponse) obj;

    if (getUniqueId()
        != other.getUniqueId()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + UNIQUEID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUniqueId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.noseparte.common.rpc.service.UniqueIdResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.noseparte.common.rpc.service.UniqueIdResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.noseparte.common.rpc.service.UniqueIdResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.noseparte.common.rpc.service.UniqueIdResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.noseparte.common.rpc.service.UniqueIdResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.noseparte.common.rpc.service.UniqueIdResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.noseparte.common.rpc.service.UniqueIdResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.noseparte.common.rpc.service.UniqueIdResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.noseparte.common.rpc.service.UniqueIdResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.noseparte.common.rpc.service.UniqueIdResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.noseparte.common.rpc.service.UniqueIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.noseparte.common.rpc.service.UniqueIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.noseparte.common.rpc.service.UniqueIdResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *响应参数
   * </pre>
   *
   * Protobuf type {@code idservice.UniqueIdResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:idservice.UniqueIdResponse)
      com.noseparte.common.rpc.service.UniqueIdResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.noseparte.common.rpc.service.Service.internal_static_idservice_UniqueIdResponse_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.noseparte.common.rpc.service.Service.internal_static_idservice_UniqueIdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.noseparte.common.rpc.service.UniqueIdResponse.class, com.noseparte.common.rpc.service.UniqueIdResponse.Builder.class);
    }

    // Construct using com.noseparte.common.rpc.service.UniqueIdResponse.newBuilder()
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
    @Override
    public Builder clear() {
      super.clear();
      uniqueId_ = 0L;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.noseparte.common.rpc.service.Service.internal_static_idservice_UniqueIdResponse_descriptor;
    }

    @Override
    public com.noseparte.common.rpc.service.UniqueIdResponse getDefaultInstanceForType() {
      return com.noseparte.common.rpc.service.UniqueIdResponse.getDefaultInstance();
    }

    @Override
    public com.noseparte.common.rpc.service.UniqueIdResponse build() {
      com.noseparte.common.rpc.service.UniqueIdResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public com.noseparte.common.rpc.service.UniqueIdResponse buildPartial() {
      com.noseparte.common.rpc.service.UniqueIdResponse result = new com.noseparte.common.rpc.service.UniqueIdResponse(this);
      result.uniqueId_ = uniqueId_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.noseparte.common.rpc.service.UniqueIdResponse) {
        return mergeFrom((com.noseparte.common.rpc.service.UniqueIdResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.noseparte.common.rpc.service.UniqueIdResponse other) {
      if (other == com.noseparte.common.rpc.service.UniqueIdResponse.getDefaultInstance()) return this;
      if (other.getUniqueId() != 0L) {
        setUniqueId(other.getUniqueId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.noseparte.common.rpc.service.UniqueIdResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.noseparte.common.rpc.service.UniqueIdResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long uniqueId_ ;
    /**
     * <code>sint64 uniqueId = 1;</code>
     */
    public long getUniqueId() {
      return uniqueId_;
    }
    /**
     * <code>sint64 uniqueId = 1;</code>
     */
    public Builder setUniqueId(long value) {

      uniqueId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>sint64 uniqueId = 1;</code>
     */
    public Builder clearUniqueId() {

      uniqueId_ = 0L;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:idservice.UniqueIdResponse)
  }

  // @@protoc_insertion_point(class_scope:idservice.UniqueIdResponse)
  private static final com.noseparte.common.rpc.service.UniqueIdResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.noseparte.common.rpc.service.UniqueIdResponse();
  }

  public static com.noseparte.common.rpc.service.UniqueIdResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UniqueIdResponse>
      PARSER = new com.google.protobuf.AbstractParser<UniqueIdResponse>() {
    @Override
    public UniqueIdResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UniqueIdResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UniqueIdResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<UniqueIdResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public com.noseparte.common.rpc.service.UniqueIdResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
