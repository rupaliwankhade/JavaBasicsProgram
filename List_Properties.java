package Collections_Concept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Properties {

	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("Gita");
		l.add("sita");
		l.add("ram");
	
		//l.remove(2);
		l.add(1, "Amit");
		//l.add("sita");
		//l.add(null);
		//l.add(null);
		System.out.println(l);
		
		
		ListIterator<String> ll=l.listIterator();
		ll.set("Shyam");
		  while(ll.hasNext()) 
		  { 
			  
	     //"List Forward interation is :
		  System.out.println(ll.next()); 
		  }
		  
			
			  while(ll.hasPrevious())
			  { //"List backward interation is :"
			  System.out.println(ll.previous()); }
			 
		
		
			/*
			 * List l1=new ArrayList(); l1.add("Shyam"); l1.addAll(0, l);
			 * 
			 * System.out.println(l1); //l1.clear(); //System.out.println(l1.removeAll(l));
			 * System.out.println(l1); //System.out.println(l1.isEmpty());
			 * 
			 * 
			 * Iterator<String> ite=l1.iterator(); //forward iteration while(ite.hasNext())
			 * { System.out.println(ite.next()); }
			 */
		 
		
		
		 
	}

}
