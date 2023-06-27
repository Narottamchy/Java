public class Exp17 {
    private static String staticVariable = "Hello, I am a static variable.";
    
    static {
        System.out.println("Inside the static block.");
        System.out.println(staticVariable);
        System.out.println("Static block executed.");
    }
    
    public static void staticMethod() {
        System.out.println("Inside the static method.");
        System.out.println(staticVariable);
    }
    
    public static class StaticNestedClass {
        public void displayMessage() {
            System.out.println("Inside the static nested class.");
            System.out.println(staticVariable);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Main method.");
        staticMethod();
        
        StaticNestedClass nestedObj = new StaticNestedClass();
        nestedObj.displayMessage();
    }
}
