import java.io.Console;

public class ClassGrade {
  public static void main(String[] args) {
    Console console = System.console();

    //asks for their grade
    System.out.println("Hey, what grade did you get in your last class? (A / B / C / D / F)");
    String yourGrade = console.readLine();

    //defines whether a grade was high, medium, or low
    Boolean highGrade = "A".equalsIgnoreCase(yourGrade);
    Boolean medGrade = "B".equalsIgnoreCase(yourGrade) || "C".equalsIgnoreCase(yourGrade);
    Boolean lowGrade = "D".equalsIgnoreCase(yourGrade) || "F".equalsIgnoreCase(yourGrade);

    //asks for their level of effort
    System.out.println("Did you try very hard? (yes / no)");
    String didYouTry = console.readLine();

    //defines whether they tried hard
    Boolean tried = "yes".equalsIgnoreCase(didYouTry);
    Boolean didntTry = "no".equalsIgnoreCase(didYouTry);

    if ((highGrade || medGrade) && tried) {
      System.out.println("You worked hard and accomplished something. You must be proud!");
    } else if (lowGrade && tried) {
      System.out.println("You put in lots of effort. Let's study together and help you learn even more.");
    } else if (highGrade && didntTry) {
      System.out.println("Maybe this class is too easy for you. Why don't you challenge yourself and take another class?");
    } else if ((lowGrade || medGrade) && didntTry) {
      System.out.println("Is there a crisis going on in your life? (yes / no)");
      String isThereACrisis = console.readLine();

      // defines whether there is a crisis or not
      Boolean isCrisis = "yes".equalsIgnoreCase(isThereACrisis);

        if (isCrisis) {
          System.out.println("Life is rough sometimes. Maybe we can talk about it.");
        } else {
          System.out.println("If this is important, please try harder! You can do it!");
        }
    }
  }
}
