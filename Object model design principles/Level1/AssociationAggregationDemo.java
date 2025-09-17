import java.util.ArrayList;

class Course {
    private String courseName;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.addCourse(this);
        }
    }

    public void showEnrolledStudents() {
        System.out.println("\nCourse: " + courseName);
        for (Student s : students) {
            System.out.println("Student: " + s.getName());
        }
    }
}

class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void viewCourses() {
        System.out.println("\nStudent: " + name);
        for (Course c : courses) {
            System.out.println("Course: " + c.getCourseName());
        }
    }
}

class School {
    private String schoolName;
    private ArrayList<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("\nSchool: " + schoolName);
        for (Student s : students) {
            System.out.println("Student: " + s.getName());
        }
    }
}

public class AssociationAggregationDemo {
    public static void main(String[] args) {
        School school = new School("GLA University");

        Student s1 = new Student("Akshay");
        Student s2 = new Student("Rahul");
        Student s3 = new Student("Priya");

        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Computer Science");
        Course c3 = new Course("Physics");

        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);

        c1.enrollStudent(s1);
        c2.enrollStudent(s1);
        c3.enrollStudent(s2);
        c2.enrollStudent(s3);

        school.showStudents();

        s1.viewCourses();
        s2.viewCourses();
        s3.viewCourses();

        c1.showEnrolledStudents();
        c2.showEnrolledStudents();
        c3.showEnrolledStudents();
    }
}
