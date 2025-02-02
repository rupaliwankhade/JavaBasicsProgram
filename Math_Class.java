package package_javabasics;
public class Math_Class {

	public static void main(String[] args) {
		// Using math class
		
		System.out.println(Math.addExact(10, 30));//2
		System.out.println(Math.subtractExact(40, 30));//2
		System.out.println(Math.multiplyExact(10, 30));//4=8
		
		System.out.println(Math.divideExact(60, 30));
	
		System.out.println(Math.abs(30.15));
		System.out.println(Math.max(1253467,872638723));//12
		System.out.println(Math.min(1253467,872638723));//16
		System.out.println(Math.random());//double 
		double radius=Math.random();
		System.out.println(radius);
		
	}

}
