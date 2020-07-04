
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int i = 0;
        int num = 0;
        int sum = 0;
        System.out.print("Type a number: ");
        num = reader.nextInt();

        while (i <= num) {
            int math = (int) Math.pow(2, i);
            sum += math;
            i++;
        }
        System.out.println("The result is: " + sum);
    }
}
