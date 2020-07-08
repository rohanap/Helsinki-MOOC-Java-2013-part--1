
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        double economicalLunchPrice = 2.50;

        if (cashGiven >= economicalLunchPrice) {
            cashInRegister += economicalLunchPrice;
            economicalSold++;
            return cashGiven - economicalLunchPrice;
        } else {
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        double gourmetLunchPrice = 4.00;
        if (cashGiven >= gourmetLunchPrice) {
            cashInRegister += gourmetLunchPrice;
            gourmetSold++;
            return cashGiven - gourmetLunchPrice;
        } else {

            return cashGiven;
        }
    }

    public boolean payEconomical(LyyraCard card) {
        double economicalLunchPrice = 2.50;

        if (card.balance() >= economicalLunchPrice) {
            card.pay(economicalLunchPrice);
            economicalSold++;
            return true;
        } else {
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        double gourmetLunchPrice = 4.00;
        if (card.balance() >= gourmetLunchPrice) {
            card.pay(gourmetLunchPrice);
            gourmetSold++;
            return true;
        } else {
            return false;
        }

    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
