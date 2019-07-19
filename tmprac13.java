import java.util.*;

class Account {
    private String id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    // default constructor
    Account() {
        id = "";
        balance = 300.0;
        annualInterestRate = 7.0;
        dateCreated = new Date();
        // System.out.println("default values are set");
    }

    // parameterized constructor
    Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    // getters and setters

    String getId() {
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

    void setId(String id) {
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

/**
 * mprac13
 */
public class mprac13 {

    // checking id if it's valid or not
    static boolean checkId(String id) {
        if ((id.charAt(3) == '1' && id.charAt(4) == '0') || (id.charAt(3) == '0' && id.charAt(4) <= '9')) {
            return true;
        } else {
            return false;
        }
    }

    // returns account number from string
    static int returnNum(String tempStr) {
        return Integer.parseInt(Character.toString(tempStr.charAt(3))) * 10
                + Integer.parseInt(Character.toString(tempStr.charAt(4)));
    }

    public static void main(String[] args) {

        Account[] accountArray = new Account[10];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            accountArray[i] = new Account();
        }

        for (int i = 0; i < 10; i++) {
            if ((i + 1) >= 10) {
                accountArray[i].setId("AC0" + (i + 1));

            } else
                accountArray[i].setId("AC00" + (i + 1));
        }

        System.out.println("Enter an id to check if it's valid or not :");
        String tempStr = scan.nextLine();

        if (checkId(tempStr)) {

            // just extracting accountNo :)
            int accountNo = returnNum(tempStr);
            System.out.println(accountNo);
            do {
                System.out.println("Menu");

                System.out.println(
                        "1. Balance inquiry\n2. Withdraw money\n3. Deposit money\n4. Money Transfer\n5. Create Account\n6. Deactivate Account\n7. Exit");
                System.out.println("Enter an option:");
                int option = scan.nextInt();

                switch (option) {
                case 1:
                    System.out.println("Your balance is : " + accountArray[accountNo].getBalance());
                    break;
                case 2:
                    System.out.println("Enter money to withdraw : ");
                    double withdrawMoney = scan.nextDouble();
                    accountArray[accountNo].withdraw(withdrawMoney);
                    break;

                case 3:
                    System.out.println("Enter money to deposit : ");
                    double depositMoney = scan.nextDouble();
                    accountArray[accountNo].deposit(depositMoney);
                    break;
                case 4:
                    System.out.println("Enter accountNo to deposit money to : ");
                    String tempAC = scan.nextLine();
                    if (checkId(returnNum(tempAC))) {

                    }

                    break;
                case 5:
                    System.out.println("yet to be implemented");
                    break;
                case 6:
                    System.out.println("yet to be implemented");
                    break;
                case 7:

                    break;

                default:

                }
            } while (true);
        }
    }
}