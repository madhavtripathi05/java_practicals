import java.time.Instant;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Prac7 {
    public static void main(String[] args) {
        ForkJoinPool fjp = new ForkJoinPool();
        Long start = System.nanoTime();
        double[] nums = new double[150_000_000];//150M
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) (((i % 2) == 0) ? i * 2 : i / 10);
        }
        Sum task = new Sum(nums, 0, nums.length);
        double summation = fjp.invoke(task);
        Long stop = System.nanoTime();
        Double timeElapsed = (stop.doubleValue() - start.doubleValue()) / 1000_000;
        System.out.println("Summation " + summation);
        System.out.println("Time elapsed: " + timeElapsed + " ms");
    }
}

class Sum extends RecursiveTask<Double> {
    static final long serialVersionUID = 1234567890;
    final int seqThreshold = 500;
    double[] data;
    int start, end;

    Sum(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Double compute() {
        double sum = 0;
        if ((end - start) < seqThreshold) {
            for (int i = start; i < end; i++)
                sum += data[i];
        } else {
            int middle = (start + end) / 2;

            Sum subtaskA = new Sum(data, start, middle);
            Sum subtaskB = new Sum(data, middle, end);

            subtaskA.fork();
            subtaskB.fork();

            sum += subtaskA.join() + subtaskB.join();
        }
        return sum;
    }
}