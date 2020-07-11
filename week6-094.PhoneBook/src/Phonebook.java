
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rohan
 */
public class Phonebook {

    private ArrayList<Person> phone;

    public Phonebook() {
        this.phone = new ArrayList<Person>();
    }

    public void add(String name, String number) {

        Person p = new Person(name, number);

        this.phone.add(p);

    }

    public void printAll() {
        for (Object p : phone) {
            System.out.println(p);
        }
    }

    public String searchNumber(String name) {

        for (Person search : phone) {
            if (search.getName().equals(name)) {
                return search.getNumber();
            }
        }
        return "number not known";
    }
}
