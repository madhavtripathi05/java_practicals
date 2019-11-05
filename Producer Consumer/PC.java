class Q {
    int n;
    String fruit;
    boolean setValue = false;

    synchronized String get() {
        while (!setValue) {
            try {
                wait();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumer consumed : " + fruit);
        setValue = false;

        notify();
        return fruit;

    }

    synchronized void put(String fruit) {
        while (setValue) {
            try {
                wait();
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Inturrupted Exception caught");
            }
        }
        this.fruit = fruit;
        setValue = true;
        System.out.println("Producer produced : " + fruit);
        notify();

    }

}

class Producer implements Runnable {
    Q q;

    String fruitArray[] = { "Apple", "Orange", "Papaya", "Watermelon" };

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(fruitArray[(i++) % 4]);
        }
    }
}

class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {

        while (true) {
            q.get();
        }
    }
}

public class PC {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

    }
}