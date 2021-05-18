


import java.sql.*;
public class JoinOnTable {
    ConnectDatabase cd = new ConnectDatabase();
    public void innerJoin()
    {
        try
        {
            Connection con = cd.getConnection();
            String select = "SELECT emp.dep_id, emp.name, dep.dep_name from emp inner join dep on emp.dep_id=dep.dep_id";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next())
            {
                System.out.println("id: "+rs.getInt("dep_id")+" Name: "+rs.getString("Name")+" And Department: "+rs.getString("dep_name"));
            }
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void leftJoin()
    {
        try
        {
            Connection con = cd.getConnection();
            String select = "SELECT emp.dep_id, emp.name, dep.dep_name from emp left join dep on emp.dep_id=dep.dep_id";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next())
            {
                System.out.println("id: "+rs.getInt("dep_id")+" Name: "+rs.getString("Name")+" And Department: "+rs.getString("dep_name"));
            }
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void rightJoin()
    {
        try
        {
            Connection con = cd.getConnection();
            String select = "SELECT emp.dep_id, emp.name, dep.dep_name from emp right join dep on emp.dep_id=dep.dep_id";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next())
            {
                System.out.println("id: "+rs.getInt("dep_id")+" Name: "+rs.getString("Name")+" And Department: "+rs.getString("dep_name"));
            }
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void fullJoin()
    {
        try
        {
            Connection con = cd.getConnection();
            String select = "SELECT emp.dep_id, emp.name, dep.dep_name from emp full outer join dep on emp.dep_id=dep.dep_id";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next())
            {
                System.out.println("id: "+rs.getInt("dep_id")+" Name: "+rs.getString("Name")+" And Department: "+rs.getString("dep_name"));
            }
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
    	JoinOnTable j = new JoinOnTable();
        System.out.println("Inner Join");
        j.innerJoin();
        System.out.println();
        System.out.println("Left Join");
        j.leftJoin();
        System.out.println();
        System.out.println("Right Join");
        j.rightJoin();
        System.out.println();
        System.out.println("Full Outer Join");
        j.fullJoin();

    }

}