// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cell_down_req.proto

package com.ngsky.ice.comm.bean;

public final class CellDownReq {
  private CellDownReq() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReqDownOrBuilder extends
      // @@protoc_insertion_point(interface_extends:propt.ReqDown)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 对象唯一标识
     * </pre>
     *
     * <code>string objKey = 1;</code>
     */
    java.lang.String getObjKey();
    /**
     * <pre>
     * 对象唯一标识
     * </pre>
     *
     * <code>string objKey = 1;</code>
     */
    com.google.protobuf.ByteString
        getObjKeyBytes();

    /**
     * <pre>
     * 第几块
     * </pre>
     *
     * <code>uint32 whatChunk = 2;</code>
     */
    int getWhatChunk();

    /**
     * <pre>
     * 共几块
     * </pre>
     *
     * <code>uint32 countChunk = 3;</code>
     */
    int getCountChunk();

    /**
     * <pre>
     * 请求方法
     * </pre>
     *
     * <code>.propt.ReqDown.RequestType method = 4;</code>
     */
    int getMethodValue();
    /**
     * <pre>
     * 请求方法
     * </pre>
     *
     * <code>.propt.ReqDown.RequestType method = 4;</code>
     */
    com.ngsky.ice.comm.bean.CellDownReq.ReqDown.RequestType getMethod();

