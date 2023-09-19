package RatanPrograms;

public class StaticVariables {
	static int a=1000;
	static int b=2000;
	
	void m1()
	{
		System.out.println(StaticVariables.a);
		System.out.println(StaticVariables.b);
	
		
		
	}
	public static void main (String args[])
	{
		System.out.println(StaticVariables.a);
		System.out.println(StaticVariables.b);
		StaticVariables p=new StaticVariables();
		p.m1();
		
		
	}

}
