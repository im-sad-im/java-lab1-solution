class Student {
    String name;
    int age;

    // default constructor
    public Student() {
        name = "Ram";
        age = 18;
    }

    // Parameterized constructor
    public Student(String n, int a) {
        name = n;
        age = a;
    }

    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Default constructor");
        student1.displayInfo();
        
        System.out.println("Parameterized constructor");
        Student student2 = new Student("Sadim", 20);
        student2.displayInfo();
    }
}