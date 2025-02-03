package Collections_Concept;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class WholeCollection_Concepts {

	public static void main(String[] args) {
		
		//Collection interface and upcasting
		Collection<Object> c1=new ArrayList<Object>();
		c1.add(12);
		c1.add('C');
		c1.add("Rani");
		System.out.println(c1);
		
		//List interface and its class with properties
		List<String> l1=new ArrayList<String>();
		l1.add("Rama");
		l1.add("Revati");
		l1.add("Triveni");
		System.out.println(l1);
		ListIterator li=l1.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		l1.set(1, "Rupali");
		System.out.println(l1);
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(13);
		al.add(15);
		al.add(16);
		al.add(19);
		al.add(16);
		al.add(null);
		al.add(null);
		al.contains(13);
		al.containsAll(al);
		al.isEmpty();
		Collections.sort(al);
		Iterator <Integer>ial=al.iterator();
		while(ial.hasNext()) {
			System.out.println(ial.next());
		}
		//Legacy classes-Vector,Stack,Dictionary,Hashtable,Properties
		Vector<Object> v1=new Vector<Object>();
		v1.addElement("Dipa");
		v1.add(12);
		v1.addFirst("First");
		v1.addLast("Last");
		
	System.out.println();
	Vector<String> v2=new Vector<String>();
		v2.addElement("Manu");
		v2.addElement("Aaru");
		v2.addElement("Smith");
		v2.addElement("Kaustubh");
		System.out.println(v2);
		Vector<Object> v3=new Vector<Object>();	
		v3.add(13);
		v3.addElement('F');
		v3.addElement(13.25);
		v3.addElement(true);
		v3.addElement("Rama");
		System.out.println(v3);
	Stack <Object>sv=new Stack<Object>();
	sv.push("Ragini");
	sv.addElement("Sidhhi");
	sv.add("Riddhi");
	sv.add(0, "Shruti");
	sv.push(v2);
		System.out.println(sv);
	//sv.pop();
	System.out.println(sv);
	sv.peek();
	System.out.println(sv);

	//Cursor with Enumeration concepts
	Enumeration es=sv.elements();
	while(es.hasMoreElements()) {
		System.out.println(es.nextElement());
	}
Collections.sort(v2);
		Enumeration<String> e1=v2.elements();
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("Gita");
		pq.add("Ram");
		pq.add("Sita");
		pq.add("Lakshman");
		PriorityQueue pq1=new PriorityQueue();
		//pq1.add(pq);
		//pq1.add(null);
		System.out.println(pq);
		Iterator<String> ipq=pq.iterator();
		while(ipq.hasNext()) {
			System.out.println(ipq.next());
		}
		Enumeration <String> e=v2.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//Set Interface and its classes with properties
		Set <Object>sc=new HashSet<Object>();
		sc.add(11);
		sc.add(15);
		sc.add(15);
		sc.add(null);
		sc.add(null);
		System.out.println(sc);
		HashSet hs=new HashSet();
		hs.add(100);
		hs.addAll(sc);
		System.out.println(hs);
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.addLast(200);
		lhs.addAll(hs);
		System.out.println(lhs);
		Iterator is=lhs.iterator();
		while(is.hasNext()) {
			System.out.println(is.next());
		}
		//Dictionary<String,Integer> dm=new Dictionary<String,Integer>();
		
		//Map Interface and its classes with properties
		Map <String,Integer>hm=new <String,Integer> HashMap();
		hm.put("Dipa", 45);
		hm.put("Rama", 35);
		hm.put("Shyamal",25);
		hm.put("Dipali",26);
		hm.put("Dipali",26);
		hm.put("Rita", 28);
		hm.put("Raj", 28);
		hm.put("Pawan", null);
		hm.put("Null", 30);
		
		System.out.println(hm);
	LinkedHashMap<String,Character> lhm=new LinkedHashMap<String,Character>();
	lhm.put("Priya", 'F');
	lhm.put("Ram", 'M');
	lhm.put("Ganesh", 'M');
	lhm.put("Priti", 'F');
	System.out.println(lhm);
	
	System.out.println(lhm.containsKey("Priya"));
      Hashtable <String,Integer>hs1=new Hashtable<String,Integer>();
       hs1.put("Manu", 2);
       hs1.putAll(hm);
       System.out.println(hs1);
		Properties pm=new Properties();
		pm.putAll(hs1);
		pm.put("Aaru", 10);
		System.out.println(pm);
		
		//Cursor concept for Map-keyset, Value and Entry with Iterator
		Set sm1=hm.entrySet();
	
		for(String key:hm.keySet()){
			System.out.println(key);
		}

		for(Integer value:hm.values()){
			System.out.println(value);
		}
		
		Set <Entry<String,Integer>> sm2=hm.entrySet();
		Iterator ism1=sm2.iterator();
		while(ism1.hasNext()) {
			System.out.println(ism1.next());
		}
		
		
	}

}
