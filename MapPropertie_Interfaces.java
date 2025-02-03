package Collections_Concept;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPropertie_Interfaces {

	public static void main(String[] args) {
		// Hash-Map interface properties
		
		Map <String, String> m1=new HashMap<String, String>();
		m1.put("name1", "Dipa");
		m1.put("name2", "Ram");
		m1.put("name3", "Shyam");
		m1.put("name4", "Sita");
		
		Map <String, Integer> m2=new HashMap<String, Integer>();
		m2.put("Dipa",46);
	
		m2.put("Rupa",35);
		m2.put("Pranali",33);
		m2.put("Nitin",31);
		System.out.println(m1);
		
		System.out.println(m2);
		Map <String, Integer> m3=new HashMap<String, Integer>();
		m3.put("Manu", 3);
		m3.put("Manu", 5);
		m3.put("Kaustubh", null);
		m3.putAll(m2);
		m3.size();
		//m3.remove("Dipa");
		m3.replace("Dipa", 39);
		m3.replace("Nitin", 31,32);
		System.out.println(m3);
		System.out.println(m3.isEmpty());
		Map <String, Integer> m4=new HashMap<String, Integer>();
		m4.put("Aaru", 10);
		m4.putAll(m3);
		System.out.println(m4);
		//m4.clear();
		//m4.size();)
		System.out.println(m4.isEmpty());
		
		Map <String,Character> m5=new HashMap<String,Character>();
		m5.put("Student1", 'M');
		m5.put("Student2", 'F');
		m5.put("Student3", 'M');
		m5.put("Student4", 'F');
		System.out.println(m5);
		
		HashMap hm1=new HashMap();
		hm1.put("Ganesh", 'M');
		hm1.putAll(m5);
		System.out.println(hm1);
		Hashtable ht=new Hashtable();
		ht.put("Gita", 'F');
		System.out.println(ht);
		Set s1	=m5.keySet();
		System.out.println("fetching all values");
		for(String key:m1.keySet()) {
			System.out.println(key);
		}
		System.out.println("fetching all values");
		for(Character value:m5.values()) {
			System.out.println(value);
		}
		
		Set<Entry<String, Character>> kv= m5.entrySet();
		
		Iterator si=kv.iterator();
		while(si.hasNext()) {
			System.out.println(si.next());
		}
		
		
		
	}

}
