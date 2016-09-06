import java.io.Console;

public class CPT {
  public static void main(String[] args) {

    Integer totalHours = 0;
    Integer sundayHours = askHowManyHoursStudy("Sunday");
    totalHours += sundayHours;
    Integer mondayHours = askHowManyHoursStudy("Monday");
    totalHours += mondayHours;
    Integer tuesdayHours = askHowManyHoursStudy("Tuesday");
    totalHours += tuesdayHours;


    if (totalHours > 5) {
      System.out.println("Wow you're a rockstar");
    } else {
      System.out.println("You should work harder");
    }
  }

  public static int askHowManyHoursStudy(String day) {
    Console myConsole = System.console();
    System.out.println("How many hours did you spend studying on " + day + "?");
    String stringHoursSpent = myConsole.readLine();
    Integer hoursSpent = Integer.parseInt(stringHoursSpent);
    return hoursSpent;
  }

}
