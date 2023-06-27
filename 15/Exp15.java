class Employee {
    private String name;
    private int age;
    private String department;

    public Employee() {
        this.name = "";
        this.age = 0;
        this.department = "";
    }

    public Employee(String name) {
        this.name = name;
        this.age = 0;
        this.department = "";
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "";
    }

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
}

public class Exp15 {
        public static void main(String[] args) {

            Employee emp1 = new Employee();
Employee emp2 = new Employee("John");
Employee emp3 = new Employee("Jane", 25);
Employee emp4 = new Employee("Bob", 30, "IT");

emp1.display();
emp2.display();
emp3.display();
emp4.display();
        }
}
