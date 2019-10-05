import java.util.*;

class Item {
	private int content;
	private boolean available = false;

	public synchronized int get() {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		available = false;
		notifyAll();
		return content;
	}

	public synchronized void put(int value) {
		while (available == true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		content = value;
		available = true;
		notifyAll();
	}
}

class Producer extends Thread {
	private Item obj;
	private int number;

	public Producer(Item i1, int n) {
		obj = i1;
		number = n;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			obj.put(i);
			System.out.println("Producer " + number + ":" + i);
			try {
				sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}
	}
}

class Consumer extends Thread {
	private Item obj;
	private int number;

	public Consumer(Item i1, int n) {
		obj = i1;
		number = n;
	}

	public void run() {
		int value = 0;
		for (int i = 0; i < 5; i++) {
			value = obj.get();
			System.out.println("Consumer " + number + ":" + value);
		}
	}
}

public class mprac39 {
	public static void main(String[] args) {
		Item i = new Item();
		Producer p = new Producer(i, 1);
		Consumer c = new Consumer(i, 1);

		p.start();
		c.start();

		System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
	}
}
