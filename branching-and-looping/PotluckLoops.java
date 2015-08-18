public class PotluckLoops {

  public static void main(String[] args) {
    System.out.println("So you'd like to know what to bring to the potluck.");
    String[] guestList = {"Alysia", "Sandy", "Chris", "Aaron", "Smyr"};
    for (String guest : guestList) {
      Integer potluckKey = "N".compareToIgnoreCase(guest);
      String meal = getMeal(potluckKey); // abstracting away the logic behind "getMeal"

      System.out.println(guest + " should bring " + meal + ".");
    }
  }

  public static String getMeal(Integer potluckKey) { //Integer because we're passing in potluckKey, potluckKey names parameter
    if (potluckKey <-5) {
      return "green beans";
    } else if (potluckKey <2) {
      return "pineapple upside down cake";
    } else if (potluckKey <7) {
      return "pineapple upside down cake";
    } else if (potluckKey <10) {
      return "pineapple upside down cake";
    } else if (potluckKey <13) {
      return "ice cream";
    } else {
      return "some Burgerville fries";
    }
  }
}

//return is a contract that says, call me and i'll do this thing.
// return; just exits the program
