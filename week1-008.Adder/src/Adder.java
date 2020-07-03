
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         
        System.out.print("Tpe a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int num2 = reader.nextInt();
        
        int result = num1+num2;
        System.out.println("Sum of the numbers: "+result);
        // Implement your program here. Remember to ask the input from user
    }
}
