public class Lecturer extends Person {
    private String staffId;
    private String department;

    public Lecturer(String name, int age, String staffId, String department) {
        super(name, age);
        this.staffId = staffId;
        this.department = department;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void displayInfo() {
        System.out.printf("%-15s | Staff ID: %-6s | Age: %-3d | Dept: %s%n",
                getName(), staffId, getAge(), department);
    }
}