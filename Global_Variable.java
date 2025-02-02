package package_javabasics;

public class Global_Variable {
	
	static int a=10;//Global Variable
	static int b=20;//Global Variable
	int age=35;      //Global Variable
	final static double pi=3.14; //Final variable
	int r=4;
	static int days;
    
	void printDays() 
	{
		days=30;
		System.out.println(days);
	}
	void printAge()
	{
		System.out.println(age);
	}
	
	static void add()
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// Program for Global variable
		days=28;
		int r=2;
		double area=Math.PI*r*r;
		System.out.println(a);
		System.out.println(b);
		System.out.println(area);
		add();
		Global_Variable g=new Global_Variable();
		g.age=34;
        g.printAge();
        g.printDays();
        System.out.println(days);
        double radius=Math.random();
        System.out.println(radius);
        
		
	}

}
