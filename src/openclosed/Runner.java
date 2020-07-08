package openclosed;

public class Runner {

	public static void main(String[] args) {
		
		Greeter greets = new Greeter(new CasualGreeting());
		System.out.println(greets.greet());

		greets.setGreeting(new FormalGreeting());
		System.out.println(greets.greet());
		

	}

}
