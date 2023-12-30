package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectDatabase {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection c = ConnectDatabase.initializeDatabase();
	}

	protected static Connection initializeDatabase() throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String url = "jdbc:sqlserver://NGUYENXINHDEP:1433;encrypt=true;trustServerCertificate=true;databaseName=qltv;integratedSecurity=true;";
		String user = "sa";
		String password = "123456";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Connected!");
		return con;
	}
}