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
public class LLehrer extends org.jooq.impl.TableImpl<at.halbarth.alexander.model.tables.records.LLehrerRecord> {

	private static final long serialVersionUID = 1090353974;

	/**
	 * The singleton instance of <code>schuldatenbank.l_lehrer</code>
	 */
	public static final at.halbarth.alexander.model.tables.LLehrer L_LEHRER = new at.halbarth.alexander.model.tables.LLehrer();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<at.halbarth.alexander.model.tables.records.LLehrerRecord> getRecordType() {
		return at.halbarth.alexander.model.tables.records.LLehrerRecord.class;
	}

	/**
	 * The column <code>schuldatenbank.l_lehrer.l_id</code>. 
	 */
	public final org.jooq.TableField<at.halbarth.alexander.model.tables.records.LLehrerRecord, java.lang.String> L_ID = createField("l_id", org.jooq.impl.SQLDataType.CHAR.length(2).nullable(false), this);

	/**
	 * The column <code>schuldatenbank.l_lehrer.l_nachname</code>. 
	 */
	public final org.jooq.TableField<at.halbarth.alexander.model.tables.records.LLehrerRecord, java.lang.String> L_NACHNAME = createField("l_nachname", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this);

	/**
	 * The column <code>schuldatenbank.l_lehrer.l_vorname</code>. 
	 */
	public final org.jooq.TableField<at.halbarth.alexander.model.tables.records.LLehrerRecord, java.lang.String> L_VORNAME = createField("l_vorname", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this);

	/**
	 * The column <code>schuldatenbank.l_lehrer.l_gebdat</code>. 
	 */
	public final org.jooq.TableField<at.halbarth.alexander.model.tables.records.LLehrerRecord, java.sql.Date> L_GEBDAT = createField("l_gebdat", org.jooq.impl.SQLDataType.DATE.nullable(false), this);

	/**
	 * The column <code>schuldatenbank.l_lehrer.l_gehalt</code>. 
	 */
	public final org.jooq.TableField<at.halbarth.alexander.model.tables.records.LLehrerRecord, java.lang.Integer> L_GEHALT = createField("l_gehalt", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>schuldatenbank.l_lehrer.l_v_vorgesetzte</code>. 
	 */
	public final org.jooq.TableField<at.halbarth.alexander.model.tables.records.LLehrerRecord, java.lang.String> L_V_VORGESETZTE = createField("l_v_vorgesetzte", org.jooq.impl.SQLDataType.CHAR.length(2).nullable(false), this);

	/**
	 * Create a <code>schuldatenbank.l_lehrer</code> table reference
	 */
	public LLehrer() {
		super("l_lehrer", at.halbarth.alexander.model.Schuldatenbank.SCHULDATENBANK);
	}

	/**
	 * Create an aliased <code>schuldatenbank.l_lehrer</code> table reference
	 */
	public LLehrer(java.lang.String alias) {
		super(alias, at.halbarth.alexander.model.Schuldatenbank.SCHULDATENBANK, at.halbarth.alexander.model.tables.LLehrer.L_LEHRER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.LLehrerRecord> getPrimaryKey() {
		return at.halbarth.alexander.model.Keys.KEY_L_LEHRER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.LLehrerRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.LLehrerRecord>>asList(at.halbarth.alexander.model.Keys.KEY_L_LEHRER_PRIMARY, at.halbarth.alexander.model.Keys.KEY_L_LEHRER_L_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public at.halbarth.alexander.model.tables.LLehrer as(java.lang.String alias) {
		return new at.halbarth.alexander.model.tables.LLehrer(alias);
	}
}
