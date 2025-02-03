package hierarchical.inheritence;

public class child_class2 extends Parent_Class{
     static void mod() {
    	 System.out.println("static method in child class 2");
     }
	public static void main(String[] args) {
		// Hierarchical inheritence
		child_class2 cp=new child_class2();
		cp.add();
		cp.login(573648347);
		Parent_Class.max();
		cp.max();
		mod();
		cp.mod();

	}

}
