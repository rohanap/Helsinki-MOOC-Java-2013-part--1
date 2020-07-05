
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        
        int counter=1;
        int num=0;
        
        while(num<name.length()){
            
            System.out.println(counter+"."+" character: "+name.charAt(num));
            num++;
            counter++;
        }
    }
}
