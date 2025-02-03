package package_inheritence;

public class Method_Overriding {
	
	void add()
	{
		System.out.println(1);
	}
	
}

  class Overrding extends Method_Overriding{
	 void add()
		{
		 System.out.println(2);
		}
	
	public static void main(String[] args) {
		
		Overrding o1=new Overrding();
		o1.add();
	}

}
