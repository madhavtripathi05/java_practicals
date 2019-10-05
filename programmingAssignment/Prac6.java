//to be fixed, not working at all

import java.util.concurrent.TimeUnit;
import java.util.concurrent.*;
import java.time.Instant;
import java.text.ParseException;

class FibonacciProblem {

    public int n;

    public FibonacciProblem(int n) {
        this.n = n;
    }

    public long solve() {
        return fibonacci(n);
    }

    static long res = 0;
    static int i = 0;

    synchronized private long fibonacci(int n) {
        System.out.println("Thread: " + Thread.currentThread().getName() + " calculates " + n + " res: " + res);
        // if (n <= 1) {
        // res += n;
        // return n;

        // } else {
        // res += n;
        // return fibonacci(n - 1) + fibonacci(n - 2);
        // }

        int f[] = new int[n + 2]; // 1 extra to handle case, n = 0
        int i;

        /* 0th and 1st number of the series are 0 and 1 */
        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++) {
            /*
             * Add the previous 2 numbers in the series and store it
             */
            f[i] = f[i - 1] + f[i - 2];
            res += f[i];
        }

        return f[n];
    }

}

class FibonacciTask extends RecursiveAction {

    private static final long serialVersionUID = 1234567890L;

    private static final int THRESHOLD = 5;

    private FibonacciProblem problem;
    public long result;

    public FibonacciTask(FibonacciProblem problem) {
        this.problem = problem;
    }

    // @Override
    protected void compute() {
        if (problem.n < THRESHOLD) { // easy problem, don't bother with parallelism
            result = problem.solve();
        } else {
            FibonacciTask worker1 = new FibonacciTask(new FibonacciProblem(problem.n - 1));
            FibonacciTask worker2 = new FibonacciTask(new FibonacciProblem(problem.n - 2));
            invokeAll(worker1, worker2);
        }
    }

}

public class Prac6 {

    public static void main(String[] args) {

        // Check the number of available processors
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println("No of processors: " + processors);

        int n = 10;

        Long start = System.nanoTime();
        FibonacciProblem bigProblem = new FibonacciProblem(n);

        FibonacciTask task = new FibonacciTask(bigProblem);
        ForkJoinPool pool = new ForkJoinPool(processors);
        pool.invoke(task);

        // Long result = bigProblem.res;
        System.out.println("Computed Result: " + bigProblem.solve());

        Long stop = System.nanoTime();

        Double timeElapsed = (stop.doubleValue() - start.doubleValue()) / 1000000;
        System.out.println("Elapsed Time: " + timeElapsed + " ms");

    }
}