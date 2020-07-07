
import java.util.Random;

public class PasswordRandomizer {

    // Define the variables
    private Random random = new Random();
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;

    }

    public String createPassword() {
        // write code that returns a randomized password
        /*String name = "";
        int nxtRandom = 0;
        int i = 0;
        while (i < this.length) {
            nxtRandom = random.nextInt(25);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(nxtRandom);
            name += symbol;
            i++;
        }
        return name;*/
        
        String password= "";
        for(int i=0;i<length;i++){
          password += (char)(random.nextInt(26)+'a'); //ASCI 
        }
        return password;
    }
}
