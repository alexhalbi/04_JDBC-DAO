/**
 * This class is generated by jOOQ
 */
package at.halbarth.alexander.model;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>schuldatenbank</code> 
 * schema
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.GGegenstaendeRecord> KEY_G_GEGENSTAENDE_PRIMARY = UniqueKeys0.KEY_G_GEGENSTAENDE_PRIMARY;
	public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.GGegenstaendeRecord> KEY_G_GEGENSTAENDE_G_ID = UniqueKeys0.KEY_G_GEGENSTAENDE_G_ID;
	public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.KKlassenRecord> KEY_K_KLASSEN_PRIMARY = UniqueKeys0.KEY_K_KLASSEN_PRIMARY;
	public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.KKlassenRecord> KEY_K_KLASSEN_K_ID = UniqueKeys0.KEY_K_KLASSEN_K_ID;
	public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.LLehrerRecord> KEY_L_LEHRER_PRIMARY = UniqueKeys0.KEY_L_LEHRER_PRIMARY;
	public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.LLehrerRecord> KEY_L_LEHRER_L_ID = UniqueKeys0.KEY_L_LEHRER_L_ID;
	public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.PPruefungenRecord> KEY_P_PRUEFUNGEN_PRIMARY = UniqueKeys0.KEY_P_PRUEFUNGEN_PRIMARY;
	public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.RRaeumeRecord> KEY_R_RAEUME_PRIMARY = UniqueKeys0.KEY_R_RAEUME_PRIMARY;
	public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.RRaeumeRecord> KEY_R_RAEUME_R_ID = UniqueKeys0.KEY_R_RAEUME_R_ID;
	public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.StStundenRecord> KEY_ST_STUNDEN_PRIMARY = UniqueKeys0.KEY_ST_STUNDEN_PRIMARY;
	public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.SSchuelerRecord> KEY_S_SCHUELER_PRIMARY = UniqueKeys0.KEY_S_SCHUELER_PRIMARY;
	public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.SSchuelerRecord> KEY_S_SCHUELER_S_ID = UniqueKeys0.KEY_S_SCHUELER_S_ID;
	public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.VVorgesetzteRecord> KEY_V_VORGESETZTE_PRIMARY = UniqueKeys0.KEY_V_VORGESETZTE_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.GGegenstaendeRecord> KEY_G_GEGENSTAENDE_PRIMARY = createUniqueKey(at.halbarth.alexander.model.tables.GGegenstaende.G_GEGENSTAENDE, at.halbarth.alexander.model.tables.GGegenstaende.G_GEGENSTAENDE.G_ID);
		public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.GGegenstaendeRecord> KEY_G_GEGENSTAENDE_G_ID = createUniqueKey(at.halbarth.alexander.model.tables.GGegenstaende.G_GEGENSTAENDE, at.halbarth.alexander.model.tables.GGegenstaende.G_GEGENSTAENDE.G_ID);
		public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.KKlassenRecord> KEY_K_KLASSEN_PRIMARY = createUniqueKey(at.halbarth.alexander.model.tables.KKlassen.K_KLASSEN, at.halbarth.alexander.model.tables.KKlassen.K_KLASSEN.K_ID);
		public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.KKlassenRecord> KEY_K_KLASSEN_K_ID = createUniqueKey(at.halbarth.alexander.model.tables.KKlassen.K_KLASSEN, at.halbarth.alexander.model.tables.KKlassen.K_KLASSEN.K_ID);
		public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.LLehrerRecord> KEY_L_LEHRER_PRIMARY = createUniqueKey(at.halbarth.alexander.model.tables.LLehrer.L_LEHRER, at.halbarth.alexander.model.tables.LLehrer.L_LEHRER.L_ID);
		public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.LLehrerRecord> KEY_L_LEHRER_L_ID = createUniqueKey(at.halbarth.alexander.model.tables.LLehrer.L_LEHRER, at.halbarth.alexander.model.tables.LLehrer.L_LEHRER.L_ID);
		public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.PPruefungenRecord> KEY_P_PRUEFUNGEN_PRIMARY = createUniqueKey(at.halbarth.alexander.model.tables.PPruefungen.P_PRUEFUNGEN, at.halbarth.alexander.model.tables.PPruefungen.P_PRUEFUNGEN.P_S_SCHUELER, at.halbarth.alexander.model.tables.PPruefungen.P_PRUEFUNGEN.P_G_GEGENSTAND, at.halbarth.alexander.model.tables.PPruefungen.P_PRUEFUNGEN.P_DATUM, at.halbarth.alexander.model.tables.PPruefungen.P_PRUEFUNGEN.P_L_LEHRER);
		public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.RRaeumeRecord> KEY_R_RAEUME_PRIMARY = createUniqueKey(at.halbarth.alexander.model.tables.RRaeume.R_RAEUME, at.halbarth.alexander.model.tables.RRaeume.R_RAEUME.R_ID);
		public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.RRaeumeRecord> KEY_R_RAEUME_R_ID = createUniqueKey(at.halbarth.alexander.model.tables.RRaeume.R_RAEUME, at.halbarth.alexander.model.tables.RRaeume.R_RAEUME.R_ID);
		public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.StStundenRecord> KEY_ST_STUNDEN_PRIMARY = createUniqueKey(at.halbarth.alexander.model.tables.StStunden.ST_STUNDEN, at.halbarth.alexander.model.tables.StStunden.ST_STUNDEN.ST_K_KLASSE, at.halbarth.alexander.model.tables.StStunden.ST_STUNDEN.ST_ZEIT);
		public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.SSchuelerRecord> KEY_S_SCHUELER_PRIMARY = createUniqueKey(at.halbarth.alexander.model.tables.SSchueler.S_SCHUELER, at.halbarth.alexander.model.tables.SSchueler.S_SCHUELER.S_ID);
		public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.SSchuelerRecord> KEY_S_SCHUELER_S_ID = createUniqueKey(at.halbarth.alexander.model.tables.SSchueler.S_SCHUELER, at.halbarth.alexander.model.tables.SSchueler.S_SCHUELER.S_ID);
		public static final org.jooq.UniqueKey<at.halbarth.alexander.model.tables.records.VVorgesetzteRecord> KEY_V_VORGESETZTE_PRIMARY = createUniqueKey(at.halbarth.alexander.model.tables.VVorgesetzte.V_VORGESETZTE, at.halbarth.alexander.model.tables.VVorgesetzte.V_VORGESETZTE.V_ID, at.halbarth.alexander.model.tables.VVorgesetzte.V_VORGESETZTE.V_L_CHEF);
	}
}
