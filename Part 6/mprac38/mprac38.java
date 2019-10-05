class Mythread extends Thread {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running");
    }
}

public class mprac38 {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();
        Mythread t3 = new Mythread();

        t1.setName("First");
        t2.setName("Second");
        t3.setName("Third");
        t1.setPriority(3);
        t2.setPriority(5);
        t3.setPriority(7);
        t1.start();
        t2.start();
        t3.start();

        System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
    }
}
