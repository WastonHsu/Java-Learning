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
		PreparedStatement pstmt = null;//����Ԥ����
		Connection conn = new DBconn().getConn();//�������ݿ�
		Scanner sc = new Scanner(System.in);
		try 
		{
			String sql ="insert into EMPLOYEE values(?,?,?,?,?,?,?);";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, eNumber);
			System.out.print("������Ա������:");
			String eName = sc.next();
			pstmt.setString(2, eName);
			System.out.print("������Ա�����֤��:");
			String eIdcard = sc.next();
			pstmt.setString(3, eIdcard);
			System.out.print("������Ա���绰:");
			String eTel = sc.next();
			pstmt.setString(4, eTel);
			System.out.print("������Ա������:");
			String ePart = sc.next();
			pstmt.setString(5, ePart);
			System.out.print("������Ա������:");
			String eJob = sc.next();
			pstmt.setString(6, eJob);
			System.out.print("������Ա������:");
			String eMail = sc.next();
			pstmt.setString(7, eMail);
			if(pstmt.executeUpdate()>0)
			{//������ص�Ӱ����������0����֤�����ӳɹ�
				System.out.println("---Congratulation����ӳɹ���---");
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
