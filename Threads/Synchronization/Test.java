package Core_Java.Threads.Synchronization;

public class Test {
    public static void main(String[] args) {
        Printer p = new Printer();
        MyThread t1 = new MyThread(p, "Thread-T1");
        MyThread t2 = new MyThread(p, "Thread-T2");

        t1.start();
        t2.start();
    }
}
