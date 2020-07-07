
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.numbers = new ArrayList<Integer>();
        this.random = new Random();
        this.drawNumbers();

    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        this.numbers.clear();
        int count = 0;
        int randomNumber = 0;
        while (count < 7) {
           randomNumber= this.random.nextInt(39)+1;
           
           if(!this.containsNumber(randomNumber)){
                  this.numbers.add(randomNumber);
                  count++;
           }
           
           
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if(!this.numbers.contains(number))
            return false;
        else
        return true;
    }
}
