
import java.util.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rohan
 */
public class Grade {

    
    private ArrayList<Integer>scores;
    private int[] grades;
    private int acceptCount;

    public Grade() {
        scores = new ArrayList<Integer>();
        grades = new int[6];
    }
    
    public void addScore(int score){
       scores.add(score);
    }
    
    public void getGrades(){
       for(int score :scores){
          if(score<30){
            grades[0]++;
          }else if(score<35){
             grades[1]++;
             acceptCount++;
          }else if(score<40){
             grades[2]++;
             acceptCount++;
          }else if(score<45){
             grades[3]++;
             acceptCount++;
          }else if(score<50){
             grades[4]++;
             acceptCount++;
          }else if(score<=60){
             grades[5]++;
             acceptCount++;
          }
       }
    }
    
    public void printGradeDistribution(){
        System.out.println("Grade distribution:");
        for(int grade=5;grade>=0;grade--){
            System.out.print(grade+": ");
            printStars(grades[grade]);
            System.out.println();
        }
    }
    
    public void printStars(int count){
       for(int i=0;i<count;i++){
           System.out.print("*");
       }
    }
    
    public double acceptancePercentage(){
      if(scores.size()>0){
         return 100*acceptCount/scores.size();
      }
      return 0;
    }
    
}