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
public class SSchueler extends org.jooq.impl.TableImpl<at.halbarth.alexander.model.tables.records.SSchuelerRecord> {

	private static final long serialVersionUID = 1602548647;

	/**
	 * The singleton instance of <code>schuldatenbank.s_schueler</code>
	 */
	public static final at.halbarth.alexander.model.tables.SSchueler S_SCHUELER = new at.halbarth.alexander.model.tables.SSchueler();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<at.halbarth.alexander.model.tables.records.SSchuelerRecord> getRecordType() {
		return at.halbarth.alexander.model.tables.records.SSchuelerRecord.class;
	}

	/**
	 * The column <code>schuldatenbank.s_schueler.s_id</code>. 
	 */
	public final org.jooq.TableField<at.halbarth.alexander.model.tables.records.SSchuelerRecord, java.lang.Integer> S_ID = createField("s_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>schuldatenbank.s_schueler.s_nachname</code>. 
	 */
	public final org.jooq.TableField<at.halbarth.alexander.model.tables.records.SSchuelerRecord, java.lang.String> S_NACHNAME = createField("s_nachname", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this);

	/**
	 * The column <code>schuldatenbank.s_schueler.s_vorname</code>. 
	 */
	public final org.jooq.TableField<at.halbarth.alexander.model.tables.records.SSchuelerRecord, java.lang.String> S_VORNAME = createField("s_vorname", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this);

	/**
	 * The column <code>schuldatenbank.s_schueler.s_gebdat</code>. 
	 */
	public final org.jooq.TableField<at.halbarth.alexander.model.tables.records.SSchuelerRecord, java.sql.Date> S_GEBDAT = createField("s_gebdat", org.jooq.impl.SQLDataType.DATE.nullable(false), this);

	/**
	 * The column <code>schuldatenbank.s_schueler.s_ort</code>. 
	 */
	public final org.jooq.TableField<at.halbarth.alexander.model.tables.records.SSchuelerRecord, java.lang.String> S_ORT = createField("s_ort", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this);

	/**
	 * The column <code>schuldatenbank.s_schueler.s_k_klasse</code>. 
	 */
	public final org.jooq.TableField<at.halbarth.alexander.model.tables.records.SSchuelerRecord, java.lang.String> S_K_KLASSE = createField("s_k_klasse", org.jooq.impl.SQLDataType.CHAR.length(4).nullable(false), this);

	/**
	 * Create a <code>schuldatenbank.s_schueler</code> table reference
	 */
	public SSchueler() {
		super("s_schueler", at.halbarth.alexander.model.Schuldatenbank.SCHULDATENBANK);
	}

	/**
	 * Create an aliased <code>schuldatenbank.s_schueler</code> table reference
	 */
	public SSchueler(java.lang.String alias) {
		super(alias, at.halbarth.alexander.model.Schuldatenbank.SCHULDATENBANK, at.halbarth.alexander.model.tables.SSchueler.S_SCHUELER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.SSchuelerRecord> getPrimaryKey() {
		return at.halbarth.alexander.model.Keys.KEY_S_SCHUELER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.SSchuelerRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.SSchuelerRecord>>asList(at.halbarth.alexander.model.Keys.KEY_S_SCHUELER_PRIMARY, at.halbarth.alexander.model.Keys.KEY_S_SCHUELER_S_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public at.halbarth.alexander.model.tables.SSchueler as(java.lang.String alias) {
		return new at.halbarth.alexander.model.tables.SSchueler(alias);
	}
}
