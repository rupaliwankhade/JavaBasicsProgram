package exception.handling;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchBlocks {

	public static void main(String[] args) {
		// try-catch exception
		
		
   //1st try catch block
		try {
			int a;
			a=1/0;}
		catch(ArithmeticException a) {
			System.out.println("Please enter correct value");
			
		}
	//2nd try catch block		
			try {
				
				Scanner s1=new Scanner(System.in);
				int [] input=new int[s1.nextInt()];
				System.out.println("Enter the size of array:"+Arrays.toString(input));
				
			}
			catch(NegativeArraySizeException ne) {
				System.out.println("Enter the positive value");
				
			}
			catch(InputMismatchException ne) {
				System.out.println("Enter the only integer value value");
				
			}
			
	//3rd try catch block	
			try {
				int b[]=new int[3];
				b[0]=12;
				b[1]=13;
				b[2]=15;
				b[3]=14;
				
				System.out.println(b[3]);
			}
			catch(ArrayIndexOutOfBoundsException oe) {
				System.out.println("Logic");
				
			}
			catch(NullPointerException pe) {
				System.out.println("Logic1");
			}
			
			try {
			String name=null;
			System.out.println(name.length());
			}
			catch(NullPointerException pe){
				System.out.println("Enter the value of string instead of null");
				System.out.println("It is NullPointerException");
				
			}
			
			
	}
}
