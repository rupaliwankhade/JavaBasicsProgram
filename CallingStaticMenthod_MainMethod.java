package package_javabasics;

public class CallingStaticMenthod_MainMethod {
	
	static void areaOfCircle() 
	{
		int radius=3;
		double pi=3.14;
		double AreaOfCicle=pi*radius*radius;
		System.out.println("Area of Cicle is "+AreaOfCicle);
	}


	public static void main(String[] args) {
		// Program to call static methods in main methods
		System.out.println("Main method");
		areaOfCircle();
		
	}

}
