
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));
    }

    public static int sum(int[] array) {
        int sum = 0;
        // Write code here
        for (int total : array) {
            sum += total;
        }
        return sum;
    }
}
