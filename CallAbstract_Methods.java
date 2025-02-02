package selenium.framework;

public class CallAbstract_Methods extends Abstract_Class{
	@Override
	void add() {
		// Adding method1
		System.out.println("Addition");
		
	}

	@Override
	void sub() {
		// Calling method 2
		System.out.println("Substraction");
		
	}

	public static void main(String[] args) {
		CallAbstract_Methods m1=new CallAbstract_Methods();

		m1.add();
		m1.sub();	
	}

	
}
