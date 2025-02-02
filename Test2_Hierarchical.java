package selenium.framework;

import java.util.Scanner;

public class Test2_Hierarchical extends Test1{
	static void divide() {
		System.out.println("Division");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2_Hierarchical h1=new Test2_Hierarchical();
		int a=18;
		assert a>18:"Age must be more than 18";
		System.out.println("Go and vote");
		h1.login();
		h1.logout();
		h1.divide();
		Scanner s1=new Scanner(System.in);
		int q=s1.nextInt();
		switch(a) {
		case 1:System.out.println("Login with valida data");
		break;
		default:
			System.out.println("Login with valida data");
		}
		/*
		 * for(int i=1;i<=100;i++) { if(i==3) { continue; } if(i==10) { continue; }
		 * System.out.println(i); i++; }
		 */
       for(int i=-10;i>=-35;i--) {
    	   System.out.println(i);
       }
	}

}
