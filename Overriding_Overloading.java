package selenium.framework;
 class addition{
	 addition(){
		 System.out.println("Addition1"); 
	 }
addition(int a){
	System.out.println("Parameterixed constructor"); 
	 }
 void mod() {
	 System.out.println("Modulus");
 }
 }
public class Overriding_Overloading extends addition{
	Overriding_Overloading(){
		super(5);
		System.out.println("Additon4");
	}
	
	Overriding_Overloading(String d){
	   this('a');
		System.out.println("Additon2");
		
	}
	Overriding_Overloading(char c){
		System.out.println("Additon3");
	}
	void mod() {
		super.mod();
		 System.out.println("Multiplication");
	 }
	public static void main(String[] args) {
		Overriding_Overloading d1=new Overriding_Overloading();
		d1.mod();

	}

}
