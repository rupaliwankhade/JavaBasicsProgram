package selenium.framework;

import java.util.Arrays;

public class Copy_Arrays {

	public static void main(String[] args) {
		// copy one array into another
		
		int input[]=new int[3];// this is the length
		input[0]=1;
		input[1]=2;
		input[2]=3;
		int output[]=new int[input.length];
      for(int i=0,j=0;i<input.length;i++,j++) {
			
			output[j]=input[i];
			// values are assigned from right to left side
		}
		System.out.println("Input array is  "+ Arrays.toString(input));
		System.out.println("Output array is  "+ Arrays.toString(output));

	}

}
