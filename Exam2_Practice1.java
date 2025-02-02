package selenium.framework;

import java.util.Scanner;

interface Api1{
	void add();	
}
interface Api2{
	void sub();	
	void add(int a);	
}

public class Exam2_Practice1 implements Api1, Api2{
	int a=15;
	int b=20;
	int c=5;
	float f=2.3f;
	double pi=3.14;
    String name="Sonu Wnakhade";
    boolean isMarried=true;
    long n=926784909;

	public static void main(String[] args) {
		// Practice of all topics learned till class 20th
		Exam2_Practice1 a1=new Exam2_Practice1();
		boolean married = a1.isMarried;
		System.out.println(married);
		a1.add();
		a1.add(100);
		a1.sub();
		int l=a1.name.length();
		System.out.println(l);
		System.out.println(a1.name.indexOf('W'));
		

	}

	
	  @Override public void add() { int sum=a+b;
	  
	  System.out.println("Addition is "+sum);
	  
	  }
	  
	  @Override public void sub() { if (a<b && a>c) { int sub=b-a;
	  System.out.println("Sub is "+sub); } else {
	  
	  int sub=b-c; System.out.println("Sub is "+sub);
	  
	  }
	 
		
	}

	@Override
	public void add(int d) {
		Scanner s1=new Scanner(System.in);
		int t=s1.nextInt();	
		int t1=s1.nextInt();	
		int sum=t+t1;
		System.out.println(sum);
		
	}

}
