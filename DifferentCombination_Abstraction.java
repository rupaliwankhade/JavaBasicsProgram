package selenium.framework;


abstract class Combination_one{
	//2AM & 2 CM
	abstract void abMethod1();
	abstract void abMethod2();
	
   void cMethod1() {
	   System.out.println("Concrete method1-non-static");		
	}
   
    static void cMethod2() {
    	 System.out.println("Concrete method2-static");
	} 
}

abstract class Combination_two extends Combination_one{
	//3AM & 1 CM
	abstract void cMethod3();
	abstract void cMethod4();
	abstract void cMethod5();
	void cMethod6(){
		  System.out.println("Calling Concrete method6 in combination2");
		
	}
}
abstract class Combination_three extends Combination_two{
	//0AM & 4 CM
	void add() {
		   System.out.println("Addition");		
		}
	void sub() {
		   System.out.println("Substraction");		
		}
	void mul() {
		   System.out.println("Multiplication");		
		}
	void divide() {
		   System.out.println("Division");		
		}
	
}
public class DifferentCombination_Abstraction extends Combination_three{
	static void modulus() {
		System.out.println("Modulus");	
	}

	public static void main(String[] args) {
		DifferentCombination_Abstraction d1=new DifferentCombination_Abstraction();
     d1.abMethod1();
     d1.abMethod2();
     d1.add();
     d1.cMethod1();
     d1.cMethod3();
     d1.cMethod4();
     d1.cMethod5();
     d1.cMethod6();
     d1.divide();
     d1.sub();
     d1.modulus();
	}

	@Override
	void cMethod3() {
		System.out.println("Concrete method3");
		
	}

	@Override
	void cMethod4() {
		System.out.println("Concrete method4");
		
	}

	@Override
	void cMethod5() {
		System.out.println("Concrete method5");
		
	}

	@Override
	void abMethod1() {
		System.out.println("Concrete method1");
		
	}

	@Override
	void abMethod2() {
		System.out.println("Concrete method2");
		
	}

}
