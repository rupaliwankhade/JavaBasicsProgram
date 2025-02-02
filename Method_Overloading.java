package package_javabasics;

public class Method_Overloading {
	void mathOperation(int a, int b)
	{
		System.out.println(a-b);
	}
	
	void mathOperation(int a, int b, int c)
	{
		System.out.println("Addition is "+a+b+c);
	}
	
	void mathOperation(Double a, int b)
	{
		System.out.println("Division is "+a/b);
	}
	
	void mathOperation(int a, double b,float c)
	{
		System.out.println("Multiplication is "+a*b*c);
	}
	
	void mathOperation(String s,int b, float c)
	{
		System.out.println("Division is "+b/c);
	}
	
	public static void main(String[] args) {
		// Practice of Method Overloding
		Method_Overloading m1=new Method_Overloading();
		m1.mathOperation(5, 2);
		m1.mathOperation(3.41, 5);
		m1.mathOperation(1, 2, 3);
		m1.mathOperation(3, 3.22, 4.1f);
		m1.mathOperation("Math Operation", 70,100.2f);

	}

}
