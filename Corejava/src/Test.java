
public class Test {
	
	public static void main(String[] args) {
		
		Student amit = new Student();
		amit.rollno=1;
		amit.name="Amit";
		
		Student ajit = new Student();
		ajit.rollno=2;
		ajit.name="Ajit";
		
		System.out.println(amit.rollno);
		System.out.println(ajit.rollno);
		System.out.println(amit.name);
		System.out.println(ajit.name);
		
		//give new memory when we creat new object
		amit = new Student();
		
		System.out.println(amit.name);
		System.out.println(amit.rollno);
		
		//internally to string metod will be called
		System.out.println(amit);
		
		
		
		
		
		 
		
		
		
	}

}
