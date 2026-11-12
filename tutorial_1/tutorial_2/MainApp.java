import java.util.Scanner;

public class MainApp {
    private static Scanner scanner = new Scanner(System.in);
    private static Course course = new Course("BIT1123", "Object Oriented Programming");

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("      STUDENT MANAGEMENT SYSTEM");
        System.out.println("========================================");

        while (true) {
            displayMenu();
            System.out.print("\nEnter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("⚠  Please enter a valid number.");
                scanner.next(); // clear invalid input
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addNewStudent();
                    break;
                case 2:
                    course.displayAllStudents();
                    break;
                case 3:
                    removeStudentMenu();
                    break;
                case 4:
                    System.out.println("\n========================================");
                    System.out.println("   Thank you for using the System!");
                    System.out.println("========================================");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("⚠  Invalid choice! Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n========== MENU ==========");
        System.out.println("1. Add New Student");
        System.out.println("2. Display All Students");
        System.out.println("3. Remove Student");
        System.out.println("4. Exit");
        System.out.println("==========================");
    }

    private static void addNewStudent() {
        System.out.println("\n--- Add New Student ---");

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();

        Student newStudent = new Student(name, age, studentId, courseName);
        course.addStudent(newStudent);
    }

    private static void removeStudentMenu() {
        System.out.println("\n--- Remove Student ---");
        System.out.print("Enter student ID to remove: ");
        String idToRemove = scanner.nextLine();
        course.removeStudent(idToRemove);
    }
}