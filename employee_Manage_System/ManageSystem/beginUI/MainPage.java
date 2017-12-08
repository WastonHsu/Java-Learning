package beginUI;

import java.sql.SQLException;
import java.util.Scanner;

public class MainPage {
	public void menu(){
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println(" Ա��������Ϣ����(employee-crud)");
		System.out.println("	������1-8���в���");
		System.out.println("	1.���Ա����Ϣ");
		System.out.println("	2.ɾ��Ա����Ϣ");
		System.out.println("	3.����Ա����Ϣ");
		System.out.println("	4.��ѯԱ����Ϣ");
		System.out.println("	5.��ѯ����Ա��");
		System.out.println("	6.����Ա����");
		System.out.println("	7.ɾ��Ա����");
		System.out.println("	8.�˳�ϵͳ");
		System.out.print("����������ѡ��:");
	}
	public static void main(String[] args) throws SQLException{
		while (true){          
			new MainPage().menu();
			try 
			{               
				Scanner scan = new Scanner(System.in);
				int i;
				i = scan.nextInt();
				switch (i) 
				{
					case 1:
						new SecondPage().add();
						break;
					case 2:
						new SecondPage().delete();
						break;
					case 3:
						new SecondPage().update();
						break;
					case 4:
						new SecondPage().select();
						break;
					case 5:
						new SecondPage().selectAll();
						break;
					case 6:
						new SecondPage().createTable();
						break;
					case 7:
						new SecondPage().delTable();
						break;
					case 8:
						System.out.println("��ϵͳ���˳�");
						System.exit(0);
						break;
					default:
						System.out.println("");
						System.out.println("--->����������1-8������<---");
						break;
				}
			} 
			catch (java.util.InputMismatchException e) 
			{
				System.out.println("����������");
			}
		}
	}

}
