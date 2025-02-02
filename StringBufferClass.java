package selenium.framework;

public class StringBufferClass {

	public static void main(String[] args) {
		// StringBuffer
		//Automation testing
		StringBuffer sf1=new StringBuffer("Pranali");
		sf1.append(" Wankhade");
		System.out.println(sf1);
		System.out.println(sf1.replace(8, 16, "Alsapure"));
		System.out.println(sf1.delete(8, 16));
		System.out.println(sf1.length());
		
		System.out.println(sf1.length());
		StringBuffer sf2=new StringBuffer("Rupali Belsare");
		System.out.println(sf2.charAt(7));
		System.out.println(sf2.capacity()); 
		System.out.println(sf2.insert(7, "Sarang "));
		System.out.println(sf2.substring(8));
		System.out.println(sf2.substring(3, 13));
		System.out.println(sf2.reverse());
		String ss1="java";
		String ss2="java";
		String ss3=new String("java");
		
		System.out.println(ss1.equals(ss2) && ss1.equals(ss3));
		StringBuffer sf3=new StringBuffer("Hello World");
		System.out.println(sf3.delete(0, 2));
		
		
		

	}

}
