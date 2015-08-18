import java.io.Console;

public class MealTime {
  public static void main(String[] args) {
    whatDidYouEatForEachMeal("breakfast");
    whatDidYouEatForEachMeal("lunch");
    whatDidYouEatForEachMeal("dinner");
  }

  public static void whatDidYouEatForEachMeal(String meal) {
    Console myConsole = System.console();

    System.out.println("What did you eat for " + meal + "?");
    String yourMeal = myConsole.readLine();
    System.out.println("You ate " + yourMeal + " for " + meal + " .");

  }
}
