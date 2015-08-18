import java.io.Console;

public class Calculator {
	public static void main(String[] args) {
		
		// makes an Addition calculation

		Console myConsole = System.console();
		
		System.out.println("Tell me a number.");
		String stringNumber = myConsole.readLine();
		Integer yourNumber = Integer.parseInt(stringNumber);

		System.out.println("Tell me another number.");
		String stringNumber2 = myConsole.readLine();
		Integer yourNumber2 = Integer.parseInt(stringNumber2);

		Integer addedNumbers = yourNumber + yourNumber2;
		System.out.println(yourNumber + " and " + yourNumber2 + " together make " + addedNumbers + ".");
	}
}