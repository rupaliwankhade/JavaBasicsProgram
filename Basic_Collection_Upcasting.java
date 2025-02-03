package Collections_Concept;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Basic_Collection_Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Object> c1=new ArrayList<Object>();
		
		c1.add("Rupa");
		c1.add(true);
		c1.add(12.34);
		c1.add(145.3);
		c1.add(1500);
		c1.add('D');
		System.out.println(c1);
		
		Collection<Integer> c2=new ArrayList<Integer>();
	    c2.add(12);
		c2.add(145);
		c2.add(1500);
		c2.add(13);
		System.out.println(c2.contains(15));
		System.out.println(c2.containsAll(c1));
		System.out.println(c2);
			
		Collection<String> c3=new ArrayList<String>();
	    c3.add("Dipa");
		c3.add("Ram");
		c3.add("Radha");
		c3.add("Pavan");
		
		System.out.println(c3);
		
		boolean b1=c3.isEmpty();
		System.out.println(b1);
		Collection<Boolean> c4=new ArrayList<Boolean>();
	    c4.add(true);
		c4.add(false);
		System.out.println(c4);
		
		Collection<String> c5=new ArrayList<String>();
	    c5.add("Rupa");
		c5.addAll(c3);
		System.out.println(c5);
	    c5.remove("Radha");
	    c5.add(null);
	    c5.add(null);
	  //After  sorting
	  	//sorting, order of insertion
	  	ArrayList a1=new ArrayList();
	  	a1.add(100);
	  	a1.add(104);
	  	a1.add(19);
	  	System.out.println("Without sorting "+a1);
	  	Collections.sort(a1);
	  	System.out.println("Aftersorting "+a1);
	    System.out.println("Update is->"+c5);
	    
	    Collection<Object> c6=new ArrayList<Object>();
	    c2.addAll(c2);
	    Iterator<Integer> i1=c2.iterator();
	   // Without sorting
	   // i1.next();//object
	    //i1.hasNext();//boolean
	    while(i1.hasNext())
	    {
	    	System.out.println(i1.next());
	    }
	}

}
