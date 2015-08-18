import java.io.Console;

public class SubtractIt {
	public static void main(String[] args) {

		//makes a subtraction calculation

		Console myConsole = System.console();
		
		System.out.println("Please type a number.");
		String stringNumber = myConsole.readLine();
		Integer yourNumber = Integer.parseInt(stringNumber);

		System.out.println("Tell me a number to subtract.");
		String stringNumber2 = myConsole.readLine();
		Integer yourNumber2 = Integer.parseInt(stringNumber2);

		Integer subtractedNumber = yourNumber - yourNumber2;
		System.out.println(yourNumber + " minus " + yourNumber2 + " equals " + subtractedNumber + "!");	
	}
}