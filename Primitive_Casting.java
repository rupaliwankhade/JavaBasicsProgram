package Collections_Concept;

public class Primitive_Casting {

	public static void main(String[] args) {
		// Primitive type casting
		int wht=65;
		double d1=wht;//widening-lower to higher data type casting-inplicitely
		System.out.println(d1);
		
		//Explicitely
		double d2=(double)wht;//Explicitely
		//Narrowing can be done only explicitely
		double d3=45.24;
		int a=(int) d3;
		System.out.println(a);
		
		
		

	}

}
