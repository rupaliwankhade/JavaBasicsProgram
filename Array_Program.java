package selenium.framework;

import java.util.Arrays;

public class Array_Program {

	public static void main(String[] args) {
		int rollno[]=new int[4];
		rollno[0]=34;
		rollno[1]=35;
		rollno[2]=36;
		rollno[3]=38;
		/*
		 * for(int i=0;i<=3;i++) { System.out.println(rollno[i]); }
		 */
		
		System.out.println(Arrays.toString(rollno));
		
		String name[]=new String[4];
		name[0]="Dipa";
		name[1]="Shyam";
		name[2]="Sonu";
		name[3]="Manu";
		System.out.println(Arrays.toString(name));
		
		double d[]=new double[4];
		d[0]=3.24;
		d[1]=6.45;
		d[2]=4.26;
		d[3]=5.27;
		System.out.println(Arrays.toString(d));
		double d1[]=new double[4];
		d[0]=3.24;
		d[1]=6.49;
		d[2]=4.29;
		d[3]=5.27;
		
		boolean b=Arrays.equals(d, d1);
		int c=Arrays.compare(d, d1);
		System.out.println(b);          
		System.out.println(c);
		
		

	}

}
