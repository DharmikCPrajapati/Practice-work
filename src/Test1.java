import seleniumpractice.Test4;

public class Test1 {

	static Test1 t1=new Test1();
	static Test2 t2=new Test2();
	static Test3 t3 = new Test3();
	static Test4 t4 = new Test4();
	
	
	
	public static void main(String[] args) {
		
		System.out.println("I'm in main Mathod");
		printme();
		scanme();
		t1.testme();
		t1.paintme();
		Test2.blue();
		t2.red();
		Test3.bmw();
		t3.audi();
		Test4.circle();
		t4.squre();
		

	}

	public static void printme()	{
		
		System.out.println("PritMe");
	}
	
	public static void scanme()	{
		
		System.out.println("scanme");
		
	}
	public void testme()	{
		System.out.println("testme");
		
	}
	public void paintme()	{
		System.out.println("paintme");
	}
	
	
	
}
