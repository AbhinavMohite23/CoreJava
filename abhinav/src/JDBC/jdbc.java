package JDBC;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;																																																																																																															
import java.sql.SQLException;
import java.util.Scanner;

public class jdbc 
{
	public static void main (String args[]) throws ClassNotFoundException ,SQLException
	{
		int ch, roll_no;
		int mob_no;
		int n;
		String name=null;
		
		Scanner sc= new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","mohite");
		java.sql.Statement stmt=con.createStatement();
		do
		{
			System.out.println("\n \t 1.Enter record \n \t 2. Delete record \n \t 3.Update record \n \t 4.Display record \n \t 5.Display all record \n \t Enter your choice: ");
			
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("Enter roll number");
		           int rn=sc.nextInt();
		           System.out.println("Enter name");
		           name=sc.next();
		           System.out.println("mobile number 5 digit max");
		           mob_no=sc.nextInt();
		           
		           try
		           {
		        	   stmt.executeUpdate("insert into student2(roll_no,name,mob_no)values("+rn+","+name+","+mob_no+")");
		        	   
		           }
		           catch(Exception e)
		           {
		        	   System.out.println(e);
		           }
		           System.out.println("Succesfully inserted record");
		           break;
		           
			case 2:System.out.println("Enter roll number");
			       roll_no=sc.nextInt();
			       try
			       {
			    	   stmt.executeUpdate("Delete from student2 where roll_no="+roll_no);
			    	   
			       }
			       catch(Exception e)
			       {
			    	   System.out.println(e);
			       }
			       break;
			case 3:System.out.println("\n \t 1.Update name \n \t 2. update mobno \n \t Enter your choice:");
			       n=sc.nextInt();
			       System.out.println("Enter roll number");
			       roll_no=sc.nextInt();
			       
			       try
			       {
			    	   if(n==1)
			    	   {
			    		   System.out.println("Enter name");
			    		   name=sc.next();
			    		   stmt.executeUpdate("update student2 SET name="+name+"where rollno="+roll_no);
			    		   
			    	   }
			    	   else
			    	   {
			    		   System.out.println("Enter mobile number");
			    		   mob_no=sc.nextInt();
			    		   stmt.executeUpdate("update student2 SET mobno="+mob_no+"where rollno="+roll_no);
			    		   
			    	   }
			       }
			       catch(Exception e)
			       {
			    	   System.out.println(e);
			       }
			       break;
			       
			case 4:System.out.println("Enter roll number");
			       roll_no=sc.nextInt();
			       try
			       {
			    	   ResultSet rs =stmt.executeQuery("select*from student2 where rollno="+roll_no);
			    	   if(rs.next())
			    	   {
			    		   System.out.println(rs.getString("name"));
			    		   System.out.println("mob_no"+rs.getInt("mobno"));
			    	   }
			    	   
			       }
			       catch(Exception e)
			       {
			    	   System.out.println(e);
			       }
			       break;
		           
			case 5:try
			{
				ResultSet rs=stmt.executeQuery("select*from student2");
				
				while(rs.next())
				{
					System.out.println("name:"+rs.getString("name"));
					System.out.println("\t roll_no"+rs.getInt("roll_no"));
					System.out.println("\t mob_no"+rs.getInt("mob_no")+"\n");
				}
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			break;
			
			default:System.out.println("wrong choice");
			        
			
			}
		}
		while(ch<=5);
		con.close();
		

		
		
	}

}
