package beginUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DBconn.DBconn;

public class Exist {
	public boolean empExist(int number)
	{
		Connection conn = new DBconn().getConn();
		PreparedStatement pstmt = null;
		boolean bool = true;
		String sql = "select * from EMPLOYEE where eNumber=?";
		try{
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, number);
			ResultSet rs =pstmt.executeQuery();
			if (rs.next()) {
				bool = true;
			} else {
				bool = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}
	
	public boolean tableExist() throws SQLException
	{
		Connection conn = new DBconn().getConn();
		String tableName = "EMPLOYEE";
		boolean bool = true;
		try {  
	         ResultSet rs = conn.getMetaData().getTables(null, null, tableName, null); 
	         if (rs.next()) {  
	            bool = true; 
	         }else{  
	            bool = false;
	         }  
	     } finally {  }  
		return bool;
	}
	
}
