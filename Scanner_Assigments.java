package package_javabasics;
import java.util.*;
public class Scanner_Assigments {

	public static void main(String[] args) {
  // Assignment-1 Adding/Substracting/Multiplication/Division of 2 numbers
		
		Scanner n1=new Scanner(System.in);
	    System.out.println("Enter the a");
		int a=n1.nextInt();
		System.out.println("Enter the b");
		int b=n1.nextInt();
		int sum=a+b;
		System.out.println(sum);
		int sub=a-b;
		System.out.println(sub);
		int Multiplication=a*b;
		System.out.println(Multiplication);
		int div=a/b;
		System.out.println(div);
		
		
 // Assignment-2 Circumference and Area of Circle/Rectangle/Square/Triangle
		
		//Circumference and Area of Circle
		System.out.println("Enter the pi");
		double pi=n1.nextDouble();
		System.out.println("Enter the radius");
		int r=n1.nextInt();
		double circumferenceofCircle=2*pi*r;
		System.out.println("Circumference of circle is "+circumferenceofCircle);
		double area=pi*r*r;
		System.out.println("Area of circle is "+area);
		
		//Circumference and Area of Rectangle
		System.out.println("Enter the lenth");
		int len=n1.nextInt();
		System.out.println("Enter the width");
		int wid=n1.nextInt();
		int circumferenceOfRectangle=2*(len+wid);
		System.out.println("Circumference of Rectangle is "+circumferenceOfRectangle);
		int AreaOfRectangle=len*wid;
		System.out.println("Area of Rectangle is "+AreaOfRectangle);
		
		//Circumference and Area of Triangle
		System.out.println("Enter the side1");
		int side1=n1.nextInt();		
		System.out.println("Enter the side2");
		int side2=n1.nextInt();
		System.out.println("Enter the side3");
	    int side3=n1.nextInt();
		double circumferenceOfTriangle=side1+side2+side3;
		System.out.println("Circumference of Traingle is "+circumferenceOfTriangle);
		double AreaOfTriangle=0.5*side1*side2;
		System.out.println("Area of Traingle is "+AreaOfTriangle);
		
		//Circumference and Area of Square
		System.out.println("Enter the side");
		int side=n1.nextInt();
		
		int CircumferenceOfSquare=4*side;
		System.out.println("Circumference of Square is "+CircumferenceOfSquare);
		int AreaOfSquare=side*side;
		System.out.println("Area of Square is "+AreaOfSquare);
	
		
	//Assignment 3-All operation including addtion/substarction/min/max using methods of Math class
		
		//Addition
	
	System.out.println("Enter int m");
		int m=n1.nextInt();
		System.out.println("Enter int n");
		int n=n1.nextInt();
		int addint=Math.addExact(m, n);
		System.out.println("Addition of int numbers is "+addint);
		
		System.out.println("Enter long l1");
		long l1=n1.nextLong();
		System.out.println("Enter long l2");
		long l2=n1.nextLong();
		long addLong=Math.addExact(l1, l2);
		System.out.println("Addition of long numbers is "+addint);
		
		//Substraction of long numbers
		System.out.println("Enter long c");
		long c=n1.nextLong();
		System.out.println("Enter long d");
		long d=n1.nextLong();
		long substraction=Math.subtractExact(c, d);
		System.out.println("Sunstraction of long numbers is "+substraction);
		
		//Max method

		//Maximum of float numbers
		System.out.println("Enter float f1");
		float f1=n1.nextFloat();
		System.out.println("Enter float f2");
		float f2=n1.nextFloat();
		float maxf1=Math.max(f1, f2);
		System.out.println("Maximum of float numbers is "+maxf1);
		
		//Maximum of double numbers
		System.out.println("Enter double d1");
		double d1=n1.nextDouble();
		System.out.println("Enter double d2");
		double d2=n1.nextDouble();
		double MaxOfDouble=Math.max(d1, d2);
		System.out.println("Maximum of double numbers is "+MaxOfDouble);
		
		//Min method
		//Minimum of int numbers
		System.out.println("Enter int t1");
		int t1=n1.nextInt();
		System.out.println("Enter int t2");
		int t2=n1.nextInt();
		int MinOfInt=Math.min(t1, t2);
		System.out.println("Minimun of int numbers is "+MinOfInt);
		
		//Minimum of long numbers
		
		System.out.println("Enter long p1");
		long p1=n1.nextLong();
		System.out.println("Enter long p2");
		long p2=n1.nextLong();
		long MinOfLong=Math.min(p1, p2);
		System.out.println("Minimun of long numbers is "+MinOfLong);
		n1.close();

	}

}
