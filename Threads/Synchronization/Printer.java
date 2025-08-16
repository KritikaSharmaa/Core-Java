package Core_Java.Threads.Synchronization;

public class Printer {
    public void printMessage(String msg) {
        synchronized (this) {
            for (int i = 1; i <= 3; i++) {
                System.out.println(msg + " - " + i);
                try {
                    Thread.sleep(500); // Simulate some delay
                } catch (InterruptedException e) {
                }
            }
        }
        for (int k = 1; k < 3; k++)
            System.out.println("Hi from printMessage" + k);
    }
}
