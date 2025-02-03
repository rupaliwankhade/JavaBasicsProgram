package Collections_Concept;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Exam3_ArrayStringCollectionsPractice {

	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<Integer>();
        c1.add(10);
        c1.add(23);
        c1.add(14);
        c1.add(46);
        c1.add(86);
        c1.remove(10);
     System.out.println(c1.isEmpty());  
     System.out.println(c1);  
     Collection<Integer> c2=new ArrayList<Integer>();
     c2.add(134);
     c2.add(135);
     c2.add(136);
     c2.add(137);
       c2.addAll(c1);
       c2.removeAll(c1);
     System.out.println(c2);  
     System.out.println(c2.contains(134));
     System.out.println(c2.containsAll(c1));
     
     List l1=new ArrayList();
     l1.add(12);
     l1.add(13);
     l1.add(14);
     l1.add(15);
     l1.addAll(c1);
     Collections.sort(l1);
     l1.remove(0);
     System.out.println(l1.equals(c1));
    int sizeOfList= l1.size();
     System.out.println(sizeOfList);
     //l1.clear();
       System.out.println(l1.isEmpty());
     System.out.println(l1); 
   ListIterator li=l1.listIterator();
   while(li.hasNext()) {
	   System.out.println(li.next());
   }
   
   while(li.hasPrevious()) {
	   System.out.println(li.previous());
   }
  Set s1=new HashSet();
  s1.add(124);
  s1.add(126);
  s1.add(-121);
  s1.add(c1);
 //s1.clear();
     System.out.println(s1);
    s1.remove(c1);
    System.out.println(s1);
    Iterator i2=s1.iterator();
    while(i2.hasNext()) {
    	System.out.println(i2.next());
    }
    
    
	}

}
