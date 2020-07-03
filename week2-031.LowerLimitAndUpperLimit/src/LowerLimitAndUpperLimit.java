
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        int startNumber = 0;
        int lastNumber = 0;

        System.out.print("First: ");
        startNumber = reader.nextInt();
        System.out.print("Last: ");
        lastNumber = reader.nextInt();
        while (startNumber <= lastNumber) {
               System.out.println(startNumber);
               startNumber++;
        }

    }
}
