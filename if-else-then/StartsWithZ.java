import java.io.Console;

public class StartsWithZ {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("What's your name?");
    String userName = myConsole.readLine();

    //using the .startsWith method and passing in the variable Z
    //if this boolean method returns true we will run the if statement code
    if (userName.startsWith("Z")) {
      System.out.println("Your name starts with Z! :)");
    } else { //if it's false we'll run the code after else
      System.out.println("Your name doesn't start with Z. :(");
    }
  }
}
