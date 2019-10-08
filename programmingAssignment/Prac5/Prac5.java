import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ForkJoinPool;

public class Prac5 {
    public static void main(String[] args) {
        ForkJoinFibonacci task = new ForkJoinFibonacci(12);// enter no. here
        new ForkJoinPool().invoke(task);
        System.out.println(task.getNumber());
        System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
    }
}

class ForkJoinFibonacci extends RecursiveAction {
    private static final long threshold = 10;
    private volatile long number;

    ForkJoinFibonacci(long number) {
        this.number = number;
    }

    public long getNumber() {
        return number;
    }

    protected void compute() {
        long n = number;
        if (n <= threshold) {
            number = fib(n);
        } else {
            ForkJoinFibonacci f1 = new ForkJoinFibonacci(n - 1);
            ForkJoinFibonacci f2 = new ForkJoinFibonacci(n - 2);
            ForkJoinTask.invokeAll(f1, f2);
            number = f1.number + f2.number;
        }
    }

    private static long fib(long n) {
        if (n <= 1)
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }
}
