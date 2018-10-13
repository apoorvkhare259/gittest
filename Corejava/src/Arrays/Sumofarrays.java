package Arrays;

public class Sumofarrays {
	
	
	public static void main(String[] args) {
		
		int [] my_arr = {2,4,5,6};
		int sum=0;
		
		/*for (int i =0; i<my_arr.length; i++) {
			
			
			sum += my_arr[i];
           
           System.out.println(sum);*/
           
		
		for (int i : my_arr) {
			
			sum = sum + i;
			
			System.out.println("the sum is "+sum);
			
		}
		
		
		
		}
		
		
		
	}


