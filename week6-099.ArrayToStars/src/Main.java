
import java.util.Collections;


public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        // write code here
int a=0;
        for(int copy : array){
          a=copy;
          for(int i=0;i<a;i++){
              System.out.print("*");
          }
            System.out.println(" ");
        }
          
        
              
    }
}
