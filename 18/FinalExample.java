public class FinalExample {
    private final int finalDataMember = 10;

    public final void finalFunction() {
        System.out.println("Inside the final function");
    }

    public static final class FinalClass {
        public void displayMessage() {
            System.out.println("Inside the final class");
        }
    }

    public static void main(String[] args) {
        FinalExample finalObj = new FinalExample();
        System.out.println("Final data member: " + finalObj.finalDataMember);
        finalObj.finalFunction();

        FinalClass finalClassObj = new FinalClass();
        finalClassObj.displayMessage();
    }
}
