package selenium.framework;

public class StringFunctions_Practice {

	public static void main(String[] args) {
		// Reverese
		String name="Rupali";
		String name1 = "";//we can store the literals
		//length is starts from 1
		//index is starts from 0
		for(int i=name.length()-1;i>=0;i--) {
			
			char c1=name.charAt(i);
			name1=name1+c1;
			System.out.println(name1);
		}
		System.out.println(name1);

	}

}
