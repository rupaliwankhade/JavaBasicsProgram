package package_javabasics;


public class ComparisionOperator {

	public static void main(String[] args) {
		// using compariosn operator
	
		int b=20;
		int c=30;
		
		if(b>10 && c==b)
		{
			System.out.println("And");
		}
        
		if(b>10 || c==b)
		{
			System.out.println("OR");
		}
		
		if(!(b>10 || c==b))
		{
			System.out.println("Not OR");
		}
        
		if(!(b>10 && c==b))
		{
			System.out.println("Not And");
		}

	}

}
