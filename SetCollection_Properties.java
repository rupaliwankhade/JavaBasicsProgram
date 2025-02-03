package Collections_Concept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection_Properties
{

	public static void main(String[] args)
	{
	Set s1	=new HashSet();
      s1.add(34);
      s1.add(14);
      s1.add(44);
      s1.add(89);
      s1.add(89);
     // s1.add(null);
      //s1.add(null);
    //  s1.add("Dipa");
      
      System.out.println(s1);
      
     Iterator si=s1.iterator();
     while(si.hasNext()) {
    	 System.out.println(si.next());
     }
      
      
	}

}
