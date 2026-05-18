abstract class Account {

    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited Amount: " + amount);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn Amount: " + amount);
    }

    abstract void calculateInterest();
}

class SavingAccount extends Account {

    SavingAccount(double balance) {
        super(balance);
    }

    void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Saving Account Interest: " + interest);
    }
}

class CurrentAccount extends Account {

    CurrentAccount(double balance) {
        super(balance);
    }

    void calculateInterest() {
        double interest = balance * 0.02;
        System.out.println("Current Account Interest: " + interest);
    }
}

public class project01 {

    public static void main(String[] args) {

        SavingAccount s = new SavingAccount(10000);
        s.deposit(2000);
        s.calculateInterest();

        CurrentAccount c = new CurrentAccount(15000);
        c.withdraw(3000);
        c.calculateInterest();
    }
}