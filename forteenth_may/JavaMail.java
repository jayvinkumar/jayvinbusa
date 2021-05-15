
import java.net.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;
import javax.mail.*;    
import javax.mail.internet.*; 





public class JavaMail {
	  Session mailSession;
	  
	 
	 
	    private void setMailServerProperties()
	    {
	        Properties emailProperties = System.getProperties();
	        emailProperties.put("mail.smtp.port", "586");
	        emailProperties.put("mail.smtp.auth", "true");
	        emailProperties.put("mail.smtp.starttls.enable", "true");
	        mailSession = Session.getDefaultInstance(emailProperties, null);
	    }
	 
	    private MimeMessage EmailMessage(String str) throws AddressException, MessagingException
	    {
	        String[] toEmails = { "jayvin.busa.c2@gmail.com" };
	        String emailSubject = "Wethe information";
	        String emailBody = str;
	        MimeMessage emailMessage = new MimeMessage(mailSession);
	       
	        for (int i = 0; i < toEmails.length; i++)
	        {
	            emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmails[i]));
	        }
	        emailMessage.setSubject(emailSubject);
	       
	        emailMessage.setContent(emailBody, "text/html");
	       
	      
	        return emailMessage;
	    }
	 
	    private void sendEmail() throws AddressException, MessagingException
	    {
	        
	        String fromUser = "jayvin.busa.c2@gmail.com";
	        String fromUserEmailPassword = "l2838@J";
	 
	        String emailHost = "smtp.gmail.com";
	        Transport transport = mailSession.getTransport("smtp");
	        transport.connect(emailHost, fromUser, fromUserEmailPassword);
	       
	       
	        /**
	         * Send the mail
	         * */
	        transport.sendMessage(emailMessage, emailMessage.getAllRecipients());
	        transport.close();
	        System.out.println("Email sent successfully.");
	    }
	public static void main(String args[]) throws Exception
	{
		for (int i=0;i<=100;i++)
		{
			Thread.sleep(10000);
		URL url = new URL("http://api.weatherstack.com/current?access_key=53ca101fb78ff6f975f8e83fc9db3815&query=London");
		HttpURLConnection http = (HttpURLConnection)url.openConnection();
		http.setRequestProperty("Accept", "application/json");

		System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		String str ="";
		
		while (null != (str = br.readLine())) {
			System.out.println(str);
			
		}

		http.disconnect();
		JavaMail javaEmail = new JavaMail();
        javaEmail.setMailServerProperties();
        javaEmail.EmailMessage(str);
        javaEmail.sendEmail();
		}
}
}

