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
		PreparedStatement pstmt = null;//����Ԥ����
		Connection conn = new DBconn().getConn();//�������ݿ�
		Scanner sc = new Scanner(System.in);
		try 
		{
			String sql ="update EMPLOYEE set eName=?,eIDcard=?,eTel=?,ePart=?,eJob=?,eMail=?	where eNumber=?";
			pstmt=conn.prepareStatement(sql);
			System.out.print("������Ա������:");
			String eName = sc.next();
			pstmt.setString(1, eName);
			System.out.print("������Ա�����֤��:");
			String eIDcard = sc.next();
			pstmt.setString(2, eIDcard);
			System.out.print("������Ա���绰:");
			String eTel = sc.next();
			pstmt.setString(3, eTel);
			System.out.print("������Ա������:");
			String ePart = sc.next();
			pstmt.setString(4, ePart);
			System.out.print("������Ա������:");
			String eJob = sc.next();
			pstmt.setString(5, eJob);
			System.out.print("������Ա������:");
			String eMail = sc.next();
			pstmt.setString(6, eMail);
			pstmt.setInt(7, number);
			pstmt.addBatch();
		    pstmt.executeBatch();
			if(pstmt.executeUpdate()>0)
			{//������ص�Ӱ����������0����֤�����ӳɹ�
			System.out.println("--->Congratulation�����³ɹ���------");
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
