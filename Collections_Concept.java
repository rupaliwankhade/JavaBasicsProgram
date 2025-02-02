package selenium.framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Collections_Concept {

	public static void main(String[] args) {
		// Collections concept
		
		List l1=new ArrayList();
		l1.add(23);
		l1.add(12);
		l1.add(34);
		System.out.println(l1);
		ArrayList a1=new ArrayList();
		
		
		a1.add(45);
		a1.add(l1);
		System.out.println(a1);
		Collections.sort(l1);
		System.out.println(l1);
		ListIterator li=l1.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		Set s1=new HashSet();
		s1.add(12);
		s1.add(11);
		s1.add(10);
		System.out.println(s1);
		
		
		String sp1="tops";
        String sp2="stop";
        if(sp1.length()!=sp2.length()) {
        	System.out.println("it is not anagran");
        }
        else {
        	char []ch1=sp1.toCharArray();
        	char []ch2=sp1.toCharArray();
        	System.out.println(Arrays.toString(ch1));
        	System.out.println(Arrays.toString(ch2));
        	Arrays.sort(ch1);
        	Arrays.sort(ch2);
        	System.out.println(Arrays.toString(ch1));
        	System.out.println(Arrays.toString(ch2));
        	boolean ba1=Arrays.equals(ch1, ch2);
        	if(ba1==true) {
        		
        		System.out.println("it is anagram");
        	}
        	else {
        		System.out.println("it is not anagram");
        	}
        	
        }

	}

}
