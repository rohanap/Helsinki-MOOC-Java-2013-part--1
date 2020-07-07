/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rohan
 */
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public void payEconomical() {
        if (this.balance >= 2.5) {
            this.balance -= 2.50;
        }
    }

    public void payGourmet() {
        if (this.balance >= 4) {
            this.balance -= 4.00;
        }
    }

    public void loadMoney(double amount) {
        // write code here
        if (amount > 0) {
            if (balance + amount > 150) {
                balance = 150;

            } else {
                balance += amount;
            }
        }
    }

    public String toString() {
        return "The card has " + balance + " euros";
    }
}
