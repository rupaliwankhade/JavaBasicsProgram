package package_inheritence;

import package_javabasics.Method_Overloading;

public class Parent_Class extends Method_Overloading{
	
	static void add()
	{
	 System.out.println("Addition");
	}
	
	void sub()
	{
		System.out.println("Substraction");
	}

	public static void main(String[] args) {
		//Parent class
		Parent_Class p1=new Parent_Class();
	
		 add();

	}

}
