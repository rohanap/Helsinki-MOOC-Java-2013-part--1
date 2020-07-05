
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String firstWord;
        String lastWord;
        int output;
        
        System.out.print("Type the first word: ");
        firstWord = reader.nextLine();
        
        System.out.print("Type the secound word: ");
        lastWord = reader.nextLine();
        
        
        
        output = firstWord.indexOf(lastWord);
        
        if(output!=-1){
        System.out.println("The word '"+lastWord+"' is found in the word '"+firstWord+"'.");
        }else{
            System.out.println("The word '"+lastWord+"' is not found in the word '"+firstWord+"'.");
        }
        }
}
