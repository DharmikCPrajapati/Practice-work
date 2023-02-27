
public class Test3 {
	
	static Test3 t3 = new Test3();
	static Test1 t1=new Test1();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("I am in Main Mathod");
		
		
		bmw()	;
		t3.audi();
		Test1.printme();
		t1.paintme();
		
		
		
		
				
	}
	
	public static void bmw()	{
		
		System.out.println("bmw");
	}

	public void audi()	{
		System.out.println("audi");
	}
}
