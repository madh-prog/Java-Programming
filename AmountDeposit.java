import java.sql.*;
public class AmountDeposit extends AccountDetails
{
		int  amountd;
		
		void deposite()
		{
			try
        {
			Connection con = DbConnection.getConnection();
			System.out.println("Enter Account no : ");
			 accNo=sc.nextInt();
			System.out.println("Eneter the amount you want to deposite");
			   amountd=sc.nextInt();
			PreparedStatement ps=con.prepareStatement("select* from accounts where acNo=?");
	           ps.setInt(1, accNo);
	           ResultSet rs= ps.executeQuery();
			while(rs.next())
			{
				balance= rs.getInt(3);
			} 
	        balance=balance+ amountd;

		   PreparedStatement ps1=con.prepareStatement("update accounts set balance =? where acNo =?");
		ps1.setInt(1, balance);
		ps1.setInt(2, accNo);
		ResultSet rs1= ps1.executeQuery("select* from accounts where acNo='"+accNo+"'");
		while(rs1.next())
		{
			System.out.println("balance is " +balance);
		}
		int i =ps1.executeUpdate();
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
}