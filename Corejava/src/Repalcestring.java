
public class Repalcestring {
	
	public static void main(String[] args) {
		
		String s ="This is String";
		
		//without using string builder and string buffer
		
		char [] ch = s.toCharArray();
		
		  for(int i=ch.length-1; i>=0; i--) {
			  
			  System.out.print(ch[i]);
			  
		  }
		
		
		
	}
	
	
	

}
