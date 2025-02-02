package selenium.framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class While_Loop {

	public static void main(String[] args) {
		// While-loop program
		int i=2;
		while(i<14) {
			System.out.println(i);
			i++;
		}
		String s1="Dipa";
		String s2="iDpa";
		if(s1.length()!=s2.length()) {
			System.out.println("It isnot anagram");
		}
		else {
			char[] c1=s1.toCharArray();
			char[] c2=s1.toCharArray();
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			Arrays.sort(c1);
			Arrays.sort(c2);
			boolean b1=Arrays.equals(c1, c2);
			if(b1==true) {
				System.out.println("it is anagram");
			}
			else {
				System.out.println("it is not anagram");
			}
			}
	      Collection<Object> c1=new ArrayList<Object>();
	      c1.add(5);
	      c1.add(12);
	      c1.add(13);
	      c1.add(14);
	      System.out.println(c1);
	      ArrayList<Integer> a1=new ArrayList<Integer>();
	      a1.add(23);
	      
	   Collections.sort(a1);
	
	}
	
	
	

}
