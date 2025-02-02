package package_javabasics;

public class Parameteized_StaticNonstatic {
	
	
	static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	static void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	
	static void intro(String a, char b)
	{
		System.out.println("My name is "+a+" "+b);
		
	}
	static void marriedStatus(boolean b)
	{
		System.out.println("My married status is:"+b);
		
	}

   void divide(int a, int b) 
   {
	   System.out.println(a/b);
	   
   }
   
   void areaOfCircle(double radius)
   {
	   double area=3.14*radius*radius;
	   System.out.println(area);
   };
	public static void main(String[] args) {
		// Write program to call parameterized static method
		Parameteized_StaticNonstatic d1=new Parameteized_StaticNonstatic();
		d1.divide(10, 2);
		d1.areaOfCircle(4.5);
      add(100,200);
      sub(10,5);
      intro("Rupali",'D');
      marriedStatus(true);
     System.out.println(Math.random());
      
      
      
	}

}
