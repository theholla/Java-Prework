import java.io.Console;
public class PingPong {
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("Give me a number, and I'll count up to that number, but in a fancy way.");
    String stringUserNumer = console.readLine();
    Integer userNumber = Integer.parseInt(stringUserNumer);

    for (Integer number = 1 ; number <= userNumber ; number++) {
      if (number % 3 == 0 && number % 5 == 0) {
        System.out.println("ping-pong");
      } else if (number % 3 == 0) {
        System.out.println("ping");
      } else if (number % 5 == 0) {
        System.out.println("pong");
      } else {
        System.out.println(number);
      }
    }
  }
}
