package package_javabasics;
public class Static_NonStatic {
	//Assignment 9
	static void hobby1()
	{
		System.out.println("Singing");
	}
	static void hobby2()
	{
		System.out.println("Dancing");
	}
	
	static void hobby3()
	{
		System.out.println("Painting");
	}
    void singing()
    {
    	System.out.println("Clasical music");
    }
    void dancing()
    {
    	System.out.println("Classical dance Katthak");
    }
	public static void main(String[] args) {
		// Program of 3 static method and 2 non-staic method
      	Static_NonStatic n1=new Static_NonStatic();
		n1.dancing();
		n1.singing();
		hobby1();
		hobby2();
		hobby3();
		
	}

}
