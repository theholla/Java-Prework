import java.io.Console;

public class AlwaysOne {
	public static void main(String[] args) {

		Console myConsole = System.console();

		System.out.println("You tell me a number, I'll make it into 1.");
		String stringNumber = myConsole.readLine();

		Integer yourNumber = Integer.parseInt(stringNumber);
		Integer theNumberOne = yourNumber / yourNumber;

		String stringNumberOne = Integer.toString(theNumberOne);
		System.out.println("Your new number is " + stringNumberOne + " mothafuckaaaaa!!");
	}
}