package package_javabasics;

import java.util.Scanner;

public class Switch_keyword {

	public static void main(String[] args) {
		// Switch keyword program
		Scanner s1=new Scanner(System.in);
		System.out.println("please enter 1 for chrome");
		System.out.print("please enter 2 for edge");
		System.out.print("please enter 1 for firefox");
		System.out.print("please enter 1 for safari");
		
		int input=s1.nextInt();
		
		switch(input)
		{
		
		case 1:System.out.println("Launhcing chrome");
		      //break;
	    case 2:System.out.println("Launhcing Edge");
		       break;
		case 3:System.out.println("Launhcing firefox");
	       break;
		case 4:System.out.println("Launhcing safari");
	       break;
	     default:
	    	System.out.println("Please check the options available");
		}

	}

}
