import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> tools = new ArrayList<String>();
		
		tools.add("Selenium");
		tools.add("Java");
		tools.add("workshop");
		tools.add("Boolean");
		
		System.out.println(tools);

		tools.add("dance");
		
		System.out.println(tools.size());
		
		System.out.println(tools.get(0));
		System.out.println(tools.get(1));
		System.out.println(tools.get(2));
		System.out.println(tools.get(3));
		System.out.println(tools.get(4));
		
		tools.remove(3);
		
		for(int i=0; i<tools.size(); i++) {
			
			System.out.println(tools.get(i)	);
		}
				
		
	}

}
