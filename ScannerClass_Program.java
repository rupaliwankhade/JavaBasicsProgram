package package_javabasics;

import java.util.Scanner;

public class ScannerClass_Program extends Object{

	public static void main(String[] args) {
		// Declare and initialize the datatypes of scanner class
		
		Scanner s1=new Scanner(System.in);
		
        byte b=s1.nextByte();
        int a=s1.nextInt();
        short s=s1.nextShort();
        long n=s1.nextLong();
        float f=s1.nextFloat();
        double d=s1.nextDouble();
        String g=s1.next();
        boolean l=s1.hasNextBoolean();
        boolean l1=s1.nextBoolean();
       s1.close(); 
       
        		
	}

}
