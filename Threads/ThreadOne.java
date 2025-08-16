package Core_Java.Threads;

public class ThreadOne extends Thread {
    private String thread_name;

    ThreadOne(String thread_name) {
        this.thread_name = thread_name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(this.thread_name +"- count: "+ i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted Execution..");
            }
        }
    }
}
