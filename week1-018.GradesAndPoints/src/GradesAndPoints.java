
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the points ");
        int point = Integer.parseInt(reader.nextLine());
        
        if(point>=0 && point<=29 ){
            System.out.println("failed");
        }else if(point>=30 && point<=34){
            System.out.println("1");
        }else if(point>=35 &&  point<=39){
            System.out.println("2");
        }else if(point>=40 && point<=44){
            System.out.println("3");
        }else if(point>=45 && point<=49){
             System.out.println("4");
        }else{
            System.out.println("5");
        }
    }
}
