public class FavoriteFoods {
  public static void main(String[] args) {
    String[] favoriteFoods = {"dark chocolate", "ice cream", "pizza",
                            "fish tacos", "beans and eggs", "pesto", "peanut butter
                            milkshakes", "beer shakes", "almonds", "pie"};
    for (Integer foodItem = 0 ; foodItem < 5 ; foodItem++) {
      System.out.println("I am eating " + favoriteFoods[foodItem] + ".");
    }
    System.out.println("I am full.");
  }
}
