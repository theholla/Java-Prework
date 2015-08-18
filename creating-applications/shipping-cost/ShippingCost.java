// it would be nice to make this DRY but I have to move on. Sorry brain and conventions.

import java.io.Console;

public class ShippingCost {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Hello. You would like to hear about shpping costs.");
    System.out.println("I can help you with that.");
    System.out.println("First, please tell me the weight of your package, in pounds.");
    String stringWeight = myConsole.readLine();
    Integer weight = Integer.parseInt(stringWeight);

    System.out.println("Thank you.");
    System.out.println("Now, how many miles will this package need to travel?");
    String stringMiles = myConsole.readLine();
    Integer miles = Integer.parseInt(stringMiles);

    System.out.println("Now, what is your income level on a scale of 1-5, with 5 being the highest income?");
    String stringIncome = myConsole.readLine();
    Integer income = Integer.parseInt(stringIncome);

    Integer cost = (weight / 10) + (miles * 3) * income;

    System.out.println("Your estimated shipping cost is " + cost + " dollars.");
  }
}
