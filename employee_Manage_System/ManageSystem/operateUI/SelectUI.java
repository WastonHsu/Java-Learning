package operateUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import beginUI.Employee;
import DBconn.DBconn;

public class SelectUI {
	public Employee selectEmp(int number){
		Employee emp=null;	//�����õ���emp
		PreparedStatement pstmt = null;	//����Ԥ����
		Connection conn = new DBconn().getConn();	//�������ݿ�
		String sql="select * from EMPLOYEE where eNumber=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, number);
			ResultSet rs =pstmt.executeQuery();
			while(rs.next()){
				int eNumber=rs.getInt(1);
				String eName=rs.getString(2);
				String eIDcard=rs.getString(3);
				String eTel=rs.getString(4);
				String ePart=rs.getString(5);
				String eJob=rs.getString(6);
				String eMail=rs.getString(7);
				System.out.println("");
				System.out.println("---"+number+"��Ա����Ϣ����---");
				System.out.println("��Ա�����Ϊ:"+eNumber);
				System.out.println("��Ա������Ϊ:"+eName);
				System.out.println("��Ա�����֤��Ϊ:"+eIDcard);
				System.out.println("��Ա���绰Ϊ:"+eTel);
				System.out.println("��Ա������Ϊ:"+ePart);
				System.out.println("��Ա������Ϊ:"+eJob);
				System.out.println("��Ա������Ϊ:"+eMail);
				System.out.println("------>Finally,���ҳɹ���<------");
			}
		} catch (SQLException e) {
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
		return emp;
	}
	
	public void allEmp() throws SQLException{
		Connection conn = new DBconn().getConn();//�������ݿ�
		Statement stat = conn.createStatement();//����Ԥ����
		String sql="select * from EMPLOYEE";
		ResultSet rs=stat.executeQuery(sql); 
		System.out.println("");
		System.out.printf("%-10s","eNumber");
		System.out.printf("%-15s","eName");
		System.out.printf("%-20s","eIDcard");
		System.out.printf("%-15s","eTel");
		System.out.printf("%-15s","ePart");
		System.out.printf("%-15s","eJob");
		System.out.printf("%-25s","eMail");
		System.out.println("");
		while(rs.next()){
			System.out.print(String.format("%-10d",rs.getInt(1)));
			System.out.print(String.format("%-15s",rs.getString(2)));
			System.out.print(String.format("%-20s",rs.getString(3)));
			System.out.print(String.format("%-15s",rs.getString(4)));
			System.out.print(String.format("%-15s",rs.getString(5)));
			System.out.print(String.format("%-15s",rs.getString(6)));
			System.out.println(String.format("%-25s",rs.getString(7)));
		}
		System.out.println("------>Finally,���ҳɹ���<------");
	}
}
