
public class Accounts {

    public static void transfer(Account from, Account to, double howMuch) {

        from.withdrawal(howMuch);
        to.deposit(howMuch);

    }

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here

        Account personA = new Account("A", 100.0);
        Account personB = new Account("B", 0.0);
        Account personC = new Account("C", 0.0);

        transfer(personA, personB, 50.0);
        transfer(personB, personC, 25.0);

        System.out.println(personA);
        System.out.println(personB);
        System.out.println(personC);

    }

}
