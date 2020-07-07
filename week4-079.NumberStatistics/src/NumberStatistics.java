
public class NumberStatistics {

    private int amountOfNumbers;
    private int sumOfNumbers;
   //private double avgOfNumbers;

    public NumberStatistics() {
        amountOfNumbers = 0;
        sumOfNumbers = 0;
        //avgOfNumbers=0;
    }

    public void addNumber(int number) {
        sumOfNumbers += number;
        this.amountOfNumbers++;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sum() {
       return sumOfNumbers;
    }

    public double average() {
        if(amountOfNumbers==0){
          return 0;
        }else
        return (double)sumOfNumbers/amountOfNumbers;
         
    }
}
