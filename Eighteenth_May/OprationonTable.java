

import java.sql.*;
import java.util.*;
public class OprationonTable {
	ConnectDatabase cd = new ConnectDatabase();
	public void insert()
	{
		try
		{
			Connection con = cd.getConnection();
			String insert = "INSERT INTO EMPLOYEE(Name, Class) VALUES ('komal', 1),('magan', 2),('Raj', 3),('Jayesh', 4)";
			Statement st = con.createStatement();
			int i = st.executeUpdate(insert);
			if(i>0)
			{
				System.out.println(i+" Rows Added");
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void update(int id, String name, int age)
	{
		try
		{
			Connection con = cd.getConnection();
			String update = "UPDATE EMPLOYEE SET Name=?, Age=? WHERE id=?";
			PreparedStatement pt = con.prepareStatement(update);
			pt.setString(1, name);
			pt.setInt(2, age);
			pt.setInt(3, id);
			int i = pt.executeUpdate();
			if(i>0)
			{
				System.out.println("Record Updated Successfully");
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void delete(int id1)
	{
		try
		{
			Connection con = cd.getConnection();
			String delete = "DELETE FROM EMPLOYEE Where id=?";
			PreparedStatement ps = con.prepareStatement(delete);
			ps.setInt(1, id1);
			int i = ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Row Deleted Successfully");
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void select()
	{
		try
		{
			Connection con = cd.getConnection();
			String select = "SELECT * FROM EMPLOYEE";
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
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("\n1-For Insert");
			System.out.println("2-For Update");
			System.out.println("3-For Delete");
			System.out.println("4-For View Records");
			System.out.print("Please Enter The Choice From Above: ");
			int ch = sc.nextInt();
			OprationonTable i = new OprationonTable();
			
			switch(ch) {
			case 1:
				i.insert();
				break;
				
			case 2:
				i.select();
				System.out.print("Please Enter id of the record which you want to update: ");
				int id = sc.nextInt();
				System.out.print("\nPlease Enter New Age: ");
				int age = sc.nextInt();
				System.out.print("\nPlease Enter New Name: ");
				String name = sc.next();
				i.update(id, name, age);
				break;
				
			case 3:
				i.select();
				System.out.print("Please Enter id of the record which you want to delete: ");
				int id1 = sc.nextInt();
				i.delete(id1);
				break;
				
			case 4:
				i.select();
				break;
				
				default:
					System.out.print("Please Enter Valid Choice");
					break;
			}
		}
	}

}