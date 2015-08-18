import java.io.Console;

public class Encrypt {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Tell me a secret");
    String yourSecret = myConsole.readLine();
    System.out.println("Here it is, but this time, encrypted!");
    String yourEncryptedSecret = yourSecret.replaceAll("e", "x").
    replaceAll("a", "r").replaceAll("i", "fuck").replaceAll("u", "th").replaceAll("o", "u");
    System.out.println(yourEncryptedSecret);
  }
}
