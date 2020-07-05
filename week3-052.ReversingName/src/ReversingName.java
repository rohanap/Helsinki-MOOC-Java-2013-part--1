import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name;
        System.out.print("Type your name: ");
        name = reader.nextLine();
        int num=name.length()-1;
        String revNAme="";
        while(num>=0){
            revNAme+=name.charAt(num);
            
            num--;
        }
        System.out.println("In reverse order: "+revNAme);
    }
}
