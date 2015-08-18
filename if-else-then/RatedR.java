import java.io.Console;

public class RatedR {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("How old are you?");
    String stringUserAge = myConsole.readLine();
    Integer userAge = Integer.parseInt(stringUserAge);

    //use our bolean in an if statement
    //if boolean returns true, runs the code in the if statement
    if (userAge >= 17) {
      System.out.println("You can see the movie.");
    }
    //if it returns false, runs the code in the else statement
      else {
      System.out.println("Sorry, we're closed. No movies for you.");
    }
  }
}
