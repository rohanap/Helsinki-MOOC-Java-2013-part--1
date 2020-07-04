
import java.util.Scanner;

public class TheSumBetweenTwoNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int staringPoint = 0;
        int endingPoint = 0;
        int sum = 0;
        System.out.print("First: ");
        staringPoint = reader.nextInt();
        System.out.print("Last: ");
        endingPoint = reader.nextInt();

        while (staringPoint <= endingPoint) {
            sum += staringPoint;
            staringPoint++;
        }
        System.out.println("The sum is: " + sum);

    }
}
