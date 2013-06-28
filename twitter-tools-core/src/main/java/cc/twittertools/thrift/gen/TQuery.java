/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cc.twittertools.thrift.gen;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TQuery implements org.apache.thrift.TBase<TQuery, TQuery._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TQuery");

  private static final org.apache.thrift.protocol.TField GROUP_FIELD_DESC = new org.apache.thrift.protocol.TField("group", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("token", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("text", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField MAX_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("max_id", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField NUM_RESULTS_FIELD_DESC = new org.apache.thrift.protocol.TField("num_results", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TQueryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TQueryTupleSchemeFactory());
  }

  public String group; // required
  public String token; // required
  public String text; // required
  public long max_id; // required
  public int num_results; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    GROUP((short)1, "group"),
    TOKEN((short)2, "token"),
    TEXT((short)3, "text"),
    MAX_ID((short)4, "max_id"),
    NUM_RESULTS((short)5, "num_results");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // GROUP
          return GROUP;
        case 2: // TOKEN
          return TOKEN;
        case 3: // TEXT
          return TEXT;
        case 4: // MAX_ID
          return MAX_ID;
        case 5: // NUM_RESULTS
          return NUM_RESULTS;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __MAX_ID_ISSET_ID = 0;
  private static final int __NUM_RESULTS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GROUP, new org.apache.thrift.meta_data.FieldMetaData("group", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TOKEN, new org.apache.thrift.meta_data.FieldMetaData("token", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TEXT, new org.apache.thrift.meta_data.FieldMetaData("text", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MAX_ID, new org.apache.thrift.meta_data.FieldMetaData("max_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NUM_RESULTS, new org.apache.thrift.meta_data.FieldMetaData("num_results", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TQuery.class, metaDataMap);
  }

  public TQuery() {
  }

  public TQuery(
    String group,
    String token,
    String text,
    long max_id,
    int num_results)
  {
    this();
    this.group = group;
    this.token = token;
    this.text = text;
    this.max_id = max_id;
    setMax_idIsSet(true);
    this.num_results = num_results;
    setNum_resultsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TQuery(TQuery other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetGroup()) {
      this.group = other.group;
    }
    if (other.isSetToken()) {
      this.token = other.token;
    }
    if (other.isSetText()) {
      this.text = other.text;
    }
    this.max_id = other.max_id;
    this.num_results = other.num_results;
  }

  public TQuery deepCopy() {
    return new TQuery(this);
  }

  @Override
  public void clear() {
    this.group = null;
    this.token = null;
    this.text = null;
    setMax_idIsSet(false);
    this.max_id = 0;
    setNum_resultsIsSet(false);
    this.num_results = 0;
  }

  public String getGroup() {
    return this.group;
  }

  public TQuery setGroup(String group) {
    this.group = group;
    return this;
  }

  public void unsetGroup() {
    this.group = null;
  }

  /** Returns true if field group is set (has been assigned a value) and false otherwise */
  public boolean isSetGroup() {
    return this.group != null;
  }

  public void setGroupIsSet(boolean value) {
    if (!value) {
      this.group = null;
    }
  }

  public String getToken() {
    return this.token;
  }

  public TQuery setToken(String token) {
    this.token = token;
    return this;
  }

  public void unsetToken() {
    this.token = null;
  }

  /** Returns true if field token is set (has been assigned a value) and false otherwise */
  public boolean isSetToken() {
    return this.token != null;
  }

  public void setTokenIsSet(boolean value) {
    if (!value) {
      this.token = null;
    }
  }

  public String getText() {
    return this.text;
  }

  public TQuery setText(String text) {
    this.text = text;
    return this;
  }

  public void unsetText() {
    this.text = null;
  }

  /** Returns true if field text is set (has been assigned a value) and false otherwise */
  public boolean isSetText() {
    return this.text != null;
  }

  public void setTextIsSet(boolean value) {
    if (!value) {
      this.text = null;
    }
  }

  public long getMax_id() {
    return this.max_id;
  }

  public TQuery setMax_id(long max_id) {
    this.max_id = max_id;
    setMax_idIsSet(true);
    return this;
  }

  public void unsetMax_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAX_ID_ISSET_ID);
  }

  /** Returns true if field max_id is set (has been assigned a value) and false otherwise */
  public boolean isSetMax_id() {
    return EncodingUtils.testBit(__isset_bitfield, __MAX_ID_ISSET_ID);
  }

  public void setMax_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAX_ID_ISSET_ID, value);
  }

  public int getNum_results() {
    return this.num_results;
  }

  public TQuery setNum_results(int num_results) {
    this.num_results = num_results;
    setNum_resultsIsSet(true);
    return this;
  }

  public void unsetNum_results() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUM_RESULTS_ISSET_ID);
  }

  /** Returns true if field num_results is set (has been assigned a value) and false otherwise */
  public boolean isSetNum_results() {
    return EncodingUtils.testBit(__isset_bitfield, __NUM_RESULTS_ISSET_ID);
  }

  public void setNum_resultsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUM_RESULTS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case GROUP:
      if (value == null) {
        unsetGroup();
      } else {
        setGroup((String)value);
      }
      break;

    case TOKEN:
      if (value == null) {
        unsetToken();
      } else {
        setToken((String)value);
      }
      break;

    case TEXT:
      if (value == null) {
        unsetText();
      } else {
        setText((String)value);
      }
      break;

    case MAX_ID:
      if (value == null) {
        unsetMax_id();
      } else {
        setMax_id((Long)value);
      }
      break;

    case NUM_RESULTS:
      if (value == null) {
        unsetNum_results();
      } else {
        setNum_results((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case GROUP:
      return getGroup();

    case TOKEN:
      return getToken();

    case TEXT:
      return getText();

    case MAX_ID:
      return Long.valueOf(getMax_id());

    case NUM_RESULTS:
      return Integer.valueOf(getNum_results());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case GROUP:
      return isSetGroup();
    case TOKEN:
      return isSetToken();
    case TEXT:
      return isSetText();
    case MAX_ID:
      return isSetMax_id();
    case NUM_RESULTS:
      return isSetNum_results();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TQuery)
      return this.equals((TQuery)that);
    return false;
  }

  public boolean equals(TQuery that) {
    if (that == null)
      return false;

    boolean this_present_group = true && this.isSetGroup();
    boolean that_present_group = true && that.isSetGroup();
    if (this_present_group || that_present_group) {
      if (!(this_present_group && that_present_group))
        return false;
      if (!this.group.equals(that.group))
        return false;
    }

    boolean this_present_token = true && this.isSetToken();
    boolean that_present_token = true && that.isSetToken();
    if (this_present_token || that_present_token) {
      if (!(this_present_token && that_present_token))
        return false;
      if (!this.token.equals(that.token))
        return false;
    }

    boolean this_present_text = true && this.isSetText();
    boolean that_present_text = true && that.isSetText();
    if (this_present_text || that_present_text) {
      if (!(this_present_text && that_present_text))
        return false;
      if (!this.text.equals(that.text))
        return false;
    }

    boolean this_present_max_id = true;
    boolean that_present_max_id = true;
    if (this_present_max_id || that_present_max_id) {
      if (!(this_present_max_id && that_present_max_id))
        return false;
      if (this.max_id != that.max_id)
        return false;
    }

    boolean this_present_num_results = true;
    boolean that_present_num_results = true;
    if (this_present_num_results || that_present_num_results) {
      if (!(this_present_num_results && that_present_num_results))
        return false;
      if (this.num_results != that.num_results)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TQuery other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TQuery typedOther = (TQuery)other;

    lastComparison = Boolean.valueOf(isSetGroup()).compareTo(typedOther.isSetGroup());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroup()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.group, typedOther.group);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetToken()).compareTo(typedOther.isSetToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.token, typedOther.token);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetText()).compareTo(typedOther.isSetText());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetText()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.text, typedOther.text);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMax_id()).compareTo(typedOther.isSetMax_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMax_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.max_id, typedOther.max_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNum_results()).compareTo(typedOther.isSetNum_results());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNum_results()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num_results, typedOther.num_results);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TQuery(");
    boolean first = true;

    sb.append("group:");
    if (this.group == null) {
      sb.append("null");
    } else {
      sb.append(this.group);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("token:");
    if (this.token == null) {
      sb.append("null");
    } else {
      sb.append(this.token);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("text:");
    if (this.text == null) {
      sb.append("null");
    } else {
      sb.append(this.text);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("max_id:");
    sb.append(this.max_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("num_results:");
    sb.append(this.num_results);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TQueryStandardSchemeFactory implements SchemeFactory {
    public TQueryStandardScheme getScheme() {
      return new TQueryStandardScheme();
    }
  }

  private static class TQueryStandardScheme extends StandardScheme<TQuery> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TQuery struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // GROUP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.group = iprot.readString();
              struct.setGroupIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.token = iprot.readString();
              struct.setTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.text = iprot.readString();
              struct.setTextIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MAX_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.max_id = iprot.readI64();
              struct.setMax_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // NUM_RESULTS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.num_results = iprot.readI32();
              struct.setNum_resultsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TQuery struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.group != null) {
        oprot.writeFieldBegin(GROUP_FIELD_DESC);
        oprot.writeString(struct.group);
        oprot.writeFieldEnd();
      }
      if (struct.token != null) {
        oprot.writeFieldBegin(TOKEN_FIELD_DESC);
        oprot.writeString(struct.token);
        oprot.writeFieldEnd();
      }
      if (struct.text != null) {
        oprot.writeFieldBegin(TEXT_FIELD_DESC);
        oprot.writeString(struct.text);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MAX_ID_FIELD_DESC);
      oprot.writeI64(struct.max_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NUM_RESULTS_FIELD_DESC);
      oprot.writeI32(struct.num_results);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TQueryTupleSchemeFactory implements SchemeFactory {
    public TQueryTupleScheme getScheme() {
      return new TQueryTupleScheme();
    }
  }

  private static class TQueryTupleScheme extends TupleScheme<TQuery> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TQuery struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetGroup()) {
        optionals.set(0);
      }
      if (struct.isSetToken()) {
        optionals.set(1);
      }
      if (struct.isSetText()) {
        optionals.set(2);
      }
      if (struct.isSetMax_id()) {
        optionals.set(3);
      }
      if (struct.isSetNum_results()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetGroup()) {
        oprot.writeString(struct.group);
      }
      if (struct.isSetToken()) {
        oprot.writeString(struct.token);
      }
      if (struct.isSetText()) {
        oprot.writeString(struct.text);
      }
      if (struct.isSetMax_id()) {
        oprot.writeI64(struct.max_id);
      }
      if (struct.isSetNum_results()) {
        oprot.writeI32(struct.num_results);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TQuery struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.group = iprot.readString();
        struct.setGroupIsSet(true);
      }
      if (incoming.get(1)) {
        struct.token = iprot.readString();
        struct.setTokenIsSet(true);
      }
      if (incoming.get(2)) {
        struct.text = iprot.readString();
        struct.setTextIsSet(true);
      }
      if (incoming.get(3)) {
        struct.max_id = iprot.readI64();
        struct.setMax_idIsSet(true);
      }
      if (incoming.get(4)) {
        struct.num_results = iprot.readI32();
        struct.setNum_resultsIsSet(true);
      }
    }
  }

}

