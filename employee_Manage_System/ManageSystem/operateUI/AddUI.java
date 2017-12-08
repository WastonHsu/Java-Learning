package operateUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import beginUI.Employee;
import DBconn.DBconn;

public class AddUI 
{
	public Employee addEmp(int eNumber)
	{
		PreparedStatement pstmt = null;//声明预处理
		Connection conn = new DBconn().getConn();//链接数据库
		Scanner sc = new Scanner(System.in);
		try 
		{
			String sql ="insert into EMPLOYEE values(?,?,?,?,?,?,?);";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, eNumber);
			System.out.print("请输入员工姓名:");
			String eName = sc.next();
			pstmt.setString(2, eName);
			System.out.print("请输入员工身份证号:");
			String eIdcard = sc.next();
			pstmt.setString(3, eIdcard);
			System.out.print("请输入员工电话:");
			String eTel = sc.next();
			pstmt.setString(4, eTel);
			System.out.print("请输入员工部门:");
			String ePart = sc.next();
			pstmt.setString(5, ePart);
			System.out.print("请输入员工工作:");
			String eJob = sc.next();
			pstmt.setString(6, eJob);
			System.out.print("请输入员工邮箱:");
			String eMail = sc.next();
			pstmt.setString(7, eMail);
			if(pstmt.executeUpdate()>0)
			{//如果返回的影响行数大于0，则证明增加成功
				System.out.println("---Congratulation！添加成功！---");
			}
			pstmt.close();
			conn.close();
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
