
public class Human {
	
	String name ;
	int age ;
	
	
	
	
	Human(String name , int age ){
		this.name = name ;
		this.age = age;
	}
	
	
	void drink(){
		System.out.println(this.name + "is drinking");
		
	}
	
	void agefilter() {
		System.out.println(this.name + "should not drink because more age filter ");
	}

	
	
	
}
