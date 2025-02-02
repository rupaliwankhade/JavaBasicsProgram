package selenium.framework;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayString_Scanner {

	public static void main(String[] args) {
		// Array string scanner class
		
		Scanner s1=new Scanner(System.in);
		int[] rollno=new int[4];
		for(int i=0;i<rollno.length;i++) {
			System.out.println("Plese enter value at index"+ i);
			rollno[i]=s1.nextInt();
		}
		System.out.print("Plese enter value at index is->");
		System.out.println(Arrays.toString(rollno));
		
		
      Scanner s2=new Scanner(System.in);
      String [] input=new String[2];
      for(int i=0;i<input.length;i++) {
    	  System.out.println("Please enter index value ->"+i);
    	  input[i]=s2.next();
      }
      System.out.println("String array is ->"+Arrays.toString(input));
	}

}
