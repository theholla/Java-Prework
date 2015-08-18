import java.io.Console;

public class EvenOdd {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Tell me a number, and I'll count up to your number, but in a fancy way.");
    String stringUserNumber = console.readLine();
    Integer userNumber = Integer.parseInt(stringUserNumber);

    for (Integer countedNumber = 1 ; countedNumber <= userNumber ; countedNumber++) {
      if (countedNumber % 2 == 0) {
        System.out.println("even");
      } else {
        System.out.println("odd");
      }
    }
  }
}