    /**
     * <pre>
     * 文件hash,文件唯一标识
     * </pre>
     *
     * <code>string fileHash = 5;</code>
     */
    java.lang.String getFileHash();
    /**
     * <pre>
     * 文件hash,文件唯一标识
     * </pre>
     *
     * <code>string fileHash = 5;</code>
     */
    com.google.protobuf.ByteString
        getFileHashBytes();
  }
  /**
   * Protobuf type {@code propt.ReqDown}
   */
  public  static final class ReqDown extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:propt.ReqDown)
      ReqDownOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReqDown.newBuilder() to construct.
    private ReqDown(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReqDown() {
      objKey_ = "";
      method_ = 0;
      fileHash_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReqDown();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReqDown(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              objKey_ = s;
              break;
            }
            case 16: {

              whatChunk_ = input.readUInt32();
              break;
            }
            case 24: {

              countChunk_ = input.readUInt32();
              break;
            }
            case 32: {
              int rawValue = input.readEnum();

              method_ = rawValue;
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              fileHash_ = s;
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
      return com.ngsky.ice.comm.bean.CellDownReq.internal_static_propt_ReqDown_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ngsky.ice.comm.bean.CellDownReq.internal_static_propt_ReqDown_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ngsky.ice.comm.bean.CellDownReq.ReqDown.class, com.ngsky.ice.comm.bean.CellDownReq.ReqDown.Builder.class);
    }

    /**
     * Protobuf enum {@code propt.ReqDown.RequestType}
     */
    public enum RequestType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>GET = 0;</code>
       */
      GET(0),
      /**
       * <code>PUT = 1;</code>
       */
      PUT(1),
      /**
       * <code>POST = 2;</code>
       */
      POST(2),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>GET = 0;</code>
       */
      public static final int GET_VALUE = 0;
      /**
       * <code>PUT = 1;</code>
       */
      public static final int PUT_VALUE = 1;
      /**
       * <code>POST = 2;</code>
       */
      public static final int POST_VALUE = 2;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static RequestType valueOf(int value) {
        return forNumber(value);
      }

      public static RequestType forNumber(int value) {
        switch (value) {
          case 0: return GET;
          case 1: return PUT;
          case 2: return POST;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<RequestType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          RequestType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<RequestType>() {
              public RequestType findValueByNumber(int number) {
                return RequestType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.ngsky.ice.comm.bean.CellDownReq.ReqDown.getDescriptor().getEnumTypes().get(0);
      }

      private static final RequestType[] VALUES = values();

      public static RequestType valueOf(
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

      private RequestType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:propt.ReqDown.RequestType)
    }

    public static final int OBJKEY_FIELD_NUMBER = 1;
    private volatile java.lang.Object objKey_;
    /**
     * <pre>
     * 对象唯一标识
     * </pre>
     *
     * <code>string objKey = 1;</code>
     */
    public java.lang.String getObjKey() {
      java.lang.Object ref = objKey_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        objKey_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 对象唯一标识
     * </pre>
     *
     * <code>string objKey = 1;</code>
     */
    public com.google.protobuf.ByteString
        getObjKeyBytes() {
      java.lang.Object ref = objKey_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        objKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int WHATCHUNK_FIELD_NUMBER = 2;
    private int whatChunk_;
    /**
     * <pre>
     * 第几块
     * </pre>
     *
     * <code>uint32 whatChunk = 2;</code>
     */
    public int getWhatChunk() {
      return whatChunk_;
    }

    public static final int COUNTCHUNK_FIELD_NUMBER = 3;
    private int countChunk_;
    /**
     * <pre>
     * 共几块
     * </pre>
     *
     * <code>uint32 countChunk = 3;</code>
     */
    public int getCountChunk() {
      return countChunk_;
    }

    public static final int METHOD_FIELD_NUMBER = 4;
    private int method_;
    /**
     * <pre>
     * 请求方法
     * </pre>
     *
     * <code>.propt.ReqDown.RequestType method = 4;</code>
     */
    public int getMethodValue() {
      return method_;
    }
    /**
     * <pre>
     * 请求方法
     * </pre>
     *
     * <code>.propt.ReqDown.RequestType method = 4;</code>
     */
    public com.ngsky.ice.comm.bean.CellDownReq.ReqDown.RequestType getMethod() {
      @SuppressWarnings("deprecation")
      com.ngsky.ice.comm.bean.CellDownReq.ReqDown.RequestType result = com.ngsky.ice.comm.bean.CellDownReq.ReqDown.RequestType.valueOf(method_);
      return result == null ? com.ngsky.ice.comm.bean.CellDownReq.ReqDown.RequestType.UNRECOGNIZED : result;
    }

    public static final int FILEHASH_FIELD_NUMBER = 5;
    private volatile java.lang.Object fileHash_;
    /**
     * <pre>
     * 文件hash,文件唯一标识
     * </pre>
     *
     * <code>string fileHash = 5;</code>
     */
    public java.lang.String getFileHash() {
      java.lang.Object ref = fileHash_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fileHash_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 文件hash,文件唯一标识
     * </pre>
     *
     * <code>string fileHash = 5;</code>
     */
    public com.google.protobuf.ByteString
        getFileHashBytes() {
      java.lang.Object ref = fileHash_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fileHash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getObjKeyBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, objKey_);
      }
      if (whatChunk_ != 0) {
        output.writeUInt32(2, whatChunk_);
      }
      if (countChunk_ != 0) {
        output.writeUInt32(3, countChunk_);
      }
      if (method_ != com.ngsky.ice.comm.bean.CellDownReq.ReqDown.RequestType.GET.getNumber()) {
        output.writeEnum(4, method_);
      }
      if (!getFileHashBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, fileHash_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getObjKeyBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, objKey_);
      }
      if (whatChunk_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, whatChunk_);
      }
      if (countChunk_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, countChunk_);
      }
      if (method_ != com.ngsky.ice.comm.bean.CellDownReq.ReqDown.RequestType.GET.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, method_);
      }
      if (!getFileHashBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, fileHash_);
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
      if (!(obj instanceof com.ngsky.ice.comm.bean.CellDownReq.ReqDown)) {
        return super.equals(obj);
      }
      com.ngsky.ice.comm.bean.CellDownReq.ReqDown other = (com.ngsky.ice.comm.bean.CellDownReq.ReqDown) obj;

      if (!getObjKey()
          .equals(other.getObjKey())) return false;
      if (getWhatChunk()
          != other.getWhatChunk()) return false;
      if (getCountChunk()
          != other.getCountChunk()) return false;
      if (method_ != other.method_) return false;
      if (!getFileHash()
          .equals(other.getFileHash())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + OBJKEY_FIELD_NUMBER;
      hash = (53 * hash) + getObjKey().hashCode();
      hash = (37 * hash) + WHATCHUNK_FIELD_NUMBER;
      hash = (53 * hash) + getWhatChunk();
      hash = (37 * hash) + COUNTCHUNK_FIELD_NUMBER;
      hash = (53 * hash) + getCountChunk();
      hash = (37 * hash) + METHOD_FIELD_NUMBER;
      hash = (53 * hash) + method_;
      hash = (37 * hash) + FILEHASH_FIELD_NUMBER;
      hash = (53 * hash) + getFileHash().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.ngsky.ice.comm.bean.CellDownReq.ReqDown parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ngsky.ice.comm.bean.CellDownReq.ReqDown parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ngsky.ice.comm.bean.CellDownReq.ReqDown parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ngsky.ice.comm.bean.CellDownReq.ReqDown parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ngsky.ice.comm.bean.CellDownReq.ReqDown parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ngsky.ice.comm.bean.CellDownReq.ReqDown parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ngsky.ice.comm.bean.CellDownReq.ReqDown parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ngsky.ice.comm.bean.CellDownReq.ReqDown parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.ngsky.ice.comm.bean.CellDownReq.ReqDown parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.ngsky.ice.comm.bean.CellDownReq.ReqDown parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.ngsky.ice.comm.bean.CellDownReq.ReqDown parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ngsky.ice.comm.bean.CellDownReq.ReqDown parseFrom(
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
    public static Builder newBuilder(com.ngsky.ice.comm.bean.CellDownReq.ReqDown prototype) {
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
     * Protobuf type {@code propt.ReqDown}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:propt.ReqDown)
        com.ngsky.ice.comm.bean.CellDownReq.ReqDownOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.ngsky.ice.comm.bean.CellDownReq.internal_static_propt_ReqDown_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.ngsky.ice.comm.bean.CellDownReq.internal_static_propt_ReqDown_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.ngsky.ice.comm.bean.CellDownReq.ReqDown.class, com.ngsky.ice.comm.bean.CellDownReq.ReqDown.Builder.class);
      }

      // Construct using com.ngsky.ice.comm.bean.CellDownReq.ReqDown.newBuilder()
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
        objKey_ = "";

        whatChunk_ = 0;

        countChunk_ = 0;

        method_ = 0;

        fileHash_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.ngsky.ice.comm.bean.CellDownReq.internal_static_propt_ReqDown_descriptor;
      }

      @java.lang.Override
      public com.ngsky.ice.comm.bean.CellDownReq.ReqDown getDefaultInstanceForType() {
        return com.ngsky.ice.comm.bean.CellDownReq.ReqDown.getDefaultInstance();
      }

      @java.lang.Override
      public com.ngsky.ice.comm.bean.CellDownReq.ReqDown build() {
        com.ngsky.ice.comm.bean.CellDownReq.ReqDown result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.ngsky.ice.comm.bean.CellDownReq.ReqDown buildPartial() {
        com.ngsky.ice.comm.bean.CellDownReq.ReqDown result = new com.ngsky.ice.comm.bean.CellDownReq.ReqDown(this);
        result.objKey_ = objKey_;
        result.whatChunk_ = whatChunk_;
        result.countChunk_ = countChunk_;
        result.method_ = method_;
        result.fileHash_ = fileHash_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.ngsky.ice.comm.bean.CellDownReq.ReqDown) {
          return mergeFrom((com.ngsky.ice.comm.bean.CellDownReq.ReqDown)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.ngsky.ice.comm.bean.CellDownReq.ReqDown other) {
        if (other == com.ngsky.ice.comm.bean.CellDownReq.ReqDown.getDefaultInstance()) return this;
        if (!other.getObjKey().isEmpty()) {
          objKey_ = other.objKey_;
          onChanged();
        }
        if (other.getWhatChunk() != 0) {
          setWhatChunk(other.getWhatChunk());
        }
        if (other.getCountChunk() != 0) {
          setCountChunk(other.getCountChunk());
        }
        if (other.method_ != 0) {
          setMethodValue(other.getMethodValue());
        }
        if (!other.getFileHash().isEmpty()) {
          fileHash_ = other.fileHash_;
          onChanged();
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
        com.ngsky.ice.comm.bean.CellDownReq.ReqDown parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.ngsky.ice.comm.bean.CellDownReq.ReqDown) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object objKey_ = "";
      /**
       * <pre>
       * 对象唯一标识
       * </pre>
       *
       * <code>string objKey = 1;</code>
       */
      public java.lang.String getObjKey() {
        java.lang.Object ref = objKey_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          objKey_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 对象唯一标识
       * </pre>
       *
       * <code>string objKey = 1;</code>
       */
      public com.google.protobuf.ByteString
          getObjKeyBytes() {
        java.lang.Object ref = objKey_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          objKey_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 对象唯一标识
       * </pre>
       *
       * <code>string objKey = 1;</code>
       */
      public Builder setObjKey(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        objKey_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 对象唯一标识
       * </pre>
       *
       * <code>string objKey = 1;</code>
       */
      public Builder clearObjKey() {
        
        objKey_ = getDefaultInstance().getObjKey();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 对象唯一标识
       * </pre>
       *
       * <code>string objKey = 1;</code>
       */
      public Builder setObjKeyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        objKey_ = value;
        onChanged();
        return this;
      }

      private int whatChunk_ ;
      /**
       * <pre>
       * 第几块
       * </pre>
       *
       * <code>uint32 whatChunk = 2;</code>
       */
      public int getWhatChunk() {
        return whatChunk_;
      }
      /**
       * <pre>
       * 第几块
       * </pre>
       *
       * <code>uint32 whatChunk = 2;</code>
       */
      public Builder setWhatChunk(int value) {
        
        whatChunk_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 第几块
       * </pre>
       *
       * <code>uint32 whatChunk = 2;</code>
       */
      public Builder clearWhatChunk() {
        
        whatChunk_ = 0;
        onChanged();
        return this;
      }

      private int countChunk_ ;
      /**
       * <pre>
       * 共几块
       * </pre>
       *
       * <code>uint32 countChunk = 3;</code>
       */
      public int getCountChunk() {
        return countChunk_;
      }
      /**
       * <pre>
       * 共几块
       * </pre>
       *
       * <code>uint32 countChunk = 3;</code>
       */
      public Builder setCountChunk(int value) {
        
        countChunk_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 共几块
       * </pre>
       *
       * <code>uint32 countChunk = 3;</code>
       */
      public Builder clearCountChunk() {
        
        countChunk_ = 0;
        onChanged();
        return this;
      }

      private int method_ = 0;
      /**
       * <pre>
       * 请求方法
       * </pre>
       *
       * <code>.propt.ReqDown.RequestType method = 4;</code>
       */
      public int getMethodValue() {
        return method_;
      }
      /**
       * <pre>
       * 请求方法
       * </pre>
       *
       * <code>.propt.ReqDown.RequestType method = 4;</code>
       */
      public Builder setMethodValue(int value) {
        method_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 请求方法
       * </pre>
       *
       * <code>.propt.ReqDown.RequestType method = 4;</code>
       */
      public com.ngsky.ice.comm.bean.CellDownReq.ReqDown.RequestType getMethod() {
        @SuppressWarnings("deprecation")
        com.ngsky.ice.comm.bean.CellDownReq.ReqDown.RequestType result = com.ngsky.ice.comm.bean.CellDownReq.ReqDown.RequestType.valueOf(method_);
        return result == null ? com.ngsky.ice.comm.bean.CellDownReq.ReqDown.RequestType.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       * 请求方法
       * </pre>
       *
       * <code>.propt.ReqDown.RequestType method = 4;</code>
       */
      public Builder setMethod(com.ngsky.ice.comm.bean.CellDownReq.ReqDown.RequestType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        method_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 请求方法
       * </pre>
       *
       * <code>.propt.ReqDown.RequestType method = 4;</code>
       */
      public Builder clearMethod() {
        
        method_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object fileHash_ = "";
      /**
       * <pre>
       * 文件hash,文件唯一标识
       * </pre>
       *
       * <code>string fileHash = 5;</code>
       */
      public java.lang.String getFileHash() {
        java.lang.Object ref = fileHash_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          fileHash_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 文件hash,文件唯一标识
       * </pre>
       *
       * <code>string fileHash = 5;</code>
       */
      public com.google.protobuf.ByteString
          getFileHashBytes() {
        java.lang.Object ref = fileHash_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          fileHash_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 文件hash,文件唯一标识
       * </pre>
       *
       * <code>string fileHash = 5;</code>
       */
      public Builder setFileHash(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        fileHash_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 文件hash,文件唯一标识
       * </pre>
       *
       * <code>string fileHash = 5;</code>
       */
      public Builder clearFileHash() {
        
        fileHash_ = getDefaultInstance().getFileHash();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 文件hash,文件唯一标识
       * </pre>
       *
       * <code>string fileHash = 5;</code>
       */
      public Builder setFileHashBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        fileHash_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:propt.ReqDown)
    }

    // @@protoc_insertion_point(class_scope:propt.ReqDown)
    private static final com.ngsky.ice.comm.bean.CellDownReq.ReqDown DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.ngsky.ice.comm.bean.CellDownReq.ReqDown();
    }

    public static com.ngsky.ice.comm.bean.CellDownReq.ReqDown getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReqDown>
        PARSER = new com.google.protobuf.AbstractParser<ReqDown>() {
      @java.lang.Override
      public ReqDown parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReqDown(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReqDown> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReqDown> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.ngsky.ice.comm.bean.CellDownReq.ReqDown getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_propt_ReqDown_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_propt_ReqDown_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023cell_down_req.proto\022\005propt\"\251\001\n\007ReqDown" +
      "\022\016\n\006objKey\030\001 \001(\t\022\021\n\twhatChunk\030\002 \001(\r\022\022\n\nc" +
      "ountChunk\030\003 \001(\r\022*\n\006method\030\004 \001(\0162\032.propt." +
      "ReqDown.RequestType\022\020\n\010fileHash\030\005 \001(\t\")\n" +
      "\013RequestType\022\007\n\003GET\020\000\022\007\n\003PUT\020\001\022\010\n\004POST\020\002" +
      "B&\n\027com.ngsky.ice.comm.beanB\013CellDownReq" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_propt_ReqDown_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_propt_ReqDown_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_propt_ReqDown_descriptor,
        new java.lang.String[] { "ObjKey", "WhatChunk", "CountChunk", "Method", "FileHash", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
