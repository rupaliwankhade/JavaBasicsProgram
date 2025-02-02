package package_javabasics;
public class StaticMethod_DifferentOperation {
	//Program to call static method in main method perform addition, substarction, multiplication, division and modulus
	static void addition()
	{
		int a=20;
		int b=10;
		int sum=a+b;
		System.out.println("Addition is "+sum);
	}
	static void subtraction() 
	{
		int a=20;
		int b=10;
		int sub=a-b;
		System.out.println("Substraction is "+sub);	
	}
	static void divide()
	{
		int a=20;
		int b=10;
		int div=a/b; 
		System.out.println("Division is "+div);
	}
	static void multiplication()
	{
		int a=20;
		int b=10;
		int mul=a*b;
		System.out.println("Multiplication is "+mul);
	}
	static void modulus()
		{
			int a=20;
			int b=10;
			int mod=a%b;
			System.out.println("Modulus is "+mod);	
		}

	public static void main(String[] args) {
		
		System.out.println("Main method");
		addition();
		subtraction();
		divide();
		multiplication();
		divide();
		modulus();
		
	}

}
