import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
public class ZipFormate {
	public static void main(String[] args) throws IOException {

		  String sourceFile = "A:\\java\\seven_may\\java1.txt";

		  
		  FileOutputStream fos = new FileOutputStream("A:\\java\\seven_may\\compressed.zip");

		  System.out.println("File compression started.");
		  
		  ZipOutputStream zipOut = new ZipOutputStream(fos);
		  File fileToZip = new File(sourceFile);
		  FileInputStream fis = new FileInputStream(fileToZip);

		 
		  ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
		  zipOut.putNextEntry(zipEntry);

		  byte[] bytes = new byte[1024];
		  int length;

		
		  while ((length = fis.read(bytes)) >= 0) {
		   zipOut.write(bytes, 0, length);
		  }
		  zipOut.close();
		  fis.close();
		  fos.close();
		  System.out.println("Done");
		 }

}
