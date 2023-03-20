import java.util.Random;

public class Localvariable {
	
	Random random ;
	int number ;
	void local(){
		
	random = new Random() ;
			int number = 10 ;
			//global(random ,number);
			
				
	}
	
	
	void global() {
		
	
	number =	random.nextInt(4)+1;
		 
		System.out.println(number);
		
	}
	

}
