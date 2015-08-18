import java.io.Console;

public class LegalOrNot {
  public static void main(String[] args) {
    Console console = System.console();

    // establishes what the heck we're doing here
    System.out.println("So you'd like to know if you can drink or not.");
    String doesntMatter = console.readLine();

    // asks age
    System.out.println("How old are you, sweetpea?");
    String stringUserAge = console.readLine();
    Integer userAge = Integer.parseInt(stringUserAge);

    //asks if the user is from the states or not
    System.out.println("Are you from the United States? Type 1 for yes, 0 for no.");
    String stringAreYouFromHere = console.readLine();
    Integer areYouFromHere = Integer.parseInt(stringAreYouFromHere);

    if (areYouFromHere == 1) {
          //boozy options for those of us in the sweet us of a
          if (userAge < 21) {
            System.out.println("Sorry pumpkin, try heading south of the border.");
          } else if (userAge == 21) {
            System.out.println("Happy birthday! Here, I'll fetch you a shot of tequila.");
          } else if (userAge < 30) {
            System.out.println("Here's some craft beer aged in the belly of a petrified wooly mammoth. Can you taste the hint of chocolate?");
          } else if (userAge < 40) {
            System.out.println("Have a glass of wine.");
          } else {
            System.out.println("Here's some whiskey and a gatorade for later.");
          }
    } else {
          // boozy options for people outside of the states
          System.out.println("Yeah sure, you can probably drink.");
        }
  }
}


//didn't want to use == but .equals and === wouldn't work..
//why doesn't this work?? ...else if (userAge.equals("21")) {...}
