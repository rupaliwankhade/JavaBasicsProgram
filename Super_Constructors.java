package package_inheritence;
 class First_Constructor{
	
	 First_Constructor()
	 {
		 System.out.println("Super1");
	 }
	
	 First_Constructor(int a){
		 System.out.println("Super parameterized");
		 
	 }
}
 class Second_Constructor extends First_Constructor{
		
	 Second_Constructor()
	 {
		 super(5);
		 System.out.println("Super2"); 
	 }
	
}

public class Super_Constructors extends Second_Constructor{
	Super_Constructors()
	{
	 
		System.out.println("Super3");
	}
	 

	public static void main(String[] args) {
		// Main method
		 new Super_Constructors();
		 Super_Constructors c1=new Super_Constructors();
		
	}

}
