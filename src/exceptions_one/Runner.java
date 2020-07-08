package exceptions_one;

public class Runner {
	
public static void main (String[] args) {
		
		
		try {
			System.out.println(Calculator.divide(2,2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
