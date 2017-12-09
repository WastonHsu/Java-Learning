package beginUI;

import java.sql.SQLException;
import java.util.Scanner;
import operateUI.*;

public class SecondPage 
{
	public void createTable() throws SQLException
	{
		boolean bool = new Exist().tableExist();
	     if (bool) { 
	    	 System.out.println("");
	        System.out.println("---员工表已经存在!---");  
	     }else{  
	             new TableUI().dbCreate();
	     	}  
	}
	
	public void add() throws SQLException 
	{
		System.out.println("");
		System.out.print("请输入要添加的员工编号:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		boolean boolT = new Exist().tableExist();
	     if (boolT) 
	     {  
	    	 boolean boolE = new Exist().empExist(number);
	 		 if (boolE) {
	 			System.out.println("");
	 			System.out.println("--->"+number+"号员工已经存在<---");
	 		 } else {
	 			new AddUI().addEmp(number);
	 		 }
		 }else{ 
			 System.out.println("");
		     System.out.println("--->员工表不存在，请创建！<---");
		  	}  
		
	}
	
	public void delete() throws SQLException 
	{
		System.out.println("");
		System.out.print("请输入要删除的员工编号:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		boolean boolT = new Exist().tableExist();
	     if (boolT) 
	     {  
	    	 boolean boolE = new Exist().empExist(number);
	 		 if (boolE) {
	 			new DeleteUI().delEmp(number);
	 		 } else {
	 			System.out.println("");
	 			System.out.println("--->"+number+"员工不存在！<---");
	 		 }
		 }else{  
			 System.out.println("");
		     System.out.println("--->员工表不存在，请创建！<---");
		  	}  
	}
	
	public void update() throws SQLException 
	{
		System.out.println("");
		System.out.print("请输入要更新信息的员工编号:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		boolean boolT = new Exist().tableExist();
	     if (boolT) 
	     {  
	    	 boolean boolE = new Exist().empExist(number);
	 		 if (boolE) {
	 			new UpdateUI().updateEmp(number);
	 		 } else {
	 			System.out.println("");
	 			System.out.println("--->"+number+"员工不存在！<---");
	 		 }
		 }else{  
			 System.out.println("");
		     System.out.println("--->员工表不存在，请创建！<---");
		  	}  
	}
	
	public void select() throws SQLException
	{
		System.out.println("");
		System.out.print("请输入要查询的员工编号:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		boolean boolT = new Exist().tableExist();
	     if (boolT) 
	     {  
	    	 boolean boolE = new Exist().empExist(number);
	 		 if (boolE) {
	 			new SelectUI().selectEmp(number);
	 		 } else {
	 			System.out.println("");
	 			System.out.println("--->"+number+"员工不存在！<---");
	 		 }
		 }else{  
			 System.out.println("");
		     System.out.println("--->员工表不存在，请创建！<---");
		  	}  
	}
	
	
	public void selectAll() throws SQLException
	{
		new SelectUI().allEmp();
	}
	
	
	public void delTable() throws SQLException
	{
		boolean bool = new Exist().tableExist();
		if (bool) {  
            new DeleteUI().delTable();
         }else{  
        	 System.out.println("");
             System.out.println("--->员工表不存在！！！<---");
         	}  
	}	
}
