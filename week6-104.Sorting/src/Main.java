
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here

        //int[] values = {6, 5, 8, 7, 11};
        //System.out.println("smallest: " + smallest(values));
        //System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
        //System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        //System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        //System.out.println(indexOfTheSmallestStartingFrom(values, 4));
        // int[] values = {3, 2, 5, 4, 8};
        //System.out.println(Arrays.toString(values));
        // swap(values, 1, 0);
        //System.out.println(Arrays.toString(values));
        // swap(values, 0, 3);
        // System.out.println(Arrays.toString(values));
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] arrays) {
        int min;
        int length;
        length = arrays.length - 1;
        min = arrays[0];

        while (length >= 0) {

            if (arrays[length] < min) {
                min = arrays[length];
            }
            length--;
        }

        return min;
    }

    public static int indexOfTheSmallest(int[] array) {

        int index;
        int smallIndex;
        index = array.length - 1;
        smallIndex = array[0];
        int smallest = 0;
        while (index >= 0) {
            if (array[index] < smallIndex) {
                smallIndex = array[index];
                smallest = index;
            }
            index--;

        }
        return smallest;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {

        int startFrom = index;
        int length = array.length - 1;
        int min = array[length];
        int small = 0;

        while (index <= length) {
            if ((array[index] < min) || (array[index] == min)) {
                min = array[index];
                small = index;
            }
            index++;
        }
        return small;
    }

    public static void swap(int[] array, int index1, int index2) {

        int[] a = array;
        int first = a[index1];
        int second = a[index2];
        a[index2] = first;
        a[index1] = second;

    }

    public static void printall(int[] array){
        System.out.print("[");
        for(int i=0;i<array.length;i++){
             System.out.print("" +array[i]);
             
             if(i==array.length-1){
                 System.out.print("]");
                 System.out.println();
             }else{
                 System.out.print(", ");
             }
        }
    }
    
    
    public static void sort(int[] array) {
        printall(array);

        for (int i = 0; i < array.length; i++) {
              int index = indexOfTheSmallestStartingFrom(array, i);
              swap(array, i, index);
              
              printall(array);
        }

    }
    
    
    

}
