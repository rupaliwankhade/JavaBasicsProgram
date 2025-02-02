package package_javabasics;

public class Hobby_Constructor{
	//Default constructor
	 Hobby_Constructor()
	{
		System.out.println("Hi, I am default constructor");
	}

	 //parameterized constructor
	 Hobby_Constructor(String name)
	 {
		 System.out.println("Constructor type 2 is "+name);
	 }
	 
	 Hobby_Constructor(String name, char Gender)
	 {
		 System.out.println("Student detail are : "+name+" and "+Gender);
	 }
	 
	 void add(int a, int b)
	 {
		 System.out.println(a+b);
	 }
	public static void main(String[] args) {
		// Program with constructor
		Hobby_Constructor h=new Hobby_Constructor();
		Hobby_Constructor p=new Hobby_Constructor("Parameterized constructor");
		new Hobby_Constructor("Dipa",'F');
		new Hobby_Constructor().add(5, 6);
		
		
	}

}
