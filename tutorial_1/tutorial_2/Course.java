import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String courseName;
    private ArrayList<Student> enrolledStudents;

    // Constructor
    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Getters
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    // Add student to the course
    public void addStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println("✅ Successfully enrolled: " + student.getName());
    }

    // Remove student by ID
    public boolean removeStudent(String studentId) {
        for (int i = 0; i < enrolledStudents.size(); i++) {
            if (enrolledStudents.get(i).getStudentId().equals(studentId)) {
                System.out.println("❌ Removed: " + enrolledStudents.get(i).getName());
                enrolledStudents.remove(i);
                return true;
            }
        }
        System.out.println("⚠  Student ID " + studentId + " not found.");
        return false;
    }

    // Display all enrolled students
    public void displayAllStudents() {
        System.out.println("\n═══════════════════════════════════════════════════════");
        System.out.println("   Course: " + courseName + " (" + courseCode + ")");
        System.out.println("═══════════════════════════════════════════════════════");
        
        if (enrolledStudents.isEmpty()) {
            System.out.println("   No students enrolled in this course yet.");
            return;
        }

        for (Student s : enrolledStudents) {
            s.displayInfo();
        }
        System.out.println("═══════════════════════════════════════════════════════");
        System.out.printf("   Total Students: %d%n", enrolledStudents.size());
    }
}
