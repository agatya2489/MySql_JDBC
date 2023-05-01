package mysqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
1.create a connection
2.screate statment/query
3.execute statement/query
4.store the result in resultset
5.close connection
*/

public class MySQLSelectCommand {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		// 1.create a connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3305/mydb","root","root");
		
		// 2.screate statment/query
		Statement stmt=con.createStatement();
		
		String s="select employee_id,first_name,last_name from employees";
		
		// 3.store the result in resultset & execute statement/query
		ResultSet rs=stmt.executeQuery(s);
		
		while(rs.next())
		{
			int eid=rs.getInt("Employee_ID");
			String fname=rs.getString("First_Name");
			String lname=rs.getString("Last_Name");
			
			System.out.println(eid+"  "+fname+"   "+lname);
		}
		
		// 4.close connection
		con.close();
		
		System.out.println("Query Executed...");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
