import java.sql.*;
import java.io.*;
public class ImageDatabase {
	
	ConnectDatabase cd = new ConnectDatabase();
	
	public void insertImg()
	{
		try
		{
			Connection con = cd.getConnection();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO img VALUES(?,?)");
		    pstmt.setString(1, "sample image");
		    InputStream in = new FileInputStream("A:\\java\\Eighteenth_may\\image.jpg");
		    pstmt.setBlob(2, in);
		    pstmt.execute();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void readImg()
	{
		try
		{
			Connection con = cd.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from images");  
			ResultSet rs=ps.executeQuery();  
			if(rs.next())
			{                
				Blob b=rs.getBlob(2);  
				byte barr[]=b.getBytes(1,(int)b.length());        
				FileOutputStream fout=new FileOutputStream("A:\\java\\Eighteenth_may\\");  
				fout.write(barr);    
				fout.close();  
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ImageDatabase ir = new ImageDatabase();
		ir.insertImg();
		ir.readImg();

	}

}
