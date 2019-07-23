package sample;
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


    Date getDateCreated() {
        return this.dateCreated;
    }

    void setId(String id) {
        this.id = id;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    // end

    void withdraw(double balance=100) {
        if (this.balance-balance >= 300){
            this.balance -= balance;
         }else{
            System.out.println("Minimum balance ought to be more than 300 ");

        }
    }

    void deposit(double balance) {
        this.balance += balance;
    }

}

/**
 * mprac13
 */
public class mprac13 {

    // returns account number by parsing string
    static int returnNum(String tempStr) {

        return Integer.parseInt(Character.toString(tempStr.charAt(3))) * 10
                + Integer.parseInt(Character.toString(tempStr.charAt(4)));

    }


    // checking id if it's valid or not
    static boolean checkId(String id) {

            int tempId = returnNum(id);



        if ( tempId>=1 && tempId<=10 && (id.substring(0,3).equalsIgnoreCase("ac0")) ) {
            return true;
        } else {
            return false;
        }
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
        String tempStr = scan.next();

        if (checkId(tempStr)) {

            // just extracting accountNo
            int accountNo = returnNum(tempStr);
            System.out.println("Hello Account No. : "+accountNo);

//            'coz array index start from 0
            accountNo-=1;

            do {
                System.out.println("*******Menu*******");

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
                        System.out.println("Your new balance is : " + accountArray[accountNo].getBalance());


                        break;

                    case 3:

                        System.out.println("Enter money to Deposit : ");
                        double depositMoney = scan.nextDouble();
                        accountArray[accountNo].deposit(depositMoney);
                        System.out.println("Your new balance is : " + accountArray[accountNo].getBalance());

                        break;



                    case 4:
                        System.out.println("Enter Receiver's accountNo : ");
                        String tempAc = scan.next();

                        if (checkId(tempAc)) {
                            System.out.println("Enter Money to transfer : ");
                            double transferMoney = scan.nextDouble();
                            accountArray[returnNum(tempAc)].deposit(transferMoney);
                            accountArray[accountNo].withdraw(transferMoney);
                        }else{
                            System.out.println("Enter valid ID");
                        }

                        break;


//                    case 5:
//                        System.out.println("yet to be implemented");
//                        break;
//                    case 6:
//                        System.out.println("yet to be implemented");
//                        break;
                    case 7:
                        System.out.println("\nID:18DCS129\nNAME:MADHAV");
                        System.exit(0);
                        break;

                    default:

                }
            } while (true);
        }
        else{
            System.out.println("Invalid I.D.");
        }

    }
}
