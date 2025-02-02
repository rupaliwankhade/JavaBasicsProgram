package selenium.framework;

import java.util.Arrays;
import java.util.Scanner;

interface pract1 {
	void add1();
}

interface pract2 {
	void add2();
}

abstract class ab implements pract1, pract2 {
	static void sub() {
		System.out.println("Sustraction");
	}

	abstract void divide();
}

public class Topics_TillArray extends ab {

	public static void main(String[] args) throws InterruptedException {
		// String and Array practice
		
		Topics_TillArray t1 = new Topics_TillArray();
		t1.add1();
		t1.add2();
		t1.divide();
		t1.sub();
		sub();
		String name = "Dipa";
		String output = "";
		String d=name.concat(" Ramesh").concat(" Wankhade");
		String n1="Rama Kale";
		System.out.println(n1.replaceAll("Kale", "belsare"));
		System.out.println(d);
		System.out.println(n1.substring(1, 4));
		System.out.println(name.matches("...."));
		System.out.println(name.matches("(.*)a"));
		System.out.println(name.matches("D(.*)"));
		System.out.println(n1.matches("(.*)Kale(.*)"));
		
		
		//Program to check string is palidrome or not
		for(int i=name.length()-1;i>=0;i--) 
		{
			  char c1=name.charAt(i); 
			 output=output+c1; }
			 System.out.println("reverse string result is "+output);
			 if (name.equals(output)) {
				 System.out.println("It is palindrome");
			 }
			 else {
				 System.out.println("It is not palindrome");
			 }
				 
		
		 
		  System.out.println(name.toCharArray());
		  
		  //Array program to reverse the array
		  int a[]=new int[4];
		  a[0]=1;
		  a[1]=2;
		  a[2]=3; 
		  a[3]=4;
		  
		  int b[]=new int[a.length]; 
		 // Scanner s1=new Scanner(System.in); 
		  for(int i=0,j=a.length-1;i<a.length;i++,j--) 
		  {// a[i]=s1.nextInt();
		  b[j]=a[i];
		  Thread.sleep(2000);
		  }
		  System.out.println("Main array  is "+Arrays.toString(a));
		  System.out.println("Reverse array result is "+Arrays.toString(b)); 
		  int c[]=new int[a.length];
          Scanner s2=new Scanner(System.in); 
          for(int i=0,j=0;i<a.length;i++,j++) 
          { a[i]=s2.nextInt(); 
          c[j]=a[i]; }
		  System.out.println("Copy array  is "+Arrays.toString(c));
		 
	}

	@Override
	public void add1() {
		// TODO Auto-generated method stub
		System.out.println("Addition1");
	}

	@Override
	public void add2() {
		System.out.println("Addition2");

	}

	@Override
	void divide() {
		System.out.println("Division");

	}
	

 
}