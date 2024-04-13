/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package it.gestoreattivita.bff.rs.dto.attivita;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class LavoraAttivitaDto extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5265653559229651702L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LavoraAttivitaDto\",\"namespace\":\"it.gestoreattivita.bff.rs.dto.attivita\",\"fields\":[{\"name\":\"idAttivita\",\"type\":\"long\"},{\"name\":\"lavorata\",\"type\":\"boolean\"},{\"name\":\"message\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null,\"avro.java.string\":\"String\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<LavoraAttivitaDto> ENCODER =
      new BinaryMessageEncoder<LavoraAttivitaDto>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<LavoraAttivitaDto> DECODER =
      new BinaryMessageDecoder<LavoraAttivitaDto>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<LavoraAttivitaDto> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<LavoraAttivitaDto> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<LavoraAttivitaDto> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<LavoraAttivitaDto>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this LavoraAttivitaDto to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a LavoraAttivitaDto from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a LavoraAttivitaDto instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static LavoraAttivitaDto fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private long idAttivita;
   private boolean lavorata;
   private java.lang.String message;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public LavoraAttivitaDto() {}

  /**
   * All-args constructor.
   * @param idAttivita The new value for idAttivita
   * @param lavorata The new value for lavorata
   * @param message The new value for message
   */
  public LavoraAttivitaDto(java.lang.Long idAttivita, java.lang.Boolean lavorata, java.lang.String message) {
    this.idAttivita = idAttivita;
    this.lavorata = lavorata;
    this.message = message;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return idAttivita;
    case 1: return lavorata;
    case 2: return message;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: idAttivita = (java.lang.Long)value$; break;
    case 1: lavorata = (java.lang.Boolean)value$; break;
    case 2: message = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'idAttivita' field.
   * @return The value of the 'idAttivita' field.
   */
  public long getIdAttivita() {
    return idAttivita;
  }


  /**
   * Sets the value of the 'idAttivita' field.
   * @param value the value to set.
   */
  public void setIdAttivita(long value) {
    this.idAttivita = value;
  }

  /**
   * Gets the value of the 'lavorata' field.
   * @return The value of the 'lavorata' field.
   */
  public boolean getLavorata() {
    return lavorata;
  }


  /**
   * Sets the value of the 'lavorata' field.
   * @param value the value to set.
   */
  public void setLavorata(boolean value) {
    this.lavorata = value;
  }

  /**
   * Gets the value of the 'message' field.
   * @return The value of the 'message' field.
   */
  public java.lang.String getMessage() {
    return message;
  }


  /**
   * Sets the value of the 'message' field.
   * @param value the value to set.
   */
  public void setMessage(java.lang.String value) {
    this.message = value;
  }

  /**
   * Creates a new LavoraAttivitaDto RecordBuilder.
   * @return A new LavoraAttivitaDto RecordBuilder
   */
  public static it.gestoreattivita.bff.rs.dto.attivita.LavoraAttivitaDto.Builder newBuilder() {
    return new it.gestoreattivita.bff.rs.dto.attivita.LavoraAttivitaDto.Builder();
  }

  /**
   * Creates a new LavoraAttivitaDto RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new LavoraAttivitaDto RecordBuilder
   */
  public static it.gestoreattivita.bff.rs.dto.attivita.LavoraAttivitaDto.Builder newBuilder(it.gestoreattivita.bff.rs.dto.attivita.LavoraAttivitaDto.Builder other) {
    if (other == null) {
      return new it.gestoreattivita.bff.rs.dto.attivita.LavoraAttivitaDto.Builder();
    } else {
      return new it.gestoreattivita.bff.rs.dto.attivita.LavoraAttivitaDto.Builder(other);
    }
  }

  /**
   * Creates a new LavoraAttivitaDto RecordBuilder by copying an existing LavoraAttivitaDto instance.
   * @param other The existing instance to copy.
   * @return A new LavoraAttivitaDto RecordBuilder
   */
  public static it.gestoreattivita.bff.rs.dto.attivita.LavoraAttivitaDto.Builder newBuilder(it.gestoreattivita.bff.rs.dto.attivita.LavoraAttivitaDto other) {
    if (other == null) {
      return new it.gestoreattivita.bff.rs.dto.attivita.LavoraAttivitaDto.Builder();
    } else {
      return new it.gestoreattivita.bff.rs.dto.attivita.LavoraAttivitaDto.Builder(other);
    }
  }

  /**
   * RecordBuilder for LavoraAttivitaDto instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LavoraAttivitaDto>
    implements org.apache.avro.data.RecordBuilder<LavoraAttivitaDto> {

    private long idAttivita;
    private boolean lavorata;
    private java.lang.String message;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(it.gestoreattivita.bff.rs.dto.attivita.LavoraAttivitaDto.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.idAttivita)) {
        this.idAttivita = data().deepCopy(fields()[0].schema(), other.idAttivita);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.lavorata)) {
        this.lavorata = data().deepCopy(fields()[1].schema(), other.lavorata);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.message)) {
        this.message = data().deepCopy(fields()[2].schema(), other.message);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing LavoraAttivitaDto instance
     * @param other The existing instance to copy.
     */
    private Builder(it.gestoreattivita.bff.rs.dto.attivita.LavoraAttivitaDto other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.idAttivita)) {
        this.idAttivita = data().deepCopy(fields()[0].schema(), other.idAttivita);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lavorata)) {
        this.lavorata = data().deepCopy(fields()[1].schema(), other.lavorata);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.message)) {
        this.message = data().deepCopy(fields()[2].schema(), other.message);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'idAttivita' field.
      * @return The value.
      */
    public long getIdAttivita() {
      return idAttivita;
    }


    /**
      * Sets the value of the 'idAttivita' field.
      * @param value The value of 'idAttivita'.
      * @return This builder.
      */
    public it.gestoreattivita.bff.rs.dto.attivita.LavoraAttivitaDto.Builder setIdAttivita(long value) {
      validate(fields()[0], value);
      this.idAttivita = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'idAttivita' field has been set.
      * @return True if the 'idAttivita' field has been set, false otherwise.
      */
    public boolean hasIdAttivita() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'idAttivita' field.
      * @return This builder.
      */
    public it.gestoreattivita.bff.rs.dto.attivita.LavoraAttivitaDto.Builder clearIdAttivita() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'lavorata' field.
      * @return The value.
      */
    public boolean getLavorata() {
      return lavorata;
    }


    /**
      * Sets the value of the 'lavorata' field.
      * @param value The value of 'lavorata'.
      * @return This builder.
      */
    public it.gestoreattivita.bff.rs.dto.attivita.LavoraAttivitaDto.Builder setLavorata(boolean value) {
      validate(fields()[1], value);
      this.lavorata = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'lavorata' field has been set.
      * @return True if the 'lavorata' field has been set, false otherwise.
      */
    public boolean hasLavorata() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'lavorata' field.
      * @return This builder.
      */
    public it.gestoreattivita.bff.rs.dto.attivita.LavoraAttivitaDto.Builder clearLavorata() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'message' field.
      * @return The value.
      */
    public java.lang.String getMessage() {
      return message;
    }


    /**
      * Sets the value of the 'message' field.
      * @param value The value of 'message'.
      * @return This builder.
      */
    public it.gestoreattivita.bff.rs.dto.attivita.LavoraAttivitaDto.Builder setMessage(java.lang.String value) {
      validate(fields()[2], value);
      this.message = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'message' field has been set.
      * @return True if the 'message' field has been set, false otherwise.
      */
    public boolean hasMessage() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'message' field.
      * @return This builder.
      */
    public it.gestoreattivita.bff.rs.dto.attivita.LavoraAttivitaDto.Builder clearMessage() {
      message = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public LavoraAttivitaDto build() {
      try {
        LavoraAttivitaDto record = new LavoraAttivitaDto();
        record.idAttivita = fieldSetFlags()[0] ? this.idAttivita : (java.lang.Long) defaultValue(fields()[0]);
        record.lavorata = fieldSetFlags()[1] ? this.lavorata : (java.lang.Boolean) defaultValue(fields()[1]);
        record.message = fieldSetFlags()[2] ? this.message : (java.lang.String) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<LavoraAttivitaDto>
    WRITER$ = (org.apache.avro.io.DatumWriter<LavoraAttivitaDto>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<LavoraAttivitaDto>
    READER$ = (org.apache.avro.io.DatumReader<LavoraAttivitaDto>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.idAttivita);

    out.writeBoolean(this.lavorata);

    if (this.message == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.message);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.idAttivita = in.readLong();

      this.lavorata = in.readBoolean();

      if (in.readIndex() != 1) {
        in.readNull();
        this.message = null;
      } else {
        this.message = in.readString();
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.idAttivita = in.readLong();
          break;

        case 1:
          this.lavorata = in.readBoolean();
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.message = null;
          } else {
            this.message = in.readString();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









