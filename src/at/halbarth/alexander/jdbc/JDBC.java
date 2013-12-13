package at.halbarth.alexander.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;

import at.halbarth.alexander.model.Tables;
import at.halbarth.alexander.model.tables.SSchueler;

public class JDBC {
	public static void main(String[] args) {
		Connection conn = null;
		String userName = "root";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/schuldatenbank";
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, password);
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
			Result<Record> result = create.select().from(Tables.S_SCHUELER).fetch();
			System.out.println("Schüler:");
			for (Record r : result) {
				Integer id = r.getValue(SSchueler.S_SCHUELER.S_ID);
				String name = r.getValue(SSchueler.S_SCHUELER.S_VORNAME) + ' '
						+ r.getValue(SSchueler.S_SCHUELER.S_NACHNAME);
				System.out.println("ID: " + id + "  " + "Name: " + name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ignore) {
				}
			}
		}
	}

}
