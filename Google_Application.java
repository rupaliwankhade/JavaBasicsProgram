package selenium.framework;

interface api3{
	void add();
	void sub();
}

interface api4{
	void multiple();
	void divide();
}
public class Google_Application implements api3, api4 {
	void modulus() {
		System.out.println("Modulus");
	}

	public static void main(String[] args) {
		
		Google_Application g1=new Google_Application();
		g1.add();
		g1.divide();
		g1.modulus();
		g1.multiple();

	}

	@Override
	public void multiple() {
		System.out.println("Multiplication");
	}

	@Override
	public void divide() {
		System.out.println("Division");
		
	}

	@Override
	public void add() {
		System.out.println("Addition");
		
	}

	@Override
	public void sub() {
		System.out.println("Substraction");
		
	}

}


