import java.util.ArrayList;

public class List {
	
	public static void main(String[] args) {
	
		
		
		ArrayList< String> v = new ArrayList<>(5);
		
		v.add("tata");
		v.add("tata2");
		v.add("tata3");
		v.add("tata4");
		v.add("tata5");
		v.add("tata6");
		v.add("tata7");
		
		
		

		for (Object element : v) {
		      System.out.println(element);
		    }
			
		}

}
