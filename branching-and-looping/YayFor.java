//this uses a for each loop

public class YayFor {
  public static void main(String[] args) {
    System.out.println("Reasons I'm excited:");
    String[] yayFor = {"The Play Festival", "More hammock time", "Getting better at abstraction", "Commuting over the river"};
    for (String reasonImExcited : yayFor) {
      System.out.println(reasonImExcited.toUpperCase() + "!");
    }
  }
}
