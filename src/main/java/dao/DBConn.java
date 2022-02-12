package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConn {
	//DB
		private  static String url = "jdbc:mysql://127.0.0.1:3306/employees";
		private static String dbUname = "root";
		private  static String dbpw = "giang@99";
		private static String dbDriver = "com.mysql.cj.jdbc.Driver";
		
		
		//connection DB
		
		public static Connection getConnection() {
			Connection conn = null;
			try {
				Class.forName(dbDriver);
				conn = DriverManager.getConnection(url, dbUname, dbpw);
			}catch(Exception e) {
				e.printStackTrace();
			}
			return conn;
		}
}
