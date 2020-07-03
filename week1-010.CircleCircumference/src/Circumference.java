
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
      
        System.out.print("Type the radius: ");
        int radius = reader.nextInt();
        
        double num = 2 * Math.PI *radius;
        
        System.out.println("Circumference of the circle: "+num);
        // Program your solution here 
    }
}
