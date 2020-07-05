
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList

        ArrayList<String> words = new ArrayList<String>();

        String name;

        while (true) {
            System.out.print("Type a word: ");
            name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            } else {
                words.add(name);
            }
        }
        Collections.sort(words);

        for (String output : words) {
            System.out.println(output);
        }
    }
}
