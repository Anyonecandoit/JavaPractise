import java.util.Random;

public class Localvariable {
	
	
	
	void local(){
		
		Random random = new Random() ;
			int number = 10 ;
			global(random ,number);
			
				
	}
	
	
	void global(Random random ,int number) {
		
	
	number =	random.nextInt(4)+1;
		 
		System.out.println(number);
		
	}
	

}
