public class Exp25 {
    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddNumberRunnable());
        Thread evenThread = new Thread(new EvenNumberRunnable());

        oddThread.start();
        evenThread.start();
    }
}

class OddNumberRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd Number: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenNumberRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even Number: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
