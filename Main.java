import java.util.Scanner;
/**
 * finds the largest integer out of the three given
 * @Chad 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner for user input
    Scanner input = new Scanner(System.in);

    //asks user for the letter grade they got
    System.out.println("Please enter a letter grade");
    String grade = input.nextLine();
    switch (grade){
      case "A":
        System.out.println("This is between 80% and 100%");
        break;
      case "B":
        System.out.println("This is between 70% and 79%");
        break;
      case "C":
        System.out.println("This is between 60% and 69%");
      case "D":
        System.out.println("This is between 50% and 59%");
      case "F": 
        System.out.println("This is between 0% and 49%");
    }
  }
}

