public class Student extends Person {
    private String studentId;
    private String course;

    public Student(String name, int age, String studentId, String course) {
        super(name, age); // Call parent constructor
        this.studentId = studentId;
        this.course = course;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCourse() {
        return course;
    }

    // Override abstract method — Polymorphism
    @Override
    public void displayInfo() {
        System.out.printf("%-15s | ID: %-6s | Age: %-3d | Course: %s%n",
                getName(), studentId, getAge(), course);
    }
}