import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String input;
        int num;
        String output;
        int a;
        System.out.print("Type a word: ");
        input = reader.nextLine();
        
        System.out.print("Length of the end part: ");
        num= reader.nextInt();
        
        a=input.length();
        output=input.substring(a-num);
        System.out.println("Result: "+output);
    }
}
