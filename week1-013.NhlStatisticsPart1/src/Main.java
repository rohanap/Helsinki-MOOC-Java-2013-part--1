
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("top ten players based on goals");
        //NHLStatistics.sortByPoints();
        //NHLStatistics.top(10);
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        //System.out.println("top 25 players based on penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        
        //System.out.println("Print the statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
       // NHLStatistics.teamStatistics("Sidney Crosby");
       
        //System.out.println("Print the statistics for Philadelphia Flyers");
        //NHLStatistics.sortByAssists();
        NHLStatistics.teamStatistics("PHI");
       
        //System.out.println("Print the players in Anaheim Ducks");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
