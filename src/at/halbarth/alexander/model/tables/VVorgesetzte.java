/**
 * This class is generated by jOOQ
 */
package at.halbarth.alexander.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VVorgesetzte extends org.jooq.impl.TableImpl<at.halbarth.alexander.model.tables.records.VVorgesetzteRecord> {

	private static final long serialVersionUID = -1473073304;

	/**
	 * The singleton instance of <code>schuldatenbank.v_vorgesetzte</code>
	 */
	public static final at.halbarth.alexander.model.tables.VVorgesetzte V_VORGESETZTE = new at.halbarth.alexander.model.tables.VVorgesetzte();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<at.halbarth.alexander.model.tables.records.VVorgesetzteRecord> getRecordType() {
		return at.halbarth.alexander.model.tables.records.VVorgesetzteRecord.class;
	}

	/**
	 * The column <code>schuldatenbank.v_vorgesetzte.v_id</code>. 
	 */
	public final org.jooq.TableField<at.halbarth.alexander.model.tables.records.VVorgesetzteRecord, java.lang.String> V_ID = createField("v_id", org.jooq.impl.SQLDataType.CHAR.length(2).nullable(false), this);

	/**
	 * The column <code>schuldatenbank.v_vorgesetzte.v_bez</code>. 
	 */
	public final org.jooq.TableField<at.halbarth.alexander.model.tables.records.VVorgesetzteRecord, java.lang.String> V_BEZ = createField("v_bez", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this);

	/**
	 * The column <code>schuldatenbank.v_vorgesetzte.v_l_chef</code>. 
	 */
	public final org.jooq.TableField<at.halbarth.alexander.model.tables.records.VVorgesetzteRecord, java.lang.String> V_L_CHEF = createField("v_l_chef", org.jooq.impl.SQLDataType.CHAR.length(2).nullable(false), this);

	/**
	 * Create a <code>schuldatenbank.v_vorgesetzte</code> table reference
	 */
	public VVorgesetzte() {
		super("v_vorgesetzte", at.halbarth.alexander.model.Schuldatenbank.SCHULDATENBANK);
	}

	/**
	 * Create an aliased <code>schuldatenbank.v_vorgesetzte</code> table reference
	 */
	public VVorgesetzte(java.lang.String alias) {
		super(alias, at.halbarth.alexander.model.Schuldatenbank.SCHULDATENBANK, at.halbarth.alexander.model.tables.VVorgesetzte.V_VORGESETZTE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.VVorgesetzteRecord> getPrimaryKey() {
		return at.halbarth.alexander.model.Keys.KEY_V_VORGESETZTE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.VVorgesetzteRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.VVorgesetzteRecord>>asList(at.halbarth.alexander.model.Keys.KEY_V_VORGESETZTE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public at.halbarth.alexander.model.tables.VVorgesetzte as(java.lang.String alias) {
		return new at.halbarth.alexander.model.tables.VVorgesetzte(alias);
	}
}