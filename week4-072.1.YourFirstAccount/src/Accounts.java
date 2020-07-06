
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        
        Account harryAcoount = new Account("Harry A/C", 100.00);
        //Account mattAcoount = new Account("", 0)
        
        
        System.out.println("Initial State");
        harryAcoount.deposit(20.00);
        System.out.println(harryAcoount);
    }

}
