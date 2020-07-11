
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differneceInYears(MyDate compared) {
        int totalDay1 = this.day+(this.month*30)+(this.year*364);
        int totalDay2 = compared.day+(compared.month*30)+(compared.year*364);
        
        
        int diff = 0;
        
        if(totalDay1==totalDay2){
         return 0;
        }else if(totalDay1>totalDay2){
          diff = totalDay1-totalDay2;
        }else{
            diff=totalDay2-totalDay1;
        }
        return diff /364;
    }

  
}
