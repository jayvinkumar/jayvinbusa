

import java.sql.*;
public class CommitAndRollback {

	public static void main(String[] args) throws SQLException {
		ConnectDatabase cd = new ConnectDatabase();
		Connection con = cd.getConnection();
		con.setAutoCommit(false);
		try
		{
		     Statement stmt=con.createStatement();
		     String query1="INSERT INTO student(std_id,std_name) VALUES(220,'anmol')";
		     stmt.executeUpdate(query1);
		     String query2="INSERT INTO emp(name,age,std_id) VALUES('sunil',25,22)";
		     stmt.executeUpdate(query2);
		     con.commit();
		     System.out.println("Row Inserted");
		     
		 } 
		 catch (SQLException e) 
		 {
		     con.rollback();
		     e.printStackTrace();
		     con.close();
		 }
	}

}