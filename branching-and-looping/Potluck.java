import java.io.Console;

public class Potluck {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("So you'd like to know what to bring to the potluck.");
    String doesntMatter = console.readLine();
    System.out.println("Hey, what's your name?");
    String userName = console.readLine();
    Integer potluckKey = "N".compareToIgnoreCase(userName);
    String meal = getMeal(potluckKey); // abstracting away the logic behind "getMeal"
    System.out.println("You might bring " + meal + ".");
  }

  public static String getMeal(Integer potluckKey) { //Integer because we're passing in potluckKey, potluckKey names parameter
    if (potluckKey <-5) {
      return "green beans";
    } else if (potluckKey <0) {
      return "pineapple upside down cake";
    } else if (potluckKey <10) {
      return "ice cream";
    } else {
      return "some Burgerville fries";
    }
  }
}

//return is a contract that says, call me and i'll do this thing.
// return; just exits the program
