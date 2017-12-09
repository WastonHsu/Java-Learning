package operateUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import beginUI.Employee;
import beginUI.Exist;
import DBconn.DBconn;

public class DeleteUI 
{
	public Employee delEmp(int number)
	{
		PreparedStatement pstmt = null;//声明预处理
		Connection conn = new DBconn().getConn();
		try
		{
			String sql = "delete from EMPLOYEE where eNumber=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, number);
			pstmt.execute();
			System.out.println("");
			System.out.println("------>删除成功<------");
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	
	public void delTable() throws SQLException {
			Connection conn = new DBconn().getConn();
			Statement stat = conn.createStatement();
			String sql = "drop table EMPLOYEE;";
			stat.executeUpdate(sql);
			boolean bool = new Exist().tableExist();
		     if (bool) { 
		    	 System.out.println("");
		    	 System.out.println("---o(╥﹏╥)o！删除失败！---");
		        //System.out.println("---Congratulation！创建成功！---");  
		     }else{  
		    	 System.out.println("");
			        System.out.println("---Congratulation！删除成功！---");  
		     	}  
	}
}
