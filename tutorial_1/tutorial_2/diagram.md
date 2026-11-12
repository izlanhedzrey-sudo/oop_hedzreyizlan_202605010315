classDiagram
    class Person {
        <<abstract>>
        -String name
        -int age
        +Person(name: String, age: int)
        +getName() String
        +setName(name: String) void
        +getAge() int
        +setAge(age: int) void
        +displayInfo()* void
    }
    
    class Student {
        -String studentId
        -String course
        +Student(name: String, age: int, studentId: String, course: String)
        +getStudentId() String
        +getCourse() String
        +displayInfo() void
    }
    
    class Lecturer {
        -String staffId
        -String department
        +Lecturer(name: String, age: int, staffId: String, department: String)
        +getStaffId() String
        +getDepartment() String
        +displayInfo() void
    }
    
    class Course {
        -String courseCode
        -String courseName
        -ArrayList~Student~ enrolledStudents
        +Course(courseCode: String, courseName: String)
        +getCourseCode() String
        +getCourseName() String
        +addStudent(student: Student) void
        +removeStudent(studentId: String) boolean
        +displayAllStudents() void
    }
    
    Person <|-- Student
    Person <|-- Lecturer
    Course --> Student : contains >