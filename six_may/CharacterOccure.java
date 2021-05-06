import java.util.*;
public class CharacterOccure {
	  public static void main(String[] args) {    
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter Your String");
		  String s =sc.next() ;    
	      int[] f = new int[s.length()];    
	      char minChar = s.charAt(0), maxChar = s.charAt(0);    
	      int i, j, min, max;            
	          
	 
	       
	      char string[] = s.toCharArray();    
	          
	      for(i = 0; i < string.length; i++) {    
	          f[i] = 1;    
	          for(j = i+1; j < string.length; j++) {    
	              if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {    
	                  f[i]++;    
	                      
	                  
	                  
	                    
	                  string[j] = '0';    
	              }    
	          }    
	      }    
	          
	     
	          
	      min = max = f[0];    
	      for(i = 0; i <f.length; i++) {    
	              
	          
	    	 if(min > f[i] && f[i] != '0') {    
	              min = f[i];    
	              minChar = string[i];    
	          }    
	          if(max < f[i]) {    
	              max = f[i];    
	              maxChar = string[i];    
	          }    
	      }    
	          
	      System.out.println("Minimum occurring character: " + minChar);    
	      System.out.println("Maximum occurring character: " + maxChar);    
	  }    

}
