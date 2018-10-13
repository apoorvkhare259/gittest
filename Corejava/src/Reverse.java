
public class Reverse {
	
	public static void main(String[] args) {
		
		int n= 123;
		int r;
		int result = 0;
		int sum = 0;
		
		while(n>0) {
			
			

		r=n%10;
			result=result*10+r;
			n=n/10;	
			
		}
		System.out.println(result);
		
	}
	
	
	
	

}
