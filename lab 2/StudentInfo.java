import java.io.*;
import java.util.Scanner;

class Student {
    String name;
    int age;
    String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nAddress: " + address;
    }
}

public class StudentInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student information from the user
        System.out.println("Enter student information:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Address: ");
        String address = scanner.nextLine();

        // Create a Student object with the entered information
        Student student = new Student(name, age, address);

        // Write student information to the file
        writeToFile(student);

        // Display student information from the file
        System.out.println("\nStudent Information from File:");
        displayFromFile();

        // Close the scanner
        scanner.close();
    }

    private static void writeToFile(Student student) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("student.txt"))) {
            writer.write(student.name + "\n");
            writer.write(student.age + "\n");
            writer.write(student.address + "\n");
            System.out.println("Student information written to student.txt successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void displayFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("student.txt"))) {
            String name = reader.readLine();
            int age = Integer.parseInt(reader.readLine());
            String address = reader.readLine();

            // Create a Student object from the read information
            Student student = new Student(name, age, address);

            // Display the student information
            System.out.println(student);
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}

