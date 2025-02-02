package selenium.framework;

import java.util.Arrays;
import java.util.Scanner;

public class Assignmnets_Arrays {

	public static void main(String[] args) {
		// Assignment1-Program to create a array of 4 of string datatype 
		//and accept it input using scanner class
    String input[]=new String[4];
    Scanner s1=new Scanner(System.in);
	
	  for(int i=0;i<input.length;i++) {
	  System.out.println("Please enter the value at index of string");
	  input[i]=s1.next(); }
	  System.out.println("Input string array is->"+Arrays.toString(input));
	  
	  
	  //Asignment 2-check if two arrays are equals using scanner at runtime for int datatype
	   int rollno1[]=new int[4];
	  
	  for(int i=0;i<rollno1.length;i++) {
	  System.out.println("Please enter the value at index of rollno1");
	  rollno1[i]=s1.nextInt() ;
	  
	  } 
	  int rollno2[]=new int[4]; 
	  for(int j=0;j<rollno1.length;j++) {
	  System.out.println("Please enter the value at index of rollno2");
	  rollno2[j]=s1.nextInt(); } 
	  System.out.println(Arrays.toString(rollno1));
	  System.out.println(Arrays.toString(rollno2)); 
	  boolean Answer=Arrays.equals(rollno1, rollno2);
	  System.out.println("Answer is->"+Answer);
	  
	  
	  //Assignment 3-write the program to print the the array in reverse orde 1,2,3 to 3,2,1 
	  int input1[]=new int[3]; 
	  input1[0]=1; 
	  input1[1]=2;
	  input1[2]=3; 
	  int output1[]=new int[3];
	  for(int i=0,j=input1.length-1;i<input1.length;i++,j--)
	  { 
		  output1[j]=input1[i]; 
	  }
	  System.out.println("Value of input1 array is->"+Arrays.toString(input1));
	  System.out.println("Value of input1 array is->"+Arrays.toString(output1));
	 
    
    //Assignment 4-write the program to copy one array into another array
    int input2[]=new int[5];
    int output2[]=new int[5];
    for(int i=0,j=0;i<input2.length;i++,j++) {
    	input2[i]=s1.nextInt();
    	output2[j]=input2[i];  	
    }
    System.out.println("Value of input1 array is->"+Arrays.toString(input2));
    System.out.println("Value of input1 array is->"+Arrays.toString(output2));
    s1.close();
	}

}
