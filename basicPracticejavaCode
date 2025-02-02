package exception.handling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class JavaAllTopics {
	static int countOfAlbha=0;
	static int countOfdigit=0;
	static int countOfSpaces=0;
	static int countOfSpecial=0;

	public static void main(String[] args) {
      for(int i=-1;i>=-25;i--) {
			if(i==-2) {
				continue;
			}
			System.out.println(i);
		}
      
      Scanner ss3=new Scanner(System.in);
      int input1=ss3.nextInt();
      System.out.println("Enter 1 for Android");
      System.out.println("Enter 1 for Iphone");
      switch(input1) {
      case 1:System.out.println("It is Android phone");
      break;
      case 2:System.out.println("It is Iphone ");
      break;
      default:System.out.println();
      }
		//String concept
		String name="Rupali Wankhade123456&*%";
		System.out.println(name.charAt(2));
		System.out.println(name.contains("Rup"));
		System.out.println(name.indexOf("Wank"));
		//System.out.println(name.matches("R.*"));
		System.out.println(name.matches(".*W.*"));
		System.out.println(name.length());
		String name3="Dipa kale";
		String name4=" Dipa kale ";
		String name5="Dipa kale1234";
		System.out.println(name3.toLowerCase());
		System.out.println(name3.toUpperCase());
		System.out.println(name4.trim());
		System.out.println(name3.replaceAll("[A-Z]", ""));
		System.out.println(name4.replaceAll("[a-z]", ""));
		System.out.println(name5.replaceAll("[0-9]", ""));
		
		
		//Wrapper class
		
		char []chw=name.toCharArray();
		System.out.println(Arrays.toString(chw));
		for(int j=0;j<name.length();j++) {
			boolean b3=Character.isAlphabetic(chw[j]);
			System.out.println(b3);
			if(b3==true) {
				countOfAlbha++;
			}
			boolean b4=Character.isDigit(chw[j]);
			if(b4==true) {
				countOfdigit++;
			}
			boolean b5=Character.isWhitespace(chw[j]);
			if(b5==true) {
				countOfSpaces++;
			}
			
		
		}
		countOfSpecial=name.length()-(countOfAlbha+countOfdigit+countOfSpaces);
		System.out.println("Count of albhabet is :"+countOfAlbha);
		
		System.out.println("Count of number is :"+countOfdigit);
		System.out.println("Count of spaces is :"+countOfSpaces);
	
		System.out.println("Count of special character is :"+countOfSpecial);
		
		
		
		
		//Reverse string
		String name1="DAD";
		String output="";
		for(int i=name1.length()-1;i>=0;i--) {
			char c1=name1.charAt(i);
			output=output+c1;
		}
		System.out.println("Main string is "+name1);
		System.out.println("Reverse string is "+output);
		if(name1.equals(output)) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("It is not palindrome");
		}
		
		//Anagram program
		String s1="EAT";
		String s2="TEA";
		if(s1.length()!=s2.length()) {
			System.out.println();
		}
		else {
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			System.out.println(Arrays.toString(ch1));
			System.out.println(Arrays.toString(ch2));
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			System.out.println(Arrays.toString(ch1));
			System.out.println(Arrays.toString(ch2));
			boolean b1=Arrays.equals(ch1, ch2);
			if(b1=true) {
				System.out.println("It is Anagram");	
			}
			else {
				System.out.println("It is not Anagram");
			}
			
			}
			/*
			 * // int []sa1=new int[4]; // Scanner ss1=new Scanner(System.in); // // int
			 * []sa2=new int[sa1.length]; // for(int
			 * i=0,j=sa1.length-1;i<sa1.length;i++,j--) { // sa1[i]=ss1.nextInt(); //
			 * sa2[j]=sa1[i]; // } //
			 * System.out.println("Input aaray is "+Arrays.toString(sa1)); //
			 * System.out.println("Revrese aaray is "+Arrays.toString(sa2)); // for(int
			 * i=0,j=0;i<sa1.length;i++,j++) { // sa1[i]=ss1.nextInt(); // sa2[j]=sa1[i]; //
			 * } // System.out.println("Input aaray is "+Arrays.toString(sa1)); //
			 * System.out.println("Copy aaray is "+Arrays.toString(sa2));
			 * //System.out.println(sa1.clone());
			 */		
	
		Collection c1=new ArrayList();
		c1.add(1);
		c1.add(2);
		c1.add(3);
		Iterator i1=c1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		List l1=new LinkedList();
		l1.add(15);
		l1.addAll(c1);
		System.out.println(l1.size());
		System.out.println(l1.containsAll(c1));
		System.out.println(l1.reversed());
		ListIterator li=l1.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		Collections.sort(l1);
		Vector v=new Vector();
		v.addAll(c1);
		v.addElement(34);
		System.out.println(v);
		Stack sv=new Stack();
		sv.add(0,100);
		sv.addElement(v);
		sv.addLast(200);
		
		System.out.println(sv);
		System.out.println(sv.reversed());
		System.out.println(sv.pop());
		System.out.println(sv.peek());
		System.out.println(sv.push(300));
		System.out.println(sv);
		int a=sv.capacity();
		boolean b=sv.isEmpty();
		System.out.println("capacity is "+a);
		System.out.println("Empty answer is "+b);
		Enumeration ev=v.elements();
		while(ev.hasMoreElements()) {
			System.out.println(ev.nextElement());
		}
		Set se=new HashSet();
		se.add("Rama");
		se.add("Ragini");
		se.add("Sonu");
		se.add("Manu");
		System.out.println(se);
		se.remove("Sonu");
		se.contains(c1);
		LinkedHashSet<Object> lsh=new LinkedHashSet<Object>();
		Map <String,Integer> m1=new HashMap<String,Integer>();
		m1.put("Rama", 12);
		m1.put("Revati", 13);
		m1.put("Ramesh", 14);
		m1.put("Reva", 15);
	
		System.out.println(m1);
		System.out.println(m1.containsKey("Rama"));
		System.out.println(m1.containsValue(12));
		System.out.println(m1.isEmpty());
		System.out.println(m1.equals(l1));
		
		//m1.keySet();
		for(String key:m1.keySet()) {
			System.out.println(key);
		}
		
		for(Integer value:m1.values()) {
			System.out.println(value);
		}
		
		Set<Entry<String,Integer>> em=m1.entrySet();
		Iterator im=em.iterator();
		while(im.hasNext()) {
			System.out.println(im.next());
		}
		
		Hashtable<String,Character> hm=new Hashtable<String,Character>();
		hm.put("Dipa",'F');
		hm.put("Gita",'F');
		hm.put("Rakesh",'M');
		hm.put("Roshan",'M');
		System.out.println(hm);
		System.out.println(hm.clone());
		
		boolean bt=hm.equals(hm);
		System.out.println(bt);
		System.out.println(hm.replace("Dipa", 'F', 'M'));
		System.out.println(hm);
		
		
	}

}
