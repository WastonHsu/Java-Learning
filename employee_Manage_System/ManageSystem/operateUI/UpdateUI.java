package operateUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import beginUI.Employee;
import DBconn.DBconn;

public class UpdateUI {
	public Employee updateEmp(int number)
	{
		PreparedStatement pstmt = null;//声明预处理
		Connection conn = new DBconn().getConn();//链接数据库
		Scanner sc = new Scanner(System.in);
		try 
		{
			String sql ="update EMPLOYEE set eName=?,eIDcard=?,eTel=?,ePart=?,eJob=?,eMail=?	where eNumber=?";
			pstmt=conn.prepareStatement(sql);
			System.out.print("请输入员工姓名:");
			String eName = sc.next();
			pstmt.setString(1, eName);
			System.out.print("请输入员工身份证号:");
			String eIDcard = sc.next();
			pstmt.setString(2, eIDcard);
			System.out.print("请输入员工电话:");
			String eTel = sc.next();
			pstmt.setString(3, eTel);
			System.out.print("请输入员工部门:");
			String ePart = sc.next();
			pstmt.setString(4, ePart);
			System.out.print("请输入员工工作:");
			String eJob = sc.next();
			pstmt.setString(5, eJob);
			System.out.print("请输入员工邮箱:");
			String eMail = sc.next();
			pstmt.setString(6, eMail);
			pstmt.setInt(7, number);
			pstmt.addBatch();
		    pstmt.executeBatch();
			if(pstmt.executeUpdate()>0)
			{//如果返回的影响行数大于0，则证明增加成功
			System.out.println("--->Congratulation！更新成功！------");
			}
			pstmt.close();
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
}
