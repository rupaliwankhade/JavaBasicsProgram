package selenium.framework;

abstract class GoogleOne{
abstract void getDetails();
abstract void add();
void sub() {
System.out.println("1st substraction");
}

static void mod() {
	
}
}

class BigData extends GoogleOne{
	void getData() {
		
	}
	BigData(float f){
		System.out.println("1st constructor");
	}
	@Override
	void getDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void add() {
		// TODO Auto-generated method stub
		System.out.println("1st method");
	}
	void sub() {
		System.out.println("2nd substraction");
	}
}

public class Exam2_Practice3 extends BigData{
	//Multi level inheritence
	Exam2_Practice3(String s){
		super(5.1f);
		System.out.println("2nd constructor");
	}
	Exam2_Practice3(){
		this("Dipa");
		System.out.println("3rd constructor");
	}
	void add() {
		System.out.println("2nd method");
		
	}

	public static void main(String[] args) {
		Exam2_Practice3 p1=new Exam2_Practice3();
		p1.add();
		p1.getDetails();
		p1.sub();
		

	}

}
