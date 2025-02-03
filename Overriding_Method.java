package package_inheritence;
class child extends Overriding_Method{
	  void add()
		{
			System.out.println(2);
		}
}
public class Overriding_Method {
	void add()
	{
		System.out.println(1);
	}
	

 

	public static void main(String[] args) {
		
		child c1=new child();
		c1.add();
		
	}

}
