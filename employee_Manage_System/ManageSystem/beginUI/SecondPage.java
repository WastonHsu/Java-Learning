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
	        System.out.println("---Ա�����Ѿ�����!---");  
	     }else{  
	             new TableUI().dbCreate();
	     	}  
	}
	
	public void add() throws SQLException 
	{
		System.out.println("");
		System.out.print("������Ҫ��ӵ�Ա�����:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		boolean boolT = new Exist().tableExist();
	     if (boolT) 
	     {  
	    	 boolean boolE = new Exist().empExist(number);
	 		 if (boolE) {
	 			System.out.println("");
	 			System.out.println("--->"+number+"��Ա���Ѿ�����<---");
	 		 } else {
	 			new AddUI().addEmp(number);
	 		 }
		 }else{ 
			 System.out.println("");
		     System.out.println("--->Ա�������ڣ��봴����<---");
		  	}  
		
	}
	
	public void delete() throws SQLException 
	{
		System.out.println("");
		System.out.print("������Ҫɾ����Ա�����:");
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
	 			System.out.println("--->"+number+"Ա�������ڣ�<---");
	 		 }
		 }else{  
			 System.out.println("");
		     System.out.println("--->Ա�������ڣ��봴����<---");
		  	}  
	}
	
	public void update() throws SQLException 
	{
		System.out.println("");
		System.out.print("������Ҫ������Ϣ��Ա�����:");
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
	 			System.out.println("--->"+number+"Ա�������ڣ�<---");
	 		 }
		 }else{  
			 System.out.println("");
		     System.out.println("--->Ա�������ڣ��봴����<---");
		  	}  
	}
	
	public void select() throws SQLException
	{
		System.out.println("");
		System.out.print("������Ҫ��ѯ��Ա�����:");
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
	 			System.out.println("--->"+number+"Ա�������ڣ�<---");
	 		 }
		 }else{  
			 System.out.println("");
		     System.out.println("--->Ա�������ڣ��봴����<---");
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
             System.out.println("--->Ա�������ڣ�����<---");
         	}  
	}	
}
