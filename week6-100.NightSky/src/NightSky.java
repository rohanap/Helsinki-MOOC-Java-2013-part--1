
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rohan
 */
public class NightSky {

    
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density) {
        this(density, 20, 10);
        //this.density = density;
    }

    public NightSky(int width, int height) {

        this(0.1, width, height);
    }

    public NightSky(double density, int width, int height) {
        this.density=density;
        this.width=width;
        this.height=height;
        this.starsInLastPrint=0;
    }

    public void printLine() {
        
        for(int i=0;i<this.width;i++){
          
            Random r = new Random();
            double randNum = r.nextDouble();
            
            if(randNum <=this.density){
                System.out.print("*");
                this.starsInLastPrint++;
                
            }else{
                System.out.println(" ");
            }
        
        }
    }
    
    public void print(){
        this.starsInLastPrint=0;
        for(int height=0;height<this.height;height++){
          this.printLine();
            System.out.println("");
        }
}
    
    public int starsInLastPrint(){
        return this.starsInLastPrint;
    }

}
