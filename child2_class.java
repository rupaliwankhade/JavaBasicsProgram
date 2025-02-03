package package_inheritence;

public class child2_class extends Parent_Class{
	static void modulus()
	{
		System.out.println("Modulus");
	}
	
	void divide()
	{
		System.out.println("Division");
	}

	public static void main(String[] args) {
		// child2 lass
		
		child2_class c2=new child2_class();
		c2.add();
		c2.sub();
		c2.divide();
		
		
   
	}

}
