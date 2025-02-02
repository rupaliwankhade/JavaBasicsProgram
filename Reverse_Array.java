package selenium.framework;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) {
		// Reverse the int array 
		try {
		
		int input[]=new int[3];// this is the length
		input[0]=1;
		input[1]=2;
		input[2]=3;
		//input[3]=4;
		
			//int output[]=new int[3];
		int output[]=new int[input.length];
			/*output[0]=input[2];
			output[1]=input[1];
			output[2]=input[0];*/
		
		
		for(int i=0,j=input.length-1;i<input.length;i++,j--) {
			
			output[j]=input[i];
			Thread.sleep(1000);
		}
		System.out.println("Input array is  "+ Arrays.toString(input));
		System.out.println("Reverse array is  "+ Arrays.toString(output));
		
}

catch(Exception e) {
	System.out.println("Throw the exeception");
    }
	}
}

