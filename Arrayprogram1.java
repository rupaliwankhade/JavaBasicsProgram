package selenium.framework;

import java.util.Arrays;

public class Arrayprogram1 
{
public static void main(String[] args) 
{
	int rollno[]=new int[4];
	rollno[0]=34;
	rollno[1]=35;
	rollno[2]=36;
	rollno[3]=38;
	int rollno1[]=new int[4];
	rollno1[0]=34;
	rollno1[1]=35;
	rollno1[2]=36;
	rollno1[3]=38;
	
	boolean answer=	Arrays.equals(rollno, rollno1);
	System.out.println(answer);
}
}
