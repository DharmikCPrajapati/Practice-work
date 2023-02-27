
public class ArgumentsTest {

	public static void main(String[] args) {
	
		cal();
		cal(20,200);
		cal(1,4,88);
		cal("bobby",256);
		
		
		
		
		
		
		
		

	}

	
	public static void cal() {
		
		int a= 15;
		System.out.println(a);
	}
	
	public static void cal(int z,int x) {
		
		int a= z+x;
		
		System.out.println(a);
	}
	
	public static void cal(int x,int y,int z) {
		
		System.out.println(x+y+z);
		
	}
	
	
	public static void cal(String b, int f) {
		
		System.out.print(b);
		System.out.println(f);
	}
	
}
