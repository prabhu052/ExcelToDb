package org.fincrony.connectionMgr;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

class MySqlConnectionManager {

	Properties prop = new Properties();
	InputStream input = null;

	public MySqlConnectionManager() {
		try {
			input = new FileInputStream("conn.properties");

			Class.forName("driver");

			Connection con = DriverManager.getConnection("url", "user", "password");

			// here driver, url, user, password are imported from
			// conn.properties.

			System.out.println("Db connected");

			try {

				con.close();

			} catch (Exception e) {

				System.out.println(e);

			}
		} catch (Exception e) {

			System.out.println(e);

		}
	}

}