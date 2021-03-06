/**
 * This class is generated by jOOQ
 */
package at.halbarth.alexander.model.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class KKlassenRecord extends org.jooq.impl.UpdatableRecordImpl<at.halbarth.alexander.model.tables.records.KKlassenRecord> implements org.jooq.Record5<java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = 305794631;

	/**
	 * Setter for <code>schuldatenbank.k_klassen.k_id</code>. 
	 */
	public void setKId(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>schuldatenbank.k_klassen.k_id</code>. 
	 */
	public java.lang.String getKId() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>schuldatenbank.k_klassen.k_bez</code>. 
	 */
	public void setKBez(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>schuldatenbank.k_klassen.k_bez</code>. 
	 */
	public java.lang.String getKBez() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>schuldatenbank.k_klassen.k_s_klassensprecher</code>. 
	 */
	public void setKSKlassensprecher(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>schuldatenbank.k_klassen.k_s_klassensprecher</code>. 
	 */
	public java.lang.Integer getKSKlassensprecher() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>schuldatenbank.k_klassen.k_s_klassensprecherstv</code>. 
	 */
	public void setKSKlassensprecherstv(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>schuldatenbank.k_klassen.k_s_klassensprecherstv</code>. 
	 */
	public java.lang.Integer getKSKlassensprecherstv() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>schuldatenbank.k_klassen.k_l_kvorstand</code>. 
	 */
	public void setKLKvorstand(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>schuldatenbank.k_klassen.k_l_kvorstand</code>. 
	 */
	public java.lang.String getKLKvorstand() {
		return (java.lang.String) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return at.halbarth.alexander.model.tables.KKlassen.K_KLASSEN.K_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return at.halbarth.alexander.model.tables.KKlassen.K_KLASSEN.K_BEZ;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return at.halbarth.alexander.model.tables.KKlassen.K_KLASSEN.K_S_KLASSENSPRECHER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return at.halbarth.alexander.model.tables.KKlassen.K_KLASSEN.K_S_KLASSENSPRECHERSTV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return at.halbarth.alexander.model.tables.KKlassen.K_KLASSEN.K_L_KVORSTAND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getKId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getKBez();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getKSKlassensprecher();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getKSKlassensprecherstv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getKLKvorstand();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached KKlassenRecord
	 */
	public KKlassenRecord() {
		super(at.halbarth.alexander.model.tables.KKlassen.K_KLASSEN);
	}

	/**
	 * Create a detached, initialised KKlassenRecord
	 */
	public KKlassenRecord(java.lang.String kId, java.lang.String kBez, java.lang.Integer kSKlassensprecher, java.lang.Integer kSKlassensprecherstv, java.lang.String kLKvorstand) {
		super(at.halbarth.alexander.model.tables.KKlassen.K_KLASSEN);

		setValue(0, kId);
		setValue(1, kBez);
		setValue(2, kSKlassensprecher);
		setValue(3, kSKlassensprecherstv);
		setValue(4, kLKvorstand);
	}
}
