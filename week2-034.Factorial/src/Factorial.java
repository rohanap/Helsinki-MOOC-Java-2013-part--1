
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        /*int start = 1;
        int num = 0;
        int fact = 0;
        System.out.print("Type a number: ");
        num = reader.nextInt();
        start = num - start;

        while (start >0) {
            num*=start;
            start--;
        }
        System.out.println(num);
         */
        int start = 1;
        int fact = 1;
        System.out.print("Type a number: ");
        int num = reader.nextInt();

        while (start <= num) {
            if (num == 0) {
                break;
            }
            fact *= start;
            start++;
        }
        System.out.println("Factorial is "+fact);
    }
}
