package package_inheritence;

public class Child1_Class extends child2_class{
	//Multi level inheritence
	void Multiple()
	{
		System.out.println("Multiplication");
	}
  public static void main(String []args) 
  {
	  Child1_Class c1=new Child1_Class();
	  c1.divide();
	  c1.Multiple();
	  c1.sub();
	 // c1.add();
	  modulus();
	  add();
  }

}
