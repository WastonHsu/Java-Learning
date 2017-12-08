package beginUI;

import java.sql.SQLException;
import java.util.Scanner;

public class MainPage {
	public void menu(){
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println(" 员工基础信息管理(employee-crud)");
		System.out.println("	请输入1-8进行操作");
		System.out.println("	1.添加员工信息");
		System.out.println("	2.删除员工信息");
		System.out.println("	3.更新员工信息");
		System.out.println("	4.查询员工信息");
		System.out.println("	5.查询所有员工");
		System.out.println("	6.创建员工表");
		System.out.println("	7.删除员工表");
		System.out.println("	8.退出系统");
		System.out.print("请输入您的选择:");
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
						System.out.println("本系统已退出");
						System.exit(0);
						break;
					default:
						System.out.println("");
						System.out.println("--->请输入数字1-8！！！<---");
						break;
				}
			} 
			catch (java.util.InputMismatchException e) 
			{
				System.out.println("请输入数字");
			}
		}
	}

}
