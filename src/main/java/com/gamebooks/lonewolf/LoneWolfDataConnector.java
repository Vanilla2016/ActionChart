package com.gamebooks.lonewolf;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import com.mysql.jdbc.MySQLConnection;

public class LoneWolfDataConnector implements DataSource {

	
	private static MySQLConnection con = null;
	/*	
	 * Static inner class to enable Singleton access to DB connection resource  
	 */
	public static class ConnectorRetriever {
		
		private static LoneWolfDataConnector dataConnector = new LoneWolfDataConnector();
		
		
		public ConnectorRetriever () {
		
		}
		
		/* Singleton method to ensure only one database connection */
		public static MySQLConnection getInstance() {
			
			if (con == null) {
				try {
					con =  dataConnector.getConnection();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return con;
		}
	}
	
		public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public MySQLConnection getConnection() throws SQLException {
	
		try {
				Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getStackTrace());
		}
		
		try{
			String url = "jdbc:mysql://localhost:3306/mysql";
			con = (MySQLConnection) DriverManager.getConnection(url, "root", "Sm0k3stack3r");
			System.out.println("Connected to Database!");
		} catch (Exception e){
			e.printStackTrace();
		}
		return con;
	}

	public void closeConnection(MySQLConnection passCon){
		try {
			passCon.close();
			System.out.println("Connection to database closed!");
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	public Connection getConnection(String arg0, String arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void setLogWriter(PrintWriter out) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void setLoginTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
