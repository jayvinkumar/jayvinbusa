import java.sql.*;

public class ExecuteSelect {
	ConnectDatabase cd = new ConnectDatabase();
	public void select()
	{
		try
		{
			Connection con = cd.getConnection();
			String select = "SELECT * FROM emo";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(select);
			while(rs.next())
			{
				System.out.println("id: "+rs.getInt("id")+" Name: "+rs.getString("Name")+" And Age: "+rs.getInt("Age"));
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ExecuteSelect sq = new ExecuteSelect();
		sq.select();

	}

}

