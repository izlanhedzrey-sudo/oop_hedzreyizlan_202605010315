public abstract class Person {
    // Private fields — Encapsulation
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        setAge(age); // Use setter for validation
    }

    // Getters and Setters — Controlled access
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("⚠ Age must be greater than 0.");
        }
    }

    // Abstract method — must be implemented by subclasses
    public abstract void displayInfo();
}