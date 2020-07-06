
import java.util.ArrayList;

public class Variance {

    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;

        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int total = sum(list);
        int size = list.size();

        double avg = (double) total / size;

        return avg;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double num = average(list);
        int lastIndex = list.size() - 1;
        double total = 0;
        double diff = 0;
        for (Integer value : list) {
            diff = value - num;
            diff *= diff;
            total += diff;
        }
        double avg = total / lastIndex;
        return avg;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}
