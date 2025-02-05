
import java.util.ArrayList;
import java.util.List;

public class DemoThread4 {
    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
    DemoThread4 central = new DemoThread4();
    Runnable concatATask = () -> {
        for(int i = 0; i < 1_000; i++){
            central.addA();
        }
    };

    Thread workerB = new Thread(concatATask);
    workerB.start();

    Thread workerC = new Thread(concatATask);
    
    try {
        workerB.join();
        workerC.join();
    } catch (InterruptedException e) {

    }
    System.out.println(concatATask.getA());
}
    
}
