package selenium.framework;

import java.util.Arrays;

public class Anagram_Wrapper_program {
  static int countOfAlbha=0;
  static int countOfSpaces=0;
	public static void main(String[] args) {
		//1st program
		int [] a=new int[4];
		a[0]=120;
		a[1]=141;
		a[2]=100;
		a[3]=130;
		
		int noCheck=100;
		
	for(int i=0;i<a.length;i++) {
		if(a[i]==noCheck) {
			System.out.println("Yes, noCheck is the part of given Array a");
			System.out.println("And its index is->"+i);
		}
		else {
			System.out.println("No, noCheck is not the part of given Array a");
		}
	}
	System.out.println(Arrays.toString(a));	
	
	//2nd program-Anagram
		String s1="tea";
		String s2="eat";
		if(s1.length()!=s2.length()) {
			System.out.println("It is not Anagram");
		}
		else {
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			Arrays.sort(c1);
			Arrays.sort(c2);
			boolean answer=Arrays.equals(c1, c2);
			System.out.println(answer);
			if(answer==true) {
				System.out.println("It is angram");
			}
			else {
				System.out.println("It is not  angram");
			}
		}
		
		//3rd program=Wrapper-Character Class
		String input="Rupali Wankhade 123";
		char[] c3=input.toCharArray();
		for(int i=0;i<c3.length;i++) {
		boolean b1=Character.isAlphabetic(c3[i]);
		System.out.println(b1);
		if(b1==true) {
			countOfAlbha++;
			
		}
	 boolean b2=Character.isWhitespace(c3[i]);
	 if(b2==true) {
		 countOfSpaces++;
	 }
		}
		System.out.println("Total no of abhabets are -> "+countOfAlbha);
		System.out.println("Total no of Spaces are -> "+countOfSpaces);
	}

}
