import java.io.Console;

public class FavoriteColor {
	public static void main(String[] args) {
		Console myConsole = System.console();

		System.out.println("What is your favorite color?");
		String FavoriteColor = myConsole.readLine();
		System.out.println("Your favorite color is " + FavoriteColor + "? That's mine too!");
	}
}