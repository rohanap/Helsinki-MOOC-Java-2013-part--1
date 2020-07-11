
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {

        Money m = new Money(this.euros() + added.euros(), this.cents() + added.cents());
        return m;

    }

    public boolean less(Money compared) {
        if (this.euros() < compared.euros()) {
            return true;
        } else if (this.euros() == compared.euros && this.cents() < compared.cents()) {

            return true;
        } else {
            return false;
        }
    }
    
    public Money minus(Money decremented){
       
       int euro= this.euros()-decremented.euros();
       int cent = this.cents()-decremented.cents();
      
       
       if(euro< 0 && cent<0){
         euro=0;
         cent=0;
       }else if(euro<0){
          euro=0;
          cent=0;
       }else if(cent<0){
           cent=100+cent;
           euro-=1;
       }
       
       Money m = new Money(euro, cent);
       
        return m;

    
    }
}
