import java.io.Console;

public class MultiplyIt {
	public static void main(String[] args) {
		Console myConsole = System.console();

		//Makes a multiplication type of math event

		System.out.println("Tell me a number that you want multiplied.");
		String stringNumber = myConsole.readLine();
		Integer yourNumber = Integer.parseInt(stringNumber);

		System.out.println("Tell me another numburrr, won't you??");
		String stringNumber2 = myConsole.readLine();
		Integer yourNumber2 = Integer.parseInt(stringNumber2);

		Integer theAnswer = yourNumber * yourNumber2;

		//asks unnecessary questions
		//doesn't do anything with the input
		System.out.println("Do you want to know the answer?");
		String wantToKnow = myConsole.readLine();
		System.out.println("Do you really really really?");
		String reallyWantToKnow = myConsole.readLine();
		System.out.println("I don't care either way.");
		String soWhat = myConsole.readLine();

		System.out.println("Okay, here you go");
		System.out.println("It's " + theAnswer + " of course!");
	}
}