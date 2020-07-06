
import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        String text1 = text;
        int num = text.length() - 1;
        char charachter;
        String mirror = "";
       
        while (num >= 0) {
            charachter = text.charAt(num);
            mirror += charachter;
            num--;
        }
        if(text1.equals(mirror))
            return true;
        else
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
