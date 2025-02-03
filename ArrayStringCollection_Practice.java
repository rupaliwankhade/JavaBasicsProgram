package exception.handling;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayStringCollection_Practice {

	public static void main(String[] args) {
		
		//Reverese word in Array
		
		    
		     
		
		String str="Jyoti Ghotake";
		/*
		 * Set<Character> s=new HashSet<Character>();
		 * 
		 * StringBuilder sb=new StringBuilder(); for(int i=0;i<str.length();i++) {
		 * s.add(str.charAt(i)); } for(char c:s) { sb.append(c);
		 * 
		 * } System.out.println(sb);
		 */
		String [] arrs1=str.split(" ");
		for(int i=arrs1.length-1;i>=0;i--) {
			System.out.println(arrs1[i]+" ");
			
		}
		//program to find unique character int he string
		
		String str2="Shirsha Kale";
		char []c=str2.toCharArray();
	
				
	
		// Array program-number is present in string or not
		int []a=new int[3];
		a[0]=100;
		a[1]=200;
		a[2]=101;
		int noCheck=100;
		for(int i=0;i<a.length;i++) {
			if(noCheck==a[i]){
				System.out.println(noCheck +" is part of this Array" );
				break;
				
			}
			else {
				System.out.println(noCheck +" is not  part of this Array" );
			}
		}
		String sname=null;
		System.out.println(sname);
		int b[]=new int[4];
		b[0]=34;
		b[1]=37;
		b[2]=30;
		b[3]=38;
		
		int output[]=new int[b.length];
		for(int i=0,j=b.length-1;i<b.length;i++,j--) {
			output[j]=b[i];
		}
         System.out.println("Input array is "+Arrays.toString(b));
         System.out.println("Reverse array is "+Arrays.toString(output));
        int c1[]=new int[b.length];
 		for(int i=0,j=0;i<b.length;i++,j++) {
 			c1[j]=b[i];
 		}
          System.out.println("Input array is "+Arrays.toString(b));
          System.out.println("Copy array is "+Arrays.toString(c1));
         
	}

}
