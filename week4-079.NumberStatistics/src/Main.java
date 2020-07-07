
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        NumberStatistics sum = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        System.out.println("Type numbers: ");
        int inputNumbers;

        while (true) {
            inputNumbers = reader.nextInt();
            if (inputNumbers < 0) {
                break;
            } else {
                sum.addNumber(inputNumbers);
            }
            if (inputNumbers % 2 == 0) {
                even.addNumber(inputNumbers);
            } else {
                odd.addNumber(inputNumbers);
            }
        }

        System.out.println("sum: " + sum.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());

    }
}
