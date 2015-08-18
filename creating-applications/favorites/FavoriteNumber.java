import java.io.Console;

public class FavoriteNumber {
	public static void main(String[] args) {
		Console myConsole = System.console();

		System.out.println("What is your favorite number?");
		String FavoriteNumber = myConsole.readLine();
		System.out.println("Really? Your favorite number is " + FavoriteNumber + "? Me too!");
	}
}