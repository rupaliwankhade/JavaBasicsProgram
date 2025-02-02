package selenium.framework;

import java.util.Arrays;
import java.util.Scanner;

public class Array_String_Practice {
	static int countOfAbha=0;
	static int countOfSpaces=0;
	static int countOfNumber=0;
	static int countOfSpecialCharacter;
	
	public static void main(String[] args) {
		// Program to reverese the string
		String a="DAD";
		String b="";
	  for(int i=a.length()-1;i>=0;i--)
		{
			char c1=a.charAt(i);
			b=b+c1;
		}
       System.out.println("Main string is "+a);
       System.out.println("Main string is "+b);
       if(a.equals(b)) {
    	   System.out.println("It is the Palindrome");
       }
       else {
    	   System.out.println("It is not the Palindrome"); 
       }
		char [] c3=a.toCharArray();
		System.out.println(c3);
		
		//Program to know specific number is part of array or not
	    int [] a1=new int[3];
		int numCheck=34;
		Scanner s1=new Scanner(System.in);
	
		for(int i=0;i<a1.length;i++) {
			a1[i]=s1.nextInt();
			if(numCheck==a1[i]) {
				
				System.out.println("numCheck is part of given array");
				System.out.println("Its index is ->"+i);
			}
			
			else {
				System.out.println("numCheck is not part of given array");
			}
		}
          System.out.println("Final array is ->"+Arrays.toString(a1));
         //Program to verify that given two string is anagram or not 
		String st1="stop";
		String st2="tops";
		if(st1.length()!=st2.length()) {
			System.out.println("It is not angram");
		}
		else {
			char[] c1=st1.toCharArray();
			char[] c2=st2.toCharArray();
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2)==true) {
				System.out.println("it is anagram");
				System.out.println(Arrays.toString(c2));
			}
			else {
				System.out.println("it is not anagram");
		
          }
		
		}
		
	String name="Dipali kale 1234%^&";
		char c[]=name.toCharArray();
		for(int i=0;i<name.length();i++) {
			boolean b1=Character.isAlphabetic(c[i]);
			if(b1==true) {
				countOfAbha++;
			}
			boolean b2=Character.isWhitespace(c[i]);
			if(b2==true) {
				countOfSpaces++;
			}
			boolean b3=Character.isDigit(c[i]);
			if(b3==true) {
				countOfNumber++;
			}	
			
			countOfSpecialCharacter=name.length()-(countOfAbha+countOfSpaces+countOfNumber);
	      }
		
		System.out.println("No of abhabates present in given String is ->"+countOfAbha);
		System.out.println("No of spaces present in given String is ->"+countOfSpaces);
		System.out.println("No of numbers present in given String is ->"+countOfNumber);
		System.out.println("No of Special character  present in given String is ->"+countOfSpecialCharacter);
		
 //Program to reverse the array
		int[] input=new int[4];
		input[0]=4;
		input[1]=8;
		input[2]=12;
		input[3]=16;
	    int[] output=new int[input.length];
	    for(int i=0,j=input.length-1;i<input.length;i++,j--) {
	    	output[j]=input[i];
	 
	    }
	    System.out.println(Arrays.toString(input));
	    System.out.println(Arrays.toString(output));
	    
	    for(int i=0,j=0;i<input.length;i++,j++) {
	    	output[j]=input[i];
	 
	    }
	    System.out.println("Copy of array is->"+Arrays.toString(output));
	}

}
