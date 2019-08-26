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
        dateCreated = new Date(1, 1, 2001);
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

    void setId(int id) {
        this.id = id;
    }

    void setBalance(int balance) {
        this.balance = balance;
    }

    void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    // end

    void withdraw(int balance) {
        this.balance -= balance;
    }

    void deposit(int balance) {
        this.balance += balance;
    }

}

public class mprac12 {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(200);
        System.out.println("After adding deposit : " + (account.getBalance()));
        account.withdraw(100);
        System.out.println("After withdrawing : " + (account.getBalance()));
        System.out.println("\nID:18DCS129 \nNAME:MADHAV ");
    }
}