import java.io.Console;

public class DivideIt {
	public static void main(String[] args) {
		Console myConsole = System.console();

		//DIVIDE IT BABY

		System.out.println("So you want to do some division, do you?");
		String wantToKnow = myConsole.readLine();

		System.out.println("What's the number, honey?");
		String stringNumber = myConsole.readLine();
		Integer yourNumber = Integer.parseInt(stringNumber);

		System.out.println("And the next number? Tell me that one.");
		String stringNumber2 = myConsole.readLine();
		Integer yourNumber2 = Integer.parseInt(stringNumber2);

		Integer theAnswer = yourNumber / yourNumber2;

		System.out.println("Want to know what it is that it is?");
		String youSaid = myConsole.readLine();
		System.out.println("Interesting.");
		String youAlsoSaid = myConsole.readLine();

		System.out.println("Okay, I'll tell you. It's " + theAnswer + ".");
	}
}
