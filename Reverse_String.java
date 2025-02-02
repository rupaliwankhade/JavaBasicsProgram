package selenium.framework;

public class Reverse_String {

	public static void main(String[] args) {
		// reverse the string using for loop
		String input="DAD";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			
		char c1=input.charAt(i);
		output=output+c1;
		}
		System.out.println(output);
			
		if(input.equals(output)) {
			
			System.out.println("It is palindrome");
		}
		else 
		{
			System.out.println("It is not palindrome");
		}
		
		System.out.println(input.matches("...."));
		String n="auto";
		//char [] r=n.toCharArray();
		char [] r=n.toCharArray();
		System.out.println(r);
		
		
		
	}
	
	

}
