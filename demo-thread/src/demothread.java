public class demothread {
    public static void main(String[] args) {
        
        // main thread(Worker A)
        // Anthoer thread (Worker B)
        int x = 3;
        x++;
        ++x;
        x +=1;
        System.out.println(x);

        // Create another thread.
        // 1. Task 2. Thread
        Runnable sayHelloTask = () -> System.out.println("hello!!!");
        StringBuilder sb = new StringBuilder("");
        Runnable concatStringMillionTimes = () -> {
            for (int i = 0; i < 1_000_000; i++){
        sb.append("!");
            }
            // System.out.println(sb.length()); // 1, executed by WorkerB
        };
        // sayHelloTask.run();
        Thread workerB = new Thread(sayHelloTask);
        workerB.start(); // main thread (workerA) executes a new thread(Worker B)
        // main thread proceed its own task
        System.out.println(sb.length()); // 0 , executed by WorkerA (main thread)
        System.out.println("Program end.");
    }
}
