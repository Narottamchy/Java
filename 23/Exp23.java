public class Exp23 {
    public static void main(String[] args) {
        // Create and start two threads
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        thread1.start();
        thread2.start();
    }
}

class MyThread extends Thread {
    private String threadName;

    public MyThread(String name) {
        threadName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
