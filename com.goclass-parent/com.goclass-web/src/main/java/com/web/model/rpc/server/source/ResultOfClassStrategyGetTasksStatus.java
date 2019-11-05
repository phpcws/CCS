/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.web.model.rpc.server.source;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-10-29")
public class ResultOfClassStrategyGetTasksStatus implements org.apache.thrift.TBase<ResultOfClassStrategyGetTasksStatus, ResultOfClassStrategyGetTasksStatus._Fields>, java.io.Serializable, Cloneable, Comparable<ResultOfClassStrategyGetTasksStatus> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ResultOfClassStrategyGetTasksStatus");

  private static final org.apache.thrift.protocol.TField STATUS_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("statusCode", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TASKS_STATUS_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("tasksStatusMap", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField TASKS_STAGE_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("tasksStageMap", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ResultOfClassStrategyGetTasksStatusStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ResultOfClassStrategyGetTasksStatusTupleSchemeFactory();

  public int statusCode; // required
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.Integer,java.lang.Short> tasksStatusMap; // required
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.Integer,java.lang.Short> tasksStageMap; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String message; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS_CODE((short)1, "statusCode"),
    TASKS_STATUS_MAP((short)2, "tasksStatusMap"),
    TASKS_STAGE_MAP((short)3, "tasksStageMap"),
    MESSAGE((short)4, "message");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STATUS_CODE
          return STATUS_CODE;
        case 2: // TASKS_STATUS_MAP
          return TASKS_STATUS_MAP;
        case 3: // TASKS_STAGE_MAP
          return TASKS_STAGE_MAP;
        case 4: // MESSAGE
          return MESSAGE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __STATUSCODE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS_CODE, new org.apache.thrift.meta_data.FieldMetaData("statusCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TASKS_STATUS_MAP, new org.apache.thrift.meta_data.FieldMetaData("tasksStatusMap", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16))));
    tmpMap.put(_Fields.TASKS_STAGE_MAP, new org.apache.thrift.meta_data.FieldMetaData("tasksStageMap", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16))));
    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ResultOfClassStrategyGetTasksStatus.class, metaDataMap);
  }

  public ResultOfClassStrategyGetTasksStatus() {
  }

  public ResultOfClassStrategyGetTasksStatus(
    int statusCode,
    java.util.Map<java.lang.Integer,java.lang.Short> tasksStatusMap,
    java.util.Map<java.lang.Integer,java.lang.Short> tasksStageMap,
    java.lang.String message)
  {
    this();
    this.statusCode = statusCode;
    setStatusCodeIsSet(true);
    this.tasksStatusMap = tasksStatusMap;
    this.tasksStageMap = tasksStageMap;
    this.message = message;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ResultOfClassStrategyGetTasksStatus(ResultOfClassStrategyGetTasksStatus other) {
    __isset_bitfield = other.__isset_bitfield;
    this.statusCode = other.statusCode;
    if (other.isSetTasksStatusMap()) {
      java.util.Map<java.lang.Integer,java.lang.Short> __this__tasksStatusMap = new java.util.HashMap<java.lang.Integer,java.lang.Short>(other.tasksStatusMap);
      this.tasksStatusMap = __this__tasksStatusMap;
    }
    if (other.isSetTasksStageMap()) {
      java.util.Map<java.lang.Integer,java.lang.Short> __this__tasksStageMap = new java.util.HashMap<java.lang.Integer,java.lang.Short>(other.tasksStageMap);
      this.tasksStageMap = __this__tasksStageMap;
    }
    if (other.isSetMessage()) {
      this.message = other.message;
    }
  }

  public ResultOfClassStrategyGetTasksStatus deepCopy() {
    return new ResultOfClassStrategyGetTasksStatus(this);
  }

  @Override
  public void clear() {
    setStatusCodeIsSet(false);
    this.statusCode = 0;
    this.tasksStatusMap = null;
    this.tasksStageMap = null;
    this.message = null;
  }

  public int getStatusCode() {
    return this.statusCode;
  }

  public ResultOfClassStrategyGetTasksStatus setStatusCode(int statusCode) {
    this.statusCode = statusCode;
    setStatusCodeIsSet(true);
    return this;
  }

  public void unsetStatusCode() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STATUSCODE_ISSET_ID);
  }

  /** Returns true if field statusCode is set (has been assigned a value) and false otherwise */
  public boolean isSetStatusCode() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STATUSCODE_ISSET_ID);
  }

  public void setStatusCodeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STATUSCODE_ISSET_ID, value);
  }

  public int getTasksStatusMapSize() {
    return (this.tasksStatusMap == null) ? 0 : this.tasksStatusMap.size();
  }

  public void putToTasksStatusMap(int key, short val) {
    if (this.tasksStatusMap == null) {
      this.tasksStatusMap = new java.util.HashMap<java.lang.Integer,java.lang.Short>();
    }
    this.tasksStatusMap.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.Integer,java.lang.Short> getTasksStatusMap() {
    return this.tasksStatusMap;
  }

  public ResultOfClassStrategyGetTasksStatus setTasksStatusMap(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.Integer,java.lang.Short> tasksStatusMap) {
    this.tasksStatusMap = tasksStatusMap;
    return this;
  }

  public void unsetTasksStatusMap() {
    this.tasksStatusMap = null;
  }

  /** Returns true if field tasksStatusMap is set (has been assigned a value) and false otherwise */
  public boolean isSetTasksStatusMap() {
    return this.tasksStatusMap != null;
  }

  public void setTasksStatusMapIsSet(boolean value) {
    if (!value) {
      this.tasksStatusMap = null;
    }
  }

  public int getTasksStageMapSize() {
    return (this.tasksStageMap == null) ? 0 : this.tasksStageMap.size();
  }

  public void putToTasksStageMap(int key, short val) {
    if (this.tasksStageMap == null) {
      this.tasksStageMap = new java.util.HashMap<java.lang.Integer,java.lang.Short>();
    }
    this.tasksStageMap.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.Integer,java.lang.Short> getTasksStageMap() {
    return this.tasksStageMap;
  }

  public ResultOfClassStrategyGetTasksStatus setTasksStageMap(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.Integer,java.lang.Short> tasksStageMap) {
    this.tasksStageMap = tasksStageMap;
    return this;
  }

  public void unsetTasksStageMap() {
    this.tasksStageMap = null;
  }

  /** Returns true if field tasksStageMap is set (has been assigned a value) and false otherwise */
  public boolean isSetTasksStageMap() {
    return this.tasksStageMap != null;
  }

  public void setTasksStageMapIsSet(boolean value) {
    if (!value) {
      this.tasksStageMap = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getMessage() {
    return this.message;
  }

  public ResultOfClassStrategyGetTasksStatus setMessage(@org.apache.thrift.annotation.Nullable java.lang.String message) {
    this.message = message;
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case STATUS_CODE:
      if (value == null) {
        unsetStatusCode();
      } else {
        setStatusCode((java.lang.Integer)value);
      }
      break;

    case TASKS_STATUS_MAP:
      if (value == null) {
        unsetTasksStatusMap();
      } else {
        setTasksStatusMap((java.util.Map<java.lang.Integer,java.lang.Short>)value);
      }
      break;

    case TASKS_STAGE_MAP:
      if (value == null) {
        unsetTasksStageMap();
      } else {
        setTasksStageMap((java.util.Map<java.lang.Integer,java.lang.Short>)value);
      }
      break;

    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS_CODE:
      return getStatusCode();

    case TASKS_STATUS_MAP:
      return getTasksStatusMap();

    case TASKS_STAGE_MAP:
      return getTasksStageMap();

    case MESSAGE:
      return getMessage();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STATUS_CODE:
      return isSetStatusCode();
    case TASKS_STATUS_MAP:
      return isSetTasksStatusMap();
    case TASKS_STAGE_MAP:
      return isSetTasksStageMap();
    case MESSAGE:
      return isSetMessage();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ResultOfClassStrategyGetTasksStatus)
      return this.equals((ResultOfClassStrategyGetTasksStatus)that);
    return false;
  }

  public boolean equals(ResultOfClassStrategyGetTasksStatus that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_statusCode = true;
    boolean that_present_statusCode = true;
    if (this_present_statusCode || that_present_statusCode) {
      if (!(this_present_statusCode && that_present_statusCode))
        return false;
      if (this.statusCode != that.statusCode)
        return false;
    }

    boolean this_present_tasksStatusMap = true && this.isSetTasksStatusMap();
    boolean that_present_tasksStatusMap = true && that.isSetTasksStatusMap();
    if (this_present_tasksStatusMap || that_present_tasksStatusMap) {
      if (!(this_present_tasksStatusMap && that_present_tasksStatusMap))
        return false;
      if (!this.tasksStatusMap.equals(that.tasksStatusMap))
        return false;
    }

    boolean this_present_tasksStageMap = true && this.isSetTasksStageMap();
    boolean that_present_tasksStageMap = true && that.isSetTasksStageMap();
    if (this_present_tasksStageMap || that_present_tasksStageMap) {
      if (!(this_present_tasksStageMap && that_present_tasksStageMap))
        return false;
      if (!this.tasksStageMap.equals(that.tasksStageMap))
        return false;
    }

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + statusCode;

    hashCode = hashCode * 8191 + ((isSetTasksStatusMap()) ? 131071 : 524287);
    if (isSetTasksStatusMap())
      hashCode = hashCode * 8191 + tasksStatusMap.hashCode();

    hashCode = hashCode * 8191 + ((isSetTasksStageMap()) ? 131071 : 524287);
    if (isSetTasksStageMap())
      hashCode = hashCode * 8191 + tasksStageMap.hashCode();

    hashCode = hashCode * 8191 + ((isSetMessage()) ? 131071 : 524287);
    if (isSetMessage())
      hashCode = hashCode * 8191 + message.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ResultOfClassStrategyGetTasksStatus other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetStatusCode()).compareTo(other.isSetStatusCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatusCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.statusCode, other.statusCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTasksStatusMap()).compareTo(other.isSetTasksStatusMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTasksStatusMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tasksStatusMap, other.tasksStatusMap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTasksStageMap()).compareTo(other.isSetTasksStageMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTasksStageMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tasksStageMap, other.tasksStageMap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, other.message);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ResultOfClassStrategyGetTasksStatus(");
    boolean first = true;

    sb.append("statusCode:");
    sb.append(this.statusCode);
    first = false;
    if (!first) sb.append(", ");
    sb.append("tasksStatusMap:");
    if (this.tasksStatusMap == null) {
      sb.append("null");
    } else {
      sb.append(this.tasksStatusMap);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tasksStageMap:");
    if (this.tasksStageMap == null) {
      sb.append("null");
    } else {
      sb.append(this.tasksStageMap);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("message:");
    if (this.message == null) {
      sb.append("null");
    } else {
      sb.append(this.message);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ResultOfClassStrategyGetTasksStatusStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ResultOfClassStrategyGetTasksStatusStandardScheme getScheme() {
      return new ResultOfClassStrategyGetTasksStatusStandardScheme();
    }
  }

  private static class ResultOfClassStrategyGetTasksStatusStandardScheme extends org.apache.thrift.scheme.StandardScheme<ResultOfClassStrategyGetTasksStatus> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ResultOfClassStrategyGetTasksStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.statusCode = iprot.readI32();
              struct.setStatusCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TASKS_STATUS_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map632 = iprot.readMapBegin();
                struct.tasksStatusMap = new java.util.HashMap<java.lang.Integer,java.lang.Short>(2*_map632.size);
                int _key633;
                short _val634;
                for (int _i635 = 0; _i635 < _map632.size; ++_i635)
                {
                  _key633 = iprot.readI32();
                  _val634 = iprot.readI16();
                  struct.tasksStatusMap.put(_key633, _val634);
                }
                iprot.readMapEnd();
              }
              struct.setTasksStatusMapIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TASKS_STAGE_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map636 = iprot.readMapBegin();
                struct.tasksStageMap = new java.util.HashMap<java.lang.Integer,java.lang.Short>(2*_map636.size);
                int _key637;
                short _val638;
                for (int _i639 = 0; _i639 < _map636.size; ++_i639)
                {
                  _key637 = iprot.readI32();
                  _val638 = iprot.readI16();
                  struct.tasksStageMap.put(_key637, _val638);
                }
                iprot.readMapEnd();
              }
              struct.setTasksStageMapIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.message = iprot.readString();
              struct.setMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ResultOfClassStrategyGetTasksStatus struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(STATUS_CODE_FIELD_DESC);
      oprot.writeI32(struct.statusCode);
      oprot.writeFieldEnd();
      if (struct.tasksStatusMap != null) {
        oprot.writeFieldBegin(TASKS_STATUS_MAP_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.I16, struct.tasksStatusMap.size()));
          for (java.util.Map.Entry<java.lang.Integer, java.lang.Short> _iter640 : struct.tasksStatusMap.entrySet())
          {
            oprot.writeI32(_iter640.getKey());
            oprot.writeI16(_iter640.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.tasksStageMap != null) {
        oprot.writeFieldBegin(TASKS_STAGE_MAP_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.I16, struct.tasksStageMap.size()));
          for (java.util.Map.Entry<java.lang.Integer, java.lang.Short> _iter641 : struct.tasksStageMap.entrySet())
          {
            oprot.writeI32(_iter641.getKey());
            oprot.writeI16(_iter641.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.message != null) {
        oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
        oprot.writeString(struct.message);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ResultOfClassStrategyGetTasksStatusTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ResultOfClassStrategyGetTasksStatusTupleScheme getScheme() {
      return new ResultOfClassStrategyGetTasksStatusTupleScheme();
    }
  }

  private static class ResultOfClassStrategyGetTasksStatusTupleScheme extends org.apache.thrift.scheme.TupleScheme<ResultOfClassStrategyGetTasksStatus> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ResultOfClassStrategyGetTasksStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStatusCode()) {
        optionals.set(0);
      }
      if (struct.isSetTasksStatusMap()) {
        optionals.set(1);
      }
      if (struct.isSetTasksStageMap()) {
        optionals.set(2);
      }
      if (struct.isSetMessage()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetStatusCode()) {
        oprot.writeI32(struct.statusCode);
      }
      if (struct.isSetTasksStatusMap()) {
        {
          oprot.writeI32(struct.tasksStatusMap.size());
          for (java.util.Map.Entry<java.lang.Integer, java.lang.Short> _iter642 : struct.tasksStatusMap.entrySet())
          {
            oprot.writeI32(_iter642.getKey());
            oprot.writeI16(_iter642.getValue());
          }
        }
      }
      if (struct.isSetTasksStageMap()) {
        {
          oprot.writeI32(struct.tasksStageMap.size());
          for (java.util.Map.Entry<java.lang.Integer, java.lang.Short> _iter643 : struct.tasksStageMap.entrySet())
          {
            oprot.writeI32(_iter643.getKey());
            oprot.writeI16(_iter643.getValue());
          }
        }
      }
      if (struct.isSetMessage()) {
        oprot.writeString(struct.message);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ResultOfClassStrategyGetTasksStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.statusCode = iprot.readI32();
        struct.setStatusCodeIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map644 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.I16, iprot.readI32());
          struct.tasksStatusMap = new java.util.HashMap<java.lang.Integer,java.lang.Short>(2*_map644.size);
          int _key645;
          short _val646;
          for (int _i647 = 0; _i647 < _map644.size; ++_i647)
          {
            _key645 = iprot.readI32();
            _val646 = iprot.readI16();
            struct.tasksStatusMap.put(_key645, _val646);
          }
        }
        struct.setTasksStatusMapIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map648 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.I16, iprot.readI32());
          struct.tasksStageMap = new java.util.HashMap<java.lang.Integer,java.lang.Short>(2*_map648.size);
          int _key649;
          short _val650;
          for (int _i651 = 0; _i651 < _map648.size; ++_i651)
          {
            _key649 = iprot.readI32();
            _val650 = iprot.readI16();
            struct.tasksStageMap.put(_key649, _val650);
          }
        }
        struct.setTasksStageMapIsSet(true);
      }
      if (incoming.get(3)) {
        struct.message = iprot.readString();
        struct.setMessageIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

