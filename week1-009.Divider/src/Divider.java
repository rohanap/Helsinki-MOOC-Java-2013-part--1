
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int num1 = reader.nextInt();
        
        System.out.print("Type another number: ");
        int num2 = reader.nextInt();
        
        double result = (double)num1/num2;
        System.out.println("Division: "+num1+" / "+num2+" = "+result);
        // Implement your program here. Remember to ask the input from user.
    }
}
