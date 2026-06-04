package Exercise41;

import java.util.concurrent.*;

public class ExecutorServiceDemo {

    public static void main(String[] args)
            throws Exception {

        ExecutorService executor =
                Executors.newFixedThreadPool(3);

        Callable<Integer> task1 =
                () -> 100;

        Callable<Integer> task2 =
                () -> 200;

        Future<Integer> future1 =
                executor.submit(task1);

        Future<Integer> future2 =
                executor.submit(task2);

        System.out.println(
                "Result 1: " + future1.get());

        System.out.println(
                "Result 2: " + future2.get());

        executor.shutdown();
    }
}
