package Core_Java.Threads.Synchronization;

public class MyThread extends Thread { // Custom Thread
    Printer printer;
    String thread_name;

    MyThread(Printer printer, String thread_name) {
        this.printer = printer;
        this.thread_name = thread_name;
    }

    public void run() {
        printer.printMessage(thread_name);
    }
}
