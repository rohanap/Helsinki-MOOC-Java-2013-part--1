
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        
        System.out.print("Type a number: ");
        int num1 = reader.nextInt();
        System.out.print("Type another number: ");
        int num2 = reader.nextInt();
        
        int maxNumber=Math.max(num1, num2);
        
        System.out.println("The bigger number of the two numbers given was: "+maxNumber);
    }
}
