
public class Loop1 {
	
	
	public static void main(String[] args) {
		
		int n = 12;
		int flag =0;
		
		for(int i=2; i<n; i++) {
			
		if(n%2==0) {
			
			flag=1;
			break;
		}
						
		}
		if(flag==1) {
			
			
			System.out.println("not prime");
		}
		
		else {System.out.println("number is prime");}
		
	}
	
}	