
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        
        System.out.print("Type your name: ");
        String nameFirstPerson = reader.nextLine();
        
        System.out.print("Type your age: ");
        int ageOfFirstPerson = Integer.parseInt(reader.nextLine());
        
        
        System.out.print("Type your name: ");
        String nameSecoundPerson = reader.nextLine();
        
        System.out.print("Type your age: ");
        int ageOfSecoundPerson = Integer.parseInt(reader.nextLine());
        
        int ageOfBothPerson = ageOfFirstPerson+ageOfSecoundPerson;
        
        System.out.println(nameFirstPerson+" and "+nameSecoundPerson+" are "+ageOfBothPerson+" years old in total.");
        
    }
}
