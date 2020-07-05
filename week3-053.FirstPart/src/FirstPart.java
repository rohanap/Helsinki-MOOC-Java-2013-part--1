
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input;
        int number;
        System.out.print("Type a word: ");
        input = reader.nextLine();
        System.out.print("Length of the first part: ");
        number = reader.nextInt();

        String a;

        a = input.substring(0, number);

        System.out.println("Result: " + a);
    }
}
