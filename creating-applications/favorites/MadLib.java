import java.io.Console;

public class MadLib {
	public static void main(String[] args) {
		Console myConsole = System.console();

		System.out.println("Give me the name of a person");
		String Person = myConsole.readLine();
		System.out.println("Give me a plural noun");
		String PluralNoun = myConsole.readLine();
		System.out.println("Give me a verb");
		String Verb = myConsole.readLine();
		System.out.println("Give me some good life advice");
		String Advice = myConsole.readLine();
		System.out.println("HERE'S YOUR DAMN SONGGGG11!!!!!!");
		System.out.println("Never mind, I'll find someone like " + Person + ".");
		System.out.println("I wish nothing but the " + PluralNoun + " for you too.");
		System.out.println("Don't " + Verb + " me, I beg,");
		System.out.println("I'll remember you said, '" + Advice + "!!!'");
	}
}