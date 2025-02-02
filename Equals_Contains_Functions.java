package selenium.framework;

public class Equals_Contains_Functions {

	public static void main(String[] args) {
		
		String input="Rupali Wankhade";
		boolean b=input.contains("Rupali");
		System.out.println(b);
		
		
		  //System.out.println(input.equalsIgnoreCase("rupali wankhade"));
		  //System.out.println(input.equals("rupali wankhade"));
		  System.out.println(input.matches("...."));
		  System.out.println(input.matches("(.*)e"));
		  System.out.println(input.matches("r(.*)"));
		  System.out.println(input.matches("(.*)wankhade(.*)"));
		  System.out.println(input.matches("(.*Wankhade.*)"));
		 
		
	}

}
