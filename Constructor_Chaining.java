package package_inheritence;


public class Constructor_Chaining {
	
	Constructor_Chaining()
	{
		this(true);
		System.out.println(1);
	}
    
	Constructor_Chaining(int a)
	{
		
		this("Manu","Aaru");
		System.out.println(2);
	}
	Constructor_Chaining(String s1, String s2)
	{
		this(false);
		System.out.println(3);
	}
	Constructor_Chaining(boolean answer)
	{
		
		System.out.println(4);
	}
	public static void main(String[] args) {
		
      new Constructor_Chaining();
    
	}

}
