public class Exp22 {
    public static void main(String[] args) {
        Thread nameThread = new Thread(new NameRunnable("Your name"));
        Thread enrolmentThread = new Thread(new EnrolmentNumberRunnable("Your enrolment number"));
        Thread subjectThread = new Thread(new FavouriteSubjectRunnable("Your favourite subject"));

        nameThread.start();
        enrolmentThread.start();
        subjectThread.start();
    }
}

class NameRunnable implements Runnable {
    private String name;

    public NameRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(name);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EnrolmentNumberRunnable implements Runnable {
    private String enrolmentNumber;

    public EnrolmentNumberRunnable(String enrolmentNumber) {
        this.enrolmentNumber = enrolmentNumber;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(enrolmentNumber);
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class FavouriteSubjectRunnable implements Runnable {
    private String favouriteSubject;

    public FavouriteSubjectRunnable(String favouriteSubject) {
        this.favouriteSubject = favouriteSubject;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(favouriteSubject);
            try {
                Thread.sleep(3000); // Sleep for 3 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
