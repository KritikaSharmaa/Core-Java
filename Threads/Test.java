package Core_Java.Threads;

public class Test {
    public static void main(String[] args) {
        ThreadInterface t1 = new ThreadInterface("Thread-1 !");
        ThreadInterface t2 = new ThreadInterface("Thread-2 !");
        ThreadInterface t3 = new ThreadInterface("Thread-3 !");
        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
       
    }
}
