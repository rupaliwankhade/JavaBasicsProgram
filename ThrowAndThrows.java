package exception.handling;

import java.util.ArrayList;
import java.util.Vector;

public class ThrowAndThrows {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException,NullPointerException {
		// throw exception
		//throw new NullPointerException("Size is less");
		//throw new ArrayIndexOutOfBoundsException("Size is less");
		//throw new ArrayIndexOutOfBoundsException("Size is less");
		
		/*
		 * if(1==1) { throw new ArrayIndexOutOfBoundsException("Size is less"); } else {
		 * throw new NullPointerException("Cell is empty"); }
		 */
		//checked exception
		for(int i=0;i<3;i++) {
			System.out.println("My name");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		//Unchecked Exception
		
		int a[]=new int[3];
		a[0]=1;
		a[1]=3;
		a[2]=5;
		//a[3]=5;
		String s=null;
		System.out.println(s);
		StringBuffer sbf=new StringBuffer();
		Vector v=new Vector();
		v.add("Sarang");
		sbf.insert(0, "Manu Kale");
		sbf.append(v);
		sbf.toString();
		System.out.println(v);
		ArrayList <Object> al=new ArrayList();
		al.add("Jitesh Kale");
		StringBuilder sb=new StringBuilder("Dipa");
		sb.append(al);
		System.out.println(al);
		sb.append(sbf);
		sb.ensureCapacity(10);
		sb.charAt(1);
		sb.toString();
		
	
		
	}

}
