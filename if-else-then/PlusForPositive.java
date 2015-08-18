import java.io.Console;

public class PlusForPositive {
  public static void main(String[] args) {
    Console console = System.console();

    //sort of establishes what we'll be doing here

    System.out.println("You're going to tell me a number, and I will either add or subtract from it.");
    String doesntMatter = console.readLine();

    //asks for a number
    System.out.println("Give me a number please.");
    String stringUserNumber = console.readLine();
    Integer userNumber = Integer.parseInt(stringUserNumber);

    //we don't wish to reinforce society's norms. So it's not plus for positive any more. now it's plus for negative.
    if (userNumber <= 0) {
      Integer userNumberPlusOne = userNumber + 1;
      System.out.println("Your new number is " + userNumberPlusOne + ".");
    } else {
      Integer userNumberMinusOne = userNumber - 1;
      System.out.println("Your new number is " + userNumberMinusOne + ".");

    }
  }
}
