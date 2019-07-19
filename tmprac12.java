import java.util.*;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    // default constructor
    Account() {
        id = 0;
        balance = 500;
        annualInterestRate = 7.0;
        dateCreated = new Date();
        System.out.println("default values are set");
    }

    // parameterized constructor
    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    // getters and setters

    int getId() {
        return this.id;
    }

    double getBalance() {
        return this.balance;
    }

    double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    Date getDateCreated() {
        return this.dateCreated;
    }

    double getMonthlyInterest() {
        return this.annualInterestRate / 12 / 100;
    }

    double getMonthlyInterestRate() {
        return this.annualInterestRate / 12;
    }

    void setId(int id) {
        this.id = id;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    // end

    void withdraw(double balance) {
        this.balance -= balance;
    }

    void deposit(double balance) {
        this.balance += balance;
    }

}

public class mprac12 {
    public static void main(String[] args) {
        // default values will be set
        Account account = new Account();
        System.out.println("Initial Balance : " + account.getBalance());
        System.out.println("Interest Rate : " + account.getMonthlyInterestRate());
        System.out.println("Inerest : " + account.getMonthlyInterest());
        // depositing Rs.1000
        account.deposit(1000);
        System.out.println("New Balance : " + account.getBalance());
        // withdrawing Rs.100
        account.withdraw(100);
        System.out.println("After withdrawing : " + account.getBalance());
        System.out.println("Date created : " + account.getDateCreated());

    }
}