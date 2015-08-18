import java.io.Console;

public class TwoDigits {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Tell me a number, I'll tell you if it has two digits.");
    String stringUserNumer = console.readLine();
    Integer userNumber = Integer.parseInt(stringUserNumer);

    if (userNumber <= -100) {
      System.out.println("Your number has three or more digits. Womp womp.");
    } else if (userNumber <= -10) {
      System.out.println("Congratulations! Your number has two digits!");
    } else if (userNumber <= 9) {
      System.out.println("Boooo!!! This number has only one digit.");
    } else if (userNumber <= 99) {
      System.out.println("Congratulations! Your number has two digits!");
    } else {
      System.out.println("Not two digits. Not interested.");
    }

  }
}
// I wanted to use the .length method instead but couldn't figure it out
// if (userNumber.length("2")) {System.out.println("Your number has two digits.");} else {System.out.println("Your number doesn't have two digits.");}
