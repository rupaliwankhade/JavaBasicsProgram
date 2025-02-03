package Collections_Concept;
 class SuperClass{
	 
	 
 }

public class ClassType_Casting extends SuperClass{

	public static void main(String[] args) {
		// Upcasting-Converting from subclass object type to super class type
		SuperClass c1=new ClassType_Casting();
		
		//Downcasting-Converting from Super class type to sub class object type
		ClassType_Casting s1=(ClassType_Casting)new SuperClass();
	}

}
