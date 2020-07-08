
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);

        ArrayList<Student> list = new ArrayList<Student>();

        String name, snum;

        while (true) {
            System.out.print("name: ");
            name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            } else {
                //System.out.print("name: ");
                //name = reader.nextLine();

                System.out.print("studentnumber: ");
                snum = reader.nextLine();

                list.add(new Student(name, snum));
            }
        }

        for (Object lists : list) {
            System.out.println(lists);
        }

        System.out.println("");

        System.out.print("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result: ");

        for(Student lists: list){
          
            /*String searchname = lists.getName();
            if(searchname.contains(search)){
                  System.out.println(list);
            }*/
            
            if(lists.getName().contains(search)){
                System.out.println(lists);
            }
        }
    }

}
