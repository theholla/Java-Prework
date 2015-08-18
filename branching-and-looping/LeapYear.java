//this uses a for method (not for each)

import java.io.Console;

public class LeapYear {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("What year were you born?");
    String stringBirthYear = console.readLine();
    Integer birthYear = Integer.parseInt(stringBirthYear);

    System.out.println("You have been alive during the following leap years:");

    for (Integer year = birthYear ; year <= 2015 ; year++) {
      if (year % 4 == 0) {
        System.out.println(year);
      }
    }
  }
}
