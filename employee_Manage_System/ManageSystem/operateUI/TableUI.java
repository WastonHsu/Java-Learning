package operateUI;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import beginUI.Exist;
import DBconn.DBconn;

public class TableUI {
		public void dbCreate() throws SQLException {	//创建表
			Connection conn = new DBconn().getConn();
			Statement stat = conn.createStatement();
			String sql = ("create table EMPLOYEE"+
					"(eNumber int PRIMARY KEY,"+
					"eName varchar(20) not null,"+
					"eIDcard varchar(18) not null,"+
					"eTel varchar(11) not null,"+
					"ePart varchar(10) not null,"+
					"eJob varchar(10) not null,"+
					"eMail varchar(20) null)");
			stat.executeUpdate(sql);
			boolean bool = new Exist().tableExist();
		     if (bool) { 
		    	 System.out.println("");
		        System.out.println("---Congratulation！创建成功！---");  
		     }else{  
		    	 System.out.println("");
			        System.out.println("---o(╥﹏╥)o！创建失败！---");  
		     	}  
	}
}
