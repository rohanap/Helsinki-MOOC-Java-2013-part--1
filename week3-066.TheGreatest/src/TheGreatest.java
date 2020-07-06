
import java.util.ArrayList;
import java.util.Collections;

public class TheGreatest {

    public static int greatest(ArrayList<Integer> list) {
        // write code here
        /*  Collections.sort(list);
        int num=list.size()-1;
        int max = list.get(num);
        return max;  */

        //OR
        int max = list.get(0);
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);

        System.out.println("The greatest number is: " + greatest(lista));
    }
}
