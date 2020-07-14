
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner scanner = new Scanner(System.in);
        Grade grade = new Grade();

        // Get scores from input
        System.out.println("Type exam scores, -1 completes:");
        int score;
        while (true) {
            score = scanner.nextInt();
            if (score == -1) {
                break;
            }
            if (score >= 0 && score <= 60) {
                grade.addScore(score);
            }
        }

        // Calculate grade distribution
        grade.getGrades();

        // Print grade distribution
        grade.printGradeDistribution();

        // Print acceptance percentage
        System.out.println("Acceptance percentage: " + grade.acceptancePercentage());

    }
}
