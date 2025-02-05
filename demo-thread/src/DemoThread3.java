public class DemoThread3 {

    private String x = "";

    public String getX(){
        return this.x;
    }
    // public void addA(){
    //     this.x += 'A';
    // }

    // solution for string (synchronized)
    // lock the door for method addA()
    public synchronized  void addA(){
        this.x += 'A'; // immutable
    }

    public static void main(String[] args) {
        DemoThread3 central = new DemoThread3();
        Runnable concatATask = () -> {
            for (int i = 0; i < 100_000; i ++) {
                central.addA();
            }
        };
        Thread workerB = new Thread(concatATask);
        workerB.start();

        Thread workerC = new Thread(concatATask);
        workerC.start();

        try {
            workerB.join(); // main thread wait until workerC complete the task 
            workerC.join(); // main thread wait until workerC complete the task 
        } catch (InterruptedException e) {

        }
        System.out.pritln(central.getX().)

    }
}
