package package_javabasics;

public class Assignment_Practice {
	byte t=1;
	final static int a=10;
	static int b=20;
	short s=23455;
	long l=223434454;
	String name="Rupali Wankhade";
	static char c='A';
	boolean answer1=true;
	 float f=2.3f;
	static double pi=3.14;
//Static and non-static 
	static void add()
	{
		
		System.out.println(a+b);
	}
	void sub()
	{
		System.out.println(l/s);
	}
	 void  areaOfCicle()
	{
		 f=2.4f;
		double radius=Math.random();
		double a=pi*radius*radius;
		System.out.println("Area of cicle is"+a);
	}
	 static void modulus()
	 {
		 System.out.println("My daughter name starts with"+c);
	 }
	 
	 static void areaOfSquare(int side)
	 {
		 int area=side*side;
		 System.out.println(area);
	 }
	 
	 Assignment_Practice()
	 {
		 System.out.println("Default constrictor");
	 }
	 Assignment_Practice(int b,int l)
	 {
		 System.out.println("Parameterized constructor");
		 int area=b*l;
		 System.out.println("Area of Rectangle"+area);
	 }
	 
	 void hobyy(char c)
	 {
		 System.out.println("My 2nd daughter name starts with "+c);
	 }
	 void hobyy(String s)
	 {
		 System.out.println("My 2nd daughter name is"+s);
	 }
	public static void main(String[] args) {
		// Calling static, non-static and constructor
		add();
		modulus();
		Assignment_Practice p1=new Assignment_Practice();
		Assignment_Practice p2=new Assignment_Practice(5,6);
		p1.areaOfCicle();
		areaOfSquare(7);
		p1.sub();
		p1.hobyy('M');
		p1.hobyy("Manasvi");
		modulus();
		int k=15;
		int m=20;
		if(k<11 && m>30) {
			System.out.println("Print And");
		}
		
		else if(k<20||m>30)
		{
			System.out.println("Print OR");
		}
		else
		{
			System.out.println("Nothing");
		}
		
		for(int i=2;i<=50;i++)
		{
			System.out.println(i);
			i++;
		}
		
		for(int i=-1;i>=-22;i--)
		{
			System.out.println(i);
		}
		
	}

}
