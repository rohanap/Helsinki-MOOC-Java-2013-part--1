
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int startNum = 0;
        int number = 0;
        int sum = 0;
        System.out.print("Until what? ");
        number = reader.nextInt();

        while (startNum <= number) {
            sum += startNum;
            startNum++;
        }
        System.out.println("Sum is " + sum);
    }
}
