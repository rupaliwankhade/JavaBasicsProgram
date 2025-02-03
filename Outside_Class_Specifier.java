package pack_accessSpecifier;

public class Outside_Class_Specifier {

	public static void main(String[] args) {
		// method outside the class but within the same package
		ProtectedPublic_Concepts.addtion();
		ProtectedPublic_Concepts.multiplication();
		ProtectedPublic_Concepts.substarction();
		ProtectedPublic_Concepts pc=new ProtectedPublic_Concepts();
		pc.addtion();
		pc.multiplication();
		pc.substarction();

	}

}
