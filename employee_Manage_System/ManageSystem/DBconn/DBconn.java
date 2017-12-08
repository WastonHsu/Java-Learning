package DBconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconn 
{
	public Connection getConn()
	{
		Connection conn=null;
		String username="sa";
		String password="test123";
		String url="jdbc:sqlserver://localhost:1433; DatabaseName=master";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn=DriverManager.getConnection(url,username,password);
			if(conn!=null)
			{
				//System.out.println("connect success");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void main(String args[])
	{
		new DBconn().getConn();
		System.out.println("DbConn connect success");
	}

}
