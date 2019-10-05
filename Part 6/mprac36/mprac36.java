import java.util.Random;

class Mythread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " is running");
    }

    int square(int d) {
        return d * d;
    }

    int cube(int d) {
        return d * d * d;
    }

    int generateRandomNumber() {
        Random r = new Random();
        return r.nextInt(100);
    }
}

class mprac36 {
    public static void main(String[] args) {
        int randomNumber;

        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();
        Mythread t3 = new Mythread();

        t1.start();
        t2.start();
        t3.start();

        for (int i = 0; i < 5; i++) {

            randomNumber = t1.generateRandomNumber();
            System.out.println("\nThe random number generated is : " + randomNumber);

            if (randomNumber % 2 == 0) {
                System.out.println("The random number is even");
                System.out.println("The sqaure of the random number is : " + t2.square(randomNumber));
            } else {
                System.out.println("The random number is odd");
                System.out.println("The cube of the random number is : " + t3.cube(randomNumber));
            }
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
    }
}
