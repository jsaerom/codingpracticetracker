import java.io.Console;

public class CPT {
  public static void main(String[] args) {


    askHowManyHoursStudy("Sunday");

    askHowManyHoursStudy("Monday");

    askHowManyHoursStudy("Tuesday");
  }

  public static void askHowManyHoursStudy(String day) {
    Console myConsole = System.console();
    System.out.println("How many hours did you spend studying on " + day + "?");
    Integer hoursSpent = Integer.parseInt(myConsole.readLine());
    System.out.println("You spent " + hoursSpent + " hours on " + day + ".");
  }
}
