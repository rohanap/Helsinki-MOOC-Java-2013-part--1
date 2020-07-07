
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    
    public void addMeal(String meal){
        if(!this.meals.contains(meal)){
             this.meals.add(meal);
        }
    }
    
    public void printMeals(){
       for(String name : this.meals){
                System.out.println(name);
       }
    }
    
    public void clearMenu(){
      meals.clear();
    }
    // add the methods here
}
