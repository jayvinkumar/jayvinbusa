import java.sql.*;
public class OracleDatabase {
	try{
        DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
        Connection c = DriverManager.getConnection ("jdbc:oracle:thin:@127.0.0.0:1521:orcl","","l");
        PreparedStatement stmt = c.prepareStatement("insert into emp(employee_id,first_name,last_name,salary) values (?,?,?,?)");
     

        for (int i=0 ; i < 10 ; i++) {
                 stmt.setInt(1,i);
                 stmt.setString(2,generateRandomChars("01234567890ABCDEF",16));
                 stmt.setString(3,generateRandomChars("01234567890ABCDEF",16));
                 stmt.setInt(4,r.nextInt(10000+1)+5000);
                 stmt.executeUpdate();
        }
     
       
        stmt.close();
        c.close();
  }
  catch(Exception e){
     System.err.println(e);
     e.printStackTrace();
  }

}
}
