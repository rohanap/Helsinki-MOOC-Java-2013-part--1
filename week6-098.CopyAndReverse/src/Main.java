
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here

        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {

        int[] copyOfArrays = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copyOfArrays[i] = array[i];
        }
        return copyOfArrays;
    }

    public static int[] reverseCopy(int[] array) {

        int size = array.length-1;
        int[] reverse = new int[array.length];

        for(int copy:array){
          reverse[size]=copy;
          size--;
        }
        return reverse;
    }

}
