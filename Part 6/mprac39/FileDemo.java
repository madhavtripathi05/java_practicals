/**
 * FileDemo
 */
class ThreadDemo extends Thread {


    static int cnt = 
    static boolean isEven(int num) {
        return (num % 2 == 0);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            if (isEven(i)) {
                System.out.println("Even" + i);
            } else if (!isEven(i)) {
                System.out.println("Odd" + i);
            }
        }

    }
}

public class FileDemo {

    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        td.start();
    }
}