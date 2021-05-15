import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;

public class Messge_Servers {
	  public static void main(String[] args) throws Exception {
	        
	   
	        {
	            ServerSocket sersock = new ServerSocket(3000);
	            System.out.println("Server  ready for chatting");
	            Socket sock = sersock.accept( );                          
	                                    // reading from keyboard (keyRead object)
	            BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
	      	                      // sending to client (pwrite object)
	            OutputStream ostream = (OutputStream) sock.getOutputStream(); 
	            PrintWriter pwrite = new PrintWriter(ostream, true);

	                                    // receiving from server ( receiveRead  object)
	            InputStream istream = (InputStream) sock.getInputStream();
	            BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));

	            String receiveMessage, sendMessage;               
	            while(true)
	            {
	              if((receiveMessage = receiveRead.readLine()) != null)  
	              {
	                 System.out.println(receiveMessage);         
	              }         
	              sendMessage = keyRead.readLine(); 
	              pwrite.println(sendMessage);             
	              pwrite.flush();
	            }               
	          }     
	  }
}
