package selenium.framework;

import java.util.Scanner;
//class AllTopics_Practice extends AllTopics_Practice
class AllTopics_Practice{
	int a=12;
	float f=23.5f;
	static double r=12.34;
	boolean isMarried=true;
	 
	String name="Dipa";
	
	AllTopics_Practice(float a)
	{
		System.out.println("1st constrrctor");
	}
	final void multiple()
	{
		System.out.println("Multiplication");
	}
	
	void add()
	{
		float add=a+f;
		System.out.println("Addition is" +add);
	}
	void sub()
	{
	
		System.out.println("Substraction");
	}

	static void areaOfcirlce() {
		double pi=Math.PI;
		double area=pi*r*r;
		
		System.out.println("Area is" +area);
	}
	public static void main(String[] args) {
		int age=15;
		assert age>18:"Couldn't vote";
		
		//areaOfcirlce();
		//new AllTopics_Practice();
		Scanner s1=new Scanner(System.in);
		/*int input=s1.nextInt();
		switch(input)
		{
		case 1: System.out.println("Launch the chrome");
		        break;
		case 2: System.out.println("Launch the Edge");
        break;
        default:System.out.println("Any browser");
		}
		
		int year=s1.nextInt();
		if (year%4==0 && year%100!=0)
		{
		 System.out.println("It is leap year");
		}
		else if(year%400==0|| year%4==0 )
		{
			 System.out.println("It is leap year");
		}
		else
		{
			System.out.println("Normal year");
		}*/
	
	
	for(int i=1;i<=100;i++) {
		
		/*if (i%3==0)
		{
			System.out.println(i);
			continue;
		}*/
		System.out.println(i);
		i++;
		
	}
	
}
}



