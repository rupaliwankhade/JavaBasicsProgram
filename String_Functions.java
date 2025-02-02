package selenium.framework;

public class String_Functions {

	public static void main(String[] args) {
		// String functions
		String name="Aaradhya";
		
		
		String n1=name.concat(" Sarang").concat(" Belsare");
		System.out.println(n1);
		//immutable-anything that cannot be changed
		
		StringBuffer n2=new StringBuffer("Manasvi");
		//mutable-anything that can be changed
		n2.append(" Sarang Belsare");
		System.out.println(n2);
		
		StringBuilder b1=new StringBuilder("Rupali");
		b1.append(" Belsare");
		System.out.println(b1);
		
		//String functions
		int size=name.length();
		System.out.println(size);
		char c1=name.charAt(2);
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(c1);
		String d1="   Automation Testing    ";
		System.out.println(d1.trim());

		
		  String a="Dipa Kale"; 
		  System.out.println(a.substring(2));
		  System.out.println(a.substring(1,8)); //it gives number less than 1 
		  int p=a.indexOf('a');
		  System.out.println(p); 
		  System.out.println(a.isEmpty());
		  System.out.println(a.replace('i', 'e'));
		  System.out.println(a.replace("Kale","Wankhade"));
		  System.out.println(a.repeat(4));
		 
		
		//Take input as name and reverse
	}

	
}
