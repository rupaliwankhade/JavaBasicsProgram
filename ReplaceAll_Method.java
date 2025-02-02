package selenium.framework;

public class ReplaceAll_Method {

	public static void main(String[] args) {
		String name="Dipa kale 1234";
		String name2="Ragini Dalavi";
		
		//Lets remove all capital letters using replace all method

		System.out.println(name.replaceAll("[A-Z]", ""));
		
		//Lets remove all the lower case letters from the given string

		System.out.println(name2.replaceAll("[a-z]", ""));
		
		//Lets remove all the numeric value from the given string 

		System.out.println(name.replaceAll("[0-9]", ""));
		
		//Lets sireesha remove s with some other letter

		String input1="sireesha";
		System.out.println(input1.replaceAll("s","d"));
	
		//Take the input as my name is Neha and remove all the spaces

		String input2="my name is Neha";
		System.out.println(input2.replaceAll(" ", ""));

	}

}
