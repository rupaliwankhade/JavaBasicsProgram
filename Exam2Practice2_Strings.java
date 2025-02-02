package selenium.framework;

public class Exam2Practice2_Strings {

	public static void main(String[] args) {
		
		  String input="MAM"; 
		  String output=""; 
		  for(int i=input.length()-1;i>=0;i--) 
		  { 
		  char c=input.charAt(i); 
		  output=output+c;
	  
		  }
		  System.out.println(output);
		  if (output.equals(input)) {
			  System.out.println("It is palindrome");
		  }
		  else
		  {
			  System.out.println("It is not palindrome");
		  }
		  String name="Dipa";
         System.out.println(name.trim());
         System.out.println(name.replace('D', 'S'));
         System.out.println(name.replace("Dipa", "Gita"));
         System.out.println(name.repeat(2));
         StringBuffer a1=new StringBuffer("Manasvi");
         System.out.println(a1.append(" Belsare"));
         System.out.println(name.matches("Dipa"));
         System.out.println(name.matches("Dipa"));
         System.out.println(name.toUpperCase());
         System.out.println(name.toLowerCase());
        
         
         
	}

}
