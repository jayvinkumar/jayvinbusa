
import java.sql.*;
public class ExecuteBatch {
	ConnectDatabase cd = new ConnectDatabase();
	public void addBatch()
	{
		try
		{
			Connection con = cd.getConnection();
			con.setAutoCommit(false);
			Statement st = con.createStatement();
			st.addBatch("insert into student(name,class,roll) value ('raj',1,102)");
			st.addBatch("insert into student(name,class,roll) value ('mehul',3,104)");
			st.addBatch("insert into student(name,class,roll) value ('ruchi',1,105)");
			st.executeBatch();
			con.commit();  
			con.close();  
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ExecuteBatch eb = new ExecuteBatch();
		eb.addBatch();
		System.out.print("Records Added");
	}

}