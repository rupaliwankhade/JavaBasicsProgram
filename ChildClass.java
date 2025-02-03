package hierarchical.inheritence;
class Super_Parent{
	void div() {
		System.out.println("Super parent class methid is Div");
	}
}

 class Parent_Class extends Super_Parent{
	 static void max() {
		 
		 System.out.println("Calling static method from parent class");
	 }
	 //Overloading program
	 void login(int MobileNumber) {
		 System.out.println(MobileNumber);
		 
	 }
	 void login(String username,String password) {
		 
		 System.out.println(username+ " and "+password);
	 }
	 void add() {
		 int a=20;
		 int b=10;
		 int c;
		 c=a+b;
		 System.out.println("Addition of Integers is "+c);
		 
	 }
	 Parent_Class(){
		 System.out.println("1st parent class constructor");
	 }
 Parent_Class(int a){
	 System.out.println("2nd parent class constructor with value "+a);
	 }
	
}

public class ChildClass extends Parent_Class{
	ChildClass(){
		this('A');
		System.out.println("Child class constructor with char A");
	}
	ChildClass(char c){
		super(34);
	
		System.out.println("Child class constructor 2");
	}
	 void add() {
		 super.add();
		 System.out.println("Addition of double");
		 
	 }

	public static void main(String[] args) {
		//Single and Multilevel inheritenece
		//Overriding program
		//Parent_Class pc=new Parent_Class();
		ChildClass cc=new ChildClass();
		//ChildClass cc1=new ChildClass();
		
		//cc.add();
		cc.login(1234567889);
		cc.login("rwankhdf", "hdsja3232");
		cc.add();
		cc.div();
		
	
	}

}
