package selenium.framework;
interface GoogleAuth{
	 void add();
	void substarct();	
}
 abstract class Discount_Abstract implements GoogleAuth{
	 abstract void cart();
	 void wishlist() {
		System.out.println("Wishlist");
		}
	}

public class Amazon_One extends Discount_Abstract{
	void divide() {
		System.out.println("Division");
		
	}	
	static void mul() {
		System.out.println("Multiplication");
	}
	public static void main(String[] args) {
		Amazon_One a1=new Amazon_One();
		a1.add();
		mul();		
		a1.cart();
		a1.substarct();
		a1.divide();
	}
	@Override
	public void add() {
		System.out.println("Addition");		
	}
	@Override
	public void substarct() {
		System.out.println("Substraction");		
	}
	@Override
	void cart() {
		System.out.println("Cart details");	
	}
}
