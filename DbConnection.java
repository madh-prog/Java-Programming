import java.sql.*;
import java.sql.DriverManager;
public class DbConnection 
{
	static Connection con = null;
	static Connection  getConnection()
	{
		try
		{
			if(con == null)
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","");
				return con ;
			}
		}
		 catch(Exception e)
	      {
	          System.err.println(e);
	          e.printStackTrace();
	      }
		return con;
	}
}
