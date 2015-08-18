import java.io.Console;

public class WhatToWear {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("What's the temperature where you are?");
    String stringTemperature = console.readLine();
    Integer temperature = Integer.parseInt(stringTemperature);

    if (temperature <23) {
      System.out.println("It would be a very good idea to move. Your environment is not hospitable.");
    } else if (temperature >=23 && temperature <43) {
      System.out.println("It's damn cold. You should wear gloves and multiple pants.");
    } else if (temperature >=43 && temperature <53) {
      System.out.println("Sounds like sweater weather. Lucky you!");
    } else if (temperature >=53 && temperature <69) {
      System.out.println("Wear pants!");
    } else if (temperature <93) {
      System.out.println("Wear shorts!");
    } else {
      System.out.println("Our system highly recommends taking off your clothes and jumping into a river.");
    }
  }
}
