package selenium.framework;

public class StringBuilder_Class {

	public static void main(String[] args) {
		// String Builder classes
		StringBuilder sb=new StringBuilder("Rupali Wankhade");
		sb.append(" Belsare");
		System.out.println(sb);
		
         sb.ensureCapacity(22);
         System.out.println(sb.capacity());
		System.out.println(sb.length());
		//System.out.println(sb.deleteCharAt(8));
		System.out.println(sb.delete(7, 16));
		System.out.println(sb.insert(7, "Sarang "));
		System.out.println(sb.substring(7));
		System.out.println(sb.substring(13, 21));
		
		
		
		

	}

}
