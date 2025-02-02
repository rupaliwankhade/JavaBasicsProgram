package selenium.framework;



public class Practice_Called extends AllTopics_Practice{
	
	
		
	Practice_Called()
		{
		super(5.5f);
			System.out.println("2nd constrrctor");
		}
	
	Practice_Called(int a)
	{
		super(6);
		System.out.println(1);
	}
	
	Practice_Called(String s)
	{
	  this(4);	
	  System.out.println("Rupali");
	}
		void sub()
		{
			super.sub();
			System.out.println("Substraction");
		}
	
 /*void multiple()
 {
	 
 }*/

	public static void main(String[] args) {
	
		Practice_Called p1=new Practice_Called();
		new Practice_Called("name");
		p1.add();
		p1.sub();
	}

}
