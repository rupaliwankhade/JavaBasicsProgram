package package_javabasics;

import java.util.Scanner;

public class AssertContinueSwitch_Keywords {

	public static void main(String[] args) {
		// Assignments on Assert, Continue an Switch keywords

		
		
		// run the assert keyword program
				int age1=19;
				int age2=15;
				//assert condition;
				assert age1>18;
				 System.out.println("Lets go and vote");
				assert age2>18:"Age must be greater than 18";
				//System.out.println("Age must be greater than 18");
			    System.out.println("Voting");
		
	 // Continue keyword-skip the iteration
			    for(int i=1;i<=31;i++)
				{
					
					if(i==4)
					{
						continue;
					}
					if(i==17)
					{
						continue;
					}
					if(i==28)
					{
						continue;
					}
					System.out.println(i);
				}
				
		//// Switch keyword program
			    Scanner s1=new Scanner(System.in);
				System.out.println("Please enter 1 for Chrome");
				System.out.print("Please enter 2 for Edge");
				System.out.print("Please enter 1 for Firefox");
				System.out.print("Please enter 1 for Safari");
				
				int input=s1.nextInt();
				
				switch(input)
				{
				
				case 1:System.out.println("Launching chrome");
				      //break;
			    case 2:System.out.println("Launching Edge");
				       break;
				case 3:System.out.println("Launching firefox");
			       break;
				case 4:System.out.println("Launching safari");
			       break;
			     default:
			    	System.out.println("Please check the options available");
				}

	}

}
