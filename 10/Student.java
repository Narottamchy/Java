public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Instantiating objects in all possible ways
    public static void main(String[] args) {
        Student student1 = new Student("Sameoul", 21);
        Student student2 = new Student("Racheal", 22);
        Student student3 = new Student("Berlin", 23);
        Student student4 = new Student("Tokyo", 24);

        System.out.println(student1.name + " " + student1.age);
        System.out.println(student2.name + " " + student2.age);
        System.out.println(student3.name + " " + student3.age);
        System.out.println(student4.name + " " + student4.age);
    }
}