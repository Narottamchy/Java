public class Exp24 {
    public static void main(String[] args) {
        DataHolder dataHolder = new DataHolder();

        // Create producer and consumer threads
        Thread producerThread = new Thread(new Producer(dataHolder));
        Thread consumerThread = new Thread(new Consumer(dataHolder));

        producerThread.start();
        consumerThread.start();
    }
}

class DataHolder {
    private int data;
    private boolean produced;

    public synchronized void produce(int newData) {
        // Wait until data is consumed by the consumer
        while (produced) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        data = newData;
        System.out.println("Produced: " + data);

        // Notify the consumer that new data is available
        produced = true;
        notifyAll();
    }

    public synchronized void consume() {
        // Wait until new data is produced by the producer
        while (!produced) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consumed: " + data);

        // Notify the producer that data has been consumed
        produced = false;
        notifyAll();
    }
}

class Producer implements Runnable {
    private DataHolder dataHolder;

    public Producer(DataHolder dataHolder) {
        this.dataHolder = dataHolder;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            dataHolder.produce(i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private DataHolder dataHolder;

    public Consumer(DataHolder dataHolder) {
        this.dataHolder = dataHolder;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            dataHolder.consume();
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
