	import java.sql.*;
public class ConnectDatabase {


		
		public Connection getConnection() {
	        Connection connection = null;
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/c2","root","");
	            System.out.println("Connection succsess");
	        } catch (Exception e) {
	        }
	        return connection;
	    }

		public static void main(String[] args) {
			try
			{
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/c2","root","");
				con.close();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}

		}

	}

