
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
public class Library {

    private ArrayList<Book> book;

    public Library() {
        this.book = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.book.add(newBook);
    }

    public void printBooks() {
        for (Book b : book) {
            System.out.println(b);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {

        ArrayList<Book> found = new ArrayList<Book>();

        for (Book search : book) {

            /*if (search.title().contains(title)) {
                found.add(search);
            }*/
            if (StringUtils.included(search.title(), title)) {
                found.add(search);
            }
        }

        return found;

    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book searchByPub : book) {
            /*if (searchByPub.publisher().contains(publisher)) {
                found.add(searchByPub);
            }*/
            if (StringUtils.included(searchByPub.publisher(), publisher)) {
                found.add(searchByPub);

            }
        }
            return found;
        }
        
    
    
    

    

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book searchByYear : book) {
            if (searchByYear.year() == year) {
                found.add(searchByYear);
            }
        }
        return found;

    }

}
