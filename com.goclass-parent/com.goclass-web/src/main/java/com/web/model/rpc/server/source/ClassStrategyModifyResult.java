/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.web.model.rpc.server.source;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-10-29")
public class ClassStrategyModifyResult implements org.apache.thrift.TBase<ClassStrategyModifyResult, ClassStrategyModifyResult._Fields>, java.io.Serializable, Cloneable, Comparable<ClassStrategyModifyResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ClassStrategyModifyResult");

  private static final org.apache.thrift.protocol.TField TASK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("taskId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField STAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("stage", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField STAGE_ONE_RESULT_OF_CLASS_STRATEGY_FIELD_DESC = new org.apache.thrift.protocol.TField("StageOneResultOfClassStrategy", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField STAGE_TWO_RESULT_OF_CLASS_STRATEGY_FIELD_DESC = new org.apache.thrift.protocol.TField("StageTwoResultOfClassStrategy", org.apache.thrift.protocol.TType.STRUCT, (short)6);
  private static final org.apache.thrift.protocol.TField STAGE_THREE_RESULT_OF_CLASS_STRATEGY_FIELD_DESC = new org.apache.thrift.protocol.TField("StageThreeResultOfClassStrategy", org.apache.thrift.protocol.TType.STRUCT, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ClassStrategyModifyResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ClassStrategyModifyResultTupleSchemeFactory();

  public int taskId; // required
  public int stage; // required
  public @org.apache.thrift.annotation.Nullable StageOneResultOfClassStrategy StageOneResultOfClassStrategy; // required
  public @org.apache.thrift.annotation.Nullable StageTwoResultOfClassStrategy StageTwoResultOfClassStrategy; // required
  public @org.apache.thrift.annotation.Nullable StageThreeResultOfClassStrategy StageThreeResultOfClassStrategy; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TASK_ID((short)1, "taskId"),
    STAGE((short)2, "stage"),
    STAGE_ONE_RESULT_OF_CLASS_STRATEGY((short)5, "StageOneResultOfClassStrategy"),
    STAGE_TWO_RESULT_OF_CLASS_STRATEGY((short)6, "StageTwoResultOfClassStrategy"),
    STAGE_THREE_RESULT_OF_CLASS_STRATEGY((short)7, "StageThreeResultOfClassStrategy");

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
        case 1: // TASK_ID
          return TASK_ID;
        case 2: // STAGE
          return STAGE;
        case 5: // STAGE_ONE_RESULT_OF_CLASS_STRATEGY
          return STAGE_ONE_RESULT_OF_CLASS_STRATEGY;
        case 6: // STAGE_TWO_RESULT_OF_CLASS_STRATEGY
          return STAGE_TWO_RESULT_OF_CLASS_STRATEGY;
        case 7: // STAGE_THREE_RESULT_OF_CLASS_STRATEGY
          return STAGE_THREE_RESULT_OF_CLASS_STRATEGY;
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
  private static final int __TASKID_ISSET_ID = 0;
  private static final int __STAGE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TASK_ID, new org.apache.thrift.meta_data.FieldMetaData("taskId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STAGE, new org.apache.thrift.meta_data.FieldMetaData("stage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STAGE_ONE_RESULT_OF_CLASS_STRATEGY, new org.apache.thrift.meta_data.FieldMetaData("StageOneResultOfClassStrategy", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StageOneResultOfClassStrategy.class)));
    tmpMap.put(_Fields.STAGE_TWO_RESULT_OF_CLASS_STRATEGY, new org.apache.thrift.meta_data.FieldMetaData("StageTwoResultOfClassStrategy", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StageTwoResultOfClassStrategy.class)));
    tmpMap.put(_Fields.STAGE_THREE_RESULT_OF_CLASS_STRATEGY, new org.apache.thrift.meta_data.FieldMetaData("StageThreeResultOfClassStrategy", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StageThreeResultOfClassStrategy.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ClassStrategyModifyResult.class, metaDataMap);
  }

  public ClassStrategyModifyResult() {
  }

  public ClassStrategyModifyResult(
    int taskId,
    int stage,
    StageOneResultOfClassStrategy StageOneResultOfClassStrategy,
    StageTwoResultOfClassStrategy StageTwoResultOfClassStrategy,
    StageThreeResultOfClassStrategy StageThreeResultOfClassStrategy)
  {
    this();
    this.taskId = taskId;
    setTaskIdIsSet(true);
    this.stage = stage;
    setStageIsSet(true);
    this.StageOneResultOfClassStrategy = StageOneResultOfClassStrategy;
    this.StageTwoResultOfClassStrategy = StageTwoResultOfClassStrategy;
    this.StageThreeResultOfClassStrategy = StageThreeResultOfClassStrategy;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClassStrategyModifyResult(ClassStrategyModifyResult other) {
    __isset_bitfield = other.__isset_bitfield;
    this.taskId = other.taskId;
    this.stage = other.stage;
    if (other.isSetStageOneResultOfClassStrategy()) {
      this.StageOneResultOfClassStrategy = new StageOneResultOfClassStrategy(other.StageOneResultOfClassStrategy);
    }
    if (other.isSetStageTwoResultOfClassStrategy()) {
      this.StageTwoResultOfClassStrategy = new StageTwoResultOfClassStrategy(other.StageTwoResultOfClassStrategy);
    }
    if (other.isSetStageThreeResultOfClassStrategy()) {
      this.StageThreeResultOfClassStrategy = new StageThreeResultOfClassStrategy(other.StageThreeResultOfClassStrategy);
    }
  }

  public ClassStrategyModifyResult deepCopy() {
    return new ClassStrategyModifyResult(this);
  }

  @Override
  public void clear() {
    setTaskIdIsSet(false);
    this.taskId = 0;
    setStageIsSet(false);
    this.stage = 0;
    this.StageOneResultOfClassStrategy = null;
    this.StageTwoResultOfClassStrategy = null;
    this.StageThreeResultOfClassStrategy = null;
  }

  public int getTaskId() {
    return this.taskId;
  }

  public ClassStrategyModifyResult setTaskId(int taskId) {
    this.taskId = taskId;
    setTaskIdIsSet(true);
    return this;
  }

  public void unsetTaskId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TASKID_ISSET_ID);
  }

  /** Returns true if field taskId is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TASKID_ISSET_ID);
  }

  public void setTaskIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TASKID_ISSET_ID, value);
  }

  public int getStage() {
    return this.stage;
  }

  public ClassStrategyModifyResult setStage(int stage) {
    this.stage = stage;
    setStageIsSet(true);
    return this;
  }

  public void unsetStage() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STAGE_ISSET_ID);
  }

  /** Returns true if field stage is set (has been assigned a value) and false otherwise */
  public boolean isSetStage() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STAGE_ISSET_ID);
  }

  public void setStageIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STAGE_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public StageOneResultOfClassStrategy getStageOneResultOfClassStrategy() {
    return this.StageOneResultOfClassStrategy;
  }

  public ClassStrategyModifyResult setStageOneResultOfClassStrategy(@org.apache.thrift.annotation.Nullable StageOneResultOfClassStrategy StageOneResultOfClassStrategy) {
    this.StageOneResultOfClassStrategy = StageOneResultOfClassStrategy;
    return this;
  }

  public void unsetStageOneResultOfClassStrategy() {
    this.StageOneResultOfClassStrategy = null;
  }

  /** Returns true if field StageOneResultOfClassStrategy is set (has been assigned a value) and false otherwise */
  public boolean isSetStageOneResultOfClassStrategy() {
    return this.StageOneResultOfClassStrategy != null;
  }

  public void setStageOneResultOfClassStrategyIsSet(boolean value) {
    if (!value) {
      this.StageOneResultOfClassStrategy = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public StageTwoResultOfClassStrategy getStageTwoResultOfClassStrategy() {
    return this.StageTwoResultOfClassStrategy;
  }

  public ClassStrategyModifyResult setStageTwoResultOfClassStrategy(@org.apache.thrift.annotation.Nullable StageTwoResultOfClassStrategy StageTwoResultOfClassStrategy) {
    this.StageTwoResultOfClassStrategy = StageTwoResultOfClassStrategy;
    return this;
  }

  public void unsetStageTwoResultOfClassStrategy() {
    this.StageTwoResultOfClassStrategy = null;
  }

  /** Returns true if field StageTwoResultOfClassStrategy is set (has been assigned a value) and false otherwise */
  public boolean isSetStageTwoResultOfClassStrategy() {
    return this.StageTwoResultOfClassStrategy != null;
  }

  public void setStageTwoResultOfClassStrategyIsSet(boolean value) {
    if (!value) {
      this.StageTwoResultOfClassStrategy = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public StageThreeResultOfClassStrategy getStageThreeResultOfClassStrategy() {
    return this.StageThreeResultOfClassStrategy;
  }

  public ClassStrategyModifyResult setStageThreeResultOfClassStrategy(@org.apache.thrift.annotation.Nullable StageThreeResultOfClassStrategy StageThreeResultOfClassStrategy) {
    this.StageThreeResultOfClassStrategy = StageThreeResultOfClassStrategy;
    return this;
  }

  public void unsetStageThreeResultOfClassStrategy() {
    this.StageThreeResultOfClassStrategy = null;
  }

  /** Returns true if field StageThreeResultOfClassStrategy is set (has been assigned a value) and false otherwise */
  public boolean isSetStageThreeResultOfClassStrategy() {
    return this.StageThreeResultOfClassStrategy != null;
  }

  public void setStageThreeResultOfClassStrategyIsSet(boolean value) {
    if (!value) {
      this.StageThreeResultOfClassStrategy = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TASK_ID:
      if (value == null) {
        unsetTaskId();
      } else {
        setTaskId((java.lang.Integer)value);
      }
      break;

    case STAGE:
      if (value == null) {
        unsetStage();
      } else {
        setStage((java.lang.Integer)value);
      }
      break;

    case STAGE_ONE_RESULT_OF_CLASS_STRATEGY:
      if (value == null) {
        unsetStageOneResultOfClassStrategy();
      } else {
        setStageOneResultOfClassStrategy((StageOneResultOfClassStrategy)value);
      }
      break;

    case STAGE_TWO_RESULT_OF_CLASS_STRATEGY:
      if (value == null) {
        unsetStageTwoResultOfClassStrategy();
      } else {
        setStageTwoResultOfClassStrategy((StageTwoResultOfClassStrategy)value);
      }
      break;

    case STAGE_THREE_RESULT_OF_CLASS_STRATEGY:
      if (value == null) {
        unsetStageThreeResultOfClassStrategy();
      } else {
        setStageThreeResultOfClassStrategy((StageThreeResultOfClassStrategy)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TASK_ID:
      return getTaskId();

    case STAGE:
      return getStage();

    case STAGE_ONE_RESULT_OF_CLASS_STRATEGY:
      return getStageOneResultOfClassStrategy();

    case STAGE_TWO_RESULT_OF_CLASS_STRATEGY:
      return getStageTwoResultOfClassStrategy();

    case STAGE_THREE_RESULT_OF_CLASS_STRATEGY:
      return getStageThreeResultOfClassStrategy();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TASK_ID:
      return isSetTaskId();
    case STAGE:
      return isSetStage();
    case STAGE_ONE_RESULT_OF_CLASS_STRATEGY:
      return isSetStageOneResultOfClassStrategy();
    case STAGE_TWO_RESULT_OF_CLASS_STRATEGY:
      return isSetStageTwoResultOfClassStrategy();
    case STAGE_THREE_RESULT_OF_CLASS_STRATEGY:
      return isSetStageThreeResultOfClassStrategy();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ClassStrategyModifyResult)
      return this.equals((ClassStrategyModifyResult)that);
    return false;
  }

  public boolean equals(ClassStrategyModifyResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_taskId = true;
    boolean that_present_taskId = true;
    if (this_present_taskId || that_present_taskId) {
      if (!(this_present_taskId && that_present_taskId))
        return false;
      if (this.taskId != that.taskId)
        return false;
    }

    boolean this_present_stage = true;
    boolean that_present_stage = true;
    if (this_present_stage || that_present_stage) {
      if (!(this_present_stage && that_present_stage))
        return false;
      if (this.stage != that.stage)
        return false;
    }

    boolean this_present_StageOneResultOfClassStrategy = true && this.isSetStageOneResultOfClassStrategy();
    boolean that_present_StageOneResultOfClassStrategy = true && that.isSetStageOneResultOfClassStrategy();
    if (this_present_StageOneResultOfClassStrategy || that_present_StageOneResultOfClassStrategy) {
      if (!(this_present_StageOneResultOfClassStrategy && that_present_StageOneResultOfClassStrategy))
        return false;
      if (!this.StageOneResultOfClassStrategy.equals(that.StageOneResultOfClassStrategy))
        return false;
    }

    boolean this_present_StageTwoResultOfClassStrategy = true && this.isSetStageTwoResultOfClassStrategy();
    boolean that_present_StageTwoResultOfClassStrategy = true && that.isSetStageTwoResultOfClassStrategy();
    if (this_present_StageTwoResultOfClassStrategy || that_present_StageTwoResultOfClassStrategy) {
      if (!(this_present_StageTwoResultOfClassStrategy && that_present_StageTwoResultOfClassStrategy))
        return false;
      if (!this.StageTwoResultOfClassStrategy.equals(that.StageTwoResultOfClassStrategy))
        return false;
    }

    boolean this_present_StageThreeResultOfClassStrategy = true && this.isSetStageThreeResultOfClassStrategy();
    boolean that_present_StageThreeResultOfClassStrategy = true && that.isSetStageThreeResultOfClassStrategy();
    if (this_present_StageThreeResultOfClassStrategy || that_present_StageThreeResultOfClassStrategy) {
      if (!(this_present_StageThreeResultOfClassStrategy && that_present_StageThreeResultOfClassStrategy))
        return false;
      if (!this.StageThreeResultOfClassStrategy.equals(that.StageThreeResultOfClassStrategy))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + taskId;

    hashCode = hashCode * 8191 + stage;

    hashCode = hashCode * 8191 + ((isSetStageOneResultOfClassStrategy()) ? 131071 : 524287);
    if (isSetStageOneResultOfClassStrategy())
      hashCode = hashCode * 8191 + StageOneResultOfClassStrategy.hashCode();

    hashCode = hashCode * 8191 + ((isSetStageTwoResultOfClassStrategy()) ? 131071 : 524287);
    if (isSetStageTwoResultOfClassStrategy())
      hashCode = hashCode * 8191 + StageTwoResultOfClassStrategy.hashCode();

    hashCode = hashCode * 8191 + ((isSetStageThreeResultOfClassStrategy()) ? 131071 : 524287);
    if (isSetStageThreeResultOfClassStrategy())
      hashCode = hashCode * 8191 + StageThreeResultOfClassStrategy.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ClassStrategyModifyResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetTaskId()).compareTo(other.isSetTaskId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskId, other.taskId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStage()).compareTo(other.isSetStage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stage, other.stage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStageOneResultOfClassStrategy()).compareTo(other.isSetStageOneResultOfClassStrategy());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStageOneResultOfClassStrategy()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.StageOneResultOfClassStrategy, other.StageOneResultOfClassStrategy);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStageTwoResultOfClassStrategy()).compareTo(other.isSetStageTwoResultOfClassStrategy());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStageTwoResultOfClassStrategy()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.StageTwoResultOfClassStrategy, other.StageTwoResultOfClassStrategy);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStageThreeResultOfClassStrategy()).compareTo(other.isSetStageThreeResultOfClassStrategy());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStageThreeResultOfClassStrategy()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.StageThreeResultOfClassStrategy, other.StageThreeResultOfClassStrategy);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassStrategyModifyResult(");
    boolean first = true;

    sb.append("taskId:");
    sb.append(this.taskId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("stage:");
    sb.append(this.stage);
    first = false;
    if (!first) sb.append(", ");
    sb.append("StageOneResultOfClassStrategy:");
    if (this.StageOneResultOfClassStrategy == null) {
      sb.append("null");
    } else {
      sb.append(this.StageOneResultOfClassStrategy);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("StageTwoResultOfClassStrategy:");
    if (this.StageTwoResultOfClassStrategy == null) {
      sb.append("null");
    } else {
      sb.append(this.StageTwoResultOfClassStrategy);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("StageThreeResultOfClassStrategy:");
    if (this.StageThreeResultOfClassStrategy == null) {
      sb.append("null");
    } else {
      sb.append(this.StageThreeResultOfClassStrategy);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (StageOneResultOfClassStrategy != null) {
      StageOneResultOfClassStrategy.validate();
    }
    if (StageTwoResultOfClassStrategy != null) {
      StageTwoResultOfClassStrategy.validate();
    }
    if (StageThreeResultOfClassStrategy != null) {
      StageThreeResultOfClassStrategy.validate();
    }
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

  private static class ClassStrategyModifyResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ClassStrategyModifyResultStandardScheme getScheme() {
      return new ClassStrategyModifyResultStandardScheme();
    }
  }

  private static class ClassStrategyModifyResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<ClassStrategyModifyResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ClassStrategyModifyResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TASK_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.taskId = iprot.readI32();
              struct.setTaskIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.stage = iprot.readI32();
              struct.setStageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STAGE_ONE_RESULT_OF_CLASS_STRATEGY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.StageOneResultOfClassStrategy = new StageOneResultOfClassStrategy();
              struct.StageOneResultOfClassStrategy.read(iprot);
              struct.setStageOneResultOfClassStrategyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // STAGE_TWO_RESULT_OF_CLASS_STRATEGY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.StageTwoResultOfClassStrategy = new StageTwoResultOfClassStrategy();
              struct.StageTwoResultOfClassStrategy.read(iprot);
              struct.setStageTwoResultOfClassStrategyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // STAGE_THREE_RESULT_OF_CLASS_STRATEGY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.StageThreeResultOfClassStrategy = new StageThreeResultOfClassStrategy();
              struct.StageThreeResultOfClassStrategy.read(iprot);
              struct.setStageThreeResultOfClassStrategyIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ClassStrategyModifyResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TASK_ID_FIELD_DESC);
      oprot.writeI32(struct.taskId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(STAGE_FIELD_DESC);
      oprot.writeI32(struct.stage);
      oprot.writeFieldEnd();
      if (struct.StageOneResultOfClassStrategy != null) {
        oprot.writeFieldBegin(STAGE_ONE_RESULT_OF_CLASS_STRATEGY_FIELD_DESC);
        struct.StageOneResultOfClassStrategy.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.StageTwoResultOfClassStrategy != null) {
        oprot.writeFieldBegin(STAGE_TWO_RESULT_OF_CLASS_STRATEGY_FIELD_DESC);
        struct.StageTwoResultOfClassStrategy.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.StageThreeResultOfClassStrategy != null) {
        oprot.writeFieldBegin(STAGE_THREE_RESULT_OF_CLASS_STRATEGY_FIELD_DESC);
        struct.StageThreeResultOfClassStrategy.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ClassStrategyModifyResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ClassStrategyModifyResultTupleScheme getScheme() {
      return new ClassStrategyModifyResultTupleScheme();
    }
  }

  private static class ClassStrategyModifyResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<ClassStrategyModifyResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ClassStrategyModifyResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTaskId()) {
        optionals.set(0);
      }
      if (struct.isSetStage()) {
        optionals.set(1);
      }
      if (struct.isSetStageOneResultOfClassStrategy()) {
        optionals.set(2);
      }
      if (struct.isSetStageTwoResultOfClassStrategy()) {
        optionals.set(3);
      }
      if (struct.isSetStageThreeResultOfClassStrategy()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetTaskId()) {
        oprot.writeI32(struct.taskId);
      }
      if (struct.isSetStage()) {
        oprot.writeI32(struct.stage);
      }
      if (struct.isSetStageOneResultOfClassStrategy()) {
        struct.StageOneResultOfClassStrategy.write(oprot);
      }
      if (struct.isSetStageTwoResultOfClassStrategy()) {
        struct.StageTwoResultOfClassStrategy.write(oprot);
      }
      if (struct.isSetStageThreeResultOfClassStrategy()) {
        struct.StageThreeResultOfClassStrategy.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ClassStrategyModifyResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.taskId = iprot.readI32();
        struct.setTaskIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.stage = iprot.readI32();
        struct.setStageIsSet(true);
      }
      if (incoming.get(2)) {
        struct.StageOneResultOfClassStrategy = new StageOneResultOfClassStrategy();
        struct.StageOneResultOfClassStrategy.read(iprot);
        struct.setStageOneResultOfClassStrategyIsSet(true);
      }
      if (incoming.get(3)) {
        struct.StageTwoResultOfClassStrategy = new StageTwoResultOfClassStrategy();
        struct.StageTwoResultOfClassStrategy.read(iprot);
        struct.setStageTwoResultOfClassStrategyIsSet(true);
      }
      if (incoming.get(4)) {
        struct.StageThreeResultOfClassStrategy = new StageThreeResultOfClassStrategy();
        struct.StageThreeResultOfClassStrategy.read(iprot);
        struct.setStageThreeResultOfClassStrategyIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

