package exceptions_one;

public class Calculator {
	
	
	public static float divide (float num1, float num2) throws Exception {
		
		if (num1 == 0 || num2 == 0) {
			
		throw new Exception("You cannot divide by zero");
		
		}
		
		return num1 / num2;
		
		}
		
		
		
	}
	



