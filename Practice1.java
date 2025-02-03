package Collections_Concept;

import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {
	static int CountOfAlbh=0;
	static int CountOfNum=0;
	static int CountOfSpace=0;
	static int CountOfSpecCh=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String name="Rupali Wankhade123#$%";
      String output="";
      String s1=name.concat("Sarang").concat("Belsare");
      System.out.println(s1);
      System.out.println(name.length());
      System.out.println(s1.charAt(2));
      System.out.println(s1.indexOf('S'));
      for(int i=name.length()-1;i>=0;i--) {
    	  char c1=name.charAt(i);
    	  output=output+c1;
      }
      System.out.println("Main string is "+name);
      
      System.out.println("Reverese string is "+output);
      if(name.equalsIgnoreCase(output)) {
    	  System.out.println("It is palidrome");
      }
      else {
    	  System.out.println("It is not palidrome");
      }
      int[] a1=new int[3];
      a1[0]=24;
      a1[1]=67;
      a1[2]=86;
    
      
      int noCheck=24;
      for(int i=0;i<a1.length;i++) {
    	  if(a1[i]==noCheck) {
    		  System.out.println("Nochekc is part of array");
    	  }
    	  else {
    		  System.out.println("Not part of array");
    	  }
    	 
      }
      System.out.println("Nochekc is part of array-> "+noCheck);
      
      //Wrapper class
      char[] c1=name.toCharArray();
      //static int CountOfNum=0;
  	//static int CountOfSpace=0;
  //	static int CountOfSpecCh=0;
      for(int i=0;i<c1.length;i++) {
    	  boolean b1=Character.isAlphabetic(c1[i]);
    	  boolean b2=Character.isDigit(c1[i]);
    	  boolean b3=Character.isSpaceChar(c1[i]);
    	
    	  if(b1==true) {
    		  CountOfAlbh++;
    	  }
    	  if(b2==true) {
    		  CountOfNum++;
    	  }
    	  if(b3==true) {
    		  CountOfSpace++;
    	  }	
      }
      
      int CountOfSpecCh=name.length()-(CountOfAlbh+CountOfNum+CountOfSpace);
	  System.out.println("CountOfAlbh is  "+CountOfAlbh);
	  System.out.println("CountOfNum is  "+CountOfNum);
	  System.out.println("CountOfSpace is  "+CountOfSpace);
	  System.out.println("CountOfSpecCh is   "+CountOfSpecCh);
      //Anagram
     int [] d1=new int[2];
     int [] d2=new int[d1.length];
     Scanner s3=new Scanner(System.in);
     for(int i=0,j=d1.length-1;i<d1.length;i++,j--) {
    	  d1[i]=s3.nextInt();
    	  d2[j]  =d1[i];
     }
     System.out.println("main array is "+Arrays.toString(d1));
     System.out.println("Reverse array is "+Arrays.toString(d2));
      }
      
      
	}


