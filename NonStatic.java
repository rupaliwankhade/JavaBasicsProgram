package package_javabasics;
public class NonStatic {
	//Assignment 8
	int a=20;
    int b=30;
    int c=40;
	    void add()
		{
			int sum=a+b;
			System.out.println(sum);
		}
	    void sub()
		{
			int sub=c-b;
			System.out.println(sub);
		}
	    void mul()
		{
			int mul=a*b*c;
			System.out.println(mul);
		}
	public static void main(String[] args) {
		// Program to create 3 non-static method by accessing them with 3 diffent object
		NonStatic s1=new NonStatic();
		NonStatic b1=new NonStatic();
		NonStatic m1=new NonStatic();
		s1.add();
		b1.sub();
		m1.mul();
		
		
		
	}

}
