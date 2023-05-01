package mysqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 1.create a connection
 2.screate statment/query
 3.execute statement/query
 4.close connection
 */
public class MySQLDMLCommands {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		// 1.create a connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3305/mydb","root","root");
		
		// 2.screate statment/query
		Statement stmt=con.createStatement();
		
		//String s="insert into student values(3,'Smith');";
		//String s="UPDATE STUDENT SET SNAME='DAVID' WHERE SID=3";
		String s="DELETE FROM STUDENT WHERE SID=3";
		
		// 3.execute statement/query
		stmt.execute(s);
		
		// 4.close connection
		con.close();
		
		System.out.println("Query Executed...");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
