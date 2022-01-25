import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class AccountDetails extends DbConnection{
	int accNo,balance=10000,mobile;
		String name;
		Scanner sc=new Scanner(System.in);
		public void addUser()
		{
			try
	        {
                Connection con = DbConnection.getConnection();
                System.out.println("Enter Account no : ");
	            int accNo=sc.nextInt();
	            System.out.println("Enter Name : ");
	            String name=sc.next();
	            System.out.println("Enter Balance : ");
	            int balance=sc.nextInt();
	            PreparedStatement ps1=con.prepareStatement("insert into accounts values(?,?,?)");
	            ps1.setInt(1, accNo);
	            ps1.setString(2, name);
	            ps1.setInt(3, balance);
	            int i = ps1.executeUpdate();
	            if(i<=1)
	            {
	            	System.out.println("Record Inserted Successfully..!!");
	            }
	            else
	            {
	            	System.out.println("Record Failed to Insert..!!");
	            }
	            
	           
	        }
	        catch(Exception e)
	        {
	            System.err.println(e);
	            e.printStackTrace();
	        }
		}

		public void viewUser()
		{
		   System.out.println("Account no " );
		   int accNo = sc.nextInt();
		   try
		   {
			   Connection con = DbConnection.getConnection();
			   Statement st =con.createStatement();
			   ResultSet rs=st.executeQuery("select * from accounts where acNo= '"+ accNo +"'");
			   while(rs.next())
			   {
				   System.out.println("User account number " + rs.getInt(1));
				   System.out.println("User Name  "+ rs.getString(2));
				   System.out.println("User balance  " + rs.getInt(3));
			   }
		   }
		   catch(Exception e)
	        {
	            System.err.println(e);
	            e.printStackTrace();
	        }
		  
		}
		public void checkBalance()
		{
			   System.out.println("Account no " );
			   int accNo = sc.nextInt();
			   try
			   {
				   Connection con = DbConnection.getConnection();
				  PreparedStatement ps1=con.prepareStatement("update accounts set balance =? where acNo =?");
				  ps1.setInt(1, balance);
					ps1.setInt(2, accNo);
				   ResultSet rs2=ps1.executeQuery("select * from accounts where acNo= '"+ accNo +"'");
				 while(rs2.next())
				   {
					   System.out.println("User balance" + rs2.getInt(3));
				   }
			   }
			   catch(Exception e)
		        {
		            System.err.println(e); 
		            e.printStackTrace();
		        }  
		}
	}
