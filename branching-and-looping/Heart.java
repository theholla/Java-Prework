public class Heart {
  public static void main(String[] args) {
    printHeart();
  }
  public static String getHeart() { //give me a heart back
    return "<3";
  }
  public static void printHeart() { //go off and print a heart, you don't need to tell me about it, i trust that you're doing it
    System.out.println(getHeart()); //make sure to call a method, not a variable or object, that's why the ()
  } 
}
