
public class Students {

	
	private String maths;
	String science;
	int noofstudents;
	
	private String name;
	
	public Students(String maths, String science , int noofstudents) {
		
		this.maths = maths;
		this.science = science;
		this.noofstudents = noofstudents;
		this.setName(name);
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
