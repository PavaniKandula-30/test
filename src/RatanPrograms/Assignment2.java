package RatanPrograms;

public class Assignment2 {
	int a=1;
	int b=2;
	static int c=3;
	static int d=4;
	 
	static void m1() {
		Assignment2 p =new Assignment2();
		System.out.println(p.a);
		System.out.println(p.b);
		System.out.println(Assignment2.c);
		System.out.println(Assignment2.d);
	}
	void m2()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(Assignment2.c);
		System.out.println(Assignment2.d);
	}
	public static void main(String args[])
	{
		Assignment2.m1();
		Assignment2 d =new Assignment2();
		d.m2();
		
		
		
		
	}
}
