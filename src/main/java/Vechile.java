
public class Vechile implements bicycle {

	String name ;
private	int count;
	
	public void start() {
		
		
		
		System.out.println("is started");
	}
	
	
	public void moved() {
		
		System.out.println("is moved ");
	}
	
	public Vechile(String name , int count , int pedal  ) {
		
		
	
		
		this.name = name ;
		this.setCount(pedal);
		
		
	}


	@Override
	
	
	public void stopped() {
		
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}
