
import java.util.Scanner;

public class Main {    
    
    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner scanner = new Scanner(System.in);
        Database db = new Database();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Quit")) {
                break;
            } else if (input.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Latin Name: ");
                String lname = scanner.nextLine();
                db.add(name, lname);
            } else if (input.equals("Observation")) {
                System.out.print("What was observed:? ");
                String name = scanner.nextLine();
                db.addObservant(name);
            } else if (input.equals("Show")) {
                System.out.print("What? ");
                String name = scanner.nextLine();
                db.printBird(name);
            } else if (input.equals("Statistics")) {
                db.show();
            }
            
        }
    }
    
}
