import java.sql.*;
import java.util.Scanner;
public class AmountWithdraw extends AmountDeposit {	
	    int amount; 
	    Scanner sc=new Scanner(System.in);
		public void withdraw() throws ArithmeticException	
		{
			try
	        {
				Connection con = DbConnection.getConnection();
				System.out.println("Enter Account no : ");
				 accNo=sc.nextInt();
				System.out.println("Enter the amount you want to withdraw");
				   amount=sc.nextInt();
				PreparedStatement ps=con.prepareStatement("select* from accounts where acNo=?");
		           ps.setInt(1, accNo);
		           ResultSet rs= ps.executeQuery();
				while(rs.next())
				{
					balance= rs.getInt(3);
				} 
				 if(balance>=amount)
					{ 
					 balance=balance - amount;
			                   	
				          
					}	     
			           else
				     { 
			        	   ArithmeticException ae= new ArithmeticException();
			        	   System.out.println("Your account have unsufficient balance..please enter valid ammount");
		                   throw ae;
			             }

			   PreparedStatement ps1=con.prepareStatement("update accounts set balance =? where acNo =?");
			ps1.setInt(1, balance);
			ps1.setInt(2, accNo);
			ResultSet rs1= ps1.executeQuery("select* from accounts where acNo='"+accNo+"'");
			while(rs1.next())
			{
				System.out.println("balance is " +balance);
			}
			
	        }
      catch(Exception e)
      {
          System.err.println(e);
          e.printStackTrace();
      }
	        }
			
	}
