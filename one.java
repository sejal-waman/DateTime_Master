import java.sql.*;
class Demo
{
	public static void main(String args[])throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","root");
		
		if(con!=null)
		{
			System.out.println("connection establish");
		}
		else
		{
			System.out.println("connection is not establish");
		}
		
	}
}
