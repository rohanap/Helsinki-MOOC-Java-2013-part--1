
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rohan
 */
public class Database {
    
    private ArrayList<Bird>lists;
   

    public Database() {
       lists=new ArrayList<Bird>();
    }
    

    public void add(String name,String lname){
        Bird b = new Bird(name, lname);
        lists.add(b);
    }
    
    public void addObservant(String name){
       for(Bird b : lists){
        if(b.getName().equals(name)){
              b.obeservantcounter();
              return;
       }
       }
        System.out.println("It is not found");
    }
    
    public void printBird(String name){
       for(Bird b : lists){
          if(b.getName().equals(name)){
              System.out.println(b);
              return;
          }
       }
        System.out.println("It is not found");
    }
    
    public void show(){
        for(Bird b : lists){
            System.out.println(b);
        }
    }
    
    
}
        
