package hierarchical.inheritence;

public class TestCase1 extends ParentClass{
	
	void add()
	{
		System.out.println("Addition");
	}
	
	public static void main(String[] args) {
		TestCase1 tc1=new TestCase1();
		
		tc1.math();
	}

}
