/**
 * This class is generated by jOOQ
 */
package at.halbarth.alexander.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Schuldatenbank extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -450820052;

	/**
	 * The singleton instance of <code>schuldatenbank</code>
	 */
	public static final Schuldatenbank SCHULDATENBANK = new Schuldatenbank();

	/**
	 * No further instances allowed
	 */
	private Schuldatenbank() {
		super("schuldatenbank");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			at.halbarth.alexander.model.tables.GGegenstaende.G_GEGENSTAENDE,
			at.halbarth.alexander.model.tables.KKlassen.K_KLASSEN,
			at.halbarth.alexander.model.tables.LLehrer.L_LEHRER,
			at.halbarth.alexander.model.tables.PPruefungen.P_PRUEFUNGEN,
			at.halbarth.alexander.model.tables.RRaeume.R_RAEUME,
			at.halbarth.alexander.model.tables.StStunden.ST_STUNDEN,
			at.halbarth.alexander.model.tables.SSchueler.S_SCHUELER,
			at.halbarth.alexander.model.tables.VVorgesetzte.V_VORGESETZTE);
	}
}